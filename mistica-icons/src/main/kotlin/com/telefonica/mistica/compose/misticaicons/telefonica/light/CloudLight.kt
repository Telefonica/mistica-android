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

public val LightGroup.CloudLight: ImageVector
    get() {
        if (_cloudLight != null) {
            return _cloudLight!!
        }
        _cloudLight = Builder(name = "CloudLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.761f, 18.881f)
                horizontalLineTo(6.033f)
                arcToRelative(3.882f, 3.882f, 0.0f, false, true, -3.877f, -3.876f)
                curveToRelative(0.0f, -0.863f, 0.3f, -1.69f, 0.869f, -2.393f)
                arcToRelative(4.053f, 4.053f, 0.0f, false, true, 2.03f, -1.358f)
                arcToRelative(0.623f, 0.623f, 0.0f, false, false, 0.138f, -0.05f)
                curveToRelative(0.016f, -3.524f, 2.431f, -6.079f, 5.75f, -6.079f)
                arcToRelative(6.11f, 6.11f, 0.0f, false, true, 5.569f, 3.61f)
                lineToRelative(0.006f, 0.012f)
                lineToRelative(0.033f, -0.003f)
                arcToRelative(5.079f, 5.079f, 0.0f, false, true, 5.286f, 5.067f)
                arcToRelative(5.077f, 5.077f, 0.0f, false, true, -5.076f, 5.07f)
                close()
                moveTo(10.943f, 5.685f)
                curveToRelative(-1.467f, 0.0f, -2.792f, 0.558f, -3.736f, 1.572f)
                curveTo(6.263f, 8.27f, 5.75f, 9.682f, 5.75f, 11.24f)
                curveToRelative(0.0f, 0.398f, -0.409f, 0.515f, -0.543f, 0.552f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -1.748f, 1.173f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, false, -0.743f, 2.04f)
                arcToRelative(3.32f, 3.32f, 0.0f, false, false, 3.317f, 3.316f)
                horizontalLineToRelative(10.728f)
                arcToRelative(4.519f, 4.519f, 0.0f, false, false, 4.513f, -4.513f)
                arcToRelative(4.516f, 4.516f, 0.0f, false, false, -4.51f, -4.512f)
                curveToRelative(-0.062f, 0.0f, -0.12f, 0.003f, -0.188f, 0.005f)
                lineToRelative(-0.12f, 0.006f)
                curveToRelative(-0.207f, 0.006f, -0.359f, -0.104f, -0.448f, -0.328f)
                curveToRelative(-0.003f, -0.005f, -0.003f, -0.01f, -0.006f, -0.016f)
                arcToRelative(5.555f, 5.555f, 0.0f, false, false, -5.059f, -3.278f)
                close()
            }
        }
        .build()
        return _cloudLight!!
    }

private var _cloudLight: ImageVector? = null
