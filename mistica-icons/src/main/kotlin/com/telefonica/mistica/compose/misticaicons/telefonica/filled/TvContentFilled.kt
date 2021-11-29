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

public val FilledGroup.TvContentFilled: ImageVector
    get() {
        if (_tvContentFilled != null) {
            return _tvContentFilled!!
        }
        _tvContentFilled = Builder(name = "TvContentFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.396f, 17.374f)
                lineTo(5.59f, 17.374f)
                curveToRelative(-1.12f, 0.0f, -1.989f, -0.314f, -2.583f, -0.93f)
                curveToRelative(-0.568f, -0.594f, -0.857f, -1.44f, -0.857f, -2.515f)
                lineTo(2.15f, 7.93f)
                curveToRelative(0.0f, -2.201f, 1.221f, -3.411f, 3.44f, -3.411f)
                lineToRelative(12.806f, 0.008f)
                curveToRelative(2.219f, 0.0f, 3.44f, 1.213f, 3.44f, 3.412f)
                verticalLineToRelative(5.997f)
                curveToRelative(0.0f, 1.076f, -0.288f, 1.922f, -0.86f, 2.51f)
                curveToRelative(-0.594f, 0.616f, -1.462f, 0.927f, -2.58f, 0.927f)
                close()
                moveTo(14.446f, 19.573f)
                lineTo(9.532f, 19.573f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.309f, 0.252f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(4.916f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.251f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, -0.252f, 0.56f, -0.56f, 0.56f)
                close()
            }
        }
        .build()
        return _tvContentFilled!!
    }

private var _tvContentFilled: ImageVector? = null
