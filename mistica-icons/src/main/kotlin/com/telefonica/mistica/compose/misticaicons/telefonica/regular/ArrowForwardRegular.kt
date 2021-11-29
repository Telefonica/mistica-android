package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.ArrowForwardRegular: ImageVector
    get() {
        if (_arrowForwardRegular != null) {
            return _arrowForwardRegular!!
        }
        _arrowForwardRegular = Builder(name = "ArrowForwardRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.949f, 12.195f)
                arcToRelative(0.676f, 0.676f, 0.0f, false, false, 0.0f, -0.517f)
                curveToRelative(-0.016f, -0.041f, -0.046f, -0.07f, -0.066f, -0.105f)
                curveToRelative(-0.023f, -0.036f, -0.04f, -0.075f, -0.071f, -0.11f)
                lineTo(12.95f, 4.216f)
                arcToRelative(0.686f, 0.686f, 0.0f, true, false, -0.999f, 0.943f)
                lineToRelative(5.767f, 6.09f)
                horizontalLineTo(4.662f)
                arcToRelative(0.688f, 0.688f, 0.0f, false, false, 0.0f, 1.375f)
                horizontalLineToRelative(13.057f)
                lineToRelative(-5.893f, 6.22f)
                arcToRelative(0.688f, 0.688f, 0.0f, false, false, 0.025f, 0.97f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.972f, -0.026f)
                lineToRelative(6.989f, -7.38f)
                curveToRelative(0.032f, -0.033f, 0.045f, -0.074f, 0.07f, -0.11f)
                curveToRelative(0.021f, -0.034f, 0.05f, -0.064f, 0.067f, -0.102f)
            }
        }
        .build()
        return _arrowForwardRegular!!
    }

private var _arrowForwardRegular: ImageVector? = null
