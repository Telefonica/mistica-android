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

public val LightGroup.ListDocumentLight: ImageVector
    get() {
        if (_listDocumentLight != null) {
            return _listDocumentLight!!
        }
        _listDocumentLight = Builder(name = "ListDocumentLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.854f, 2.0f)
                curveToRelative(0.988f, 0.0f, 1.797f, 0.83f, 1.797f, 1.854f)
                verticalLineToRelative(13.33f)
                curveToRelative(0.0f, 0.204f, -0.161f, 0.37f, -0.359f, 0.37f)
                arcToRelative(0.365f, 0.365f, 0.0f, false, true, -0.358f, -0.37f)
                lineTo(17.934f, 3.854f)
                curveToRelative(0.0f, -0.612f, -0.483f, -1.11f, -1.076f, -1.11f)
                lineTo(6.793f, 2.744f)
                curveToRelative(-0.593f, 0.0f, -1.076f, 0.498f, -1.076f, 1.11f)
                lineTo(5.717f, 21.26f)
                horizontalLineToRelative(12.566f)
                curveToRelative(0.198f, 0.0f, 0.358f, 0.166f, 0.358f, 0.37f)
                reflectiveCurveToRelative(-0.16f, 0.37f, -0.358f, 0.37f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 3.854f)
                curveTo(5.0f, 2.834f, 5.804f, 2.0f, 6.797f, 2.0f)
                horizontalLineToRelative(10.057f)
                close()
                moveTo(18.283f, 18.667f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, 0.717f, 0.74f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, -0.717f, 0.74f)
                arcToRelative(0.726f, 0.726f, 0.0f, false, true, -0.717f, -0.74f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, 0.717f, -0.74f)
                close()
                moveTo(12.786f, 14.704f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, true, 0.0f, 0.522f)
                lineToRelative(-3.659f, 3.783f)
                lineToRelative(-1.87f, -1.93f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, 0.0f, -0.521f)
                arcToRelative(0.349f, 0.349f, 0.0f, false, true, 0.505f, 0.0f)
                lineToRelative(1.36f, 1.403f)
                lineToRelative(3.158f, -3.257f)
                arcToRelative(0.345f, 0.345f, 0.0f, false, true, 0.506f, 0.0f)
                close()
                moveTo(12.786f, 9.443f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, true, 0.0f, 0.521f)
                lineToRelative(-3.659f, 3.783f)
                lineToRelative(-1.87f, -1.93f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, 0.0f, -0.521f)
                arcToRelative(0.349f, 0.349f, 0.0f, false, true, 0.505f, 0.0f)
                lineToRelative(1.36f, 1.403f)
                lineToRelative(3.158f, -3.256f)
                arcToRelative(0.345f, 0.345f, 0.0f, false, true, 0.506f, 0.0f)
                close()
                moveTo(12.786f, 4.333f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, true, 0.0f, 0.52f)
                lineTo(9.127f, 8.638f)
                lineToRelative(-1.87f, -1.93f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, 0.0f, -0.521f)
                arcToRelative(0.349f, 0.349f, 0.0f, false, true, 0.505f, 0.0f)
                lineToRelative(1.36f, 1.403f)
                lineToRelative(3.158f, -3.257f)
                arcToRelative(0.345f, 0.345f, 0.0f, false, true, 0.506f, 0.0f)
                close()
            }
        }
        .build()
        return _listDocumentLight!!
    }

private var _listDocumentLight: ImageVector? = null
