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

public val RegularGroup.DollarSymbolRegular: ImageVector
    get() {
        if (_dollarSymbolRegular != null) {
            return _dollarSymbolRegular!!
        }
        _dollarSymbolRegular = Builder(name = "DollarSymbolRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.807f, 17.12f)
                curveToRelative(-0.451f, 0.474f, -1.012f, 0.754f, -1.614f, 0.905f)
                verticalLineToRelative(-5.151f)
                curveToRelative(0.423f, 0.078f, 0.827f, 0.174f, 1.174f, 0.342f)
                curveToRelative(0.837f, 0.403f, 1.118f, 1.07f, 1.204f, 1.56f)
                curveToRelative(0.138f, 0.81f, -0.154f, 1.706f, -0.764f, 2.344f)
                moveTo(9.672f, 9.81f)
                curveToRelative(-0.501f, -0.538f, -0.552f, -1.171f, -0.501f, -1.608f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, 1.3f, -2.152f)
                curveToRelative(0.263f, -0.176f, 0.546f, -0.294f, 0.834f, -0.386f)
                verticalLineToRelative(4.941f)
                curveToRelative(-0.644f, -0.134f, -1.213f, -0.342f, -1.633f, -0.795f)
                moveToRelative(5.49f, 1.638f)
                curveToRelative(-0.638f, -0.305f, -1.305f, -0.45f, -1.969f, -0.552f)
                verticalLineTo(5.571f)
                curveToRelative(0.821f, 0.154f, 1.6f, 0.524f, 2.18f, 1.009f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, 1.3f, -0.107f)
                lineToRelative(0.027f, -0.033f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -0.134f, -1.37f)
                arcToRelative(6.764f, 6.764f, 0.0f, false, false, -3.373f, -1.479f)
                verticalLineToRelative(-0.616f)
                arcTo(0.96f, 0.96f, 0.0f, false, false, 12.25f, 2.0f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, false, -0.944f, 0.975f)
                verticalLineToRelative(0.672f)
                curveToRelative(-0.67f, 0.129f, -1.305f, 0.39f, -1.87f, 0.773f)
                arcToRelative(5.062f, 5.062f, 0.0f, false, false, -2.14f, 3.563f)
                curveToRelative(-0.133f, 1.205f, 0.229f, 2.334f, 1.016f, 3.18f)
                curveToRelative(0.865f, 0.93f, 1.947f, 1.257f, 2.997f, 1.44f)
                verticalLineToRelative(5.478f)
                arcToRelative(6.763f, 6.763f, 0.0f, false, true, -2.815f, -1.165f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, false, -1.294f, 0.21f)
                curveToRelative(-0.009f, 0.011f, -0.014f, 0.02f, -0.023f, 0.03f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, false, 0.233f, 1.36f)
                arcToRelative(8.57f, 8.57f, 0.0f, false, false, 3.894f, 1.534f)
                verticalLineToRelative(0.633f)
                curveToRelative(0.0f, 0.538f, 0.422f, 0.975f, 0.943f, 0.975f)
                curveToRelative(0.521f, 0.0f, 0.944f, -0.437f, 0.944f, -0.975f)
                verticalLineToRelative(-0.65f)
                arcToRelative(5.205f, 5.205f, 0.0f, false, false, 2.956f, -1.54f)
                curveToRelative(1.053f, -1.1f, 1.529f, -2.62f, 1.277f, -4.062f)
                arcToRelative(4.035f, 4.035f, 0.0f, false, false, -2.26f, -2.983f)
            }
        }
        .build()
        return _dollarSymbolRegular!!
    }

private var _dollarSymbolRegular: ImageVector? = null
