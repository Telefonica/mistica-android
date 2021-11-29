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

public val FilledGroup.PuzzleFilled: ImageVector
    get() {
        if (_puzzleFilled != null) {
            return _puzzleFilled!!
        }
        _puzzleFilled = Builder(name = "PuzzleFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.182f, 21.416f)
                horizontalLineTo(3.614f)
                curveToRelative(-0.801f, 0.0f, -1.454f, -0.67f, -1.454f, -1.49f)
                verticalLineToRelative(-2.847f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, 0.207f, -0.476f)
                arcToRelative(0.591f, 0.591f, 0.0f, false, true, 0.485f, -0.154f)
                curveToRelative(0.12f, 0.014f, 0.224f, 0.023f, 0.297f, 0.025f)
                horizontalLineToRelative(0.036f)
                curveToRelative(0.053f, 0.0f, 0.112f, 0.0f, 0.163f, -0.005f)
                curveToRelative(0.179f, -0.003f, 0.495f, -0.017f, 0.857f, -0.14f)
                curveToRelative(0.991f, -0.317f, 1.49f, -1.098f, 1.49f, -2.33f)
                curveToRelative(0.0f, -1.236f, -0.496f, -2.02f, -1.479f, -2.329f)
                curveToRelative(-0.387f, -0.137f, -0.728f, -0.15f, -0.84f, -0.156f)
                horizontalLineTo(3.11f)
                curveToRelative(-0.056f, 0.002f, -0.152f, 0.005f, -0.267f, 0.02f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.479f, -0.158f)
                arcToRelative(0.637f, 0.637f, 0.0f, false, true, -0.204f, -0.473f)
                verticalLineToRelative(-2.54f)
                curveToRelative(0.0f, -0.824f, 0.653f, -1.49f, 1.454f, -1.49f)
                horizontalLineToRelative(2.655f)
                curveToRelative(-0.02f, -0.191f, -0.03f, -0.387f, -0.03f, -0.59f)
                curveToRelative(0.0f, -2.719f, 1.803f, -3.71f, 3.49f, -3.733f)
                horizontalLineToRelative(0.29f)
                curveToRelative(1.715f, 0.048f, 3.533f, 1.056f, 3.533f, 3.75f)
                curveToRelative(0.0f, 0.197f, -0.011f, 0.387f, -0.03f, 0.57f)
                horizontalLineToRelative(2.663f)
                curveToRelative(0.799f, 0.0f, 1.446f, 0.669f, 1.446f, 1.49f)
                verticalLineToRelative(1.907f)
                curveToRelative(0.168f, -0.02f, 0.308f, -0.022f, 0.403f, -0.022f)
                horizontalLineToRelative(0.3f)
                curveToRelative(1.697f, 0.05f, 3.512f, 1.061f, 3.512f, 3.75f)
                curveToRelative(0.0f, 2.72f, -1.893f, 3.712f, -3.512f, 3.734f)
                arcToRelative(3.314f, 3.314f, 0.0f, false, true, -0.703f, -0.022f)
                verticalLineToRelative(2.216f)
                curveToRelative(0.0f, 0.823f, -0.65f, 1.493f, -1.449f, 1.493f)
            }
        }
        .build()
        return _puzzleFilled!!
    }

private var _puzzleFilled: ImageVector? = null
