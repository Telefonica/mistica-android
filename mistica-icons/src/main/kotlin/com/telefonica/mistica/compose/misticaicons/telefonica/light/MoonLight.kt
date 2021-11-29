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

public val LightGroup.MoonLight: ImageVector
    get() {
        if (_moonLight != null) {
            return _moonLight!!
        }
        _moonLight = Builder(name = "MoonLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.853f, 20.985f)
                curveToRelative(-0.255f, 0.009f, -0.566f, 0.009f, -0.846f, 0.009f)
                curveToRelative(-2.023f, -0.034f, -8.617f, -0.785f, -8.617f, -9.028f)
                curveToRelative(0.0f, -8.227f, 6.544f, -8.947f, 8.544f, -8.972f)
                lineToRelative(0.63f, 0.005f)
                curveToRelative(-1.913f, 0.933f, -3.905f, 2.914f, -3.905f, 7.115f)
                curveToRelative(0.0f, 7.502f, 6.381f, 7.983f, 7.667f, 8.003f)
                curveToRelative(0.24f, 0.0f, 0.499f, 0.0f, 0.703f, -0.008f)
                arcToRelative(9.577f, 9.577f, 0.0f, false, false, 2.944f, -0.538f)
                curveToRelative(-2.118f, 3.073f, -5.908f, 3.392f, -7.12f, 3.414f)
                moveToRelative(8.411f, -4.635f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, false, -0.493f, -0.056f)
                curveToRelative(-1.428f, 0.809f, -2.966f, 0.96f, -3.764f, 0.98f)
                curveToRelative(-0.202f, 0.008f, -0.449f, 0.008f, -0.673f, 0.008f)
                curveToRelative(-1.602f, -0.025f, -6.832f, -0.619f, -6.832f, -7.168f)
                curveToRelative(0.0f, -4.832f, 2.79f, -6.442f, 5.132f, -6.94f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.333f, -0.416f)
                arcToRelative(0.422f, 0.422f, 0.0f, false, false, -0.344f, -0.406f)
                arcToRelative(11.382f, 11.382f, 0.0f, false, false, -1.796f, -0.187f)
                lineToRelative(-0.896f, -0.009f)
                curveToRelative(-2.202f, 0.028f, -9.381f, 0.815f, -9.381f, 9.807f)
                curveToRelative(0.0f, 1.619f, 0.454f, 9.711f, 9.448f, 9.863f)
                curveToRelative(0.297f, 0.0f, 0.616f, 0.0f, 0.874f, -0.009f)
                curveToRelative(1.462f, -0.025f, 6.39f, -0.456f, 8.49f, -4.988f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, -0.098f, -0.48f)
            }
        }
        .build()
        return _moonLight!!
    }

private var _moonLight: ImageVector? = null
