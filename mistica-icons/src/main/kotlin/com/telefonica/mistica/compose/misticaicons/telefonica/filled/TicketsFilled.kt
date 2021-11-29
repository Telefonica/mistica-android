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

public val FilledGroup.TicketsFilled: ImageVector
    get() {
        if (_ticketsFilled != null) {
            return _ticketsFilled!!
        }
        _ticketsFilled = Builder(name = "TicketsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.28f, 10.448f)
                lineToRelative(4.373f, 7.521f)
                lineToRelative(-0.006f, -9.933f)
                lineToRelative(-4.367f, 2.412f)
                close()
                moveTo(17.543f, 2.0f)
                horizontalLineToRelative(2.238f)
                curveToRelative(1.05f, 0.0f, 1.905f, 0.852f, 1.905f, 1.9f)
                verticalLineToRelative(14.248f)
                curveToRelative(0.0f, 1.048f, -0.854f, 1.9f, -1.905f, 1.9f)
                horizontalLineToRelative(-2.254f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -0.99f, -0.816f)
                arcToRelative(0.898f, 0.898f, 0.0f, false, false, -0.882f, -0.722f)
                arcToRelative(0.898f, 0.898f, 0.0f, false, false, -0.882f, 0.722f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -0.989f, 0.816f)
                horizontalLineToRelative(-0.82f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, -0.373f, 0.434f)
                lineToRelative(-1.753f, 0.983f)
                arcToRelative(1.722f, 1.722f, 0.0f, false, true, -0.85f, 0.221f)
                arcToRelative(1.73f, 1.73f, 0.0f, false, true, -1.521f, -0.885f)
                lineTo(2.23f, 9.737f)
                arcToRelative(1.735f, 1.735f, 0.0f, false, true, 0.664f, -2.364f)
                lineTo(4.63f, 6.4f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, true, 1.213f, 0.249f)
                arcToRelative(0.757f, 0.757f, 0.0f, false, false, 1.305f, -0.731f)
                arcToRelative(0.933f, 0.933f, 0.0f, false, true, 0.418f, -1.163f)
                lineToRelative(1.737f, -0.972f)
                curveToRelative(0.109f, -0.061f, 0.23f, -0.098f, 0.35f, -0.134f)
                arcToRelative(1.898f, 1.898f, 0.0f, false, true, 1.88f, -1.647f)
                horizontalLineToRelative(2.237f)
                curveToRelative(0.504f, 0.0f, 0.925f, 0.364f, 0.997f, 0.865f)
                arcToRelative(0.906f, 0.906f, 0.0f, false, false, 0.891f, 0.768f)
                curveToRelative(0.446f, 0.0f, 0.83f, -0.33f, 0.894f, -0.768f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 17.543f, 2.0f)
                close()
                moveTo(12.143f, 5.647f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, -0.415f, 0.415f)
                verticalLineToRelative(9.972f)
                curveToRelative(0.0f, 0.23f, 0.185f, 0.414f, 0.415f, 0.414f)
                horizontalLineToRelative(7.143f)
                curveToRelative(0.23f, 0.0f, 0.414f, -0.185f, 0.414f, -0.414f)
                lineTo(19.7f, 6.059f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, -0.414f, -0.415f)
                horizontalLineToRelative(-7.143f)
                verticalLineToRelative(0.003f)
                close()
            }
        }
        .build()
        return _ticketsFilled!!
    }

private var _ticketsFilled: ImageVector? = null
