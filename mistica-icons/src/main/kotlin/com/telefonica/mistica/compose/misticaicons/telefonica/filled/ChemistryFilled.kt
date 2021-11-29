package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.ChemistryFilled: ImageVector
    get() {
        if (_chemistryFilled != null) {
            return _chemistryFilled!!
        }
        _chemistryFilled = Builder(name = "ChemistryFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.32f, 19.605f)
                horizontalLineToRelative(-0.127f)
                curveToRelative(-0.361f, -0.008f, -0.759f, -0.123f, -1.062f, -0.38f)
                curveToRelative(-0.305f, -0.258f, -0.515f, -0.653f, -0.515f, -1.25f)
                curveToRelative(0.0f, -1.182f, 0.843f, -1.613f, 1.569f, -1.613f)
                horizontalLineToRelative(0.134f)
                curveToRelative(0.726f, 0.016f, 1.566f, 0.456f, 1.566f, 1.622f)
                curveToRelative(0.0f, 1.173f, -0.843f, 1.605f, -1.566f, 1.621f)
                moveToRelative(-4.54f, -7.383f)
                lineToRelative(0.338f, -0.457f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, 0.126f, -0.373f)
                verticalLineTo(3.404f)
                horizontalLineToRelative(3.505f)
                verticalLineToRelative(7.988f)
                curveToRelative(0.0f, 0.14f, 0.042f, 0.267f, 0.126f, 0.373f)
                lineToRelative(0.344f, 0.465f)
                curveToRelative(-1.383f, 0.207f, -3.075f, 0.207f, -4.44f, -0.008f)
                moveToRelative(0.185f, 4.826f)
                horizontalLineToRelative(-0.075f)
                curveToRelative(-0.521f, -0.008f, -1.053f, -0.347f, -1.053f, -1.093f)
                curveToRelative(0.0f, -0.736f, 0.529f, -1.075f, 1.053f, -1.075f)
                horizontalLineToRelative(0.075f)
                curveToRelative(0.53f, 0.008f, 1.062f, 0.347f, 1.062f, 1.084f)
                curveToRelative(0.0f, 0.737f, -0.532f, 1.076f, -1.062f, 1.084f)
                moveToRelative(11.667f, 2.888f)
                lineToRelative(-5.804f, -7.658f)
                lineToRelative(-0.818f, -1.084f)
                verticalLineToRelative(-7.79f)
                horizontalLineToRelative(0.785f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, false, 0.633f, -0.622f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, false, -0.633f, -0.622f)
                horizontalLineTo(8.22f)
                arcToRelative(0.634f, 0.634f, 0.0f, false, false, -0.633f, 0.622f)
                curveToRelative(0.0f, 0.339f, 0.286f, 0.622f, 0.633f, 0.622f)
                horizontalLineToRelative(0.756f)
                verticalLineToRelative(7.79f)
                lineToRelative(-0.81f, 1.075f)
                lineToRelative(-5.837f, 7.832f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, false, -0.016f, 1.16f)
                curveToRelative(0.201f, 0.364f, 0.599f, 0.588f, 1.02f, 0.588f)
                horizontalLineToRelative(17.251f)
                curveToRelative(0.462f, 0.0f, 0.894f, -0.24f, 1.112f, -0.639f)
                curveToRelative(0.219f, -0.395f, 0.202f, -0.86f, -0.067f, -1.274f)
            }
        }
        .build()
        return _chemistryFilled!!
    }

private var _chemistryFilled: ImageVector? = null
