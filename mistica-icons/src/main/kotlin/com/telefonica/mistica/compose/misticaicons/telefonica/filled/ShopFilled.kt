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

public val FilledGroup.ShopFilled: ImageVector
    get() {
        if (_shopFilled != null) {
            return _shopFilled!!
        }
        _shopFilled = Builder(name = "ShopFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.406f, 13.064f)
                curveToRelative(0.65f, 0.365f, 1.448f, 0.566f, 2.275f, 0.566f)
                curveToRelative(0.647f, 0.0f, 1.243f, -0.131f, 1.773f, -0.342f)
                verticalLineToRelative(6.788f)
                curveToRelative(0.0f, 0.888f, -0.68f, 1.61f, -1.516f, 1.61f)
                horizontalLineToRelative(-4.467f)
                verticalLineToRelative(-5.644f)
                curveToRelative(0.0f, -0.68f, -0.493f, -1.233f, -1.098f, -1.233f)
                horizontalLineToRelative(-3.037f)
                curveToRelative(-0.608f, 0.0f, -1.098f, 0.552f, -1.098f, 1.233f)
                verticalLineToRelative(5.644f)
                lineTo(4.745f, 21.686f)
                curveToRelative(-0.837f, 0.0f, -1.515f, -0.722f, -1.515f, -1.61f)
                verticalLineToRelative(-6.788f)
                curveToRelative(0.53f, 0.213f, 1.126f, 0.342f, 1.773f, 0.342f)
                curveToRelative(0.835f, 0.0f, 1.638f, -0.204f, 2.288f, -0.574f)
                curveToRelative(0.65f, 0.367f, 1.454f, 0.574f, 2.289f, 0.574f)
                curveToRelative(0.622f, 0.0f, 1.235f, -0.115f, 1.781f, -0.33f)
                curveToRelative(0.174f, -0.07f, 0.34f, -0.149f, 0.493f, -0.236f)
                curveToRelative(0.65f, 0.365f, 1.448f, 0.566f, 2.278f, 0.566f)
                curveToRelative(0.829f, 0.0f, 1.627f, -0.201f, 2.274f, -0.566f)
                close()
                moveTo(21.174f, 9.471f)
                curveToRelative(0.327f, 0.333f, 0.512f, 0.756f, 0.512f, 1.198f)
                curveToRelative(0.0f, 1.2f, -1.32f, 2.14f, -3.003f, 2.14f)
                curveToRelative(-0.888f, 0.0f, -1.711f, -0.271f, -2.274f, -0.733f)
                curveToRelative(-0.56f, 0.462f, -1.387f, 0.734f, -2.277f, 0.734f)
                curveToRelative(-0.888f, 0.0f, -1.712f, -0.272f, -2.275f, -0.734f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.798f, 0.462f)
                curveToRelative(-0.446f, 0.18f, -0.958f, 0.272f, -1.476f, 0.272f)
                curveToRelative(-0.897f, 0.0f, -1.723f, -0.272f, -2.289f, -0.746f)
                curveToRelative(-0.56f, 0.471f, -1.392f, 0.746f, -2.288f, 0.746f)
                curveToRelative(-1.684f, 0.0f, -3.003f, -0.942f, -3.003f, -2.14f)
                curveToRelative(0.0f, -0.426f, 0.19f, -0.726f, 0.344f, -0.967f)
                curveToRelative(0.062f, -0.098f, 0.126f, -0.196f, 0.174f, -0.308f)
                curveToRelative(0.098f, -0.227f, 0.857f, -2.684f, 1.415f, -4.479f)
                curveToRelative(0.274f, -0.885f, 0.529f, -1.709f, 0.703f, -2.26f)
                arcToRelative(0.903f, 0.903f, 0.0f, false, true, 0.851f, -0.62f)
                lineTo(18.188f, 2.0f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.395f, 0.0f, 0.737f, 0.25f, 0.858f, 0.622f)
                lineToRelative(1.26f, 4.003f)
                curveToRelative(0.05f, 0.154f, 0.126f, 0.434f, 0.216f, 0.759f)
                curveToRelative(0.168f, 0.61f, 0.518f, 1.88f, 0.65f, 2.087f)
                close()
            }
        }
        .build()
        return _shopFilled!!
    }

private var _shopFilled: ImageVector? = null
