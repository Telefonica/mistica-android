package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.ShareRegular: ImageVector
    get() {
        if (_shareRegular != null) {
            return _shareRegular!!
        }
        _shareRegular = Builder(name = "ShareRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.296f, 15.496f)
                arcToRelative(3.692f, 3.692f, 0.0f, false, false, -2.903f, 1.424f)
                lineToRelative(-6.114f, -3.44f)
                curveToRelative(0.083f, -0.314f, 0.129f, -0.642f, 0.129f, -0.986f)
                curveToRelative(0.0f, -0.454f, -0.08f, -0.89f, -0.228f, -1.298f)
                lineToRelative(6.204f, -3.14f)
                arcToRelative(3.683f, 3.683f, 0.0f, false, false, 2.912f, 1.435f)
                curveToRelative(2.04f, 0.0f, 3.704f, -1.684f, 3.704f, -3.75f)
                reflectiveCurveTo(20.337f, 2.0f, 18.296f, 2.0f)
                curveToRelative(-2.04f, 0.0f, -3.704f, 1.684f, -3.704f, 3.75f)
                curveToRelative(0.0f, 0.336f, 0.046f, 0.663f, 0.129f, 0.97f)
                lineTo(8.39f, 9.924f)
                arcToRelative(3.673f, 3.673f, 0.0f, false, false, -2.687f, -1.176f)
                curveTo(3.664f, 8.748f, 2.0f, 10.432f, 2.0f, 12.498f)
                reflectiveCurveToRelative(1.663f, 3.75f, 3.704f, 3.75f)
                arcToRelative(3.692f, 3.692f, 0.0f, false, false, 2.903f, -1.424f)
                lineToRelative(6.114f, 3.44f)
                arcToRelative(3.851f, 3.851f, 0.0f, false, false, -0.129f, 0.986f)
                curveToRelative(0.0f, 2.066f, 1.663f, 3.75f, 3.704f, 3.75f)
                curveTo(20.336f, 23.0f, 22.0f, 21.316f, 22.0f, 19.25f)
                reflectiveCurveToRelative(-1.663f, -3.754f, -3.704f, -3.754f)
                close()
                moveTo(18.296f, 3.499f)
                curveToRelative(1.224f, 0.0f, 2.223f, 1.008f, 2.223f, 2.25f)
                curveToRelative(0.0f, 1.244f, -0.995f, 2.252f, -2.223f, 2.252f)
                curveToRelative(-1.228f, 0.0f, -2.223f, -1.008f, -2.223f, -2.251f)
                curveToRelative(0.0f, -1.243f, 0.995f, -2.25f, 2.223f, -2.25f)
                close()
                moveTo(5.704f, 14.75f)
                curveToRelative(-1.224f, 0.0f, -2.223f, -1.008f, -2.223f, -2.251f)
                curveToRelative(0.0f, -1.239f, 0.995f, -2.25f, 2.223f, -2.25f)
                curveToRelative(1.228f, 0.0f, 2.223f, 1.007f, 2.223f, 2.25f)
                curveToRelative(0.0f, 1.239f, -0.995f, 2.25f, -2.223f, 2.25f)
                close()
                moveTo(18.296f, 21.498f)
                curveToRelative(-1.223f, 0.0f, -2.223f, -1.008f, -2.223f, -2.251f)
                curveToRelative(0.0f, -1.243f, 0.995f, -2.25f, 2.223f, -2.25f)
                curveToRelative(1.228f, 0.0f, 2.223f, 1.007f, 2.223f, 2.25f)
                reflectiveCurveToRelative(-1.0f, 2.25f, -2.223f, 2.25f)
                close()
            }
        }
        .build()
        return _shareRegular!!
    }

private var _shareRegular: ImageVector? = null
