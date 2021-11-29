package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.WaterDropFilled: ImageVector
    get() {
        if (_waterDropFilled != null) {
            return _waterDropFilled!!
        }
        _waterDropFilled = Builder(name = "WaterDropFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.933f, 19.5f)
                arcToRelative(5.85f, 5.85f, 0.0f, false, true, -4.187f, -1.787f)
                arcTo(6.067f, 6.067f, 0.0f, false, true, 5.0f, 13.426f)
                curveToRelative(0.0f, -2.002f, 1.393f, -4.32f, 2.509f, -6.143f)
                curveToRelative(0.245f, -0.393f, 2.826f, -4.927f, 2.826f, -4.927f)
                curveToRelative(0.138f, -0.214f, 0.348f, -0.356f, 0.594f, -0.356f)
                curveToRelative(0.245f, 0.0f, 0.486f, 0.142f, 0.593f, 0.356f)
                lineToRelative(2.826f, 4.927f)
                curveToRelative(1.116f, 1.856f, 2.51f, 4.178f, 2.51f, 6.18f)
                curveToRelative(0.0f, 1.608f, -0.595f, 3.107f, -1.71f, 4.25f)
                lineToRelative(-0.036f, 0.037f)
                curveTo(14.0f, 18.856f, 12.5f, 19.5f, 10.933f, 19.5f)
                close()
                moveTo(19.478f, 17.713f)
                horizontalLineToRelative(-1.393f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, -0.523f, -0.535f)
                curveToRelative(0.0f, -0.283f, 0.246f, -0.534f, 0.523f, -0.534f)
                horizontalLineToRelative(1.393f)
                curveToRelative(0.276f, 0.0f, 0.522f, 0.25f, 0.522f, 0.534f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, -0.522f, 0.535f)
                close()
                moveTo(17.804f, 20.464f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, -0.384f, -0.141f)
                lineToRelative(-0.942f, -0.965f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, 0.0f, -0.75f)
                arcToRelative(0.496f, 0.496f, 0.0f, false, true, 0.732f, 0.0f)
                lineToRelative(0.942f, 0.965f)
                curveToRelative(0.21f, 0.215f, 0.21f, 0.535f, 0.0f, 0.75f)
                curveToRelative(-0.072f, 0.105f, -0.21f, 0.141f, -0.348f, 0.141f)
                close()
                moveTo(14.942f, 22.0f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, -0.522f, -0.535f)
                lineTo(14.42f, 20.04f)
                curveToRelative(0.0f, -0.283f, 0.245f, -0.534f, 0.522f, -0.534f)
                reflectiveCurveToRelative(0.522f, 0.25f, 0.522f, 0.534f)
                verticalLineToRelative(1.422f)
                curveToRelative(0.0f, 0.288f, -0.24f, 0.539f, -0.522f, 0.539f)
                close()
            }
        }
        .build()
        return _waterDropFilled!!
    }

private var _waterDropFilled: ImageVector? = null
