package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.SmileySadRegular: ImageVector
    get() {
        if (_smileySadRegular != null) {
            return _smileySadRegular!!
        }
        _smileySadRegular = Builder(name = "SmileySadRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.93f, 13.415f)
                curveToRelative(3.714f, 0.039f, 5.894f, 2.414f, 5.986f, 2.515f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, true, -0.913f, 0.824f)
                curveToRelative(-0.02f, -0.02f, -1.927f, -2.076f, -5.104f, -2.11f)
                curveToRelative(-0.05f, 0.006f, -3.266f, -0.1f, -5.207f, 2.07f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, -0.919f, -0.818f)
                curveToRelative(2.333f, -2.616f, 6.003f, -2.487f, 6.157f, -2.481f)
                close()
                moveTo(11.84f, 20.457f)
                curveToRelative(5.796f, 0.0f, 8.617f, -2.818f, 8.617f, -8.611f)
                curveToRelative(0.0f, -5.796f, -2.818f, -8.616f, -8.617f, -8.616f)
                curveToRelative(-5.792f, 0.0f, -8.61f, 2.818f, -8.61f, 8.616f)
                curveToRelative(0.0f, 5.793f, 2.818f, 8.61f, 8.61f, 8.61f)
                close()
                moveTo(11.84f, 2.0f)
                curveToRelative(6.219f, 0.0f, 9.846f, 3.14f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.706f, -3.627f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.218f, 0.0f, -9.84f, -3.134f, -9.84f, -9.84f)
                curveTo(2.0f, 5.14f, 5.622f, 2.0f, 11.84f, 2.0f)
                close()
                moveTo(8.857f, 10.392f)
                curveToRelative(-0.356f, 0.0f, -0.653f, -0.112f, -0.86f, -0.322f)
                curveToRelative(-0.204f, -0.207f, -0.305f, -0.493f, -0.305f, -0.846f)
                curveToRelative(0.0f, -0.723f, 0.448f, -1.17f, 1.165f, -1.17f)
                curveToRelative(0.72f, 0.0f, 1.165f, 0.447f, 1.165f, 1.17f)
                curveToRelative(0.0f, 0.353f, -0.103f, 0.639f, -0.305f, 0.846f)
                curveToRelative(-0.207f, 0.21f, -0.504f, 0.322f, -0.86f, 0.322f)
                close()
                moveTo(14.829f, 10.392f)
                curveToRelative(-0.356f, 0.0f, -0.653f, -0.112f, -0.86f, -0.322f)
                curveToRelative(-0.204f, -0.21f, -0.305f, -0.496f, -0.305f, -0.846f)
                curveToRelative(0.0f, -0.723f, 0.448f, -1.17f, 1.165f, -1.17f)
                curveToRelative(0.72f, 0.0f, 1.165f, 0.447f, 1.165f, 1.17f)
                curveToRelative(0.0f, 0.353f, -0.103f, 0.639f, -0.308f, 0.846f)
                curveToRelative(-0.204f, 0.21f, -0.501f, 0.322f, -0.857f, 0.322f)
                close()
            }
        }
        .build()
        return _smileySadRegular!!
    }

private var _smileySadRegular: ImageVector? = null
