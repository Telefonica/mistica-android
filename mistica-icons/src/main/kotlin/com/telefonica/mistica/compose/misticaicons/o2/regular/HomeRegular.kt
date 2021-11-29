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

public val RegularGroup.HomeRegular: ImageVector
    get() {
        if (_homeRegular != null) {
            return _homeRegular!!
        }
        _homeRegular = Builder(name = "HomeRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.783f, 11.538f)
                lineTo(11.995f, 1.0f)
                lineTo(2.203f, 11.538f)
                curveToRelative(-0.216f, 0.227f, -0.252f, 0.525f, -0.144f, 0.823f)
                curveToRelative(0.108f, 0.265f, 0.356f, 0.487f, 0.644f, 0.487f)
                horizontalLineToRelative(1.429f)
                lineTo(4.132f, 22.0f)
                horizontalLineToRelative(6.07f)
                verticalLineToRelative(-6.75f)
                horizontalLineToRelative(3.574f)
                lineTo(13.776f, 22.0f)
                horizontalLineToRelative(6.07f)
                verticalLineToRelative(-9.19f)
                horizontalLineToRelative(1.429f)
                curveToRelative(0.284f, 0.0f, 0.536f, -0.189f, 0.644f, -0.487f)
                arcToRelative(0.635f, 0.635f, 0.0f, false, false, -0.136f, -0.785f)
                close()
                moveTo(15.208f, 20.496f)
                verticalLineToRelative(-6.745f)
                horizontalLineToRelative(-6.43f)
                verticalLineToRelative(6.75f)
                lineTo(5.564f, 20.501f)
                verticalLineToRelative(-9.19f)
                lineTo(4.312f, 11.311f)
                lineToRelative(7.683f, -8.249f)
                lineToRelative(7.68f, 8.249f)
                horizontalLineToRelative(-1.253f)
                verticalLineToRelative(9.185f)
                horizontalLineToRelative(-3.214f)
                close()
            }
        }
        .build()
        return _homeRegular!!
    }

private var _homeRegular: ImageVector? = null
