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

public val FilledGroup.ArrowDownLeftFilled: ImageVector
    get() {
        if (_arrowDownLeftFilled != null) {
            return _arrowDownLeftFilled!!
        }
        _arrowDownLeftFilled = Builder(name = "ArrowDownLeftFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.048f, 3.68f)
                horizontalLineToRelative(0.022f)
                curveToRelative(0.395f, 0.006f, 0.779f, 0.194f, 1.143f, 0.56f)
                lineToRelative(5.047f, 5.026f)
                lineToRelative(0.017f, 0.017f)
                curveToRelative(0.32f, 0.347f, 0.44f, 0.709f, 0.362f, 1.078f)
                curveToRelative(-0.073f, 0.336f, -0.303f, 0.605f, -0.521f, 0.824f)
                lineToRelative(-0.014f, 0.014f)
                lineToRelative(-5.115f, 4.812f)
                lineToRelative(2.58f, 2.58f)
                lineToRelative(0.008f, 0.008f)
                curveToRelative(0.317f, 0.331f, 0.409f, 0.894f, 0.219f, 1.34f)
                curveToRelative(-0.177f, 0.414f, -0.566f, 0.66f, -1.04f, 0.66f)
                horizontalLineTo(4.664f)
                arcToRelative(0.901f, 0.901f, 0.0f, false, true, -0.717f, -0.254f)
                arcToRelative(0.894f, 0.894f, 0.0f, false, true, -0.252f, -0.718f)
                lineTo(3.7f, 7.482f)
                arcToRelative(1.009f, 1.009f, 0.0f, false, true, 0.614f, -0.955f)
                curveToRelative(0.456f, -0.205f, 1.047f, -0.112f, 1.406f, 0.215f)
                lineToRelative(0.017f, 0.014f)
                lineToRelative(2.378f, 2.378f)
                lineToRelative(4.79f, -4.904f)
                lineToRelative(0.005f, -0.006f)
                curveToRelative(0.356f, -0.361f, 0.74f, -0.543f, 1.138f, -0.543f)
                close()
            }
        }
        .build()
        return _arrowDownLeftFilled!!
    }

private var _arrowDownLeftFilled: ImageVector? = null
