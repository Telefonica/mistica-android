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

public val RegularGroup.ShieldCrossRegular: ImageVector
    get() {
        if (_shieldCrossRegular != null) {
            return _shieldCrossRegular!!
        }
        _shieldCrossRegular = Builder(name = "ShieldCrossRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.306f, 5.036f)
                curveToRelative(-3.49f, 0.0f, -6.269f, -2.323f, -6.763f, -2.766f)
                curveToRelative(-0.191f, -0.17f, -0.316f, -0.265f, -0.53f, -0.27f)
                horizontalLineToRelative(-0.017f)
                curveToRelative(-0.214f, 0.005f, -0.339f, 0.1f, -0.53f, 0.27f)
                curveToRelative(-0.494f, 0.443f, -3.272f, 2.766f, -6.763f, 2.766f)
                lineTo(4.0f, 5.036f)
                verticalLineToRelative(9.287f)
                curveToRelative(0.0f, 4.993f, 5.511f, 6.886f, 7.71f, 7.613f)
                arcToRelative(0.688f, 0.688f, 0.0f, false, false, 0.58f, 0.0f)
                curveToRelative(2.203f, -0.727f, 7.71f, -2.62f, 7.71f, -7.613f)
                lineTo(20.0f, 5.036f)
                horizontalLineToRelative(-0.694f)
                close()
                moveTo(11.306f, 20.216f)
                curveToRelative(-2.925f, -1.07f, -5.913f, -2.67f, -5.913f, -5.893f)
                lineTo(5.393f, 12.0f)
                horizontalLineToRelative(5.913f)
                verticalLineToRelative(8.217f)
                close()
                moveTo(11.306f, 10.573f)
                lineTo(5.393f, 10.573f)
                lineTo(5.393f, 6.467f)
                curveToRelative(2.56f, -0.187f, 4.675f, -1.445f, 5.913f, -2.323f)
                verticalLineToRelative(6.43f)
                close()
                moveTo(18.606f, 14.323f)
                curveToRelative(0.0f, 3.223f, -2.987f, 4.824f, -5.912f, 5.894f)
                lineTo(12.694f, 12.0f)
                horizontalLineToRelative(5.913f)
                verticalLineToRelative(2.323f)
                close()
                moveTo(18.606f, 10.573f)
                horizontalLineToRelative(-5.912f)
                lineTo(12.694f, 4.14f)
                curveToRelative(1.238f, 0.873f, 3.353f, 2.135f, 5.913f, 2.323f)
                verticalLineToRelative(4.11f)
                close()
            }
        }
        .build()
        return _shieldCrossRegular!!
    }

private var _shieldCrossRegular: ImageVector? = null
