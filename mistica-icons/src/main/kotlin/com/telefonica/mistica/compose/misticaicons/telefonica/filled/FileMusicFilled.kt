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

public val FilledGroup.FileMusicFilled: ImageVector
    get() {
        if (_fileMusicFilled != null) {
            return _fileMusicFilled!!
        }
        _fileMusicFilled = Builder(name = "FileMusicFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.54f, 3.67f)
                verticalLineToRelative(1.764f)
                curveToRelative(0.0f, 0.658f, 0.212f, 1.213f, 0.613f, 1.608f)
                curveToRelative(0.406f, 0.398f, 0.98f, 0.61f, 1.663f, 0.61f)
                horizontalLineToRelative(1.774f)
                lineTo(13.54f, 3.67f)
                close()
                moveTo(19.24f, 7.76f)
                curveToRelative(0.03f, 0.072f, 0.047f, 0.153f, 0.047f, 0.237f)
                verticalLineToRelative(12.305f)
                curveToRelative(0.0f, 0.751f, -0.636f, 1.384f, -1.386f, 1.384f)
                lineTo(5.909f, 21.686f)
                curveToRelative(-0.74f, 0.0f, -1.387f, -0.647f, -1.387f, -1.384f)
                lineTo(4.522f, 3.384f)
                curveTo(4.522f, 2.658f, 5.183f, 2.0f, 5.91f, 2.0f)
                horizontalLineToRelative(7.3f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, 0.605f, 0.25f)
                lineToRelative(5.213f, 5.125f)
                curveToRelative(0.109f, 0.107f, 0.173f, 0.244f, 0.212f, 0.384f)
                close()
                moveTo(14.73f, 12.32f)
                lineTo(10.987f, 11.288f)
                verticalLineToRelative(-0.61f)
                lineToRelative(3.743f, 1.03f)
                verticalLineToRelative(0.611f)
                close()
                moveTo(13.957f, 18.409f)
                horizontalLineToRelative(-0.104f)
                curveToRelative(-0.513f, -0.008f, -0.77f, -0.291f, -0.77f, -0.843f)
                curveToRelative(0.0f, -0.205f, 0.0f, -0.827f, 0.756f, -0.835f)
                horizontalLineToRelative(0.112f)
                curveToRelative(0.518f, 0.014f, 0.779f, 0.297f, 0.779f, 0.84f)
                curveToRelative(0.0f, 0.547f, -0.26f, 0.827f, -0.773f, 0.838f)
                close()
                moveTo(9.189f, 16.4f)
                horizontalLineToRelative(-0.115f)
                curveToRelative(-0.51f, -0.009f, -0.77f, -0.292f, -0.77f, -0.844f)
                curveToRelative(0.0f, -0.204f, 0.0f, -0.826f, 0.756f, -0.832f)
                horizontalLineToRelative(0.11f)
                curveToRelative(0.518f, 0.012f, 0.781f, 0.297f, 0.781f, 0.844f)
                curveToRelative(0.0f, 0.54f, -0.26f, 0.82f, -0.762f, 0.832f)
                close()
                moveTo(15.136f, 10.727f)
                lineTo(10.808f, 9.534f)
                lineTo(10.674f, 9.514f)
                arcToRelative(0.726f, 0.726f, 0.0f, false, false, -0.72f, 0.734f)
                verticalLineToRelative(3.591f)
                arcToRelative(2.038f, 2.038f, 0.0f, false, false, -0.757f, -0.168f)
                horizontalLineToRelative(-0.142f)
                curveToRelative(-0.824f, 0.009f, -1.785f, 0.507f, -1.785f, 1.888f)
                curveToRelative(0.0f, 1.381f, 0.964f, 1.885f, 1.79f, 1.897f)
                horizontalLineToRelative(0.143f)
                curveToRelative(0.793f, -0.017f, 1.706f, -0.493f, 1.776f, -1.746f)
                lineToRelative(0.014f, -3.33f)
                lineToRelative(3.742f, 1.034f)
                verticalLineToRelative(2.437f)
                arcToRelative(2.038f, 2.038f, 0.0f, false, false, -0.756f, -0.169f)
                lineToRelative(-0.143f, -0.002f)
                curveToRelative(-0.823f, 0.008f, -1.784f, 0.507f, -1.784f, 1.888f)
                curveToRelative(0.0f, 1.38f, 0.966f, 1.885f, 1.79f, 1.896f)
                horizontalLineToRelative(0.143f)
                curveToRelative(0.826f, -0.017f, 1.79f, -0.518f, 1.79f, -1.888f)
                verticalLineToRelative(-6.115f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, false, -0.64f, -0.734f)
                close()
            }
        }
        .build()
        return _fileMusicFilled!!
    }

private var _fileMusicFilled: ImageVector? = null
