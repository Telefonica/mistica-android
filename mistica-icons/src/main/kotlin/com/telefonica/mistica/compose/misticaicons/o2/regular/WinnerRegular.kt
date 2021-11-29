package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.WinnerRegular: ImageVector
    get() {
        if (_winnerRegular != null) {
            return _winnerRegular!!
        }
        _winnerRegular = Builder(name = "WinnerRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.92f, 18.48f)
                lineToRelative(-2.089f, -3.788f)
                curveToRelative(1.187f, -1.324f, 1.904f, -3.143f, 1.904f, -5.117f)
                curveTo(18.735f, 5.41f, 15.502f, 2.0f, 11.55f, 2.0f)
                curveTo(7.6f, 2.0f, 4.365f, 5.41f, 4.365f, 9.575f)
                curveToRelative(0.0f, 1.93f, 0.68f, 3.715f, 1.83f, 5.039f)
                lineToRelative(-2.12f, 3.865f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, false, 0.037f, 0.645f)
                curveToRelative(0.143f, 0.19f, 0.359f, 0.267f, 0.575f, 0.19f)
                lineToRelative(2.838f, -0.874f)
                lineToRelative(0.86f, 3.143f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.47f, 0.417f)
                horizontalLineToRelative(0.073f)
                curveToRelative(0.18f, 0.0f, 0.36f, -0.112f, 0.47f, -0.3f)
                lineToRelative(2.12f, -3.905f)
                lineToRelative(2.12f, 3.904f)
                curveToRelative(0.106f, 0.19f, 0.286f, 0.301f, 0.47f, 0.301f)
                horizontalLineToRelative(0.073f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.47f, -0.417f)
                lineToRelative(0.864f, -3.143f)
                lineToRelative(2.839f, 0.873f)
                curveToRelative(0.216f, 0.078f, 0.432f, 0.0f, 0.575f, -0.189f)
                curveToRelative(0.096f, -0.189f, 0.096f, -0.417f, -0.01f, -0.645f)
                close()
                moveTo(11.55f, 3.512f)
                curveToRelative(3.165f, 0.0f, 5.75f, 2.726f, 5.75f, 6.062f)
                curveToRelative(0.0f, 3.337f, -2.585f, 6.062f, -5.75f, 6.062f)
                reflectiveCurveTo(5.8f, 12.912f, 5.8f, 9.575f)
                curveToRelative(0.0f, -3.336f, 2.585f, -6.062f, 5.75f, -6.062f)
                close()
                moveTo(9.07f, 19.992f)
                lineTo(8.422f, 17.605f)
                arcToRelative(0.586f, 0.586f, 0.0f, false, false, -0.253f, -0.34f)
                curveToRelative(-0.106f, -0.077f, -0.285f, -0.077f, -0.395f, -0.038f)
                lineToRelative(-2.047f, 0.645f)
                lineToRelative(1.33f, -2.386f)
                arcToRelative(7.024f, 7.024f, 0.0f, false, false, 3.665f, 1.668f)
                lineToRelative(-1.651f, 2.837f)
                close()
                moveTo(15.253f, 17.188f)
                curveToRelative(-0.142f, -0.039f, -0.285f, -0.039f, -0.395f, 0.039f)
                arcToRelative(0.623f, 0.623f, 0.0f, false, false, -0.253f, 0.34f)
                lineToRelative(-0.649f, 2.385f)
                lineToRelative(-1.578f, -2.875f)
                arcToRelative(6.872f, 6.872f, 0.0f, false, false, 3.703f, -1.591f)
                lineToRelative(1.293f, 2.347f)
                lineToRelative(-2.12f, -0.645f)
                close()
                moveTo(10.005f, 13.1f)
                lineTo(14.927f, 7.91f)
                arcToRelative(0.766f, 0.766f, 0.0f, false, false, 0.0f, -1.061f)
                curveToRelative(-0.286f, -0.306f, -0.718f, -0.306f, -1.008f, 0.0f)
                lineTo(10.0f, 10.982f)
                lineTo(8.744f, 9.658f)
                arcToRelative(0.675f, 0.675f, 0.0f, false, false, -1.007f, 0.0f)
                arcToRelative(0.766f, 0.766f, 0.0f, false, false, 0.0f, 1.062f)
                lineToRelative(2.268f, 2.38f)
                close()
            }
        }
        .build()
        return _winnerRegular!!
    }

private var _winnerRegular: ImageVector? = null
