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

public val FilledGroup.WarningFilled: ImageVector
    get() {
        if (_warningFilled != null) {
            return _warningFilled!!
        }
        _warningFilled = Builder(name = "WarningFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.997f, 18.41f)
                arcToRelative(0.786f, 0.786f, 0.0f, false, true, 0.0f, -1.571f)
                curveToRelative(0.432f, 0.0f, 0.782f, 0.351f, 0.782f, 0.786f)
                curveToRelative(0.0f, 0.435f, -0.35f, 0.786f, -0.782f, 0.786f)
                close()
                moveTo(11.308f, 5.72f)
                arcToRelative(0.689f, 0.689f, 0.0f, false, true, 1.378f, 0.0f)
                verticalLineToRelative(9.498f)
                arcToRelative(0.689f, 0.689f, 0.0f, false, true, -1.378f, 0.0f)
                lineTo(11.308f, 5.721f)
                close()
                moveTo(12.46f, 1.013f)
                arcTo(35.105f, 35.105f, 0.0f, false, false, 11.621f, 1.0f)
                horizontalLineToRelative(-0.203f)
                curveTo(9.208f, 1.019f, 1.0f, 1.776f, 1.0f, 11.962f)
                curveToRelative(0.0f, 10.202f, 8.286f, 11.004f, 10.496f, 11.035f)
                arcToRelative(42.806f, 42.806f, 0.0f, false, false, 1.008f, -0.003f)
                curveTo(14.604f, 22.956f, 23.0f, 22.167f, 23.0f, 12.028f)
                curveTo(23.0f, 1.914f, 14.614f, 1.063f, 12.46f, 1.013f)
                close()
            }
        }
        .build()
        return _warningFilled!!
    }

private var _warningFilled: ImageVector? = null
