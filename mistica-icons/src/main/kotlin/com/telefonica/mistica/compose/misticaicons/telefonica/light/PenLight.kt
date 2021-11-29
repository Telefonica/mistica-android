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

public val LightGroup.PenLight: ImageVector
    get() {
        if (_penLight != null) {
            return _penLight!!
        }
        _penLight = Builder(name = "PenLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.925f, 8.597f)
                lineToRelative(-0.829f, 0.824f)
                lineToRelative(-4.565f, -4.516f)
                lineToRelative(0.845f, -0.837f)
                curveToRelative(2.037f, -2.011f, 3.77f, -0.76f, 4.423f, -0.126f)
                curveToRelative(0.079f, 0.078f, 0.163f, 0.165f, 0.233f, 0.235f)
                curveToRelative(0.639f, 0.664f, 1.91f, 2.423f, -0.107f, 4.42f)
                close()
                moveTo(3.267f, 19.628f)
                lineTo(4.34f, 20.69f)
                lineToRelative(-1.272f, 0.232f)
                lineToRelative(0.2f, -1.294f)
                close()
                moveTo(6.13f, 17.2f)
                lineToRelative(-2.014f, -1.995f)
                lineToRelative(9.83f, -9.723f)
                lineToRelative(2.013f, 1.995f)
                lineTo(6.13f, 17.2f)
                close()
                moveTo(5.326f, 20.508f)
                lineTo(3.421f, 18.62f)
                lineToRelative(0.395f, -2.555f)
                lineToRelative(4.025f, 3.98f)
                lineToRelative(-2.515f, 0.463f)
                close()
                moveTo(8.707f, 19.748f)
                lineTo(6.715f, 17.78f)
                lineToRelative(9.83f, -9.722f)
                lineToRelative(1.969f, 1.946f)
                lineToRelative(-9.807f, 9.746f)
                close()
                moveTo(20.631f, 3.612f)
                curveToRelative(-0.084f, -0.084f, -0.165f, -0.168f, -0.252f, -0.252f)
                curveToRelative(-1.33f, -1.294f, -3.498f, -1.938f, -5.59f, 0.132f)
                lineTo(3.233f, 14.919f)
                arcToRelative(0.368f, 0.368f, 0.0f, false, false, -0.104f, 0.205f)
                curveToRelative(-0.003f, 0.008f, -0.011f, 0.014f, -0.011f, 0.022f)
                lineTo(2.16f, 21.37f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.484f, 0.465f)
                lineToRelative(6.02f, -1.103f)
                curveToRelative(0.014f, 0.0f, 0.028f, 0.008f, 0.042f, 0.008f)
                curveToRelative(0.11f, 0.0f, 0.216f, -0.042f, 0.294f, -0.12f)
                curveToRelative(0.006f, -0.006f, 0.009f, -0.014f, 0.014f, -0.023f)
                curveToRelative(0.003f, -0.003f, 0.011f, -0.003f, 0.014f, -0.005f)
                lineTo(20.514f, 9.177f)
                curveToRelative(2.67f, -2.644f, 0.566f, -5.1f, 0.117f, -5.566f)
                close()
            }
        }
        .build()
        return _penLight!!
    }

private var _penLight: ImageVector? = null
