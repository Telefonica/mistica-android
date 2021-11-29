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

public val RegularGroup.DocumentsRegular: ImageVector
    get() {
        if (_documentsRegular != null) {
            return _documentsRegular!!
        }
        _documentsRegular = Builder(name = "DocumentsRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.796f, 20.583f)
                lineTo(9.796f, 6.72f)
                lineToRelative(0.028f, -0.008f)
                horizontalLineToRelative(5.207f)
                verticalLineToRelative(1.686f)
                curveToRelative(0.0f, 0.852f, 0.294f, 1.586f, 0.851f, 2.126f)
                curveToRelative(0.552f, 0.535f, 1.297f, 0.818f, 2.16f, 0.818f)
                horizontalLineToRelative(1.756f)
                lineToRelative(-0.025f, 9.244f)
                lineToRelative(-9.977f, -0.003f)
                close()
                moveTo(4.252f, 16.729f)
                lineTo(4.255f, 3.415f)
                lineTo(13.824f, 3.398f)
                verticalLineToRelative(2.059f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.681f, 0.0f, -1.28f, 0.59f, -1.28f, 1.263f)
                verticalLineToRelative(9.995f)
                lineToRelative(-4.292f, 0.014f)
                close()
                moveTo(16.28f, 7.26f)
                lineToRelative(2.908f, 2.826f)
                horizontalLineToRelative(-1.149f)
                curveToRelative(-0.532f, 0.0f, -0.977f, -0.16f, -1.291f, -0.465f)
                curveToRelative(-0.308f, -0.3f, -0.47f, -0.723f, -0.47f, -1.224f)
                lineTo(16.278f, 7.261f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(20.997f, 10.254f)
                arcToRelative(0.834f, 0.834f, 0.0f, false, false, -0.204f, -0.358f)
                lineToRelative(-4.325f, -4.202f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, false, -0.588f, -0.238f)
                horizontalLineToRelative(-0.804f)
                lineTo(15.076f, 3.398f)
                curveToRelative(0.0f, -0.672f, -0.575f, -1.238f, -1.255f, -1.238f)
                lineTo(4.255f, 2.16f)
                curveTo(3.575f, 2.16f, 3.0f, 2.729f, 3.0f, 3.398f)
                verticalLineToRelative(13.33f)
                curveToRelative(0.0f, 0.662f, 0.585f, 1.242f, 1.255f, 1.242f)
                horizontalLineToRelative(4.288f)
                verticalLineToRelative(2.613f)
                curveToRelative(0.0f, 0.683f, 0.586f, 1.263f, 1.28f, 1.263f)
                horizontalLineToRelative(9.944f)
                curveToRelative(0.695f, 0.0f, 1.278f, -0.58f, 1.278f, -1.263f)
                lineTo(21.045f, 10.502f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, false, -0.048f, -0.247f)
                close()
            }
        }
        .build()
        return _documentsRegular!!
    }

private var _documentsRegular: ImageVector? = null
