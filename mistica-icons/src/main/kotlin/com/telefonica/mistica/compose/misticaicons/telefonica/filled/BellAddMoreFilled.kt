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

public val FilledGroup.BellAddMoreFilled: ImageVector
    get() {
        if (_bellAddMoreFilled != null) {
            return _bellAddMoreFilled!!
        }
        _bellAddMoreFilled = Builder(name = "BellAddMoreFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.218f, 11.134f)
                curveToRelative(0.0f, 3.636f, 2.519f, 4.216f, 4.02f, 4.23f)
                horizontalLineToRelative(0.457f)
                curveToRelative(1.51f, -0.022f, 4.028f, -0.61f, 4.028f, -4.199f)
                curveToRelative(0.0f, -3.594f, -2.54f, -4.19f, -4.054f, -4.23f)
                lineTo(7.19f, 6.935f)
                curveToRelative(-1.487f, 0.009f, -3.972f, 0.572f, -3.972f, 4.2f)
                close()
                moveTo(21.468f, 17.714f)
                curveToRelative(0.196f, 0.16f, 0.269f, 0.434f, 0.187f, 0.678f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, -0.577f, 0.395f)
                horizontalLineToRelative(-5.24f)
                curveToRelative(-0.04f, 0.546f, -0.197f, 1.359f, -0.762f, 1.995f)
                curveToRelative(-0.544f, 0.602f, -1.325f, 0.907f, -2.306f, 0.907f)
                curveToRelative(-0.991f, 0.0f, -1.77f, -0.305f, -2.313f, -0.907f)
                curveToRelative(-0.569f, -0.636f, -0.723f, -1.449f, -0.754f, -1.995f)
                lineTo(4.465f, 18.787f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, -0.392f, -1.07f)
                curveToRelative(0.462f, -0.37f, 0.846f, -0.885f, 1.145f, -1.496f)
                curveTo(3.706f, 15.678f, 2.0f, 14.367f, 2.0f, 11.134f)
                curveToRelative(0.0f, -4.198f, 2.843f, -5.148f, 4.42f, -5.347f)
                curveToRelative(1.532f, -3.885f, 5.927f, -3.807f, 6.35f, -3.781f)
                curveToRelative(0.373f, -0.017f, 3.014f, -0.09f, 4.93f, 1.68f)
                curveToRelative(1.283f, 1.182f, 1.933f, 2.897f, 1.933f, 5.093f)
                verticalLineToRelative(3.804f)
                curveToRelative(0.0f, 0.061f, -0.188f, 3.498f, 1.835f, 5.131f)
                close()
                moveTo(8.076f, 13.846f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.611f, 0.602f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, true, -0.608f, -0.602f)
                verticalLineToRelative(-2.107f)
                lineTo(4.742f, 11.739f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 0.0f, -1.207f)
                lineTo(6.86f, 10.532f)
                lineTo(6.86f, 8.457f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, 0.608f, -0.603f)
                curveToRelative(0.336f, 0.0f, 0.61f, 0.27f, 0.61f, 0.603f)
                verticalLineToRelative(2.075f)
                horizontalLineToRelative(2.12f)
                curveToRelative(0.337f, 0.0f, 0.609f, 0.272f, 0.609f, 0.605f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.608f, 0.605f)
                horizontalLineToRelative(-2.12f)
                verticalLineToRelative(2.104f)
                horizontalLineToRelative(-0.003f)
                close()
            }
        }
        .build()
        return _bellAddMoreFilled!!
    }

private var _bellAddMoreFilled: ImageVector? = null
