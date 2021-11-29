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

public val FilledGroup.TravelBagFilled: ImageVector
    get() {
        if (_travelBagFilled != null) {
            return _travelBagFilled!!
        }
        _travelBagFilled = Builder(name = "TravelBagFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.164f, 2.0f)
                curveToRelative(0.484f, 0.0f, 0.91f, 0.412f, 0.91f, 0.882f)
                verticalLineToRelative(3.11f)
                horizontalLineToRelative(1.376f)
                curveToRelative(0.647f, 0.0f, 1.212f, 0.63f, 1.212f, 1.35f)
                verticalLineToRelative(12.39f)
                curveToRelative(0.0f, 0.733f, -0.554f, 1.352f, -1.212f, 1.352f)
                horizontalLineToRelative(-1.045f)
                curveToRelative(-0.081f, 0.549f, -0.558f, 0.6f, -0.687f, 0.602f)
                horizontalLineToRelative(-0.067f)
                curveToRelative(-0.134f, -0.003f, -0.605f, -0.053f, -0.686f, -0.602f)
                lineTo(9.909f, 21.084f)
                curveToRelative(-0.081f, 0.549f, -0.557f, 0.6f, -0.686f, 0.602f)
                horizontalLineToRelative(-0.068f)
                curveToRelative(-0.134f, 0.0f, -0.605f, -0.053f, -0.686f, -0.602f)
                lineTo(7.388f, 21.084f)
                curveToRelative(-0.658f, 0.0f, -1.213f, -0.62f, -1.213f, -1.353f)
                lineTo(6.175f, 7.341f)
                curveToRelative(0.0f, -0.72f, 0.569f, -1.35f, 1.213f, -1.35f)
                horizontalLineToRelative(1.375f)
                lineTo(8.763f, 2.883f)
                curveToRelative(0.0f, -0.479f, 0.415f, -0.882f, 0.91f, -0.882f)
                close()
                moveTo(15.184f, 12.521f)
                lineTo(8.66f, 12.521f)
                verticalLineToRelative(4.927f)
                curveToRelative(0.0f, 0.698f, 0.397f, 1.221f, 0.924f, 1.221f)
                horizontalLineToRelative(4.675f)
                curveToRelative(0.524f, 0.0f, 0.922f, -0.523f, 0.922f, -1.22f)
                horizontalLineToRelative(0.002f)
                lineTo(15.183f, 12.52f)
                close()
                moveTo(14.259f, 8.51f)
                lineTo(9.584f, 8.51f)
                curveToRelative(-0.577f, 0.0f, -0.924f, 0.622f, -0.924f, 1.221f)
                verticalLineToRelative(1.706f)
                horizontalLineToRelative(6.52f)
                lineToRelative(0.001f, -0.853f)
                verticalLineToRelative(-0.586f)
                lineToRelative(0.001f, -0.11f)
                lineToRelative(0.001f, -0.138f)
                verticalLineToRelative(-0.019f)
                curveToRelative(0.0f, -0.6f, -0.347f, -1.221f, -0.924f, -1.221f)
                close()
                moveTo(13.845f, 3.218f)
                horizontalLineToRelative(-3.85f)
                verticalLineToRelative(2.765f)
                horizontalLineToRelative(3.85f)
                lineTo(13.845f, 3.218f)
                close()
            }
        }
        .build()
        return _travelBagFilled!!
    }

private var _travelBagFilled: ImageVector? = null
