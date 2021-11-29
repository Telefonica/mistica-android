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

public val RegularGroup.CloseRegular: ImageVector
    get() {
        if (_closeRegular != null) {
            return _closeRegular!!
        }
        _closeRegular = Builder(name = "CloseRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.788f, 6.212f)
                curveToRelative(0.259f, 0.258f, 0.28f, 0.664f, 0.065f, 0.947f)
                lineToRelative(-0.065f, 0.074f)
                lineTo(13.022f, 12.0f)
                lineToRelative(4.766f, 4.767f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, -0.947f, 1.086f)
                lineToRelative(-0.074f, -0.065f)
                lineTo(12.0f, 13.022f)
                lineToRelative(-4.767f, 4.766f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, -1.086f, -0.947f)
                lineToRelative(0.065f, -0.074f)
                lineTo(10.978f, 12.0f)
                lineTo(6.212f, 7.233f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 0.947f, -1.086f)
                lineToRelative(0.074f, 0.065f)
                lineTo(12.0f, 10.978f)
                lineToRelative(4.767f, -4.766f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, 1.021f, 0.0f)
                close()
            }
        }
        .build()
        return _closeRegular!!
    }

private var _closeRegular: ImageVector? = null
