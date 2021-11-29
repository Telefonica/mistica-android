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

public val FilledGroup.DocumentOtherFilled: ImageVector
    get() {
        if (_documentOtherFilled != null) {
            return _documentOtherFilled!!
        }
        _documentOtherFilled = Builder(name = "DocumentOtherFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.632f, 3.83f)
                verticalLineToRelative(1.759f)
                curveToRelative(0.0f, 0.666f, 0.208f, 1.215f, 0.614f, 1.613f)
                curveToRelative(0.406f, 0.398f, 0.98f, 0.608f, 1.667f, 0.608f)
                horizontalLineToRelative(1.767f)
                lineToRelative(-4.048f, -3.98f)
                close()
                moveTo(19.327f, 7.916f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, 0.048f, 0.244f)
                verticalLineToRelative(12.308f)
                curveToRelative(0.0f, 0.745f, -0.63f, 1.378f, -1.387f, 1.378f)
                lineTo(5.997f, 21.846f)
                curveToRelative(-0.734f, 0.0f, -1.387f, -0.641f, -1.387f, -1.378f)
                lineToRelative(0.042f, -3.3f)
                lineToRelative(-0.042f, -7.977f)
                lineTo(4.61f, 3.538f)
                curveToRelative(0.0f, -0.723f, 0.661f, -1.378f, 1.387f, -1.378f)
                horizontalLineToRelative(7.3f)
                curveToRelative(0.232f, 0.0f, 0.453f, 0.09f, 0.613f, 0.252f)
                lineToRelative(5.21f, 5.123f)
                arcToRelative(0.846f, 0.846f, 0.0f, false, true, 0.207f, 0.381f)
                close()
                moveTo(12.756f, 15.294f)
                arcToRelative(0.915f, 0.915f, 0.0f, false, false, -0.916f, -0.932f)
                arcToRelative(0.913f, 0.913f, 0.0f, false, false, -0.916f, 0.932f)
                verticalLineToRelative(0.017f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, 0.924f, 0.925f)
                curveToRelative(0.51f, 0.0f, 0.908f, -0.407f, 0.908f, -0.942f)
                close()
                moveTo(15.862f, 15.294f)
                arcToRelative(0.915f, 0.915f, 0.0f, false, false, -0.916f, -0.932f)
                arcToRelative(0.913f, 0.913f, 0.0f, false, false, -0.916f, 0.932f)
                verticalLineToRelative(0.017f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, 0.925f, 0.925f)
                curveToRelative(0.51f, 0.0f, 0.907f, -0.407f, 0.907f, -0.942f)
                close()
                moveTo(9.646f, 15.294f)
                arcToRelative(0.917f, 0.917f, 0.0f, false, false, -0.924f, -0.932f)
                curveToRelative(-0.51f, 0.0f, -0.908f, 0.411f, -0.908f, 0.932f)
                verticalLineToRelative(0.017f)
                curveToRelative(0.0f, 0.518f, 0.398f, 0.925f, 0.916f, 0.925f)
                curveToRelative(0.519f, 0.0f, 0.916f, -0.407f, 0.916f, -0.942f)
                close()
            }
        }
        .build()
        return _documentOtherFilled!!
    }

private var _documentOtherFilled: ImageVector? = null
