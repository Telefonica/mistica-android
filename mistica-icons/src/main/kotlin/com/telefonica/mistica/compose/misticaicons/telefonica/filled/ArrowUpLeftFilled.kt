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

public val FilledGroup.ArrowUpLeftFilled: ImageVector
    get() {
        if (_arrowUpLeftFilled != null) {
            return _arrowUpLeftFilled!!
        }
        _arrowUpLeftFilled = Builder(name = "ArrowUpLeftFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.605f, 14.048f)
                verticalLineToRelative(0.022f)
                curveToRelative(-0.006f, 0.395f, -0.196f, 0.779f, -0.56f, 1.143f)
                lineToRelative(-5.025f, 5.045f)
                lineToRelative(-0.017f, 0.017f)
                curveToRelative(-0.348f, 0.319f, -0.709f, 0.44f, -1.079f, 0.36f)
                curveToRelative(-0.336f, -0.072f, -0.605f, -0.302f, -0.823f, -0.52f)
                lineToRelative(-0.014f, -0.014f)
                lineToRelative(-4.81f, -5.112f)
                lineToRelative(-2.58f, 2.58f)
                lineToRelative(-0.008f, 0.008f)
                curveToRelative(-0.33f, 0.317f, -0.893f, 0.409f, -1.339f, 0.219f)
                curveToRelative(-0.414f, -0.177f, -0.66f, -0.566f, -0.66f, -1.04f)
                verticalLineTo(4.664f)
                arcToRelative(0.901f, 0.901f, 0.0f, false, true, 0.254f, -0.717f)
                arcToRelative(0.894f, 0.894f, 0.0f, false, true, 0.717f, -0.252f)
                lineToRelative(12.146f, 0.005f)
                curveToRelative(0.414f, -0.01f, 0.792f, 0.233f, 0.955f, 0.614f)
                curveToRelative(0.204f, 0.456f, 0.112f, 1.047f, -0.216f, 1.406f)
                lineToRelative(-0.014f, 0.017f)
                lineToRelative(-2.38f, 2.378f)
                lineToRelative(4.904f, 4.79f)
                lineToRelative(0.006f, 0.005f)
                curveToRelative(0.361f, 0.356f, 0.543f, 0.74f, 0.543f, 1.138f)
                close()
            }
        }
        .build()
        return _arrowUpLeftFilled!!
    }

private var _arrowUpLeftFilled: ImageVector? = null
