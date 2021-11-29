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

public val LightGroup.DocumentsLight: ImageVector
    get() {
        if (_documentsLight != null) {
            return _documentsLight!!
        }
        _documentsLight = Builder(name = "DocumentsLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.193f, 20.78f)
                curveToRelative(0.0f, 0.119f, -0.132f, 0.239f, -0.263f, 0.239f)
                lineTo(9.733f, 21.019f)
                curveToRelative(-0.131f, 0.0f, -0.252f, -0.14f, -0.252f, -0.238f)
                lineTo(9.481f, 6.59f)
                curveToRelative(0.0f, -0.09f, 0.14f, -0.239f, 0.252f, -0.239f)
                lineTo(15.3f, 6.351f)
                lineTo(15.3f, 8.31f)
                curveToRelative(0.0f, 0.807f, 0.28f, 1.505f, 0.804f, 2.009f)
                curveToRelative(0.524f, 0.51f, 1.23f, 0.773f, 2.059f, 0.773f)
                horizontalLineToRelative(2.03f)
                verticalLineToRelative(9.689f)
                close()
                moveTo(8.66f, 6.59f)
                verticalLineToRelative(10.457f)
                lineTo(4.025f, 17.047f)
                curveToRelative(-0.107f, 0.0f, -0.238f, -0.132f, -0.238f, -0.213f)
                lineTo(3.787f, 3.193f)
                curveToRelative(0.0f, -0.09f, 0.123f, -0.216f, 0.238f, -0.216f)
                horizontalLineToRelative(9.806f)
                curveToRelative(0.115f, 0.0f, 0.239f, 0.106f, 0.239f, 0.216f)
                verticalLineToRelative(2.336f)
                lineTo(9.733f, 5.529f)
                curveToRelative(-0.565f, 0.0f, -1.072f, 0.51f, -1.072f, 1.061f)
                close()
                moveTo(16.119f, 6.599f)
                lineTo(19.917f, 10.269f)
                horizontalLineToRelative(-1.756f)
                curveToRelative(-0.608f, 0.0f, -1.123f, -0.183f, -1.482f, -0.536f)
                curveToRelative(-0.361f, -0.353f, -0.557f, -0.846f, -0.557f, -1.423f)
                lineTo(16.122f, 6.6f)
                horizontalLineToRelative(-0.003f)
                close()
                moveTo(20.996f, 10.358f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.18f, -0.353f)
                lineToRelative(-4.434f, -4.294f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, false, -0.361f, -0.171f)
                curveToRelative(-0.025f, -0.008f, -0.05f, -0.008f, -0.081f, -0.008f)
                horizontalLineToRelative(-1.05f)
                verticalLineToRelative(-2.34f)
                curveToRelative(0.0f, -0.56f, -0.485f, -1.036f, -1.06f, -1.036f)
                lineTo(4.028f, 2.156f)
                curveToRelative(-0.558f, 0.0f, -1.06f, 0.488f, -1.06f, 1.037f)
                lineTo(2.968f, 16.83f)
                curveToRelative(0.0f, 0.544f, 0.51f, 1.037f, 1.06f, 1.037f)
                lineTo(8.66f, 17.867f)
                verticalLineToRelative(2.913f)
                curveToRelative(0.0f, 0.56f, 0.501f, 1.062f, 1.072f, 1.062f)
                horizontalLineToRelative(10.2f)
                curveToRelative(0.582f, 0.0f, 1.08f, -0.496f, 1.08f, -1.062f)
                lineTo(21.012f, 10.456f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, false, -0.016f, -0.098f)
                close()
            }
        }
        .build()
        return _documentsLight!!
    }

private var _documentsLight: ImageVector? = null
