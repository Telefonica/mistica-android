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

public val FilledGroup.WifiFilled: ImageVector
    get() {
        if (_wifiFilled != null) {
            return _wifiFilled!!
        }
        _wifiFilled = Builder(name = "WifiFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.857f, 15.695f)
                curveToRelative(0.67f, 0.0f, 1.202f, 0.185f, 1.583f, 0.551f)
                curveToRelative(0.395f, 0.381f, 0.596f, 0.93f, 0.596f, 1.628f)
                curveToRelative(0.0f, 0.697f, -0.201f, 1.246f, -0.596f, 1.627f)
                curveToRelative(-0.381f, 0.367f, -0.913f, 0.552f, -1.583f, 0.552f)
                curveToRelative(-0.67f, 0.0f, -1.202f, -0.185f, -1.582f, -0.552f)
                curveToRelative(-0.395f, -0.38f, -0.597f, -0.93f, -0.597f, -1.627f)
                curveToRelative(0.0f, -0.698f, 0.202f, -1.247f, 0.597f, -1.628f)
                curveToRelative(0.38f, -0.366f, 0.913f, -0.551f, 1.582f, -0.551f)
                close()
                moveTo(11.894f, 11.86f)
                arcToRelative(6.725f, 6.725f, 0.0f, false, true, 4.686f, 1.896f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, -0.782f, 0.804f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, false, -1.72f, -1.14f)
                arcToRelative(5.559f, 5.559f, 0.0f, false, false, -2.184f, -0.442f)
                arcToRelative(5.575f, 5.575f, 0.0f, false, false, -3.97f, 1.644f)
                arcToRelative(0.558f, 0.558f, 0.0f, false, true, -0.793f, 0.003f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, 0.0f, -0.793f)
                arcToRelative(6.665f, 6.665f, 0.0f, false, true, 2.087f, -1.42f)
                arcToRelative(6.688f, 6.688f, 0.0f, false, true, 2.676f, -0.552f)
                close()
                moveTo(11.896f, 7.773f)
                arcToRelative(10.189f, 10.189f, 0.0f, false, true, 7.154f, 2.922f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, -0.784f, 0.8f)
                arcToRelative(9.049f, 9.049f, 0.0f, false, false, -2.835f, -1.887f)
                arcToRelative(9.036f, 9.036f, 0.0f, false, false, -3.535f, -0.712f)
                curveToRelative(-1.24f, 0.0f, -2.442f, 0.244f, -3.571f, 0.726f)
                arcToRelative(9.135f, 9.135f, 0.0f, false, false, -2.863f, 1.93f)
                lineToRelative(-0.011f, 0.011f)
                arcToRelative(0.558f, 0.558f, 0.0f, false, true, -0.793f, 0.0f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, 0.0f, -0.793f)
                lineToRelative(0.014f, -0.014f)
                arcToRelative(10.197f, 10.197f, 0.0f, false, true, 7.224f, -2.983f)
                close()
                moveTo(11.9f, 3.69f)
                curveToRelative(1.84f, 0.0f, 3.63f, 0.359f, 5.317f, 1.067f)
                arcToRelative(13.641f, 13.641f, 0.0f, false, true, 4.305f, 2.871f)
                arcToRelative(0.559f, 0.559f, 0.0f, false, true, 0.006f, 0.793f)
                arcToRelative(0.559f, 0.559f, 0.0f, false, true, -0.793f, 0.006f)
                arcToRelative(12.56f, 12.56f, 0.0f, false, false, -8.835f, -3.616f)
                curveToRelative(-1.706f, 0.0f, -3.356f, 0.333f, -4.91f, 0.991f)
                arcToRelative(12.622f, 12.622f, 0.0f, false, false, -3.995f, 2.686f)
                lineToRelative(-0.016f, 0.017f)
                arcToRelative(0.555f, 0.555f, 0.0f, false, true, -0.79f, 0.003f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, 0.0f, -0.793f)
                lineToRelative(0.016f, -0.02f)
                arcTo(13.775f, 13.775f, 0.0f, false, true, 6.552f, 4.77f)
                arcToRelative(13.635f, 13.635f, 0.0f, false, true, 5.347f, -1.08f)
                close()
            }
        }
        .build()
        return _wifiFilled!!
    }

private var _wifiFilled: ImageVector? = null
