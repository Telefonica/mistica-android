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

public val FilledGroup.PlaneFilled: ImageVector
    get() {
        if (_planeFilled != null) {
            return _planeFilled!!
        }
        _planeFilled = Builder(name = "PlaneFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.683f, 4.692f)
                curveToRelative(0.031f, -0.608f, -0.215f, -1.224f, -0.717f, -1.779f)
                curveToRelative(-1.028f, -1.145f, -2.325f, -1.213f, -3.47f, -0.185f)
                curveToRelative(-0.28f, 0.252f, -2.86f, 3.031f, -3.569f, 3.793f)
                lineTo(5.137f, 5.23f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, false, -0.406f, 0.187f)
                lineTo(3.83f, 6.85f)
                arcToRelative(0.396f, 0.396f, 0.0f, false, false, -0.045f, 0.336f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, 0.222f, 0.258f)
                lineToRelative(6.347f, 2.932f)
                curveToRelative(-0.874f, 0.95f, -1.53f, 1.586f, -2.118f, 2.157f)
                curveToRelative(-0.79f, 0.768f, -1.423f, 1.381f, -2.232f, 2.412f)
                lineToRelative(-2.855f, -0.207f)
                arcToRelative(0.398f, 0.398f, 0.0f, false, false, -0.372f, 0.185f)
                lineToRelative(-0.709f, 1.072f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, false, 0.118f, 0.569f)
                lineToRelative(2.812f, 1.849f)
                lineToRelative(1.832f, 3.075f)
                curveToRelative(0.11f, 0.182f, 0.34f, 0.25f, 0.53f, 0.16f)
                lineToRelative(1.249f, -0.602f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, 0.23f, -0.4f)
                lineToRelative(-0.239f, -3.102f)
                curveToRelative(1.068f, -0.834f, 1.687f, -1.456f, 2.46f, -2.235f)
                arcToRelative(49.409f, 49.409f, 0.0f, false, true, 2.173f, -2.092f)
                lineToRelative(3.017f, 6.353f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.547f, 0.193f)
                horizontalLineToRelative(0.002f)
                lineToRelative(1.443f, -0.706f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, 0.224f, -0.431f)
                lineTo(17.073f, 9.77f)
                curveToRelative(0.703f, -0.644f, 3.468f, -3.165f, 3.709f, -3.383f)
                curveToRelative(0.557f, -0.505f, 0.87f, -1.09f, 0.901f, -1.695f)
            }
        }
        .build()
        return _planeFilled!!
    }

private var _planeFilled: ImageVector? = null
