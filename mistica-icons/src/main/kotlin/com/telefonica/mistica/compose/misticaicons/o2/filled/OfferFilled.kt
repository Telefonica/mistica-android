package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.OfferFilled: ImageVector
    get() {
        if (_offerFilled != null) {
            return _offerFilled!!
        }
        _offerFilled = Builder(name = "OfferFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 14.002f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, 0.164f, 0.741f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.567f, 0.506f)
                lineToRelative(-3.328f, 0.669f)
                lineToRelative(0.389f, 3.378f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.057f, 0.77f)
                lineToRelative(-3.084f, -1.415f)
                lineToRelative(-1.666f, 2.964f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -1.306f, 0.0f)
                lineToRelative(-1.667f, -2.964f)
                lineToRelative(-3.084f, 1.415f)
                arcToRelative(0.736f, 0.736f, 0.0f, false, true, -0.754f, -0.077f)
                arcToRelative(0.743f, 0.743f, 0.0f, false, true, -0.302f, -0.693f)
                lineToRelative(0.393f, -3.378f)
                lineToRelative(-3.328f, -0.67f)
                arcToRelative(0.756f, 0.756f, 0.0f, false, true, -0.567f, -0.505f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.163f, -0.74f)
                lineTo(4.5f, 11.5f)
                lineTo(2.2f, 8.998f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -0.164f, -0.741f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 0.567f, -0.506f)
                lineToRelative(3.328f, -0.669f)
                lineToRelative(-0.393f, -3.378f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, 0.302f, -0.693f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, true, 0.754f, -0.077f)
                lineTo(9.678f, 4.35f)
                lineToRelative(1.666f, -2.964f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 1.306f, 0.0f)
                lineToRelative(1.667f, 2.964f)
                lineToRelative(3.084f, -1.415f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.754f, 0.077f)
                curveToRelative(0.221f, 0.16f, 0.336f, 0.424f, 0.303f, 0.693f)
                lineToRelative(-0.39f, 3.378f)
                lineToRelative(3.33f, 0.67f)
                curveToRelative(0.263f, 0.052f, 0.48f, 0.245f, 0.566f, 0.505f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.163f, 0.74f)
                lineTo(19.5f, 11.5f)
                lineToRelative(2.3f, 2.502f)
                close()
            }
        }
        .build()
        return _offerFilled!!
    }

private var _offerFilled: ImageVector? = null
