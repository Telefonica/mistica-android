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

public val LightGroup.AccesibilityLight: ImageVector
    get() {
        if (_accesibilityLight != null) {
            return _accesibilityLight!!
        }
        _accesibilityLight = Builder(name = "AccesibilityLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.284f, 20.568f)
                arcToRelative(0.716f, 0.716f, 0.0f, true, true, 0.0f, 1.432f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, true, 0.0f, -1.432f)
                close()
                moveTo(2.108f, 2.108f)
                arcToRelative(0.343f, 0.343f, 0.0f, false, true, 0.5f, 0.0f)
                lineToRelative(4.5f, 4.536f)
                arcTo(10.704f, 10.704f, 0.0f, false, true, 12.0f, 5.464f)
                curveToRelative(4.252f, 0.0f, 8.108f, 2.5f, 9.82f, 6.396f)
                curveToRelative(0.036f, 0.068f, 0.036f, 0.176f, 0.0f, 0.284f)
                arcTo(10.804f, 10.804f, 0.0f, false, true, 17.5f, 17.0f)
                lineToRelative(2.612f, 2.608f)
                arcToRelative(0.343f, 0.343f, 0.0f, false, true, 0.0f, 0.5f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, true, -0.252f, 0.108f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, true, -0.252f, -0.108f)
                lineToRelative(-2.752f, -2.752f)
                arcTo(10.681f, 10.681f, 0.0f, false, true, 12.0f, 18.536f)
                curveToRelative(-4.248f, 0.0f, -8.144f, -2.5f, -9.856f, -6.396f)
                curveToRelative(-0.036f, -0.068f, -0.036f, -0.176f, 0.0f, -0.284f)
                arcTo(10.679f, 10.679f, 0.0f, false, true, 5.36f, 7.748f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, true, 0.5f, 0.072f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, true, -0.072f, 0.5f)
                arcToRelative(10.626f, 10.626f, 0.0f, false, false, -2.928f, 3.716f)
                arcToRelative(10.093f, 10.093f, 0.0f, false, false, 9.144f, 5.82f)
                curveToRelative(1.536f, 0.0f, 3.0f, -0.356f, 4.32f, -1.0f)
                lineToRelative(-1.572f, -1.572f)
                curveToRelative(-0.752f, 0.608f, -1.716f, 1.0f, -2.752f, 1.0f)
                arcTo(4.297f, 4.297f, 0.0f, false, true, 7.716f, 12.0f)
                curveToRelative(0.0f, -1.032f, 0.392f, -2.0f, 1.036f, -2.748f)
                lineTo(2.108f, 2.608f)
                arcToRelative(0.343f, 0.343f, 0.0f, false, true, 0.0f, -0.5f)
                close()
                moveTo(12.036f, 6.144f)
                curveToRelative(-1.5f, 0.0f, -3.0f, 0.356f, -4.356f, 1.0f)
                lineToRelative(1.568f, 1.572f)
                curveToRelative(0.752f, -0.608f, 1.716f, -1.0f, 2.752f, -1.0f)
                arcTo(4.297f, 4.297f, 0.0f, false, true, 16.284f, 12.0f)
                arcToRelative(4.193f, 4.193f, 0.0f, false, true, -1.0f, 2.752f)
                lineTo(17.0f, 16.5f)
                arcToRelative(10.72f, 10.72f, 0.0f, false, false, 4.18f, -4.536f)
                curveToRelative(-1.68f, -3.536f, -5.252f, -5.82f, -9.144f, -5.82f)
                close()
                moveTo(9.248f, 9.748f)
                curveToRelative(-0.536f, 0.608f, -0.82f, 1.396f, -0.82f, 2.252f)
                arcTo(3.583f, 3.583f, 0.0f, false, false, 12.0f, 15.572f)
                curveToRelative(0.856f, 0.0f, 1.644f, -0.288f, 2.284f, -0.788f)
                close()
                moveTo(12.0f, 8.432f)
                curveToRelative(-0.856f, 0.0f, -1.64f, 0.32f, -2.248f, 0.82f)
                lineToRelative(5.0f, 5.004f)
                curveToRelative(0.536f, -0.608f, 0.82f, -1.396f, 0.82f, -2.252f)
                arcTo(3.583f, 3.583f, 0.0f, false, false, 12.0f, 8.432f)
                close()
            }
        }
        .build()
        return _accesibilityLight!!
    }

private var _accesibilityLight: ImageVector? = null
