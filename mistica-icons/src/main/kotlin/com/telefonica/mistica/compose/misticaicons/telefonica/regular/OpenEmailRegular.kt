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

public val RegularGroup.OpenEmailRegular: ImageVector
    get() {
        if (_openEmailRegular != null) {
            return _openEmailRegular!!
        }
        _openEmailRegular = Builder(name = "OpenEmailRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.622f, 20.464f)
                curveToRelative(-0.591f, 0.01f, -3.272f, 0.014f, -7.356f, 0.01f)
                horizontalLineToRelative(-0.042f)
                curveToRelative(-3.58f, 0.0f, -7.493f, 0.0f, -8.157f, -0.01f)
                curveToRelative(-0.232f, -0.003f, -0.54f, -0.048f, -0.694f, -0.227f)
                curveToRelative(-0.171f, -0.202f, -0.132f, -0.535f, -0.132f, -0.535f)
                lineToRelative(0.008f, -0.05f)
                lineToRelative(-0.005f, -8.404f)
                lineToRelative(6.812f, 4.291f)
                curveToRelative(0.07f, 0.053f, 0.728f, 0.51f, 1.661f, 0.51f)
                curveToRelative(0.563f, 0.0f, 1.1f, -0.165f, 1.588f, -0.485f)
                lineToRelative(7.138f, -4.448f)
                lineToRelative(-0.009f, 8.482f)
                lineToRelative(0.009f, 0.104f)
                curveToRelative(0.0f, 0.002f, 0.042f, 0.327f, -0.126f, 0.53f)
                curveToRelative(-0.152f, 0.184f, -0.463f, 0.226f, -0.695f, 0.232f)
                close()
                moveTo(10.899f, 4.34f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, true, 0.95f, -0.271f)
                curveToRelative(0.535f, 0.0f, 0.935f, 0.269f, 0.96f, 0.288f)
                lineToRelative(7.36f, 4.647f)
                curveToRelative(0.15f, 0.107f, 0.24f, 0.348f, 0.262f, 0.667f)
                lineToRelative(-7.795f, 4.86f)
                arcToRelative(1.658f, 1.658f, 0.0f, false, true, -0.919f, 0.288f)
                curveToRelative(-0.53f, 0.0f, -0.927f, -0.271f, -0.96f, -0.294f)
                lineTo(3.243f, 9.791f)
                lineTo(3.243f, 9.79f)
                curveToRelative(0.008f, -0.387f, 0.103f, -0.664f, 0.246f, -0.768f)
                lineToRelative(7.41f, -4.68f)
                close()
                moveTo(21.681f, 9.758f)
                curveToRelative(-0.023f, -1.003f, -0.44f, -1.51f, -0.815f, -1.773f)
                lineToRelative(-7.362f, -4.647f)
                arcToRelative(3.071f, 3.071f, 0.0f, false, false, -1.67f, -0.502f)
                curveToRelative(-0.926f, 0.0f, -1.582f, 0.448f, -1.624f, 0.482f)
                lineTo(2.93f, 7.915f)
                lineTo(2.793f, 8.0f)
                curveToRelative(-0.345f, 0.25f, -0.765f, 0.757f, -0.787f, 1.774f)
                lineToRelative(0.008f, 9.787f)
                curveToRelative(-0.025f, 0.218f, -0.062f, 0.899f, 0.4f, 1.456f)
                curveToRelative(0.25f, 0.3f, 0.734f, 0.658f, 1.63f, 0.678f)
                curveToRelative(0.505f, 0.008f, 2.822f, 0.011f, 5.455f, 0.011f)
                horizontalLineToRelative(2.764f)
                curveToRelative(1.933f, 0.0f, 6.527f, 0.003f, 7.381f, -0.01f)
                curveToRelative(0.894f, -0.018f, 1.378f, -0.38f, 1.628f, -0.679f)
                curveToRelative(0.462f, -0.557f, 0.428f, -1.238f, 0.403f, -1.456f)
                curveToRelative(-0.003f, -0.003f, 0.006f, -9.804f, 0.006f, -9.804f)
                close()
            }
        }
        .build()
        return _openEmailRegular!!
    }

private var _openEmailRegular: ImageVector? = null
