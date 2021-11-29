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

public val FilledGroup.DiamondFilled: ImageVector
    get() {
        if (_diamondFilled != null) {
            return _diamondFilled!!
        }
        _diamondFilled = Builder(name = "DiamondFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.714f, 2.0f)
                horizontalLineToRelative(5.392f)
                lineToRelative(-1.641f, 5.143f)
                lineTo(12.715f, 2.0f)
                close()
                moveTo(17.272f, 7.7f)
                lineTo(18.866f, 2.697f)
                lineTo(21.686f, 7.7f)
                horizontalLineToRelative(-4.414f)
                close()
                moveTo(16.972f, 8.644f)
                horizontalLineToRelative(4.613f)
                lineToRelative(-8.38f, 11.852f)
                lineToRelative(3.767f, -11.852f)
                close()
                moveTo(7.692f, 8.644f)
                horizontalLineToRelative(8.305f)
                lineToRelative(-4.154f, 13.042f)
                lineTo(7.692f, 8.644f)
                close()
                moveTo(7.98f, 7.7f)
                lineToRelative(3.863f, -5.305f)
                lineTo(15.697f, 7.7f)
                lineTo(7.98f, 7.7f)
                close()
                moveTo(5.583f, 2.0f)
                horizontalLineToRelative(5.38f)
                lineTo(7.217f, 7.143f)
                lineTo(5.583f, 2.0f)
                close()
                moveTo(2.0f, 7.7f)
                lineToRelative(2.824f, -5.01f)
                lineTo(6.417f, 7.7f)
                lineTo(2.0f, 7.7f)
                close()
                moveTo(2.104f, 8.644f)
                horizontalLineToRelative(4.61f)
                lineTo(10.482f, 20.5f)
                lineTo(2.104f, 8.644f)
                close()
            }
        }
        .build()
        return _diamondFilled!!
    }

private var _diamondFilled: ImageVector? = null
