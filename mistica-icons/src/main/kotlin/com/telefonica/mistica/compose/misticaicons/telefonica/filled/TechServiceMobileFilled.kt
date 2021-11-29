package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.TechServiceMobileFilled: ImageVector
    get() {
        if (_techServiceMobileFilled != null) {
            return _techServiceMobileFilled!!
        }
        _techServiceMobileFilled = Builder(name = "TechServiceMobileFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.604f, 2.15f)
                lineTo(11.42f, 2.15f)
                curveToRelative(-1.107f, 0.0f, -1.91f, 0.272f, -2.454f, 0.832f)
                curveToRelative(-0.535f, 0.549f, -0.796f, 1.353f, -0.796f, 2.46f)
                verticalLineToRelative(4.733f)
                lineToRelative(-2.717f, 2.717f)
                arcToRelative(3.026f, 3.026f, 0.0f, false, false, -3.202f, 3.793f)
                arcToRelative(0.839f, 0.839f, 0.0f, false, false, 1.407f, 0.375f)
                lineToRelative(0.655f, -0.652f)
                lineToRelative(0.311f, 0.045f)
                lineToRelative(0.045f, 0.31f)
                lineToRelative(-0.656f, 0.656f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, 0.379f, 1.406f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, false, 3.776f, -2.499f)
                verticalLineToRelative(2.225f)
                curveToRelative(0.0f, 2.215f, 1.061f, 3.29f, 3.249f, 3.29f)
                horizontalLineToRelative(7.185f)
                curveToRelative(2.187f, 0.0f, 3.249f, -1.075f, 3.249f, -3.29f)
                lineTo(21.851f, 5.44f)
                curveToRelative(0.003f, -2.185f, -1.09f, -3.291f, -3.247f, -3.291f)
                close()
                moveTo(12.54f, 10.083f)
                lineTo(8.173f, 14.45f)
                lineTo(8.17f, 14.45f)
                verticalLineToRelative(0.003f)
                lineToRelative(-0.885f, 0.885f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, true, -2.675f, 2.675f)
                lineToRelative(0.952f, -0.953f)
                lineToRelative(-0.193f, -1.353f)
                lineToRelative(-1.353f, -0.193f)
                lineToRelative(-0.952f, 0.953f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, true, 2.675f, -2.676f)
                lineToRelative(5.252f, -5.254f)
                arcToRelative(2.186f, 2.186f, 0.0f, false, true, 2.675f, -2.678f)
                lineToRelative(-0.952f, 0.952f)
                lineToRelative(0.193f, 1.353f)
                lineToRelative(1.353f, 0.193f)
                lineToRelative(0.952f, -0.952f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, true, -1.543f, 2.675f)
                curveToRelative(-0.367f, 0.104f, -0.76f, 0.104f, -1.129f, 0.003f)
                close()
                moveTo(15.736f, 19.122f)
                curveToRelative(-0.168f, 0.17f, -0.412f, 0.252f, -0.714f, 0.252f)
                curveToRelative(-0.303f, 0.0f, -0.546f, -0.081f, -0.714f, -0.252f)
                curveToRelative(-0.155f, -0.157f, -0.241f, -0.392f, -0.241f, -0.706f)
                curveToRelative(0.0f, -0.655f, 0.375f, -0.958f, 0.955f, -0.958f)
                reflectiveCurveToRelative(0.955f, 0.305f, 0.955f, 0.958f)
                curveToRelative(0.0f, 0.317f, -0.087f, 0.55f, -0.24f, 0.706f)
                close()
            }
        }
        .build()
        return _techServiceMobileFilled!!
    }

private var _techServiceMobileFilled: ImageVector? = null
