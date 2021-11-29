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

public val RegularGroup.MusicRegular: ImageVector
    get() {
        if (_musicRegular != null) {
            return _musicRegular!!
        }
        _musicRegular = Builder(name = "MusicRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.232f, 20.567f)
                lineToRelative(-0.238f, 0.003f)
                curveToRelative(-0.787f, -0.011f, -2.104f, -0.31f, -2.104f, -2.204f)
                curveToRelative(0.0f, -1.885f, 1.3f, -2.18f, 2.076f, -2.188f)
                lineToRelative(0.255f, 0.003f)
                curveToRelative(0.792f, 0.02f, 2.123f, 0.33f, 2.123f, 2.199f)
                curveToRelative(-0.003f, 1.87f, -1.322f, 2.173f, -2.112f, 2.187f)
                close()
                moveTo(10.414f, 4.962f)
                verticalLineTo(3.495f)
                lineToRelative(8.927f, 2.386f)
                verticalLineTo(7.35f)
                lineToRelative(-8.927f, -2.387f)
                close()
                moveTo(7.03f, 16.42f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, true, -0.24f, 0.0f)
                curveToRelative(-0.788f, -0.011f, -2.104f, -0.314f, -2.104f, -2.205f)
                curveToRelative(0.0f, -1.888f, 1.305f, -2.182f, 2.08f, -2.187f)
                lineToRelative(0.25f, 0.003f)
                curveToRelative(0.779f, 0.016f, 2.073f, 0.327f, 2.115f, 2.12f)
                verticalLineToRelative(0.162f)
                curveToRelative(-0.042f, 1.79f, -1.325f, 2.09f, -2.1f, 2.107f)
                close()
                moveTo(20.627f, 5.707f)
                curveToRelative(0.0f, -0.549f, -0.429f, -1.002f, -0.972f, -1.056f)
                lineToRelative(-9.28f, -2.479f)
                lineToRelative(-0.168f, -0.022f)
                arcTo(1.07f, 1.07f, 0.0f, false, false, 9.13f, 3.212f)
                verticalLineToRelative(8.232f)
                curveToRelative(-0.622f, -0.45f, -1.375f, -0.664f, -2.087f, -0.68f)
                curveToRelative(-0.09f, -0.003f, -0.199f, -0.003f, -0.291f, -0.003f)
                curveToRelative(-1.546f, 0.01f, -3.353f, 0.924f, -3.353f, 3.453f)
                curveToRelative(0.0f, 2.527f, 1.815f, 3.449f, 3.367f, 3.471f)
                horizontalLineToRelative(0.286f)
                curveToRelative(1.49f, -0.028f, 3.199f, -0.89f, 3.341f, -3.162f)
                horizontalLineToRelative(0.02f)
                verticalLineToRelative(-0.21f)
                curveToRelative(0.0f, -0.029f, 0.008f, -0.054f, 0.008f, -0.082f)
                curveToRelative(0.0f, -0.028f, -0.008f, -0.05f, -0.008f, -0.078f)
                verticalLineTo(6.276f)
                lineToRelative(8.927f, 2.387f)
                verticalLineTo(15.6f)
                arcToRelative(3.737f, 3.737f, 0.0f, false, false, -2.092f, -0.686f)
                lineToRelative(-0.292f, -0.003f)
                curveToRelative(-1.546f, 0.011f, -3.353f, 0.924f, -3.353f, 3.454f)
                curveToRelative(0.0f, 2.526f, 1.816f, 3.45f, 3.373f, 3.473f)
                horizontalLineToRelative(0.078f)
                lineToRelative(0.202f, -0.003f)
                curveToRelative(1.555f, -0.028f, 3.367f, -0.95f, 3.367f, -3.454f)
                curveToRelative(0.0f, -0.05f, -0.011f, -0.09f, -0.014f, -0.137f)
                horizontalLineToRelative(0.014f)
                verticalLineTo(5.707f)
                horizontalLineToRelative(0.003f)
                close()
            }
        }
        .build()
        return _musicRegular!!
    }

private var _musicRegular: ImageVector? = null
