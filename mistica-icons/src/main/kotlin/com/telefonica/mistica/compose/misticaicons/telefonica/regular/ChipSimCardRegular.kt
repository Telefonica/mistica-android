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

public val RegularGroup.ChipSimCardRegular: ImageVector
    get() {
        if (_chipSimCardRegular != null) {
            return _chipSimCardRegular!!
        }
        _chipSimCardRegular = Builder(name = "ChipSimCardRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.818f, 2.0f)
                curveToRelative(0.482f, 0.0f, 1.16f, 0.106f, 1.647f, 0.622f)
                curveToRelative(0.361f, 0.384f, 0.552f, 0.927f, 0.552f, 1.577f)
                verticalLineToRelative(15.277f)
                curveToRelative(0.0f, 0.65f, -0.19f, 1.193f, -0.552f, 1.577f)
                curveToRelative(-0.269f, 0.283f, -0.773f, 0.622f, -1.647f, 0.622f)
                lineTo(7.54f, 21.675f)
                curveToRelative(-0.482f, 0.0f, -1.16f, -0.106f, -1.647f, -0.622f)
                curveToRelative(-0.362f, -0.384f, -0.552f, -0.927f, -0.552f, -1.577f)
                lineTo(5.341f, 6.104f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.179f, -0.412f)
                lineToRelative(3.82f, -3.544f)
                arcTo(0.566f, 0.566f, 0.0f, false, true, 9.724f, 2.0f)
                horizontalLineToRelative(7.095f)
                close()
                moveTo(16.818f, 3.12f)
                lineTo(9.944f, 3.12f)
                lineTo(6.462f, 6.347f)
                verticalLineToRelative(13.13f)
                curveToRelative(0.0f, 0.744f, 0.334f, 1.078f, 1.079f, 1.078f)
                horizontalLineToRelative(9.277f)
                curveToRelative(0.745f, 0.0f, 1.078f, -0.334f, 1.078f, -1.079f)
                lineTo(17.896f, 4.2f)
                curveToRelative(0.0f, -0.745f, -0.333f, -1.079f, -1.078f, -1.079f)
                close()
                moveTo(16.275f, 9.496f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                verticalLineToRelative(8.61f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.56f, 0.56f)
                lineTo(8.08f, 19.226f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                verticalLineToRelative(-8.61f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(8.194f)
                close()
                moveTo(10.245f, 16.495f)
                lineTo(8.642f, 16.495f)
                verticalLineToRelative(1.611f)
                horizontalLineToRelative(1.605f)
                verticalLineToRelative(-1.611f)
                close()
                moveTo(12.977f, 16.495f)
                horizontalLineToRelative(-1.61f)
                verticalLineToRelative(1.611f)
                horizontalLineToRelative(1.61f)
                verticalLineToRelative(-1.611f)
                close()
                moveTo(15.714f, 16.495f)
                horizontalLineToRelative(-1.616f)
                verticalLineToRelative(1.611f)
                horizontalLineToRelative(1.616f)
                verticalLineToRelative(-1.611f)
                close()
                moveTo(15.714f, 13.347f)
                lineTo(8.64f, 13.347f)
                verticalLineToRelative(2.028f)
                horizontalLineToRelative(7.073f)
                verticalLineToRelative(-2.028f)
                close()
                moveTo(10.246f, 10.616f)
                lineTo(8.64f, 10.616f)
                verticalLineToRelative(1.61f)
                horizontalLineToRelative(1.605f)
                verticalLineToRelative(-1.61f)
                close()
                moveTo(12.976f, 10.616f)
                horizontalLineToRelative(-1.61f)
                verticalLineToRelative(1.61f)
                horizontalLineToRelative(1.61f)
                verticalLineToRelative(-1.61f)
                close()
                moveTo(15.714f, 10.616f)
                horizontalLineToRelative(-1.616f)
                verticalLineToRelative(1.61f)
                horizontalLineToRelative(1.616f)
                verticalLineToRelative(-1.61f)
                close()
            }
        }
        .build()
        return _chipSimCardRegular!!
    }

private var _chipSimCardRegular: ImageVector? = null
