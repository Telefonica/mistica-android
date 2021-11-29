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

public val RegularGroup.EditPencilRegular: ImageVector
    get() {
        if (_editPencilRegular != null) {
            return _editPencilRegular!!
        }
        _editPencilRegular = Builder(name = "EditPencilRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.017f, 19.933f)
                curveToRelative(0.442f, 0.0f, 0.804f, 0.375f, 0.804f, 0.837f)
                curveToRelative(0.0f, 0.465f, -0.362f, 0.84f, -0.804f, 0.84f)
                lineTo(4.482f, 21.61f)
                curveToRelative(-0.443f, 0.0f, -0.804f, -0.375f, -0.804f, -0.84f)
                curveToRelative(0.0f, -0.462f, 0.361f, -0.837f, 0.804f, -0.837f)
                horizontalLineToRelative(15.535f)
                close()
                moveTo(6.846f, 12.745f)
                lineTo(5.36f, 17.482f)
                lineToRelative(0.045f, 0.115f)
                horizontalLineToRelative(0.006f)
                lineToRelative(4.372f, -1.558f)
                curveToRelative(2.112f, -2.008f, 8.33f, -7.95f, 8.751f, -8.395f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, false, 0.644f, -1.594f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, false, -0.638f, -1.672f)
                arcToRelative(2.107f, 2.107f, 0.0f, false, false, -1.51f, -0.678f)
                curveToRelative(-0.538f, 0.0f, -1.042f, 0.236f, -1.451f, 0.678f)
                curveToRelative(-0.482f, 0.516f, -8.398f, 8.048f, -8.734f, 8.367f)
                close()
                moveTo(5.403f, 19.275f)
                arcToRelative(1.63f, 1.63f, 0.0f, false, true, -1.182f, -0.527f)
                arcToRelative(1.823f, 1.823f, 0.0f, false, true, -0.39f, -1.784f)
                lineToRelative(1.466f, -4.704f)
                curveToRelative(0.09f, -0.29f, 0.252f, -0.554f, 0.47f, -0.759f)
                curveToRelative(3.975f, -3.784f, 8.362f, -7.977f, 8.653f, -8.29f)
                curveToRelative(0.712f, -0.768f, 1.636f, -1.191f, 2.608f, -1.191f)
                curveToRelative(0.992f, 0.0f, 1.964f, 0.434f, 2.664f, 1.187f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 1.092f, 2.843f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, true, -1.106f, 2.765f)
                curveToRelative(-0.552f, 0.588f, -8.717f, 8.373f, -8.798f, 8.448f)
                arcToRelative(1.552f, 1.552f, 0.0f, false, true, -0.577f, 0.359f)
                lineTo(5.93f, 19.179f)
                arcToRelative(1.461f, 1.461f, 0.0f, false, true, -0.527f, 0.095f)
                close()
            }
        }
        .build()
        return _editPencilRegular!!
    }

private var _editPencilRegular: ImageVector? = null
