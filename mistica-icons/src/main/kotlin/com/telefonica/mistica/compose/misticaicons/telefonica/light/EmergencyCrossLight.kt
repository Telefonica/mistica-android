package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.EmergencyCrossLight: ImageVector
    get() {
        if (_emergencyCrossLight != null) {
            return _emergencyCrossLight!!
        }
        _emergencyCrossLight = Builder(name = "EmergencyCrossLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.14f, 14.445f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.408f, 0.409f)
                lineToRelative(0.003f, 5.574f)
                curveToRelative(0.0f, 0.325f, 0.233f, 0.588f, 0.384f, 0.588f)
                lineToRelative(4.129f, 0.003f)
                curveToRelative(0.151f, 0.0f, 0.384f, -0.266f, 0.384f, -0.591f)
                lineToRelative(-0.003f, -5.577f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.409f, -0.409f)
                lineToRelative(5.574f, -0.003f)
                curveToRelative(0.322f, 0.0f, 0.588f, -0.252f, 0.588f, -0.384f)
                lineTo(21.016f, 9.927f)
                curveToRelative(0.0f, -0.13f, -0.266f, -0.384f, -0.588f, -0.384f)
                lineToRelative(-5.577f, 0.003f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.409f, -0.41f)
                lineToRelative(-0.003f, -5.57f)
                curveToRelative(0.0f, -0.323f, -0.255f, -0.589f, -0.384f, -0.589f)
                lineTo(9.93f, 2.977f)
                curveToRelative(-0.128f, 0.0f, -0.386f, 0.266f, -0.386f, 0.588f)
                lineToRelative(0.003f, 5.577f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.41f, 0.41f)
                lineToRelative(-5.574f, 0.002f)
                curveToRelative(-0.325f, 0.0f, -0.59f, 0.233f, -0.59f, 0.384f)
                verticalLineToRelative(4.129f)
                curveToRelative(0.0f, 0.15f, 0.265f, 0.386f, 0.59f, 0.386f)
                lineToRelative(5.577f, -0.008f)
                close()
                moveTo(14.067f, 21.84f)
                lineTo(9.937f, 21.837f)
                curveToRelative(-0.64f, 0.0f, -1.204f, -0.658f, -1.204f, -1.409f)
                lineToRelative(-0.003f, -5.163f)
                lineToRelative(-5.165f, 0.003f)
                curveToRelative(-0.75f, 0.0f, -1.409f, -0.563f, -1.409f, -1.204f)
                lineToRelative(0.003f, -4.126f)
                curveToRelative(0.0f, -0.642f, 0.658f, -1.205f, 1.412f, -1.205f)
                lineToRelative(5.16f, -0.003f)
                lineToRelative(-0.003f, -5.165f)
                curveToRelative(0.0f, -0.736f, 0.574f, -1.409f, 1.204f, -1.409f)
                horizontalLineToRelative(4.129f)
                curveToRelative(0.63f, 0.0f, 1.204f, 0.673f, 1.204f, 1.41f)
                verticalLineToRelative(5.162f)
                lineToRelative(5.169f, -0.003f)
                curveToRelative(0.736f, 0.0f, 1.409f, 0.574f, 1.409f, 1.204f)
                verticalLineToRelative(4.13f)
                curveToRelative(0.0f, 0.63f, -0.673f, 1.204f, -1.41f, 1.204f)
                horizontalLineToRelative(-5.165f)
                lineToRelative(0.003f, 5.168f)
                curveToRelative(0.0f, 0.75f, -0.563f, 1.409f, -1.204f, 1.409f)
                close()
            }
        }
        .build()
        return _emergencyCrossLight!!
    }

private var _emergencyCrossLight: ImageVector? = null
