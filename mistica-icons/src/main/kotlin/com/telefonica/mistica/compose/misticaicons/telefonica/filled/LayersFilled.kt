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

public val FilledGroup.LayersFilled: ImageVector
    get() {
        if (_layersFilled != null) {
            return _layersFilled!!
        }
        _layersFilled = Builder(name = "LayersFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.773f, 19.066f)
                lineToRelative(-7.952f, -4.087f)
                lineToRelative(1.02f, -0.527f)
                lineToRelative(6.103f, 3.135f)
                curveToRelative(0.26f, 0.131f, 0.546f, 0.201f, 0.832f, 0.201f)
                curveToRelative(0.28f, 0.0f, 0.56f, -0.064f, 0.818f, -0.196f)
                lineToRelative(6.23f, -3.145f)
                lineToRelative(1.044f, 0.532f)
                lineToRelative(-8.095f, 4.087f)
                close()
                moveTo(11.773f, 4.662f)
                lineTo(19.865f, 8.782f)
                lineTo(11.773f, 12.867f)
                lineTo(3.821f, 8.783f)
                lineTo(11.773f, 4.663f)
                close()
                moveTo(3.821f, 11.881f)
                lineTo(4.841f, 11.354f)
                lineTo(10.944f, 14.492f)
                arcToRelative(1.814f, 1.814f, 0.0f, false, false, 1.65f, 0.005f)
                lineToRelative(6.23f, -3.146f)
                lineToRelative(1.044f, 0.533f)
                lineToRelative(-8.092f, 4.087f)
                lineToRelative(-7.955f, -4.09f)
                close()
                moveTo(21.686f, 11.884f)
                curveToRelative(0.0f, -0.642f, -0.344f, -1.224f, -0.888f, -1.552f)
                arcToRelative(1.808f, 1.808f, 0.0f, false, false, -0.106f, -3.171f)
                lineToRelative(-8.093f, -4.12f)
                arcToRelative(1.812f, 1.812f, 0.0f, false, false, -1.66f, 0.005f)
                lineToRelative(-7.953f, 4.12f)
                arcToRelative(1.824f, 1.824f, 0.0f, false, false, -0.983f, 1.622f)
                curveToRelative(0.003f, 0.64f, 0.344f, 1.219f, 0.885f, 1.544f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, false, -0.885f, 1.552f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, false, 0.885f, 1.546f)
                arcToRelative(1.812f, 1.812f, 0.0f, false, false, 0.104f, 3.17f)
                lineToRelative(7.952f, 4.085f)
                arcToRelative(1.814f, 1.814f, 0.0f, false, false, 1.65f, 0.005f)
                lineToRelative(8.092f, -4.086f)
                curveToRelative(0.614f, -0.309f, 1.0f, -0.936f, 1.0f, -1.622f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, false, -0.888f, -1.555f)
                curveToRelative(0.54f, -0.325f, 0.888f, -0.902f, 0.888f, -1.543f)
                close()
            }
        }
        .build()
        return _layersFilled!!
    }

private var _layersFilled: ImageVector? = null
