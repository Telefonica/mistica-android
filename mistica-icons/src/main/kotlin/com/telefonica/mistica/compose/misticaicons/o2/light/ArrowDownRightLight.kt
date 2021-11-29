package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.ArrowDownRightLight: ImageVector
    get() {
        if (_arrowDownRightLight != null) {
            return _arrowDownRightLight!!
        }
        _arrowDownRightLight = Builder(name = "ArrowDownRightLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.17f, 3.921f)
                lineToRelative(6.646f, 6.651f)
                lineToRelative(3.078f, -3.08f)
                arcToRelative(1.854f, 1.854f, 0.0f, false, true, 2.016f, -0.411f)
                curveToRelative(0.67f, 0.283f, 1.09f, 0.903f, 1.09f, 1.638f)
                verticalLineTo(22.0f)
                horizontalLineTo(8.782f)
                curveToRelative(-0.726f, 0.0f, -1.345f, -0.42f, -1.628f, -1.106f)
                arcToRelative(1.885f, 1.885f, 0.0f, false, true, 0.403f, -2.066f)
                lineToRelative(3.014f, -3.015f)
                lineToRelative(-8.463f, -8.468f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, 0.0f, -0.516f)
                arcToRelative(0.361f, 0.361f, 0.0f, false, true, 0.515f, 0.0f)
                lineToRelative(7.361f, 7.366f)
                curveToRelative(1.533f, 1.534f, 1.533f, 1.534f, 1.441f, 1.757f)
                lineToRelative(-0.024f, 0.064f)
                lineTo(8.08f, 19.34f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -0.252f, 1.274f)
                curveToRelative(0.168f, 0.411f, 0.523f, 0.655f, 0.958f, 0.655f)
                horizontalLineToRelative(12.475f)
                verticalLineTo(8.719f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, false, -0.634f, -0.967f)
                arcToRelative(1.114f, 1.114f, 0.0f, false, false, -1.226f, 0.252f)
                lineToRelative(-2.814f, 2.832f)
                curveToRelative(-0.695f, 0.695f, -0.695f, 0.695f, -0.918f, 0.595f)
                lineToRelative(-0.064f, -0.024f)
                lineToRelative(-6.95f, -6.97f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, true, 0.0f, -0.516f)
                arcToRelative(0.361f, 0.361f, 0.0f, false, true, 0.515f, 0.0f)
                close()
                moveTo(7.453f, 2.0f)
                arcToRelative(0.727f, 0.727f, 0.0f, true, true, 0.0f, 1.454f)
                arcToRelative(0.727f, 0.727f, 0.0f, false, true, 0.0f, -1.454f)
                close()
            }
        }
        .build()
        return _arrowDownRightLight!!
    }

private var _arrowDownRightLight: ImageVector? = null
