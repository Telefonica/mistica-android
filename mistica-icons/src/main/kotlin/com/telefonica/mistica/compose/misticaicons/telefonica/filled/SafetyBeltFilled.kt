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

public val FilledGroup.SafetyBeltFilled: ImageVector
    get() {
        if (_safetyBeltFilled != null) {
            return _safetyBeltFilled!!
        }
        _safetyBeltFilled = Builder(name = "SafetyBeltFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.445f, 17.064f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.0f, 1.163f)
                lineToRelative(-3.24f, 3.246f)
                arcToRelative(0.807f, 0.807f, 0.0f, false, true, -0.58f, 0.241f)
                arcToRelative(0.807f, 0.807f, 0.0f, false, true, -0.58f, -0.24f)
                lineToRelative(-1.7f, -1.704f)
                lineToRelative(-1.799f, -0.106f)
                arcToRelative(0.827f, 0.827f, 0.0f, false, true, -0.532f, -0.238f)
                lineToRelative(-2.46f, -2.462f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, true, 0.0f, -1.163f)
                lineToRelative(0.376f, -0.378f)
                lineToRelative(-1.342f, -1.345f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.24f, -0.582f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, 0.24f, -0.583f)
                lineToRelative(3.241f, -3.25f)
                arcToRelative(0.817f, 0.817f, 0.0f, false, true, 1.16f, 0.0f)
                lineToRelative(1.341f, 1.345f)
                lineToRelative(0.376f, -0.375f)
                arcToRelative(0.817f, 0.817f, 0.0f, false, true, 1.16f, 0.0f)
                lineToRelative(2.456f, 2.462f)
                arcToRelative(0.816f, 0.816f, 0.0f, false, true, 0.235f, 0.502f)
                lineToRelative(0.168f, 1.747f)
                lineToRelative(1.72f, 1.72f)
                close()
                moveTo(11.91f, 8.554f)
                curveToRelative(-0.014f, 0.017f, -0.028f, 0.031f, -0.042f, 0.045f)
                lineTo(7.67f, 12.804f)
                arcToRelative(0.819f, 0.819f, 0.0f, false, true, -1.16f, 0.0f)
                lineToRelative(-2.321f, -2.328f)
                arcToRelative(0.813f, 0.813f, 0.0f, false, true, -0.238f, -0.526f)
                lineToRelative(-0.112f, -1.67f)
                lineToRelative(-1.594f, -1.6f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, true, 0.0f, -1.165f)
                lineToRelative(3.24f, -3.249f)
                curveToRelative(0.32f, -0.32f, 0.84f, -0.32f, 1.16f, 0.0f)
                lineToRelative(1.583f, 1.586f)
                lineToRelative(1.723f, 0.05f)
                curveToRelative(0.21f, 0.006f, 0.409f, 0.092f, 0.554f, 0.24f)
                lineToRelative(2.322f, 2.329f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.0f, 1.162f)
                lineToRelative(-0.916f, 0.922f)
                close()
            }
        }
        .build()
        return _safetyBeltFilled!!
    }

private var _safetyBeltFilled: ImageVector? = null
