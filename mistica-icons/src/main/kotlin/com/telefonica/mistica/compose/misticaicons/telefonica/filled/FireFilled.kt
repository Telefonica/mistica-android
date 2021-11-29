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

public val FilledGroup.FireFilled: ImageVector
    get() {
        if (_fireFilled != null) {
            return _fireFilled!!
        }
        _fireFilled = Builder(name = "FireFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.444f, 11.182f)
                arcToRelative(9.422f, 9.422f, 0.0f, false, false, -1.423f, -1.238f)
                curveToRelative(-4.11f, -2.989f, -2.347f, -7.16f, -2.272f, -7.336f)
                arcToRelative(0.422f, 0.422f, 0.0f, false, false, -0.059f, -0.432f)
                arcToRelative(0.406f, 0.406f, 0.0f, false, false, -0.411f, -0.137f)
                curveToRelative(-1.843f, 0.437f, -3.737f, 1.395f, -5.33f, 2.698f)
                curveToRelative(-5.27f, 4.308f, -5.28f, 11.05f, -2.967f, 13.991f)
                curveToRelative(1.039f, 1.322f, 2.524f, 2.255f, 4.157f, 2.726f)
                arcToRelative(4.015f, 4.015f, 0.0f, false, true, -0.757f, -0.58f)
                arcToRelative(3.392f, 3.392f, 0.0f, false, true, -0.162f, -4.647f)
                curveToRelative(0.207f, -0.238f, 0.442f, -0.457f, 0.7f, -0.653f)
                curveToRelative(1.586f, -1.238f, 0.885f, -3.005f, 0.877f, -3.022f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 0.104f, -0.642f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, true, 0.619f, -0.196f)
                curveToRelative(0.888f, 0.227f, 1.798f, 0.717f, 2.56f, 1.387f)
                curveToRelative(1.706f, 1.496f, 3.056f, 4.98f, 1.386f, 7.258f)
                arcToRelative(4.053f, 4.053f, 0.0f, false, true, -1.773f, 1.355f)
                curveToRelative(0.224f, -0.033f, 0.448f, -0.061f, 0.673f, -0.115f)
                curveToRelative(0.08f, -0.01f, 2.01f, -0.29f, 3.77f, -1.904f)
                curveToRelative(1.202f, -1.101f, 1.896f, -2.589f, 1.955f, -4.185f)
                curveToRelative(0.056f, -1.597f, -0.53f, -3.135f, -1.647f, -4.328f)
            }
        }
        .build()
        return _fireFilled!!
    }

private var _fireFilled: ImageVector? = null
