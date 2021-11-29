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

public val FilledGroup.AppointmentFilled: ImageVector
    get() {
        if (_appointmentFilled != null) {
            return _appointmentFilled!!
        }
        _appointmentFilled = Builder(name = "AppointmentFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.765f, 13.885f)
                curveToRelative(0.476f, 0.0f, 0.896f, 0.381f, 0.896f, 0.815f)
                verticalLineToRelative(1.406f)
                curveToRelative(0.0f, 0.443f, -0.409f, 0.816f, -0.896f, 0.816f)
                lineTo(13.4f, 16.922f)
                lineToRelative(0.002f, 1.35f)
                curveToRelative(0.0f, 0.479f, -0.378f, 0.882f, -0.823f, 0.882f)
                horizontalLineToRelative(-1.42f)
                curveToRelative(-0.449f, 0.0f, -0.824f, -0.403f, -0.824f, -0.882f)
                verticalLineToRelative(-1.353f)
                lineTo(8.972f, 16.919f)
                curveToRelative(-0.482f, 0.0f, -0.89f, -0.373f, -0.89f, -0.815f)
                verticalLineToRelative(-1.401f)
                curveToRelative(0.0f, -0.443f, 0.408f, -0.815f, 0.89f, -0.815f)
                horizontalLineToRelative(1.364f)
                verticalLineToRelative(-1.35f)
                curveToRelative(0.0f, -0.482f, 0.378f, -0.888f, 0.824f, -0.888f)
                horizontalLineToRelative(1.414f)
                curveToRelative(0.448f, 0.0f, 0.824f, 0.406f, 0.824f, 0.888f)
                verticalLineToRelative(1.347f)
                horizontalLineToRelative(1.367f)
                close()
                moveTo(18.386f, 20.468f)
                curveToRelative(2.096f, 0.0f, 2.096f, -1.807f, 2.096f, -2.4f)
                lineToRelative(-0.003f, -7.508f)
                lineTo(3.26f, 10.56f)
                verticalLineToRelative(7.527f)
                curveToRelative(0.0f, 0.028f, 0.0f, 0.056f, -0.002f, 0.084f)
                curveToRelative(0.0f, 0.0f, -0.045f, 1.036f, 0.577f, 1.683f)
                curveToRelative(0.38f, 0.398f, 0.994f, 0.6f, 1.812f, 0.6f)
                horizontalLineToRelative(12.42f)
                curveToRelative(0.05f, 0.0f, 0.101f, 0.002f, 0.151f, 0.01f)
                curveToRelative(0.014f, -0.002f, 0.076f, 0.004f, 0.168f, 0.004f)
                close()
                moveTo(18.07f, 4.134f)
                curveToRelative(3.927f, 0.0f, 3.639f, 3.6f, 3.639f, 3.6f)
                lineToRelative(0.002f, 10.333f)
                curveToRelative(0.0f, 3.32f, -2.442f, 3.62f, -3.325f, 3.62f)
                curveToRelative(-0.196f, 0.0f, -0.313f, -0.015f, -0.313f, -0.015f)
                lineTo(5.65f, 21.672f)
                curveToRelative(-3.866f, 0.0f, -3.62f, -3.585f, -3.62f, -3.585f)
                lineTo(2.03f, 7.714f)
                curveToRelative(0.0f, -3.341f, 2.656f, -3.58f, 3.41f, -3.58f)
                curveToRelative(0.126f, 0.0f, 0.199f, 0.006f, 0.199f, 0.006f)
                horizontalLineToRelative(1.19f)
                lineTo(6.829f, 2.61f)
                curveToRelative(0.0f, -0.335f, 0.275f, -0.61f, 0.616f, -0.61f)
                curveToRelative(0.34f, 0.0f, 0.617f, 0.272f, 0.617f, 0.61f)
                verticalLineToRelative(1.53f)
                lineToRelative(7.63f, -0.003f)
                lineTo(15.692f, 2.611f)
                curveToRelative(0.0f, -0.336f, 0.274f, -0.611f, 0.616f, -0.611f)
                curveToRelative(0.339f, 0.0f, 0.616f, 0.272f, 0.616f, 0.61f)
                verticalLineToRelative(1.527f)
                curveToRelative(-0.005f, -0.003f, 1.146f, -0.003f, 1.146f, -0.003f)
                close()
            }
        }
        .build()
        return _appointmentFilled!!
    }

private var _appointmentFilled: ImageVector? = null
