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

public val RegularGroup.DocumentOtherRegular: ImageVector
    get() {
        if (_documentOtherRegular != null) {
            return _documentOtherRegular!!
        }
        _documentOtherRegular = Builder(name = "DocumentOtherRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.756f, 15.294f)
                curveToRelative(0.0f, 0.535f, -0.398f, 0.942f, -0.91f, 0.942f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, -0.925f, -0.925f)
                verticalLineToRelative(-0.017f)
                arcToRelative(0.917f, 0.917f, 0.0f, true, true, 1.835f, 0.0f)
                close()
                moveTo(18.181f, 20.468f)
                lineTo(18.181f, 9.028f)
                lineTo(15.91f, 9.028f)
                curveToRelative(-1.003f, 0.0f, -1.866f, -0.325f, -2.493f, -0.95f)
                curveToRelative(-0.647f, -0.632f, -0.98f, -1.492f, -0.98f, -2.49f)
                lineTo(12.437f, 3.377f)
                lineTo(5.998f, 3.377f)
                curveToRelative(-0.072f, 0.0f, -0.185f, 0.106f, -0.19f, 0.17f)
                verticalLineToRelative(5.645f)
                lineToRelative(0.042f, 7.986f)
                lineToRelative(-0.042f, 3.3f)
                curveToRelative(0.0f, 0.047f, 0.095f, 0.154f, 0.19f, 0.154f)
                horizontalLineToRelative(11.992f)
                curveToRelative(0.104f, 0.0f, 0.19f, -0.09f, 0.19f, -0.163f)
                close()
                moveTo(13.632f, 3.83f)
                verticalLineToRelative(1.76f)
                curveToRelative(0.0f, 0.666f, 0.208f, 1.215f, 0.614f, 1.613f)
                curveToRelative(0.406f, 0.398f, 0.98f, 0.608f, 1.667f, 0.608f)
                horizontalLineToRelative(1.767f)
                lineToRelative(-4.048f, -3.98f)
                close()
                moveTo(19.327f, 7.917f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.048f, 0.244f)
                verticalLineToRelative(12.308f)
                curveToRelative(0.0f, 0.745f, -0.63f, 1.378f, -1.387f, 1.378f)
                lineTo(5.997f, 21.847f)
                curveToRelative(-0.734f, 0.0f, -1.387f, -0.641f, -1.387f, -1.378f)
                lineToRelative(0.042f, -3.3f)
                lineToRelative(-0.042f, -7.977f)
                lineTo(4.61f, 3.538f)
                curveToRelative(0.0f, -0.723f, 0.661f, -1.378f, 1.387f, -1.378f)
                horizontalLineToRelative(7.3f)
                curveToRelative(0.229f, 0.0f, 0.453f, 0.09f, 0.613f, 0.252f)
                lineToRelative(5.21f, 5.123f)
                arcToRelative(0.846f, 0.846f, 0.0f, false, true, 0.207f, 0.381f)
                close()
                moveTo(15.862f, 15.295f)
                curveToRelative(0.0f, 0.535f, -0.398f, 0.942f, -0.907f, 0.942f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, true, -0.925f, -0.925f)
                verticalLineToRelative(-0.017f)
                arcToRelative(0.917f, 0.917f, 0.0f, true, true, 1.832f, 0.0f)
                close()
                moveTo(9.646f, 15.295f)
                curveToRelative(0.0f, 0.535f, -0.397f, 0.942f, -0.916f, 0.942f)
                arcToRelative(0.908f, 0.908f, 0.0f, false, true, -0.916f, -0.925f)
                verticalLineToRelative(-0.017f)
                curveToRelative(0.0f, -0.518f, 0.398f, -0.932f, 0.908f, -0.932f)
                arcToRelative(0.918f, 0.918f, 0.0f, false, true, 0.924f, 0.932f)
                close()
            }
        }
        .build()
        return _documentOtherRegular!!
    }

private var _documentOtherRegular: ImageVector? = null
