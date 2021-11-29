package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.InformationUserRegular: ImageVector
    get() {
        if (_informationUserRegular != null) {
            return _informationUserRegular!!
        }
        _informationUserRegular = Builder(name = "InformationUserRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.57f, 21.626f)
                curveToRelative(2.723f, -0.025f, 9.056f, -1.008f, 9.056f, -9.592f)
                curveToRelative(0.0f, -8.599f, -6.392f, -9.62f, -9.144f, -9.657f)
                curveToRelative(-0.32f, -0.003f, -0.642f, -0.003f, -0.96f, 0.003f)
                curveToRelative(-2.753f, 0.05f, -9.148f, 1.087f, -9.148f, 9.589f)
                curveToRelative(0.0f, 8.505f, 6.433f, 9.579f, 9.2f, 9.644f)
                curveToRelative(0.244f, 0.007f, 0.526f, 0.01f, 0.799f, 0.01f)
                curveToRelative(0.0f, 0.003f, 0.197f, 0.003f, 0.197f, 0.003f)
                close()
                moveTo(12.504f, 1.0f)
                curveTo(14.714f, 1.031f, 23.0f, 1.833f, 23.0f, 12.034f)
                curveTo(23.0f, 22.224f, 14.79f, 22.981f, 12.582f, 23.0f)
                horizontalLineToRelative(-0.21f)
                curveToRelative(-0.281f, 0.0f, -0.575f, -0.003f, -0.829f, -0.013f)
                curveTo(9.386f, 22.937f, 1.0f, 22.086f, 1.0f, 11.97f)
                curveTo(1.0f, 1.833f, 9.396f, 1.044f, 11.496f, 1.006f)
                curveTo(11.831f, 1.0f, 12.169f, 1.0f, 12.504f, 1.0f)
                close()
                moveTo(12.006f, 9.264f)
                curveToRelative(0.379f, 0.0f, 0.689f, 0.307f, 0.689f, 0.689f)
                verticalLineToRelative(7.15f)
                arcToRelative(0.689f, 0.689f, 0.0f, false, true, -1.377f, 0.0f)
                verticalLineToRelative(-7.15f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, 0.688f, -0.689f)
                close()
                moveTo(12.013f, 6.891f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, 0.757f, 0.708f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, -0.707f, 0.757f)
                horizontalLineToRelative(-0.054f)
                arcToRelative(0.736f, 0.736f, 0.0f, false, true, -0.707f, -0.757f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 0.71f, -0.708f)
                close()
            }
        }
        .build()
        return _informationUserRegular!!
    }

private var _informationUserRegular: ImageVector? = null
