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

public val FilledGroup.LinkFilled: ImageVector
    get() {
        if (_linkFilled != null) {
            return _linkFilled!!
        }
        _linkFilled = Builder(name = "LinkFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.178f, 16.598f)
                arcToRelative(0.806f, 0.806f, 0.0f, false, true, 1.14f, -0.04f)
                arcToRelative(0.813f, 0.813f, 0.0f, false, true, 0.04f, 1.146f)
                curveToRelative(-0.275f, 0.297f, -0.563f, 0.603f, -0.804f, 0.84f)
                curveToRelative(-1.967f, 1.976f, -3.757f, 3.303f, -5.544f, 3.303f)
                curveToRelative(-1.08f, 0.0f, -2.156f, -0.484f, -3.271f, -1.602f)
                curveToRelative(-1.367f, -1.372f, -1.838f, -2.784f, -1.446f, -4.314f)
                curveToRelative(0.336f, -1.3f, 1.303f, -2.703f, 3.138f, -4.546f)
                curveToRelative(3.154f, -3.168f, 5.857f, -4.672f, 8.812f, -1.7f)
                curveToRelative(0.737f, 0.74f, 1.202f, 1.473f, 1.426f, 2.238f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, -1.552f, 0.457f)
                curveToRelative(-0.146f, -0.5f, -0.48f, -1.006f, -1.02f, -1.55f)
                curveToRelative(-1.602f, -1.613f, -3.053f, -1.792f, -6.53f, 1.7f)
                curveToRelative(-3.475f, 3.494f, -3.296f, 4.953f, -1.691f, 6.567f)
                curveToRelative(1.605f, 1.613f, 3.056f, 1.792f, 6.532f, -1.7f)
                curveToRelative(0.235f, -0.228f, 0.51f, -0.516f, 0.77f, -0.799f)
                close()
                moveTo(20.274f, 3.746f)
                curveToRelative(1.364f, 1.373f, 1.837f, 2.785f, 1.445f, 4.314f)
                curveToRelative(-0.336f, 1.3f, -1.302f, 2.703f, -3.137f, 4.546f)
                curveToRelative(-1.832f, 1.844f, -3.23f, 2.816f, -4.521f, 3.152f)
                curveToRelative(-0.345f, 0.09f, -0.684f, 0.134f, -1.017f, 0.134f)
                curveToRelative(-1.14f, 0.0f, -2.219f, -0.524f, -3.275f, -1.585f)
                curveToRelative(-0.669f, -0.673f, -1.112f, -1.336f, -1.358f, -2.028f)
                arcToRelative(0.808f, 0.808f, 0.0f, true, true, 1.521f, -0.543f)
                curveToRelative(0.162f, 0.459f, 0.482f, 0.924f, 0.978f, 1.425f)
                curveToRelative(1.218f, 1.224f, 2.106f, 1.193f, 2.745f, 1.028f)
                curveToRelative(0.986f, -0.255f, 2.187f, -1.123f, 3.784f, -2.728f)
                curveToRelative(1.597f, -1.605f, 2.46f, -2.815f, 2.714f, -3.807f)
                curveToRelative(0.165f, -0.641f, 0.2f, -1.532f, -1.022f, -2.76f)
                curveToRelative(-1.219f, -1.226f, -2.107f, -1.195f, -2.745f, -1.027f)
                curveToRelative(-0.986f, 0.258f, -2.188f, 1.123f, -3.787f, 2.728f)
                curveToRelative(-0.303f, 0.306f, -0.583f, 0.6f, -0.844f, 0.885f)
                arcToRelative(0.801f, 0.801f, 0.0f, false, true, -1.14f, 0.054f)
                arcToRelative(0.813f, 0.813f, 0.0f, false, true, -0.053f, -1.146f)
                curveToRelative(0.275f, -0.303f, 0.574f, -0.616f, 0.897f, -0.941f)
                curveToRelative(1.834f, -1.843f, 3.23f, -2.815f, 4.523f, -3.151f)
                curveToRelative(1.521f, -0.398f, 2.925f, 0.078f, 4.292f, 1.45f)
                close()
            }
        }
        .build()
        return _linkFilled!!
    }

private var _linkFilled: ImageVector? = null
