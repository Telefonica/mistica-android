package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.CallCenterUserSupportLight: ImageVector
    get() {
        if (_callCenterUserSupportLight != null) {
            return _callCenterUserSupportLight!!
        }
        _callCenterUserSupportLight = Builder(name = "CallCenterUserSupportLight", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.282f, 20.568f)
                arcToRelative(0.717f, 0.717f, 0.0f, true, true, 0.0f, 1.432f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, true, -0.719f, -0.716f)
                curveToRelative(0.0f, -0.395f, 0.322f, -0.716f, 0.719f, -0.716f)
                close()
                moveTo(11.762f, 2.0f)
                lineToRelative(0.31f, 0.004f)
                arcToRelative(6.681f, 6.681f, 0.0f, false, true, 4.668f, 2.144f)
                arcToRelative(6.985f, 6.985f, 0.0f, false, true, 1.895f, 4.795f)
                verticalLineToRelative(0.916f)
                curveToRelative(0.0f, 0.983f, -0.803f, 1.783f, -1.79f, 1.783f)
                horizontalLineToRelative(-1.349f)
                arcToRelative(4.66f, 4.66f, 0.0f, false, true, -1.57f, 1.288f)
                curveToRelative(2.826f, 0.608f, 4.717f, 2.447f, 4.717f, 4.81f)
                verticalLineToRelative(1.405f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, -0.715f, 0.0f)
                horizontalLineToRelative(-0.02f)
                verticalLineToRelative(-1.412f)
                curveToRelative(0.0f, -2.5f, -2.565f, -4.311f, -6.097f, -4.311f)
                curveToRelative(-1.75f, 0.0f, -3.323f, 0.448f, -4.435f, 1.256f)
                curveToRelative(-1.072f, 0.78f, -1.662f, 1.863f, -1.662f, 3.055f)
                verticalLineToRelative(3.903f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, -0.714f, 0.0f)
                verticalLineToRelative(-3.903f)
                curveToRelative(0.0f, -1.424f, 0.694f, -2.716f, 1.955f, -3.631f)
                curveToRelative(0.758f, -0.552f, 1.702f, -0.948f, 2.757f, -1.176f)
                arcToRelative(4.643f, 4.643f, 0.0f, false, true, -2.56f, -4.143f)
                curveToRelative(0.0f, -2.56f, 2.09f, -4.643f, 4.66f, -4.643f)
                curveToRelative(2.568f, 0.0f, 4.66f, 2.083f, 4.66f, 4.643f)
                arcToRelative(4.59f, 4.59f, 0.0f, false, true, -0.526f, 2.143f)
                horizontalLineToRelative(0.887f)
                curveToRelative(0.594f, 0.0f, 1.075f, -0.48f, 1.075f, -1.071f)
                verticalLineToRelative(-0.916f)
                curveToRelative(0.0f, -3.316f, -2.633f, -6.107f, -5.868f, -6.223f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, false, -4.451f, 1.7f)
                arcToRelative(6.019f, 6.019f, 0.0f, false, false, -1.863f, 4.37f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, -0.714f, 0.0f)
                curveToRelative(0.0f, -1.855f, 0.743f, -3.59f, 2.083f, -4.882f)
                arcToRelative(6.784f, 6.784f, 0.0f, false, true, 4.977f, -1.9f)
                close()
                moveTo(11.827f, 4.864f)
                curveToRelative(-2.171f, 0.0f, -3.941f, 1.76f, -3.941f, 3.927f)
                curveToRelative(0.0f, 2.163f, 1.77f, 3.927f, 3.937f, 3.927f)
                arcToRelative(3.935f, 3.935f, 0.0f, false, false, 2.702f, -1.072f)
                horizontalLineToRelative(-2.702f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, -0.357f, -0.356f)
                curveToRelative(0.0f, -0.196f, 0.16f, -0.356f, 0.357f, -0.356f)
                horizontalLineToRelative(3.304f)
                arcToRelative(3.885f, 3.885f, 0.0f, false, false, 0.642f, -2.143f)
                arcToRelative(3.939f, 3.939f, 0.0f, false, false, -3.942f, -3.927f)
                close()
            }
        }
        .build()
        return _callCenterUserSupportLight!!
    }

private var _callCenterUserSupportLight: ImageVector? = null
