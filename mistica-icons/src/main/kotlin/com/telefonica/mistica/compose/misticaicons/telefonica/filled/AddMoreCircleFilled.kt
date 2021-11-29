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

public val FilledGroup.AddMoreCircleFilled: ImageVector
    get() {
        if (_addMoreCircleFilled != null) {
            return _addMoreCircleFilled!!
        }
        _addMoreCircleFilled = Builder(name = "AddMoreCircleFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.982f, 12.714f)
                horizontalLineToRelative(-5.236f)
                verticalLineToRelative(5.248f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.503f, 0.0f)
                verticalLineToRelative(-5.248f)
                horizontalLineTo(6.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, true, true, 0.0f, -1.503f)
                horizontalLineToRelative(5.225f)
                verticalLineTo(6.038f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.503f, 0.0f)
                verticalLineToRelative(5.177f)
                horizontalLineToRelative(5.236f)
                curveToRelative(0.413f, 0.0f, 0.751f, 0.334f, 0.751f, 0.75f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, -0.75f, 0.749f)
                moveToRelative(-5.48f, -12.7f)
                curveTo(12.224f, 0.007f, 11.897f, 0.0f, 11.583f, 0.0f)
                horizontalLineToRelative(-0.216f)
                curveTo(8.956f, 0.02f, 0.0f, 0.847f, 0.0f, 11.962f)
                curveToRelative(0.0f, 11.13f, 9.04f, 12.0f, 11.452f, 12.035f)
                curveToRelative(0.126f, 0.003f, 0.26f, 0.003f, 0.39f, 0.003f)
                curveToRelative(0.249f, 0.0f, 0.494f, -0.003f, 0.706f, -0.007f)
                curveTo(14.84f, 23.953f, 24.0f, 23.092f, 24.0f, 12.034f)
                curveTo(24.003f, 0.997f, 14.854f, 0.068f, 12.504f, 0.014f)
            }
        }
        .build()
        return _addMoreCircleFilled!!
    }

private var _addMoreCircleFilled: ImageVector? = null
