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

public val LightGroup.EditPaperLight: ImageVector
    get() {
        if (_editPaperLight != null) {
            return _editPaperLight!!
        }
        _editPaperLight = Builder(name = "EditPaperLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.842f, 4.9f)
                arcToRelative(2.845f, 2.845f, 0.0f, false, false, -0.799f, -1.944f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, false, -1.818f, -0.798f)
                arcToRelative(2.706f, 2.706f, 0.0f, false, false, -2.014f, 0.798f)
                lineToRelative(-0.543f, 0.496f)
                lineTo(6.326f, 3.452f)
                curveToRelative(-2.568f, -0.023f, -4.165f, 1.482f, -4.165f, 3.89f)
                lineTo(2.161f, 17.97f)
                arcToRelative(3.682f, 3.682f, 0.0f, false, false, 1.076f, 2.79f)
                arcToRelative(4.285f, 4.285f, 0.0f, false, false, 3.103f, 1.076f)
                horizontalLineToRelative(9.26f)
                curveToRelative(1.14f, 0.07f, 2.261f, -0.32f, 3.116f, -1.076f)
                arcToRelative(3.684f, 3.684f, 0.0f, false, false, 1.078f, -2.79f)
                lineTo(19.794f, 7.945f)
                lineToRelative(1.238f, -1.157f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, false, 0.81f, -1.888f)
                close()
                moveTo(18.623f, 17.967f)
                arcToRelative(2.618f, 2.618f, 0.0f, false, true, -0.717f, 1.955f)
                arcToRelative(3.24f, 3.24f, 0.0f, false, true, -2.316f, 0.751f)
                lineTo(6.326f, 20.673f)
                arcToRelative(3.227f, 3.227f, 0.0f, false, true, -2.316f, -0.75f)
                arcToRelative(2.622f, 2.622f, 0.0f, false, true, -0.695f, -1.956f)
                lineTo(3.315f, 7.343f)
                curveToRelative(0.0f, -1.712f, 1.076f, -2.757f, 3.023f, -2.757f)
                horizontalLineToRelative(9.053f)
                lineTo(10.878f, 8.57f)
                arcToRelative(1.343f, 1.343f, 0.0f, false, false, -0.347f, 0.52f)
                lineToRelative(-1.065f, 3.183f)
                curveToRelative(-0.154f, 0.431f, -0.042f, 0.91f, 0.289f, 1.227f)
                curveToRelative(0.221f, 0.232f, 0.526f, 0.36f, 0.846f, 0.358f)
                curveToRelative(0.126f, 0.017f, 0.255f, 0.017f, 0.38f, 0.0f)
                lineToRelative(3.197f, -1.053f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, false, 0.417f, -0.244f)
                reflectiveCurveToRelative(2.21f, -1.944f, 4.017f, -3.563f)
                lineToRelative(0.011f, 8.97f)
                close()
                moveTo(10.52f, 12.642f)
                lineTo(11.598f, 9.438f)
                curveToRelative(1.726f, -1.493f, 6.123f, -5.359f, 6.437f, -5.658f)
                curveToRelative(0.28f, -0.294f, 0.67f, -0.463f, 1.076f, -0.463f)
                horizontalLineToRelative(0.07f)
                curveToRelative(0.84f, 0.042f, 1.498f, 0.734f, 1.504f, 1.575f)
                curveToRelative(-0.003f, 0.406f, -0.171f, 0.792f, -0.462f, 1.075f)
                curveToRelative(-0.348f, 0.325f, -5.58f, 4.955f, -6.404f, 5.684f)
                lineToRelative(-3.196f, 1.053f)
                curveToRelative(0.0f, -0.003f, -0.103f, -0.062f, -0.103f, -0.062f)
                close()
            }
        }
        .build()
        return _editPaperLight!!
    }

private var _editPaperLight: ImageVector? = null
