package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.MusicFilled: ImageVector
    get() {
        if (_musicFilled != null) {
            return _musicFilled!!
        }
        _musicFilled = Builder(name = "MusicFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.624f, 5.702f)
                curveToRelative(0.0f, -0.546f, -0.423f, -0.997f, -0.966f, -1.048f)
                lineToRelative(-9.286f, -2.482f)
                lineToRelative(-0.165f, -0.022f)
                curveToRelative(-0.443f, 0.0f, -0.821f, 0.266f, -0.983f, 0.644f)
                arcToRelative(1.046f, 1.046f, 0.0f, false, false, -0.085f, 0.41f)
                verticalLineToRelative(8.254f)
                curveToRelative(-0.621f, -0.46f, -1.383f, -0.678f, -2.098f, -0.695f)
                curveToRelative(-0.09f, -0.002f, -0.196f, -0.002f, -0.296f, -0.002f)
                curveToRelative(-1.544f, 0.014f, -3.345f, 0.924f, -3.345f, 3.448f)
                curveToRelative(0.0f, 2.52f, 1.812f, 3.442f, 3.361f, 3.465f)
                horizontalLineToRelative(0.115f)
                curveToRelative(0.062f, 0.0f, 0.12f, 0.0f, 0.171f, -0.003f)
                curveToRelative(1.485f, -0.025f, 3.188f, -0.885f, 3.333f, -3.148f)
                horizontalLineToRelative(0.028f)
                verticalLineTo(5.94f)
                lineToRelative(8.953f, 2.445f)
                verticalLineToRelative(7.233f)
                curveToRelative(-0.622f, -0.46f, -1.39f, -0.678f, -2.104f, -0.695f)
                lineToRelative(-0.291f, -0.003f)
                curveToRelative(-1.544f, 0.014f, -3.345f, 0.925f, -3.345f, 3.448f)
                curveToRelative(0.0f, 2.521f, 1.813f, 3.443f, 3.362f, 3.465f)
                horizontalLineToRelative(0.114f)
                curveToRelative(0.062f, 0.0f, 0.12f, 0.0f, 0.171f, -0.002f)
                curveToRelative(1.55f, -0.028f, 3.362f, -0.947f, 3.362f, -3.449f)
                curveToRelative(0.0f, -0.05f, -0.012f, -0.09f, -0.014f, -0.137f)
                horizontalLineToRelative(0.014f)
                verticalLineTo(5.702f)
                horizontalLineToRelative(-0.006f)
                close()
            }
        }
        .build()
        return _musicFilled!!
    }

private var _musicFilled: ImageVector? = null
