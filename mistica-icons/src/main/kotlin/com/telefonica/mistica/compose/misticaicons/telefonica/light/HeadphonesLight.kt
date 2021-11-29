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

public val LightGroup.HeadphonesLight: ImageVector
    get() {
        if (_headphonesLight != null) {
            return _headphonesLight!!
        }
        _headphonesLight = Builder(name = "HeadphonesLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.84f, 11.285f)
                curveToRelative(-0.056f, -7.532f, -4.34f, -9.129f, -7.939f, -9.129f)
                curveToRelative(-3.6f, 0.0f, -7.94f, 1.605f, -7.94f, 9.255f)
                curveToRelative(-1.166f, 0.653f, -1.805f, 1.947f, -1.805f, 3.812f)
                curveToRelative(0.0f, 2.667f, 1.28f, 4.18f, 3.602f, 4.306f)
                horizontalLineToRelative(0.376f)
                curveToRelative(1.566f, -0.059f, 2.174f, -1.272f, 2.174f, -4.314f)
                reflectiveCurveTo(7.7f, 10.952f, 6.15f, 10.901f)
                horizontalLineToRelative(-0.387f)
                curveToRelative(-0.33f, 0.017f, -0.658f, 0.07f, -0.975f, 0.16f)
                curveToRelative(0.098f, -5.35f, 2.485f, -8.067f, 7.112f, -8.067f)
                curveToRelative(4.628f, 0.0f, 6.998f, 2.7f, 7.112f, 8.017f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -0.745f, -0.101f)
                horizontalLineToRelative(-0.395f)
                curveToRelative(-1.565f, 0.059f, -2.182f, 1.271f, -2.182f, 4.322f)
                curveToRelative(0.0f, 2.148f, 0.311f, 3.344f, 1.042f, 3.93f)
                arcToRelative(9.11f, 9.11f, 0.0f, false, true, -3.798f, 1.196f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, false, -1.14f, -0.994f)
                arcToRelative(1.093f, 1.093f, 0.0f, false, false, -0.908f, 0.285f)
                arcToRelative(1.147f, 1.147f, 0.0f, false, false, -0.355f, 0.902f)
                curveToRelative(-0.031f, 0.334f, 0.07f, 0.667f, 0.28f, 0.927f)
                curveToRelative(0.238f, 0.244f, 0.566f, 0.376f, 0.902f, 0.359f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.927f, -0.3f)
                curveToRelative(0.095f, -0.1f, 0.17f, -0.218f, 0.221f, -0.35f)
                arcToRelative(9.513f, 9.513f, 0.0f, false, false, 4.815f, -1.672f)
                curveToRelative(0.056f, 0.003f, 0.115f, 0.003f, 0.171f, 0.0f)
                horizontalLineToRelative(0.4f)
                curveToRelative(2.323f, -0.11f, 3.595f, -1.672f, 3.595f, -4.306f)
                curveToRelative(0.0f, -1.966f, -0.706f, -3.313f, -2.003f, -3.924f)
                close()
                moveTo(5.815f, 11.745f)
                horizontalLineToRelative(0.294f)
                curveToRelative(0.582f, 0.0f, 1.378f, 0.05f, 1.378f, 3.487f)
                curveToRelative(0.0f, 3.437f, -0.82f, 3.454f, -1.46f, 3.479f)
                horizontalLineToRelative(-0.23f)
                curveToRelative(-1.893f, -0.11f, -2.82f, -1.247f, -2.82f, -3.488f)
                curveToRelative(0.0f, -2.24f, 0.927f, -3.386f, 2.838f, -3.479f)
                close()
                moveTo(18.209f, 18.695f)
                horizontalLineToRelative(-0.59f)
                curveToRelative(-0.524f, -0.093f, -1.085f, -0.586f, -1.085f, -3.446f)
                curveToRelative(0.0f, -3.434f, 0.821f, -3.46f, 1.46f, -3.488f)
                horizontalLineToRelative(0.238f)
                curveToRelative(1.893f, 0.093f, 2.812f, 1.23f, 2.812f, 3.48f)
                curveToRelative(0.003f, 2.249f, -0.941f, 3.36f, -2.835f, 3.453f)
                close()
            }
        }
        .build()
        return _headphonesLight!!
    }

private var _headphonesLight: ImageVector? = null
