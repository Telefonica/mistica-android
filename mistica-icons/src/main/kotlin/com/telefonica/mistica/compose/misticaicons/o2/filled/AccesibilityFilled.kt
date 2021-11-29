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

public val FilledGroup.AccesibilityFilled: ImageVector
    get() {
        if (_accesibilityFilled != null) {
            return _accesibilityFilled!!
        }
        _accesibilityFilled = Builder(name = "AccesibilityFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.213f, 1.224f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, true, 1.0f, 0.0f)
                lineToRelative(4.14f, 4.309f)
                curveToRelative(1.429f, -0.714f, 3.001f, -1.088f, 4.645f, -1.088f)
                curveToRelative(4.285f, 0.0f, 8.145f, 2.663f, 9.893f, 6.749f)
                arcToRelative(0.862f, 0.862f, 0.0f, false, true, 0.0f, 0.6f)
                curveToRelative(-0.892f, 2.025f, -2.248f, 3.713f, -3.964f, 4.876f)
                lineToRelative(3.856f, 4.05f)
                arcToRelative(0.755f, 0.755f, 0.0f, false, true, 0.004f, 1.053f)
                arcToRelative(0.686f, 0.686f, 0.0f, false, true, -0.5f, 0.227f)
                arcToRelative(0.686f, 0.686f, 0.0f, false, true, -0.5f, -0.227f)
                lineTo(2.213f, 2.273f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, 0.0f, -1.05f)
                close()
                moveTo(5.177f, 6.994f)
                lineTo(6.177f, 8.082f)
                curveToRelative(-1.072f, 0.903f, -2.0f, 2.066f, -2.644f, 3.414f)
                curveToRelative(1.572f, 3.373f, 4.857f, 5.548f, 8.465f, 5.548f)
                curveToRelative(0.82f, 0.0f, 1.608f, -0.109f, 2.393f, -0.336f)
                lineToRelative(1.18f, 1.201f)
                arcToRelative(10.585f, 10.585f, 0.0f, false, true, -3.573f, 0.639f)
                curveToRelative(-4.248f, 0.0f, -8.145f, -2.663f, -9.893f, -6.753f)
                arcToRelative(0.862f, 0.862f, 0.0f, false, true, 0.0f, -0.601f)
                curveToRelative(0.68f, -1.688f, 1.752f, -3.074f, 3.072f, -4.2f)
                close()
                moveTo(7.962f, 9.96f)
                lineToRelative(5.5f, 5.77f)
                curveToRelative(-0.464f, 0.152f, -0.928f, 0.265f, -1.464f, 0.265f)
                curveToRelative(-2.356f, 0.0f, -4.284f, -2.024f, -4.288f, -4.498f)
                curveToRelative(0.0f, -0.562f, 0.108f, -1.05f, 0.252f, -1.537f)
                close()
                moveTo(12.034f, 5.945f)
                arcToRelative(8.867f, 8.867f, 0.0f, false, false, -3.572f, 0.752f)
                lineToRelative(1.072f, 1.126f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, 2.464f, -0.824f)
                curveToRelative(2.357f, 0.0f, 4.285f, 2.025f, 4.285f, 4.498f)
                curveToRelative(0.0f, 0.937f, -0.284f, 1.836f, -0.784f, 2.587f)
                lineToRelative(1.464f, 1.496f)
                arcToRelative(9.612f, 9.612f, 0.0f, false, false, 3.536f, -4.087f)
                curveToRelative(-1.572f, -3.372f, -4.856f, -5.548f, -8.465f, -5.548f)
                close()
            }
        }
        .build()
        return _accesibilityFilled!!
    }

private var _accesibilityFilled: ImageVector? = null
