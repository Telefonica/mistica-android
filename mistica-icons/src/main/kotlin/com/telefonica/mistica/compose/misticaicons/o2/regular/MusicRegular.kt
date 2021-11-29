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

public val RegularGroup.MusicRegular: ImageVector
    get() {
        if (_musicRegular != null) {
            return _musicRegular!!
        }
        _musicRegular = Builder(name = "MusicRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.755f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.29f, -0.604f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, -0.652f, -0.113f)
                lineTo(8.35f, 5.822f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, false, -0.544f, 0.718f)
                verticalLineToRelative(9.646f)
                arcToRelative(3.42f, 3.42f, 0.0f, false, false, -2.178f, -0.755f)
                curveTo(3.63f, 15.43f, 2.0f, 17.134f, 2.0f, 19.21f)
                reflectiveCurveTo(3.627f, 23.0f, 5.624f, 23.0f)
                reflectiveCurveToRelative(3.628f, -1.703f, 3.628f, -3.78f)
                lineTo(9.252f, 7.11f)
                lineTo(20.51f, 3.741f)
                verticalLineToRelative(9.042f)
                arcToRelative(3.42f, 3.42f, 0.0f, false, false, -2.178f, -0.755f)
                curveToRelative(-1.997f, 0.0f, -3.628f, 1.703f, -3.628f, 3.78f)
                reflectiveCurveToRelative(1.635f, 3.78f, 3.628f, 3.78f)
                reflectiveCurveToRelative(3.628f, -1.703f, 3.628f, -3.78f)
                curveTo(22.0f, 15.771f, 22.0f, 2.755f, 22.0f, 2.755f)
                close()
                moveTo(5.66f, 21.485f)
                curveToRelative(-1.2f, 0.0f, -2.178f, -1.023f, -2.178f, -2.27f)
                curveToRelative(0.0f, -1.246f, 0.982f, -2.27f, 2.178f, -2.27f)
                reflectiveCurveToRelative(2.179f, 1.024f, 2.179f, 2.27f)
                curveToRelative(0.0f, 1.247f, -0.979f, 2.27f, -2.179f, 2.27f)
                close()
                moveTo(18.368f, 18.078f)
                curveToRelative(-1.2f, 0.0f, -2.178f, -1.023f, -2.178f, -2.27f)
                curveToRelative(0.0f, -1.246f, 0.982f, -2.27f, 2.178f, -2.27f)
                reflectiveCurveToRelative(2.178f, 1.024f, 2.178f, 2.27f)
                curveToRelative(0.0f, 1.25f, -0.982f, 2.27f, -2.178f, 2.27f)
                close()
            }
        }
        .build()
        return _musicRegular!!
    }

private var _musicRegular: ImageVector? = null
