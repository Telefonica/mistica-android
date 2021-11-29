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

public val FilledGroup.TagFilled: ImageVector
    get() {
        if (_tagFilled != null) {
            return _tagFilled!!
        }
        _tagFilled = Builder(name = "TagFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.686f, 3.339f)
                arcTo(1.349f, 1.349f, 0.0f, false, false, 20.344f, 2.0f)
                lineTo(12.0f, 2.0f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -1.062f, 0.597f)
                lineToRelative(-8.336f, 8.327f)
                arcToRelative(1.553f, 1.553f, 0.0f, false, false, -0.291f, 2.157f)
                lineToRelative(8.288f, 8.27f)
                curveToRelative(0.219f, 0.218f, 0.519f, 0.338f, 0.83f, 0.33f)
                curveToRelative(0.09f, 0.008f, 0.182f, 0.008f, 0.274f, 0.0f)
                curveToRelative(0.415f, -0.101f, 0.787f, -0.334f, 1.062f, -0.661f)
                lineToRelative(8.327f, -8.27f)
                curveToRelative(0.309f, -0.296f, 0.513f, -0.68f, 0.589f, -1.1f)
                lineTo(21.681f, 3.342f)
                horizontalLineToRelative(0.005f)
                verticalLineToRelative(-0.003f)
                close()
                moveTo(15.115f, 6.647f)
                curveToRelative(0.03f, -0.42f, 0.227f, -0.815f, 0.546f, -1.092f)
                curveToRelative(0.28f, -0.325f, 0.68f, -0.519f, 1.11f, -0.538f)
                curveToRelative(0.436f, 0.028f, 0.845f, 0.227f, 1.134f, 0.554f)
                curveToRelative(0.33f, 0.289f, 0.532f, 0.695f, 0.563f, 1.132f)
                curveToRelative(-0.025f, 0.42f, -0.219f, 0.81f, -0.538f, 1.084f)
                arcToRelative(1.605f, 1.605f, 0.0f, false, true, -1.118f, 0.546f)
                arcToRelative(1.648f, 1.648f, 0.0f, false, true, -1.134f, -0.546f)
                arcToRelative(1.646f, 1.646f, 0.0f, false, true, -0.563f, -1.118f)
                verticalLineToRelative(-0.022f)
                close()
            }
        }
        .build()
        return _tagFilled!!
    }

private var _tagFilled: ImageVector? = null
