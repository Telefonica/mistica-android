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

public val FilledGroup.PoundSymbolCircleFilled: ImageVector
    get() {
        if (_poundSymbolCircleFilled != null) {
            return _poundSymbolCircleFilled!!
        }
        _poundSymbolCircleFilled = Builder(name = "PoundSymbolCircleFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.16f)
                curveToRelative(6.44f, 0.0f, 9.846f, 3.403f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.437f, -3.403f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.44f, 0.0f, -9.84f, -3.403f, -9.84f, -9.84f)
                curveTo(2.16f, 5.563f, 5.563f, 2.16f, 12.0f, 2.16f)
                close()
                moveTo(14.843f, 16.547f)
                horizontalLineToRelative(-4.711f)
                curveToRelative(0.818f, -0.872f, 1.115f, -1.628f, 1.115f, -2.69f)
                curveToRelative(0.0f, -0.498f, -0.067f, -1.016f, -0.2f, -1.54f)
                horizontalLineToRelative(2.11f)
                curveToRelative(0.224f, 0.0f, 0.404f, -0.18f, 0.404f, -0.404f)
                verticalLineToRelative(-0.397f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, false, -0.404f, -0.404f)
                horizontalLineToRelative(-2.482f)
                curveToRelative(-0.17f, -0.571f, -0.325f, -1.218f, -0.325f, -1.86f)
                curveToRelative(0.0f, -1.456f, 0.765f, -2.134f, 2.404f, -2.134f)
                curveToRelative(0.524f, 0.0f, 1.187f, 0.073f, 1.871f, 0.202f)
                arcToRelative(0.402f, 0.402f, 0.0f, false, false, 0.476f, -0.398f)
                verticalLineToRelative(-0.364f)
                arcToRelative(0.406f, 0.406f, 0.0f, false, false, -0.283f, -0.387f)
                curveToRelative(-0.728f, -0.224f, -1.652f, -0.305f, -2.224f, -0.305f)
                curveToRelative(-2.252f, 0.0f, -3.54f, 1.238f, -3.54f, 3.4f)
                curveToRelative(0.0f, 0.71f, 0.142f, 1.387f, 0.302f, 1.93f)
                lineToRelative(-0.661f, 0.045f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, false, -0.375f, 0.404f)
                verticalLineToRelative(0.271f)
                curveToRelative(0.0f, 0.224f, 0.179f, 0.404f, 0.403f, 0.404f)
                horizontalLineToRelative(0.997f)
                curveToRelative(0.168f, 0.563f, 0.244f, 1.044f, 0.244f, 1.526f)
                curveToRelative(0.0f, 0.745f, -0.171f, 1.342f, -1.04f, 2.182f)
                curveToRelative(-0.464f, 0.446f, -0.697f, 0.673f, -0.697f, 1.118f)
                curveToRelative(0.0f, 0.16f, 0.031f, 0.302f, 0.093f, 0.423f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.358f, 0.218f)
                horizontalLineToRelative(6.168f)
                curveToRelative(0.222f, 0.0f, 0.404f, -0.179f, 0.404f, -0.403f)
                verticalLineToRelative(-0.431f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, -0.407f, -0.406f)
                close()
            }
        }
        .build()
        return _poundSymbolCircleFilled!!
    }

private var _poundSymbolCircleFilled: ImageVector? = null
