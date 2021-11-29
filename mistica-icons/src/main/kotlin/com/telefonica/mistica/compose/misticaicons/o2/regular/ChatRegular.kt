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

public val RegularGroup.ChatRegular: ImageVector
    get() {
        if (_chatRegular != null) {
            return _chatRegular!!
        }
        _chatRegular = Builder(name = "ChatRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 2.0f)
                horizontalLineToRelative(-5.82f)
                curveTo(10.539f, 2.0f, 8.91f, 3.703f, 8.91f, 5.799f)
                verticalLineToRelative(0.38f)
                lineTo(5.636f, 6.179f)
                curveTo(3.629f, 6.178f, 2.0f, 7.88f, 2.0f, 9.976f)
                verticalLineToRelative(3.8f)
                curveToRelative(0.0f, 1.833f, 1.252f, 3.37f, 2.91f, 3.726f)
                verticalLineToRelative(2.738f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, 0.447f, 0.7f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, false, 0.796f, -0.165f)
                lineTo(9.21f, 17.58f)
                horizontalLineToRelative(2.244f)
                curveToRelative(2.007f, 0.0f, 3.636f, -1.702f, 3.636f, -3.799f)
                verticalLineToRelative(-0.063f)
                lineToRelative(2.761f, 2.885f)
                curveToRelative(0.14f, 0.146f, 0.326f, 0.223f, 0.512f, 0.223f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, 0.28f, -0.058f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, 0.446f, -0.7f)
                verticalLineToRelative(-2.739f)
                curveToRelative(1.658f, -0.355f, 2.91f, -1.887f, 2.91f, -3.726f)
                verticalLineToRelative(-3.8f)
                curveTo(22.0f, 3.704f, 20.37f, 2.0f, 18.364f, 2.0f)
                close()
                moveTo(13.634f, 13.781f)
                curveToRelative(0.0f, 1.255f, -0.978f, 2.282f, -2.183f, 2.282f)
                lineTo(8.904f, 16.063f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, false, -0.512f, 0.223f)
                lineToRelative(-2.03f, 2.121f)
                verticalLineToRelative(-1.585f)
                curveToRelative(0.0f, -0.419f, -0.326f, -0.76f, -0.726f, -0.76f)
                curveToRelative(-1.201f, 0.0f, -2.183f, -1.02f, -2.183f, -2.28f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0.0f, -1.255f, 0.977f, -2.281f, 2.183f, -2.281f)
                horizontalLineToRelative(3.273f)
                verticalLineToRelative(1.902f)
                curveToRelative(0.0f, 2.096f, 1.63f, 3.799f, 3.636f, 3.799f)
                horizontalLineToRelative(1.09f)
                verticalLineToRelative(0.38f)
                close()
                moveTo(20.547f, 9.603f)
                curveToRelative(0.0f, 1.255f, -0.977f, 2.281f, -2.183f, 2.281f)
                curveToRelative(-0.4f, 0.0f, -0.726f, 0.34f, -0.726f, 0.76f)
                verticalLineToRelative(1.585f)
                lineToRelative(-2.03f, -2.121f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, false, -0.512f, -0.224f)
                horizontalLineToRelative(-2.547f)
                curveToRelative(-1.2f, 0.0f, -2.183f, -1.021f, -2.183f, -2.281f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0.0f, -1.254f, 0.978f, -2.28f, 2.183f, -2.28f)
                horizontalLineToRelative(5.82f)
                curveToRelative(1.2f, 0.0f, 2.183f, 1.021f, 2.183f, 2.28f)
                verticalLineToRelative(3.8f)
                horizontalLineToRelative(-0.005f)
                close()
            }
        }
        .build()
        return _chatRegular!!
    }

private var _chatRegular: ImageVector? = null
