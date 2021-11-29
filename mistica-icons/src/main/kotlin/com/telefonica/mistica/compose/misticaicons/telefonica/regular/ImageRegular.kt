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

public val RegularGroup.ImageRegular: ImageVector
    get() {
        if (_imageRegular != null) {
            return _imageRegular!!
        }
        _imageRegular = Builder(name = "ImageRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.245f, 18.08f)
                curveToRelative(0.193f, 0.0f, 0.367f, -0.146f, 0.39f, -0.207f)
                lineToRelative(-0.003f, -11.956f)
                arcToRelative(0.555f, 0.555f, 0.0f, false, false, -0.384f, -0.182f)
                lineTo(3.741f, 5.735f)
                curveToRelative(-0.21f, 0.0f, -0.364f, 0.132f, -0.387f, 0.19f)
                verticalLineToRelative(11.973f)
                curveToRelative(0.014f, 0.045f, 0.171f, 0.182f, 0.387f, 0.182f)
                horizontalLineToRelative(16.504f)
                close()
                moveTo(20.245f, 4.522f)
                curveToRelative(0.832f, 0.0f, 1.591f, 0.664f, 1.591f, 1.393f)
                verticalLineToRelative(11.98f)
                curveToRelative(0.0f, 0.728f, -0.759f, 1.392f, -1.59f, 1.392f)
                lineTo(3.74f, 19.287f)
                curveToRelative(-0.863f, 0.0f, -1.591f, -0.639f, -1.591f, -1.392f)
                lineTo(2.149f, 5.915f)
                curveToRelative(0.0f, -0.754f, 0.728f, -1.393f, 1.591f, -1.393f)
                horizontalLineToRelative(16.504f)
                close()
                moveTo(7.15f, 7.962f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, 0.0f, 2.011f)
                arcToRelative(1.006f, 1.006f, 0.0f, false, false, 0.0f, -2.01f)
                close()
                moveTo(7.15f, 11.183f)
                arcToRelative(2.216f, 2.216f, 0.0f, false, true, 0.0f, -4.43f)
                curveToRelative(1.218f, 0.0f, 2.207f, 0.993f, 2.207f, 2.215f)
                arcToRelative(2.213f, 2.213f, 0.0f, false, true, -2.207f, 2.215f)
                close()
                moveTo(16.39f, 10.08f)
                lineTo(19.57f, 12.52f)
                arcToRelative(0.609f, 0.609f, 0.0f, false, true, 0.112f, 0.848f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, -0.846f, 0.112f)
                lineToRelative(-2.806f, -2.154f)
                lineToRelative(-3.132f, 2.496f)
                lineToRelative(1.933f, 1.824f)
                curveToRelative(0.24f, 0.227f, 0.255f, 0.61f, 0.025f, 0.854f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, -0.852f, 0.025f)
                lineToRelative(-3.308f, -3.123f)
                lineToRelative(-4.759f, 3.975f)
                arcToRelative(0.598f, 0.598f, 0.0f, false, true, -0.849f, -0.078f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, 0.079f, -0.852f)
                lineToRelative(5.168f, -4.317f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.798f, 0.025f)
                lineToRelative(0.88f, 0.83f)
                lineToRelative(3.636f, -2.9f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, 0.742f, -0.005f)
                close()
            }
        }
        .build()
        return _imageRegular!!
    }

private var _imageRegular: ImageVector? = null
