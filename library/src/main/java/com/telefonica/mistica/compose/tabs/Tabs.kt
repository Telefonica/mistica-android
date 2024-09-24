package com.telefonica.mistica.compose.tabs

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.UiComposable
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
@UiComposable
@Suppress("LongMethod", "CyclomaticComplexMethod")
fun Tabs(
    modifier: Modifier = Modifier,
    selectedIndex: Int,
    tabs: List<Tab>,
    onSelectedTabChanged: (index: Int) -> Unit,
) {
    val isTablet = LocalConfiguration.current.screenWidthDp > 768
    val maxTabWidth = 280.dp

    val composableTabs: @Composable @UiComposable (setTestTag: Boolean) -> Unit = @Composable { setTestTag ->
        tabs.forEachIndexed { index, tab ->

            val boxModifier = if (setTestTag && tab.tabId != null) {
                Modifier
                    .testTag(tab.tabId)
            } else {
                Modifier
            }

            Box(
                modifier = boxModifier
                    .height(56.dp)
                    .widthIn(
                        min = if (isTablet) 208.dp else Dp.Unspecified,
                        max = maxTabWidth
                    )
                    .clickable {
                        onSelectedTabChanged(index)
                    },
                contentAlignment = Alignment.Center
            ) {
                Row(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(
                            horizontal = if (isTablet) 32.dp else 16.dp,
                            vertical = 16.dp,
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val isSelected = index == selectedIndex
                    if (tab.iconResource != null) {
                        Icon(
                            modifier = Modifier
                                .size(24.dp)
                                .padding(end = 8.dp),
                            painter = painterResource(tab.iconResource),
                            contentDescription = tab.iconContentDescription,
                            tint = if (isSelected) {
                                MisticaTheme.colors.neutralHigh
                            } else {
                                MisticaTheme.colors.neutralMedium
                            },
                        )
                    }
                    Text(
                        modifier = Modifier
                            .wrapContentSize(),
                        text = tab.text,
                        style = MisticaTheme.typography.presetTabsLabel,
                        color = if (isSelected) {
                            MisticaTheme.colors.textPrimary
                        } else {
                            MisticaTheme.colors.textSecondary
                        },
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
    }

    val composableTabsForMeasuring: @Composable @UiComposable () -> Unit = @Composable {
        composableTabs(false)
    }

    val composableTabsForPlacing: @Composable @UiComposable () -> Unit = @Composable {
        composableTabs(true)
    }

    val indicator: @Composable @UiComposable (tabPositions: List<TabPosition>) -> Unit =
        @Composable { tabPositions ->
            Box(
                Modifier
                    .misticaTabIndicatorOffset(tabPositions[selectedIndex])
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(color = MisticaTheme.colors.controlActivated)
            )
        }

    val divider: @Composable @UiComposable () -> Unit =
        @Composable {
            Divider(
                modifier = Modifier,
                thickness = 1.dp,
                color = MisticaTheme.colors.divider
            )
        }

    val layout: @Composable @UiComposable (maxWidth: Int) -> Unit = @Composable { maxWidth ->
        val scrollState = rememberScrollState()
        val coroutineScope = rememberCoroutineScope()
        val scrollableTabData = remember(scrollState, coroutineScope) {
            ScrollableTabData(
                scrollState = scrollState,
                coroutineScope = coroutineScope
            )
        }
        SubcomposeLayout(
            Modifier
                .fillMaxWidth()
                .wrapContentSize(align = Alignment.CenterStart)
                .horizontalScroll(scrollState)
                .selectableGroup()
                .clipToBounds()
        ) { constraints ->
            var tabMeasurables = subcompose(Slots.TabsMeasurable, composableTabsForMeasuring)
            var tabPlaceables = tabMeasurables.map {
                it.measure(constraints)
            }

            val tabsTotalWidth = tabPlaceables.fold(0) { sum, element ->
                sum + element.width
            }

            tabMeasurables = subcompose(Slots.Tabs, composableTabsForPlacing)

            if (tabsTotalWidth < maxWidth) {
                val tabCount = tabMeasurables.size
                val proportionalSizeTabWidth = (maxWidth / tabCount)

                val anyTabLongerThanProportionalSizeTabWidth = tabPlaceables.any {
                    it.width > proportionalSizeTabWidth
                }
                tabPlaceables = if (anyTabLongerThanProportionalSizeTabWidth) {
                    val resizableTabsCount = tabPlaceables.count { element ->
                        element.width < maxTabWidth.toPx()
                    }
                    val availableWidth = maxWidth - tabsTotalWidth
                    val extraWidthForEach = availableWidth / resizableTabsCount
                    tabMeasurables.mapIndexed { index, measurable ->
                        var placeableWidth = tabPlaceables[index].width
                        if (placeableWidth < maxTabWidth.toPx()) {
                            placeableWidth += extraWidthForEach
                        }
                        measurable.measure(
                            constraints.copy(
                                minWidth = placeableWidth,
                                maxWidth = placeableWidth,
                            )
                        )
                    }
                } else {
                    tabMeasurables.map {
                        it.measure(
                            constraints.copy(
                                minWidth = proportionalSizeTabWidth,
                                maxWidth = proportionalSizeTabWidth,
                            )
                        )
                    }
                }
            } else {
                tabPlaceables = tabMeasurables.map {
                    it.measure(constraints)
                }
            }

            var layoutWidth = 0
            var layoutHeight = 0
            tabPlaceables.forEach {
                layoutWidth += it.width
                layoutHeight = maxOf(layoutHeight, it.height)
            }

            layout(layoutWidth, layoutHeight) {
                val tabPositions = mutableListOf<TabPosition>()
                var left = 0

                tabPlaceables.forEach {
                    it.placeRelative(left, 0)
                    tabPositions.add(TabPosition(left = left.toDp(), width = it.width.toDp()))
                    left += it.width
                }

                subcompose(Slots.Divider, divider).forEach {
                    val placeable = it.measure(
                        constraints.copy(
                            minHeight = 0,
                            minWidth = layoutWidth,
                            maxWidth = layoutWidth
                        )
                    )
                    placeable.placeRelative(0, layoutHeight - placeable.height)
                }

                subcompose(Slots.Indicator) {
                    indicator(tabPositions)
                }.forEach {
                    it.measure(Constraints.fixed(layoutWidth, layoutHeight)).placeRelative(0, 0)
                }

                scrollableTabData.onLaidOut(
                    density = this@SubcomposeLayout,
                    edgeOffset = 0,
                    tabPositions = tabPositions,
                    selectedTab = selectedIndex
                )
            }
        }
    }

    SubcomposeLayout(
        modifier
            .height(56.dp)
            .fillMaxWidth()
            .background(color = Color.Transparent)
    ) { constraints ->
        layout(constraints.maxWidth, constraints.maxHeight) {
            subcompose(Slots.Root) { layout(constraints.maxWidth) }.forEach {
                val placeable = it.measure(constraints)
                placeable.placeRelative(0, 0)
            }
        }
    }
}

data class Tab(
    val text: String,
    val tabId: String? = null,
    @DrawableRes val iconResource: Int? = null,
    val iconContentDescription: String? = null,
)

@Immutable
private class TabPosition constructor(val left: Dp, val width: Dp) {
    val right: Dp get() = left + width

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TabPosition) return false

        if (left != other.left) return false
        if (width != other.width) return false

        return true
    }

    override fun hashCode(): Int {
        var result = left.hashCode()
        result = 31 * result + width.hashCode()
        return result
    }

    override fun toString(): String {
        return "TabPosition(left=$left, right=$right, width=$width)"
    }
}

private fun Modifier.misticaTabIndicatorOffset(
    currentTabPosition: TabPosition,
): Modifier = composed(
    inspectorInfo = debugInspectorInfo {
        name = "tabIndicatorOffset"
        value = currentTabPosition
    }
) {
    val currentTabWidth by animateDpAsState(
        targetValue = currentTabPosition.width,
        animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)
    )
    val indicatorOffset by animateDpAsState(
        targetValue = currentTabPosition.left,
        animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)
    )
    fillMaxWidth()
        .wrapContentSize(Alignment.BottomStart)
        .offset(x = indicatorOffset)
        .width(currentTabWidth)
}

private enum class Slots {
    Root,
    TabsMeasurable,
    Tabs,
    Divider,
    Indicator
}

private class ScrollableTabData(
    private val scrollState: ScrollState,
    private val coroutineScope: CoroutineScope,
) {
    private var selectedTab: Int? = null

    fun onLaidOut(
        density: Density,
        edgeOffset: Int,
        tabPositions: List<TabPosition>,
        selectedTab: Int,
    ) {
        if (this.selectedTab != selectedTab) {
            this.selectedTab = selectedTab
            tabPositions.getOrNull(selectedTab)?.let {
                val calculatedOffset = it.calculateTabOffset(density, edgeOffset, tabPositions)
                if (scrollState.value != calculatedOffset) {
                    coroutineScope.launch {
                        scrollState.animateScrollTo(
                            calculatedOffset,
                            animationSpec = tween(
                                durationMillis = 300,
                                easing = FastOutSlowInEasing
                            )
                        )
                    }
                }
            }
        }
    }

    private fun TabPosition.calculateTabOffset(
        density: Density,
        edgeOffset: Int,
        tabPositions: List<TabPosition>,
    ): Int = with(density) {
        val totalTabRowWidth = tabPositions.last().right.roundToPx() + edgeOffset
        val visibleWidth = totalTabRowWidth - scrollState.maxValue
        val tabOffset = left.roundToPx()
        val scrollerCenter = visibleWidth / 2
        val tabWidth = width.roundToPx()
        val centeredTabOffset = tabOffset - (scrollerCenter - tabWidth / 2)
        val availableSpace = (totalTabRowWidth - visibleWidth).coerceAtLeast(0)
        return centeredTabOffset.coerceIn(0, availableSpace)
    }
}

@Preview
@Composable
fun TabsPreview() {
    MisticaTheme(brand = MovistarBrand) {
        Surface(
            modifier = Modifier
                .background(color = MisticaTheme.colors.backgroundContainer)
        ) {
            Tabs(
                selectedIndex = 0,
                tabs = listOf(
                    Tab("Tab1"),
                    Tab("Tab2"),
                    Tab("Tab3"),
                ),
                onSelectedTabChanged = { }
            )
        }
    }
}
