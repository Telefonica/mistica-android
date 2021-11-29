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

public val RegularGroup.TagRegular: ImageVector
    get() {
        if (_tagRegular != null) {
            return _tagRegular!!
        }
        _tagRegular = Builder(name = "TagRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.146f, 11.989f)
                curveToRelative(0.15f, -0.152f, 0.254f, -0.328f, 0.277f, -0.476f)
                lineToRelative(-0.009f, -0.185f)
                lineToRelative(0.009f, -7.796f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, false, -0.272f, -0.269f)
                horizontalLineToRelative(-8.008f)
                curveToRelative(-0.11f, 0.026f, -0.294f, 0.132f, -0.443f, 0.283f)
                lineTo(3.555f, 11.69f)
                curveToRelative(-0.292f, 0.291f, -0.314f, 0.594f, -0.28f, 0.644f)
                lineToRelative(8.075f, 8.073f)
                curveToRelative(0.056f, 0.042f, 0.367f, 0.011f, 0.65f, -0.274f)
                lineToRelative(8.146f, -8.143f)
                close()
                moveTo(21.686f, 3.535f)
                lineTo(21.681f, 11.311f)
                lineTo(21.686f, 11.521f)
                curveToRelative(0.0f, 0.028f, -0.005f, 0.12f, -0.008f, 0.148f)
                curveToRelative(-0.079f, 0.463f, -0.3f, 0.888f, -0.636f, 1.213f)
                lineToRelative(-8.148f, 8.143f)
                curveToRelative(-0.435f, 0.434f, -0.97f, 0.661f, -1.463f, 0.661f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, true, -0.974f, -0.386f)
                lineTo(2.38f, 13.227f)
                curveToRelative(-0.314f, -0.314f, -0.443f, -0.779f, -0.353f, -1.275f)
                curveToRelative(0.078f, -0.414f, 0.3f, -0.826f, 0.63f, -1.157f)
                lineToRelative(8.149f, -8.142f)
                curveToRelative(0.336f, -0.336f, 0.745f, -0.56f, 1.157f, -0.636f)
                curveToRelative(0.02f, -0.006f, 0.109f, -0.014f, 0.126f, -0.014f)
                lineTo(20.15f, 2.0f)
                curveToRelative(0.846f, 0.0f, 1.532f, 0.69f, 1.535f, 1.535f)
                close()
                moveTo(17.633f, 7.762f)
                curveToRelative(0.625f, -0.625f, 0.619f, -1.238f, -0.017f, -1.877f)
                curveToRelative(-0.322f, -0.322f, -0.638f, -0.484f, -0.952f, -0.484f)
                curveToRelative(-0.308f, 0.0f, -0.616f, 0.156f, -0.925f, 0.465f)
                curveToRelative(-0.624f, 0.624f, -0.619f, 1.238f, 0.017f, 1.876f)
                curveToRelative(0.636f, 0.639f, 1.25f, 0.647f, 1.877f, 0.02f)
                close()
                moveTo(14.843f, 4.975f)
                curveToRelative(1.123f, -1.123f, 2.53f, -1.118f, 3.664f, 0.02f)
                curveToRelative(1.137f, 1.137f, 1.143f, 2.54f, 0.02f, 3.663f)
                curveToRelative(-0.56f, 0.56f, -1.188f, 0.84f, -1.818f, 0.84f)
                curveToRelative(-0.639f, 0.0f, -1.275f, -0.285f, -1.846f, -0.857f)
                curveToRelative(-1.138f, -1.137f, -1.146f, -2.543f, -0.02f, -3.666f)
                close()
            }
        }
        .build()
        return _tagRegular!!
    }

private var _tagRegular: ImageVector? = null
