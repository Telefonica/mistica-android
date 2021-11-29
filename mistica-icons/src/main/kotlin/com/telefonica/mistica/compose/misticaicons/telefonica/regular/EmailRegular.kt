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

public val RegularGroup.EmailRegular: ImageVector
    get() {
        if (_emailRegular != null) {
            return _emailRegular!!
        }
        _emailRegular = Builder(name = "EmailRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.502f, 17.527f)
                curveToRelative(-0.154f, 0.182f, -0.471f, 0.224f, -0.706f, 0.23f)
                curveToRelative(-1.513f, 0.025f, -15.762f, -0.003f, -15.92f, 0.0f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.296f, -0.138f)
                curveToRelative(-0.18f, -0.173f, -0.216f, -0.495f, -0.216f, -0.733f)
                verticalLineTo(8.174f)
                lineToRelative(6.832f, 4.294f)
                curveToRelative(0.042f, 0.031f, 0.723f, 0.513f, 1.661f, 0.513f)
                curveToRelative(0.47f, 0.0f, 1.009f, -0.123f, 1.563f, -0.485f)
                lineToRelative(7.216f, -4.347f)
                lineToRelative(-0.011f, 8.737f)
                lineToRelative(0.008f, 0.095f)
                curveToRelative(-0.003f, 0.003f, 0.045f, 0.342f, -0.131f, 0.546f)
                moveTo(3.888f, 6.217f)
                lineToRelative(16.263f, 0.002f)
                curveToRelative(0.014f, 0.0f, 0.342f, 0.011f, 0.451f, 0.552f)
                lineToRelative(-7.826f, 4.717f)
                curveToRelative(-0.966f, 0.63f, -1.835f, 0.039f, -1.9f, -0.009f)
                lineToRelative(-7.49f, -4.708f)
                curveToRelative(0.026f, -0.163f, 0.08f, -0.342f, 0.18f, -0.448f)
                curveToRelative(0.05f, -0.048f, 0.132f, -0.107f, 0.322f, -0.107f)
                moveToRelative(17.941f, 10.63f)
                lineToRelative(0.014f, -9.776f)
                curveToRelative(-0.045f, -1.711f, -1.224f, -2.075f, -1.706f, -2.047f)
                lineTo(3.891f, 5.02f)
                curveToRelative(-0.482f, 0.0f, -0.9f, 0.168f, -1.202f, 0.487f)
                curveToRelative(-0.571f, 0.6f, -0.532f, 1.51f, -0.526f, 1.577f)
                verticalLineToRelative(9.799f)
                curveToRelative(0.0f, 0.68f, 0.193f, 1.215f, 0.577f, 1.588f)
                curveToRelative(0.49f, 0.476f, 1.103f, 0.493f, 1.15f, 0.479f)
                curveToRelative(0.387f, 0.0f, 6.52f, 0.014f, 11.093f, 0.014f)
                curveToRelative(2.367f, 0.0f, 4.317f, -0.003f, 4.835f, -0.014f)
                curveToRelative(0.89f, -0.014f, 1.373f, -0.373f, 1.62f, -0.667f)
                curveToRelative(0.453f, -0.549f, 0.42f, -1.221f, 0.391f, -1.437f)
            }
        }
        .build()
        return _emailRegular!!
    }

private var _emailRegular: ImageVector? = null
