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

public val LightGroup.WaterDropLight: ImageVector
    get() {
        if (_waterDropLight != null) {
            return _waterDropLight!!
        }
        _waterDropLight = Builder(name = "WaterDropLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.65f, 17.38f)
                horizontalLineToRelative(-1.403f)
                curveToRelative(-0.211f, 0.0f, -0.35f, 0.141f, -0.35f, 0.355f)
                reflectiveCurveToRelative(0.139f, 0.355f, 0.35f, 0.355f)
                horizontalLineToRelative(1.402f)
                curveToRelative(0.212f, 0.0f, 0.351f, -0.14f, 0.351f, -0.355f)
                curveToRelative(0.0f, -0.214f, -0.14f, -0.355f, -0.35f, -0.355f)
                close()
                moveTo(16.438f, 18.91f)
                arcToRelative(0.336f, 0.336f, 0.0f, false, false, -0.49f, 0.0f)
                arcToRelative(0.347f, 0.347f, 0.0f, false, false, 0.0f, 0.496f)
                lineToRelative(0.985f, 0.996f)
                arcToRelative(0.369f, 0.369f, 0.0f, false, false, 0.247f, 0.105f)
                arcToRelative(0.392f, 0.392f, 0.0f, false, false, 0.247f, -0.105f)
                arcToRelative(0.347f, 0.347f, 0.0f, false, false, 0.0f, -0.496f)
                lineToRelative(-0.989f, -0.997f)
                close()
                moveTo(14.788f, 19.87f)
                curveToRelative(-0.21f, 0.0f, -0.35f, 0.14f, -0.35f, 0.355f)
                verticalLineToRelative(1.42f)
                curveToRelative(0.0f, 0.214f, 0.14f, 0.355f, 0.35f, 0.355f)
                curveToRelative(0.212f, 0.0f, 0.351f, -0.141f, 0.351f, -0.355f)
                verticalLineToRelative(-1.42f)
                curveToRelative(0.0f, -0.214f, -0.139f, -0.355f, -0.35f, -0.355f)
                close()
                moveTo(12.156f, 5.114f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, false, 0.701f, -0.71f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, false, -0.7f, -0.71f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, false, -0.702f, 0.71f)
                curveToRelative(0.0f, 0.39f, 0.315f, 0.71f, 0.701f, 0.71f)
                close()
                moveTo(10.97f, 19.765f)
                curveTo(7.679f, 19.765f, 5.0f, 17.052f, 5.0f, 13.721f)
                curveToRelative(0.0f, -0.929f, 0.202f, -1.816f, 0.602f, -2.645f)
                lineToRelative(5.056f, -8.898f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, true, 0.481f, -0.132f)
                curveToRelative(0.167f, 0.1f, 0.225f, 0.314f, 0.13f, 0.487f)
                lineToRelative(-5.051f, 8.875f)
                arcToRelative(5.305f, 5.305f, 0.0f, false, false, -0.517f, 2.313f)
                curveToRelative(0.0f, 2.94f, 2.364f, 5.334f, 5.268f, 5.334f)
                curveToRelative(2.903f, 0.0f, 5.267f, -2.394f, 5.267f, -5.334f)
                curveToRelative(0.0f, -0.82f, -0.18f, -1.603f, -0.53f, -2.335f)
                lineTo(12.73f, 6.179f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, 0.126f, -0.487f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, 0.481f, 0.127f)
                lineToRelative(2.989f, 5.23f)
                curveToRelative(0.409f, 0.851f, 0.611f, 1.739f, 0.611f, 2.667f)
                curveToRelative(0.0f, 3.336f, -2.679f, 6.05f, -5.968f, 6.05f)
                close()
            }
        }
        .build()
        return _waterDropLight!!
    }

private var _waterDropLight: ImageVector? = null
