package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.EmailLight: ImageVector
    get() {
        if (_emailLight != null) {
            return _emailLight!!
        }
        _emailLight = Builder(name = "EmailLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.274f, 18.223f)
                lineTo(2.726f, 18.223f)
                lineTo(2.726f, 6.45f)
                lineToRelative(8.91f, 5.501f)
                curveToRelative(0.057f, 0.035f, 0.122f, 0.05f, 0.182f, 0.05f)
                curveToRelative(0.061f, 0.0f, 0.126f, -0.015f, 0.182f, -0.05f)
                lineToRelative(8.91f, -5.496f)
                verticalLineToRelative(7.493f)
                curveToRelative(0.0f, 0.214f, 0.164f, 0.388f, 0.364f, 0.388f)
                curveToRelative(0.2f, 0.0f, 0.363f, -0.174f, 0.363f, -0.388f)
                lineTo(21.637f, 5.388f)
                curveToRelative(0.0f, -0.214f, -0.163f, -0.388f, -0.363f, -0.388f)
                lineTo(2.364f, 5.0f)
                curveTo(2.162f, 5.0f, 2.0f, 5.174f, 2.0f, 5.388f)
                verticalLineToRelative(13.224f)
                curveToRelative(0.0f, 0.214f, 0.163f, 0.388f, 0.363f, 0.388f)
                horizontalLineToRelative(18.91f)
                curveToRelative(0.2f, 0.0f, 0.364f, -0.174f, 0.364f, -0.388f)
                curveToRelative(0.0f, -0.214f, -0.163f, -0.389f, -0.363f, -0.389f)
                close()
                moveTo(11.818f, 11.163f)
                lineTo(3.09f, 5.778f)
                horizontalLineToRelative(17.458f)
                lineToRelative(-8.729f, 5.387f)
                close()
            }
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.274f, 16.277f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _emailLight!!
    }

private var _emailLight: ImageVector? = null
