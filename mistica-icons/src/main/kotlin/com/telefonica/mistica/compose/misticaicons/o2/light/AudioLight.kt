package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.AudioLight: ImageVector
    get() {
        if (_audioLight != null) {
            return _audioLight!!
        }
        _audioLight = Builder(name = "AudioLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.914f, 16.715f)
                arcToRelative(0.368f, 0.368f, 0.0f, false, true, -0.27f, -0.62f)
                arcToRelative(5.832f, 5.832f, 0.0f, false, false, -0.104f, -8.172f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, true, 0.0f, -0.522f)
                arcToRelative(0.366f, 0.366f, 0.0f, false, true, 0.52f, 0.0f)
                arcToRelative(6.575f, 6.575f, 0.0f, false, true, 0.119f, 9.205f)
                arcToRelative(0.392f, 0.392f, 0.0f, false, true, -0.265f, 0.109f)
                close()
                moveTo(18.453f, 14.852f)
                arcToRelative(4.131f, 4.131f, 0.0f, false, false, -0.123f, -5.72f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, false, -0.52f, 0.0f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, false, 0.0f, 0.52f)
                arcToRelative(3.396f, 3.396f, 0.0f, false, true, 0.099f, 4.698f)
                arcToRelative(0.369f, 0.369f, 0.0f, false, false, 0.023f, 0.521f)
                arcToRelative(0.366f, 0.366f, 0.0f, false, false, 0.52f, -0.019f)
                close()
                moveTo(15.483f, 21.948f)
                arcToRelative(0.374f, 0.374f, 0.0f, false, false, 0.184f, -0.322f)
                lineTo(15.667f, 2.372f)
                arcToRelative(0.374f, 0.374f, 0.0f, false, false, -0.184f, -0.322f)
                arcToRelative(0.367f, 0.367f, 0.0f, false, false, -0.37f, 0.0f)
                lineTo(5.042f, 7.923f)
                lineTo(2.369f, 7.923f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, -0.369f, 0.37f)
                verticalLineToRelative(7.403f)
                curveToRelative(0.0f, 0.204f, 0.166f, 0.37f, 0.369f, 0.37f)
                lineTo(5.04f, 16.066f)
                lineToRelative(4.894f, 2.844f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, 0.374f, -0.64f)
                lineToRelative(-4.98f, -2.892f)
                arcToRelative(0.361f, 0.361f, 0.0f, false, false, -0.184f, -0.052f)
                lineTo(2.738f, 15.326f)
                verticalLineToRelative(-6.66f)
                lineTo(5.14f, 8.666f)
                arcToRelative(0.361f, 0.361f, 0.0f, false, false, 0.185f, -0.051f)
                lineToRelative(9.604f, -5.598f)
                verticalLineToRelative(17.969f)
                lineToRelative(-0.827f, -0.489f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, -0.374f, 0.64f)
                lineToRelative(1.381f, 0.81f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, 0.185f, 0.053f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, false, 0.189f, -0.052f)
                close()
                moveTo(12.711f, 19.777f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, -0.737f, -0.74f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, 0.0f, 1.48f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, 0.737f, -0.74f)
            }
        }
        .build()
        return _audioLight!!
    }

private var _audioLight: ImageVector? = null
