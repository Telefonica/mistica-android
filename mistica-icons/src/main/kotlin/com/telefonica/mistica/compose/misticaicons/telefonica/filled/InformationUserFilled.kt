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

public val FilledGroup.InformationUserFilled: ImageVector
    get() {
        if (_informationUserFilled != null) {
            return _informationUserFilled!!
        }
        _informationUserFilled = Builder(name = "InformationUserFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.013f, 8.355f)
                arcToRelative(0.733f, 0.733f, 0.0f, false, true, 0.0f, -1.465f)
                arcToRelative(0.733f, 0.733f, 0.0f, false, true, 0.0f, 1.465f)
                close()
                moveTo(12.692f, 17.103f)
                arcToRelative(0.689f, 0.689f, 0.0f, false, true, -1.378f, 0.0f)
                lineTo(11.314f, 9.951f)
                arcToRelative(0.689f, 0.689f, 0.0f, false, true, 1.378f, 0.0f)
                verticalLineToRelative(7.152f)
                close()
                moveTo(12.504f, 1.003f)
                curveTo(12.391f, 1.0f, 12.275f, 1.0f, 12.16f, 1.0f)
                curveToRelative(-0.232f, 0.0f, -0.464f, 0.003f, -0.664f, 0.006f)
                curveTo(9.399f, 1.044f, 1.0f, 1.833f, 1.0f, 11.97f)
                curveToRelative(0.0f, 10.113f, 8.386f, 10.964f, 10.54f, 11.017f)
                curveToRelative(0.253f, 0.007f, 0.548f, 0.013f, 0.833f, 0.013f)
                horizontalLineToRelative(0.21f)
                curveTo(14.788f, 22.981f, 23.0f, 22.224f, 23.0f, 12.04f)
                curveTo(23.0f, 1.832f, 14.71f, 1.033f, 12.504f, 1.002f)
                close()
            }
        }
        .build()
        return _informationUserFilled!!
    }

private var _informationUserFilled: ImageVector? = null
