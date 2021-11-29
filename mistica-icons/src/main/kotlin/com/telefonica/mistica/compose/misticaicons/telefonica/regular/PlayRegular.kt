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

public val RegularGroup.PlayRegular: ImageVector
    get() {
        if (_playRegular != null) {
            return _playRegular!!
        }
        _playRegular = Builder(name = "PlayRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.986f, 2.16f)
                curveToRelative(3.124f, 0.0f, 5.552f, 0.815f, 7.222f, 2.423f)
                curveToRelative(1.734f, 1.67f, 2.61f, 4.162f, 2.61f, 7.409f)
                curveToRelative(0.0f, 3.246f, -0.88f, 5.737f, -2.61f, 7.406f)
                curveToRelative(-1.67f, 1.608f, -4.098f, 2.423f, -7.222f, 2.423f)
                curveToRelative(-3.123f, 0.0f, -5.551f, -0.815f, -7.218f, -2.423f)
                curveToRelative(-1.731f, -1.667f, -2.608f, -4.157f, -2.608f, -7.403f)
                curveToRelative(0.0f, -3.247f, 0.877f, -5.74f, 2.608f, -7.41f)
                curveTo(6.435f, 2.979f, 8.866f, 2.16f, 11.986f, 2.16f)
                close()
                moveTo(11.986f, 3.25f)
                curveToRelative(-5.798f, 0.0f, -8.74f, 2.94f, -8.74f, 8.745f)
                curveToRelative(0.0f, 5.798f, 2.942f, 8.74f, 8.74f, 8.74f)
                curveToRelative(5.801f, 0.0f, 8.745f, -2.942f, 8.745f, -8.74f)
                curveToRelative(0.0f, -5.801f, -2.944f, -8.745f, -8.745f, -8.745f)
                close()
                moveTo(9.43f, 7.712f)
                lineToRelative(6.653f, 3.84f)
                arcToRelative(0.484f, 0.484f, 0.0f, false, true, 0.0f, 0.84f)
                lineToRelative(-6.653f, 3.844f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.241f, 0.064f)
                arcToRelative(0.484f, 0.484f, 0.0f, false, true, -0.487f, -0.485f)
                lineTo(8.702f, 8.132f)
                arcToRelative(0.484f, 0.484f, 0.0f, false, true, 0.728f, -0.42f)
                close()
                moveTo(9.674f, 8.972f)
                verticalLineToRelative(6.0f)
                lineToRelative(5.196f, -3.0f)
                lineToRelative(-5.196f, -3.0f)
                close()
            }
        }
        .build()
        return _playRegular!!
    }

private var _playRegular: ImageVector? = null
