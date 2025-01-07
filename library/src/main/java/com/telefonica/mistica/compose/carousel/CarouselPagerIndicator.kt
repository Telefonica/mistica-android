package com.telefonica.mistica.compose.carousel

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator.MAX_WINDOW_SIZE
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator.indicatorSelectedHeight
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator.indicatorSelectedWidth
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator.indicatorShape
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator.indicatorUnselectedHeight
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator.indicatorUnselectedSmallHeight
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator.indicatorUnselectedSmallWidth
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator.indicatorUnselectedVerySmallHeight
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator.indicatorUnselectedVerySmallWidth
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator.indicatorUnselectedWidth
import com.telefonica.mistica.compose.carousel.CarouselPagerIndicator.spacing
import com.telefonica.mistica.compose.carousel.IndicatorType.INVISIBLE
import com.telefonica.mistica.compose.carousel.IndicatorType.SELECTED
import com.telefonica.mistica.compose.carousel.IndicatorType.UNSELECTED
import com.telefonica.mistica.compose.carousel.IndicatorType.UNSELECTED_SMALL
import com.telefonica.mistica.compose.carousel.IndicatorType.UNSELECTED_VERY_SMALL
import com.telefonica.mistica.compose.carousel.MovementDirection.DECREASE
import com.telefonica.mistica.compose.carousel.MovementDirection.INCREASE
import com.telefonica.mistica.compose.carousel.MovementDirection.NO_MOVEMENT
import com.telefonica.mistica.compose.theme.MisticaTheme

@SuppressLint("MutableCollectionMutableState")
@Composable
fun CarouselPagerIndicator(
    modifier: Modifier = Modifier,
    carouselState: CarouselState,
    pagerCount: Int,
    debug: Boolean = false,
) {

    fun log(message: String) {
        if (debug) {
            Log.d("carousel", message)
        }
    }

    val activeColor: Color = MisticaTheme.colors.controlActivated
    val inactiveColor: Color = MisticaTheme.colors.control

    log("starting with - ${carouselState.currentPage}")

    val visibleWindowState by remember {
        mutableStateOf(
            VisibleWindowState(
                window = 0 to pagerCount.coerceAtMost(MAX_WINDOW_SIZE) - 1,
                currentSelected = 0,
            )
        )
    }
    val items by remember {
        mutableStateOf(mutableListOf<Item>().apply {
            for (i in 0 until pagerCount) {
                add(Item(INVISIBLE))
            }
        })
    }
    var currentlySelected by remember { mutableIntStateOf(0) }
    var shouldAnimate by remember { mutableStateOf(true) }

    val indicatorUnselectedModifier = remember {
        Modifier
            .size(width = indicatorUnselectedWidth, height = indicatorUnselectedHeight)
            .background(color = inactiveColor, shape = indicatorShape)
    }
    val indicatorUnselectedSmallModifier = remember {
        Modifier
            .size(width = indicatorUnselectedSmallWidth, height = indicatorUnselectedSmallHeight)
            .background(color = inactiveColor, shape = indicatorShape)
    }
    val indicatorUnselectedVerySmallModifier = remember {
        Modifier
            .size(width = indicatorUnselectedVerySmallWidth, height = indicatorUnselectedVerySmallHeight)
            .background(color = inactiveColor, shape = indicatorShape)
    }
    val indicatorSelectedModifier = remember {
        Modifier
            .size(width = indicatorSelectedWidth, height = indicatorSelectedHeight)
            .background(color = inactiveColor, shape = indicatorShape)
    }
    val indicatorSelectedNotAnimatedModifier = remember {
        Modifier
            .size(width = indicatorSelectedWidth, height = indicatorSelectedHeight)
            .background(color = activeColor, shape = indicatorShape)
    }

    log("----- (before: $visibleWindowState)")

    val movementDirection: MovementDirection = calculateDirection(
        carouselState = carouselState,
        currentlySelected = currentlySelected
    )
    currentlySelected = carouselState.currentPage

    calculateWindowPosition(
        movementDirection = movementDirection,
        currentSelected = carouselState.currentPage,
        visibleWindowState = visibleWindowState,
        pagerCount = pagerCount,
        onShouldAnimateUpdate = { shouldAnimate = it },
        log = ::log
    )

    log("----- (after $visibleWindowState)")

    calculateItems(
        items,
        visibleWindowState,
        pagerCount,
        carouselState.currentPage,
        log = ::log
    )

    PagerIndicatorBox(
        items = items,
        indicatorUnselectedWidth = indicatorUnselectedWidth,
        indicatorUnselectedSmallWidth = indicatorUnselectedSmallWidth,
        indicatorUnselectedVerySmallWidth = indicatorUnselectedVerySmallWidth,
        spacing = spacing,
        modifier = modifier,
        indicatorUnselectedModifier = indicatorUnselectedModifier,
        shouldAnimate = shouldAnimate,
        indicatorSelectedModifier = indicatorSelectedModifier,
        indicatorSelectedNotAnimatedModifier = indicatorSelectedNotAnimatedModifier,
        indicatorUnselectedSmallModifier = indicatorUnselectedSmallModifier,
        indicatorUnselectedVerySmallModifier = indicatorUnselectedVerySmallModifier,
        carouselState = carouselState,
        indicatorSelectedWidth = indicatorSelectedWidth,
        indicatorSelectedHeight = indicatorSelectedHeight,
        activeColor = activeColor,
        indicatorShape = indicatorShape)
}

internal fun calculateItems(
    items: MutableList<Item>,
    visibleWindowState: VisibleWindowState,
    pagerCount: Int,
    currentSelected: Int,
    log: (String) -> Unit,
) {
    items.forEachIndexed { index, item ->
        when {
            //The bullets outside the window are invisible
            !visibleWindowState.window.isInsideTheWindow(index) -> {
                log("item-$index is outside the window")
                item.type = INVISIBLE
            }

            //The current selected
            index == visibleWindowState.currentSelected -> {
                log("item-$index is the currently selected")
                item.type = SELECTED
            }

            visibleWindowState.window.isTheAdjacentToTheLowerEdge(index) -> {
                doOnNearToLowerEdge(visibleWindowState, log, index, item)
            }

            visibleWindowState.window.isTheAdjacentToTheHigherEdge(index) -> {
                doOnNearToHigherEdge(visibleWindowState, pagerCount, log, index, item)
            }

            visibleWindowState.window.isTheLowerEdge(index) -> {
                doOnLowerEdge(visibleWindowState, index, currentSelected, log, item)
            }

            visibleWindowState.window.isTheHigherEdge(index) -> {
                doOnHigherEdge(visibleWindowState, pagerCount, index, currentSelected, log, item)
            }
            else -> {
                log("item-$index is unselected")
                item.type = UNSELECTED
            }
        }
    }
}

//The adjacent to the lower edge may be small
private fun doOnNearToLowerEdge(
    visibleWindowState: VisibleWindowState,
    log: (String) -> Unit,
    index: Int,
    item: Item,
) {
    val thereAreNoMoreItems = visibleWindowState.window.first == 0
    when {
        thereAreNoMoreItems -> {
            log("item-$index is unselected, because it's the adjacent to the edge, but there are no more items")
            item.type = UNSELECTED
        }

        else -> {
            log("item-$index is adjacent to the lower edge")
            item.type = UNSELECTED_SMALL
        }
    }
}

//The adjacent to the higher edge may be small
private fun doOnNearToHigherEdge(
    visibleWindowState: VisibleWindowState,
    pagerCount: Int,
    log: (String) -> Unit,
    index: Int,
    item: Item,
) {
    val thereAreNoMoreItems = visibleWindowState.window.second == pagerCount - 1
    when {
        thereAreNoMoreItems -> {
            log("item-$index is unselected, because it's the adjacent to the edge, but there are no more items")
            item.type = UNSELECTED
        }

        else -> {
            log("item-$index is adjacent to the higher edge")
            item.type = UNSELECTED_SMALL
        }
    }
}

//The items in the lower edge can be regular, small or very small
private fun doOnLowerEdge(
    visibleWindowState: VisibleWindowState,
    index: Int,
    currentSelected: Int,
    log: (String) -> Unit,
    item: Item,
) {
    val thereAreNoMoreItems = visibleWindowState.window.first == 0
    val isTheSelectedAdjacent = (index + 1) == currentSelected
    when {
        thereAreNoMoreItems -> {
            log("item-$index is the lower edge and there are no more items")
            item.type = UNSELECTED
        }

        isTheSelectedAdjacent -> {
            log("item-$index is the lower edge and the selected is the adjacent")
            item.type = UNSELECTED_SMALL
        }

        else -> {
            log("item-$index is the lower edge and the selected is NOT adjacent")
            item.type = UNSELECTED_VERY_SMALL
        }
    }
}

//The items in the higher edge can be regular, small or very small
private fun doOnHigherEdge(
    visibleWindowState: VisibleWindowState,
    pagerCount: Int,
    index: Int,
    currentSelected: Int,
    log: (String) -> Unit,
    item: Item,
) {
    val thereAreNoMoreItems = visibleWindowState.window.second == pagerCount - 1
    val isTheSelectedAdjacent = (index - 1) == currentSelected
    when {
        thereAreNoMoreItems -> {
            log("item-$index is the higher edge and there are no more items")
            item.type = UNSELECTED
        }

        isTheSelectedAdjacent -> {
            log("item-$index is the higher edge and the selected is the adjacent")
            item.type = UNSELECTED_SMALL
        }

        else -> {
            log("item-$index is the higher edge and the selected is NOT adjacent")
            item.type = UNSELECTED_VERY_SMALL
        }
    }
}

internal fun calculateWindowPosition(
    movementDirection: MovementDirection,
    currentSelected: Int,
    visibleWindowState: VisibleWindowState,
    pagerCount: Int,
    onShouldAnimateUpdate: (Boolean) -> Unit,
    log: (String) -> Unit,
) {
    //Check if we can move the bullet without moving to the edge
    var shouldTryToMoveTheWindow = false
    when (movementDirection) {
        DECREASE, INCREASE -> {
            val canMoveTheBullet = !visibleWindowState.window.isTheEdge(currentSelected)
            if (canMoveTheBullet) {
                log("Moving the bullet - $movementDirection")
                visibleWindowState.currentSelected = currentSelected
            }
            shouldTryToMoveTheWindow = !canMoveTheBullet
        }
        NO_MOVEMENT -> {}
    }

    //If we can't, we try to move the window
    var shouldMoveTheBulletToTheEdge = false
    if (shouldTryToMoveTheWindow) {
        when (movementDirection) {
            DECREASE -> {
                val canMoveTheWindow = visibleWindowState.window.first > 0
                if (canMoveTheWindow) {
                    log("Moving the window - $movementDirection")
                    visibleWindowState.window = visibleWindowState.window.moveDecreasing()
                    visibleWindowState.currentSelected--
                    onShouldAnimateUpdate(false)
                }
                shouldMoveTheBulletToTheEdge = !canMoveTheWindow
            }
            INCREASE -> {
                val canMoveTheWindow = visibleWindowState.window.second < pagerCount - 1
                if (canMoveTheWindow) {
                    log("Moving the window - $movementDirection")
                    visibleWindowState.window = visibleWindowState.window.moveIncreasing()
                    visibleWindowState.currentSelected++
                    onShouldAnimateUpdate(false)
                }
                shouldMoveTheBulletToTheEdge = !canMoveTheWindow
            }
            NO_MOVEMENT -> {}
        }
    }
    //If we can't we move the bullet to the edge position
    if (shouldMoveTheBulletToTheEdge) {
        log("Moving to the edge - $movementDirection")
        when (movementDirection) {
            DECREASE -> visibleWindowState.currentSelected = currentSelected
            INCREASE -> visibleWindowState.currentSelected++
            NO_MOVEMENT -> {}
        }
    }
}

private fun calculateDirection(
    carouselState: CarouselState,
    currentlySelected: Int,
): MovementDirection {
    val movementDirection: MovementDirection = when {
        carouselState.currentPage > currentlySelected -> INCREASE
        carouselState.currentPage < currentlySelected -> DECREASE
        else -> NO_MOVEMENT //They're the same
    }
    return movementDirection
}

@Composable
@Suppress("CyclomaticComplexMethod")
private fun PagerIndicatorBox(
    items: MutableList<Item>,
    indicatorUnselectedWidth: Dp,
    indicatorUnselectedSmallWidth: Dp,
    indicatorUnselectedVerySmallWidth: Dp,
    spacing: Dp,
    modifier: Modifier,
    indicatorUnselectedModifier: Modifier,
    shouldAnimate: Boolean,
    indicatorSelectedModifier: Modifier,
    indicatorSelectedNotAnimatedModifier: Modifier,
    indicatorUnselectedSmallModifier: Modifier,
    indicatorUnselectedVerySmallModifier: Modifier,
    carouselState: CarouselState,
    indicatorSelectedWidth: Dp,
    indicatorSelectedHeight: Dp,
    activeColor: Color,
    indicatorShape: Shape,
) {
    var currentSelectedInWindow = items.currentSelectedPositionInWindow()

    val indicatorWidthPx = LocalDensity.current.run { indicatorUnselectedWidth.roundToPx() }
    val indicatorSmallWidthPx = LocalDensity.current.run { indicatorUnselectedSmallWidth.roundToPx() }
    val indicatorVerySmallWidthPx = LocalDensity.current.run { indicatorUnselectedVerySmallWidth.roundToPx() }
    val spacingPx = LocalDensity.current.run { spacing.roundToPx() }

    val visibleItems = items.filterNot { it.type == INVISIBLE }

    Box(
        modifier = modifier,
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(spacing),
            verticalAlignment = Alignment.CenterVertically,
        ) {

            visibleItems.forEach { item ->
                when (item.type) {
                    UNSELECTED -> Box(indicatorUnselectedModifier)
                    SELECTED -> if (shouldAnimate) Box(indicatorSelectedModifier) else Box(indicatorSelectedNotAnimatedModifier)
                    UNSELECTED_SMALL -> Box(indicatorUnselectedSmallModifier)
                    UNSELECTED_VERY_SMALL -> Box(indicatorUnselectedVerySmallModifier)
                    INVISIBLE -> {}
                }
            }
        }

        if (shouldAnimate) {
            Box(
                Modifier
                    .offset {

                        fun IndicatorType.toPx() = when (this) {
                            UNSELECTED -> indicatorWidthPx
                            SELECTED -> indicatorWidthPx
                            UNSELECTED_SMALL -> indicatorSmallWidthPx
                            UNSELECTED_VERY_SMALL -> indicatorVerySmallWidthPx
                            INVISIBLE -> 0
                        }

                        var x = 0
                        for (i in 0 until currentSelectedInWindow) {
                            x += visibleItems[i].type.toPx() + spacingPx
                        }
                        x += ((visibleItems[currentSelectedInWindow].type.toPx() + spacingPx) * carouselState.currentPageOffset).toInt()

                        IntOffset(
                            x = x,
                            y = 0
                        )
                    }
                    .size(width = indicatorSelectedWidth, height = indicatorSelectedHeight)
                    .background(
                        color = activeColor,
                        shape = indicatorShape,
                    )
            )
        }
    }
}

internal data class VisibleWindowState(
    var window: Window,
    var currentSelected: Int,
)

typealias Window = Pair<Int, Int>

private fun Window.isTheEdge(position: Int): Boolean = isTheLowerEdge(position) || isTheHigherEdge(position)
private fun Window.isTheLowerEdge(position: Int): Boolean = position == this.first
private fun Window.isTheHigherEdge(position: Int): Boolean = position == this.second
private fun Window.isTheAdjacentToTheLowerEdge(position: Int): Boolean = isTheLowerEdge(position - 1)
private fun Window.isTheAdjacentToTheHigherEdge(position: Int): Boolean = isTheHigherEdge(position + 1)
private fun Window.isInsideTheWindow(position: Int): Boolean = position >= this.first && position <= this.second
private fun Window.moveDecreasing(steps: Int = 1): Window = this.first - steps to this.second - steps
private fun Window.moveIncreasing(steps: Int = 1): Window = this.first + steps to this.second + steps

private fun List<Item>.currentSelectedPositionInWindow(): Int = filterNot { it.type == INVISIBLE }.indexOf(Item(type = SELECTED))

internal data class Item(var type: IndicatorType)

internal enum class IndicatorType {
    UNSELECTED,
    SELECTED,
    UNSELECTED_SMALL,
    UNSELECTED_VERY_SMALL,
    INVISIBLE,
}

private object CarouselPagerIndicator {
    const val MAX_WINDOW_SIZE = 5

    val indicatorSelectedWidth: Dp = 10.dp
    val indicatorSelectedHeight: Dp = indicatorSelectedWidth
    val indicatorUnselectedWidth: Dp = 8.dp
    val indicatorUnselectedHeight: Dp = indicatorUnselectedWidth
    val indicatorUnselectedSmallWidth: Dp = 6.dp
    val indicatorUnselectedSmallHeight: Dp = indicatorUnselectedSmallWidth
    val indicatorUnselectedVerySmallWidth: Dp = 4.dp
    val indicatorUnselectedVerySmallHeight: Dp = indicatorUnselectedVerySmallWidth
    val spacing: Dp = 8.dp
    val indicatorShape: Shape = CircleShape
}

internal enum class MovementDirection { DECREASE, INCREASE, NO_MOVEMENT }
