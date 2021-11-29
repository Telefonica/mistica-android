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

public val LightGroup.QuestionLight: ImageVector
    get() {
        if (_questionLight != null) {
            return _questionLight!!
        }
        _questionLight = Builder(name = "QuestionLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.419f, 21.007f)
                curveToRelative(2.017f, -0.042f, 8.597f, -0.793f, 8.597f, -8.989f)
                curveToRelative(0.0f, -8.196f, -6.611f, -8.991f, -8.636f, -9.039f)
                curveToRelative(-0.272f, -0.008f, -0.591f, -0.008f, -0.877f, -0.008f)
                curveToRelative(-2.0f, 0.017f, -8.532f, 0.72f, -8.532f, 8.989f)
                curveToRelative(0.0f, 8.285f, 6.58f, 9.025f, 8.596f, 9.047f)
                curveToRelative(0.289f, 0.009f, 0.597f, 0.0f, 0.852f, 0.0f)
                close()
                moveTo(12.394f, 2.158f)
                curveToRelative(1.582f, 0.042f, 9.442f, 0.698f, 9.442f, 9.86f)
                curveToRelative(0.0f, 9.171f, -7.834f, 9.78f, -9.4f, 9.81f)
                curveToRelative(-0.18f, 0.0f, -0.387f, 0.008f, -0.591f, 0.008f)
                curveToRelative(-0.098f, 0.0f, -0.196f, 0.0f, -0.286f, -0.008f)
                curveToRelative(-8.95f, -0.123f, -9.409f, -8.247f, -9.409f, -9.868f)
                curveToRelative(0.0f, -1.622f, 0.451f, -9.729f, 9.342f, -9.81f)
                horizontalLineToRelative(0.271f)
                curveToRelative(0.213f, 0.0f, 0.443f, 0.0f, 0.63f, 0.008f)
                close()
                moveTo(11.584f, 16.845f)
                curveToRelative(0.395f, 0.0f, 0.647f, 0.255f, 0.647f, 0.655f)
                verticalLineToRelative(0.065f)
                curveToRelative(0.0f, 0.383f, -0.255f, 0.638f, -0.647f, 0.638f)
                curveToRelative(-0.434f, 0.0f, -0.689f, -0.255f, -0.689f, -0.638f)
                lineTo(10.895f, 17.5f)
                curveToRelative(0.0f, -0.4f, 0.255f, -0.655f, 0.647f, -0.655f)
                horizontalLineToRelative(0.042f)
                close()
                moveTo(14.116f, 6.534f)
                curveToRelative(0.664f, 0.484f, 0.97f, 1.14f, 0.97f, 2.115f)
                curveToRelative(0.0f, 1.187f, -0.485f, 1.876f, -1.664f, 3.277f)
                curveToRelative(-1.362f, 1.566f, -1.468f, 1.697f, -1.468f, 3.255f)
                curveToRelative(0.0f, 0.112f, -0.09f, 0.204f, -0.205f, 0.204f)
                horizontalLineToRelative(-0.448f)
                arcToRelative(0.209f, 0.209f, 0.0f, false, true, -0.204f, -0.165f)
                curveToRelative(-0.034f, -0.18f, -0.05f, -0.37f, -0.05f, -0.608f)
                curveToRelative(0.0f, -0.95f, 0.271f, -1.557f, 1.212f, -2.68f)
                lineToRelative(0.171f, -0.205f)
                curveToRelative(1.451f, -1.711f, 1.745f, -2.238f, 1.745f, -3.098f)
                curveToRelative(0.0f, -0.639f, -0.187f, -1.067f, -0.622f, -1.412f)
                curveToRelative(-0.246f, -0.196f, -0.68f, -0.426f, -1.787f, -0.426f)
                curveToRelative(-0.574f, 0.0f, -1.098f, 0.073f, -1.753f, 0.23f)
                arcToRelative(0.193f, 0.193f, 0.0f, false, true, -0.166f, -0.025f)
                arcToRelative(0.285f, 0.285f, 0.0f, false, true, -0.09f, -0.132f)
                lineToRelative(-0.064f, -0.353f)
                arcToRelative(0.21f, 0.21f, 0.0f, false, true, 0.124f, -0.23f)
                curveToRelative(0.361f, -0.165f, 1.285f, -0.344f, 2.148f, -0.344f)
                curveToRelative(0.913f, 0.006f, 1.636f, 0.205f, 2.151f, 0.597f)
                close()
            }
        }
        .build()
        return _questionLight!!
    }

private var _questionLight: ImageVector? = null
