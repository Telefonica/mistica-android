package com.telefonica.mistica.compose.misticaicons.blau.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.blau.RegularGroup

public val RegularGroup.DownloadCloudRegular: ImageVector
    get() {
        if (_downloadCloudRegular != null) {
            return _downloadCloudRegular!!
        }
        _downloadCloudRegular = Builder(name = "DownloadCloudRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(17.075f, 14.334f)
                    horizontalLineToRelative(-4.426f)
                    lineTo(12.649f, 9.928f)
                    horizontalLineToRelative(-1.36f)
                    verticalLineToRelative(4.406f)
                    lineTo(5.95f, 14.334f)
                    arcToRelative(2.648f, 2.648f, 0.0f, false, true, -2.641f, -2.648f)
                    arcTo(2.65f, 2.65f, 0.0f, false, true, 5.973f, 9.04f)
                    horizontalLineToRelative(0.004f)
                    lineToRelative(0.653f, 0.027f)
                    lineToRelative(0.098f, -0.577f)
                    arcToRelative(4.976f, 4.976f, 0.0f, false, true, 4.913f, -4.157f)
                    arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.344f, 2.545f)
                    lineToRelative(0.219f, 0.388f)
                    lineToRelative(0.442f, -0.053f)
                    curveToRelative(0.16f, -0.02f, 0.301f, -0.029f, 0.429f, -0.029f)
                    arcToRelative(3.575f, 3.575f, 0.0f, false, true, 0.0f, 7.15f)
                    close()
                    moveTo(17.075f, 5.85f)
                    lineTo(16.921f, 5.853f)
                    arcTo(6.335f, 6.335f, 0.0f, false, false, 11.641f, 3.0f)
                    arcTo(6.3f, 6.3f, 0.0f, false, false, 5.53f, 7.727f)
                    arcToRelative(3.982f, 3.982f, 0.0f, false, false, 0.42f, 7.94f)
                    horizontalLineToRelative(5.339f)
                    verticalLineToRelative(3.401f)
                    lineToRelative(-1.685f, -1.685f)
                    lineToRelative(-0.962f, 0.962f)
                    lineToRelative(3.323f, 3.322f)
                    lineToRelative(3.322f, -3.322f)
                    lineToRelative(-0.962f, -0.962f)
                    lineToRelative(-1.676f, 1.676f)
                    verticalLineToRelative(-3.392f)
                    horizontalLineToRelative(4.426f)
                    arcToRelative(4.91f, 4.91f, 0.0f, false, false, 4.9f, -4.908f)
                    arcToRelative(4.91f, 4.91f, 0.0f, false, false, -4.9f, -4.909f)
                    close()
                }
            }
        }
        .build()
        return _downloadCloudRegular!!
    }

private var _downloadCloudRegular: ImageVector? = null
