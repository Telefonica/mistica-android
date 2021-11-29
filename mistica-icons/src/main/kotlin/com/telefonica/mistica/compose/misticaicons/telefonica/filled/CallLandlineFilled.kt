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

public val FilledGroup.CallLandlineFilled: ImageVector
    get() {
        if (_callLandlineFilled != null) {
            return _callLandlineFilled!!
        }
        _callLandlineFilled = Builder(name = "CallLandlineFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.094f, 2.15f)
                curveToRelative(0.846f, 0.017f, 1.683f, 0.432f, 2.487f, 1.236f)
                curveToRelative(0.303f, 0.297f, 0.569f, 0.633f, 0.785f, 1.0f)
                curveToRelative(0.431f, 0.694f, 0.588f, 1.412f, 0.465f, 2.131f)
                curveToRelative(-0.124f, 0.72f, -0.524f, 1.423f, -1.196f, 2.096f)
                arcToRelative(5.707f, 5.707f, 0.0f, false, true, -0.496f, 0.442f)
                curveToRelative(-0.065f, 0.118f, -0.025f, 0.488f, 0.496f, 1.25f)
                curveToRelative(0.602f, 0.88f, 1.61f, 1.918f, 2.316f, 2.624f)
                lineToRelative(0.084f, 0.084f)
                curveToRelative(0.706f, 0.706f, 1.745f, 1.712f, 2.625f, 2.317f)
                curveToRelative(0.759f, 0.52f, 1.131f, 0.56f, 1.25f, 0.496f)
                arcToRelative(5.28f, 5.28f, 0.0f, false, true, 0.442f, -0.496f)
                curveToRelative(0.672f, -0.673f, 1.375f, -1.073f, 2.095f, -1.196f)
                curveToRelative(0.72f, -0.124f, 1.437f, 0.033f, 2.132f, 0.465f)
                curveToRelative(0.366f, 0.218f, 0.7f, 0.481f, 1.0f, 0.787f)
                curveToRelative(0.803f, 0.804f, 1.218f, 1.641f, 1.235f, 2.487f)
                curveToRelative(0.017f, 0.877f, -0.395f, 1.765f, -1.227f, 2.633f)
                curveToRelative(-0.291f, 0.306f, -0.698f, 0.597f, -0.832f, 0.695f)
                lineToRelative(-0.017f, 0.011f)
                arcToRelative(0.154f, 0.154f, 0.0f, false, false, -0.025f, 0.02f)
                curveToRelative(-0.563f, 0.38f, -1.277f, 0.574f, -2.104f, 0.574f)
                curveToRelative(-0.865f, 0.0f, -1.857f, -0.213f, -2.924f, -0.639f)
                curveToRelative(-2.182f, -0.87f, -4.571f, -2.566f, -6.908f, -4.902f)
                lineToRelative(-0.005f, -0.005f)
                lineToRelative(-0.076f, -0.073f)
                lineToRelative(-0.005f, -0.006f)
                curveTo(5.354f, 13.845f, 3.66f, 11.46f, 2.789f, 9.274f)
                curveToRelative(-0.832f, -2.09f, -0.852f, -3.874f, -0.056f, -5.028f)
                lineToRelative(0.016f, -0.025f)
                lineToRelative(0.012f, -0.017f)
                curveToRelative(0.103f, -0.132f, 0.395f, -0.538f, 0.7f, -0.83f)
                curveToRelative(0.868f, -0.829f, 1.753f, -1.24f, 2.633f, -1.224f)
                close()
            }
        }
        .build()
        return _callLandlineFilled!!
    }

private var _callLandlineFilled: ImageVector? = null
