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

public val LightGroup.AccesibilityLight: ImageVector
    get() {
        if (_accesibilityLight != null) {
            return _accesibilityLight!!
        }
        _accesibilityLight = Builder(name = "AccesibilityLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.68f, 21.286f)
                lineToRelative(-5.321f, -5.322f)
                curveToRelative(1.792f, -0.796f, 3.571f, -2.073f, 5.322f, -3.824f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, false, 0.0f, -0.398f)
                curveToRelative(-3.16f, -3.16f, -6.423f, -4.762f, -9.692f, -4.762f)
                curveToRelative(-1.291f, 0.0f, -2.583f, 0.25f, -3.868f, 0.748f)
                lineToRelative(-5.488f, -5.49f)
                arcToRelative(0.279f, 0.279f, 0.0f, true, false, -0.395f, 0.395f)
                lineTo(7.56f, 7.955f)
                curveToRelative(-1.792f, 0.796f, -3.571f, 2.073f, -5.322f, 3.824f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, false, 0.0f, 0.398f)
                curveToRelative(3.16f, 3.16f, 6.423f, 4.761f, 9.692f, 4.761f)
                curveToRelative(1.291f, 0.0f, 2.583f, -0.249f, 3.868f, -0.747f)
                lineToRelative(5.488f, 5.487f)
                arcToRelative(0.275f, 0.275f, 0.0f, false, false, 0.199f, 0.081f)
                arcToRelative(0.287f, 0.287f, 0.0f, false, false, 0.199f, -0.081f)
                arcToRelative(0.273f, 0.273f, 0.0f, false, false, -0.003f, -0.392f)
                close()
                moveTo(11.99f, 7.536f)
                curveToRelative(3.05f, 0.0f, 6.11f, 1.48f, 9.098f, 4.4f)
                curveToRelative(-1.703f, 1.664f, -3.426f, 2.865f, -5.154f, 3.596f)
                lineToRelative(-1.098f, -1.095f)
                curveToRelative(0.496f, -0.619f, 0.748f, -1.454f, 0.748f, -2.487f)
                curveToRelative(0.0f, -1.205f, -0.34f, -2.138f, -1.009f, -2.773f)
                curveToRelative(-0.633f, -0.603f, -1.526f, -0.908f, -2.652f, -0.908f)
                curveToRelative(-1.034f, 0.0f, -1.869f, 0.255f, -2.49f, 0.762f)
                lineToRelative(-0.874f, -0.874f)
                arcToRelative(10.078f, 10.078f, 0.0f, false, true, 3.43f, -0.622f)
                close()
                moveTo(11.937f, 11.132f)
                curveToRelative(-0.132f, 0.0f, -0.25f, 0.017f, -0.356f, 0.056f)
                lineToRelative(-1.75f, -1.75f)
                curveToRelative(0.515f, -0.399f, 1.215f, -0.6f, 2.089f, -0.6f)
                curveToRelative(1.414f, 0.0f, 3.1f, 0.54f, 3.1f, 3.117f)
                curveToRelative(0.0f, 0.874f, -0.195f, 1.574f, -0.588f, 2.087f)
                lineToRelative(-1.72f, -1.72f)
                curveToRelative(0.034f, -0.1f, 0.054f, -0.218f, 0.054f, -0.353f)
                curveToRelative(0.003f, -0.574f, -0.325f, -0.837f, -0.83f, -0.837f)
                close()
                moveTo(11.931f, 16.381f)
                curveToRelative(-3.05f, 0.0f, -6.11f, -1.482f, -9.098f, -4.4f)
                curveToRelative(1.703f, -1.664f, 3.426f, -2.866f, 5.154f, -3.597f)
                lineToRelative(7.375f, 7.375f)
                arcToRelative(10.011f, 10.011f, 0.0f, false, true, -3.43f, 0.622f)
                close()
            }
        }
        .build()
        return _accesibilityLight!!
    }

private var _accesibilityLight: ImageVector? = null
