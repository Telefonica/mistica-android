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

public val RegularGroup.WarningRegular: ImageVector
    get() {
        if (_warningRegular != null) {
            return _warningRegular!!
        }
        _warningRegular = Builder(name = "WarningRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.479f, 21.613f)
                curveToRelative(2.752f, -0.05f, 9.147f, -1.086f, 9.147f, -9.586f)
                curveToRelative(0.0f, -8.504f, -6.433f, -9.578f, -9.2f, -9.644f)
                curveToRelative(-0.248f, -0.006f, -0.532f, -0.009f, -0.808f, -0.009f)
                horizontalLineToRelative(-0.19f)
                curveToRelative(-2.724f, 0.025f, -9.057f, 1.008f, -9.057f, 9.587f)
                curveToRelative(0.0f, 8.598f, 6.392f, 9.618f, 9.14f, 9.656f)
                lineToRelative(0.323f, 0.003f)
                curveToRelative(0.229f, 0.0f, 0.45f, -0.003f, 0.645f, -0.007f)
                close()
                moveTo(12.46f, 1.013f)
                curveToRelative(2.157f, 0.05f, 10.54f, 0.9f, 10.54f, 11.017f)
                curveToRelative(0.0f, 10.137f, -8.399f, 10.923f, -10.496f, 10.964f)
                curveToRelative(-0.2f, 0.003f, -0.432f, 0.006f, -0.664f, 0.006f)
                curveToRelative(-0.115f, 0.0f, -0.231f, -0.003f, -0.344f, -0.003f)
                curveTo(9.289f, 22.962f, 1.0f, 22.164f, 1.0f, 11.964f)
                curveTo(1.0f, 1.776f, 9.21f, 1.019f, 11.418f, 1.0f)
                horizontalLineToRelative(0.2f)
                curveToRelative(0.288f, 0.0f, 0.585f, 0.003f, 0.842f, 0.013f)
                close()
                moveTo(11.997f, 15.905f)
                arcToRelative(0.689f, 0.689f, 0.0f, false, true, -0.689f, -0.689f)
                lineTo(11.308f, 5.72f)
                arcToRelative(0.689f, 0.689f, 0.0f, false, true, 1.378f, 0.0f)
                verticalLineToRelative(9.496f)
                arcToRelative(0.693f, 0.693f, 0.0f, false, true, -0.69f, 0.689f)
                close()
                moveTo(11.997f, 16.84f)
                curveToRelative(0.432f, 0.0f, 0.782f, 0.35f, 0.786f, 0.783f)
                curveToRelative(0.0f, 0.432f, -0.351f, 0.782f, -0.783f, 0.785f)
                horizontalLineToRelative(-0.003f)
                arcToRelative(0.783f, 0.783f, 0.0f, false, true, 0.0f, -1.568f)
                close()
            }
        }
        .build()
        return _warningRegular!!
    }

private var _warningRegular: ImageVector? = null
