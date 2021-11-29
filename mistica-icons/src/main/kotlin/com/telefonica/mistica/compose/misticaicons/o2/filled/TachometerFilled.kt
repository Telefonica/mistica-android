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

public val FilledGroup.TachometerFilled: ImageVector
    get() {
        if (_tachometerFilled != null) {
            return _tachometerFilled!!
        }
        _tachometerFilled = Builder(name = "TachometerFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.667f, 19.352f)
                lineToRelative(0.677f, 0.648f)
                horizontalLineToRelative(-4.79f)
                lineToRelative(-0.105f, -0.181f)
                arcTo(10.734f, 10.734f, 0.0f, false, true, 2.0f, 14.419f)
                curveTo(2.0f, 8.676f, 6.484f, 4.0f, 12.0f, 4.0f)
                arcToRelative(9.68f, 9.68f, 0.0f, false, true, 5.58f, 1.776f)
                lineToRelative(-3.72f, 2.229f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, false, -1.86f, -0.29f)
                curveToRelative(-3.542f, 0.0f, -6.426f, 3.004f, -6.426f, 6.695f)
                arcToRelative(6.85f, 6.85f, 0.0f, false, false, 2.093f, 4.942f)
                close()
                moveTo(20.291f, 8.605f)
                lineToRelative(-2.14f, 3.876f)
                curveToRelative(0.179f, 0.614f, 0.28f, 1.267f, 0.28f, 1.938f)
                arcToRelative(6.836f, 6.836f, 0.0f, false, true, -2.094f, 4.933f)
                lineToRelative(-0.68f, 0.648f)
                horizontalLineToRelative(4.79f)
                lineToRelative(0.104f, -0.181f)
                arcToRelative(10.734f, 10.734f, 0.0f, false, false, 1.449f, -5.4f)
                curveToRelative(0.0f, -2.152f, -0.63f, -4.152f, -1.71f, -5.814f)
                close()
                moveTo(20.949f, 5.095f)
                arcToRelative(0.518f, 0.518f, 0.0f, false, false, -0.645f, -0.09f)
                lineTo(9.806f, 11.3f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, false, -0.05f, 0.033f)
                curveToRelative(-0.133f, 0.1f, -0.26f, 0.215f, -0.384f, 0.343f)
                curveToRelative(-1.449f, 1.51f, -1.449f, 3.967f, 0.0f, 5.476f)
                arcTo(3.628f, 3.628f, 0.0f, false, false, 12.0f, 18.286f)
                arcToRelative(3.62f, 3.62f, 0.0f, false, false, 2.628f, -1.134f)
                curveToRelative(0.123f, -0.128f, 0.233f, -0.262f, 0.329f, -0.4f)
                arcToRelative(0.322f, 0.322f, 0.0f, false, false, 0.032f, -0.052f)
                lineToRelative(6.042f, -10.938f)
                arcToRelative(0.565f, 0.565f, 0.0f, false, false, -0.082f, -0.667f)
                close()
            }
        }
        .build()
        return _tachometerFilled!!
    }

private var _tachometerFilled: ImageVector? = null
