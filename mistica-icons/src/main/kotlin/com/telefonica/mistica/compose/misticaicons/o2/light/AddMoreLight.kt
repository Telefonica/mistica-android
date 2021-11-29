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

public val LightGroup.AddMoreLight: ImageVector
    get() {
        if (_addMoreLight != null) {
            return _addMoreLight!!
        }
        _addMoreLight = Builder(name = "AddMoreLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.994f, 5.0f)
                curveToRelative(0.155f, 0.0f, 0.272f, 0.132f, 0.272f, 0.291f)
                verticalLineToRelative(6.918f)
                horizontalLineToRelative(4.581f)
                curveToRelative(0.146f, 0.0f, 0.272f, 0.126f, 0.272f, 0.291f)
                curveToRelative(0.0f, 0.165f, -0.123f, 0.291f, -0.272f, 0.291f)
                horizontalLineToRelative(-4.57f)
                verticalLineToRelative(6.918f)
                curveToRelative(0.0f, 0.165f, -0.117f, 0.291f, -0.271f, 0.291f)
                curveToRelative(-0.155f, 0.0f, -0.272f, -0.132f, -0.272f, -0.291f)
                lineTo(11.734f, 12.79f)
                lineTo(5.272f, 12.79f)
                curveToRelative(-0.154f, 0.0f, -0.272f, -0.126f, -0.272f, -0.291f)
                curveToRelative(0.0f, -0.165f, 0.123f, -0.291f, 0.272f, -0.291f)
                horizontalLineToRelative(6.45f)
                lineTo(11.722f, 5.29f)
                curveToRelative(0.0f, -0.165f, 0.118f, -0.291f, 0.272f, -0.291f)
                close()
                moveTo(18.462f, 11.918f)
                curveToRelative(0.297f, 0.0f, 0.538f, 0.258f, 0.538f, 0.576f)
                curveToRelative(0.0f, 0.318f, -0.241f, 0.576f, -0.538f, 0.576f)
                curveToRelative(-0.298f, 0.0f, -0.538f, -0.258f, -0.538f, -0.576f)
                curveToRelative(0.0f, -0.318f, 0.24f, -0.576f, 0.538f, -0.576f)
                close()
            }
        }
        .build()
        return _addMoreLight!!
    }

private var _addMoreLight: ImageVector? = null
