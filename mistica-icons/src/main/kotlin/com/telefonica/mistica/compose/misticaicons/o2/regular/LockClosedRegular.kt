package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.LockClosedRegular: ImageVector
    get() {
        if (_lockClosedRegular != null) {
            return _lockClosedRegular!!
        }
        _lockClosedRegular = Builder(name = "LockClosedRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(3.26f, 0.0f, 5.912f, 2.723f, 5.912f, 6.07f)
                lineTo(17.912f, 9.5f)
                curveToRelative(1.15f, 0.0f, 2.088f, 0.96f, 2.088f, 2.143f)
                verticalLineToRelative(8.214f)
                curveTo(20.0f, 21.04f, 19.061f, 22.0f, 17.912f, 22.0f)
                lineTo(6.088f, 22.0f)
                curveTo(4.935f, 22.0f, 4.0f, 21.036f, 4.0f, 19.856f)
                verticalLineToRelative(-8.214f)
                curveTo(4.0f, 10.458f, 4.939f, 9.5f, 6.088f, 9.5f)
                lineTo(6.088f, 8.07f)
                curveTo(6.088f, 4.723f, 8.74f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.912f, 10.926f)
                lineTo(6.088f, 10.926f)
                arcToRelative(0.709f, 0.709f, 0.0f, false, false, -0.698f, 0.716f)
                verticalLineToRelative(8.21f)
                curveToRelative(0.0f, 0.396f, 0.316f, 0.716f, 0.698f, 0.716f)
                horizontalLineToRelative(11.82f)
                arcToRelative(0.709f, 0.709f, 0.0f, false, false, 0.698f, -0.716f)
                horizontalLineToRelative(0.004f)
                verticalLineToRelative(-8.21f)
                arcToRelative(0.709f, 0.709f, 0.0f, false, false, -0.698f, -0.716f)
                close()
                moveTo(14.987f, 12.922f)
                arcToRelative(0.679f, 0.679f, 0.0f, false, true, 0.982f, 0.0f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, true, 0.0f, 1.012f)
                lineToRelative(-5.013f, 5.147f)
                lineToRelative(-2.232f, -2.292f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, true, 0.0f, -1.012f)
                arcToRelative(0.683f, 0.683f, 0.0f, false, true, 0.986f, 0.0f)
                lineToRelative(1.246f, 1.28f)
                close()
                moveTo(12.0f, 3.428f)
                curveToRelative(-2.493f, 0.0f, -4.522f, 2.083f, -4.522f, 4.643f)
                verticalLineToRelative(1.428f)
                horizontalLineToRelative(9.044f)
                lineTo(16.522f, 8.07f)
                curveToRelative(0.0f, -2.56f, -2.03f, -4.643f, -4.522f, -4.643f)
                close()
            }
        }
        .build()
        return _lockClosedRegular!!
    }

private var _lockClosedRegular: ImageVector? = null
