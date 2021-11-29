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

public val LightGroup.InvoicePlanFileLight: ImageVector
    get() {
        if (_invoicePlanFileLight != null) {
            return _invoicePlanFileLight!!
        }
        _invoicePlanFileLight = Builder(name = "InvoicePlanFileLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.364f, 2.156f)
                curveToRelative(0.024f, 0.0f, 0.046f, 0.003f, 0.068f, 0.009f)
                lineToRelative(-0.068f, -0.009f)
                arcToRelative(0.279f, 0.279f, 0.0f, false, true, 0.184f, 0.07f)
                arcToRelative(0.09f, 0.09f, 0.0f, false, true, 0.015f, 0.011f)
                lineTo(19.025f, 7.7f)
                curveToRelative(0.022f, 0.021f, 0.04f, 0.046f, 0.052f, 0.072f)
                lineToRelative(0.008f, 0.019f)
                curveToRelative(0.006f, 0.013f, 0.01f, 0.027f, 0.014f, 0.04f)
                arcToRelative(0.312f, 0.312f, 0.0f, false, true, 0.007f, 0.068f)
                verticalLineToRelative(13.109f)
                curveToRelative(0.0f, 0.44f, -0.386f, 0.826f, -0.826f, 0.826f)
                lineTo(5.717f, 21.834f)
                curveToRelative(-0.431f, 0.0f, -0.826f, -0.395f, -0.826f, -0.826f)
                lineTo(4.891f, 2.983f)
                curveToRelative(0.0f, -0.418f, 0.409f, -0.827f, 0.826f, -0.827f)
                horizontalLineToRelative(7.647f)
                close()
                moveTo(13.084f, 2.716f)
                lineTo(5.717f, 2.716f)
                curveToRelative(-0.106f, 0.0f, -0.266f, 0.16f, -0.266f, 0.267f)
                verticalLineToRelative(18.025f)
                curveToRelative(0.0f, 0.12f, 0.146f, 0.266f, 0.266f, 0.266f)
                lineTo(18.28f, 21.274f)
                curveToRelative(0.129f, 0.0f, 0.266f, -0.137f, 0.266f, -0.266f)
                lineTo(18.546f, 8.178f)
                horizontalLineToRelative(-2.45f)
                curveToRelative(-0.88f, 0.0f, -1.634f, -0.288f, -2.18f, -0.831f)
                curveToRelative(-0.546f, -0.544f, -0.832f, -1.297f, -0.832f, -2.18f)
                verticalLineToRelative(-2.45f)
                close()
                moveTo(16.095f, 17.996f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, 0.28f)
                lineTo(7.902f, 18.556f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, -0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, -0.28f)
                horizontalLineToRelative(8.193f)
                close()
                moveTo(16.095f, 14.994f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, 0.28f)
                lineTo(7.902f, 15.554f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, -0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, -0.28f)
                horizontalLineToRelative(8.193f)
                close()
                moveTo(16.095f, 11.988f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, 0.28f)
                lineTo(7.902f, 12.548f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, -0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, -0.28f)
                horizontalLineToRelative(8.193f)
                close()
                moveTo(18.151f, 7.618f)
                lineTo(13.644f, 3.111f)
                verticalLineToRelative(2.056f)
                curveToRelative(0.0f, 1.488f, 0.964f, 2.451f, 2.451f, 2.451f)
                horizontalLineToRelative(2.056f)
                close()
            }
        }
        .build()
        return _invoicePlanFileLight!!
    }

private var _invoicePlanFileLight: ImageVector? = null
