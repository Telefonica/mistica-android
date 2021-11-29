package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.DataShieldRegular: ImageVector
    get() {
        if (_dataShieldRegular != null) {
            return _dataShieldRegular!!
        }
        _dataShieldRegular = Builder(name = "DataShieldRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.74f, 4.747f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, false, -0.74f, 0.747f)
                curveToRelative(0.0f, 0.412f, 0.332f, 0.748f, 0.74f, 0.748f)
                curveToRelative(2.261f, 0.0f, 4.073f, 1.835f, 4.073f, 4.115f)
                curveToRelative(0.0f, 0.412f, 0.332f, 0.748f, 0.74f, 0.748f)
                curveToRelative(0.407f, 0.0f, 0.74f, -0.336f, 0.74f, -0.748f)
                curveToRelative(0.004f, -3.104f, -2.476f, -5.61f, -5.553f, -5.61f)
                close()
                moveTo(12.74f, 1.0f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, false, -0.74f, 0.747f)
                curveToRelative(0.0f, 0.412f, 0.332f, 0.748f, 0.74f, 0.748f)
                curveToRelative(4.296f, 0.0f, 7.78f, 3.517f, 7.78f, 7.862f)
                curveToRelative(0.0f, 0.412f, 0.333f, 0.748f, 0.74f, 0.748f)
                curveToRelative(0.408f, 0.0f, 0.74f, -0.336f, 0.74f, -0.748f)
                curveTo(22.005f, 5.197f, 17.851f, 1.0f, 12.74f, 1.0f)
                close()
                moveTo(8.814f, 6.73f)
                lineToRelative(-0.702f, -0.637f)
                lineToRelative(-0.669f, 0.599f)
                curveTo(7.405f, 6.692f, 5.48f, 8.489f, 3.0f, 8.489f)
                lineTo(2.0f, 8.489f)
                verticalLineToRelative(7.599f)
                curveToRelative(0.0f, 3.483f, 3.186f, 4.978f, 5.595f, 5.763f)
                lineToRelative(0.517f, 0.149f)
                lineToRelative(0.517f, -0.149f)
                curveToRelative(2.408f, -0.785f, 5.595f, -2.285f, 5.595f, -5.763f)
                verticalLineToRelative(-7.6f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.485f, 0.0f, -4.41f, -1.758f, -4.41f, -1.758f)
                close()
                moveTo(12.74f, 16.088f)
                curveToRelative(0.0f, 1.945f, -1.409f, 3.296f, -4.595f, 4.34f)
                lineTo(8.074f, 20.428f)
                curveToRelative(-3.186f, -1.049f, -4.595f, -2.395f, -4.595f, -4.34f)
                verticalLineToRelative(-6.1f)
                curveTo(5.665f, 9.84f, 7.405f, 8.68f, 8.112f, 8.115f)
                curveToRelative(0.702f, 0.56f, 2.447f, 1.72f, 4.632f, 1.873f)
                verticalLineToRelative(6.1f)
                horizontalLineToRelative(-0.004f)
                close()
                moveTo(6.443f, 17.51f)
                lineToRelative(-2.257f, -2.286f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, 0.0f, -0.786f)
                arcToRelative(0.532f, 0.532f, 0.0f, false, true, 0.777f, 0.0f)
                lineToRelative(1.447f, 1.462f)
                lineToRelative(4.41f, -4.456f)
                arcToRelative(0.532f, 0.532f, 0.0f, false, true, 0.777f, 0.0f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, 0.0f, 0.786f)
                lineToRelative(-5.154f, 5.28f)
                close()
            }
        }
        .build()
        return _dataShieldRegular!!
    }

private var _dataShieldRegular: ImageVector? = null
