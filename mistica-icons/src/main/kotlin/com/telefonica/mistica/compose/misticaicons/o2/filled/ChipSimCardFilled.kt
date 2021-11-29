package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.ChipSimCardFilled: ImageVector
    get() {
        if (_chipSimCardFilled != null) {
            return _chipSimCardFilled!!
        }
        _chipSimCardFilled = Builder(name = "ChipSimCardFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.201f, 2.0f)
                curveToRelative(0.575f, 0.0f, 1.146f, 0.252f, 1.542f, 0.648f)
                lineToRelative(3.686f, 3.69f)
                curveToRelative(0.36f, 0.356f, 0.54f, 0.824f, 0.571f, 1.396f)
                lineTo(20.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 4.115f)
                curveTo(5.0f, 2.932f, 5.859f, 2.0f, 6.933f, 2.0f)
                close()
                moveTo(15.958f, 9.705f)
                lineTo(9.05f, 9.705f)
                curveToRelative(-0.647f, 0.0f, -1.219f, 0.576f, -1.219f, 1.22f)
                verticalLineToRelative(8.1f)
                horizontalLineToRelative(9.346f)
                verticalLineToRelative(-8.1f)
                curveToRelative(0.0f, -0.648f, -0.576f, -1.22f, -1.219f, -1.22f)
                close()
                moveTo(15.923f, 10.78f)
                curveToRelative(0.071f, 0.0f, 0.14f, 0.108f, 0.14f, 0.144f)
                verticalLineToRelative(7.026f)
                lineTo(8.901f, 17.95f)
                verticalLineToRelative(-7.026f)
                curveToRelative(0.0f, -0.036f, 0.108f, -0.144f, 0.144f, -0.144f)
                close()
            }
        }
        .build()
        return _chipSimCardFilled!!
    }

private var _chipSimCardFilled: ImageVector? = null
