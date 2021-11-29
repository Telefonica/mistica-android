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

public val LightGroup.ExportLight: ImageVector
    get() {
        if (_exportLight != null) {
            return _exportLight!!
        }
        _exportLight = Builder(name = "ExportLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.648f, 2.322f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, true, 0.185f, -0.126f)
                curveToRelative(0.14f, -0.061f, 0.3f, -0.061f, 0.44f, 0.0f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, true, 0.195f, 0.126f)
                lineToRelative(5.791f, 5.79f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, -0.823f, 0.825f)
                lineTo(12.63f, 4.129f)
                verticalLineToRelative(12.08f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, -1.16f, 0.0f)
                lineTo(11.47f, 4.13f)
                lineTo(6.574f, 9.04f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, -0.824f, -0.823f)
                lineToRelative(5.898f, -5.895f)
                close()
                moveTo(21.26f, 16.475f)
                curveToRelative(0.32f, 0.0f, 0.58f, 0.26f, 0.58f, 0.58f)
                verticalLineToRelative(4.205f)
                curveToRelative(0.0f, 0.32f, -0.26f, 0.58f, -0.58f, 0.58f)
                lineTo(2.73f, 21.84f)
                curveToRelative(-0.32f, 0.0f, -0.58f, -0.26f, -0.58f, -0.58f)
                verticalLineToRelative(-4.205f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, 1.16f, 0.0f)
                verticalLineToRelative(3.625f)
                horizontalLineToRelative(17.373f)
                verticalLineToRelative(-3.625f)
                curveToRelative(0.0f, -0.322f, 0.258f, -0.58f, 0.577f, -0.58f)
                close()
            }
        }
        .build()
        return _exportLight!!
    }

private var _exportLight: ImageVector? = null
