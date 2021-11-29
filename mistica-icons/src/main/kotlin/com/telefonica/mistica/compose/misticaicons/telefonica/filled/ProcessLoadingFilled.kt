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

public val FilledGroup.ProcessLoadingFilled: ImageVector
    get() {
        if (_processLoadingFilled != null) {
            return _processLoadingFilled!!
        }
        _processLoadingFilled = Builder(name = "ProcessLoadingFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2f, 12.65f)
                horizontalLineToRelative(-3.023f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 0.0f, -1.21f)
                horizontalLineToRelative(3.022f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 0.0f, 1.21f)
                close()
                moveTo(17.488f, 17.55f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, -0.852f, 0.002f)
                lineToRelative(-0.003f, -0.003f)
                lineToRelative(-2.137f, -2.14f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, 0.854f, -0.854f)
                lineToRelative(2.138f, 2.137f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, 0.0f, 0.857f)
                close()
                moveTo(12.65f, 7.831f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, -1.21f, 0.0f)
                lineTo(11.44f, 4.807f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 1.21f, 0.0f)
                verticalLineToRelative(3.025f)
                close()
                moveTo(12.566f, 19.2f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, -1.21f, 0.0f)
                verticalLineToRelative(-3.025f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 1.21f, 0.0f)
                verticalLineToRelative(3.025f)
                close()
                moveTo(9.45f, 15.35f)
                lineTo(7.31f, 17.49f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, -0.854f, -0.854f)
                lineTo(8.594f, 14.5f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, 0.855f, 0.022f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.0f, 0.83f)
                close()
                moveTo(4.203f, 11.961f)
                curveToRelative(0.0f, -0.333f, 0.272f, -0.605f, 0.605f, -0.605f)
                horizontalLineToRelative(3.025f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 0.0f, 1.21f)
                lineTo(4.807f, 12.566f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, -0.605f, -0.605f)
                close()
                moveTo(14.559f, 8.656f)
                lineTo(16.696f, 6.519f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, 0.854f, 0.854f)
                lineTo(15.41f, 9.51f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, -0.854f, 0.0f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, true, 0.003f, -0.854f)
                close()
                moveTo(12.0f, 2.16f)
                curveToRelative(-6.437f, 0.0f, -9.84f, 3.403f, -9.84f, 9.846f)
                curveToRelative(0.0f, 6.437f, 3.403f, 9.84f, 9.84f, 9.84f)
                curveToRelative(6.44f, 0.0f, 9.846f, -3.403f, 9.846f, -9.84f)
                curveToRelative(0.0f, -6.443f, -3.403f, -9.846f, -9.846f, -9.846f)
                close()
            }
        }
        .build()
        return _processLoadingFilled!!
    }

private var _processLoadingFilled: ImageVector? = null
