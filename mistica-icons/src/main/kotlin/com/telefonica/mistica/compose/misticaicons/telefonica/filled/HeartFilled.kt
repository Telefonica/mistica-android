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

public val FilledGroup.HeartFilled: ImageVector
    get() {
        if (_heartFilled != null) {
            return _heartFilled!!
        }
        _heartFilled = Builder(name = "HeartFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.238f, 2.168f)
                curveToRelative(1.196f, 0.062f, 2.3f, 0.48f, 3.11f, 1.174f)
                curveToRelative(1.394f, 1.196f, 1.856f, 3.151f, 1.296f, 5.504f)
                curveToRelative(-0.515f, 2.162f, -1.512f, 4.403f, -2.969f, 6.664f)
                curveToRelative(-1.151f, 1.79f, -2.076f, 2.947f, -3.639f, 4.563f)
                arcToRelative(0.487f, 0.487f, 0.0f, false, true, -0.036f, 0.042f)
                curveToRelative(-0.154f, 0.16f, -0.692f, 0.7f, -1.146f, 1.028f)
                arcToRelative(3.422f, 3.422f, 0.0f, false, true, -1.277f, 0.574f)
                curveToRelative(-0.132f, 0.031f, -0.266f, 0.05f, -0.4f, 0.056f)
                horizontalLineToRelative(-0.017f)
                lineToRelative(-0.062f, 0.005f)
                horizontalLineToRelative(-0.078f)
                curveToRelative(-0.05f, 0.0f, -0.096f, 0.0f, -0.138f, -0.002f)
                horizontalLineToRelative(-0.017f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -0.4f, -0.056f)
                curveToRelative(-0.46f, -0.104f, -0.896f, -0.3f, -1.277f, -0.574f)
                curveToRelative(-0.457f, -0.33f, -0.995f, -0.874f, -1.149f, -1.031f)
                curveToRelative(-1.588f, -1.639f, -2.515f, -2.801f, -3.678f, -4.605f)
                curveToRelative(-1.453f, -2.258f, -2.453f, -4.502f, -2.969f, -6.667f)
                curveToRelative(-0.56f, -2.353f, -0.098f, -4.305f, 1.297f, -5.504f)
                curveToRelative(0.81f, -0.692f, 1.916f, -1.11f, 3.11f, -1.17f)
                curveToRelative(1.257f, -0.065f, 2.562f, 0.254f, 3.772f, 0.926f)
                arcToRelative(54.2f, 54.2f, 0.0f, false, true, 1.297f, 0.745f)
                curveToRelative(0.093f, 0.05f, 0.205f, 0.05f, 0.3f, 0.0f)
                curveToRelative(0.462f, -0.274f, 0.885f, -0.518f, 1.3f, -0.747f)
                curveToRelative(1.207f, -0.67f, 2.512f, -0.99f, 3.77f, -0.925f)
                close()
            }
        }
        .build()
        return _heartFilled!!
    }

private var _heartFilled: ImageVector? = null
