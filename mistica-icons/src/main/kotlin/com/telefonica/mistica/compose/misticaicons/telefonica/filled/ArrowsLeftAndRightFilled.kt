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

public val FilledGroup.ArrowsLeftAndRightFilled: ImageVector
    get() {
        if (_arrowsLeftAndRightFilled != null) {
            return _arrowsLeftAndRightFilled!!
        }
        _arrowsLeftAndRightFilled = Builder(name = "ArrowsLeftAndRightFilled", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.737f, 8.633f)
                curveToRelative(0.0f, 0.216f, -0.093f, 0.42f, -0.255f, 0.563f)
                lineToRelative(-4.21f, 4.16f)
                curveToRelative(-0.014f, 0.01f, -0.026f, 0.025f, -0.04f, 0.036f)
                arcToRelative(0.782f, 0.782f, 0.0f, false, true, -0.831f, 0.098f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, -0.437f, -0.683f)
                lineToRelative(-0.014f, -1.824f)
                lineToRelative(-2.902f, 0.006f)
                arcToRelative(1.206f, 1.206f, 0.0f, false, true, -1.205f, -1.202f)
                verticalLineToRelative(-2.32f)
                curveToRelative(0.0f, -0.663f, 0.538f, -1.2f, 1.202f, -1.2f)
                lineToRelative(2.905f, -0.004f)
                lineToRelative(0.014f, -1.823f)
                curveToRelative(0.0f, -0.294f, 0.17f, -0.56f, 0.437f, -0.684f)
                arcToRelative(0.788f, 0.788f, 0.0f, false, true, 0.87f, 0.138f)
                lineToRelative(4.214f, 4.179f)
                curveToRelative(0.162f, 0.14f, 0.252f, 0.344f, 0.252f, 0.56f)
                close()
                moveTo(11.905f, 14.008f)
                verticalLineToRelative(2.32f)
                curveToRelative(0.0f, 0.664f, -0.538f, 1.201f, -1.202f, 1.201f)
                lineToRelative(-2.902f, 0.003f)
                lineToRelative(-0.014f, 1.824f)
                curveToRelative(0.0f, 0.294f, -0.17f, 0.557f, -0.437f, 0.68f)
                arcToRelative(0.788f, 0.788f, 0.0f, false, true, -0.871f, -0.137f)
                lineToRelative(-4.21f, -4.174f)
                arcToRelative(0.756f, 0.756f, 0.0f, false, true, 0.0f, -1.126f)
                lineToRelative(4.21f, -4.154f)
                curveToRelative(0.014f, -0.01f, 0.025f, -0.025f, 0.04f, -0.036f)
                arcToRelative(0.782f, 0.782f, 0.0f, false, true, 0.831f, -0.098f)
                curveToRelative(0.266f, 0.123f, 0.437f, 0.39f, 0.437f, 0.683f)
                lineToRelative(0.014f, 1.821f)
                lineToRelative(2.9f, -0.005f)
                curveToRelative(0.666f, 0.0f, 1.204f, 0.537f, 1.204f, 1.198f)
                close()
            }
        }
        .build()
        return _arrowsLeftAndRightFilled!!
    }

private var _arrowsLeftAndRightFilled: ImageVector? = null
