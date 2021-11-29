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

public val LightGroup.ElectrocardiogramLight: ImageVector
    get() {
        if (_electrocardiogramLight != null) {
            return _electrocardiogramLight!!
        }
        _electrocardiogramLight = Builder(name = "ElectrocardiogramLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 16.316f)
                curveToRelative(0.215f, 0.0f, 0.356f, -0.142f, 0.356f, -0.357f)
                verticalLineToRelative(-3.577f)
                horizontalLineToRelative(3.57f)
                curveToRelative(0.215f, 0.0f, 0.357f, -0.142f, 0.357f, -0.357f)
                reflectiveCurveToRelative(-0.142f, -0.357f, -0.356f, -0.357f)
                horizontalLineToRelative(-3.57f)
                lineTo(12.355f, 8.091f)
                curveToRelative(0.0f, -0.215f, -0.142f, -0.357f, -0.357f, -0.357f)
                reflectiveCurveToRelative(-0.357f, 0.142f, -0.357f, 0.357f)
                verticalLineToRelative(3.577f)
                horizontalLineToRelative(-3.57f)
                curveToRelative(-0.215f, 0.0f, -0.357f, 0.142f, -0.357f, 0.357f)
                reflectiveCurveToRelative(0.142f, 0.357f, 0.357f, 0.357f)
                horizontalLineToRelative(3.57f)
                verticalLineToRelative(3.577f)
                curveToRelative(0.0f, 0.21f, 0.142f, 0.357f, 0.357f, 0.357f)
                close()
                moveTo(17.46f, 2.0f)
                curveToRelative(-2.108f, 0.0f, -3.392f, 0.824f, -5.463f, 3.471f)
                curveTo(9.995f, 2.898f, 8.533f, 2.0f, 6.357f, 2.0f)
                curveTo(4.249f, 2.0f, 2.0f, 3.429f, 2.0f, 6.543f)
                curveToRelative(0.0f, 4.868f, 6.574f, 11.949f, 9.75f, 15.352f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, false, 0.252f, 0.105f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.252f, -0.105f)
                arcToRelative(0.385f, 0.385f, 0.0f, false, false, 0.036f, -0.5f)
                curveToRelative(-3.108f, -3.292f, -9.572f, -10.23f, -9.572f, -14.847f)
                curveToRelative(0.0f, -1.823f, 1.143f, -3.829f, 3.643f, -3.829f)
                curveToRelative(1.714f, 0.0f, 3.109f, 0.573f, 5.358f, 3.577f)
                arcToRelative(0.329f, 0.329f, 0.0f, false, false, 0.283f, 0.142f)
                arcToRelative(0.323f, 0.323f, 0.0f, false, false, 0.284f, -0.142f)
                curveToRelative(2.285f, -3.078f, 3.428f, -3.577f, 5.18f, -3.577f)
                curveToRelative(1.892f, 0.0f, 3.82f, 1.324f, 3.82f, 3.865f)
                curveToRelative(0.0f, 2.038f, -1.284f, 4.759f, -3.784f, 8.12f)
                lineToRelative(-2.643f, 3.293f)
                curveToRelative(-0.105f, 0.142f, -0.105f, 0.394f, 0.037f, 0.5f)
                curveToRelative(0.142f, 0.105f, 0.393f, 0.105f, 0.498f, -0.037f)
                lineToRelative(2.68f, -3.293f)
                curveTo(20.714f, 11.627f, 22.0f, 8.797f, 22.0f, 6.58f)
                curveTo(22.0f, 3.575f, 19.714f, 2.0f, 17.46f, 2.0f)
                close()
                moveTo(13.784f, 19.174f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, false, 0.0f, 1.43f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, false, 0.0f, -1.43f)
                close()
            }
        }
        .build()
        return _electrocardiogramLight!!
    }

private var _electrocardiogramLight: ImageVector? = null
