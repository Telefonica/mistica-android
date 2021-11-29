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

public val FilledGroup.DataFilled: ImageVector
    get() {
        if (_dataFilled != null) {
            return _dataFilled!!
        }
        _dataFilled = Builder(name = "DataFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.58f, 5.373f)
                curveTo(6.364f, 5.023f, 5.622f, 4.549f, 5.426f, 4.0f)
                curveToRelative(0.0f, -0.008f, 0.0f, -0.008f, -0.009f, -0.02f)
                curveToRelative(0.196f, -0.546f, 0.936f, -1.03f, 2.143f, -1.38f)
                curveToRelative(1.283f, -0.368f, 2.978f, -0.575f, 4.776f, -0.575f)
                curveToRelative(1.798f, 0.0f, 3.493f, 0.207f, 4.768f, 0.574f)
                curveToRelative(1.274f, 0.367f, 1.994f, 0.852f, 2.154f, 1.426f)
                curveToRelative(0.0f, 0.0f, -0.012f, 0.009f, -0.012f, 0.017f)
                curveToRelative(-0.215f, 0.53f, -0.944f, 0.986f, -2.134f, 1.328f)
                curveToRelative(-1.283f, 0.367f, -2.97f, 0.574f, -4.768f, 0.574f)
                curveToRelative(-1.795f, 0.003f, -3.481f, -0.205f, -4.764f, -0.571f)
                close()
                moveTo(17.386f, 6.235f)
                curveToRelative(0.816f, -0.232f, 1.451f, -0.52f, 1.92f, -0.88f)
                verticalLineToRelative(3.947f)
                curveToRelative(-0.236f, 0.423f, -0.928f, 0.978f, -2.191f, 1.348f)
                curveToRelative(-1.275f, 0.367f, -2.97f, 0.566f, -4.768f, 0.566f)
                curveToRelative(-1.798f, 0.0f, -3.481f, -0.196f, -4.767f, -0.566f)
                curveToRelative(-1.143f, -0.334f, -1.967f, -0.835f, -2.219f, -1.336f)
                lineTo(5.361f, 5.339f)
                curveToRelative(0.468f, 0.358f, 1.115f, 0.664f, 1.95f, 0.896f)
                curveToRelative(1.367f, 0.395f, 3.157f, 0.61f, 5.036f, 0.61f)
                curveToRelative(1.883f, -0.002f, 3.673f, -0.218f, 5.04f, -0.61f)
                close()
                moveTo(12.347f, 12.109f)
                curveToRelative(1.891f, 0.0f, 3.681f, -0.215f, 5.04f, -0.61f)
                curveToRelative(0.767f, -0.216f, 1.422f, -0.521f, 1.918f, -0.888f)
                verticalLineToRelative(3.983f)
                curveToRelative(-0.235f, 0.423f, -0.927f, 0.977f, -2.19f, 1.344f)
                curveToRelative(-1.275f, 0.367f, -2.97f, 0.575f, -4.768f, 0.575f)
                curveToRelative(-1.798f, 0.0f, -3.484f, -0.208f, -4.767f, -0.575f)
                curveToRelative(-1.143f, -0.33f, -1.967f, -0.826f, -2.219f, -1.336f)
                verticalLineToRelative(-3.98f)
                curveToRelative(0.499f, 0.35f, 1.152f, 0.655f, 1.95f, 0.88f)
                curveToRelative(1.367f, 0.392f, 3.154f, 0.607f, 5.036f, 0.607f)
                close()
                moveTo(12.347f, 17.409f)
                curveToRelative(1.891f, 0.0f, 3.681f, -0.216f, 5.04f, -0.61f)
                curveToRelative(0.767f, -0.216f, 1.422f, -0.53f, 1.918f, -0.897f)
                verticalLineToRelative(3.54f)
                curveToRelative(0.0f, 0.7f, -0.74f, 1.275f, -2.201f, 1.695f)
                curveToRelative(-1.283f, 0.37f, -2.978f, 0.574f, -4.768f, 0.574f)
                curveToRelative(-1.787f, 0.0f, -3.482f, -0.207f, -4.776f, -0.574f)
                curveToRelative(-1.46f, -0.423f, -2.201f, -0.994f, -2.201f, -1.694f)
                lineTo(5.359f, 15.91f)
                curveToRelative(0.487f, 0.35f, 1.15f, 0.653f, 1.95f, 0.888f)
                curveToRelative(1.369f, 0.395f, 3.156f, 0.61f, 5.038f, 0.61f)
                close()
            }
        }
        .build()
        return _dataFilled!!
    }

private var _dataFilled: ImageVector? = null
