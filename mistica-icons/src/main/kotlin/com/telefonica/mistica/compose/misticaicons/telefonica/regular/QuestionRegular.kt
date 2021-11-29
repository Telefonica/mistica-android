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

public val RegularGroup.QuestionRegular: ImageVector
    get() {
        if (_questionRegular != null) {
            return _questionRegular!!
        }
        _questionRegular = Builder(name = "QuestionRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.405f, 20.626f)
                curveToRelative(1.93f, -0.037f, 8.227f, -0.76f, 8.227f, -8.608f)
                curveToRelative(0.0f, -7.846f, -6.328f, -8.608f, -8.266f, -8.656f)
                arcToRelative(28.489f, 28.489f, 0.0f, false, false, -0.857f, -0.008f)
                curveToRelative(-1.914f, 0.02f, -8.155f, 0.686f, -8.155f, 8.61f)
                curveToRelative(0.0f, 7.933f, 6.295f, 8.64f, 8.225f, 8.667f)
                curveToRelative(0.277f, 0.006f, 0.58f, 0.0f, 0.826f, -0.005f)
                close()
                moveTo(12.394f, 2.16f)
                curveToRelative(1.577f, 0.036f, 9.442f, 0.689f, 9.442f, 9.857f)
                curveToRelative(0.0f, 9.176f, -7.837f, 9.784f, -9.411f, 9.812f)
                curveToRelative(-0.174f, 0.003f, -0.379f, 0.006f, -0.58f, 0.006f)
                curveToRelative(-0.096f, 0.0f, -0.19f, 0.0f, -0.283f, -0.003f)
                curveToRelative(-1.572f, -0.02f, -9.412f, -0.602f, -9.412f, -9.868f)
                curveToRelative(0.0f, -9.267f, 7.787f, -9.799f, 9.35f, -9.813f)
                curveToRelative(0.291f, -0.005f, 0.62f, 0.0f, 0.894f, 0.009f)
                close()
                moveTo(11.554f, 16.543f)
                curveToRelative(0.529f, 0.0f, 0.873f, 0.348f, 0.873f, 0.846f)
                curveToRelative(0.0f, 0.558f, -0.339f, 0.891f, -0.843f, 0.891f)
                curveToRelative(-0.538f, 0.0f, -0.874f, -0.333f, -0.874f, -0.826f)
                verticalLineToRelative(-0.065f)
                curveToRelative(0.003f, -0.498f, 0.348f, -0.846f, 0.843f, -0.846f)
                close()
                moveTo(14.198f, 6.485f)
                curveToRelative(0.697f, 0.515f, 1.025f, 1.224f, 1.025f, 2.232f)
                curveToRelative(0.0f, 1.233f, -0.51f, 1.966f, -1.678f, 3.345f)
                curveToRelative(-1.339f, 1.549f, -1.392f, 1.61f, -1.392f, 3.056f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.4f, 0.4f)
                horizontalLineToRelative(-0.443f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, true, -0.395f, -0.325f)
                arcToRelative(3.187f, 3.187f, 0.0f, false, true, -0.056f, -0.633f)
                curveToRelative(0.0f, -1.084f, 0.38f, -1.725f, 1.235f, -2.753f)
                lineToRelative(0.162f, -0.196f)
                curveToRelative(1.407f, -1.664f, 1.673f, -2.13f, 1.673f, -2.914f)
                curveToRelative(0.0f, -0.557f, -0.16f, -0.921f, -0.535f, -1.22f)
                curveToRelative(-0.216f, -0.172f, -0.594f, -0.37f, -1.628f, -0.37f)
                curveToRelative(-0.563f, 0.0f, -1.059f, 0.064f, -1.666f, 0.218f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, true, -0.488f, -0.289f)
                curveToRelative(-0.003f, -0.008f, -0.003f, -0.016f, -0.005f, -0.025f)
                lineToRelative(-0.065f, -0.342f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.221f, -0.437f)
                curveToRelative(0.379f, -0.179f, 1.306f, -0.364f, 2.2f, -0.364f)
                curveToRelative(0.94f, -0.002f, 1.691f, 0.205f, 2.235f, 0.617f)
                close()
            }
        }
        .build()
        return _questionRegular!!
    }

private var _questionRegular: ImageVector? = null
