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

public val FilledGroup.HospitalFilled: ImageVector
    get() {
        if (_hospitalFilled != null) {
            return _hospitalFilled!!
        }
        _hospitalFilled = Builder(name = "HospitalFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.91f, 4.978f)
                curveToRelative(0.488f, 0.0f, 0.776f, 0.467f, 0.776f, 1.254f)
                verticalLineTo(20.46f)
                curveToRelative(0.0f, 0.785f, -0.291f, 1.255f, -0.776f, 1.255f)
                horizontalLineTo(2.782f)
                curveToRelative(-0.488f, 0.0f, -0.78f, -0.468f, -0.78f, -1.255f)
                verticalLineTo(6.232f)
                curveToRelative(0.0f, -0.787f, 0.292f, -1.254f, 0.78f, -1.254f)
                horizontalLineToRelative(2.28f)
                verticalLineTo(3.403f)
                curveToRelative(0.0f, -0.72f, 0.627f, -1.378f, 1.319f, -1.378f)
                horizontalLineToRelative(10.935f)
                curveToRelative(0.692f, 0.0f, 1.32f, 0.658f, 1.32f, 1.378f)
                verticalLineToRelative(1.572f)
                lineToRelative(2.274f, 0.003f)
                close()
                moveTo(10.022f, 20.51f)
                horizontalLineToRelative(3.647f)
                verticalLineToRelative(-5.944f)
                horizontalLineToRelative(-3.647f)
                verticalLineToRelative(5.944f)
                close()
                moveTo(6.258f, 3.406f)
                verticalLineTo(20.51f)
                horizontalLineToRelative(2.566f)
                verticalLineToRelative(-6.546f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.599f, -0.603f)
                horizontalLineToRelative(4.846f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.6f, 0.603f)
                verticalLineToRelative(6.546f)
                horizontalLineToRelative(2.565f)
                verticalLineTo(3.406f)
                curveToRelative(0.0f, -0.067f, -0.087f, -0.162f, -0.132f, -0.174f)
                horizontalLineTo(6.378f)
                curveToRelative(-0.036f, 0.012f, -0.12f, 0.107f, -0.12f, 0.174f)
                close()
                moveTo(8.824f, 9.2f)
                curveToRelative(-0.325f, 0.0f, -0.603f, -0.244f, -0.603f, -0.535f)
                verticalLineTo(7.182f)
                curveToRelative(0.0f, -0.283f, 0.28f, -0.532f, 0.603f, -0.532f)
                horizontalLineToRelative(1.75f)
                verticalLineTo(4.894f)
                curveToRelative(0.0f, -0.325f, 0.25f, -0.611f, 0.532f, -0.611f)
                horizontalLineToRelative(1.474f)
                curveToRelative(0.277f, 0.0f, 0.532f, 0.291f, 0.532f, 0.61f)
                verticalLineToRelative(1.751f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.317f, 0.0f, 0.609f, 0.255f, 0.609f, 0.535f)
                verticalLineToRelative(1.485f)
                curveToRelative(0.0f, 0.28f, -0.289f, 0.535f, -0.608f, 0.535f)
                horizontalLineToRelative(-1.751f)
                lineToRelative(0.006f, 1.756f)
                curveToRelative(0.0f, 0.328f, -0.244f, 0.605f, -0.533f, 0.605f)
                horizontalLineToRelative(-1.479f)
                curveToRelative(-0.282f, 0.0f, -0.532f, -0.283f, -0.532f, -0.605f)
                verticalLineTo(9.2f)
                horizontalLineToRelative(-1.75f)
                close()
            }
        }
        .build()
        return _hospitalFilled!!
    }

private var _hospitalFilled: ImageVector? = null
