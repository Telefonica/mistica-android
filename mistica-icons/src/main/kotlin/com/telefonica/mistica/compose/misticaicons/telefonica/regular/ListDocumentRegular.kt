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

public val RegularGroup.ListDocumentRegular: ImageVector
    get() {
        if (_listDocumentRegular != null) {
            return _listDocumentRegular!!
        }
        _listDocumentRegular = Builder(name = "ListDocumentRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.217f, 8.76f)
                arcToRelative(0.802f, 0.802f, 0.0f, true, true, 0.0f, -1.603f)
                arcToRelative(0.802f, 0.802f, 0.0f, true, true, 0.0f, 1.602f)
                close()
                moveTo(8.222f, 11.238f)
                arcToRelative(0.802f, 0.802f, 0.0f, true, true, 0.0f, 1.603f)
                arcToRelative(0.802f, 0.802f, 0.0f, true, true, 0.0f, -1.603f)
                close()
                moveTo(10.948f, 8.611f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.605f, -0.602f)
                curveToRelative(0.0f, -0.334f, 0.271f, -0.603f, 0.605f, -0.603f)
                horizontalLineToRelative(5.563f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 0.0f, 1.204f)
                lineToRelative(-5.563f, 0.001f)
                close()
                moveTo(16.592f, 11.437f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 0.0f, 1.204f)
                horizontalLineToRelative(-5.563f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.605f, -0.601f)
                curveToRelative(0.0f, -0.334f, 0.272f, -0.603f, 0.605f, -0.603f)
                horizontalLineToRelative(5.563f)
                close()
                moveTo(8.222f, 15.25f)
                arcToRelative(0.802f, 0.802f, 0.0f, true, true, 0.0f, 1.602f)
                arcToRelative(0.802f, 0.802f, 0.0f, true, true, 0.0f, -1.602f)
                close()
                moveTo(16.592f, 15.449f)
                curveToRelative(0.333f, 0.0f, 0.605f, 0.268f, 0.605f, 0.602f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.605f, 0.602f)
                horizontalLineToRelative(-5.563f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.605f, -0.602f)
                curveToRelative(0.0f, -0.334f, 0.272f, -0.602f, 0.605f, -0.602f)
                horizontalLineToRelative(5.563f)
                close()
                moveTo(18.175f, 20.255f)
                lineTo(18.175f, 3.751f)
                curveToRelative(0.0f, -0.193f, -0.146f, -0.367f, -0.208f, -0.39f)
                lineToRelative(-11.955f, 0.003f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, -0.185f, 0.387f)
                verticalLineToRelative(16.504f)
                curveToRelative(0.0f, 0.205f, 0.132f, 0.364f, 0.19f, 0.387f)
                horizontalLineToRelative(11.976f)
                curveToRelative(0.044f, -0.014f, 0.182f, -0.168f, 0.182f, -0.387f)
                close()
                moveTo(17.993f, 2.16f)
                curveToRelative(0.728f, 0.0f, 1.392f, 0.76f, 1.392f, 1.591f)
                verticalLineToRelative(16.504f)
                curveToRelative(0.0f, 0.863f, -0.639f, 1.591f, -1.392f, 1.591f)
                lineTo(6.013f, 21.846f)
                curveToRelative(-0.757f, 0.0f, -1.393f, -0.728f, -1.393f, -1.59f)
                lineTo(4.62f, 3.75f)
                curveToRelative(0.0f, -0.832f, 0.664f, -1.591f, 1.392f, -1.591f)
                horizontalLineToRelative(11.98f)
                close()
            }
        }
        .build()
        return _listDocumentRegular!!
    }

private var _listDocumentRegular: ImageVector? = null
