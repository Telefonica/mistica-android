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

public val RegularGroup.FullscreenRegular: ImageVector
    get() {
        if (_fullscreenRegular != null) {
            return _fullscreenRegular!!
        }
        _fullscreenRegular = Builder(name = "FullscreenRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.003f, 9.2f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, true, -0.843f, -0.844f)
                lineTo(2.16f, 3.003f)
                curveToRelative(0.0f, -0.465f, 0.378f, -0.843f, 0.843f, -0.843f)
                lineTo(8.36f, 2.16f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, 0.0f, 1.69f)
                lineTo(3.846f, 3.85f)
                verticalLineToRelative(4.509f)
                curveToRelative(0.0f, 0.462f, -0.378f, 0.84f, -0.843f, 0.84f)
                close()
                moveTo(8.367f, 20.16f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, 0.0f, 1.69f)
                lineTo(3.01f, 21.85f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, true, -0.843f, -0.844f)
                lineTo(2.167f, 15.65f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, true, 1.686f, 0.0f)
                verticalLineToRelative(4.51f)
                horizontalLineToRelative(4.515f)
                close()
                moveTo(20.997f, 14.793f)
                curveToRelative(0.466f, 0.0f, 0.844f, 0.378f, 0.844f, 0.843f)
                verticalLineToRelative(5.353f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, true, -0.843f, 0.843f)
                horizontalLineToRelative(-5.359f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, 0.0f, -1.686f)
                horizontalLineToRelative(4.513f)
                verticalLineToRelative(-4.51f)
                arcToRelative(0.846f, 0.846f, 0.0f, false, true, 0.846f, -0.843f)
                close()
                moveTo(21.003f, 2.183f)
                curveToRelative(0.465f, 0.0f, 0.843f, 0.375f, 0.843f, 0.843f)
                verticalLineToRelative(5.352f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, -1.689f, 0.0f)
                lineTo(20.157f, 3.871f)
                horizontalLineToRelative(-4.512f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, true, 0.0f, -1.686f)
                horizontalLineToRelative(5.358f)
                verticalLineToRelative(-0.003f)
                close()
            }
        }
        .build()
        return _fullscreenRegular!!
    }

private var _fullscreenRegular: ImageVector? = null
