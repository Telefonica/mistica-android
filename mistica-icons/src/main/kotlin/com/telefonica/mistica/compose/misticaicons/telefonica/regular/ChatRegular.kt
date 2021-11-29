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

public val RegularGroup.ChatRegular: ImageVector
    get() {
        if (_chatRegular != null) {
            return _chatRegular!!
        }
        _chatRegular = Builder(name = "ChatRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.84f, 2.853f)
                arcToRelative(2.839f, 2.839f, 0.0f, false, true, 2.843f, 2.83f)
                verticalLineToRelative(9.649f)
                curveToRelative(0.0f, 1.56f, -1.274f, 2.83f, -2.843f, 2.83f)
                lineTo(8.297f, 18.162f)
                lineToRelative(-2.202f, 2.817f)
                curveToRelative(-0.341f, 0.454f, -0.74f, 0.454f, -0.868f, 0.454f)
                curveToRelative(-0.546f, 0.0f, -1.028f, -0.465f, -1.028f, -0.995f)
                verticalLineToRelative(-2.336f)
                curveToRelative(-1.263f, -0.257f, -2.188f, -1.384f, -2.188f, -2.773f)
                lineTo(2.011f, 5.682f)
                curveToRelative(0.0f, -1.56f, 1.278f, -2.83f, 2.846f, -2.83f)
                lineTo(18.84f, 2.852f)
                close()
                moveTo(18.838f, 3.973f)
                lineTo(4.854f, 3.973f)
                curveToRelative(-0.95f, 0.0f, -1.722f, 0.768f, -1.722f, 1.71f)
                verticalLineToRelative(9.649f)
                curveToRelative(0.0f, 0.975f, 0.7f, 1.709f, 1.627f, 1.709f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                verticalLineToRelative(2.552f)
                lineToRelative(2.264f, -2.894f)
                arcToRelative(0.566f, 0.566f, 0.0f, false, true, 0.442f, -0.216f)
                horizontalLineToRelative(10.813f)
                curveToRelative(0.95f, 0.0f, 1.722f, -0.767f, 1.722f, -1.708f)
                lineTo(20.56f, 5.682f)
                curveToRelative(0.0f, -0.944f, -0.773f, -1.709f, -1.722f, -1.709f)
                close()
                moveTo(13.986f, 12.158f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.309f, -0.252f, 0.56f, -0.56f, 0.56f)
                horizontalLineToRelative(-8.11f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.253f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(8.11f)
                close()
                moveTo(17.81f, 7.788f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.253f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.309f, -0.252f, 0.561f, -0.56f, 0.561f)
                lineTo(5.877f, 8.909f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                lineTo(17.81f, 7.789f)
                close()
            }
        }
        .build()
        return _chatRegular!!
    }

private var _chatRegular: ImageVector? = null
