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
                moveTo(11.587f, 11.86f)
                curveToRelative(-1.558f, 0.0f, -2.77f, -0.409f, -3.61f, -1.219f)
                curveToRelative(-0.872f, -0.84f, -1.315f, -2.086f, -1.315f, -3.705f)
                curveToRelative(0.0f, -1.62f, 0.443f, -2.869f, 1.314f, -3.712f)
                curveTo(8.816f, 2.412f, 10.03f, 2.0f, 11.586f, 2.0f)
                curveToRelative(1.558f, 0.0f, 2.774f, 0.412f, 3.617f, 1.224f)
                curveToRelative(0.877f, 0.843f, 1.32f, 2.093f, 1.32f, 3.712f)
                curveToRelative(0.0f, 1.619f, -0.446f, 2.865f, -1.323f, 3.705f)
                curveToRelative(-0.84f, 0.81f, -2.056f, 1.219f, -3.613f, 1.219f)
                close()
                moveTo(19.78f, 21.692f)
                lineTo(3.394f, 21.692f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                verticalLineToRelative(-1.639f)
                curveToRelative(0.0f, -1.569f, 0.487f, -2.905f, 1.411f, -3.868f)
                curveToRelative(1.008f, -1.05f, 2.504f, -1.608f, 4.33f, -1.608f)
                horizontalLineToRelative(6.009f)
                curveToRelative(1.826f, 0.0f, 3.328f, 0.554f, 4.336f, 1.605f)
                curveToRelative(0.93f, 0.966f, 1.42f, 2.302f, 1.42f, 3.871f)
                verticalLineToRelative(1.639f)
                curveToRelative(0.0f, 0.308f, -0.252f, 0.56f, -0.56f, 0.56f)
                close()
            }
        }
        .build()
        return _userAccountFilled!!
    }

private var _userAccountFilled: ImageVector? = null
