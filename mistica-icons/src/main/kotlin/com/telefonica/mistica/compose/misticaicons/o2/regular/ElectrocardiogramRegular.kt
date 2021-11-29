package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.ElectrocardiogramRegular: ImageVector
    get() {
        if (_electrocardiogramRegular != null) {
            return _electrocardiogramRegular!!
        }
        _electrocardiogramRegular = Builder(name = "ElectrocardiogramRegular", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.254f, 2.0f)
                curveToRelative(-2.035f, 0.0f, -3.356f, 0.826f, -5.25f, 3.302f)
                curveTo(10.149f, 2.864f, 8.68f, 2.0f, 6.61f, 2.0f)
                curveTo(4.396f, 2.0f, 2.0f, 3.574f, 2.0f, 6.987f)
                curveToRelative(0.0f, 5.098f, 6.392f, 12.298f, 9.465f, 15.787f)
                arcTo(0.71f, 0.71f, 0.0f, false, false, 12.0f, 23.0f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.535f, -0.226f)
                curveToRelative(0.786f, -0.902f, 2.963f, -3.45f, 2.963f, -3.49f)
                lineToRelative(2.643f, -3.45f)
                curveTo(20.747f, 12.195f, 22.0f, 9.31f, 22.0f, 6.982f)
                curveTo(22.01f, 3.728f, 19.613f, 2.0f, 17.254f, 2.0f)
                close()
                moveTo(17.007f, 14.98f)
                lineTo(14.4f, 18.391f)
                curveToRelative(-0.86f, 1.013f, -1.679f, 1.987f, -2.392f, 2.774f)
                curveTo(9.08f, 17.83f, 3.436f, 11.23f, 3.436f, 6.992f)
                curveToRelative(0.0f, -2.4f, 1.61f, -3.49f, 3.178f, -3.49f)
                curveToRelative(1.568f, 0.0f, 2.752f, 0.524f, 4.856f, 3.452f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, false, 1.143f, 0.0f)
                curveToRelative(2.071f, -2.962f, 3.109f, -3.452f, 4.645f, -3.452f)
                curveToRelative(1.61f, 0.0f, 3.324f, 1.09f, 3.324f, 3.49f)
                curveToRelative(-0.004f, 1.949f, -1.22f, 4.646f, -3.575f, 7.987f)
                close()
                moveTo(15.219f, 12.128f)
                horizontalLineToRelative(-2.501f)
                lineTo(12.718f, 9.502f)
                curveToRelative(0.0f, -0.412f, -0.32f, -0.748f, -0.713f, -0.748f)
                curveToRelative(-0.394f, 0.0f, -0.714f, 0.336f, -0.714f, 0.748f)
                verticalLineToRelative(2.626f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.394f, 0.0f, -0.714f, 0.336f, -0.714f, 0.749f)
                reflectiveCurveToRelative(0.32f, 0.749f, 0.713f, 0.749f)
                horizontalLineToRelative(2.501f)
                verticalLineToRelative(2.625f)
                curveToRelative(0.0f, 0.413f, 0.32f, 0.749f, 0.714f, 0.749f)
                curveToRelative(0.393f, 0.0f, 0.713f, -0.336f, 0.713f, -0.749f)
                verticalLineToRelative(-2.625f)
                horizontalLineToRelative(2.501f)
                curveToRelative(0.393f, 0.0f, 0.713f, -0.336f, 0.713f, -0.75f)
                curveToRelative(0.0f, -0.412f, -0.32f, -0.748f, -0.713f, -0.748f)
                close()
            }
        }
        .build()
        return _electrocardiogramRegular!!
    }

private var _electrocardiogramRegular: ImageVector? = null
