package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.ExitFullscreenLight: ImageVector
    get() {
        if (_exitFullscreenLight != null) {
            return _exitFullscreenLight!!
        }
        _exitFullscreenLight = Builder(name = "ExitFullscreenLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.256f, 15.167f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, 0.0f, 1.16f)
                horizontalLineToRelative(-4.932f)
                verticalLineToRelative(4.932f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, -1.16f, 0.0f)
                verticalLineToRelative(-5.512f)
                curveToRelative(0.0f, -0.32f, 0.258f, -0.58f, 0.577f, -0.58f)
                horizontalLineToRelative(5.515f)
                close()
                moveTo(8.24f, 15.167f)
                curveToRelative(0.319f, 0.0f, 0.58f, 0.258f, 0.58f, 0.577f)
                verticalLineToRelative(5.512f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, -1.16f, 0.0f)
                verticalLineToRelative(-4.932f)
                lineTo(2.73f, 16.324f)
                arcToRelative(0.58f, 0.58f, 0.0f, true, true, 0.0f, -1.16f)
                curveToRelative(0.0f, 0.003f, 5.51f, 0.003f, 5.51f, 0.003f)
                close()
                moveTo(8.24f, 2.15f)
                curveToRelative(0.319f, 0.0f, 0.58f, 0.258f, 0.58f, 0.577f)
                lineTo(8.82f, 8.24f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, true, -0.578f, 0.58f)
                lineTo(2.73f, 8.82f)
                arcToRelative(0.579f, 0.579f, 0.0f, true, true, 0.0f, -1.157f)
                horizontalLineToRelative(4.933f)
                lineTo(7.663f, 2.73f)
                curveToRelative(0.0f, -0.322f, 0.257f, -0.58f, 0.577f, -0.58f)
                close()
                moveTo(15.747f, 8.82f)
                arcToRelative(0.579f, 0.579f, 0.0f, false, true, -0.58f, -0.578f)
                lineTo(15.167f, 2.73f)
                arcToRelative(0.579f, 0.579f, 0.0f, true, true, 1.157f, 0.0f)
                verticalLineToRelative(4.933f)
                horizontalLineToRelative(4.932f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, 0.0f, 1.16f)
                horizontalLineToRelative(-5.51f)
                verticalLineToRelative(-0.004f)
                close()
            }
        }
        .build()
        return _exitFullscreenLight!!
    }

private var _exitFullscreenLight: ImageVector? = null
