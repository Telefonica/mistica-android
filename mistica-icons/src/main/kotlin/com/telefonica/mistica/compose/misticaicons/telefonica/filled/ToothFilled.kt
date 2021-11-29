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

public val FilledGroup.ToothFilled: ImageVector
    get() {
        if (_toothFilled != null) {
            return _toothFilled!!
        }
        _toothFilled = Builder(name = "ToothFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.431f, 21.714f)
                horizontalLineToRelative(-0.115f)
                curveToRelative(-0.156f, 0.0f, -0.274f, -0.039f, -0.347f, -0.064f)
                arcToRelative(1.763f, 1.763f, 0.0f, false, true, -0.756f, -0.572f)
                arcToRelative(5.737f, 5.737f, 0.0f, false, true, -0.485f, -0.748f)
                lineToRelative(-0.075f, -0.165f)
                arcToRelative(17.271f, 17.271f, 0.0f, false, true, -0.317f, -0.804f)
                curveToRelative(-0.263f, -0.694f, -1.022f, -2.692f, -1.496f, -3.213f)
                curveToRelative(-0.473f, 0.521f, -1.23f, 2.521f, -1.493f, 3.213f)
                curveToRelative(-0.145f, 0.387f, -0.24f, 0.633f, -0.313f, 0.796f)
                lineToRelative(-0.009f, 0.039f)
                lineToRelative(-0.073f, 0.134f)
                arcToRelative(5.664f, 5.664f, 0.0f, false, true, -0.49f, 0.754f)
                arcToRelative(1.719f, 1.719f, 0.0f, false, true, -0.717f, 0.552f)
                arcToRelative(1.066f, 1.066f, 0.0f, false, true, -0.37f, 0.075f)
                horizontalLineToRelative(-0.112f)
                curveToRelative(-0.157f, 0.0f, -0.274f, -0.039f, -0.347f, -0.064f)
                arcToRelative(1.738f, 1.738f, 0.0f, false, true, -0.754f, -0.571f)
                arcToRelative(5.468f, 5.468f, 0.0f, false, true, -0.423f, -0.645f)
                lineToRelative(-0.044f, -0.075f)
                arcToRelative(19.96f, 19.96f, 0.0f, false, true, -1.406f, -3.07f)
                arcToRelative(21.247f, 21.247f, 0.0f, false, true, -0.715f, -2.289f)
                curveToRelative(-0.042f, -0.16f, -0.092f, -0.367f, -0.148f, -0.59f)
                lineToRelative(-0.028f, -0.116f)
                curveToRelative(-1.025f, -1.784f, -1.75f, -3.554f, -2.16f, -5.26f)
                curveToRelative(-0.583f, -2.44f, -0.078f, -4.488f, 1.42f, -5.76f)
                curveToRelative(0.857f, -0.736f, 2.023f, -1.176f, 3.28f, -1.24f)
                curveToRelative(1.294f, -0.07f, 2.639f, 0.252f, 3.874f, 0.938f)
                curveToRelative(0.334f, 0.188f, 0.67f, 0.378f, 1.031f, 0.591f)
                curveToRelative(0.373f, -0.215f, 0.706f, -0.406f, 1.03f, -0.588f)
                curveToRelative(1.236f, -0.686f, 2.584f, -1.011f, 3.88f, -0.941f)
                curveToRelative(1.255f, 0.064f, 2.42f, 0.504f, 3.28f, 1.244f)
                curveToRelative(1.496f, 1.271f, 2.0f, 3.316f, 1.418f, 5.756f)
                curveToRelative(-0.409f, 1.706f, -1.137f, 3.473f, -2.16f, 5.26f)
                lineToRelative(-0.025f, 0.098f)
                curveToRelative(-0.056f, 0.233f, -0.106f, 0.446f, -0.154f, 0.617f)
                arcToRelative(20.841f, 20.841f, 0.0f, false, true, -0.714f, 2.282f)
                arcToRelative(19.758f, 19.758f, 0.0f, false, true, -1.39f, 3.04f)
                lineToRelative(-0.058f, 0.1f)
                arcToRelative(5.583f, 5.583f, 0.0f, false, true, -0.429f, 0.65f)
                arcToRelative(1.719f, 1.719f, 0.0f, false, true, -0.717f, 0.552f)
                arcToRelative(0.913f, 0.913f, 0.0f, false, true, -0.373f, 0.084f)
                close()
            }
        }
        .build()
        return _toothFilled!!
    }

private var _toothFilled: ImageVector? = null
