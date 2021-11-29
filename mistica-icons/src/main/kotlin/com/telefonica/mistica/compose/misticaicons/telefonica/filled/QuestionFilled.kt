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

public val FilledGroup.QuestionFilled: ImageVector
    get() {
        if (_questionFilled != null) {
            return _questionFilled!!
        }
        _questionFilled = Builder(name = "QuestionFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.542f, 12.062f)
                curveToRelative(-1.339f, 1.55f, -1.39f, 1.61f, -1.39f, 3.056f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.4f, 0.4f)
                horizontalLineToRelative(-0.442f)
                arcToRelative(0.394f, 0.394f, 0.0f, false, true, -0.393f, -0.324f)
                arcToRelative(3.13f, 3.13f, 0.0f, false, true, -0.056f, -0.633f)
                curveToRelative(0.0f, -1.084f, 0.381f, -1.726f, 1.236f, -2.754f)
                lineToRelative(0.162f, -0.196f)
                curveToRelative(1.406f, -1.664f, 1.672f, -2.126f, 1.672f, -2.913f)
                curveToRelative(0.0f, -0.557f, -0.16f, -0.922f, -0.535f, -1.221f)
                curveToRelative(-0.215f, -0.171f, -0.593f, -0.37f, -1.627f, -0.37f)
                curveToRelative(-0.56f, 0.0f, -1.059f, 0.064f, -1.667f, 0.219f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.49f, -0.317f)
                lineToRelative(-0.064f, -0.345f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.221f, -0.437f)
                curveToRelative(0.378f, -0.179f, 1.303f, -0.364f, 2.196f, -0.364f)
                curveToRelative(0.941f, 0.0f, 1.692f, 0.21f, 2.235f, 0.62f)
                curveToRelative(0.698f, 0.512f, 1.026f, 1.223f, 1.026f, 2.232f)
                curveToRelative(-0.003f, 1.232f, -0.516f, 1.966f, -1.684f, 3.347f)
                moveToRelative(-1.955f, 6.216f)
                curveToRelative(-0.535f, 0.0f, -0.874f, -0.333f, -0.874f, -0.826f)
                verticalLineToRelative(-0.065f)
                curveToRelative(0.0f, -0.496f, 0.347f, -0.843f, 0.843f, -0.843f)
                curveToRelative(0.53f, 0.0f, 0.874f, 0.347f, 0.874f, 0.843f)
                curveToRelative(0.0f, 0.56f, -0.339f, 0.89f, -0.843f, 0.89f)
                moveToRelative(0.807f, -16.117f)
                curveToRelative(-0.275f, -0.005f, -0.603f, -0.014f, -0.894f, -0.008f)
                curveToRelative(-1.563f, 0.014f, -9.35f, 0.549f, -9.35f, 9.812f)
                curveToRelative(0.0f, 9.266f, 7.84f, 9.849f, 9.412f, 9.871f)
                arcToRelative(36.113f, 36.113f, 0.0f, false, false, 0.863f, -0.003f)
                curveToRelative(1.57f, -0.028f, 9.408f, -0.635f, 9.408f, -9.812f)
                curveToRelative(0.003f, -9.17f, -7.862f, -9.823f, -9.44f, -9.86f)
            }
        }
        .build()
        return _questionFilled!!
    }

private var _questionFilled: ImageVector? = null
