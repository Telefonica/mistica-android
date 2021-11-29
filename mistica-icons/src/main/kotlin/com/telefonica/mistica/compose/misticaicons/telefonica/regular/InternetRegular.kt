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

public val RegularGroup.InternetRegular: ImageVector
    get() {
        if (_internetRegular != null) {
            return _internetRegular!!
        }
        _internetRegular = Builder(name = "InternetRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.874f, 2.008f)
                curveToRelative(3.132f, 0.0f, 5.569f, 0.818f, 7.244f, 2.432f)
                curveToRelative(1.74f, 1.675f, 2.619f, 4.176f, 2.619f, 7.431f)
                reflectiveCurveToRelative(-0.883f, 5.756f, -2.62f, 7.429f)
                curveToRelative(-1.672f, 1.616f, -4.109f, 2.434f, -7.243f, 2.434f)
                curveToRelative(-3.132f, 0.0f, -5.569f, -0.818f, -7.244f, -2.432f)
                curveToRelative(-1.736f, -1.675f, -2.616f, -4.173f, -2.616f, -7.428f)
                reflectiveCurveToRelative(0.882f, -5.756f, 2.619f, -7.431f)
                curveToRelative(1.675f, -1.614f, 4.11f, -2.435f, 7.24f, -2.435f)
                close()
                moveTo(11.263f, 16.276f)
                lineTo(7.753f, 16.278f)
                curveToRelative(0.214f, 0.66f, 0.478f, 1.274f, 0.788f, 1.826f)
                curveToRelative(0.76f, 1.355f, 1.714f, 2.182f, 2.722f, 2.374f)
                verticalLineToRelative(-4.202f)
                close()
                moveTo(15.681f, 16.278f)
                lineTo(12.383f, 16.276f)
                verticalLineToRelative(4.152f)
                curveToRelative(0.93f, -0.26f, 1.801f, -1.063f, 2.51f, -2.324f)
                curveToRelative(0.31f, -0.552f, 0.574f, -1.166f, 0.788f, -1.826f)
                close()
                moveTo(19.844f, 16.278f)
                lineTo(16.85f, 16.278f)
                arcToRelative(11.418f, 11.418f, 0.0f, false, true, -0.983f, 2.375f)
                arcToRelative(7.486f, 7.486f, 0.0f, false, true, -1.282f, 1.707f)
                curveToRelative(2.573f, -0.534f, 4.33f, -1.898f, 5.258f, -4.082f)
                close()
                moveTo(6.584f, 16.278f)
                lineTo(3.908f, 16.278f)
                curveToRelative(0.876f, 2.065f, 2.494f, 3.398f, 4.843f, 3.987f)
                arcToRelative(7.475f, 7.475f, 0.0f, false, true, -1.186f, -1.612f)
                curveToRelative(-0.4f, -0.712f, -0.729f, -1.512f, -0.983f, -2.375f)
                close()
                moveTo(6.188f, 9.17f)
                lineTo(3.387f, 9.17f)
                curveToRelative(-0.168f, 0.819f, -0.253f, 1.72f, -0.253f, 2.704f)
                curveToRelative(0.0f, 1.221f, 0.131f, 2.316f, 0.391f, 3.283f)
                horizontalLineToRelative(2.78f)
                arcToRelative(16.361f, 16.361f, 0.0f, false, true, -0.33f, -3.303f)
                curveToRelative(0.0f, -0.92f, 0.073f, -1.821f, 0.214f, -2.684f)
                close()
                moveTo(11.262f, 9.17f)
                lineTo(7.324f, 9.17f)
                arcToRelative(15.49f, 15.49f, 0.0f, false, false, -0.229f, 2.684f)
                curveToRelative(0.0f, 1.153f, 0.121f, 2.27f, 0.353f, 3.304f)
                lineToRelative(3.815f, -0.002f)
                lineTo(11.263f, 9.17f)
                close()
                moveTo(16.109f, 9.17f)
                horizontalLineToRelative(-3.727f)
                verticalLineToRelative(5.986f)
                lineToRelative(3.603f, 0.002f)
                curveToRelative(0.232f, -1.035f, 0.353f, -2.151f, 0.353f, -3.304f)
                curveToRelative(0.0f, -0.926f, -0.078f, -1.828f, -0.23f, -2.684f)
                close()
                moveTo(20.365f, 9.17f)
                horizontalLineToRelative(-3.121f)
                curveToRelative(0.141f, 0.863f, 0.214f, 1.764f, 0.214f, 2.684f)
                curveToRelative(0.0f, 1.143f, -0.113f, 2.257f, -0.329f, 3.303f)
                horizontalLineToRelative(3.098f)
                curveToRelative(0.26f, -0.967f, 0.391f, -2.062f, 0.391f, -3.283f)
                curveToRelative(0.0f, -0.984f, -0.085f, -1.885f, -0.253f, -2.704f)
                close()
                moveTo(8.709f, 3.49f)
                lineToRelative(-0.168f, 0.044f)
                curveToRelative(-2.446f, 0.673f, -4.068f, 2.183f, -4.854f, 4.518f)
                horizontalLineToRelative(2.73f)
                curveToRelative(0.269f, -1.103f, 0.656f, -2.118f, 1.149f, -2.995f)
                arcToRelative(7.668f, 7.668f, 0.0f, false, true, 1.143f, -1.567f)
                close()
                moveTo(12.384f, 3.282f)
                lineTo(12.383f, 8.052f)
                horizontalLineToRelative(3.48f)
                arcToRelative(10.542f, 10.542f, 0.0f, false, false, -0.97f, -2.446f)
                curveToRelative(-0.709f, -1.262f, -1.58f, -2.064f, -2.51f, -2.324f)
                close()
                moveTo(14.631f, 3.394f)
                lineTo(14.725f, 3.488f)
                curveToRelative(0.419f, 0.434f, 0.802f, 0.958f, 1.143f, 1.569f)
                curveToRelative(0.493f, 0.879f, 0.88f, 1.893f, 1.149f, 2.994f)
                lineToRelative(3.049f, 0.001f)
                curveToRelative(-0.847f, -2.514f, -2.664f, -4.072f, -5.435f, -4.658f)
                close()
                moveTo(8.541f, 5.606f)
                curveToRelative(-0.405f, 0.721f, -0.731f, 1.547f, -0.97f, 2.445f)
                horizontalLineToRelative(3.692f)
                lineTo(11.263f, 3.23f)
                curveToRelative(-1.007f, 0.192f, -1.96f, 1.017f, -2.722f, 2.375f)
                close()
            }
        }
        .build()
        return _internetRegular!!
    }

private var _internetRegular: ImageVector? = null
