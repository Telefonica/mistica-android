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

public val LightGroup.MenuLight: ImageVector
    get() {
        if (_menuLight != null) {
            return _menuLight!!
        }
        _menuLight = Builder(name = "MenuLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.74f, 5.737f)
                arcToRelative(0.575f, 0.575f, 0.0f, false, true, -0.58f, -0.568f)
                curveToRelative(0.0f, -0.314f, 0.26f, -0.569f, 0.58f, -0.569f)
                horizontalLineToRelative(18.53f)
                curveToRelative(0.319f, 0.0f, 0.58f, 0.255f, 0.58f, 0.569f)
                curveToRelative(0.0f, 0.313f, -0.261f, 0.568f, -0.58f, 0.568f)
                lineTo(2.74f, 5.737f)
                close()
                moveTo(21.266f, 11.415f)
                curveToRelative(0.32f, 0.0f, 0.58f, 0.255f, 0.58f, 0.569f)
                curveToRelative(0.0f, 0.313f, -0.26f, 0.568f, -0.58f, 0.568f)
                lineTo(2.74f, 12.552f)
                arcToRelative(0.575f, 0.575f, 0.0f, false, true, -0.58f, -0.568f)
                curveToRelative(0.0f, -0.314f, 0.26f, -0.569f, 0.58f, -0.569f)
                horizontalLineToRelative(18.526f)
                close()
                moveTo(21.266f, 18.23f)
                curveToRelative(0.32f, 0.0f, 0.58f, 0.255f, 0.58f, 0.569f)
                curveToRelative(0.0f, 0.314f, -0.26f, 0.569f, -0.58f, 0.569f)
                lineTo(2.74f, 19.368f)
                arcToRelative(0.575f, 0.575f, 0.0f, false, true, -0.58f, -0.57f)
                curveToRelative(0.0f, -0.313f, 0.26f, -0.568f, 0.58f, -0.568f)
                horizontalLineToRelative(18.526f)
                close()
            }
        }
        .build()
        return _menuLight!!
    }

private var _menuLight: ImageVector? = null
