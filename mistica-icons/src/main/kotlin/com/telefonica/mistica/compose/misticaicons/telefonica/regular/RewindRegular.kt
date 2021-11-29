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

public val RegularGroup.RewindRegular: ImageVector
    get() {
        if (_rewindRegular != null) {
            return _rewindRegular!!
        }
        _rewindRegular = Builder(name = "RewindRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 2.15f)
                curveToRelative(3.129f, 0.0f, 5.563f, 0.818f, 7.238f, 2.429f)
                curveToRelative(1.737f, 1.675f, 2.616f, 4.17f, 2.616f, 7.425f)
                curveToRelative(0.0f, 3.252f, -0.88f, 5.751f, -2.616f, 7.423f)
                curveToRelative(-1.675f, 1.61f, -4.11f, 2.426f, -7.238f, 2.426f)
                curveToRelative(-3.13f, 0.0f, -5.563f, -0.818f, -7.236f, -2.429f)
                curveToRelative(-1.733f, -1.672f, -2.613f, -4.168f, -2.613f, -7.422f)
                curveToRelative(0.0f, -3.253f, 0.88f, -5.751f, 2.613f, -7.426f)
                curveTo(6.436f, 2.968f, 8.87f, 2.15f, 12.0f, 2.15f)
                close()
                moveTo(11.999f, 3.24f)
                curveToRelative(-5.813f, 0.0f, -8.76f, 2.95f, -8.76f, 8.764f)
                curveToRelative(0.0f, 5.813f, 2.947f, 8.76f, 8.76f, 8.76f)
                curveToRelative(5.815f, 0.0f, 8.764f, -2.947f, 8.764f, -8.76f)
                curveTo(20.761f, 6.19f, 17.813f, 3.24f, 12.0f, 3.24f)
                close()
                moveTo(11.287f, 8.223f)
                arcToRelative(0.558f, 0.558f, 0.0f, false, true, 0.286f, 0.487f)
                lineToRelative(-0.002f, 2.636f)
                arcToRelative(0.554f, 0.554f, 0.0f, false, true, 0.134f, -0.112f)
                lineToRelative(4.988f, -2.997f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, 0.85f, 0.479f)
                verticalLineToRelative(5.966f)
                curveToRelative(0.0f, 0.202f, -0.11f, 0.387f, -0.284f, 0.488f)
                arcToRelative(0.578f, 0.578f, 0.0f, false, true, -0.277f, 0.072f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.286f, -0.078f)
                lineToRelative(-4.989f, -2.97f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, -0.135f, -0.113f)
                lineToRelative(0.001f, 2.596f)
                curveToRelative(0.0f, 0.201f, -0.11f, 0.386f, -0.283f, 0.487f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, -0.277f, 0.073f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.286f, -0.079f)
                lineTo(5.738f, 12.19f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.274f, -0.479f)
                curveToRelative(0.0f, -0.196f, 0.103f, -0.38f, 0.271f, -0.482f)
                lineToRelative(4.99f, -2.997f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, 0.562f, -0.008f)
                close()
                moveTo(16.422f, 9.705f)
                lineTo(13.082f, 11.71f)
                lineTo(16.422f, 13.696f)
                lineTo(16.422f, 9.705f)
                close()
                moveTo(10.452f, 9.702f)
                lineTo(7.116f, 11.705f)
                lineTo(10.453f, 13.693f)
                lineTo(10.453f, 9.702f)
                close()
            }
        }
        .build()
        return _rewindRegular!!
    }

private var _rewindRegular: ImageVector? = null
