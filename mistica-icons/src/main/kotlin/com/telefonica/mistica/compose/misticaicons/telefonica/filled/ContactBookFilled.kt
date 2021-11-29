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

public val FilledGroup.ContactBookFilled: ImageVector
    get() {
        if (_contactBookFilled != null) {
            return _contactBookFilled!!
        }
        _contactBookFilled = Builder(name = "ContactBookFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.116f, 2.017f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, 2.737f, 2.737f)
                verticalLineToRelative(14.165f)
                arcToRelative(2.738f, 2.738f, 0.0f, false, true, -2.737f, 2.734f)
                horizontalLineToRelative(-8.7f)
                curveToRelative(-0.307f, 0.0f, -0.603f, -0.048f, -0.881f, -0.136f)
                arcTo(2.704f, 2.704f, 0.0f, false, true, 4.634f, 19.6f)
                arcToRelative(2.873f, 2.873f, 0.0f, false, true, -0.131f, -0.862f)
                lineTo(4.503f, 4.664f)
                curveToRelative(0.0f, -0.353f, 0.068f, -0.696f, 0.2f, -1.012f)
                lineToRelative(0.021f, -0.06f)
                arcToRelative(2.458f, 2.458f, 0.0f, false, true, 1.384f, -1.365f)
                curveToRelative(0.324f, -0.138f, 0.676f, -0.21f, 1.04f, -0.21f)
                horizontalLineToRelative(8.968f)
                close()
                moveTo(17.713f, 15.325f)
                horizontalLineToRelative(-0.443f)
                lineToRelative(0.001f, 4.694f)
                curveToRelative(0.274f, -0.286f, 0.442f, -0.674f, 0.442f, -1.1f)
                verticalLineToRelative(-3.594f)
                close()
                moveTo(12.116f, 12.378f)
                lineTo(9.752f, 12.378f)
                curveToRelative(-0.734f, 0.0f, -1.342f, 0.258f, -1.759f, 0.745f)
                curveToRelative(-0.387f, 0.457f, -0.594f, 1.081f, -0.594f, 1.807f)
                verticalLineToRelative(0.89f)
                curveToRelative(0.0f, 0.303f, 0.213f, 0.55f, 0.474f, 0.55f)
                horizontalLineToRelative(6.126f)
                curveToRelative(0.26f, 0.0f, 0.473f, -0.247f, 0.473f, -0.55f)
                lineToRelative(-0.003f, -0.89f)
                curveToRelative(0.0f, -0.728f, -0.204f, -1.353f, -0.594f, -1.807f)
                curveToRelative(-0.417f, -0.487f, -1.025f, -0.745f, -1.759f, -0.745f)
                close()
                moveTo(17.713f, 9.49f)
                horizontalLineToRelative(-0.443f)
                verticalLineToRelative(4.692f)
                horizontalLineToRelative(0.443f)
                lineTo(17.713f, 9.49f)
                close()
                moveTo(10.93f, 6.913f)
                curveToRelative(-1.54f, 0.0f, -2.425f, 0.89f, -2.425f, 2.434f)
                reflectiveCurveToRelative(0.88f, 2.426f, 2.425f, 2.426f)
                curveToRelative(1.547f, 0.0f, 2.435f, -0.88f, 2.435f, -2.426f)
                curveToRelative(0.0f, -1.546f, -0.888f, -2.434f, -2.435f, -2.434f)
                close()
                moveTo(17.27f, 3.653f)
                lineTo(17.269f, 8.347f)
                horizontalLineToRelative(0.443f)
                lineTo(17.712f, 4.754f)
                curveToRelative(0.0f, -0.427f, -0.168f, -0.815f, -0.442f, -1.101f)
                close()
            }
        }
        .build()
        return _contactBookFilled!!
    }

private var _contactBookFilled: ImageVector? = null
