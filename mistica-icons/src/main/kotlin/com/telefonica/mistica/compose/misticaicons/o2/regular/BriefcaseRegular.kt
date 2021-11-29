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

public val RegularGroup.BriefcaseRegular: ImageVector
    get() {
        if (_briefcaseRegular != null) {
            return _briefcaseRegular!!
        }
        _briefcaseRegular = Builder(name = "BriefcaseRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.693f, 5.167f)
                horizontalLineToRelative(-3.885f)
                curveTo(15.575f, 3.387f, 13.962f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-1.962f, 0.0f, -3.616f, 1.388f, -3.808f, 3.167f)
                lineTo(4.307f, 5.167f)
                curveTo(3.04f, 5.167f, 2.0f, 6.237f, 2.0f, 7.542f)
                verticalLineToRelative(11.084f)
                curveTo(2.0f, 19.93f, 3.04f, 21.0f, 4.307f, 21.0f)
                horizontalLineToRelative(15.386f)
                curveTo(20.96f, 21.0f, 22.0f, 19.93f, 22.0f, 18.626f)
                lineTo(22.0f, 7.542f)
                curveToRelative(0.0f, -1.305f, -1.04f, -2.375f, -2.307f, -2.375f)
                close()
                moveTo(12.0f, 3.586f)
                curveToRelative(1.116f, 0.0f, 2.039f, 0.673f, 2.267f, 1.585f)
                lineTo(9.73f, 5.171f)
                curveTo(9.96f, 4.26f, 10.884f, 3.586f, 12.0f, 3.586f)
                close()
                moveTo(4.307f, 6.749f)
                horizontalLineToRelative(15.386f)
                curveToRelative(0.421f, 0.0f, 0.77f, 0.355f, 0.77f, 0.793f)
                verticalLineToRelative(3.167f)
                lineTo(3.537f, 10.709f)
                lineTo(3.537f, 7.542f)
                curveToRelative(0.0f, -0.434f, 0.345f, -0.793f, 0.77f, -0.793f)
                close()
                moveTo(19.693f, 19.419f)
                lineTo(4.307f, 19.419f)
                arcToRelative(0.785f, 0.785f, 0.0f, false, true, -0.77f, -0.793f)
                lineTo(3.537f, 12.29f)
                horizontalLineToRelative(16.922f)
                verticalLineToRelative(6.33f)
                arcToRelative(0.777f, 0.777f, 0.0f, false, true, -0.766f, 0.797f)
                close()
            }
        }
        .build()
        return _briefcaseRegular!!
    }

private var _briefcaseRegular: ImageVector? = null
