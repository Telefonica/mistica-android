package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.ApartmentBuildingFilled: ImageVector
    get() {
        if (_apartmentBuildingFilled != null) {
            return _apartmentBuildingFilled!!
        }
        _apartmentBuildingFilled = Builder(name = "ApartmentBuildingFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.144f, 7.625f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, -0.406f, 0.409f)
                lineTo(13.15f, 8.034f)
                arcToRelative(0.409f, 0.409f, 0.0f, false, true, -0.406f, -0.41f)
                lineTo(12.744f, 5.009f)
                curveToRelative(0.0f, -0.226f, 0.182f, -0.409f, 0.406f, -0.409f)
                horizontalLineToRelative(2.588f)
                curveToRelative(0.224f, 0.0f, 0.406f, 0.183f, 0.406f, 0.41f)
                verticalLineToRelative(2.616f)
                close()
                moveTo(16.144f, 12.762f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, -0.406f, 0.409f)
                lineTo(13.15f, 13.171f)
                arcToRelative(0.409f, 0.409f, 0.0f, false, true, -0.406f, -0.41f)
                verticalLineToRelative(-2.618f)
                curveToRelative(0.0f, -0.227f, 0.182f, -0.41f, 0.406f, -0.41f)
                horizontalLineToRelative(2.588f)
                curveToRelative(0.224f, 0.0f, 0.406f, 0.186f, 0.406f, 0.41f)
                verticalLineToRelative(2.619f)
                close()
                moveTo(11.027f, 7.625f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, -0.407f, 0.409f)
                lineTo(8.032f, 8.034f)
                arcToRelative(0.409f, 0.409f, 0.0f, false, true, -0.406f, -0.41f)
                lineTo(7.626f, 5.009f)
                curveToRelative(0.0f, -0.226f, 0.182f, -0.409f, 0.406f, -0.409f)
                horizontalLineToRelative(2.588f)
                curveToRelative(0.225f, 0.0f, 0.407f, 0.183f, 0.407f, 0.41f)
                verticalLineToRelative(2.616f)
                close()
                moveTo(11.027f, 12.762f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, -0.407f, 0.409f)
                lineTo(8.032f, 13.171f)
                arcToRelative(0.409f, 0.409f, 0.0f, false, true, -0.406f, -0.41f)
                verticalLineToRelative(-2.618f)
                curveToRelative(0.0f, -0.227f, 0.182f, -0.41f, 0.406f, -0.41f)
                horizontalLineToRelative(2.588f)
                curveToRelative(0.225f, 0.0f, 0.407f, 0.186f, 0.407f, 0.41f)
                verticalLineToRelative(2.619f)
                close()
                moveTo(18.07f, 2.0f)
                lineTo(5.741f, 2.0f)
                curveToRelative(-0.636f, 0.0f, -1.216f, 0.574f, -1.216f, 1.202f)
                verticalLineToRelative(17.283f)
                curveToRelative(0.0f, 0.641f, 0.569f, 1.201f, 1.216f, 1.201f)
                horizontalLineToRelative(4.05f)
                lineTo(9.791f, 16.18f)
                curveToRelative(0.0f, -0.227f, 0.182f, -0.409f, 0.406f, -0.409f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.225f, 0.0f, 0.407f, 0.182f, 0.407f, 0.41f)
                verticalLineToRelative(5.506f)
                horizontalLineToRelative(4.05f)
                curveToRelative(0.647f, 0.0f, 1.216f, -0.563f, 1.216f, -1.201f)
                lineTo(19.29f, 3.202f)
                curveTo(19.287f, 2.574f, 18.707f, 2.0f, 18.07f, 2.0f)
                close()
            }
        }
        .build()
        return _apartmentBuildingFilled!!
    }

private var _apartmentBuildingFilled: ImageVector? = null
