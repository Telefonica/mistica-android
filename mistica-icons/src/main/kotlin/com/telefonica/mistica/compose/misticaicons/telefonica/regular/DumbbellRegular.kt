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

public val RegularGroup.DumbbellRegular: ImageVector
    get() {
        if (_dumbbellRegular != null) {
            return _dumbbellRegular!!
        }
        _dumbbellRegular = Builder(name = "DumbbellRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.787f, 5.339f)
                curveToRelative(0.706f, 0.0f, 1.28f, 0.597f, 1.28f, 1.336f)
                lineTo(8.067f, 9.49f)
                horizontalLineToRelative(7.614f)
                lineTo(15.681f, 6.675f)
                curveToRelative(0.0f, -0.737f, 0.574f, -1.336f, 1.28f, -1.336f)
                horizontalLineToRelative(1.098f)
                curveToRelative(0.706f, 0.0f, 1.28f, 0.597f, 1.28f, 1.336f)
                verticalLineToRelative(0.112f)
                horizontalLineToRelative(1.095f)
                curveToRelative(0.706f, 0.0f, 1.28f, 0.6f, 1.28f, 1.336f)
                verticalLineToRelative(7.55f)
                curveToRelative(0.0f, 0.736f, -0.574f, 1.335f, -1.28f, 1.335f)
                lineTo(19.34f, 17.008f)
                verticalLineToRelative(0.112f)
                curveToRelative(0.0f, 0.737f, -0.574f, 1.337f, -1.28f, 1.337f)
                lineTo(16.96f, 18.457f)
                curveToRelative(-0.709f, 0.0f, -1.28f, -0.597f, -1.28f, -1.337f)
                verticalLineToRelative(-2.812f)
                lineTo(8.067f, 14.308f)
                verticalLineToRelative(2.812f)
                curveToRelative(0.0f, 0.737f, -0.574f, 1.337f, -1.28f, 1.337f)
                lineTo(5.69f, 18.457f)
                curveToRelative(-0.706f, 0.0f, -1.28f, -0.597f, -1.28f, -1.337f)
                verticalLineToRelative(-0.114f)
                lineToRelative(-0.011f, 0.002f)
                lineTo(3.3f, 17.008f)
                curveToRelative(-0.709f, 0.0f, -1.28f, -0.596f, -1.28f, -1.336f)
                lineTo(2.02f, 8.123f)
                curveToRelative(0.0f, -0.736f, 0.574f, -1.336f, 1.28f, -1.336f)
                horizontalLineToRelative(1.098f)
                curveToRelative(0.003f, 0.0f, 0.005f, 0.003f, 0.011f, 0.003f)
                verticalLineToRelative(-0.115f)
                curveToRelative(0.0f, -0.737f, 0.574f, -1.336f, 1.28f, -1.336f)
                close()
                moveTo(18.062f, 6.675f)
                horizontalLineToRelative(-1.098f)
                verticalLineToRelative(4.132f)
                lineToRelative(0.002f, 0.02f)
                verticalLineToRelative(2.145f)
                lineToRelative(-0.002f, 0.02f)
                verticalLineToRelative(4.134f)
                horizontalLineToRelative(1.098f)
                lineTo(18.062f, 15.7f)
                lineToRelative(-0.003f, -0.025f)
                lineTo(18.059f, 8.126f)
                curveToRelative(0.0f, -0.011f, 0.003f, -0.017f, 0.003f, -0.025f)
                lineTo(18.062f, 6.675f)
                close()
                moveTo(6.792f, 6.675f)
                lineTo(5.696f, 6.675f)
                lineTo(5.696f, 17.12f)
                horizontalLineToRelative(1.098f)
                verticalLineToRelative(-4.0f)
                curveToRelative(-0.006f, -0.047f, -0.014f, -0.098f, -0.014f, -0.148f)
                verticalLineToRelative(-2.146f)
                curveToRelative(0.0f, -0.05f, 0.008f, -0.098f, 0.014f, -0.148f)
                lineTo(6.794f, 6.675f)
                close()
                moveTo(20.437f, 8.123f)
                horizontalLineToRelative(-1.095f)
                verticalLineToRelative(7.55f)
                horizontalLineToRelative(1.095f)
                verticalLineToRelative(-7.55f)
                close()
                moveTo(4.407f, 8.123f)
                lineTo(3.307f, 8.123f)
                verticalLineToRelative(7.55f)
                horizontalLineToRelative(1.098f)
                verticalLineToRelative(-7.55f)
                close()
                moveTo(15.687f, 10.826f)
                lineTo(8.072f, 10.826f)
                verticalLineToRelative(2.146f)
                horizontalLineToRelative(7.613f)
                verticalLineToRelative(-2.146f)
                close()
            }
        }
        .build()
        return _dumbbellRegular!!
    }

private var _dumbbellRegular: ImageVector? = null
