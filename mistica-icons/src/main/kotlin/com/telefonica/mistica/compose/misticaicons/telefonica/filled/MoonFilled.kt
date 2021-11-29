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

public val FilledGroup.MoonFilled: ImageVector
    get() {
        if (_moonFilled != null) {
            return _moonFilled!!
        }
        _moonFilled = Builder(name = "MoonFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.281f, 16.23f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, false, -0.493f, -0.056f)
                curveToRelative(-1.431f, 0.812f, -2.972f, 0.96f, -3.77f, 0.98f)
                curveToRelative(-0.2f, 0.008f, -0.448f, 0.008f, -0.673f, 0.008f)
                curveToRelative(-1.605f, -0.022f, -6.837f, -0.616f, -6.837f, -7.17f)
                curveToRelative(0.0f, -4.835f, 2.793f, -6.446f, 5.134f, -6.947f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.01f, -0.824f)
                arcToRelative(11.651f, 11.651f, 0.0f, false, false, -1.796f, -0.187f)
                lineToRelative(-0.897f, -0.009f)
                curveToRelative(-2.201f, 0.031f, -9.389f, 0.82f, -9.389f, 9.818f)
                curveToRelative(0.0f, 1.622f, 0.457f, 9.723f, 9.457f, 9.871f)
                curveToRelative(0.296f, 0.0f, 0.616f, 0.0f, 0.874f, -0.008f)
                curveToRelative(1.462f, -0.023f, 6.394f, -0.457f, 8.495f, -4.992f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, false, -0.095f, -0.484f)
            }
        }
        .build()
        return _moonFilled!!
    }

private var _moonFilled: ImageVector? = null
