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

public val LightGroup.ArrowDownLeftLight: ImageVector
    get() {
        if (_arrowDownLeftLight != null) {
            return _arrowDownLeftLight!!
        }
        _arrowDownLeftLight = Builder(name = "ArrowDownLeftLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.341f, 3.914f)
                arcToRelative(0.358f, 0.358f, 0.0f, false, true, 0.0f, 0.512f)
                lineToRelative(-6.915f, 6.911f)
                curveToRelative(-0.26f, 0.26f, -0.316f, 0.197f, -1.037f, -0.52f)
                lineTo(4.591f, 8.01f)
                arcToRelative(1.112f, 1.112f, 0.0f, false, false, -1.226f, -0.252f)
                arcToRelative(1.02f, 1.02f, 0.0f, false, false, -0.632f, 0.965f)
                verticalLineToRelative(12.544f)
                horizontalLineTo(15.22f)
                curveToRelative(0.429f, 0.0f, 0.789f, -0.244f, 0.957f, -0.648f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, -0.244f, -1.274f)
                lineToRelative(-3.528f, -3.527f)
                lineToRelative(8.973f, -8.981f)
                arcToRelative(0.358f, 0.358f, 0.0f, false, true, 0.513f, 0.0f)
                arcToRelative(0.358f, 0.358f, 0.0f, false, true, 0.0f, 0.512f)
                lineToRelative(-8.469f, 8.469f)
                lineToRelative(3.02f, 3.019f)
                curveToRelative(0.544f, 0.544f, 0.696f, 1.353f, 0.404f, 2.07f)
                arcTo(1.743f, 1.743f, 0.0f, false, true, 15.217f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.727f)
                curveToRelative(0.0f, -0.729f, 0.412f, -1.362f, 1.09f, -1.638f)
                arcToRelative(1.864f, 1.864f, 0.0f, false, true, 2.013f, 0.404f)
                lineToRelative(3.075f, 3.076f)
                lineToRelative(6.65f, -6.655f)
                arcToRelative(0.358f, 0.358f, 0.0f, false, true, 0.513f, 0.0f)
                close()
                moveTo(16.551f, 2.0f)
                arcToRelative(0.729f, 0.729f, 0.0f, true, true, 0.0f, 1.457f)
                arcToRelative(0.729f, 0.729f, 0.0f, false, true, 0.0f, -1.457f)
                close()
            }
        }
        .build()
        return _arrowDownLeftLight!!
    }

private var _arrowDownLeftLight: ImageVector? = null
