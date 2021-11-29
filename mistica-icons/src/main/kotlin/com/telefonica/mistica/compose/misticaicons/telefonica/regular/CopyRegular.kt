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

public val RegularGroup.CopyRegular: ImageVector
    get() {
        if (_copyRegular != null) {
            return _copyRegular!!
        }
        _copyRegular = Builder(name = "CopyRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.412f, 20.227f)
                arcToRelative(0.185f, 0.185f, 0.0f, false, true, -0.185f, 0.185f)
                lineTo(9.064f, 20.412f)
                arcToRelative(0.185f, 0.185f, 0.0f, false, true, -0.184f, -0.185f)
                lineTo(8.88f, 16.08f)
                horizontalLineToRelative(5.694f)
                curveToRelative(0.832f, 0.0f, 1.51f, -0.678f, 1.51f, -1.51f)
                lineTo(16.084f, 8.877f)
                horizontalLineToRelative(4.143f)
                curveToRelative(0.104f, 0.0f, 0.185f, 0.081f, 0.185f, 0.185f)
                verticalLineToRelative(11.165f)
                close()
                moveTo(3.275f, 14.574f)
                lineTo(3.275f, 3.51f)
                curveToRelative(0.0f, -0.129f, 0.106f, -0.235f, 0.235f, -0.235f)
                lineTo(14.57f, 3.275f)
                curveToRelative(0.13f, 0.0f, 0.236f, 0.106f, 0.236f, 0.235f)
                verticalLineToRelative(11.064f)
                arcToRelative(0.237f, 0.237f, 0.0f, false, true, -0.236f, 0.236f)
                lineTo(3.507f, 14.81f)
                arcToRelative(0.236f, 0.236f, 0.0f, false, true, -0.232f, -0.236f)
                curveToRelative(-0.003f, 0.0f, -0.003f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(20.227f, 7.602f)
                lineTo(16.08f, 7.602f)
                lineTo(16.08f, 3.51f)
                arcTo(1.51f, 1.51f, 0.0f, false, false, 14.571f, 2.0f)
                lineTo(3.507f, 2.0f)
                curveTo(2.675f, 2.0f, 2.0f, 2.675f, 2.0f, 3.51f)
                verticalLineToRelative(11.064f)
                curveToRelative(0.0f, 0.832f, 0.678f, 1.51f, 1.51f, 1.51f)
                horizontalLineToRelative(4.092f)
                verticalLineToRelative(4.143f)
                curveToRelative(0.0f, 0.804f, 0.656f, 1.46f, 1.46f, 1.46f)
                horizontalLineToRelative(11.162f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, 1.46f, -1.46f)
                lineTo(21.684f, 9.062f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, false, -1.457f, -1.46f)
                close()
            }
        }
        .build()
        return _copyRegular!!
    }

private var _copyRegular: ImageVector? = null
