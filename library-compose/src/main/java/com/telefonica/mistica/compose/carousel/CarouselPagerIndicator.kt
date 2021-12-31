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
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerState
import com.telefonica.mistica.compose.carousel.IndicatorType.*
import com.telefonica.mistica.compose.carousel.MovementDirection.DECREASE
import com.telefonica.mistica.compose.carousel.MovementDirection.INCREASE
import com.telefonica.mistica.compose.carousel.MovementDirection.NO_MOVEMENT

/**
 * @param pagerState the state object of your [Pager] to be used to observe the list's state.
 * @param modifier the modifier to apply to this layout.
 * @param activeColor the color of the active Page indicator
 * @param inactiveColor the color of page indicators that are inactive. This defaults to
 * [activeColor] with the alpha component set to the [ContentAlpha.disabled].
 * @param indicatorWidth the width of each indicator in [Dp].
 * @param indicatorHeight the height of each indicator in [Dp]. Defaults to [indicatorWidth].
 * @param spacing the spacing between each indicator in [Dp].
 * @param indicatorShape the shape representing each indicator. This defaults to [CircleShape].
 */
@SuppressLint("MutableCollectionMutableState")
@ExperimentalPagerApi
@Composable
internal fun CarouselPagerIndicator(
    pagerState: PagerState,
    pagerCount: Int,
    modifier: Modifier = Modifier,
    activeColor: Color = LocalContentColor.current.copy(alpha = LocalContentAlpha.current),
    inactiveColor: Color = activeColor.copy(ContentAlpha.disabled),
    indicatorSelectedWidth: Dp = 6.dp * 2, //TODO gmerino use real values
    indicatorSelectedHeight: Dp = indicatorSelectedWidth,
    indicatorUnselectedWidth: Dp = 4.dp * 2, //TODO gmerino use real values
    indicatorUnselectedHeight: Dp = indicatorUnselectedWidth,
    indicatorUnselectedSmallWidth: Dp = 4.dp * 2, //TODO gmerino use real values
    indicatorUnselectedSmallHeight: Dp = indicatorUnselectedSmallWidth,
    indicatorUnselectedVerySmallWidth: Dp = 4.dp * 2, //TODO gmerino use real values
    indicatorUnselectedVerySmallHeight: Dp = indicatorUnselectedSmallWidth,
    spacing: Dp = 8.dp,
    indicatorShape: Shape = CircleShape,
) {
    Log.d("gmerinoTest", "starting with - ${pagerState.currentPage}")

    val visibleWindowState by remember {
        mutableStateOf(
            VisibleWindowState(
                window = 0 to if (pagerCount > Constants.MAX_WINDOW_SIZE) 4 else pagerCount - 1,
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
    var currentSelectedInWindow by remember { mutableStateOf(0) }
    var currentlySelected by remember { mutableStateOf(0) }
    var shouldAnimate by remember { mutableStateOf(true) }

    val indicatorUnselectedModifier = remember {
        Modifier
            .size(width = indicatorUnselectedWidth, height = indicatorUnselectedHeight)
            .background(color = inactiveColor, shape = indicatorShape)
    }
    val indicatorUnselectedSmallModifier = remember {
        Modifier
            .size(width = indicatorUnselectedWidth, height = indicatorUnselectedHeight)
            .background(color = Color.Green, shape = indicatorShape)
    }
    val indicatorUnselectedVerySmallModifier = remember {
        Modifier
            .size(width = indicatorUnselectedWidth, height = indicatorUnselectedHeight)
            .background(color = Color.Blue, shape = indicatorShape)
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

    Log.d("gmerinoTest", "----- (before: $visibleWindowState)")

    val movementDirection: MovementDirection = when {
        pagerState.currentPage > currentlySelected -> INCREASE
        pagerState.currentPage < currentlySelected -> DECREASE
        else -> NO_MOVEMENT //They're the same
    }
    currentlySelected = pagerState.currentPage

    //Check if we can move the bullet without moving to the edge
    var shouldTryToMoveTheWindow = false
    shouldAnimate = true
    when (movementDirection) {
        DECREASE -> {
            val desirablePosition = pagerState.currentPage //visibleWindowState.currentSelected - 1
            val canMoveTheBullet = !visibleWindowState.window.isTheEdge(desirablePosition)
            if (canMoveTheBullet) {
                Log.d("gmerinoTest", "Moving the bullet - $movementDirection")
                visibleWindowState.currentSelected = desirablePosition
            }
            shouldTryToMoveTheWindow = !canMoveTheBullet
        }
        INCREASE -> {
            val desirablePosition = pagerState.currentPage //visibleWindowState.currentSelected + 1
            val canMoveTheBullet = !visibleWindowState.window.isTheEdge(desirablePosition)
            if (canMoveTheBullet) {
                Log.d("gmerinoTest", "Moving the bullet - $movementDirection")
                visibleWindowState.currentSelected = desirablePosition
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
                    Log.d("gmerinoTest", "Moving the window - $movementDirection")
                    visibleWindowState.window = visibleWindowState.window.moveDecreasing()
                    visibleWindowState.currentSelected--
                    shouldAnimate = false
                }
                shouldMoveTheBulletToTheEdge = !canMoveTheWindow
            }
            INCREASE -> {
                val canMoveTheWindow = visibleWindowState.window.second < pagerCount - 1
                if (canMoveTheWindow) {
                    Log.d("gmerinoTest", "Moving the window - $movementDirection")
                    visibleWindowState.window = visibleWindowState.window.moveIncreasing()
                    visibleWindowState.currentSelected++
                    shouldAnimate = false
                }
                shouldMoveTheBulletToTheEdge = !canMoveTheWindow
            }
            NO_MOVEMENT -> {}
        }
    }
    //If we can't we move the bullet to the edge position
    if (shouldMoveTheBulletToTheEdge) {
        Log.d("gmerinoTest", "Moving to the edge - $movementDirection")
        when (movementDirection) {
            DECREASE -> visibleWindowState.currentSelected--
            INCREASE -> visibleWindowState.currentSelected++
            NO_MOVEMENT -> {}
        }
    }

    Log.d("gmerinoTest", "----- (after $visibleWindowState)")

    var selectedItemIndex: Int
    items.forEachIndexed { index, item ->
        when {
            //The bullets outside the window are invisible
            !visibleWindowState.window.isInsideTheWindow(index) -> {
                Log.d("gmerinoTest", "item-$index is outside the window")
                item.type = INVISIBLE
            }
            //The current selected
            index == visibleWindowState.currentSelected -> {
                Log.d("gmerinoTest", "item-$index is the currently selected")
                item.type = SELECTED
                selectedItemIndex = index
            }
            //The adjacent to the edge may be small
            visibleWindowState.window.isTheAdjacentToTheLowerEdge(index) -> {
                val thereAreNoMoreItems = visibleWindowState.window.first == 0
                when {
                    thereAreNoMoreItems -> {
                        Log.d("gmerinoTest", "item-$index is unselected, because it's the adjacent to the edge, but there are no more items")
                        item.type = UNSELECTED
                    }
                    else -> {
                        Log.d("gmerinoTest", "item-$index is adjacent to the lower edge")
                        item.type = UNSELECTED_SMALL
                    }
                }
            }
            //The adjacent to the edge may be small
            visibleWindowState.window.isTheAdjacentToTheHigherEdge(index) -> {
                val thereAreNoMoreItems = visibleWindowState.window.second == pagerCount - 1
                when {
                    thereAreNoMoreItems -> {
                        Log.d("gmerinoTest", "item-$index is unselected, because it's the adjacent to the edge, but there are no more items")
                        item.type = UNSELECTED
                    }
                    else -> {
                        Log.d("gmerinoTest", "item-$index is adjacent to the higher edge")
                        item.type = UNSELECTED_SMALL
                    }
                }
            }
            //The items in the edge can be regular, small or very small
            visibleWindowState.window.isTheLowerEdge(index) -> {
                val thereAreNoMoreItems = visibleWindowState.window.first == 0
                val isTheSelectedAdjacent = (index + 1) == pagerState.currentPage //visibleWindowState.currentSelected
                when {
                    thereAreNoMoreItems -> {
                        Log.d("gmerinoTest", "item-$index is the lower edge and there are no more items")
                        item.type = UNSELECTED
                    }
                    isTheSelectedAdjacent -> {
                        Log.d("gmerinoTest", "item-$index is the lower edge and the selected is the adjacent")
                        item.type = UNSELECTED_SMALL
                    }
                    else -> {
                        Log.d("gmerinoTest", "item-$index is the lower edge and the selected is NOT adjacent")
                        item.type = UNSELECTED_VERY_SMALL
                    }
                }
            }
            visibleWindowState.window.isTheHigherEdge(index) -> {
                val thereAreNoMoreItems = visibleWindowState.window.second == pagerCount - 1
                val isTheSelectedAdjacent = (index - 1) == pagerState.currentPage //visibleWindowState.currentSelected
                when {
                    thereAreNoMoreItems -> {
                        Log.d("gmerinoTest", "item-$index is the higher edge and there are no more items")
                        item.type = UNSELECTED
                    }
                    isTheSelectedAdjacent -> {
                        Log.d("gmerinoTest", "item-$index is the higher edge and the selected is the adjacent")
                        item.type = UNSELECTED_SMALL
                    }
                    else -> {
                        Log.d("gmerinoTest", "item-$index is the higher edge and the selected is NOT adjacent")
                        item.type = UNSELECTED_VERY_SMALL
                    }
                }
            }
            else -> {
                Log.d("gmerinoTest", "item-$index is unselected")
                item.type = UNSELECTED
            }
        }
    }
//    }

    currentSelectedInWindow = items.currentSelectedPositionInWindow()

    val indicatorWidthPx = LocalDensity.current.run { indicatorUnselectedWidth.roundToPx() }
    val indicatorSmallWidthPx = LocalDensity.current.run { indicatorUnselectedSmallWidth.roundToPx() }
    val indicatorVerySmallWidthPx = LocalDensity.current.run { indicatorUnselectedVerySmallWidth.roundToPx() }
    val spacingPx = LocalDensity.current.run { spacing.roundToPx() }

    Box(
        modifier = modifier,
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(spacing),
            verticalAlignment = Alignment.CenterVertically,
        ) {
//            val offset: (Int) -> IntOffset = if (shouldAnimate) {{ IntOffset(0,0)}} else {
//                { index ->
//                    val scrollPosition = (index + pagerState.currentPageOffset)
//                        .coerceIn(0f,
//                            (pagerState.pageCount - 1)
//                                .coerceAtLeast(0)
//                                .toFloat())
//                    val x = ((spacingPx + indicatorWidthPx) * scrollPosition).toInt()
//                    Log.d("gmerinoTest", "Scroll position: $scrollPosition, x: $x")
//                    IntOffset(
//                        x = x,
//                        y = 0
//                    )
//                }
//            }
            val offset: (Int) -> IntOffset = { IntOffset(0,0)}

            items.filterNot{ it.type == INVISIBLE }.forEachIndexed { index, item ->
                Log.d("gmerinoTest2", "$item")
                when (item.type) {
                    UNSELECTED -> Box(indicatorUnselectedModifier.offset { offset(index) })
                    SELECTED -> if (shouldAnimate) Box(indicatorSelectedModifier.offset { offset(index) }) else Box(indicatorSelectedNotAnimatedModifier.offset { offset(index) })
                    UNSELECTED_SMALL -> Box(indicatorUnselectedSmallModifier.offset { offset(index) })
                    UNSELECTED_VERY_SMALL -> Box(indicatorUnselectedVerySmallModifier.offset { offset(index) })
                    INVISIBLE -> {}
                }
            }
        }

        Log.d("gmerinoTest", "Should animate $shouldAnimate")
        if (shouldAnimate) {
            Box(
                Modifier
                    .offset {
                        Log.d("gmerinoTest", "Current page: ${pagerState.currentPage}")
                        val scrollPosition = (currentSelectedInWindow + pagerState.currentPageOffset)
                            .coerceIn(0f,
                                (pagerState.pageCount - 1)
                                    .coerceAtLeast(0)
                                    .toFloat())

                        val x = ((spacingPx + indicatorWidthPx) * scrollPosition).toInt()
                        Log.d("gmerinoTest", "Scroll position: (($spacingPx + $indicatorWidthPx) * $scrollPosition)")
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

private data class VisibleWindowState(
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

private data class Item(var type: IndicatorType)

private enum class IndicatorType {
    UNSELECTED,
    SELECTED,
    UNSELECTED_SMALL,
    UNSELECTED_VERY_SMALL,
    INVISIBLE,
}

private object Constants {
    const val MAX_WINDOW_SIZE = 5
}

private enum class MovementDirection { DECREASE, INCREASE, NO_MOVEMENT }
