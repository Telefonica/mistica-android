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

public val FilledGroup.PlugFilled: ImageVector
    get() {
        if (_plugFilled != null) {
            return _plugFilled!!
        }
        _plugFilled = Builder(name = "PlugFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.718f, 20.493f)
                horizontalLineToRelative(1.219f)
                verticalLineToRelative(-3.661f)
                horizontalLineToRelative(-1.219f)
                verticalLineToRelative(3.661f)
                close()
                moveTo(8.906f, 3.63f)
                curveToRelative(0.0f, -0.207f, 0.18f, -0.378f, 0.392f, -0.378f)
                curveToRelative(0.216f, 0.0f, 0.392f, 0.171f, 0.392f, 0.378f)
                verticalLineToRelative(3.866f)
                horizontalLineToRelative(-0.784f)
                lineTo(8.906f, 3.63f)
                close()
                moveTo(14.808f, 3.63f)
                curveToRelative(0.0f, -0.207f, 0.18f, -0.378f, 0.392f, -0.378f)
                curveToRelative(0.216f, 0.0f, 0.392f, 0.171f, 0.392f, 0.378f)
                lineTo(15.592f, 7.5f)
                horizontalLineToRelative(-0.784f)
                lineTo(14.808f, 3.63f)
                close()
                moveTo(17.488f, 7.499f)
                horizontalLineToRelative(-0.63f)
                lineTo(16.858f, 3.627f)
                curveToRelative(0.0f, -0.882f, -0.742f, -1.602f, -1.658f, -1.602f)
                curveToRelative(-0.913f, 0.0f, -1.658f, 0.717f, -1.658f, 1.602f)
                verticalLineToRelative(3.869f)
                lineToRelative(-2.588f, -0.003f)
                lineTo(10.954f, 3.627f)
                curveToRelative(0.0f, -0.882f, -0.745f, -1.602f, -1.658f, -1.602f)
                curveToRelative(-0.914f, 0.0f, -1.659f, 0.717f, -1.659f, 1.602f)
                verticalLineToRelative(3.866f)
                horizontalLineToRelative(-0.476f)
                arcToRelative(0.985f, 0.985f, 0.0f, false, false, -0.992f, 1.0f)
                curveToRelative(0.0f, 2.762f, 1.227f, 4.199f, 2.337f, 4.936f)
                verticalLineToRelative(1.246f)
                curveToRelative(0.0f, 0.625f, 0.21f, 1.132f, 0.599f, 1.462f)
                curveToRelative(0.328f, 0.294f, 0.784f, 0.448f, 1.345f, 0.48f)
                verticalLineToRelative(4.15f)
                curveToRelative(0.0f, 0.524f, 0.44f, 0.947f, 0.98f, 0.947f)
                horizontalLineToRelative(1.787f)
                curveToRelative(0.54f, 0.0f, 0.98f, -0.423f, 0.98f, -0.947f)
                verticalLineToRelative(-4.15f)
                curveToRelative(0.566f, -0.029f, 1.026f, -0.183f, 1.359f, -0.48f)
                curveToRelative(0.39f, -0.339f, 0.585f, -0.832f, 0.585f, -1.465f)
                lineTo(16.141f, 13.42f)
                curveToRelative(1.11f, -0.737f, 2.337f, -2.17f, 2.337f, -4.896f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.0f, -0.527f, -0.443f, -0.955f, -0.99f, -0.955f)
                close()
            }
        }
        .build()
        return _plugFilled!!
    }

private var _plugFilled: ImageVector? = null
