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

public val FilledGroup.WinnerFilled: ImageVector
    get() {
        if (_winnerFilled != null) {
            return _winnerFilled!!
        }
        _winnerFilled = Builder(name = "WinnerFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.567f, 15.691f)
                lineToRelative(-1.504f, 2.794f)
                curveToRelative(-0.103f, 0.18f, -0.072f, 0.395f, 0.036f, 0.574f)
                curveToRelative(0.139f, 0.179f, 0.349f, 0.252f, 0.524f, 0.179f)
                lineToRelative(2.834f, -0.895f)
                lineToRelative(0.873f, 3.262f)
                arcToRelative(0.588f, 0.588f, 0.0f, false, false, 0.42f, 0.395f)
                horizontalLineToRelative(0.072f)
                curveToRelative(0.175f, 0.0f, 0.35f, -0.106f, 0.42f, -0.284f)
                lineToRelative(1.819f, -3.368f)
                curveToRelative(-2.172f, -0.074f, -4.097f, -1.078f, -5.494f, -2.657f)
                close()
                moveTo(17.387f, 15.691f)
                curveToRelative(-1.397f, 1.579f, -3.394f, 2.583f, -5.597f, 2.652f)
                lineToRelative(1.925f, 3.368f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, 0.421f, 0.252f)
                horizontalLineToRelative(0.072f)
                curveToRelative(0.21f, -0.036f, 0.385f, -0.179f, 0.385f, -0.394f)
                lineToRelative(0.873f, -3.263f)
                lineToRelative(2.901f, 0.895f)
                curveToRelative(0.21f, 0.074f, 0.385f, 0.0f, 0.524f, -0.179f)
                arcToRelative(0.501f, 0.501f, 0.0f, false, false, 0.036f, -0.573f)
                lineToRelative(-1.54f, -2.758f)
                close()
                moveTo(11.513f, 3.0f)
                curveTo(7.667f, 3.0f, 4.52f, 6.226f, 4.52f, 10.167f)
                reflectiveCurveToRelative(3.147f, 7.176f, 6.993f, 7.176f)
                curveToRelative(3.846f, 0.0f, 6.993f, -3.226f, 6.993f, -7.167f)
                reflectiveCurveTo(15.394f, 3.0f, 11.513f, 3.0f)
                close()
                moveTo(15.045f, 7.84f)
                lineTo(9.905f, 13.181f)
                lineTo(7.421f, 10.635f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, 0.0f, -0.753f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, true, 0.734f, 0.0f)
                lineToRelative(1.75f, 1.794f)
                lineToRelative(4.406f, -4.588f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, true, 0.734f, 0.0f)
                curveToRelative(0.21f, 0.216f, 0.21f, 0.537f, 0.0f, 0.753f)
                close()
            }
        }
        .build()
        return _winnerFilled!!
    }

private var _winnerFilled: ImageVector? = null
