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

public val RegularGroup.AcademicRegular: ImageVector
    get() {
        if (_academicRegular != null) {
            return _academicRegular!!
        }
        _academicRegular = Builder(name = "AcademicRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.58f, 18.01f)
                horizontalLineToRelative(-0.49f)
                curveToRelative(0.082f, -0.246f, 0.163f, -0.49f, 0.247f, -0.57f)
                curveToRelative(0.162f, 0.08f, 0.244f, 0.324f, 0.244f, 0.57f)
                curveToRelative(0.08f, 0.0f, 0.08f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(17.39f, 15.473f)
                curveToRelative(0.0f, 0.162f, -0.162f, 0.328f, -0.328f, 0.409f)
                curveToRelative(-1.392f, 0.246f, -3.355f, 0.818f, -4.91f, 1.964f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.818f, 0.0f)
                curveToRelative(-1.473f, -1.227f, -3.437f, -1.72f, -4.91f, -1.964f)
                curveToRelative(-0.163f, 0.0f, -0.328f, -0.163f, -0.328f, -0.409f)
                verticalLineToRelative(-3.11f)
                lineToRelative(4.91f, 2.21f)
                curveToRelative(0.163f, 0.082f, 0.41f, 0.163f, 0.575f, 0.163f)
                curveToRelative(0.246f, 0.0f, 0.408f, -0.081f, 0.574f, -0.162f)
                lineToRelative(5.19f, -2.356f)
                lineToRelative(0.045f, 3.255f)
                close()
                moveTo(3.477f, 9.663f)
                curveToRelative(0.0f, -0.08f, 0.056f, -0.184f, 0.162f, -0.246f)
                lineToRelative(7.939f, -3.6f)
                horizontalLineToRelative(0.162f)
                lineToRelative(7.283f, 3.275f)
                horizontalLineToRelative(-7.448f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, -0.574f, 0.571f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.574f, 0.572f)
                horizontalLineToRelative(7.283f)
                lineToRelative(-7.04f, 3.19f)
                horizontalLineToRelative(-0.246f)
                lineToRelative(-7.938f, -3.6f)
                curveToRelative(-0.095f, -0.052f, -0.157f, -0.08f, -0.157f, -0.162f)
                close()
                moveTo(21.071f, 16.375f)
                verticalLineToRelative(-6.303f)
                curveToRelative(-0.011f, -0.535f, -0.025f, -1.462f, -0.818f, -1.8f)
                lineToRelative(-7.939f, -3.6f)
                arcToRelative(1.605f, 1.605f, 0.0f, false, false, -1.226f, 0.0f)
                lineToRelative(-7.939f, 3.6f)
                curveToRelative(-0.574f, 0.246f, -0.899f, 0.736f, -0.899f, 1.391f)
                curveToRelative(0.0f, 0.572f, 0.328f, 1.146f, 0.9f, 1.393f)
                lineToRelative(1.8f, 0.818f)
                verticalLineToRelative(3.599f)
                curveToRelative(0.0f, 0.818f, 0.575f, 1.473f, 1.308f, 1.636f)
                curveToRelative(1.227f, 0.246f, 3.028f, 0.737f, 4.337f, 1.8f)
                curveToRelative(0.327f, 0.247f, 0.736f, 0.41f, 1.145f, 0.41f)
                curveToRelative(0.41f, 0.0f, 0.818f, -0.163f, 1.146f, -0.41f)
                curveToRelative(1.308f, -1.063f, 3.11f, -1.554f, 4.336f, -1.8f)
                arcToRelative(1.67f, 1.67f, 0.0f, false, false, 1.308f, -1.636f)
                verticalLineToRelative(-3.684f)
                lineToRelative(1.227f, -0.57f)
                verticalLineToRelative(5.156f)
                curveToRelative(-0.655f, 0.328f, -0.983f, 1.308f, -0.983f, 1.882f)
                curveToRelative(0.0f, 0.328f, 0.081f, 0.572f, 0.246f, 0.737f)
                curveToRelative(0.328f, 0.328f, 0.737f, 0.328f, 1.065f, 0.328f)
                horizontalLineToRelative(0.487f)
                curveToRelative(0.328f, 0.0f, 0.574f, 0.0f, 0.818f, -0.247f)
                curveToRelative(0.532f, -0.448f, 0.412f, -2.3f, -0.32f, -2.7f)
                close()
            }
        }
        .build()
        return _academicRegular!!
    }

private var _academicRegular: ImageVector? = null
