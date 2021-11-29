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

public val FilledGroup.DownloadAppFilled: ImageVector
    get() {
        if (_downloadAppFilled != null) {
            return _downloadAppFilled!!
        }
        _downloadAppFilled = Builder(name = "DownloadAppFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.695f, 2.832f)
                curveTo(17.15f, 2.272f, 16.35f, 2.0f, 15.24f, 2.0f)
                lineTo(8.602f, 2.0f)
                curveToRelative(-2.157f, 0.0f, -3.25f, 1.106f, -3.25f, 3.291f)
                verticalLineToRelative(13.104f)
                curveToRelative(0.0f, 2.216f, 1.063f, 3.291f, 3.25f, 3.291f)
                horizontalLineToRelative(6.639f)
                curveToRelative(2.188f, 0.0f, 3.25f, -1.075f, 3.25f, -3.291f)
                lineTo(18.491f, 5.29f)
                curveToRelative(0.0f, -1.106f, -0.261f, -1.91f, -0.796f, -2.46f)
                close()
                moveTo(12.748f, 19.053f)
                curveToRelative(-0.196f, 0.199f, -0.48f, 0.305f, -0.82f, 0.305f)
                curveToRelative(-0.343f, 0.0f, -0.628f, -0.106f, -0.822f, -0.305f)
                curveToRelative(-0.193f, -0.199f, -0.288f, -0.47f, -0.288f, -0.81f)
                curveToRelative(0.0f, -0.697f, 0.414f, -1.114f, 1.112f, -1.114f)
                curveToRelative(0.697f, 0.0f, 1.11f, 0.417f, 1.11f, 1.115f)
                curveToRelative(-0.004f, 0.339f, -0.102f, 0.61f, -0.292f, 0.81f)
                close()
                moveTo(15.608f, 11.93f)
                lineTo(12.3f, 15.74f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, true, -0.378f, 0.173f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, true, -0.379f, -0.174f)
                lineToRelative(-3.3f, -3.81f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, true, 0.051f, -0.705f)
                arcToRelative(0.506f, 0.506f, 0.0f, false, true, 0.328f, -0.123f)
                horizontalLineToRelative(1.437f)
                lineTo(10.059f, 6.179f)
                arcToRelative(0.853f, 0.853f, 0.0f, false, true, 0.232f, -0.616f)
                arcToRelative(0.912f, 0.912f, 0.0f, false, true, 0.743f, -0.289f)
                horizontalLineToRelative(1.834f)
                curveToRelative(0.482f, 0.0f, 0.871f, 0.387f, 0.874f, 0.869f)
                curveToRelative(0.0f, 0.03f, 0.0f, 0.059f, -0.005f, 0.09f)
                lineTo(13.737f, 11.1f)
                horizontalLineToRelative(1.49f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.38f, 0.829f)
                close()
            }
        }
        .build()
        return _downloadAppFilled!!
    }

private var _downloadAppFilled: ImageVector? = null
