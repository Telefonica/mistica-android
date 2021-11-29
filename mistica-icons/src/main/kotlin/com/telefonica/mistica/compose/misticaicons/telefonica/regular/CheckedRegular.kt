package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.CheckedRegular: ImageVector
    get() {
        if (_checkedRegular != null) {
            return _checkedRegular!!
        }
        _checkedRegular = Builder(name = "CheckedRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.997f, 1.0f)
                curveToRelative(3.495f, 0.0f, 6.213f, 0.912f, 8.081f, 2.711f)
                curveTo(22.018f, 5.58f, 23.0f, 8.37f, 23.0f, 12.001f)
                curveToRelative(0.0f, 3.633f, -0.984f, 6.42f, -2.922f, 8.288f)
                curveTo(18.21f, 22.088f, 15.492f, 23.0f, 11.997f, 23.0f)
                curveToRelative(-3.495f, 0.0f, -6.213f, -0.912f, -8.079f, -2.711f)
                curveTo(1.981f, 18.424f, 1.0f, 15.637f, 1.0f, 12.005f)
                curveToRelative(0.0f, -3.633f, 0.981f, -6.423f, 2.918f, -8.29f)
                curveTo(5.784f, 1.914f, 8.505f, 1.0f, 11.997f, 1.0f)
                close()
                moveTo(11.997f, 2.22f)
                curveToRelative(-6.49f, 0.0f, -9.78f, 3.29f, -9.78f, 9.785f)
                curveToRelative(0.0f, 6.488f, 3.29f, 9.779f, 9.78f, 9.779f)
                curveToRelative(6.492f, 0.0f, 9.787f, -3.291f, 9.787f, -9.78f)
                curveToRelative(0.0f, -6.49f, -3.295f, -9.785f, -9.787f, -9.785f)
                close()
                moveTo(17.197f, 7.18f)
                arcToRelative(0.575f, 0.575f, 0.0f, false, true, 0.116f, 0.806f)
                lineToRelative(-6.45f, 8.639f)
                arcToRelative(0.572f, 0.572f, 0.0f, false, true, -0.452f, 0.232f)
                horizontalLineToRelative(-0.013f)
                arcToRelative(0.575f, 0.575f, 0.0f, false, true, -0.451f, -0.217f)
                lineToRelative(-2.953f, -3.71f)
                arcToRelative(0.577f, 0.577f, 0.0f, false, true, 0.09f, -0.81f)
                arcToRelative(0.577f, 0.577f, 0.0f, false, true, 0.81f, 0.092f)
                lineToRelative(2.488f, 3.128f)
                lineToRelative(6.01f, -8.043f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, 0.805f, -0.116f)
                close()
            }
        }
        .build()
        return _checkedRegular!!
    }

private var _checkedRegular: ImageVector? = null
