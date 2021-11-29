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

public val FilledGroup.KeyFilled: ImageVector
    get() {
        if (_keyFilled != null) {
            return _keyFilled!!
        }
        _keyFilled = Builder(name = "KeyFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.715f, 11.66f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, true, 0.131f, 0.302f)
                arcToRelative(0.428f, 0.428f, 0.0f, false, true, -0.129f, 0.308f)
                lineToRelative(-1.94f, 1.86f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, -0.583f, -0.009f)
                lineToRelative(-1.25f, -1.255f)
                lineToRelative(-0.73f, 1.18f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.334f, 0.196f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, true, -0.35f, -0.163f)
                lineToRelative(-0.902f, -1.173f)
                lineToRelative(-0.801f, 1.156f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, true, -0.342f, 0.18f)
                horizontalLineToRelative(-4.65f)
                lineToRelative(-0.062f, 0.137f)
                curveToRelative(-0.563f, 1.126f, -1.784f, 1.723f, -3.532f, 1.723f)
                curveToRelative(-2.633f, 0.0f, -4.081f, -1.457f, -4.081f, -4.101f)
                reflectiveCurveTo(3.608f, 7.9f, 6.241f, 7.9f)
                curveToRelative(2.104f, 0.0f, 3.101f, 0.922f, 3.572f, 1.79f)
                horizontalLineToRelative(9.638f)
                curveToRelative(0.107f, 0.0f, 0.208f, 0.04f, 0.286f, 0.112f)
                lineToRelative(1.978f, 1.857f)
                close()
                moveTo(5.74f, 12.703f)
                curveToRelative(-0.502f, 0.0f, -0.698f, -0.196f, -0.698f, -0.7f)
                curveToRelative(0.0f, -0.505f, 0.194f, -0.7f, 0.698f, -0.7f)
                reflectiveCurveToRelative(0.697f, 0.195f, 0.697f, 0.7f)
                curveToRelative(0.0f, 0.504f, -0.196f, 0.7f, -0.697f, 0.7f)
                close()
                moveTo(5.74f, 10.465f)
                curveToRelative(-0.958f, 0.0f, -1.532f, 0.577f, -1.532f, 1.538f)
                curveToRelative(0.0f, 0.963f, 0.574f, 1.537f, 1.532f, 1.537f)
                curveToRelative(0.958f, 0.0f, 1.532f, -0.574f, 1.532f, -1.537f)
                curveToRelative(0.0f, -0.964f, -0.571f, -1.538f, -1.532f, -1.538f)
                close()
            }
        }
        .build()
        return _keyFilled!!
    }

private var _keyFilled: ImageVector? = null
