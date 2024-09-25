package com.telefonica.mistica.compose.carousel

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalculateItemsTest {

    @Test
    fun `a list without scroll should present a selected item and the rest should be unselected`() {
        val items: MutableList<Item> = givenASmallItemList()
        val currentSelected = 0
        val visibleWindowState = givenASmallVisibleWindowState(currentSelected)

        calculateItems(
            items,
            visibleWindowState,
            pagerCount = ITEM_COUNT_WITHOUT_SCROLL,
            currentSelected = currentSelected,
            log = {}
        )

        assertEquals(IndicatorType.SELECTED, items[0].type)
        assertEquals(IndicatorType.UNSELECTED, items[1].type)
        assertEquals(IndicatorType.UNSELECTED, items[2].type)
        assertEquals(IndicatorType.UNSELECTED, items[3].type)
        assertEquals(IndicatorType.UNSELECTED, items[4].type)
    }

    @Test
    fun `a list with scroll with the first item selected should hide the last items`() {
        val items: MutableList<Item> = givenABigItemList()
        val currentSelected = 0
        val visibleWindowState = givenABigVisibleWindowState(currentSelected)

        calculateItems(
            items,
            visibleWindowState,
            pagerCount = ITEM_COUNT_WITH_SCROLL,
            currentSelected = currentSelected,
            log = {}
        )

        assertEquals(IndicatorType.SELECTED, items[0].type)
        assertEquals(IndicatorType.UNSELECTED, items[1].type)
        assertEquals(IndicatorType.UNSELECTED, items[2].type)
        assertEquals(IndicatorType.UNSELECTED_SMALL, items[3].type)
        assertEquals(IndicatorType.UNSELECTED_VERY_SMALL, items[4].type)
        assertEquals(IndicatorType.INVISIBLE, items[5].type)
        assertEquals(IndicatorType.INVISIBLE, items[6].type)
        assertEquals(IndicatorType.INVISIBLE, items[7].type)
    }

    @Test
    fun `a list with scroll with the middle item selected should hide the edge items`() {
        val items: MutableList<Item> = givenABigItemList()
        val currentSelected = 4
        val visibleWindowState = givenABigVisibleWindowStateInTheMiddle(currentSelected)

        calculateItems(
            items,
            visibleWindowState,
            pagerCount = ITEM_COUNT_WITH_SCROLL,
            currentSelected = currentSelected,
            log = {}
        )

        assertEquals(IndicatorType.INVISIBLE, items[0].type)
        assertEquals(IndicatorType.INVISIBLE, items[1].type)
        assertEquals(IndicatorType.UNSELECTED_VERY_SMALL, items[2].type)
        assertEquals(IndicatorType.UNSELECTED_SMALL, items[3].type)
        assertEquals(IndicatorType.SELECTED, items[4].type)
        assertEquals(IndicatorType.UNSELECTED_SMALL, items[5].type)
        assertEquals(IndicatorType.UNSELECTED_VERY_SMALL, items[6].type)
        assertEquals(IndicatorType.INVISIBLE, items[7].type)
    }

    private fun givenASmallVisibleWindowState(currentSelected: Int): VisibleWindowState = VisibleWindowState(
        window = 0 to 4,
        currentSelected = currentSelected,
    )

    private fun givenABigVisibleWindowState(currentSelected: Int): VisibleWindowState = VisibleWindowState(
        window = 0 to 4,
        currentSelected = currentSelected,
    )

    private fun givenABigVisibleWindowStateInTheMiddle(currentSelected: Int): VisibleWindowState = VisibleWindowState(
        window = 2 to 6,
        currentSelected = currentSelected,
    )

    private fun givenASmallItemList(): MutableList<Item> = mutableListOf(
        Item(IndicatorType.INVISIBLE),
        Item(IndicatorType.INVISIBLE),
        Item(IndicatorType.INVISIBLE),
        Item(IndicatorType.INVISIBLE),
        Item(IndicatorType.INVISIBLE),
    )

    private fun givenABigItemList(): MutableList<Item> = mutableListOf(
        Item(IndicatorType.INVISIBLE),
        Item(IndicatorType.INVISIBLE),
        Item(IndicatorType.INVISIBLE),
        Item(IndicatorType.INVISIBLE),
        Item(IndicatorType.INVISIBLE),
        Item(IndicatorType.INVISIBLE),
        Item(IndicatorType.INVISIBLE),
        Item(IndicatorType.INVISIBLE),
    )

    companion object {
        const val ITEM_COUNT_WITH_SCROLL = 8
        const val ITEM_COUNT_WITHOUT_SCROLL = 5
    }
}