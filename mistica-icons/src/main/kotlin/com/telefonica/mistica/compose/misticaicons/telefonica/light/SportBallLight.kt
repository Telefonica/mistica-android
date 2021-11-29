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

public val LightGroup.SportBallLight: ImageVector
    get() {
        if (_sportBallLight != null) {
            return _sportBallLight!!
        }
        _sportBallLight = Builder(name = "SportBallLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.767f, 18.93f)
                curveToRelative(-1.149f, -1.634f, -1.863f, -4.037f, -1.936f, -6.572f)
                horizontalLineToRelative(5.185f)
                arcToRelative(9.03f, 9.03f, 0.0f, false, true, -3.25f, 6.571f)
                close()
                moveTo(12.408f, 21.013f)
                verticalLineToRelative(-8.652f)
                horizontalLineToRelative(2.6f)
                curveToRelative(0.073f, 2.706f, 0.846f, 5.291f, 2.109f, 7.061f)
                arcToRelative(8.954f, 8.954f, 0.0f, false, true, -4.709f, 1.591f)
                close()
                moveTo(12.408f, 2.985f)
                arcToRelative(8.907f, 8.907f, 0.0f, false, true, 4.594f, 1.51f)
                curveToRelative(-1.221f, 1.82f, -1.935f, 4.348f, -1.991f, 7.045f)
                horizontalLineToRelative(-2.603f)
                lineTo(12.408f, 2.985f)
                close()
                moveTo(21.013f, 11.54f)
                horizontalLineToRelative(-5.182f)
                curveToRelative(0.056f, -2.518f, 0.723f, -4.871f, 1.83f, -6.555f)
                arcToRelative(9.014f, 9.014f, 0.0f, false, true, 3.352f, 6.555f)
                close()
                moveTo(11.59f, 11.54f)
                lineTo(8.932f, 11.54f)
                curveToRelative(-0.047f, -2.68f, -0.753f, -5.207f, -1.969f, -7.03f)
                arcToRelative(8.995f, 8.995f, 0.0f, false, true, 4.627f, -1.525f)
                verticalLineToRelative(8.555f)
                close()
                moveTo(11.59f, 21.013f)
                arcToRelative(8.978f, 8.978f, 0.0f, false, true, -4.75f, -1.616f)
                curveToRelative(1.238f, -1.773f, 2.003f, -4.347f, 2.09f, -7.04f)
                horizontalLineToRelative(2.658f)
                verticalLineToRelative(8.656f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(2.983f, 12.361f)
                horizontalLineToRelative(5.126f)
                curveToRelative(-0.082f, 2.51f, -0.787f, 4.904f, -1.92f, 6.538f)
                arcToRelative(9.034f, 9.034f, 0.0f, false, true, -3.206f, -6.538f)
                close()
                moveTo(6.299f, 5.011f)
                curveTo(7.414f, 6.7f, 8.064f, 9.039f, 8.111f, 11.54f)
                lineTo(2.985f, 11.54f)
                arcTo(9.043f, 9.043f, 0.0f, false, true, 6.3f, 5.01f)
                close()
                moveTo(12.0f, 2.156f)
                curveToRelative(-5.431f, 0.0f, -9.843f, 4.412f, -9.843f, 9.843f)
                curveToRelative(0.0f, 5.429f, 4.412f, 9.844f, 9.843f, 9.844f)
                curveToRelative(5.432f, 0.0f, 9.844f, -4.415f, 9.844f, -9.844f)
                curveToRelative(0.0f, -5.431f, -4.412f, -9.843f, -9.844f, -9.843f)
                close()
            }
        }
        .build()
        return _sportBallLight!!
    }

private var _sportBallLight: ImageVector? = null
