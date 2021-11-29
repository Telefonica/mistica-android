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

public val RegularGroup.TvContentRegular: ImageVector
    get() {
        if (_tvContentRegular != null) {
            return _tvContentRegular!!
        }
        _tvContentRegular = Builder(name = "TvContentRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.396f, 17.368f)
                lineTo(5.593f, 17.36f)
                curveToRelative(-1.12f, 0.0f, -1.99f, -0.311f, -2.58f, -0.927f)
                curveToRelative(-0.574f, -0.591f, -0.863f, -1.437f, -0.863f, -2.513f)
                lineTo(2.15f, 7.923f)
                curveToRelative(0.0f, -2.202f, 1.221f, -3.412f, 3.44f, -3.412f)
                lineToRelative(12.806f, 0.009f)
                curveToRelative(2.219f, 0.0f, 3.44f, 1.212f, 3.44f, 3.411f)
                verticalLineToRelative(5.998f)
                curveToRelative(0.0f, 1.075f, -0.288f, 1.921f, -0.86f, 2.512f)
                curveToRelative(-0.594f, 0.616f, -1.462f, 0.927f, -2.58f, 0.927f)
                close()
                moveTo(5.59f, 5.632f)
                curveToRelative(-0.807f, 0.0f, -1.406f, 0.193f, -1.779f, 0.574f)
                curveToRelative(-0.358f, 0.367f, -0.54f, 0.944f, -0.54f, 1.717f)
                verticalLineToRelative(5.997f)
                curveToRelative(0.0f, 1.583f, 0.736f, 2.32f, 2.319f, 2.32f)
                lineToRelative(12.804f, 0.008f)
                curveToRelative(1.582f, 0.0f, 2.319f, -0.737f, 2.319f, -2.32f)
                lineTo(20.713f, 7.932f)
                curveToRelative(0.0f, -0.773f, -0.182f, -1.35f, -0.543f, -1.717f)
                curveToRelative(-0.373f, -0.38f, -0.97f, -0.574f, -1.78f, -0.574f)
                lineToRelative(-12.8f, -0.008f)
                close()
                moveTo(14.447f, 19.582f)
                lineTo(9.531f, 19.572f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                lineToRelative(4.916f, 0.009f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, -0.252f, 0.56f, -0.56f, 0.56f)
                close()
            }
        }
        .build()
        return _tvContentRegular!!
    }

private var _tvContentRegular: ImageVector? = null
