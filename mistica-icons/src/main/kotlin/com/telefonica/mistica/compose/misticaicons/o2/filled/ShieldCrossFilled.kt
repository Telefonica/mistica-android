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

public val FilledGroup.ShieldCrossFilled: ImageVector
    get() {
        if (_shieldCrossFilled != null) {
            return _shieldCrossFilled!!
        }
        _shieldCrossFilled = Builder(name = "ShieldCrossFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.624f)
                lineTo(4.0f, 4.752f)
                horizontalLineToRelative(0.363f)
                curveToRelative(3.411f, 0.0f, 6.18f, -2.01f, 7.088f, -2.752f)
                verticalLineToRelative(8.624f)
                lineTo(4.0f, 10.624f)
                close()
                moveTo(20.0f, 10.624f)
                lineTo(20.0f, 4.752f)
                horizontalLineToRelative(-0.363f)
                curveToRelative(-3.411f, 0.0f, -6.18f, -2.01f, -7.088f, -2.752f)
                verticalLineToRelative(8.624f)
                lineTo(20.0f, 10.624f)
                close()
                moveTo(12.545f, 11.723f)
                lineTo(12.545f, 22.0f)
                curveTo(15.863f, 20.877f, 20.0f, 18.919f, 20.0f, 14.659f)
                verticalLineToRelative(-2.936f)
                horizontalLineToRelative(-7.455f)
                close()
                moveTo(11.455f, 11.723f)
                lineTo(4.0f, 11.723f)
                verticalLineToRelative(2.936f)
                curveToRelative(0.0f, 4.199f, 3.886f, 6.13f, 7.455f, 7.336f)
                lineTo(11.455f, 11.723f)
                close()
            }
        }
        .build()
        return _shieldCrossFilled!!
    }

private var _shieldCrossFilled: ImageVector? = null
