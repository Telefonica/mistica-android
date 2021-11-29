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

public val LightGroup.AddBoltonLight: ImageVector
    get() {
        if (_addBoltonLight != null) {
            return _addBoltonLight!!
        }
        _addBoltonLight = Builder(name = "AddBoltonLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.39f, 19.016f)
                arcToRelative(0.723f, 0.723f, 0.0f, false, true, -0.708f, 0.735f)
                curveToRelative(-0.391f, 0.0f, -0.71f, -0.33f, -0.71f, -0.735f)
                curveToRelative(0.0f, -0.406f, 0.319f, -0.736f, 0.71f, -0.736f)
                curveToRelative(0.39f, 0.0f, 0.709f, 0.33f, 0.709f, 0.736f)
                close()
                moveTo(17.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                lineToRelative(-5.0f, 9.021f)
                lineTo(7.0f, 21.0f)
                horizontalLineToRelative(9.79f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, false, 0.355f, -0.368f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, false, -0.354f, -0.367f)
                lineTo(7.409f, 20.265f)
                lineTo(2.82f, 12.02f)
                lineToRelative(4.59f, -8.286f)
                horizontalLineToRelative(9.177f)
                lineToRelative(4.591f, 8.286f)
                lineToRelative(-2.559f, 4.605f)
                curveToRelative(-0.1f, 0.174f, -0.04f, 0.4f, 0.132f, 0.504f)
                arcToRelative(0.347f, 0.347f, 0.0f, false, false, 0.486f, -0.136f)
                lineTo(22.0f, 12.02f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(12.0f, 16.438f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, false, 0.355f, -0.368f)
                verticalLineToRelative(-3.314f)
                horizontalLineToRelative(3.195f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, false, 0.355f, -0.367f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, false, -0.355f, -0.368f)
                horizontalLineToRelative(-3.195f)
                lineTo(12.355f, 8.708f)
                arcTo(0.362f, 0.362f, 0.0f, false, false, 12.0f, 8.34f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, false, -0.355f, 0.368f)
                verticalLineToRelative(3.313f)
                lineTo(8.45f, 12.021f)
                arcToRelative(0.362f, 0.362f, 0.0f, false, false, -0.355f, 0.368f)
                curveToRelative(0.0f, 0.203f, 0.16f, 0.367f, 0.355f, 0.367f)
                horizontalLineToRelative(3.195f)
                verticalLineToRelative(3.314f)
                curveToRelative(0.0f, 0.203f, 0.16f, 0.368f, 0.355f, 0.368f)
                close()
            }
        }
        .build()
        return _addBoltonLight!!
    }

private var _addBoltonLight: ImageVector? = null
