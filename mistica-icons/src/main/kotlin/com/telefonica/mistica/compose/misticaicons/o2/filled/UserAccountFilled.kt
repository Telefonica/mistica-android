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

public val FilledGroup.UserAccountFilled: ImageVector
    get() {
        if (_userAccountFilled != null) {
            return _userAccountFilled!!
        }
        _userAccountFilled = Builder(name = "UserAccountFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.63f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-0.37f)
                curveToRelative(0.0f, -3.441f, 3.032f, -6.347f, 7.122f, -7.172f)
                curveToRelative(-2.217f, -0.981f, -3.78f, -3.29f, -3.78f, -5.978f)
                curveTo(6.342f, 4.906f, 9.104f, 2.0f, 12.5f, 2.0f)
                curveToRelative(3.396f, 0.0f, 6.158f, 2.906f, 6.158f, 6.48f)
                curveToRelative(0.0f, 2.688f, -1.559f, 4.997f, -3.78f, 5.978f)
                curveToRelative(4.095f, 0.83f, 7.122f, 3.73f, 7.122f, 7.172f)
                close()
            }
        }
        .build()
        return _userAccountFilled!!
    }

private var _userAccountFilled: ImageVector? = null
