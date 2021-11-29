package com.telefonica.mistica.compose.misticaicons.blau.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.blau.RegularGroup

public val RegularGroup.UserAccountRegular: ImageVector
    get() {
        if (_userAccountRegular != null) {
            return _userAccountRegular!!
        }
        _userAccountRegular = Builder(name = "UserAccountRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.972f, 4.35f)
                    arcTo(3.987f, 3.987f, 0.0f, false, false, 7.99f, 8.33f)
                    arcToRelative(3.987f, 3.987f, 0.0f, false, false, 3.982f, 3.982f)
                    arcToRelative(3.986f, 3.986f, 0.0f, false, false, 3.982f, -3.981f)
                    arcToRelative(3.986f, 3.986f, 0.0f, false, false, -3.982f, -3.982f)
                    close()
                    moveTo(11.972f, 13.667f)
                    arcTo(5.342f, 5.342f, 0.0f, false, true, 6.636f, 8.33f)
                    arcTo(5.342f, 5.342f, 0.0f, false, true, 11.972f, 2.994f)
                    arcToRelative(5.342f, 5.342f, 0.0f, false, true, 5.336f, 5.337f)
                    arcToRelative(5.342f, 5.342f, 0.0f, false, true, -5.336f, 5.336f)
                    close()
                    moveTo(3.331f, 21.384f)
                    lineTo(1.976f, 21.384f)
                    verticalLineToRelative(-2.229f)
                    curveToRelative(0.0f, -0.199f, 0.034f, -0.403f, 0.101f, -0.606f)
                    arcToRelative(2.24f, 2.24f, 0.0f, false, true, 0.773f, -1.12f)
                    curveToRelative(1.166f, -1.053f, 3.686f, -1.857f, 6.754f, -2.15f)
                    lineToRelative(0.344f, -0.033f)
                    lineToRelative(2.041f, 2.324f)
                    lineToRelative(2.148f, -2.323f)
                    lineToRelative(0.334f, 0.032f)
                    curveToRelative(3.027f, 0.29f, 5.441f, 1.073f, 6.631f, 2.15f)
                    curveToRelative(0.375f, 0.293f, 0.644f, 0.686f, 0.778f, 1.139f)
                    curveToRelative(0.062f, 0.184f, 0.096f, 0.388f, 0.096f, 0.587f)
                    verticalLineToRelative(2.22f)
                    horizontalLineToRelative(-1.355f)
                    verticalLineToRelative(-2.237f)
                    arcToRelative(0.94f, 0.94f, 0.0f, false, false, -0.364f, -0.65f)
                    lineToRelative(-0.049f, -0.042f)
                    curveToRelative(-0.902f, -0.83f, -3.004f, -1.504f, -5.534f, -1.784f)
                    lineToRelative(-2.711f, 2.93f)
                    lineToRelative(-2.573f, -2.93f)
                    curveToRelative(-2.574f, 0.286f, -4.767f, 0.976f, -5.646f, 1.784f)
                    lineToRelative(-0.049f, 0.042f)
                    arcToRelative(0.915f, 0.915f, 0.0f, false, false, -0.325f, 0.467f)
                    arcToRelative(0.632f, 0.632f, 0.0f, false, false, -0.039f, 0.182f)
                    lineToRelative(0.001f, 0.028f)
                    lineToRelative(-0.002f, 0.079f)
                    lineToRelative(0.001f, 2.14f)
                    close()
                }
            }
        }
        .build()
        return _userAccountRegular!!
    }

private var _userAccountRegular: ImageVector? = null
