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

public val RegularGroup.InvoicePlanFileRegular: ImageVector
    get() {
        if (_invoicePlanFileRegular != null) {
            return _invoicePlanFileRegular!!
        }
        _invoicePlanFileRegular = Builder(name = "InvoicePlanFileRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.999f, 2.0f)
                curveToRelative(0.142f, 0.0f, 0.282f, 0.056f, 0.386f, 0.154f)
                lineToRelative(5.462f, 5.182f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, 0.174f, 0.406f)
                verticalLineToRelative(12.843f)
                curveToRelative(0.0f, 0.589f, -0.518f, 1.107f, -1.106f, 1.107f)
                lineTo(5.618f, 21.692f)
                curveToRelative(-0.589f, 0.0f, -1.107f, -0.518f, -1.107f, -1.107f)
                lineTo(4.511f, 3.106f)
                curveTo(4.511f, 2.538f, 5.05f, 2.0f, 5.618f, 2.0f)
                horizontalLineToRelative(7.38f)
                close()
                moveTo(12.159f, 3.12f)
                lineTo(5.653f, 3.12f)
                arcToRelative(0.085f, 0.085f, 0.0f, false, false, -0.022f, 0.023f)
                lineTo(5.631f, 20.56f)
                curveToRelative(0.002f, 0.003f, 0.008f, 0.009f, 0.014f, 0.011f)
                horizontalLineToRelative(12.249f)
                lineToRelative(0.006f, -0.005f)
                lineTo(17.9f, 8.848f)
                lineTo(15.45f, 8.848f)
                curveToRelative(-0.956f, 0.0f, -1.78f, -0.316f, -2.376f, -0.915f)
                curveToRelative(-0.596f, -0.6f, -0.916f, -1.42f, -0.916f, -2.376f)
                lineTo(12.158f, 3.12f)
                close()
                moveTo(15.309f, 17.56f)
                curveToRelative(0.309f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.309f, -0.251f, 0.56f, -0.56f, 0.56f)
                horizontalLineToRelative(-7.1f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(7.1f)
                close()
                moveTo(15.309f, 14.557f)
                curveToRelative(0.309f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.309f, -0.251f, 0.56f, -0.56f, 0.56f)
                horizontalLineToRelative(-7.1f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(7.1f)
                close()
                moveTo(15.309f, 11.552f)
                curveToRelative(0.309f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, -0.251f, 0.56f, -0.56f, 0.56f)
                horizontalLineToRelative(-7.1f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(7.1f)
                close()
                moveTo(13.279f, 3.598f)
                verticalLineToRelative(1.96f)
                curveToRelative(0.0f, 0.652f, 0.204f, 1.198f, 0.588f, 1.582f)
                curveToRelative(0.384f, 0.384f, 0.933f, 0.588f, 1.583f, 0.588f)
                horizontalLineToRelative(2.181f)
                lineToRelative(-4.353f, -4.13f)
                close()
            }
        }
        .build()
        return _invoicePlanFileRegular!!
    }

private var _invoicePlanFileRegular: ImageVector? = null
