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

public val FilledGroup.InternetPendriveFilled: ImageVector
    get() {
        if (_internetPendriveFilled != null) {
            return _internetPendriveFilled!!
        }
        _internetPendriveFilled = Builder(name = "InternetPendriveFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 6.56f)
                curveToRelative(-5.75f, 0.0f, -8.548f, 2.855f, -8.548f, 8.731f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.6f, 0.614f)
                arcTo(0.607f, 0.607f, 0.0f, false, true, 2.0f, 15.29f)
                curveToRelative(0.0f, -6.515f, 3.373f, -9.958f, 9.75f, -9.958f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, 0.603f, 0.614f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.602f, 0.613f)
                close()
                moveTo(12.333f, 9.263f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.6f, 0.614f)
                curveToRelative(-3.59f, 0.0f, -5.335f, 1.784f, -5.335f, 5.45f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, -0.6f, 0.614f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.603f, -0.613f)
                verticalLineToRelative(-0.003f)
                curveToRelative(0.0f, -4.37f, 2.26f, -6.678f, 6.54f, -6.678f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, true, 0.6f, 0.616f)
                close()
                moveTo(20.485f, 16.807f)
                verticalLineToRelative(-2.941f)
                arcToRelative(0.158f, 0.158f, 0.0f, false, false, -0.126f, -0.149f)
                horizontalLineToRelative(-0.748f)
                verticalLineToRelative(3.241f)
                horizontalLineToRelative(0.736f)
                curveToRelative(0.076f, 0.0f, 0.138f, -0.067f, 0.138f, -0.151f)
                close()
                moveTo(20.336f, 12.49f)
                curveToRelative(0.728f, 0.0f, 1.333f, 0.61f, 1.35f, 1.364f)
                verticalLineToRelative(2.953f)
                curveToRelative(0.0f, 0.759f, -0.602f, 1.378f, -1.339f, 1.378f)
                horizontalLineToRelative(-0.804f)
                arcToRelative(1.542f, 1.542f, 0.0f, false, true, -1.462f, 1.092f)
                lineTo(12.23f, 19.277f)
                curveToRelative(-2.3f, -0.084f, -3.62f, -1.518f, -3.62f, -3.93f)
                curveToRelative(0.0f, -2.417f, 1.32f, -3.846f, 3.623f, -3.921f)
                horizontalLineToRelative(5.84f)
                curveToRelative(0.672f, 0.0f, 1.244f, 0.445f, 1.454f, 1.064f)
                horizontalLineToRelative(0.81f)
                close()
                moveTo(11.661f, 14.63f)
                curveToRelative(-0.448f, 0.0f, -0.74f, 0.238f, -0.74f, 0.75f)
                curveToRelative(0.0f, 0.247f, 0.068f, 0.43f, 0.188f, 0.553f)
                curveToRelative(0.13f, 0.134f, 0.32f, 0.199f, 0.552f, 0.199f)
                curveToRelative(0.233f, 0.0f, 0.423f, -0.065f, 0.552f, -0.2f)
                curveToRelative(0.12f, -0.123f, 0.188f, -0.305f, 0.188f, -0.551f)
                curveToRelative(0.0f, -0.513f, -0.292f, -0.75f, -0.74f, -0.75f)
                close()
            }
        }
        .build()
        return _internetPendriveFilled!!
    }

private var _internetPendriveFilled: ImageVector? = null
