package com.telefonica.mistica.list.decoration.divider

interface DividerItemAdapter {
    fun getDividerLeftOffset(position: Int): Int
    fun getDividerRightOffset(position: Int): Int
    fun hasDivider(position: Int): Boolean
}