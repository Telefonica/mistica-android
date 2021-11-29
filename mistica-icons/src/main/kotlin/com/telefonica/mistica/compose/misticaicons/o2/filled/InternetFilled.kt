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

public val FilledGroup.InternetFilled: ImageVector
    get() {
        if (_internetFilled != null) {
            return _internetFilled!!
        }
        _internetFilled = Builder(name = "InternetFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.544f, 21.115f)
                verticalLineToRelative(-8.576f)
                horizontalLineToRelative(3.92f)
                curveToRelative(-0.127f, 4.371f, -1.824f, 8.032f, -3.92f, 8.576f)
                close()
                moveTo(17.54f, 11.461f)
                lineTo(22.0f, 11.461f)
                curveTo(21.744f, 6.578f, 18.025f, 2.613f, 13.28f, 2.0f)
                curveToRelative(2.384f, 1.0f, 4.136f, 4.767f, 4.26f, 9.46f)
                close()
                moveTo(17.54f, 12.539f)
                curveTo(17.416f, 17.233f, 15.664f, 21.0f, 13.28f, 22.0f)
                curveToRelative(4.745f, -0.609f, 8.464f, -4.578f, 8.72f, -9.46f)
                horizontalLineToRelative(-4.46f)
                close()
                moveTo(12.544f, 2.885f)
                verticalLineToRelative(8.571f)
                horizontalLineToRelative(3.92f)
                curveToRelative(-0.127f, -4.366f, -1.824f, -8.027f, -3.92f, -8.57f)
                close()
                moveTo(11.46f, 21.115f)
                verticalLineToRelative(-8.576f)
                lineTo(7.54f, 12.539f)
                curveToRelative(0.128f, 4.371f, 1.825f, 8.032f, 3.92f, 8.576f)
                close()
                moveTo(10.72f, 2.0f)
                curveTo(5.974f, 2.609f, 2.255f, 6.578f, 2.0f, 11.46f)
                horizontalLineToRelative(4.46f)
                curveTo(6.588f, 6.768f, 8.34f, 3.0f, 10.72f, 2.0f)
                close()
                moveTo(2.0f, 12.54f)
                curveToRelative(0.256f, 4.882f, 3.975f, 8.847f, 8.72f, 9.46f)
                curveToRelative(-2.384f, -1.0f, -4.132f, -4.767f, -4.26f, -9.46f)
                lineTo(2.0f, 12.54f)
                close()
                moveTo(7.535f, 11.46f)
                horizontalLineToRelative(3.925f)
                lineTo(11.46f, 2.886f)
                curveToRelative(-2.095f, 0.544f, -3.792f, 4.205f, -3.925f, 8.576f)
                close()
            }
        }
        .build()
        return _internetFilled!!
    }

private var _internetFilled: ImageVector? = null
