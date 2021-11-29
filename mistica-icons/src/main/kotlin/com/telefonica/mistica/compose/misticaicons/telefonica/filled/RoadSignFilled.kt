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

public val FilledGroup.RoadSignFilled: ImageVector
    get() {
        if (_roadSignFilled != null) {
            return _roadSignFilled!!
        }
        _roadSignFilled = Builder(name = "RoadSignFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 2.15f)
                curveToRelative(6.44f, 0.0f, 9.846f, 3.406f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.437f, -3.406f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.437f, 0.0f, -9.84f, -3.403f, -9.84f, -9.84f)
                curveToRelative(0.0f, -6.44f, 3.403f, -9.846f, 9.84f, -9.846f)
                close()
                moveTo(13.912f, 6.226f)
                arcToRelative(0.656f, 0.656f, 0.0f, false, false, -0.703f, -0.084f)
                arcToRelative(0.639f, 0.639f, 0.0f, false, false, -0.373f, 0.582f)
                verticalLineToRelative(1.02f)
                lineTo(9.153f, 7.744f)
                curveToRelative(-0.258f, 0.0f, -0.499f, 0.1f, -0.68f, 0.28f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, false, -0.281f, 0.68f)
                verticalLineToRelative(8.446f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.409f, 0.409f)
                horizontalLineToRelative(2.96f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.41f, -0.409f)
                verticalLineToRelative(-5.448f)
                horizontalLineToRelative(0.868f)
                verticalLineToRelative(1.011f)
                curveToRelative(0.0f, 0.25f, 0.146f, 0.476f, 0.37f, 0.583f)
                curveToRelative(0.232f, 0.109f, 0.501f, 0.078f, 0.734f, -0.112f)
                lineToRelative(3.067f, -2.97f)
                arcToRelative(0.657f, 0.657f, 0.0f, false, false, 0.232f, -0.493f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, false, -0.207f, -0.47f)
                lineToRelative(-3.123f, -3.025f)
                close()
            }
        }
        .build()
        return _roadSignFilled!!
    }

private var _roadSignFilled: ImageVector? = null
