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

public val FilledGroup.GarajeFilled: ImageVector
    get() {
        if (_garajeFilled != null) {
            return _garajeFilled!!
        }
        _garajeFilled = Builder(name = "GarajeFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.854f, 21.686f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(7.95f)
                verticalLineToRelative(2.05f)
                horizontalLineToRelative(-7.95f)
                close()
                moveTo(7.854f, 18.555f)
                lineTo(7.854f, 16.5f)
                horizontalLineToRelative(7.947f)
                verticalLineToRelative(2.054f)
                lineTo(7.854f, 18.554f)
                close()
                moveTo(7.854f, 15.297f)
                verticalLineToRelative(-2.053f)
                horizontalLineToRelative(7.947f)
                verticalLineToRelative(2.053f)
                lineTo(7.854f, 15.297f)
                close()
                moveTo(21.264f, 10.563f)
                curveToRelative(0.408f, 0.4f, 0.532f, 0.97f, 0.324f, 1.479f)
                curveToRelative(-0.232f, 0.566f, -0.81f, 0.933f, -1.47f, 0.933f)
                horizontalLineToRelative(-0.745f)
                verticalLineToRelative(7.274f)
                curveToRelative(0.0f, 0.793f, -0.704f, 1.434f, -1.57f, 1.434f)
                horizontalLineToRelative(-0.77f)
                verticalLineToRelative(-9.03f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, false, -0.616f, -0.617f)
                lineTo(7.238f, 12.036f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, false, -0.616f, 0.617f)
                verticalLineToRelative(9.033f)
                horizontalLineToRelative(-0.857f)
                curveToRelative(-0.866f, 0.0f, -1.569f, -0.644f, -1.569f, -1.434f)
                verticalLineToRelative(-7.274f)
                horizontalLineToRelative(-0.625f)
                curveToRelative(-0.66f, 0.0f, -1.238f, -0.367f, -1.47f, -0.933f)
                curveToRelative(-0.21f, -0.513f, -0.087f, -1.081f, 0.322f, -1.482f)
                lineToRelative(8.274f, -8.106f)
                curveToRelative(0.62f, -0.608f, 1.673f, -0.608f, 2.292f, 0.0f)
                lineToRelative(8.274f, 8.106f)
                close()
            }
        }
        .build()
        return _garajeFilled!!
    }

private var _garajeFilled: ImageVector? = null
