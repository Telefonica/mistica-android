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

public val FilledGroup.CopyFilled: ImageVector
    get() {
        if (_copyFilled != null) {
            return _copyFilled!!
        }
        _copyFilled = Builder(name = "CopyFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.275f, 14.571f)
                lineTo(3.275f, 3.507f)
                curveToRelative(0.0f, -0.129f, 0.106f, -0.235f, 0.235f, -0.235f)
                lineTo(14.57f, 3.272f)
                curveToRelative(0.13f, 0.0f, 0.236f, 0.106f, 0.236f, 0.235f)
                verticalLineToRelative(11.064f)
                arcToRelative(0.237f, 0.237f, 0.0f, false, true, -0.236f, 0.236f)
                lineTo(3.51f, 14.807f)
                arcToRelative(0.233f, 0.233f, 0.0f, false, true, -0.235f, -0.236f)
                close()
                moveTo(20.227f, 7.602f)
                horizontalLineToRelative(-4.143f)
                lineTo(16.084f, 3.51f)
                curveToRelative(0.0f, -0.832f, -0.678f, -1.51f, -1.51f, -1.51f)
                lineTo(3.513f, 2.0f)
                curveToRelative(-0.832f, 0.0f, -1.51f, 0.678f, -1.51f, 1.51f)
                verticalLineToRelative(11.064f)
                curveToRelative(0.0f, 0.832f, 0.678f, 1.51f, 1.51f, 1.51f)
                horizontalLineToRelative(4.09f)
                verticalLineToRelative(4.143f)
                curveToRelative(0.0f, 0.804f, 0.655f, 1.46f, 1.459f, 1.46f)
                horizontalLineToRelative(11.162f)
                curveToRelative(0.804f, 0.0f, 1.46f, -0.656f, 1.46f, -1.46f)
                lineTo(21.684f, 9.062f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, false, -1.457f, -1.46f)
                close()
            }
        }
        .build()
        return _copyFilled!!
    }

private var _copyFilled: ImageVector? = null
