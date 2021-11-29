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

public val RegularGroup.TravelBagRegular: ImageVector
    get() {
        if (_travelBagRegular != null) {
            return _travelBagRegular!!
        }
        _travelBagRegular = Builder(name = "TravelBagRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.43f, 19.734f)
                lineTo(16.43f, 7.344f)
                arcToRelative(0.242f, 0.242f, 0.0f, false, false, -0.05f, -0.131f)
                lineTo(7.46f, 7.213f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.05f, 0.132f)
                lineTo(7.41f, 19.73f)
                curveToRelative(0.0f, 0.056f, 0.026f, 0.107f, 0.042f, 0.132f)
                lineToRelative(8.933f, 0.003f)
                arcToRelative(0.21f, 0.21f, 0.0f, false, false, 0.045f, -0.132f)
                close()
                moveTo(9.996f, 3.218f)
                verticalLineToRelative(2.765f)
                horizontalLineToRelative(3.849f)
                lineTo(13.845f, 3.218f)
                horizontalLineToRelative(-3.85f)
                close()
                moveTo(16.45f, 5.992f)
                curveToRelative(0.647f, 0.0f, 1.212f, 0.63f, 1.212f, 1.35f)
                verticalLineToRelative(12.39f)
                curveToRelative(0.0f, 0.733f, -0.554f, 1.352f, -1.212f, 1.352f)
                horizontalLineToRelative(-1.045f)
                curveToRelative(-0.081f, 0.546f, -0.558f, 0.6f, -0.687f, 0.602f)
                horizontalLineToRelative(-0.067f)
                curveToRelative(-0.134f, -0.003f, -0.605f, -0.053f, -0.686f, -0.602f)
                lineTo(9.909f, 21.084f)
                curveToRelative(-0.081f, 0.546f, -0.557f, 0.6f, -0.686f, 0.602f)
                horizontalLineToRelative(-0.068f)
                curveToRelative(-0.134f, -0.003f, -0.605f, -0.053f, -0.686f, -0.602f)
                lineTo(7.388f, 21.084f)
                curveToRelative(-0.658f, 0.0f, -1.21f, -0.619f, -1.21f, -1.35f)
                lineTo(6.178f, 7.344f)
                curveToRelative(0.0f, -0.72f, 0.566f, -1.35f, 1.21f, -1.35f)
                horizontalLineToRelative(1.375f)
                lineTo(8.763f, 2.885f)
                curveToRelative(0.0f, -0.479f, 0.418f, -0.882f, 0.91f, -0.882f)
                horizontalLineToRelative(4.49f)
                curveToRelative(0.485f, 0.0f, 0.911f, 0.412f, 0.911f, 0.882f)
                verticalLineToRelative(3.11f)
                horizontalLineToRelative(1.376f)
                verticalLineToRelative(-0.003f)
                close()
                moveTo(13.948f, 17.45f)
                verticalLineToRelative(-4.91f)
                lineTo(9.89f, 12.54f)
                verticalLineToRelative(4.91f)
                horizontalLineToRelative(4.06f)
                close()
                moveTo(9.89f, 9.728f)
                verticalLineToRelative(1.594f)
                horizontalLineToRelative(4.06f)
                lineTo(13.95f, 9.728f)
                horizontalLineToRelative(-4.06f)
                close()
                moveTo(14.26f, 8.513f)
                curveToRelative(0.577f, 0.0f, 0.924f, 0.621f, 0.924f, 1.22f)
                verticalLineToRelative(7.718f)
                curveToRelative(0.0f, 0.695f, -0.397f, 1.221f, -0.924f, 1.221f)
                lineTo(9.584f, 18.672f)
                curveToRelative(-0.527f, 0.0f, -0.924f, -0.524f, -0.924f, -1.221f)
                verticalLineToRelative(-7.72f)
                curveToRelative(0.0f, -0.6f, 0.344f, -1.221f, 0.924f, -1.221f)
                lineToRelative(4.675f, 0.003f)
                close()
            }
        }
        .build()
        return _travelBagRegular!!
    }

private var _travelBagRegular: ImageVector? = null
