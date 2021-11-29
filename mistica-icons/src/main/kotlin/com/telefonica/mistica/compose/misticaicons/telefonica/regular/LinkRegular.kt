package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.LinkRegular: ImageVector
    get() {
        if (_linkRegular != null) {
            return _linkRegular!!
        }
        _linkRegular = Builder(name = "LinkRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.986f, 16.118f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, true, 0.871f, -0.064f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, true, 0.065f, 0.877f)
                arcToRelative(35.259f, 35.259f, 0.0f, false, true, -1.502f, 1.619f)
                curveToRelative(-1.846f, 1.854f, -3.24f, 2.832f, -4.523f, 3.165f)
                arcToRelative(3.866f, 3.866f, 0.0f, false, true, -0.98f, 0.129f)
                curveToRelative(-1.113f, 0.0f, -2.166f, -0.516f, -3.205f, -1.56f)
                curveToRelative(-2.897f, -2.914f, -1.404f, -5.608f, 1.728f, -8.76f)
                curveToRelative(3.132f, -3.148f, 5.812f, -4.65f, 8.706f, -1.736f)
                curveToRelative(0.944f, 0.952f, 1.448f, 1.899f, 1.535f, 2.899f)
                arcToRelative(0.622f, 0.622f, 0.0f, false, true, -0.56f, 0.675f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, true, -0.67f, -0.566f)
                curveToRelative(-0.061f, -0.697f, -0.445f, -1.395f, -1.176f, -2.129f)
                curveToRelative(-1.028f, -1.036f, -1.953f, -1.375f, -3.0f, -1.106f)
                curveToRelative(-1.045f, 0.272f, -2.303f, 1.174f, -3.961f, 2.843f)
                curveToRelative(-1.658f, 1.67f, -2.555f, 2.933f, -2.824f, 3.983f)
                curveToRelative(-0.271f, 1.053f, 0.068f, 1.983f, 1.098f, 3.02f)
                curveToRelative(1.031f, 1.036f, 1.956f, 1.375f, 3.0f, 1.103f)
                curveToRelative(1.045f, -0.271f, 2.303f, -1.173f, 3.961f, -2.843f)
                arcToRelative(35.454f, 35.454f, 0.0f, false, false, 1.437f, -1.549f)
                close()
                moveTo(20.297f, 3.721f)
                curveToRelative(1.34f, 1.347f, 1.804f, 2.722f, 1.42f, 4.21f)
                curveToRelative(-0.333f, 1.291f, -1.302f, 2.694f, -3.148f, 4.551f)
                curveToRelative(-1.96f, 1.972f, -3.745f, 3.3f, -5.516f, 3.3f)
                curveToRelative(-1.056f, 0.0f, -2.109f, -0.473f, -3.193f, -1.563f)
                curveToRelative(-0.907f, -0.91f, -1.403f, -1.818f, -1.524f, -2.776f)
                arcToRelative(0.617f, 0.617f, 0.0f, false, true, 0.538f, -0.692f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, true, 0.69f, 0.541f)
                curveToRelative(0.08f, 0.67f, 0.464f, 1.342f, 1.167f, 2.05f)
                curveToRelative(1.984f, 1.992f, 3.673f, 1.57f, 6.961f, -1.736f)
                curveToRelative(3.289f, -3.308f, 3.709f, -5.009f, 1.728f, -7.003f)
                curveToRelative(-1.977f, -1.992f, -3.672f, -1.571f, -6.958f, 1.737f)
                arcToRelative(22.303f, 22.303f, 0.0f, false, false, -1.431f, 1.568f)
                arcToRelative(0.618f, 0.618f, 0.0f, false, true, -0.871f, 0.084f)
                arcToRelative(0.622f, 0.622f, 0.0f, false, true, -0.084f, -0.874f)
                curveToRelative(0.412f, -0.504f, 0.905f, -1.044f, 1.512f, -1.655f)
                curveToRelative(3.132f, -3.154f, 5.813f, -4.656f, 8.71f, -1.742f)
                close()
            }
        }
        .build()
        return _linkRegular!!
    }

private var _linkRegular: ImageVector? = null
