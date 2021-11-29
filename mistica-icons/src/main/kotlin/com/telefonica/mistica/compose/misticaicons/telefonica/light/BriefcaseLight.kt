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

public val LightGroup.BriefcaseLight: ImageVector
    get() {
        if (_briefcaseLight != null) {
            return _briefcaseLight!!
        }
        _briefcaseLight = Builder(name = "BriefcaseLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.009f, 20.555f)
                arcToRelative(0.444f, 0.444f, 0.0f, false, true, -0.44f, 0.448f)
                lineTo(3.44f, 21.003f)
                arcToRelative(0.444f, 0.444f, 0.0f, false, true, -0.442f, -0.442f)
                verticalLineToRelative(-7.23f)
                curveToRelative(1.708f, 1.14f, 4.128f, 1.706f, 7.79f, 1.807f)
                lineToRelative(-0.009f, 0.008f)
                verticalLineToRelative(1.61f)
                curveToRelative(0.0f, 0.253f, 0.076f, 0.457f, 0.227f, 0.608f)
                curveToRelative(0.151f, 0.143f, 0.35f, 0.219f, 0.594f, 0.219f)
                horizontalLineToRelative(0.804f)
                curveToRelative(0.252f, 0.0f, 0.453f, -0.076f, 0.594f, -0.219f)
                curveToRelative(0.15f, -0.15f, 0.226f, -0.355f, 0.226f, -0.607f)
                verticalLineToRelative(-1.611f)
                curveToRelative(3.636f, -0.092f, 6.065f, -0.625f, 7.782f, -1.723f)
                curveToRelative(0.003f, 0.0f, 0.003f, 7.132f, 0.003f, 7.132f)
                close()
                moveTo(11.819f, 15.155f)
                lineTo(12.389f, 15.146f)
                verticalLineToRelative(0.008f)
                lineToRelative(-0.008f, 1.586f)
                lineToRelative(-0.762f, 0.017f)
                lineToRelative(-0.016f, -1.594f)
                lineToRelative(0.215f, -0.009f)
                close()
                moveTo(2.997f, 8.582f)
                arcToRelative(0.444f, 0.444f, 0.0f, false, true, 0.437f, -0.448f)
                horizontalLineToRelative(17.128f)
                curveToRelative(0.244f, 0.0f, 0.443f, 0.196f, 0.446f, 0.442f)
                verticalLineToRelative(3.835f)
                curveToRelative(-1.692f, 1.283f, -4.356f, 1.871f, -8.605f, 1.908f)
                horizontalLineToRelative(-0.325f)
                curveToRelative(-4.558f, 0.0f, -7.356f, -0.633f, -9.081f, -2.034f)
                lineTo(2.997f, 8.583f)
                close()
                moveTo(8.017f, 6.716f)
                curveToRelative(0.0f, -2.042f, 1.75f, -3.714f, 3.896f, -3.714f)
                horizontalLineToRelative(0.182f)
                curveToRelative(2.154f, 0.0f, 3.896f, 1.672f, 3.896f, 3.714f)
                verticalLineToRelative(0.575f)
                lineTo(8.017f, 7.291f)
                verticalLineToRelative(-0.575f)
                close()
                moveTo(20.565f, 7.291f)
                lineTo(16.83f, 7.291f)
                verticalLineToRelative(-0.575f)
                curveToRelative(0.0f, -2.507f, -2.12f, -4.557f, -4.736f, -4.557f)
                horizontalLineToRelative(-0.182f)
                curveToRelative(-2.608f, 0.0f, -4.734f, 2.05f, -4.734f, 4.557f)
                verticalLineToRelative(0.575f)
                lineTo(3.44f, 7.291f)
                curveToRelative(-0.703f, 0.0f, -1.28f, 0.574f, -1.28f, 1.291f)
                verticalLineToRelative(11.972f)
                curveToRelative(0.0f, 0.72f, 0.577f, 1.291f, 1.28f, 1.291f)
                horizontalLineToRelative(17.123f)
                curveToRelative(0.712f, 0.0f, 1.283f, -0.571f, 1.283f, -1.291f)
                lineTo(21.846f, 8.583f)
                arcToRelative(1.28f, 1.28f, 0.0f, false, false, -1.28f, -1.291f)
                close()
            }
        }
        .build()
        return _briefcaseLight!!
    }

private var _briefcaseLight: ImageVector? = null
