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

public val FilledGroup.EmergencyCrossFilled: ImageVector
    get() {
        if (_emergencyCrossFilled != null) {
            return _emergencyCrossFilled!!
        }
        _emergencyCrossFilled = Builder(name = "EmergencyCrossFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.277f, 8.571f)
                lineToRelative(-5.168f, 0.003f)
                lineToRelative(-0.003f, -5.162f)
                curveToRelative(0.0f, -0.737f, -0.574f, -1.41f, -1.204f, -1.41f)
                lineTo(9.773f, 2.0f)
                curveToRelative(-0.63f, 0.0f, -1.204f, 0.672f, -1.204f, 1.409f)
                lineToRelative(0.002f, 5.165f)
                lineToRelative(-5.162f, 0.003f)
                curveTo(2.659f, 8.577f, 2.0f, 9.14f, 2.0f, 9.781f)
                verticalLineToRelative(4.13f)
                curveToRelative(0.0f, 0.64f, 0.658f, 1.204f, 1.409f, 1.204f)
                lineToRelative(5.168f, -0.003f)
                lineToRelative(0.003f, 5.162f)
                curveToRelative(0.0f, 0.751f, 0.563f, 1.41f, 1.204f, 1.41f)
                horizontalLineToRelative(4.13f)
                curveToRelative(0.64f, 0.0f, 1.204f, -0.659f, 1.204f, -1.41f)
                lineToRelative(-0.003f, -5.168f)
                lineToRelative(5.162f, -0.002f)
                curveToRelative(0.737f, 0.0f, 1.41f, -0.575f, 1.41f, -1.205f)
                verticalLineTo(9.77f)
                curveToRelative(0.0f, -0.627f, -0.673f, -1.199f, -1.41f, -1.199f)
            }
        }
        .build()
        return _emergencyCrossFilled!!
    }

private var _emergencyCrossFilled: ImageVector? = null
