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

public val RegularGroup.ImportRegular: ImageVector
    get() {
        if (_importRegular != null) {
            return _importRegular!!
        }
        _importRegular = Builder(name = "ImportRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.305f, 16.53f)
                lineTo(5.585f, 10.8f)
                arcTo(0.844f, 0.844f, 0.0f, false, true, 6.78f, 9.608f)
                lineToRelative(4.28f, 4.286f)
                lineTo(11.06f, 2.844f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, 1.689f, 0.0f)
                verticalLineToRelative(11.05f)
                lineToRelative(4.207f, -4.213f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, 1.216f, 1.17f)
                curveToRelative(-0.006f, 0.009f, -0.014f, 0.015f, -0.023f, 0.023f)
                lineToRelative(-5.647f, 5.655f)
                arcToRelative(0.853f, 0.853f, 0.0f, false, true, -1.196f, 0.0f)
                close()
                moveTo(20.843f, 15.913f)
                curveToRelative(0.465f, 0.0f, 0.843f, 0.378f, 0.843f, 0.843f)
                verticalLineToRelative(4.087f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, true, -0.843f, 0.843f)
                horizontalLineToRelative(-18.0f)
                arcTo(0.844f, 0.844f, 0.0f, false, true, 2.0f, 20.843f)
                verticalLineToRelative(-4.087f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, 1.69f, 0.0f)
                lineTo(3.69f, 20.0f)
                horizontalLineToRelative(16.313f)
                verticalLineToRelative(-3.244f)
                arcToRelative(0.838f, 0.838f, 0.0f, false, true, 0.84f, -0.843f)
                close()
            }
        }
        .build()
        return _importRegular!!
    }

private var _importRegular: ImageVector? = null
