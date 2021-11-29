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

public val LightGroup.ImportLight: ImageVector
    get() {
        if (_importLight != null) {
            return _importLight!!
        }
        _importLight = Builder(name = "ImportLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.652f, 16.618f)
                lineToRelative(-5.894f, -5.893f)
                arcToRelative(0.58f, 0.58f, 0.0f, true, true, 0.776f, -0.866f)
                curveToRelative(0.014f, 0.014f, 0.031f, 0.028f, 0.042f, 0.042f)
                lineToRelative(4.9f, 4.91f)
                lineTo(11.476f, 2.737f)
                curveToRelative(0.002f, -0.32f, 0.26f, -0.58f, 0.582f, -0.58f)
                curveToRelative(0.322f, 0.0f, 0.58f, 0.26f, 0.58f, 0.58f)
                verticalLineToRelative(12.079f)
                lineToRelative(4.807f, -4.807f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, 0.82f, 0.82f)
                lineToRelative(-5.79f, 5.79f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, true, -0.196f, 0.13f)
                arcToRelative(0.546f, 0.546f, 0.0f, false, true, -0.44f, 0.0f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, -0.187f, -0.13f)
                close()
                moveTo(21.262f, 16.481f)
                curveToRelative(0.32f, 0.0f, 0.58f, 0.26f, 0.58f, 0.577f)
                verticalLineToRelative(4.205f)
                curveToRelative(0.0f, 0.319f, -0.257f, 0.58f, -0.577f, 0.58f)
                lineTo(2.733f, 21.843f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, -0.577f, -0.578f)
                verticalLineToRelative(-4.204f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, 1.16f, 0.0f)
                verticalLineToRelative(3.625f)
                horizontalLineToRelative(17.372f)
                lineTo(20.688f, 17.06f)
                arcToRelative(0.573f, 0.573f, 0.0f, false, true, 0.575f, -0.58f)
                close()
            }
        }
        .build()
        return _importLight!!
    }

private var _importLight: ImageVector? = null
