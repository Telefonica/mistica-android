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
                moveTo(14.487f, 2.108f)
                arcToRelative(0.356f, 0.356f, 0.0f, false, true, 0.512f, 0.0f)
                lineToRelative(2.496f, 2.498f)
                curveToRelative(0.07f, 0.065f, 0.107f, 0.163f, 0.107f, 0.256f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, true, -0.107f, 0.256f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, false, 0.0f, 1.39f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, 1.39f, 0.0f)
                arcToRelative(0.356f, 0.356f, 0.0f, false, true, 0.511f, 0.0f)
                lineToRelative(2.496f, 2.499f)
                arcToRelative(0.342f, 0.342f, 0.0f, false, true, -0.004f, 0.502f)
                lineTo(9.513f, 21.893f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, true, -0.255f, 0.107f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, true, -0.256f, -0.107f)
                lineToRelative(-2.496f, -2.498f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, 0.0f, -0.512f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, false, 0.0f, -1.39f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, -1.39f, 0.0f)
                arcToRelative(0.355f, 0.355f, 0.0f, false, true, -0.256f, 0.106f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, true, -0.256f, -0.107f)
                lineToRelative(-2.496f, -2.498f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, 0.0f, -0.512f)
                close()
                moveTo(11.02f, 8.384f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, false, -0.953f, 0.288f)
                lineToRelative(-0.246f, 2.075f)
                lineToRelative(-1.957f, 0.828f)
                arcToRelative(0.543f, 0.543f, 0.0f, false, false, -0.335f, 0.493f)
                curveToRelative(0.0f, 0.214f, 0.126f, 0.414f, 0.321f, 0.502f)
                lineToRelative(1.873f, 0.852f)
                lineToRelative(0.205f, 2.14f)
                arcToRelative(0.543f, 0.543f, 0.0f, false, false, 0.934f, 0.32f)
                lineToRelative(1.45f, -1.52f)
                lineToRelative(2.05f, 0.46f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.554f, -0.2f)
                curveToRelative(0.13f, -0.168f, 0.149f, -0.4f, 0.046f, -0.586f)
                lineToRelative(-1.018f, -1.894f)
                lineToRelative(1.084f, -1.749f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, false, -0.562f, -0.819f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-2.087f, 0.4f)
                close()
                moveTo(11.002f, 10.04f)
                lineTo(11.755f, 10.924f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.516f, 0.181f)
                lineToRelative(1.176f, -0.228f)
                lineToRelative(-0.59f, 0.963f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, false, -0.019f, 0.544f)
                lineToRelative(0.6f, 1.121f)
                lineToRelative(-1.186f, -0.265f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, false, -0.511f, 0.154f)
                lineToRelative(-0.841f, 0.88f)
                lineToRelative(-0.121f, -1.27f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, -0.316f, -0.443f)
                lineToRelative(-1.028f, -0.465f)
                lineToRelative(1.102f, -0.465f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, 0.33f, -0.438f)
                lineToRelative(0.135f, -1.153f)
                close()
            }
        }
        .build()
        return _ticketsFilled!!
    }

private var _ticketsFilled: ImageVector? = null
