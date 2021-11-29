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

public val FilledGroup.OpenFileFilled: ImageVector
    get() {
        if (_openFileFilled != null) {
            return _openFileFilled!!
        }
        _openFileFilled = Builder(name = "OpenFileFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.415f, 5.775f)
                horizontalLineToRelative(6.128f)
                curveToRelative(0.107f, 0.0f, 0.18f, 0.064f, 0.18f, 0.123f)
                verticalLineToRelative(1.028f)
                curveToRelative(0.0f, 0.344f, 0.277f, 0.624f, 0.619f, 0.624f)
                horizontalLineToRelative(7.722f)
                curveToRelative(0.107f, 0.0f, 0.18f, 0.065f, 0.18f, 0.171f)
                lineToRelative(0.064f, 0.86f)
                verticalLineToRelative(0.003f)
                lineTo(5.591f, 8.584f)
                curveToRelative(-0.72f, 0.0f, -1.31f, 0.571f, -1.345f, 1.289f)
                lineToRelative(-0.557f, 3.02f)
                lineToRelative(-0.45f, -6.995f)
                curveToRelative(0.0f, -0.056f, 0.07f, -0.123f, 0.176f, -0.123f)
                close()
                moveTo(20.339f, 8.587f)
                horizontalLineToRelative(-0.807f)
                curveToRelative(0.003f, -0.034f, 0.014f, -0.065f, 0.011f, -0.098f)
                lineToRelative(-0.064f, -0.813f)
                curveToRelative(0.0f, -0.759f, -0.636f, -1.375f, -1.417f, -1.375f)
                lineTo(10.96f, 6.301f)
                verticalLineToRelative(-0.4f)
                curveToRelative(0.0f, -0.76f, -0.636f, -1.376f, -1.418f, -1.376f)
                lineTo(3.415f, 4.525f)
                arcTo(1.402f, 1.402f, 0.0f, false, false, 2.0f, 5.915f)
                verticalLineToRelative(0.025f)
                lineToRelative(0.77f, 11.95f)
                lineToRelative(-0.002f, 0.044f)
                curveToRelative(0.0f, 0.745f, 0.605f, 1.356f, 1.347f, 1.356f)
                horizontalLineToRelative(14.77f)
                curveToRelative(0.72f, 0.0f, 1.311f, -0.574f, 1.345f, -1.289f)
                lineToRelative(1.448f, -7.946f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, false, 0.011f, -0.115f)
                arcToRelative(1.355f, 1.355f, 0.0f, false, false, -1.35f, -1.353f)
                close()
            }
        }
        .build()
        return _openFileFilled!!
    }

private var _openFileFilled: ImageVector? = null
