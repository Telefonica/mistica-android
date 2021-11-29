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

public val FilledGroup.MuseumFilled: ImageVector
    get() {
        if (_museumFilled != null) {
            return _museumFilled!!
        }
        _museumFilled = Builder(name = "MuseumFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.653f, 2.27f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 0.7f, 0.0f)
                lineToRelative(9.23f, 6.43f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, true, 0.235f, 0.692f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.586f, 0.432f)
                lineTo(21.232f, 9.82f)
                horizontalLineToRelative(-1.798f)
                verticalLineToRelative(7.852f)
                horizontalLineToRelative(1.745f)
                curveToRelative(0.34f, 0.0f, 0.614f, 0.277f, 0.614f, 0.616f)
                verticalLineToRelative(2.938f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, -0.614f, 0.616f)
                lineTo(2.823f, 21.842f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, -0.613f, -0.616f)
                lineTo(2.21f, 18.29f)
                curveToRelative(0.0f, -0.34f, 0.274f, -0.616f, 0.613f, -0.616f)
                horizontalLineToRelative(1.78f)
                lineTo(4.603f, 9.82f)
                horizontalLineToRelative(-1.83f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, true, -0.585f, -0.431f)
                arcToRelative(0.618f, 0.618f, 0.0f, false, true, 0.235f, -0.69f)
                close()
                moveTo(10.207f, 9.824f)
                lineTo(8.232f, 9.824f)
                verticalLineToRelative(7.851f)
                horizontalLineToRelative(1.975f)
                lineTo(10.207f, 9.824f)
                close()
                moveTo(15.807f, 9.824f)
                horizontalLineToRelative(-1.975f)
                verticalLineToRelative(7.851f)
                horizontalLineToRelative(1.975f)
                lineTo(15.807f, 9.824f)
                close()
            }
        }
        .build()
        return _museumFilled!!
    }

private var _museumFilled: ImageVector? = null
