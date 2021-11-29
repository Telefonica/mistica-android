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

public val FilledGroup.MicrochipFilled: ImageVector
    get() {
        if (_microchipFilled != null) {
            return _microchipFilled!!
        }
        _microchipFilled = Builder(name = "MicrochipFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.236f, 12.614f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, 0.0f, -1.21f)
                horizontalLineToRelative(-2.77f)
                verticalLineToRelative(-1.21f)
                horizontalLineToRelative(2.77f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, false, 0.0f, -1.213f)
                horizontalLineToRelative(-2.77f)
                verticalLineTo(6.614f)
                curveToRelative(0.0f, -0.555f, -0.527f, -1.059f, -1.107f, -1.059f)
                horizontalLineToRelative(-2.325f)
                verticalLineToRelative(-2.79f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, false, -1.213f, 0.0f)
                verticalLineToRelative(2.784f)
                horizontalLineToRelative(-1.21f)
                verticalLineTo(2.768f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, false, -1.21f, 0.0f)
                verticalLineToRelative(2.784f)
                horizontalLineToRelative(-1.21f)
                verticalLineTo(2.768f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, false, -1.21f, 0.0f)
                verticalLineToRelative(2.784f)
                horizontalLineTo(6.653f)
                curveToRelative(-0.58f, 0.0f, -1.106f, 0.504f, -1.106f, 1.059f)
                verticalLineToRelative(2.367f)
                horizontalLineTo(2.765f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, false, 0.0f, 1.213f)
                horizontalLineToRelative(2.779f)
                verticalLineToRelative(1.21f)
                horizontalLineTo(2.765f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, 0.0f, 1.21f)
                horizontalLineToRelative(2.779f)
                verticalLineToRelative(1.21f)
                horizontalLineTo(2.765f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, false, 0.0f, 1.213f)
                horizontalLineToRelative(2.779f)
                verticalLineToRelative(2.392f)
                curveToRelative(0.0f, 0.558f, 0.515f, 1.05f, 1.106f, 1.05f)
                horizontalLineToRelative(2.328f)
                verticalLineToRelative(2.762f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, 1.21f, 0.0f)
                verticalLineToRelative(-2.761f)
                horizontalLineToRelative(1.21f)
                verticalLineToRelative(2.761f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, false, 1.213f, 0.0f)
                verticalLineToRelative(-2.761f)
                horizontalLineToRelative(1.21f)
                verticalLineToRelative(2.761f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, 1.21f, 0.0f)
                verticalLineToRelative(-2.761f)
                horizontalLineToRelative(2.325f)
                curveToRelative(0.591f, 0.0f, 1.107f, -0.49f, 1.107f, -1.05f)
                verticalLineToRelative(-2.393f)
                horizontalLineToRelative(2.77f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, false, 0.0f, -1.213f)
                horizontalLineToRelative(-2.77f)
                verticalLineToRelative(-1.21f)
                lineToRelative(2.773f, 0.003f)
                close()
            }
        }
        .build()
        return _microchipFilled!!
    }

private var _microchipFilled: ImageVector? = null
