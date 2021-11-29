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

public val RegularGroup.EyeRegular: ImageVector
    get() {
        if (_eyeRegular != null) {
            return _eyeRegular!!
        }
        _eyeRegular = Builder(name = "EyeRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.982f, 5.0f)
                curveToRelative(4.4f, 0.0f, 8.122f, 2.504f, 9.982f, 6.664f)
                verticalLineToRelative(0.037f)
                curveToRelative(0.036f, 0.037f, 0.036f, 0.037f, 0.036f, 0.075f)
                verticalLineToRelative(0.37f)
                curveToRelative(-0.036f, 0.0f, -0.036f, 0.037f, -0.036f, 0.037f)
                curveToRelative(-0.036f, 0.037f, -0.036f, 0.037f, -0.036f, 0.074f)
                verticalLineToRelative(0.037f)
                curveTo(20.104f, 16.496f, 16.383f, 19.0f, 11.982f, 19.0f)
                curveToRelative(-4.4f, 0.0f, -8.122f, -2.504f, -9.946f, -6.631f)
                verticalLineToRelative(-0.037f)
                curveTo(2.0f, 12.294f, 2.0f, 12.294f, 2.0f, 12.257f)
                verticalLineToRelative(-0.444f)
                curveToRelative(0.036f, -0.037f, 0.036f, -0.037f, 0.036f, -0.075f)
                verticalLineToRelative(-0.037f)
                curveTo(3.86f, 7.504f, 7.581f, 5.0f, 11.982f, 5.0f)
                close()
                moveTo(11.982f, 6.475f)
                curveToRelative(-3.72f, 0.0f, -6.87f, 2.059f, -8.514f, 5.523f)
                curveToRelative(1.645f, 3.46f, 4.793f, 5.523f, 8.514f, 5.523f)
                curveToRelative(3.72f, 0.0f, 6.87f, -2.06f, 8.514f, -5.523f)
                curveToRelative(-1.645f, -3.464f, -4.793f, -5.523f, -8.514f, -5.523f)
                close()
                moveTo(11.982f, 7.208f)
                curveToRelative(2.577f, 0.0f, 4.653f, 2.137f, 4.653f, 4.79f)
                curveToRelative(0.0f, 2.652f, -2.076f, 4.79f, -4.653f, 4.79f)
                curveToRelative(-2.577f, 0.0f, -4.653f, -2.138f, -4.653f, -4.79f)
                curveToRelative(0.0f, -2.653f, 2.076f, -4.79f, 4.653f, -4.79f)
                close()
                moveTo(11.982f, 8.682f)
                curveToRelative(-1.788f, 0.0f, -3.22f, 1.475f, -3.22f, 3.316f)
                curveToRelative(0.0f, 1.841f, 1.432f, 3.316f, 3.22f, 3.316f)
                curveToRelative(1.788f, 0.0f, 3.22f, -1.475f, 3.22f, -3.316f)
                curveToRelative(0.0f, -1.841f, -1.432f, -3.316f, -3.22f, -3.316f)
                close()
            }
        }
        .build()
        return _eyeRegular!!
    }

private var _eyeRegular: ImageVector? = null
