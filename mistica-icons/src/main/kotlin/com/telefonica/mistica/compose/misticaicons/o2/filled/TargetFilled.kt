package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.TargetFilled: ImageVector
    get() {
        if (_targetFilled != null) {
            return _targetFilled!!
        }
        _targetFilled = Builder(name = "TargetFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.096f, 8.984f)
                arcToRelative(7.678f, 7.678f, 0.0f, false, true, 1.32f, 4.307f)
                curveToRelative(0.0f, 4.252f, -3.458f, 7.709f, -7.708f, 7.709f)
                curveTo(5.457f, 21.0f, 2.0f, 17.543f, 2.0f, 13.291f)
                curveTo(2.0f, 9.04f, 5.457f, 5.583f, 9.708f, 5.583f)
                curveToRelative(1.597f, 0.0f, 3.076f, 0.488f, 4.307f, 1.32f)
                lineTo(11.6f, 9.317f)
                arcToRelative(4.34f, 4.34f, 0.0f, false, false, -1.893f, -0.432f)
                arcToRelative(4.412f, 4.412f, 0.0f, false, false, -4.406f, 4.406f)
                arcToRelative(4.412f, 4.412f, 0.0f, false, false, 4.406f, 4.407f)
                arcToRelative(4.412f, 4.412f, 0.0f, false, false, 4.405f, -4.407f)
                curveToRelative(0.0f, -0.676f, -0.16f, -1.32f, -0.432f, -1.893f)
                lineToRelative(2.415f, -2.414f)
                close()
                moveTo(9.708f, 14.762f)
                arcToRelative(1.469f, 1.469f, 0.0f, false, true, -1.038f, -2.509f)
                lineToRelative(2.09f, -2.09f)
                arcToRelative(3.304f, 3.304f, 0.0f, false, false, -4.354f, 3.129f)
                arcToRelative(3.304f, 3.304f, 0.0f, false, false, 3.302f, 3.302f)
                arcToRelative(3.304f, 3.304f, 0.0f, false, false, 3.128f, -4.355f)
                lineToRelative(-2.09f, 2.095f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, true, -1.038f, 0.428f)
                close()
                moveTo(21.84f, 4.507f)
                lineToRelative(-2.57f, 2.57f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.39f, 0.16f)
                horizontalLineToRelative(-2.338f)
                lineToRelative(-6.444f, 6.449f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, true, -0.39f, 0.16f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.39f, -0.94f)
                lineToRelative(6.444f, -6.445f)
                verticalLineToRelative(-2.34f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.16f, -0.39f)
                lineToRelative(2.569f, -2.569f)
                arcToRelative(0.541f, 0.541f, 0.0f, false, true, 0.601f, -0.117f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, true, 0.338f, 0.507f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.22f, 0.0f, 0.423f, 0.136f, 0.507f, 0.338f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, true, -0.117f, 0.597f)
                close()
                moveTo(20.12f, 4.671f)
                horizontalLineToRelative(-1.24f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, true, -0.549f, -0.55f)
                verticalLineToRelative(-1.24f)
                lineToRelative(-1.465f, 1.466f)
                verticalLineToRelative(1.79f)
                horizontalLineToRelative(1.79f)
                lineTo(20.12f, 4.67f)
                close()
            }
        }
        .build()
        return _targetFilled!!
    }

private var _targetFilled: ImageVector? = null
