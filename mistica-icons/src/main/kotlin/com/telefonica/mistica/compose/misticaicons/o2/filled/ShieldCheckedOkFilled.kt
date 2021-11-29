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

public val FilledGroup.ShieldCheckedOkFilled: ImageVector
    get() {
        if (_shieldCheckedOkFilled != null) {
            return _shieldCheckedOkFilled!!
        }
        _shieldCheckedOkFilled = Builder(name = "ShieldCheckedOkFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.643f, 5.117f)
                curveToRelative(-3.88f, 0.0f, -6.86f, -2.983f, -6.892f, -3.011f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, false, -0.502f, 0.0f)
                curveToRelative(-0.028f, 0.028f, -3.012f, 3.01f, -6.893f, 3.01f)
                arcTo(0.362f, 0.362f, 0.0f, false, false, 5.0f, 5.484f)
                verticalLineToRelative(9.175f)
                curveToRelative(0.0f, 3.283f, 2.418f, 5.68f, 7.39f, 7.323f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.11f, 0.019f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.11f, -0.019f)
                curveToRelative(4.972f, -1.644f, 7.39f, -4.04f, 7.39f, -7.323f)
                lineTo(20.0f, 5.483f)
                arcToRelative(0.356f, 0.356f, 0.0f, false, false, -0.357f, -0.366f)
                close()
                moveTo(16.805f, 9.913f)
                lineTo(10.713f, 15.978f)
                lineTo(8.02f, 13.21f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.0f, -0.78f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, 0.759f, 0.0f)
                lineToRelative(1.947f, 2.001f)
                lineTo(16.06f, 9.12f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, 0.759f, 0.014f)
                arcToRelative(0.565f, 0.565f, 0.0f, false, true, -0.014f, 0.78f)
                close()
            }
        }
        .build()
        return _shieldCheckedOkFilled!!
    }

private var _shieldCheckedOkFilled: ImageVector? = null
