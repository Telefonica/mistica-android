package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

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
                moveTo(16.438f, 14.505f)
                curveToRelative(2.496f, 0.0f, 4.52f, 2.023f, 4.519f, 4.504f)
                lineToRelative(0.041f, 2.229f)
                lineToRelative(-0.007f, 0.11f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.742f, 0.647f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.749f, -0.749f)
                verticalLineToRelative(-2.223f)
                arcToRelative(4.517f, 4.517f, 0.0f, false, true, 4.518f, -4.518f)
                close()
                moveTo(16.438f, 16.003f)
                horizontalLineToRelative(-8.42f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, false, -3.02f, 3.02f)
                verticalLineToRelative(1.474f)
                horizontalLineToRelative(14.488f)
                lineToRelative(-0.032f, -1.651f)
                arcToRelative(3.02f, 3.02f, 0.0f, false, false, -3.016f, -2.843f)
                close()
                moveTo(12.25f, 2.5f)
                curveToRelative(3.343f, 0.0f, 5.25f, 1.839f, 5.25f, 5.25f)
                reflectiveCurveTo(15.592f, 13.0f, 12.25f, 13.0f)
                curveToRelative(-3.259f, 0.0f, -5.154f, -1.748f, -5.246f, -4.997f)
                lineToRelative(-0.004f, -0.253f)
                lineToRelative(0.004f, -0.253f)
                curveTo(7.095f, 4.247f, 8.99f, 2.5f, 12.249f, 2.5f)
                close()
                moveTo(12.25f, 4.0f)
                curveTo(9.723f, 4.0f, 8.5f, 5.18f, 8.5f, 7.75f)
                curveToRelative(0.0f, 2.57f, 1.224f, 3.75f, 3.75f, 3.75f)
                reflectiveCurveTo(16.0f, 10.32f, 16.0f, 7.75f)
                curveTo(16.0f, 5.18f, 14.775f, 4.0f, 12.25f, 4.0f)
                close()
            }
        }
        .build()
        return _userAccountRegular!!
    }

private var _userAccountRegular: ImageVector? = null
