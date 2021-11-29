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

public val RegularGroup.FootballBallRegular: ImageVector
    get() {
        if (_footballBallRegular != null) {
            return _footballBallRegular!!
        }
        _footballBallRegular = Builder(name = "FootballBallRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.488f, 2.0f, 2.0f, 6.488f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.488f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.488f, 10.0f, -10.0f)
                reflectiveCurveTo(17.512f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(20.227f, 14.39f)
                lineTo(19.669f, 13.147f)
                lineTo(20.565f, 12.224f)
                arcToRelative(8.65f, 8.65f, 0.0f, false, true, -0.338f, 2.166f)
                close()
                moveTo(20.483f, 10.775f)
                lineTo(18.873f, 12.435f)
                lineTo(16.612f, 12.078f)
                lineTo(14.592f, 8.128f)
                lineTo(15.519f, 6.305f)
                lineTo(17.932f, 5.825f)
                arcToRelative(8.568f, 8.568f, 0.0f, false, true, 2.55f, 4.95f)
                close()
                moveTo(5.958f, 18.07f)
                lineToRelative(0.274f, -2.573f)
                lineToRelative(2.066f, -1.055f)
                lineToRelative(3.93f, 1.997f)
                lineToRelative(0.197f, 2.386f)
                lineToRelative(-1.499f, 1.677f)
                arcToRelative(8.549f, 8.549f, 0.0f, false, true, -4.968f, -2.432f)
                close()
                moveTo(3.91f, 14.83f)
                lineToRelative(1.253f, 0.608f)
                lineToRelative(-0.16f, 1.499f)
                arcToRelative(8.699f, 8.699f, 0.0f, false, true, -1.093f, -2.107f)
                close()
                moveTo(13.17f, 19.597f)
                lineTo(14.51f, 20.196f)
                arcToRelative(8.51f, 8.51f, 0.0f, false, true, -2.2f, 0.365f)
                lineToRelative(0.86f, -0.964f)
                close()
                moveTo(12.635f, 15.437f)
                lineTo(8.888f, 13.537f)
                lineTo(9.537f, 9.387f)
                lineTo(13.687f, 8.724f)
                lineTo(15.597f, 12.463f)
                lineTo(12.635f, 15.438f)
                close()
                moveTo(14.884f, 3.93f)
                arcToRelative(8.402f, 8.402f, 0.0f, false, true, 1.974f, 1.014f)
                lineToRelative(-1.293f, 0.26f)
                lineToRelative(-0.681f, -1.274f)
                close()
                moveTo(13.467f, 3.56f)
                lineTo(14.619f, 5.708f)
                lineTo(13.636f, 7.645f)
                lineTo(9.258f, 8.349f)
                lineTo(7.695f, 6.79f)
                lineToRelative(0.31f, -2.363f)
                arcToRelative(8.536f, 8.536f, 0.0f, false, true, 4.0f, -0.992f)
                curveToRelative(0.498f, -0.004f, 0.987f, 0.041f, 1.462f, 0.124f)
                close()
                moveTo(6.822f, 5.176f)
                lineToRelative(-0.178f, 1.376f)
                lineToRelative(-1.518f, 0.334f)
                arcToRelative(8.834f, 8.834f, 0.0f, false, true, 1.696f, -1.71f)
                close()
                moveTo(4.345f, 8.161f)
                lineToRelative(2.628f, -0.58f)
                lineToRelative(1.53f, 1.526f)
                lineToRelative(-0.685f, 4.378f)
                lineToRelative(-2.052f, 1.052f)
                lineToRelative(-2.203f, -1.07f)
                arcTo(8.586f, 8.586f, 0.0f, false, true, 3.435f, 12.0f)
                arcToRelative(8.413f, 8.413f, 0.0f, false, true, 0.91f, -3.84f)
                close()
                moveTo(15.885f, 19.633f)
                lineTo(13.485f, 18.563f)
                lineTo(13.298f, 16.292f)
                lineTo(16.447f, 13.133f)
                lineTo(18.645f, 13.481f)
                lineTo(19.687f, 15.789f)
                arcToRelative(8.64f, 8.64f, 0.0f, false, true, -3.802f, 3.844f)
                close()
            }
        }
        .build()
        return _footballBallRegular!!
    }

private var _footballBallRegular: ImageVector? = null
