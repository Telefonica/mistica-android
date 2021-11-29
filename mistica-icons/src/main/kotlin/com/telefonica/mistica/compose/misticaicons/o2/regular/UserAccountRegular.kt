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

public val RegularGroup.UserAccountRegular: ImageVector
    get() {
        if (_userAccountRegular != null) {
            return _userAccountRegular!!
        }
        _userAccountRegular = Builder(name = "UserAccountRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.82f, 13.547f)
                arcToRelative(6.296f, 6.296f, 0.0f, false, false, 2.838f, -5.273f)
                curveTo(18.658f, 4.814f, 15.896f, 2.0f, 12.5f, 2.0f)
                curveTo(9.104f, 2.0f, 6.342f, 4.813f, 6.342f, 8.274f)
                arcToRelative(6.296f, 6.296f, 0.0f, false, false, 2.838f, 5.273f)
                curveTo(5.536f, 14.543f, 3.0f, 17.15f, 3.0f, 20.284f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.703f, 0.716f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.702f, -0.716f)
                curveToRelative(0.0f, -3.162f, 3.631f, -5.737f, 8.095f, -5.737f)
                reflectiveCurveToRelative(8.095f, 2.575f, 8.095f, 5.737f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.702f, 0.716f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.703f, -0.716f)
                curveToRelative(0.0f, -3.134f, -2.536f, -5.741f, -6.18f, -6.737f)
                close()
                moveTo(7.748f, 8.274f)
                curveToRelative(0.0f, -2.671f, 2.13f, -4.842f, 4.752f, -4.842f)
                reflectiveCurveToRelative(4.752f, 2.17f, 4.752f, 4.842f)
                curveToRelative(0.0f, 2.67f, -2.13f, 4.837f, -4.752f, 4.837f)
                reflectiveCurveToRelative(-4.752f, -2.17f, -4.752f, -4.837f)
                close()
            }
        }
        .build()
        return _userAccountRegular!!
    }

private var _userAccountRegular: ImageVector? = null
