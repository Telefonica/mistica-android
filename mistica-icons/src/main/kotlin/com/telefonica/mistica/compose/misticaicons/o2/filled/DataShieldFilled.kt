package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.DataShieldFilled: ImageVector
    get() {
        if (_dataShieldFilled != null) {
            return _dataShieldFilled!!
        }
        _dataShieldFilled = Builder(name = "DataShieldFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.557f, 11.126f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, true, -0.74f, -0.75f)
                curveToRelative(0.0f, -2.29f, -1.816f, -4.124f, -4.073f, -4.124f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, true, -0.74f, -0.749f)
                curveToRelative(0.0f, -0.412f, 0.333f, -0.749f, 0.74f, -0.749f)
                curveToRelative(3.073f, 0.0f, 5.557f, 2.511f, 5.557f, 5.627f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.744f, 0.745f)
                close()
                moveTo(21.26f, 11.126f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, true, -0.74f, -0.75f)
                curveToRelative(0.0f, -4.35f, -3.48f, -7.878f, -7.78f, -7.878f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, true, -0.74f, -0.749f)
                curveToRelative(0.0f, -0.413f, 0.332f, -0.749f, 0.74f, -0.749f)
                curveTo(17.85f, 1.0f, 22.0f, 5.201f, 22.0f, 10.377f)
                arcToRelative(0.742f, 0.742f, 0.0f, false, true, -0.74f, 0.749f)
                close()
                moveTo(13.223f, 8.499f)
                curveToRelative(-2.48f, 0.0f, -4.41f, -1.762f, -4.447f, -1.762f)
                lineTo(8.074f, 6.1f)
                lineToRelative(-0.484f, 0.413f)
                lineToRelative(-0.185f, 0.187f)
                curveToRelative(-0.038f, 0.0f, -1.963f, 1.8f, -4.447f, 1.8f)
                lineTo(2.0f, 8.5f)
                verticalLineToRelative(7.576f)
                curveToRelative(0.0f, 3.49f, 3.186f, 4.989f, 5.595f, 5.776f)
                lineToRelative(0.517f, 0.149f)
                lineToRelative(0.517f, -0.149f)
                curveToRelative(2.408f, -0.749f, 5.595f, -2.252f, 5.595f, -5.737f)
                lineTo(14.224f, 8.499f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(11.668f, 12.287f)
                lineTo(6.443f, 17.54f)
                lineToRelative(-2.257f, -2.29f)
                arcToRelative(0.547f, 0.547f, 0.0f, false, true, 0.0f, -0.788f)
                arcToRelative(0.531f, 0.531f, 0.0f, false, true, 0.777f, 0.0f)
                lineToRelative(1.447f, 1.465f)
                lineToRelative(4.41f, -4.465f)
                arcToRelative(0.531f, 0.531f, 0.0f, false, true, 0.777f, 0.0f)
                curveToRelative(0.256f, 0.225f, 0.256f, 0.6f, 0.071f, 0.825f)
                close()
            }
        }
        .build()
        return _dataShieldFilled!!
    }

private var _dataShieldFilled: ImageVector? = null
