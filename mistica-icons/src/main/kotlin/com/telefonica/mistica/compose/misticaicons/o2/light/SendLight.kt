package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.SendLight: ImageVector
    get() {
        if (_sendLight != null) {
            return _sendLight!!
        }
        _sendLight = Builder(name = "SendLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.38f)
                curveToRelative(0.0f, -0.029f, 0.0f, -0.057f, -0.005f, -0.086f)
                verticalLineToRelative(-0.028f)
                curveToRelative(0.0f, -0.005f, -0.004f, -0.01f, -0.01f, -0.02f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, false, -0.042f, -0.085f)
                lineToRelative(-0.019f, -0.033f)
                arcToRelative(0.341f, 0.341f, 0.0f, false, false, -0.1f, -0.085f)
                arcToRelative(0.295f, 0.295f, 0.0f, false, false, -0.123f, -0.043f)
                horizontalLineToRelative(-0.042f)
                curveToRelative(-0.034f, 0.0f, -0.062f, 0.0f, -0.095f, 0.005f)
                horizontalLineToRelative(-0.02f)
                lineTo(2.278f, 7.19f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, -0.275f, 0.327f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, 0.213f, 0.37f)
                lineToRelative(9.15f, 4.227f)
                lineToRelative(-1.104f, 1.105f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, false, 0.0f, 0.522f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, 0.26f, 0.11f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, 0.261f, -0.11f)
                lineTo(20.92f, 3.599f)
                lineToRelative(-2.418f, 9.041f)
                curveToRelative(-0.052f, 0.2f, 0.066f, 0.404f, 0.26f, 0.456f)
                curveToRelative(0.2f, 0.052f, 0.404f, -0.067f, 0.456f, -0.261f)
                lineToRelative(2.778f, -10.38f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.019f, 0.005f, -0.023f)
                lineTo(22.001f, 2.38f)
                close()
                moveTo(3.457f, 7.64f)
                lineToRelative(16.936f, -4.563f)
                lineToRelative(-8.468f, 8.472f)
                lineTo(3.457f, 7.64f)
                close()
                moveTo(17.923f, 17.275f)
                lineTo(16.808f, 21.72f)
                arcToRelative(0.374f, 0.374f, 0.0f, false, true, -0.327f, 0.28f)
                horizontalLineToRelative(-0.033f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, true, -0.337f, -0.218f)
                lineToRelative(-3.702f, -8.155f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, true, 0.184f, -0.488f)
                curveToRelative(0.19f, -0.086f, 0.408f, 0.0f, 0.489f, 0.185f)
                lineToRelative(3.266f, 7.186f)
                lineToRelative(0.854f, -3.415f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, 0.72f, 0.18f)
                close()
                moveTo(19.041f, 14.96f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -1.479f, 0.0f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 1.48f, 0.0f)
                close()
            }
        }
        .build()
        return _sendLight!!
    }

private var _sendLight: ImageVector? = null
