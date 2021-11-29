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

public val RegularGroup.ExportRegular: ImageVector
    get() {
        if (_exportRegular != null) {
            return _exportRegular!!
        }
        _exportRegular = Builder(name = "ExportRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.335f, 9.564f)
                arcToRelative(0.842f, 0.842f, 0.0f, false, true, -0.597f, -1.44f)
                lineToRelative(5.717f, -5.728f)
                arcToRelative(0.847f, 0.847f, 0.0f, false, true, 1.194f, 0.0f)
                lineToRelative(5.65f, 5.655f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, -1.171f, 1.216f)
                curveToRelative(-0.009f, -0.006f, -0.014f, -0.014f, -0.023f, -0.022f)
                lineToRelative(-4.21f, -4.213f)
                verticalLineToRelative(11.05f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, -1.689f, 0.0f)
                lineTo(11.206f, 5.032f)
                lineTo(6.929f, 9.315f)
                arcToRelative(0.835f, 0.835f, 0.0f, false, true, -0.594f, 0.249f)
                close()
                moveTo(20.993f, 16.062f)
                curveToRelative(0.465f, 0.0f, 0.843f, 0.379f, 0.843f, 0.844f)
                verticalLineToRelative(4.086f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, true, -0.843f, 0.844f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, true, -0.843f, -0.844f)
                verticalLineToRelative(-4.086f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, 1.69f, 0.0f)
                verticalLineToRelative(3.243f)
                horizontalLineToRelative(16.313f)
                verticalLineToRelative(-3.243f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, 0.84f, -0.844f)
                close()
            }
        }
        .build()
        return _exportRegular!!
    }

private var _exportRegular: ImageVector? = null
