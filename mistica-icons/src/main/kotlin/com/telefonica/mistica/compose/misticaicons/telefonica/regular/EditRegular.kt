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

public val RegularGroup.EditRegular: ImageVector
    get() {
        if (_editRegular != null) {
            return _editRegular!!
        }
        _editRegular = Builder(name = "EditRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.208f, 9.975f)
                curveToRelative(-0.25f, 0.246f, -2.942f, 2.647f, -7.381f, 6.58f)
                lineToRelative(-0.19f, 0.154f)
                lineToRelative(-3.76f, 1.243f)
                curveToRelative(-0.053f, 0.014f, -0.104f, 0.003f, -0.137f, -0.03f)
                arcToRelative(0.127f, 0.127f, 0.0f, false, true, -0.031f, -0.135f)
                lineToRelative(1.297f, -3.815f)
                curveToRelative(2.454f, -2.168f, 7.182f, -6.356f, 7.512f, -6.686f)
                arcToRelative(1.852f, 1.852f, 0.0f, false, true, 1.328f, -0.569f)
                curveToRelative(0.516f, 0.0f, 1.014f, 0.216f, 1.367f, 0.569f)
                curveToRelative(0.359f, 0.358f, 0.572f, 0.874f, 0.569f, 1.375f)
                curveToRelative(0.0f, 0.49f, -0.2f, 0.944f, -0.574f, 1.314f)
                close()
                moveTo(18.238f, 17.56f)
                curveToRelative(0.0f, 0.913f, -0.238f, 1.63f, -0.703f, 2.13f)
                curveToRelative(-0.493f, 0.526f, -1.227f, 0.792f, -2.185f, 0.792f)
                lineTo(6.392f, 20.482f)
                curveToRelative(-0.958f, 0.0f, -1.691f, -0.266f, -2.184f, -0.793f)
                curveToRelative(-0.468f, -0.499f, -0.704f, -1.213f, -0.704f, -2.129f)
                lineTo(3.504f, 6.176f)
                curveToRelative(0.0f, -1.915f, 1.026f, -2.972f, 2.888f, -2.972f)
                horizontalLineToRelative(8.958f)
                curveToRelative(1.656f, 0.0f, 2.645f, 0.852f, 2.844f, 2.39f)
                curveToRelative(-0.56f, 0.129f, -1.09f, 0.406f, -1.521f, 0.837f)
                curveToRelative(-0.255f, 0.255f, -4.034f, 3.608f, -7.457f, 6.636f)
                arcToRelative(1.327f, 1.327f, 0.0f, false, false, -0.384f, 0.577f)
                lineToRelative(-1.26f, 3.76f)
                arcToRelative(1.333f, 1.333f, 0.0f, false, false, 1.266f, 1.761f)
                curveToRelative(0.143f, 0.0f, 0.283f, -0.022f, 0.42f, -0.067f)
                lineToRelative(3.76f, -1.244f)
                curveToRelative(0.17f, -0.056f, 0.332f, -0.148f, 0.467f, -0.269f)
                lineToRelative(0.143f, -0.126f)
                curveToRelative(1.538f, -1.361f, 3.227f, -2.862f, 4.613f, -4.095f)
                verticalLineToRelative(4.196f)
                horizontalLineToRelative(-0.003f)
                close()
                moveTo(21.986f, 8.664f)
                arcToRelative(3.218f, 3.218f, 0.0f, false, false, -0.921f, -2.233f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -1.673f, -0.862f)
                curveTo(19.157f, 3.36f, 17.65f, 2.0f, 15.348f, 2.0f)
                lineTo(6.392f, 2.0f)
                curveTo(3.87f, 2.0f, 2.3f, 3.6f, 2.3f, 6.176f)
                lineTo(2.3f, 17.56f)
                curveToRelative(0.0f, 1.23f, 0.345f, 2.224f, 1.028f, 2.953f)
                curveToRelative(0.728f, 0.778f, 1.756f, 1.173f, 3.062f, 1.173f)
                horizontalLineToRelative(8.958f)
                curveToRelative(1.302f, 0.0f, 2.336f, -0.395f, 3.064f, -1.173f)
                curveToRelative(0.683f, -0.729f, 1.03f, -1.723f, 1.03f, -2.953f)
                lineTo(19.442f, 12.29f)
                arcToRelative(89.456f, 89.456f, 0.0f, false, false, 1.611f, -1.457f)
                curveToRelative(0.608f, -0.6f, 0.93f, -1.35f, 0.933f, -2.168f)
                close()
            }
        }
        .build()
        return _editRegular!!
    }

private var _editRegular: ImageVector? = null
