package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.AlertLight: ImageVector
    get() {
        if (_alertLight != null) {
            return _alertLight!!
        }
        _alertLight = Builder(name = "AlertLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.644f, 20.266f)
                lineTo(3.018f, 20.266f)
                lineToRelative(8.993f, -16.165f)
                lineToRelative(6.815f, 12.238f)
                curveToRelative(0.105f, 0.183f, 0.32f, 0.221f, 0.498f, 0.146f)
                curveToRelative(0.178f, -0.108f, 0.214f, -0.33f, 0.141f, -0.513f)
                lineTo(12.331f, 3.183f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, false, -0.32f, -0.183f)
                arcToRelative(0.372f, 0.372f, 0.0f, false, false, -0.32f, 0.183f)
                lineTo(2.056f, 20.45f)
                arcToRelative(0.334f, 0.334f, 0.0f, false, false, 0.0f, 0.367f)
                arcToRelative(0.432f, 0.432f, 0.0f, false, false, 0.32f, 0.183f)
                horizontalLineToRelative(19.269f)
                curveToRelative(0.214f, 0.0f, 0.356f, -0.146f, 0.356f, -0.367f)
                curveToRelative(0.0f, -0.22f, -0.142f, -0.367f, -0.356f, -0.367f)
                close()
                moveTo(12.368f, 16.409f)
                lineTo(12.368f, 8.508f)
                curveToRelative(0.0f, -0.221f, -0.142f, -0.367f, -0.357f, -0.367f)
                curveToRelative(-0.214f, 0.0f, -0.356f, 0.146f, -0.356f, 0.367f)
                verticalLineToRelative(7.901f)
                curveToRelative(0.0f, 0.222f, 0.142f, 0.367f, 0.356f, 0.367f)
                curveToRelative(0.215f, 0.0f, 0.357f, -0.145f, 0.357f, -0.367f)
                close()
                moveTo(20.288f, 19.019f)
                curveToRelative(0.392f, 0.0f, 0.712f, -0.328f, 0.712f, -0.733f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, -0.713f, -0.734f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, -0.712f, 0.734f)
                curveToRelative(0.0f, 0.405f, 0.324f, 0.734f, 0.712f, 0.734f)
                close()
                moveTo(11.477f, 18.432f)
                curveToRelative(0.0f, 0.292f, 0.251f, 0.55f, 0.534f, 0.55f)
                curveToRelative(0.284f, 0.0f, 0.535f, -0.258f, 0.535f, -0.55f)
                curveToRelative(0.0f, -0.292f, -0.251f, -0.55f, -0.535f, -0.55f)
                arcToRelative(0.531f, 0.531f, 0.0f, false, false, -0.534f, 0.55f)
                close()
            }
        }
        .build()
        return _alertLight!!
    }

private var _alertLight: ImageVector? = null
