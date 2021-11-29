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

public val LightGroup.FullscreenLight: ImageVector
    get() {
        if (_fullscreenLight != null) {
            return _fullscreenLight!!
        }
        _fullscreenLight = Builder(name = "FullscreenLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.74f, 8.83f)
                arcToRelative(0.579f, 0.579f, 0.0f, false, true, -0.58f, -0.578f)
                lineTo(2.16f, 2.74f)
                curveToRelative(0.0f, -0.32f, 0.26f, -0.58f, 0.58f, -0.58f)
                horizontalLineToRelative(5.512f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, 0.0f, 1.16f)
                lineTo(3.32f, 3.32f)
                verticalLineToRelative(4.932f)
                curveToRelative(0.0f, 0.32f, -0.26f, 0.577f, -0.58f, 0.577f)
                close()
                moveTo(8.264f, 20.69f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, 0.0f, 1.16f)
                lineTo(2.74f, 21.85f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, -0.58f, -0.58f)
                verticalLineToRelative(-5.513f)
                curveToRelative(0.0f, -0.32f, 0.258f, -0.58f, 0.577f, -0.58f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, true, 0.58f, 0.577f)
                verticalLineToRelative(4.933f)
                curveToRelative(0.003f, 0.002f, 4.947f, 0.002f, 4.947f, 0.002f)
                close()
                moveTo(21.266f, 15.166f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, true, 0.577f, 0.58f)
                verticalLineToRelative(5.523f)
                curveToRelative(0.0f, 0.32f, -0.257f, 0.577f, -0.577f, 0.577f)
                horizontalLineToRelative(-5.523f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, 0.0f, -1.16f)
                horizontalLineToRelative(4.946f)
                verticalLineToRelative(-4.943f)
                curveToRelative(0.0f, -0.32f, 0.258f, -0.577f, 0.577f, -0.577f)
                close()
                moveTo(21.266f, 2.16f)
                curveToRelative(0.32f, 0.0f, 0.58f, 0.258f, 0.58f, 0.577f)
                verticalLineToRelative(5.538f)
                arcToRelative(0.576f, 0.576f, 0.0f, true, true, -1.154f, 0.0f)
                lineTo(20.692f, 3.317f)
                horizontalLineToRelative(-4.938f)
                arcToRelative(0.579f, 0.579f, 0.0f, true, true, 0.0f, -1.157f)
                horizontalLineToRelative(5.512f)
                close()
            }
        }
        .build()
        return _fullscreenLight!!
    }

private var _fullscreenLight: ImageVector? = null
