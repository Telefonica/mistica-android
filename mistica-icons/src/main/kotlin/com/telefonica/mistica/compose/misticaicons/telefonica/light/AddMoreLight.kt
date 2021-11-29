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
                moveTo(18.536f, 11.535f)
                horizontalLineToRelative(-6.069f)
                verticalLineTo(5.466f)
                arcToRelative(0.467f, 0.467f, 0.0f, false, false, -0.932f, 0.0f)
                verticalLineToRelative(6.069f)
                horizontalLineTo(5.466f)
                arcToRelative(0.466f, 0.466f, 0.0f, true, false, 0.0f, 0.932f)
                horizontalLineToRelative(6.069f)
                verticalLineToRelative(6.067f)
                arcToRelative(0.467f, 0.467f, 0.0f, false, false, 0.932f, 0.0f)
                verticalLineToRelative(-6.067f)
                horizontalLineToRelative(6.067f)
                arcToRelative(0.467f, 0.467f, 0.0f, false, false, 0.002f, -0.932f)
                close()
            }
        }
        .build()
        return _addMoreLight!!
    }

private var _addMoreLight: ImageVector? = null
