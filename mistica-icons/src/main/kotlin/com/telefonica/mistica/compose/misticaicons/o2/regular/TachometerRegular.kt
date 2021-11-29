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

public val RegularGroup.TachometerRegular: ImageVector
    get() {
        if (_tachometerRegular != null) {
            return _tachometerRegular!!
        }
        _tachometerRegular = Builder(name = "TachometerRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.952f, 8.11f)
                lineToRelative(1.243f, -2.248f)
                arcToRelative(0.766f, 0.766f, 0.0f, false, false, -0.114f, -0.895f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, false, -0.86f, -0.12f)
                lineTo(18.06f, 6.139f)
                curveTo(16.377f, 4.8f, 14.28f, 4.0f, 12.002f, 4.0f)
                curveTo(6.49f, 4.0f, 2.0f, 8.671f, 2.0f, 14.419f)
                curveToRelative(0.0f, 1.771f, 0.49f, 3.429f, 1.531f, 5.224f)
                arcToRelative(0.698f, 0.698f, 0.0f, false, false, 0.983f, 0.247f)
                arcToRelative(0.761f, 0.761f, 0.0f, false, false, 0.238f, -1.023f)
                curveToRelative(-0.905f, -1.548f, -1.326f, -2.962f, -1.326f, -4.453f)
                curveToRelative(0.0f, -4.924f, 3.845f, -8.928f, 8.572f, -8.928f)
                arcToRelative(8.29f, 8.29f, 0.0f, false, true, 4.695f, 1.466f)
                lineToRelative(-1.28f, 0.767f)
                arcToRelative(6.716f, 6.716f, 0.0f, false, false, -3.41f, -0.933f)
                curveToRelative(-3.941f, 0.0f, -7.141f, 3.419f, -7.141f, 7.628f)
                curveToRelative(0.0f, 2.043f, 0.823f, 3.905f, 2.372f, 5.386f)
                arcToRelative(0.696f, 0.696f, 0.0f, false, false, 1.01f, -0.048f)
                arcTo(0.767f, 0.767f, 0.0f, false, false, 8.2f, 18.7f)
                curveToRelative(-1.266f, -1.21f, -1.911f, -2.652f, -1.911f, -4.286f)
                curveToRelative(0.0f, -3.385f, 2.565f, -6.138f, 5.714f, -6.138f)
                curveToRelative(0.659f, 0.0f, 1.299f, 0.124f, 1.902f, 0.348f)
                lineToRelative(-4.187f, 2.514f)
                curveToRelative(-0.023f, 0.014f, -0.046f, 0.029f, -0.064f, 0.043f)
                arcToRelative(4.056f, 4.056f, 0.0f, false, false, -0.407f, 0.362f)
                curveToRelative(-1.518f, 1.58f, -1.518f, 4.157f, 0.0f, 5.738f)
                arcToRelative(3.804f, 3.804f, 0.0f, false, false, 2.756f, 1.186f)
                arcToRelative(3.804f, 3.804f, 0.0f, false, false, 2.757f, -1.186f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 0.347f, -0.424f)
                curveToRelative(0.014f, -0.024f, 0.028f, -0.043f, 0.041f, -0.067f)
                lineToRelative(4.019f, -7.266f)
                arcToRelative(9.143f, 9.143f, 0.0f, false, true, 1.408f, 4.89f)
                curveToRelative(0.0f, 1.486f, -0.42f, 2.9f, -1.326f, 4.453f)
                arcToRelative(0.766f, 0.766f, 0.0f, false, false, 0.238f, 1.023f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.37f, 0.11f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, false, 0.613f, -0.357f)
                curveTo(21.515f, 17.853f, 22.0f, 16.19f, 22.0f, 14.419f)
                arcToRelative(10.61f, 10.61f, 0.0f, false, false, -2.048f, -6.31f)
                close()
                moveTo(13.932f, 16.014f)
                arcToRelative(2.052f, 2.052f, 0.0f, false, true, -0.188f, 0.22f)
                curveToRelative(-0.965f, 1.0f, -2.528f, 1.0f, -3.488f, 0.0f)
                reflectiveCurveToRelative(-0.96f, -2.634f, 0.0f, -3.634f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, 0.215f, -0.195f)
                lineToRelative(8.16f, -4.89f)
                lineToRelative(-4.7f, 8.5f)
                close()
            }
        }
        .build()
        return _tachometerRegular!!
    }

private var _tachometerRegular: ImageVector? = null
