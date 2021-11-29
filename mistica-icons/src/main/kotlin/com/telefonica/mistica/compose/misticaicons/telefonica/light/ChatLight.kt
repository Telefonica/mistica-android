package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.ChatLight: ImageVector
    get() {
        if (_chatLight != null) {
            return _chatLight!!
        }
        _chatLight = Builder(name = "ChatLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.167f, 2.719f)
                arcToRelative(2.638f, 2.638f, 0.0f, false, true, 2.634f, 2.636f)
                verticalLineToRelative(9.459f)
                arcToRelative(2.64f, 2.64f, 0.0f, false, true, -2.636f, 2.636f)
                lineTo(8.08f, 17.45f)
                curveToRelative(-0.418f, 0.622f, -2.219f, 3.291f, -2.328f, 3.45f)
                curveToRelative(-0.21f, 0.306f, -0.474f, 0.37f, -0.656f, 0.37f)
                curveToRelative(-0.411f, 0.0f, -0.77f, -0.341f, -0.77f, -0.728f)
                verticalLineToRelative(-3.109f)
                arcToRelative(2.324f, 2.324f, 0.0f, false, true, -1.501f, -0.767f)
                curveToRelative(-0.432f, -0.482f, -0.67f, -1.14f, -0.67f, -1.852f)
                verticalLineToRelative(-9.46f)
                arcTo(2.64f, 2.64f, 0.0f, false, true, 4.795f, 2.72f)
                horizontalLineToRelative(14.372f)
                close()
                moveTo(19.165f, 3.279f)
                lineTo(4.795f, 3.282f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, false, -2.079f, 2.075f)
                verticalLineToRelative(9.457f)
                curveToRelative(0.0f, 1.202f, 0.793f, 2.076f, 1.888f, 2.076f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                verticalLineToRelative(3.372f)
                curveToRelative(0.0f, 0.065f, 0.099f, 0.168f, 0.21f, 0.168f)
                curveToRelative(0.054f, 0.0f, 0.118f, -0.014f, 0.194f, -0.126f)
                lineToRelative(1.116f, -1.653f)
                lineToRelative(0.25f, -0.371f)
                lineToRelative(1.043f, -1.547f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.232f, -0.123f)
                horizontalLineToRelative(11.238f)
                arcToRelative(2.076f, 2.076f, 0.0f, false, false, 2.073f, -2.076f)
                verticalLineToRelative(-9.46f)
                curveToRelative(0.0f, -1.145f, -0.93f, -2.072f, -2.075f, -2.075f)
                close()
                moveTo(14.403f, 11.982f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, 0.28f)
                horizontalLineToRelative(-8.67f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, -0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, -0.28f)
                horizontalLineToRelative(8.67f)
                close()
                moveTo(18.226f, 7.612f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, 0.28f)
                lineTo(5.733f, 8.172f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, -0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, -0.28f)
                horizontalLineToRelative(12.493f)
                close()
            }
        }
        .build()
        return _chatLight!!
    }

private var _chatLight: ImageVector? = null
