package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.TvContentLight: ImageVector
    get() {
        if (_tvContentLight != null) {
            return _tvContentLight!!
        }
        _tvContentLight = Builder(name = "TvContentLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.315f, 17.297f)
                curveToRelative(-1.043f, 0.0f, -1.842f, -0.275f, -2.383f, -0.815f)
                curveToRelative(-0.518f, -0.522f, -0.782f, -1.28f, -0.782f, -2.25f)
                lineTo(2.15f, 8.146f)
                curveToRelative(0.0f, -0.97f, 0.264f, -1.722f, 0.782f, -2.236f)
                curveToRelative(0.536f, -0.532f, 1.337f, -0.8f, 2.38f, -0.8f)
                lineTo(18.678f, 5.1f)
                curveToRelative(1.043f, 0.0f, 1.844f, 0.269f, 2.38f, 0.801f)
                curveToRelative(0.518f, 0.516f, 0.782f, 1.269f, 0.782f, 2.236f)
                verticalLineToRelative(6.087f)
                curveToRelative(0.0f, 0.97f, -0.264f, 1.728f, -0.782f, 2.25f)
                curveToRelative(-0.538f, 0.54f, -1.34f, 0.814f, -2.383f, 0.814f)
                lineToRelative(-13.36f, 0.009f)
                close()
                moveTo(18.68f, 5.643f)
                lineToRelative(-13.366f, 0.008f)
                curveToRelative(-1.752f, 0.0f, -2.604f, 0.815f, -2.604f, 2.494f)
                verticalLineToRelative(6.088f)
                curveToRelative(0.0f, 0.825f, 0.21f, 1.453f, 0.625f, 1.871f)
                curveToRelative(0.429f, 0.432f, 1.093f, 0.65f, 1.979f, 0.65f)
                lineToRelative(13.366f, -0.009f)
                curveToRelative(0.883f, 0.0f, 1.55f, -0.217f, 1.979f, -0.649f)
                curveToRelative(0.415f, -0.416f, 0.625f, -1.046f, 0.625f, -1.872f)
                lineTo(21.284f, 8.137f)
                curveToRelative(-0.003f, -1.679f, -0.852f, -2.494f, -2.604f, -2.494f)
                close()
                moveTo(14.727f, 18.883f)
                lineTo(9.26f, 18.883f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, -0.28f, -0.272f)
                curveToRelative(0.0f, -0.149f, 0.126f, -0.271f, 0.28f, -0.271f)
                horizontalLineToRelative(5.47f)
                curveToRelative(0.153f, 0.0f, 0.28f, 0.122f, 0.28f, 0.271f)
                curveToRelative(0.0f, 0.15f, -0.127f, 0.272f, -0.28f, 0.272f)
                close()
            }
        }
        .build()
        return _tvContentLight!!
    }

private var _tvContentLight: ImageVector? = null
