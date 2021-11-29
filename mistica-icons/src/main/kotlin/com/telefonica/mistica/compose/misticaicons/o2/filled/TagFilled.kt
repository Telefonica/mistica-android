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

public val FilledGroup.TagFilled: ImageVector
    get() {
        if (_tagFilled != null) {
            return _tagFilled!!
        }
        _tagFilled = Builder(name = "TagFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.093f, 7.678f)
                curveToRelative(-0.472f, 0.0f, -0.918f, -0.186f, -1.254f, -0.518f)
                arcToRelative(1.778f, 1.778f, 0.0f, false, true, 0.0f, -2.508f)
                lineToRelative(1.231f, -1.231f)
                horizontalLineToRelative(-7.55f)
                curveToRelative(-0.569f, 0.0f, -1.105f, 0.223f, -1.505f, 0.623f)
                lineToRelative(-6.393f, 6.392f)
                arcTo(2.106f, 2.106f, 0.0f, false, false, 2.0f, 11.94f)
                curveToRelative(0.0f, 0.568f, 0.223f, 1.104f, 0.622f, 1.504f)
                lineToRelative(7.933f, 7.934f)
                curveToRelative(0.414f, 0.413f, 0.96f, 0.622f, 1.504f, 0.622f)
                curveToRelative(0.546f, 0.0f, 1.09f, -0.209f, 1.504f, -0.622f)
                lineToRelative(6.388f, -6.389f)
                curveToRelative(0.405f, -0.404f, 0.623f, -0.936f, 0.623f, -1.504f)
                lineTo(20.574f, 5.93f)
                lineTo(19.343f, 7.16f)
                arcToRelative(1.734f, 1.734f, 0.0f, false, true, -1.25f, 0.518f)
                close()
                moveTo(16.853f, 12.649f)
                curveToRelative(-2.508f, 0.0f, -4.262f, 1.677f, -4.262f, 4.08f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.532f, 0.532f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.531f, -0.532f)
                curveToRelative(0.0f, -2.403f, -1.754f, -4.08f, -4.262f, -4.08f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.532f, -0.531f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.532f, -0.532f)
                curveToRelative(2.39f, 0.0f, 4.262f, -1.95f, 4.262f, -4.44f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.531f, -0.53f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.532f, 0.53f)
                curveToRelative(0.0f, 2.49f, 1.872f, 4.44f, 4.262f, 4.44f)
                arcToRelative(0.532f, 0.532f, 0.0f, false, true, 0.0f, 1.063f)
                close()
                moveTo(14.453f, 12.081f)
                arcToRelative(4.882f, 4.882f, 0.0f, false, false, -2.394f, 2.295f)
                arcToRelative(4.882f, 4.882f, 0.0f, false, false, -2.394f, -2.295f)
                arcToRelative(5.316f, 5.316f, 0.0f, false, false, 2.394f, -2.494f)
                arcToRelative(5.316f, 5.316f, 0.0f, false, false, 2.395f, 2.494f)
                close()
                moveTo(21.792f, 3.212f)
                lineTo(18.597f, 6.406f)
                arcToRelative(0.698f, 0.698f, 0.0f, false, true, -0.5f, 0.21f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, -0.5f, -1.213f)
                lineToRelative(3.195f, -3.195f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, 1.004f, 0.0f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, true, -0.004f, 1.004f)
                close()
            }
        }
        .build()
        return _tagFilled!!
    }

private var _tagFilled: ImageVector? = null
