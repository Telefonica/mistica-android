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

public val RegularGroup.PlaneRegular: ImageVector
    get() {
        if (_planeRegular != null) {
            return _planeRegular!!
        }
        _planeRegular = Builder(name = "PlaneRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(5.921f, 18.872f)
                    horizontalLineToRelative(13.415f)
                    verticalLineToRelative(-1.36f)
                    lineTo(5.921f, 17.512f)
                    close()
                    moveTo(20.007f, 9.386f)
                    lineTo(10.348f, 13.669f)
                    lineToRelative(-2.674f, -0.668f)
                    arcToRelative(0.676f, 0.676f, 0.0f, false, false, -0.063f, -1.083f)
                    lineToRelative(0.002f, -0.002f)
                    lineToRelative(-2.731f, -1.82f)
                    lineTo(6.57f, 9.42f)
                    lineToRelative(3.816f, 1.908f)
                    lineToRelative(8.904f, -3.882f)
                    arcToRelative(0.94f, 0.94f, 0.0f, false, true, 0.744f, -0.016f)
                    arcToRelative(0.965f, 0.965f, 0.0f, false, true, 0.535f, 0.56f)
                    arcToRelative(1.113f, 1.113f, 0.0f, false, true, -0.562f, 1.396f)
                    close()
                    moveTo(21.819f, 7.456f)
                    arcTo(2.29f, 2.29f, 0.0f, false, false, 20.546f, 6.17f)
                    arcToRelative(2.293f, 2.293f, 0.0f, false, false, -1.809f, 0.033f)
                    lineTo(10.43f, 9.829f)
                    lineTo(6.632f, 7.93f)
                    lineTo(1.976f, 9.792f)
                    lineToRelative(3.726f, 2.484f)
                    lineToRelative(-0.585f, 0.195f)
                    arcToRelative(0.68f, 0.68f, 0.0f, false, false, -0.43f, 0.86f)
                    curveToRelative(0.076f, 0.229f, 0.264f, 0.385f, 0.481f, 0.44f)
                    lineToRelative(-0.001f, 0.005f)
                    lineToRelative(5.301f, 1.325f)
                    lineToRelative(10.099f, -4.476f)
                    curveToRelative(1.177f, -0.532f, 1.745f, -1.94f, 1.252f, -3.17f)
                    close()
                }
            }
        }
        .build()
        return _planeRegular!!
    }

private var _planeRegular: ImageVector? = null
