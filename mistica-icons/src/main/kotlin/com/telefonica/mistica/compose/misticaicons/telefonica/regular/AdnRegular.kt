package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.AdnRegular: ImageVector
    get() {
        if (_adnRegular != null) {
            return _adnRegular!!
        }
        _adnRegular = Builder(name = "AdnRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.197f, 15.116f)
                curveToRelative(-0.37f, 0.255f, -0.767f, 0.505f, -1.187f, 0.757f)
                arcToRelative(22.33f, 22.33f, 0.0f, false, true, -1.185f, -0.757f)
                horizontalLineToRelative(2.372f)
                close()
                moveTo(9.436f, 13.873f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, true, -0.577f, -1.244f)
                horizontalLineToRelative(6.305f)
                arcToRelative(3.038f, 3.038f, 0.0f, false, true, -0.577f, 1.244f)
                lineTo(9.436f, 13.873f)
                close()
                moveTo(10.786f, 8.898f)
                curveToRelative(0.38f, -0.263f, 0.79f, -0.524f, 1.224f, -0.784f)
                curveToRelative(0.434f, 0.26f, 0.846f, 0.518f, 1.227f, 0.784f)
                horizontalLineToRelative(-2.451f)
                close()
                moveTo(14.609f, 10.142f)
                curveToRelative(0.278f, 0.367f, 0.465f, 0.778f, 0.558f, 1.243f)
                lineTo(8.856f, 11.385f)
                curveToRelative(0.092f, -0.465f, 0.28f, -0.876f, 0.557f, -1.243f)
                horizontalLineToRelative(5.196f)
                close()
                moveTo(16.522f, 11.993f)
                curveToRelative(0.0f, -2.263f, -1.613f, -3.554f, -3.302f, -4.61f)
                curveToRelative(1.689f, -1.057f, 3.302f, -2.348f, 3.302f, -4.611f)
                arcToRelative(0.634f, 0.634f, 0.0f, false, false, -0.644f, -0.622f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, false, -0.644f, 0.622f)
                curveToRelative(0.0f, 1.84f, -1.46f, 2.823f, -3.221f, 3.877f)
                curveTo(10.25f, 5.593f, 8.79f, 4.612f, 8.79f, 2.772f)
                arcToRelative(0.634f, 0.634f, 0.0f, false, false, -0.644f, -0.622f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, false, -0.644f, 0.622f)
                curveToRelative(0.0f, 2.263f, 1.613f, 3.554f, 3.302f, 4.61f)
                curveToRelative(-1.689f, 1.057f, -3.302f, 2.35f, -3.302f, 4.611f)
                curveToRelative(0.0f, 1.165f, 0.428f, 2.07f, 1.07f, 2.82f)
                curveToRelative(0.039f, 0.062f, 0.09f, 0.116f, 0.148f, 0.16f)
                curveToRelative(0.589f, 0.634f, 1.325f, 1.157f, 2.082f, 1.628f)
                curveToRelative(-1.69f, 1.056f, -3.303f, 2.347f, -3.303f, 4.61f)
                curveToRelative(0.0f, 0.342f, 0.289f, 0.622f, 0.644f, 0.622f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, false, 0.645f, -0.621f)
                curveToRelative(0.0f, -1.84f, 1.462f, -2.821f, 3.22f, -3.877f)
                curveToRelative(1.763f, 1.056f, 3.222f, 2.04f, 3.222f, 3.877f)
                curveToRelative(0.0f, 0.341f, 0.289f, 0.621f, 0.644f, 0.621f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, false, 0.645f, -0.621f)
                curveToRelative(0.0f, -2.264f, -1.614f, -3.555f, -3.303f, -4.611f)
                curveToRelative(1.692f, -1.053f, 3.305f, -2.345f, 3.305f, -4.608f)
                close()
            }
        }
        .build()
        return _adnRegular!!
    }

private var _adnRegular: ImageVector? = null
