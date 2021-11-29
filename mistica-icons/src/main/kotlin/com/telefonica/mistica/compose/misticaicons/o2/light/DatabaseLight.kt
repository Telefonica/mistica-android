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

public val LightGroup.DatabaseLight: ImageVector
    get() {
        if (_databaseLight != null) {
            return _databaseLight!!
        }
        _databaseLight = Builder(name = "DatabaseLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.29f, 21.287f)
                lineTo(4.714f, 21.287f)
                verticalLineToRelative(-6.428f)
                horizontalLineToRelative(14.221f)
                verticalLineToRelative(2.501f)
                curveToRelative(0.0f, 0.215f, 0.141f, 0.357f, 0.355f, 0.357f)
                reflectiveCurveToRelative(0.355f, -0.142f, 0.355f, -0.357f)
                lineTo(19.645f, 3.787f)
                arcTo(1.766f, 1.766f, 0.0f, false, false, 17.865f, 2.0f)
                lineTo(4.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(15.286f)
                curveToRelative(0.213f, 0.0f, 0.355f, -0.142f, 0.355f, -0.357f)
                curveToRelative(0.0f, -0.214f, -0.137f, -0.356f, -0.35f, -0.356f)
                close()
                moveTo(4.714f, 14.147f)
                lineTo(4.714f, 8.788f)
                horizontalLineToRelative(14.221f)
                verticalLineToRelative(5.357f)
                lineTo(4.715f, 14.145f)
                close()
                moveTo(17.866f, 2.717f)
                curveToRelative(0.605f, 0.0f, 1.065f, 0.467f, 1.065f, 1.07f)
                verticalLineToRelative(4.288f)
                lineTo(4.714f, 8.075f)
                lineTo(4.714f, 2.718f)
                horizontalLineToRelative(13.152f)
                close()
                moveTo(6.134f, 4.863f)
                horizontalLineToRelative(2.844f)
                curveToRelative(0.214f, 0.0f, 0.355f, -0.142f, 0.355f, -0.357f)
                reflectiveCurveToRelative(-0.14f, -0.356f, -0.355f, -0.356f)
                lineTo(6.134f, 4.15f)
                curveToRelative(-0.214f, 0.0f, -0.355f, 0.141f, -0.355f, 0.356f)
                reflectiveCurveToRelative(0.141f, 0.357f, 0.355f, 0.357f)
                close()
                moveTo(8.978f, 10.216f)
                lineTo(6.134f, 10.216f)
                curveToRelative(-0.214f, 0.0f, -0.355f, 0.142f, -0.355f, 0.356f)
                curveToRelative(0.0f, 0.215f, 0.141f, 0.357f, 0.355f, 0.357f)
                horizontalLineToRelative(2.844f)
                curveToRelative(0.214f, 0.0f, 0.355f, -0.142f, 0.355f, -0.357f)
                curveToRelative(0.0f, -0.214f, -0.14f, -0.356f, -0.355f, -0.356f)
                close()
                moveTo(6.134f, 16.29f)
                curveToRelative(-0.214f, 0.0f, -0.355f, 0.142f, -0.355f, 0.357f)
                reflectiveCurveToRelative(0.141f, 0.356f, 0.355f, 0.356f)
                horizontalLineToRelative(2.844f)
                curveToRelative(0.214f, 0.0f, 0.355f, -0.141f, 0.355f, -0.356f)
                reflectiveCurveToRelative(-0.14f, -0.357f, -0.355f, -0.357f)
                lineTo(6.134f, 16.29f)
                close()
                moveTo(19.29f, 18.786f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, false, 0.0f, 1.427f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, false, 0.0f, -1.427f)
                close()
            }
        }
        .build()
        return _databaseLight!!
    }

private var _databaseLight: ImageVector? = null
