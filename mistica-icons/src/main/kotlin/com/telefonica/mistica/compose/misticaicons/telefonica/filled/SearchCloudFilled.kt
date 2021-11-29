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

public val FilledGroup.SearchCloudFilled: ImageVector
    get() {
        if (_searchCloudFilled != null) {
            return _searchCloudFilled!!
        }
        _searchCloudFilled = Builder(name = "SearchCloudFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.801f, 17.815f)
                arcToRelative(3.468f, 3.468f, 0.0f, false, true, -3.462f, -3.462f)
                arcToRelative(3.467f, 3.467f, 0.0f, false, true, 3.462f, -3.465f)
                arcToRelative(3.463f, 3.463f, 0.0f, false, true, 0.0f, 6.927f)
                close()
                moveTo(16.421f, 16.215f)
                curveToRelative(2.428f, 0.0f, 5.265f, -1.372f, 5.265f, -5.24f)
                curveToRelative(0.0f, -3.521f, -2.33f, -4.975f, -4.655f, -5.19f)
                curveTo(15.787f, 2.187f, 11.745f, 2.0f, 10.92f, 2.0f)
                curveToRelative(-1.061f, 0.0f, -6.274f, 0.289f, -6.464f, 5.908f)
                curveTo(3.387f, 8.336f, 2.0f, 9.384f, 2.0f, 11.91f)
                curveToRelative(0.0f, 2.468f, 1.426f, 4.09f, 3.874f, 4.34f)
                lineToRelative(1.658f, -0.004f)
                arcToRelative(4.635f, 4.635f, 0.0f, false, false, 4.241f, 2.788f)
                curveToRelative(1.022f, 0.0f, 1.97f, -0.342f, 2.737f, -0.908f)
                curveToRelative(0.005f, 0.006f, 0.008f, 0.017f, 0.014f, 0.022f)
                lineToRelative(3.336f, 3.365f)
                curveToRelative(0.232f, 0.235f, 0.61f, 0.238f, 0.846f, 0.005f)
                lineToRelative(0.005f, -0.005f)
                arcToRelative(0.609f, 0.609f, 0.0f, false, false, 0.0f, -0.858f)
                lineToRelative(-3.33f, -3.364f)
                curveToRelative(0.26f, -0.325f, 0.479f, -0.686f, 0.644f, -1.073f)
                lineToRelative(0.395f, -0.002f)
                close()
            }
        }
        .build()
        return _searchCloudFilled!!
    }

private var _searchCloudFilled: ImageVector? = null
