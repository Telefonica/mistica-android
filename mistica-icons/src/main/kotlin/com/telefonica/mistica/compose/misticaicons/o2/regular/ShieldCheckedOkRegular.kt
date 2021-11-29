package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.ShieldCheckedOkRegular: ImageVector
    get() {
        if (_shieldCheckedOkRegular != null) {
            return _shieldCheckedOkRegular!!
        }
        _shieldCheckedOkRegular = Builder(name = "ShieldCheckedOkRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.323f, 16.578f)
                lineToRelative(-2.634f, -2.73f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, 0.0f, -0.976f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, 0.943f, 0.0f)
                lineToRelative(1.703f, 1.764f)
                lineToRelative(4.866f, -4.883f)
                arcToRelative(0.651f, 0.651f, 0.0f, false, true, 0.944f, 0.018f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, -0.018f, 0.978f)
                lineToRelative(-5.804f, 5.829f)
                close()
                moveTo(12.201f, 21.969f)
                curveTo(13.882f, 21.407f, 19.0f, 19.705f, 19.0f, 15.092f)
                lineTo(19.0f, 6.799f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, false, -0.666f, -0.69f)
                curveToRelative(-3.304f, 0.0f, -5.809f, -2.848f, -5.839f, -2.879f)
                arcTo(0.66f, 0.66f, 0.0f, false, false, 12.0f, 3.0f)
                arcToRelative(0.653f, 0.653f, 0.0f, false, false, -0.495f, 0.23f)
                curveToRelative(-0.026f, 0.03f, -2.535f, 2.88f, -5.84f, 2.88f)
                arcTo(0.68f, 0.68f, 0.0f, false, false, 5.0f, 6.8f)
                verticalLineToRelative(8.292f)
                curveToRelative(0.0f, 1.14f, 0.0f, 4.613f, 6.8f, 6.877f)
                arcToRelative(0.659f, 0.659f, 0.0f, false, false, 0.4f, 0.0f)
                close()
                moveTo(11.996f, 4.663f)
                curveToRelative(0.909f, 0.867f, 2.988f, 2.547f, 5.668f, 2.795f)
                verticalLineToRelative(7.634f)
                curveToRelative(0.0f, 2.419f, -1.801f, 4.166f, -5.668f, 5.493f)
                curveToRelative(-3.867f, -1.327f, -5.669f, -3.074f, -5.669f, -5.493f)
                lineTo(6.327f, 7.458f)
                curveToRelative(2.68f, -0.248f, 4.76f, -1.928f, 5.669f, -2.795f)
                close()
            }
        }
        .build()
        return _shieldCheckedOkRegular!!
    }

private var _shieldCheckedOkRegular: ImageVector? = null
