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

public val RegularGroup.ProcessLoadingRegular: ImageVector
    get() {
        if (_processLoadingRegular != null) {
            return _processLoadingRegular!!
        }
        _processLoadingRegular = Builder(name = "ProcessLoadingRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.639f)
                curveToRelative(5.731f, 0.0f, 8.639f, -2.905f, 8.639f, -8.633f)
                curveToRelative(0.0f, -5.731f, -2.905f, -8.639f, -8.639f, -8.639f)
                curveToRelative(-5.728f, 0.0f, -8.633f, 2.908f, -8.633f, 8.639f)
                curveToRelative(0.0f, 5.728f, 2.905f, 8.633f, 8.633f, 8.633f)
                close()
                moveTo(12.0f, 2.16f)
                curveToRelative(6.44f, 0.0f, 9.846f, 3.403f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.437f, -3.403f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.437f, 0.0f, -9.84f, -3.403f, -9.84f, -9.84f)
                curveTo(2.16f, 5.563f, 5.563f, 2.16f, 12.0f, 2.16f)
                close()
                moveTo(12.045f, 4.202f)
                curveToRelative(0.333f, 0.0f, 0.605f, 0.272f, 0.605f, 0.605f)
                verticalLineToRelative(3.025f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, -1.21f, 0.0f)
                lineTo(11.44f, 4.807f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, true, 0.605f, -0.605f)
                close()
                moveTo(8.435f, 11.962f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, -0.606f, 0.604f)
                lineTo(4.804f, 12.566f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 0.0f, -1.21f)
                lineTo(7.83f, 11.356f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, 0.606f, 0.605f)
                close()
                moveTo(8.597f, 14.496f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, 0.854f, 0.854f)
                lineToRelative(-2.137f, 2.138f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.851f, 0.003f)
                lineToRelative(-0.003f, -0.003f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, 0.0f, -0.855f)
                lineToRelative(2.137f, -2.137f)
                close()
                moveTo(11.961f, 15.572f)
                curveToRelative(0.333f, 0.0f, 0.602f, 0.271f, 0.602f, 0.605f)
                verticalLineToRelative(3.022f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, -1.204f, 0.0f)
                verticalLineToRelative(-3.022f)
                curveToRelative(0.0f, -0.334f, 0.269f, -0.605f, 0.602f, -0.605f)
                close()
                moveTo(15.351f, 14.558f)
                lineTo(17.488f, 16.695f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.852f, 0.854f)
                lineToRelative(-2.14f, -2.14f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, -0.033f, -0.854f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, 0.854f, -0.034f)
                lineToRelative(0.033f, 0.037f)
                close()
                moveTo(19.199f, 11.443f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, 0.0f, 1.204f)
                horizontalLineToRelative(-3.025f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, 0.0f, -1.204f)
                horizontalLineToRelative(3.025f)
                close()
                moveTo(14.984f, 9.687f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, -0.429f, -1.031f)
                lineToRelative(2.137f, -2.14f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, 0.855f, 0.854f)
                lineToRelative(-2.138f, 2.14f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.425f, 0.177f)
                close()
            }
        }
        .build()
        return _processLoadingRegular!!
    }

private var _processLoadingRegular: ImageVector? = null
