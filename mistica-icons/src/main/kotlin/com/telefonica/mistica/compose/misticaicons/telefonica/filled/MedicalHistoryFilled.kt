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

public val FilledGroup.MedicalHistoryFilled: ImageVector
    get() {
        if (_medicalHistoryFilled != null) {
            return _medicalHistoryFilled!!
        }
        _medicalHistoryFilled = Builder(name = "MedicalHistoryFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.772f, 4.18f)
                curveToRelative(-0.079f, -0.25f, -0.317f, -1.004f, -1.866f, -1.004f)
                curveToRelative(-1.672f, 0.0f, -1.924f, 0.838f, -1.958f, 1.57f)
                lineToRelative(-0.005f, 0.386f)
                curveToRelative(0.01f, 0.266f, 0.022f, 0.652f, 1.963f, 0.652f)
                reflectiveCurveToRelative(1.955f, -0.386f, 1.96f, -0.613f)
                lineTo(13.866f, 4.81f)
                arcToRelative(2.401f, 2.401f, 0.0f, false, false, -0.094f, -0.63f)
                close()
                moveTo(17.688f, 3.431f)
                curveToRelative(0.854f, 0.0f, 1.602f, 0.611f, 1.602f, 1.306f)
                lineTo(19.29f, 20.38f)
                curveToRelative(0.0f, 0.709f, -0.734f, 1.305f, -1.602f, 1.305f)
                lineTo(6.128f, 21.685f)
                curveToRelative(-0.869f, 0.0f, -1.603f, -0.6f, -1.603f, -1.305f)
                lineTo(4.525f, 4.734f)
                curveToRelative(0.0f, -0.695f, 0.748f, -1.305f, 1.6f, -1.305f)
                lineTo(9.08f, 3.429f)
                curveTo(9.55f, 2.515f, 10.522f, 2.0f, 11.906f, 2.0f)
                curveToRelative(1.686f, 0.0f, 2.468f, 0.709f, 2.83f, 1.431f)
                horizontalLineToRelative(2.952f)
                close()
                moveTo(16.957f, 13.543f)
                horizontalLineToRelative(-1.563f)
                lineToRelative(-0.757f, -2.14f)
                arcToRelative(0.555f, 0.555f, 0.0f, false, false, -1.053f, 0.028f)
                lineToRelative(-0.625f, 2.115f)
                horizontalLineToRelative(-0.53f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, -0.503f, 0.325f)
                lineToRelative(-0.35f, 0.776f)
                lineToRelative(-0.958f, -4.773f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, false, -0.516f, -0.44f)
                arcToRelative(0.537f, 0.537f, 0.0f, false, false, -0.557f, 0.387f)
                lineToRelative(-1.143f, 3.672f)
                horizontalLineToRelative(-1.55f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, false, -0.554f, 0.549f)
                curveToRelative(0.0f, 0.303f, 0.247f, 0.549f, 0.555f, 0.549f)
                horizontalLineToRelative(1.955f)
                curveToRelative(0.241f, 0.0f, 0.457f, -0.157f, 0.53f, -0.387f)
                lineToRelative(0.619f, -1.988f)
                lineToRelative(0.874f, 4.336f)
                arcToRelative(0.555f, 0.555f, 0.0f, false, false, 1.047f, 0.117f)
                lineToRelative(0.91f, -2.022f)
                horizontalLineToRelative(0.586f)
                curveToRelative(0.244f, 0.0f, 0.46f, -0.16f, 0.53f, -0.395f)
                lineToRelative(0.257f, -0.868f)
                lineToRelative(0.317f, 0.896f)
                arcToRelative(0.554f, 0.554f, 0.0f, false, false, 0.52f, 0.367f)
                horizontalLineToRelative(1.956f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, 0.552f, -0.549f)
                arcToRelative(0.555f, 0.555f, 0.0f, false, false, -0.55f, -0.555f)
                close()
                moveTo(11.21f, 5.134f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, true, -0.554f, -0.549f)
                curveToRelative(0.0f, -0.302f, 0.246f, -0.549f, 0.554f, -0.549f)
                horizontalLineToRelative(1.393f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.551f, 0.55f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.551f, 0.548f)
                lineTo(11.21f, 5.134f)
                close()
            }
        }
        .build()
        return _medicalHistoryFilled!!
    }

private var _medicalHistoryFilled: ImageVector? = null
