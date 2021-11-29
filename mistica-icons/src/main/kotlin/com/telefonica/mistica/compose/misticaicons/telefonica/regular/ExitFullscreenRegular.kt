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

public val RegularGroup.ExitFullscreenRegular: ImageVector
    get() {
        if (_exitFullscreenRegular != null) {
            return _exitFullscreenRegular!!
        }
        _exitFullscreenRegular = Builder(name = "ExitFullscreenRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.99f, 14.797f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, 0.0f, 1.69f)
                horizontalLineToRelative(-4.507f)
                verticalLineToRelative(4.509f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, -1.689f, 0.0f)
                lineTo(14.794f, 15.64f)
                curveToRelative(0.0f, -0.468f, 0.378f, -0.843f, 0.843f, -0.843f)
                horizontalLineToRelative(5.353f)
                close()
                moveTo(8.346f, 14.797f)
                curveToRelative(0.465f, 0.0f, 0.843f, 0.378f, 0.843f, 0.843f)
                verticalLineToRelative(5.353f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, -1.686f, 0.0f)
                verticalLineToRelative(-4.51f)
                horizontalLineToRelative(-4.51f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, -0.812f, -0.874f)
                arcToRelative(0.846f, 0.846f, 0.0f, false, true, 0.812f, -0.812f)
                horizontalLineToRelative(5.353f)
                close()
                moveTo(8.346f, 2.15f)
                curveToRelative(0.465f, 0.0f, 0.843f, 0.378f, 0.843f, 0.843f)
                verticalLineToRelative(5.353f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, true, -0.843f, 0.843f)
                lineTo(2.993f, 9.189f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, 0.0f, -1.689f)
                lineTo(7.5f, 7.5f)
                lineTo(7.5f, 2.993f)
                curveToRelative(0.0f, -0.465f, 0.378f, -0.843f, 0.846f, -0.843f)
                close()
                moveTo(15.64f, 9.19f)
                arcToRelative(0.844f, 0.844f, 0.0f, false, true, -0.843f, -0.844f)
                lineTo(14.797f, 2.993f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, 1.686f, 0.0f)
                lineTo(16.483f, 7.5f)
                horizontalLineToRelative(4.51f)
                arcToRelative(0.845f, 0.845f, 0.0f, false, true, 0.0f, 1.69f)
                lineTo(15.64f, 9.19f)
                close()
            }
        }
        .build()
        return _exitFullscreenRegular!!
    }

private var _exitFullscreenRegular: ImageVector? = null
