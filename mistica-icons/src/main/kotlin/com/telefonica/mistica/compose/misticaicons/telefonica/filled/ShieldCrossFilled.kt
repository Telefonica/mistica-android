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

public val FilledGroup.ShieldCrossFilled: ImageVector
    get() {
        if (_shieldCrossFilled != null) {
            return _shieldCrossFilled!!
        }
        _shieldCrossFilled = Builder(name = "ShieldCrossFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.434f, 4.56f)
                curveToRelative(1.602f, 0.258f, 2.454f, -0.322f, 3.527f, -1.053f)
                curveTo(8.913f, 2.86f, 9.983f, 2.143f, 11.683f, 2.0f)
                verticalLineToRelative(9.045f)
                lineTo(3.81f, 11.045f)
                curveToRelative(-0.14f, -2.76f, -0.132f, -5.703f, -0.132f, -5.885f)
                curveToRelative(0.0f, -0.19f, 0.087f, -0.37f, 0.232f, -0.49f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 0.524f, -0.11f)
                close()
                moveTo(20.904f, 5.162f)
                curveToRelative(0.0f, 0.183f, 0.01f, 3.127f, -0.128f, 5.886f)
                horizontalLineToRelative(-7.877f)
                lineTo(12.899f, 2.0f)
                curveToRelative(1.7f, 0.143f, 2.77f, 0.86f, 3.723f, 1.507f)
                curveToRelative(1.075f, 0.731f, 1.933f, 1.303f, 3.552f, 1.048f)
                arcToRelative(0.636f, 0.636f, 0.0f, false, true, 0.725f, 0.529f)
                curveToRelative(0.0f, 0.028f, 0.003f, 0.053f, 0.006f, 0.078f)
                close()
                moveTo(12.9f, 21.686f)
                verticalLineToRelative(-9.395f)
                horizontalLineToRelative(7.804f)
                curveToRelative(-0.062f, 0.891f, -0.14f, 1.715f, -0.246f, 2.345f)
                verticalLineToRelative(0.003f)
                curveToRelative(-0.558f, 3.271f, -6.014f, 6.263f, -7.558f, 7.047f)
                close()
                moveTo(4.138f, 14.636f)
                curveToRelative(-0.109f, -0.63f, -0.187f, -1.454f, -0.252f, -2.347f)
                horizontalLineToRelative(7.801f)
                verticalLineToRelative(9.394f)
                curveToRelative(-1.543f, -0.781f, -6.994f, -3.773f, -7.549f, -7.047f)
                close()
            }
        }
        .build()
        return _shieldCrossFilled!!
    }

private var _shieldCrossFilled: ImageVector? = null
