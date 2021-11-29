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

public val RegularGroup.ShieldCheckedOkRegular: ImageVector
    get() {
        if (_shieldCheckedOkRegular != null) {
            return _shieldCheckedOkRegular!!
        }
        _shieldCheckedOkRegular = Builder(name = "ShieldCheckedOkRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.28f, 14.294f)
                curveToRelative(0.364f, -2.134f, 0.423f, -6.75f, 0.431f, -8.479f)
                curveToRelative(-1.68f, 0.081f, -2.733f, -0.613f, -3.75f, -1.294f)
                curveToRelative(-1.009f, -0.675f, -1.961f, -1.314f, -3.667f, -1.317f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(-1.705f, 0.0f, -2.658f, 0.64f, -3.669f, 1.317f)
                curveToRelative(-1.014f, 0.678f, -2.056f, 1.373f, -3.748f, 1.294f)
                curveToRelative(0.009f, 1.728f, 0.067f, 6.345f, 0.437f, 8.48f)
                curveToRelative(0.412f, 2.386f, 4.958f, 5.108f, 6.983f, 6.12f)
                curveToRelative(2.028f, -1.012f, 6.58f, -3.74f, 6.99f, -6.12f)
                close()
                moveTo(20.905f, 5.14f)
                curveToRelative(0.0f, 0.269f, 0.02f, 6.616f, -0.448f, 9.361f)
                curveToRelative(-0.622f, 3.611f, -7.611f, 6.986f, -7.908f, 7.13f)
                arcToRelative(0.582f, 0.582f, 0.0f, false, true, -0.51f, -0.004f)
                curveToRelative(-0.297f, -0.14f, -7.28f, -3.518f, -7.902f, -7.126f)
                curveToRelative(-0.476f, -2.745f, -0.46f, -9.092f, -0.456f, -9.361f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, 0.74f, -0.583f)
                curveToRelative(1.613f, 0.255f, 2.464f, -0.319f, 3.543f, -1.042f)
                curveTo(9.025f, 2.804f, 10.227f, 2.0f, 12.29f, 2.0f)
                horizontalLineToRelative(0.009f)
                curveToRelative(2.064f, 0.003f, 3.263f, 0.807f, 4.325f, 1.518f)
                curveToRelative(1.078f, 0.723f, 1.932f, 1.294f, 3.565f, 1.04f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, true, 0.715f, 0.582f)
                close()
                moveTo(10.804f, 13.725f)
                lineTo(15.787f, 8.683f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, true, 0.843f, 0.0f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, 0.0f, 0.852f)
                lineToRelative(-5.403f, 5.468f)
                arcToRelative(0.591f, 0.591f, 0.0f, false, true, -0.84f, 0.0f)
                lineTo(7.96f, 12.546f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, 0.0f, -0.851f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, true, 0.843f, 0.0f)
                lineToRelative(2.0f, 2.03f)
                close()
            }
        }
        .build()
        return _shieldCheckedOkRegular!!
    }

private var _shieldCheckedOkRegular: ImageVector? = null
