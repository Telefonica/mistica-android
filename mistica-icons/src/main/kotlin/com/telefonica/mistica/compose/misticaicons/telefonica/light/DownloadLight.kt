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

public val LightGroup.DownloadLight: ImageVector
    get() {
        if (_downloadLight != null) {
            return _downloadLight!!
        }
        _downloadLight = Builder(name = "DownloadLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.992f, 21.826f)
                arcToRelative(0.698f, 0.698f, 0.0f, false, true, -0.541f, -0.255f)
                lineToRelative(-9.107f, -9.418f)
                lineToRelative(-0.016f, -0.016f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -0.096f, -0.813f)
                arcToRelative(0.709f, 0.709f, 0.0f, false, true, 0.645f, -0.414f)
                horizontalLineToRelative(4.17f)
                curveToRelative(0.087f, 0.0f, 0.16f, -0.084f, 0.16f, -0.185f)
                lineTo(7.207f, 3.837f)
                curveToRelative(0.0f, -0.927f, 0.754f, -1.68f, 1.68f, -1.68f)
                horizontalLineToRelative(6.211f)
                curveToRelative(0.927f, 0.0f, 1.68f, 0.753f, 1.68f, 1.68f)
                lineToRelative(-0.002f, 6.885f)
                curveToRelative(0.0f, 0.104f, 0.07f, 0.185f, 0.16f, 0.185f)
                horizontalLineToRelative(4.196f)
                curveToRelative(0.277f, 0.003f, 0.529f, 0.162f, 0.644f, 0.417f)
                arcToRelative(0.755f, 0.755f, 0.0f, false, true, -0.098f, 0.813f)
                lineToRelative(-0.017f, 0.016f)
                lineToRelative(-9.132f, 9.418f)
                arcToRelative(0.706f, 0.706f, 0.0f, false, true, -0.537f, 0.255f)
                close()
                moveTo(2.759f, 11.776f)
                lineTo(11.863f, 21.19f)
                lineTo(11.88f, 21.207f)
                curveToRelative(0.028f, 0.036f, 0.07f, 0.056f, 0.114f, 0.058f)
                arcToRelative(0.146f, 0.146f, 0.0f, false, false, 0.115f, -0.058f)
                lineToRelative(0.017f, -0.017f)
                lineToRelative(9.126f, -9.415f)
                arcToRelative(0.21f, 0.21f, 0.0f, false, false, 0.02f, -0.21f)
                arcToRelative(0.153f, 0.153f, 0.0f, false, false, -0.14f, -0.095f)
                horizontalLineToRelative(-4.2f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, -0.72f, -0.745f)
                lineToRelative(0.004f, -6.882f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, false, -1.12f, -1.12f)
                lineTo(8.887f, 2.723f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, false, -1.12f, 1.12f)
                verticalLineToRelative(6.88f)
                arcToRelative(0.733f, 0.733f, 0.0f, false, true, -0.72f, 0.744f)
                lineTo(2.88f, 11.467f)
                arcToRelative(0.153f, 0.153f, 0.0f, false, false, -0.14f, 0.095f)
                arcToRelative(0.208f, 0.208f, 0.0f, false, false, 0.02f, 0.213f)
                close()
            }
        }
        .build()
        return _downloadLight!!
    }

private var _downloadLight: ImageVector? = null
