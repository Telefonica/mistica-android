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

public val FilledGroup.AudioFilled: ImageVector
    get() {
        if (_audioFilled != null) {
            return _audioFilled!!
        }
        _audioFilled = Builder(name = "AudioFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.108f, 16.86f)
                arcToRelative(0.726f, 0.726f, 0.0f, false, true, -0.524f, 0.232f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, true, -0.501f, -0.204f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, -0.028f, -1.048f)
                arcToRelative(5.548f, 5.548f, 0.0f, false, false, -0.093f, -7.659f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, 0.0f, -1.048f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, true, 1.026f, 0.0f)
                arcToRelative(7.036f, 7.036f, 0.0f, false, true, 0.12f, 9.727f)
                close()
                moveTo(18.288f, 8.874f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, false, -1.025f, 0.0f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, false, 0.0f, 1.048f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, 0.088f, 4.187f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, false, 0.047f, 1.048f)
                arcToRelative(0.713f, 0.713f, 0.0f, false, false, 1.026f, -0.047f)
                arcToRelative(4.58f, 4.58f, 0.0f, false, false, -0.135f, -6.236f)
                close()
                moveTo(15.235f, 2.05f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, false, -0.362f, 0.0f)
                lineTo(4.985f, 7.925f)
                lineTo(2.362f, 7.925f)
                curveToRelative(-0.2f, 0.0f, -0.362f, 0.166f, -0.362f, 0.37f)
                verticalLineToRelative(7.407f)
                curveToRelative(0.0f, 0.204f, 0.162f, 0.37f, 0.362f, 0.37f)
                horizontalLineToRelative(2.623f)
                lineToRelative(9.887f, 5.876f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, false, 0.362f, 0.005f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, false, 0.181f, -0.323f)
                lineTo(15.415f, 2.372f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, false, -0.18f, -0.322f)
                close()
            }
        }
        .build()
        return _audioFilled!!
    }

private var _audioFilled: ImageVector? = null
