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

public val FilledGroup.TrainFilled: ImageVector
    get() {
        if (_trainFilled != null) {
            return _trainFilled!!
        }
        _trainFilled = Builder(name = "TrainFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.055f, 10.67f)
                arcToRelative(6.334f, 6.334f, 0.0f, false, false, -0.591f, -0.802f)
                curveToRelative(-2.205f, -2.544f, -4.167f, -3.431f, -5.301f, -3.742f)
                verticalLineToRelative(4.543f)
                horizontalLineToRelative(5.892f)
                close()
                moveTo(18.775f, 15.65f)
                curveToRelative(0.224f, -0.171f, 0.577f, -0.472f, 0.919f, -0.865f)
                lineTo(3.374f, 14.785f)
                verticalLineToRelative(1.001f)
                curveToRelative(10.508f, 0.0f, 13.932f, 0.02f, 14.922f, 0.029f)
                horizontalLineToRelative(0.008f)
                arcToRelative(0.755f, 0.755f, 0.0f, false, false, 0.47f, -0.165f)
                close()
                moveTo(3.375f, 10.593f)
                horizontalLineToRelative(2.003f)
                lineTo(5.378f, 7.371f)
                lineTo(3.375f, 7.371f)
                verticalLineToRelative(3.222f)
                close()
                moveTo(6.768f, 10.593f)
                horizontalLineToRelative(2.155f)
                lineTo(8.923f, 7.371f)
                lineTo(6.768f, 7.371f)
                verticalLineToRelative(3.222f)
                close()
                moveTo(10.184f, 10.593f)
                horizontalLineToRelative(2.157f)
                lineTo(12.341f, 7.371f)
                horizontalLineToRelative(-2.157f)
                verticalLineToRelative(3.222f)
                close()
                moveTo(2.347f, 16.974f)
                arcToRelative(0.757f, 0.757f, 0.0f, false, true, -0.177f, -0.49f)
                lineTo(2.17f, 5.267f)
                curveToRelative(0.0f, -0.384f, 0.269f, -0.697f, 0.602f, -0.697f)
                lineTo(13.11f, 4.57f)
                curveToRelative(0.115f, -0.004f, 3.39f, -0.095f, 7.204f, 4.312f)
                curveToRelative(1.135f, 1.311f, 1.65f, 2.667f, 1.53f, 4.026f)
                curveToRelative(-0.171f, 1.936f, -1.583f, 3.276f, -2.407f, 3.904f)
                arcToRelative(1.871f, 1.871f, 0.0f, false, true, -1.132f, 0.392f)
                horizontalLineToRelative(-0.017f)
                curveToRelative(-1.009f, -0.01f, -4.54f, -0.028f, -15.515f, -0.028f)
                arcToRelative(0.568f, 0.568f, 0.0f, false, true, -0.425f, -0.203f)
                close()
                moveTo(21.257f, 18.026f)
                curveToRelative(0.334f, 0.0f, 0.603f, 0.31f, 0.603f, 0.697f)
                curveToRelative(0.0f, 0.387f, -0.27f, 0.697f, -0.603f, 0.697f)
                lineTo(2.772f, 19.42f)
                curveToRelative(-0.333f, 0.0f, -0.602f, -0.31f, -0.602f, -0.697f)
                curveToRelative(0.0f, -0.387f, 0.269f, -0.697f, 0.602f, -0.697f)
                horizontalLineToRelative(18.485f)
                close()
            }
        }
        .build()
        return _trainFilled!!
    }

private var _trainFilled: ImageVector? = null
