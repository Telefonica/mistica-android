package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.FootballBallFilled: ImageVector
    get() {
        if (_footballBallFilled != null) {
            return _footballBallFilled!!
        }
        _footballBallFilled = Builder(name = "FootballBallFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.244f, 21.277f)
                lineToRelative(2.153f, 1.1f)
                arcTo(9.537f, 9.537f, 0.0f, false, true, 12.0f, 23.0f)
                curveToRelative(-0.105f, 0.0f, -0.206f, -0.005f, -0.31f, -0.01f)
                lineToRelative(1.554f, -1.713f)
                close()
                moveTo(7.866f, 15.264f)
                lineTo(12.293f, 17.62f)
                lineTo(12.517f, 20.442f)
                lineTo(10.336f, 22.846f)
                curveToRelative(-2.017f, -0.355f, -3.832f, -1.348f, -5.25f, -2.773f)
                lineToRelative(0.421f, -3.547f)
                lineToRelative(2.36f, -1.262f)
                close()
                moveTo(16.893f, 13.748f)
                lineTo(19.403f, 14.16f)
                lineTo(20.82f, 17.438f)
                curveToRelative(-0.942f, 1.843f, -2.391f, 3.36f, -4.147f, 4.338f)
                lineToRelative(-3.105f, -1.579f)
                lineToRelative(-0.215f, -2.72f)
                lineToRelative(3.54f, -3.73f)
                close()
                moveTo(2.416f, 15.495f)
                lineToRelative(2.021f, 0.969f)
                lineToRelative(-0.297f, 2.515f)
                arcToRelative(10.726f, 10.726f, 0.0f, false, true, -1.724f, -3.484f)
                close()
                moveTo(13.888f, 8.594f)
                lineTo(16.056f, 13.037f)
                lineTo(12.7f, 16.574f)
                lineTo(8.456f, 14.314f)
                lineTo(9.193f, 9.381f)
                lineTo(13.888f, 8.594f)
                close()
                moveTo(21.991f, 12.078f)
                curveToRelative(0.004f, 0.139f, 0.009f, 0.278f, 0.009f, 0.422f)
                curveToRelative(0.0f, 1.253f, -0.21f, 2.452f, -0.594f, 3.566f)
                lineToRelative(-0.974f, -2.256f)
                close()
                moveTo(6.403f, 7.25f)
                lineToRelative(1.752f, 1.833f)
                lineToRelative(-0.773f, 5.173f)
                lineToRelative(-2.341f, 1.258f)
                lineToRelative(-2.922f, -1.402f)
                arcTo(11.12f, 11.12f, 0.0f, false, true, 2.0f, 12.495f)
                curveToRelative(0.0f, -1.607f, 0.348f, -3.138f, 0.97f, -4.501f)
                lineToRelative(3.433f, -0.744f)
                close()
                moveTo(19.115f, 5.129f)
                arcToRelative(10.681f, 10.681f, 0.0f, false, true, 2.72f, 5.48f)
                lineToRelative(-2.204f, 2.448f)
                lineToRelative(-2.57f, -0.423f)
                lineTo(14.79f, 7.97f)
                lineToRelative(1.056f, -2.184f)
                close()
                moveTo(11.995f, 2.0f)
                curveToRelative(0.449f, 0.0f, 0.883f, 0.034f, 1.313f, 0.091f)
                lineToRelative(1.641f, 3.062f)
                lineToRelative(-1.115f, 2.308f)
                lineToRelative(-4.925f, 0.83f)
                lineToRelative(-1.783f, -1.866f)
                lineToRelative(0.402f, -3.316f)
                arcTo(9.6f, 9.6f, 0.0f, false, true, 11.995f, 2.0f)
                close()
                moveTo(6.367f, 3.828f)
                lineToRelative(-0.288f, 2.347f)
                lineToRelative(-2.405f, 0.518f)
                arcToRelative(10.273f, 10.273f, 0.0f, false, true, 2.693f, -2.865f)
                close()
                moveTo(14.702f, 2.394f)
                curveToRelative(1.249f, 0.369f, 2.4f, 0.983f, 3.398f, 1.794f)
                lineToRelative(-2.2f, 0.442f)
                close()
            }
        }
        .build()
        return _footballBallFilled!!
    }

private var _footballBallFilled: ImageVector? = null
