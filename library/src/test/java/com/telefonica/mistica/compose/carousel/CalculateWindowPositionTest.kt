package com.telefonica.mistica.compose.carousel

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalculateWindowPositionTest {

    @Test
    fun `the bullet position is increased without moving the window`() {
        val visibleWindowState = givenABigVisibleWindowState(0)

        calculateWindowPosition(
            movementDirection = MovementDirection.INCREASE,
            currentSelected = 1,
            visibleWindowState = visibleWindowState,
            pagerCount = 8,
            onShouldAnimateUpdate = {},
            log = {}
        )

        thenWindowIsInTheLowerEdge(visibleWindowState.window)
        assertEquals(1, visibleWindowState.currentSelected)
    }

    @Test
    fun `the bullet position is decreased without moving the window`() {
        val visibleWindowState = givenABigVisibleWindowState(1)

        calculateWindowPosition(
            movementDirection = MovementDirection.DECREASE,
            currentSelected = 0,
            visibleWindowState = visibleWindowState,
            pagerCount = 8,
            onShouldAnimateUpdate = {},
            log = {}
        )

        thenWindowIsInTheLowerEdge(visibleWindowState.window)
        assertEquals(0, visibleWindowState.currentSelected)
    }

    @Test
    fun `the bullet position is kept and the window is increased when the movement is increase`() {
        val visibleWindowState = givenABigVisibleWindowState(3)

        calculateWindowPosition(
            movementDirection = MovementDirection.INCREASE,
            currentSelected = 4,
            visibleWindowState = visibleWindowState,
            pagerCount = 8,
            onShouldAnimateUpdate = {},
            log = {}
        )

        thenWindowHasIncreased(visibleWindowState.window)
        assertEquals(4, visibleWindowState.currentSelected)
    }

    @Test
    fun `the bullet position is moved if the window can't increase more`() {
        val visibleWindowState = givenABigVisibleWindowStateInTheEnd(6)

        calculateWindowPosition(
            movementDirection = MovementDirection.INCREASE,
            currentSelected = 7,
            visibleWindowState = visibleWindowState,
            pagerCount = 8,
            onShouldAnimateUpdate = {},
            log = {}
        )

        thenWindowIsInTheHigherEdge(visibleWindowState.window)
        assertEquals(7, visibleWindowState.currentSelected)
    }

    private fun thenWindowIsInTheLowerEdge(window: Pair<Int, Int>) {
        assertEquals(0, window.first)
        assertEquals(4, window.second)
    }

    private fun thenWindowHasIncreased(window: Pair<Int, Int>) {
        assertEquals(1, window.first)
        assertEquals(5, window.second)
    }

    private fun thenWindowIsInTheHigherEdge(window: Pair<Int, Int>) {
        assertEquals(3, window.first)
        assertEquals(7, window.second)
    }

    private fun givenABigVisibleWindowState(currentSelected: Int): VisibleWindowState = VisibleWindowState(
        window = 0 to 4,
        currentSelected = currentSelected,
    )

    private fun givenABigVisibleWindowStateInTheEnd(currentSelected: Int): VisibleWindowState = VisibleWindowState(
        window = 3 to 7,
        currentSelected = currentSelected,
    )
}