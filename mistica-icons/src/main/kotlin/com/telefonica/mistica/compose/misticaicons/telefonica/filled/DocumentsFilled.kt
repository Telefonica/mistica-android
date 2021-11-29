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

public val FilledGroup.DocumentsFilled: ImageVector
    get() {
        if (_documentsFilled != null) {
            return _documentsFilled!!
        }
        _documentsFilled = Builder(name = "DocumentsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.036f, 10.09f)
                curveToRelative(-0.532f, 0.0f, -0.977f, -0.16f, -1.288f, -0.465f)
                curveToRelative(-0.308f, -0.297f, -0.468f, -0.723f, -0.468f, -1.224f)
                lineTo(16.28f, 7.264f)
                lineToRelative(2.908f, 2.826f)
                horizontalLineToRelative(-1.152f)
                close()
                moveTo(13.821f, 5.457f)
                lineTo(9.824f, 5.457f)
                curveToRelative(-0.684f, 0.0f, -1.28f, 0.59f, -1.28f, 1.263f)
                verticalLineToRelative(9.995f)
                lineToRelative(-4.295f, 0.016f)
                lineToRelative(0.003f, -13.313f)
                lineToRelative(9.569f, -0.017f)
                verticalLineToRelative(2.056f)
                close()
                moveTo(20.997f, 10.255f)
                arcToRelative(0.801f, 0.801f, 0.0f, false, false, -0.207f, -0.358f)
                lineToRelative(-4.325f, -4.202f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.588f, -0.238f)
                horizontalLineToRelative(-0.804f)
                lineTo(15.073f, 3.4f)
                curveToRelative(0.0f, -0.672f, -0.574f, -1.241f, -1.255f, -1.241f)
                lineTo(4.255f, 2.159f)
                curveTo(3.575f, 2.16f, 3.0f, 2.729f, 3.0f, 3.4f)
                verticalLineToRelative(13.331f)
                curveToRelative(0.0f, 0.659f, 0.585f, 1.239f, 1.252f, 1.239f)
                horizontalLineToRelative(4.291f)
                verticalLineToRelative(2.613f)
                curveToRelative(0.0f, 0.686f, 0.586f, 1.263f, 1.28f, 1.263f)
                horizontalLineToRelative(9.944f)
                curveToRelative(0.695f, 0.0f, 1.278f, -0.577f, 1.278f, -1.263f)
                lineTo(21.045f, 10.502f)
                arcToRelative(0.677f, 0.677f, 0.0f, false, false, -0.048f, -0.247f)
                close()
            }
        }
        .build()
        return _documentsFilled!!
    }

private var _documentsFilled: ImageVector? = null
