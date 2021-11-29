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

public val FilledGroup.BriefcaseFilled: ImageVector
    get() {
        if (_briefcaseFilled != null) {
            return _briefcaseFilled!!
        }
        _briefcaseFilled = Builder(name = "BriefcaseFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.818f, 16.656f)
                verticalLineToRelative(-1.42f)
                curveToRelative(3.11f, -0.219f, 6.104f, -1.0f, 8.028f, -2.087f)
                verticalLineToRelative(7.227f)
                curveToRelative(0.0f, 0.81f, -0.652f, 1.467f, -1.456f, 1.467f)
                lineTo(3.617f, 21.843f)
                arcToRelative(1.463f, 1.463f, 0.0f, false, true, -1.457f, -1.467f)
                verticalLineToRelative(-7.418f)
                curveToRelative(1.916f, 1.171f, 4.913f, 2.014f, 8.025f, 2.26f)
                verticalLineToRelative(1.438f)
                curveToRelative(0.0f, 0.347f, 0.157f, 0.636f, 0.434f, 0.818f)
                curveToRelative(0.205f, 0.131f, 0.46f, 0.199f, 0.787f, 0.199f)
                horizontalLineToRelative(1.2f)
                curveToRelative(0.319f, 0.0f, 0.582f, -0.068f, 0.778f, -0.2f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, false, 0.434f, -0.817f)
                close()
                moveTo(15.701f, 7.176f)
                verticalLineToRelative(-0.35f)
                curveToRelative(0.0f, -1.89f, -1.62f, -3.428f, -3.605f, -3.428f)
                horizontalLineToRelative(-0.185f)
                curveToRelative(-1.99f, 0.0f, -3.605f, 1.538f, -3.605f, 3.429f)
                verticalLineToRelative(0.35f)
                lineTo(15.7f, 7.177f)
                close()
                moveTo(20.39f, 7.176f)
                curveToRelative(0.804f, 0.0f, 1.456f, 0.66f, 1.456f, 1.469f)
                verticalLineToRelative(3.044f)
                curveToRelative(-1.91f, 1.384f, -5.955f, 2.376f, -9.767f, 2.376f)
                curveToRelative(-3.885f, 0.0f, -8.02f, -1.09f, -9.919f, -2.6f)
                verticalLineToRelative(-2.82f)
                curveToRelative(0.0f, -0.81f, 0.653f, -1.468f, 1.46f, -1.468f)
                horizontalLineToRelative(3.456f)
                verticalLineToRelative(-0.35f)
                curveToRelative(0.0f, -2.575f, 2.17f, -4.667f, 4.837f, -4.667f)
                horizontalLineToRelative(0.185f)
                curveToRelative(2.667f, 0.0f, 4.838f, 2.095f, 4.838f, 4.667f)
                verticalLineToRelative(0.35f)
                horizontalLineToRelative(3.454f)
                close()
                moveTo(11.415f, 16.434f)
                verticalLineToRelative(-1.131f)
                horizontalLineToRelative(1.174f)
                verticalLineToRelative(1.131f)
                horizontalLineToRelative(-1.174f)
                close()
            }
        }
        .build()
        return _briefcaseFilled!!
    }

private var _briefcaseFilled: ImageVector? = null
