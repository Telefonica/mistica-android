package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.HomeLight: ImageVector
    get() {
        if (_homeLight != null) {
            return _homeLight!!
        }
        _homeLight = Builder(name = "HomeLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.007f, 1.0f)
                lineToRelative(9.901f, 10.798f)
                curveToRelative(0.105f, 0.114f, 0.109f, 0.265f, 0.068f, 0.412f)
                curveToRelative(-0.04f, 0.151f, -0.18f, 0.227f, -0.324f, 0.227f)
                horizontalLineToRelative(-1.785f)
                verticalLineToRelative(4.687f)
                curveToRelative(0.0f, 0.222f, -0.14f, 0.374f, -0.356f, 0.374f)
                curveToRelative(-0.212f, 0.0f, -0.356f, -0.147f, -0.356f, -0.374f)
                verticalLineToRelative(-5.44f)
                horizontalLineToRelative(1.713f)
                lineToRelative(-8.861f, -9.558f)
                lineToRelative(-8.825f, 9.559f)
                horizontalLineToRelative(1.685f)
                verticalLineToRelative(9.563f)
                horizontalLineToRelative(4.286f)
                verticalLineToRelative(-6.75f)
                horizontalLineToRelative(5.712f)
                verticalLineToRelative(6.754f)
                horizontalLineToRelative(4.642f)
                curveToRelative(0.212f, 0.0f, 0.356f, 0.152f, 0.356f, 0.374f)
                curveToRelative(0.0f, 0.223f, -0.14f, 0.374f, -0.356f, 0.374f)
                horizontalLineToRelative(-5.359f)
                verticalLineToRelative(-6.75f)
                lineTo(9.862f, 15.25f)
                lineTo(9.862f, 22.0f)
                lineTo(4.147f, 22.0f)
                verticalLineToRelative(-9.56f)
                lineTo(2.362f, 12.44f)
                curveToRelative(-0.144f, 0.0f, -0.252f, -0.075f, -0.325f, -0.226f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, 0.073f, -0.416f)
                lineTo(12.007f, 1.0f)
                close()
                moveTo(19.515f, 18.619f)
                curveToRelative(0.396f, 0.0f, 0.717f, 0.337f, 0.717f, 0.752f)
                reflectiveCurveToRelative(-0.321f, 0.752f, -0.717f, 0.752f)
                curveToRelative(-0.396f, 0.0f, -0.716f, -0.337f, -0.716f, -0.752f)
                reflectiveCurveToRelative(0.32f, -0.752f, 0.716f, -0.752f)
                close()
            }
        }
        .build()
        return _homeLight!!
    }

private var _homeLight: ImageVector? = null
