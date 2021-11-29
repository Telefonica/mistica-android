package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.LightningLight: ImageVector
    get() {
        if (_lightningLight != null) {
            return _lightningLight!!
        }
        _lightningLight = Builder(name = "LightningLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.248f, 19.7f)
                lineToRelative(2.316f, -5.984f)
                arcToRelative(0.422f, 0.422f, 0.0f, false, false, -0.017f, -0.345f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, false, -0.266f, -0.212f)
                lineToRelative(-4.238f, -1.037f)
                lineToRelative(7.235f, -7.678f)
                lineToRelative(-2.274f, 5.709f)
                arcToRelative(0.419f, 0.419f, 0.0f, false, false, 0.286f, 0.563f)
                lineToRelative(4.635f, 1.129f)
                lineToRelative(-7.677f, 7.854f)
                close()
                moveTo(18.122f, 11.495f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.3f, -0.292f)
                lineToRelative(-4.883f, -1.19f)
                lineToRelative(2.9f, -7.275f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, false, -0.157f, -0.507f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, false, -0.518f, 0.062f)
                lineToRelative(-9.21f, 9.77f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, false, -0.099f, 0.406f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, 0.297f, 0.289f)
                lineToRelative(4.477f, 1.095f)
                lineToRelative(-2.874f, 7.418f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, false, 0.156f, 0.501f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, false, 0.515f, -0.056f)
                lineToRelative(9.592f, -9.815f)
                arcToRelative(0.409f, 0.409f, 0.0f, false, false, 0.104f, -0.406f)
                close()
            }
        }
        .build()
        return _lightningLight!!
    }

private var _lightningLight: ImageVector? = null
