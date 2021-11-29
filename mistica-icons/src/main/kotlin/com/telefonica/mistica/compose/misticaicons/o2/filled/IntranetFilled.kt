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

public val FilledGroup.IntranetFilled: ImageVector
    get() {
        if (_intranetFilled != null) {
            return _intranetFilled!!
        }
        _intranetFilled = Builder(name = "IntranetFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.538f)
                curveToRelative(-0.26f, 4.874f, -3.98f, 8.85f, -8.726f, 9.462f)
                curveToRelative(2.38f, -1.004f, 4.137f, -4.773f, 4.257f, -9.462f)
                close()
                moveTo(6.46f, 12.538f)
                curveToRelative(0.129f, 4.697f, 1.877f, 8.462f, 4.266f, 9.458f)
                curveTo(5.973f, 21.387f, 2.26f, 17.42f, 2.0f, 12.538f)
                close()
                moveTo(11.462f, 12.538f)
                verticalLineToRelative(8.58f)
                curveToRelative(-2.097f, -0.55f, -3.797f, -4.21f, -3.925f, -8.58f)
                horizontalLineToRelative(3.925f)
                close()
                moveTo(16.455f, 12.538f)
                curveToRelative(-0.128f, 4.37f, -1.828f, 8.03f, -3.925f, 8.571f)
                verticalLineToRelative(-8.57f)
                close()
                moveTo(13.266f, 2.0f)
                curveToRelative(4.753f, 0.609f, 8.466f, 4.576f, 8.726f, 9.458f)
                horizontalLineToRelative(-4.46f)
                curveTo(17.402f, 6.76f, 15.654f, 3.004f, 13.265f, 2.0f)
                close()
                moveTo(11.462f, 2.879f)
                verticalLineToRelative(8.579f)
                lineTo(7.537f, 11.458f)
                curveToRelative(0.008f, -0.375f, 0.032f, -0.742f, 0.064f, -1.1f)
                arcToRelative(1.98f, 1.98f, 0.0f, false, false, 0.768f, -3.653f)
                curveToRelative(0.72f, -2.056f, 1.837f, -3.5f, 3.093f, -3.826f)
                close()
                moveTo(10.726f, 2.0f)
                curveToRelative(-1.433f, 0.6f, -2.649f, 2.21f, -3.405f, 4.414f)
                arcToRelative(1.985f, 1.985f, 0.0f, false, false, -0.788f, 3.786f)
                curveToRelative(-0.032f, 0.411f, -0.064f, 0.826f, -0.072f, 1.258f)
                lineTo(2.0f, 11.458f)
                curveTo(2.26f, 6.576f, 5.98f, 2.6f, 10.726f, 2.0f)
                close()
                moveTo(12.53f, 2.879f)
                curveToRelative(2.097f, 0.548f, 3.797f, 4.209f, 3.925f, 8.57f)
                lineTo(12.53f, 11.449f)
                close()
                moveTo(7.35f, 7.495f)
                curveToRelative(0.492f, 0.0f, 0.891f, 0.402f, 0.891f, 0.899f)
                curveToRelative(0.0f, 0.496f, -0.4f, 0.899f, -0.892f, 0.899f)
                arcToRelative(0.896f, 0.896f, 0.0f, false, true, -0.892f, -0.9f)
                curveToRelative(0.0f, -0.496f, 0.4f, -0.898f, 0.892f, -0.898f)
                close()
            }
        }
        .build()
        return _intranetFilled!!
    }

private var _intranetFilled: ImageVector? = null
