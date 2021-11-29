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

public val FilledGroup.ShieldCheckedOkFilled: ImageVector
    get() {
        if (_shieldCheckedOkFilled != null) {
            return _shieldCheckedOkFilled!!
        }
        _shieldCheckedOkFilled = Builder(name = "ShieldCheckedOkFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.603f, 5.14f)
                curveToRelative(0.0f, 0.269f, 0.016f, 6.616f, -0.449f, 9.361f)
                curveToRelative(-0.621f, 3.611f, -7.613f, 6.986f, -7.91f, 7.126f)
                arcToRelative(0.601f, 0.601f, 0.0f, false, true, -0.51f, 0.0f)
                curveToRelative(-0.297f, -0.142f, -7.28f, -3.518f, -7.902f, -7.128f)
                curveToRelative(-0.476f, -2.746f, -0.459f, -9.093f, -0.456f, -9.362f)
                arcToRelative(0.595f, 0.595f, 0.0f, false, true, 0.74f, -0.583f)
                curveToRelative(1.613f, 0.256f, 2.464f, -0.319f, 3.543f, -1.041f)
                curveTo(8.72f, 2.807f, 9.922f, 2.0f, 11.986f, 2.0f)
                horizontalLineToRelative(0.006f)
                curveToRelative(2.064f, 0.003f, 3.263f, 0.807f, 4.325f, 1.518f)
                curveToRelative(1.078f, 0.723f, 1.933f, 1.294f, 3.566f, 1.037f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.711f, 0.51f)
                lineToRelative(0.009f, 0.075f)
                close()
                moveTo(10.502f, 13.725f)
                lineTo(8.496f, 11.697f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, false, -0.835f, -0.008f)
                lineToRelative(-0.008f, 0.008f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, false, 0.0f, 0.852f)
                lineToRelative(2.429f, 2.457f)
                curveToRelative(0.23f, 0.232f, 0.607f, 0.232f, 0.837f, 0.002f)
                lineToRelative(0.003f, -0.002f)
                lineToRelative(5.406f, -5.468f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, false, 0.0f, -0.852f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, false, -0.835f, -0.008f)
                lineToRelative(-0.008f, 0.008f)
                curveToRelative(-0.003f, -0.003f, -4.983f, 5.04f, -4.983f, 5.04f)
                close()
            }
        }
        .build()
        return _shieldCheckedOkFilled!!
    }

private var _shieldCheckedOkFilled: ImageVector? = null
