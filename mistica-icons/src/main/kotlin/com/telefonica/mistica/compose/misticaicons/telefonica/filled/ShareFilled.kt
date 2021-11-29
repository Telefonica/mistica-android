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

public val FilledGroup.ShareFilled: ImageVector
    get() {
        if (_shareFilled != null) {
            return _shareFilled!!
        }
        _shareFilled = Builder(name = "ShareFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.843f, 2.02f)
                curveToRelative(-6.232f, 0.0f, -9.826f, 3.103f, -9.826f, 9.823f)
                curveToRelative(0.0f, 6.72f, 3.594f, 9.826f, 9.826f, 9.826f)
                curveToRelative(6.233f, 0.0f, 9.826f, -3.106f, 9.826f, -9.826f)
                curveToRelative(0.0f, -6.72f, -3.596f, -9.823f, -9.826f, -9.823f)
                close()
                moveTo(10.501f, 11.843f)
                curveToRelative(0.0f, 0.216f, -0.02f, 0.417f, -0.053f, 0.608f)
                lineToRelative(2.644f, 1.322f)
                curveToRelative(0.07f, -0.092f, 0.146f, -0.182f, 0.23f, -0.26f)
                curveToRelative(0.417f, -0.395f, 1.014f, -0.605f, 1.723f, -0.605f)
                curveToRelative(0.708f, 0.0f, 1.308f, 0.21f, 1.722f, 0.605f)
                curveToRelative(0.449f, 0.425f, 0.676f, 1.033f, 0.676f, 1.803f)
                curveToRelative(0.0f, 0.74f, -0.21f, 1.328f, -0.625f, 1.751f)
                curveToRelative(-0.42f, 0.432f, -1.034f, 0.658f, -1.776f, 0.658f)
                reflectiveCurveToRelative(-1.356f, -0.226f, -1.776f, -0.658f)
                curveToRelative(-0.415f, -0.423f, -0.625f, -1.014f, -0.625f, -1.75f)
                curveToRelative(0.0f, -0.174f, 0.012f, -0.34f, 0.037f, -0.496f)
                lineToRelative(-2.695f, -1.348f)
                curveToRelative(-0.033f, 0.042f, -0.07f, 0.084f, -0.11f, 0.124f)
                curveToRelative(-0.42f, 0.431f, -1.033f, 0.658f, -1.775f, 0.658f)
                reflectiveCurveToRelative(-1.356f, -0.227f, -1.776f, -0.658f)
                curveToRelative(-0.414f, -0.423f, -0.625f, -1.014f, -0.625f, -1.751f)
                curveToRelative(0.0f, -0.77f, 0.227f, -1.378f, 0.676f, -1.804f)
                curveToRelative(0.417f, -0.395f, 1.014f, -0.605f, 1.722f, -0.605f)
                curveToRelative(0.709f, 0.0f, 1.308f, 0.21f, 1.723f, 0.605f)
                curveToRelative(0.059f, 0.056f, 0.115f, 0.115f, 0.165f, 0.18f)
                lineToRelative(2.692f, -1.345f)
                arcToRelative(3.577f, 3.577f, 0.0f, false, true, -0.036f, -0.502f)
                curveToRelative(0.0f, -0.77f, 0.227f, -1.378f, 0.675f, -1.804f)
                curveToRelative(0.417f, -0.395f, 1.014f, -0.605f, 1.722f, -0.605f)
                curveToRelative(0.709f, 0.0f, 1.308f, 0.21f, 1.723f, 0.605f)
                curveToRelative(0.448f, 0.426f, 0.675f, 1.034f, 0.675f, 1.804f)
                curveToRelative(0.0f, 0.74f, -0.21f, 1.328f, -0.625f, 1.751f)
                curveToRelative(-0.42f, 0.431f, -1.033f, 0.658f, -1.775f, 0.658f)
                curveToRelative(-0.743f, 0.0f, -1.356f, -0.227f, -1.776f, -0.658f)
                arcToRelative(2.393f, 2.393f, 0.0f, false, true, -0.174f, -0.204f)
                lineToRelative(-2.647f, 1.324f)
                curveToRelative(0.048f, 0.185f, 0.064f, 0.384f, 0.064f, 0.597f)
                close()
            }
        }
        .build()
        return _shareFilled!!
    }

private var _shareFilled: ImageVector? = null
