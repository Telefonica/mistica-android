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

public val FilledGroup.PrepaidFilled: ImageVector
    get() {
        if (_prepaidFilled != null) {
            return _prepaidFilled!!
        }
        _prepaidFilled = Builder(name = "PrepaidFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.991f, 5.387f)
                lineTo(5.01f, 5.387f)
                curveTo(5.1f, 3.504f, 6.594f, 2.0f, 8.42f, 2.0f)
                horizontalLineToRelative(6.158f)
                curveToRelative(1.827f, -0.005f, 3.32f, 1.504f, 3.412f, 3.387f)
                close()
                moveTo(8.421f, 22.0f)
                horizontalLineToRelative(6.158f)
                curveToRelative(1.827f, 0.0f, 3.32f, -1.504f, 3.412f, -3.387f)
                lineTo(5.01f, 18.613f)
                curveTo(5.1f, 20.49f, 6.594f, 22.0f, 8.42f, 22.0f)
                close()
                moveTo(18.0f, 6.457f)
                verticalLineToRelative(11.081f)
                lineTo(5.0f, 17.538f)
                lineTo(5.0f, 6.458f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(14.238f, 15.39f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, false, -0.513f, -0.535f)
                lineTo(10.9f, 14.855f)
                curveToRelative(0.057f, -0.17f, 0.088f, -0.348f, 0.088f, -0.535f)
                verticalLineToRelative(-1.61f)
                horizontalLineToRelative(1.541f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, false, 0.513f, -0.534f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, false, -0.513f, -0.535f)
                horizontalLineToRelative(-1.541f)
                verticalLineToRelative(-1.426f)
                curveToRelative(0.0f, -0.59f, 0.46f, -1.07f, 1.024f, -1.07f)
                curveToRelative(0.237f, 0.0f, 0.46f, 0.082f, 0.644f, 0.238f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.723f, -0.078f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, false, -0.074f, -0.754f)
                arcToRelative(2.012f, 2.012f, 0.0f, false, false, -1.293f, -0.476f)
                curveToRelative(-1.13f, 0.0f, -2.054f, 0.96f, -2.054f, 2.144f)
                verticalLineToRelative(1.427f)
                horizontalLineToRelative(-0.17f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, false, -0.513f, 0.535f)
                curveToRelative(0.0f, 0.297f, 0.228f, 0.534f, 0.512f, 0.534f)
                horizontalLineToRelative(0.171f)
                verticalLineToRelative(1.61f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, -0.512f, 0.534f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, false, -0.513f, 0.535f)
                curveToRelative(0.0f, 0.297f, 0.228f, 0.535f, 0.513f, 0.535f)
                horizontalLineToRelative(4.28f)
                arcToRelative(0.529f, 0.529f, 0.0f, false, false, 0.512f, -0.54f)
                close()
            }
        }
        .build()
        return _prepaidFilled!!
    }

private var _prepaidFilled: ImageVector? = null
