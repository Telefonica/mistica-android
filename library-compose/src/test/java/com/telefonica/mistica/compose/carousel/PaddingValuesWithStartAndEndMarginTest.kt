package com.telefonica.mistica.compose.carousel

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

internal class PaddingValuesWithStartAndEndMarginTest {
    var carouselState: CarouselState = mock {
        on { pageCount } doReturn ITEM_COUNT
    }
    val sut: PaddingValuesWithStartAndEndMargin = PaddingValuesWithStartAndEndMargin(
        carouselState = carouselState,
        start = START,
        end = END,
        top = TOP,
        bottom = BOTTOM,
        firstItemStart = FIRST_ITEM_START,
        firstItemEnd = FIRST_ITEM_END,
        lastItemStart = LAST_ITEM_START,
        lastItemEnd = LAST_ITEM_END,
    )

    @Test
    fun `the left padding of the first item should be 16 dp`() {
        givenPositionIs(0)

        val result = sut.calculateLeftPadding(LayoutDirection.Ltr)

        assertEquals(FIRST_ITEM_START, result)
    }

    @Test
    fun `the right padding of the first item should be 32 dp`() {
        givenPositionIs(0)

        val result = sut.calculateRightPadding(LayoutDirection.Ltr)

        assertEquals(FIRST_ITEM_END, result)
    }

    @Test
    fun `the left padding of an inner item should be 16 dp`() {
        givenPositionIs(1)

        val result = sut.calculateLeftPadding(LayoutDirection.Ltr)

        assertEquals(START, result)
    }

    @Test
    fun `the right padding of an inner item should be 16 dp`() {
        givenPositionIs(1)

        val result = sut.calculateRightPadding(LayoutDirection.Ltr)

        assertEquals(END, result)
    }

    @Test
    fun `the left padding of the last item should be 32 dp`() {
        givenPositionIs(ITEM_COUNT -1)

        val result = sut.calculateLeftPadding(LayoutDirection.Ltr)

        assertEquals(LAST_ITEM_START, result)
    }

    @Test
    fun `the right padding of the last item should be 32 dp`() {
        givenPositionIs(ITEM_COUNT -1)

        val result = sut.calculateRightPadding(LayoutDirection.Ltr)

        assertEquals(LAST_ITEM_END, result)
    }

    private fun givenPositionIs(position: Int) {
        whenever(carouselState.currentPage).doReturn(position)
    }

    companion object {
        private val START: Dp = 16.dp
        private val END: Dp = 16.dp
        private val TOP: Dp = 0.dp
        private val BOTTOM: Dp = 0.dp
        private val FIRST_ITEM_START: Dp = 16.dp
        private val FIRST_ITEM_END: Dp = 32.dp
        private val LAST_ITEM_START: Dp = 32.dp
        private val LAST_ITEM_END: Dp = 0.dp
        private const val ITEM_COUNT = 4
    }
}