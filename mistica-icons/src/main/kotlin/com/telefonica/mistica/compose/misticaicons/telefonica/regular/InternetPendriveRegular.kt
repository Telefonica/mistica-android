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

public val RegularGroup.InternetPendriveRegular: ImageVector
    get() {
        if (_internetPendriveRegular != null) {
            return _internetPendriveRegular!!
        }
        _internetPendriveRegular = Builder(name = "InternetPendriveRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.69f, 14.63f)
                curveToRelative(0.447f, 0.0f, 0.739f, 0.238f, 0.739f, 0.75f)
                curveToRelative(0.0f, 0.247f, -0.068f, 0.43f, -0.188f, 0.553f)
                curveToRelative(-0.129f, 0.134f, -0.32f, 0.199f, -0.552f, 0.199f)
                curveToRelative(-0.232f, 0.0f, -0.423f, -0.065f, -0.552f, -0.2f)
                curveToRelative(-0.12f, -0.122f, -0.187f, -0.305f, -0.187f, -0.551f)
                curveToRelative(0.0f, -0.513f, 0.29f, -0.75f, 0.74f, -0.75f)
                close()
                moveTo(11.779f, 6.56f)
                curveToRelative(-5.754f, 0.0f, -8.55f, 2.857f, -8.55f, 8.731f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.602f, 0.614f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.602f, -0.614f)
                curveToRelative(0.0f, -6.515f, 3.373f, -9.958f, 9.75f, -9.958f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.603f, 0.614f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, -0.6f, 0.613f)
                close()
                moveTo(12.361f, 9.263f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.602f, 0.614f)
                curveToRelative(-3.59f, 0.0f, -5.336f, 1.784f, -5.336f, 5.45f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.602f, 0.614f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.603f, -0.613f)
                curveToRelative(0.0f, -4.37f, 2.261f, -6.678f, 6.541f, -6.678f)
                curveToRelative(0.333f, 0.0f, 0.602f, 0.274f, 0.602f, 0.613f)
                close()
                moveTo(20.513f, 16.807f)
                verticalLineToRelative(-2.941f)
                arcToRelative(0.161f, 0.161f, 0.0f, false, false, -0.126f, -0.149f)
                horizontalLineToRelative(-0.748f)
                verticalLineToRelative(3.241f)
                horizontalLineToRelative(0.74f)
                curveToRelative(0.072f, 0.0f, 0.134f, -0.067f, 0.134f, -0.151f)
                close()
                moveTo(18.109f, 18.05f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, 0.336f, -0.35f)
                verticalLineToRelative(-0.129f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-4.565f)
                curveToRelative(0.0f, -0.19f, -0.154f, -0.35f, -0.336f, -0.35f)
                horizontalLineToRelative(-5.82f)
                curveToRelative(-1.637f, 0.053f, -2.44f, 0.932f, -2.44f, 2.694f)
                curveToRelative(0.0f, 1.756f, 0.803f, 2.642f, 2.459f, 2.703f)
                horizontalLineToRelative(5.81f)
                verticalLineToRelative(-0.003f)
                close()
                moveTo(20.367f, 12.49f)
                curveToRelative(0.728f, 0.0f, 1.333f, 0.61f, 1.347f, 1.364f)
                verticalLineToRelative(2.953f)
                curveToRelative(0.0f, 0.759f, -0.602f, 1.378f, -1.339f, 1.378f)
                horizontalLineToRelative(-0.804f)
                arcToRelative(1.542f, 1.542f, 0.0f, false, true, -1.462f, 1.092f)
                horizontalLineToRelative(-5.851f)
                curveToRelative(-2.303f, -0.084f, -3.62f, -1.518f, -3.62f, -3.93f)
                curveToRelative(0.0f, -2.417f, 1.32f, -3.846f, 3.622f, -3.921f)
                horizontalLineToRelative(5.84f)
                curveToRelative(0.673f, 0.0f, 1.247f, 0.445f, 1.455f, 1.064f)
                horizontalLineToRelative(0.812f)
                close()
            }
        }
        .build()
        return _internetPendriveRegular!!
    }

private var _internetPendriveRegular: ImageVector? = null
