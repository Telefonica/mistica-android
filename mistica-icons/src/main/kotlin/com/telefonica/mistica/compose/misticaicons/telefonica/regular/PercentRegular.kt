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

public val RegularGroup.PercentRegular: ImageVector
    get() {
        if (_percentRegular != null) {
            return _percentRegular!!
        }
        _percentRegular = Builder(name = "PercentRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.315f, 15.335f)
                curveToRelative(0.457f, 0.0f, 0.51f, -0.053f, 0.51f, -0.507f)
                curveToRelative(0.0f, -0.451f, -0.056f, -0.507f, -0.51f, -0.507f)
                curveToRelative(-0.456f, 0.0f, -0.507f, 0.05f, -0.507f, 0.507f)
                curveToRelative(0.0f, 0.454f, 0.05f, 0.507f, 0.507f, 0.507f)
                close()
                moveTo(14.315f, 13.172f)
                curveToRelative(1.045f, 0.0f, 1.659f, 0.53f, 1.659f, 1.659f)
                reflectiveCurveToRelative(-0.611f, 1.655f, -1.659f, 1.655f)
                curveToRelative(-1.045f, 0.0f, -1.655f, -0.526f, -1.655f, -1.655f)
                curveToRelative(0.0f, -1.132f, 0.608f, -1.659f, 1.655f, -1.659f)
                close()
                moveTo(9.671f, 8.775f)
                curveToRelative(-0.457f, 0.0f, -0.507f, 0.05f, -0.507f, 0.507f)
                curveToRelative(0.0f, 0.453f, 0.05f, 0.507f, 0.507f, 0.507f)
                reflectiveCurveToRelative(0.507f, -0.05f, 0.507f, -0.507f)
                curveToRelative(0.0f, -0.451f, -0.056f, -0.507f, -0.507f, -0.507f)
                close()
                moveTo(9.671f, 10.937f)
                curveToRelative(-1.048f, 0.0f, -1.655f, -0.53f, -1.655f, -1.655f)
                curveToRelative(0.0f, -1.13f, 0.61f, -1.659f, 1.655f, -1.659f)
                reflectiveCurveToRelative(1.658f, 0.53f, 1.658f, 1.659f)
                curveToRelative(0.0f, 1.128f, -0.613f, 1.655f, -1.658f, 1.655f)
                close()
                moveTo(15.016f, 7.15f)
                arcToRelative(0.571f, 0.571f, 0.0f, false, true, 0.8f, -0.104f)
                lineToRelative(0.003f, 0.003f)
                curveToRelative(0.25f, 0.193f, 0.297f, 0.555f, 0.101f, 0.804f)
                lineToRelative(-6.94f, 8.93f)
                arcToRelative(0.575f, 0.575f, 0.0f, true, true, -0.908f, -0.706f)
                lineToRelative(6.944f, -8.927f)
                close()
                moveTo(11.99f, 20.607f)
                curveToRelative(5.796f, 0.0f, 8.617f, -2.818f, 8.617f, -8.611f)
                curveToRelative(0.0f, -5.798f, -2.818f, -8.616f, -8.617f, -8.616f)
                curveToRelative(-5.792f, 0.0f, -8.61f, 2.818f, -8.61f, 8.616f)
                curveToRelative(0.0f, 5.793f, 2.818f, 8.61f, 8.61f, 8.61f)
                close()
                moveTo(11.99f, 2.15f)
                curveToRelative(6.219f, 0.0f, 9.846f, 3.14f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.706f, -3.627f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.218f, 0.0f, -9.84f, -3.134f, -9.84f, -9.84f)
                curveToRelative(0.0f, -6.706f, 3.622f, -9.846f, 9.84f, -9.846f)
                close()
            }
        }
        .build()
        return _percentRegular!!
    }

private var _percentRegular: ImageVector? = null
