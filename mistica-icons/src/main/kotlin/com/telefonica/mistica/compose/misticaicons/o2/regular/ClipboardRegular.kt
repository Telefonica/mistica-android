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

public val RegularGroup.ClipboardRegular: ImageVector
    get() {
        if (_clipboardRegular != null) {
            return _clipboardRegular!!
        }
        _clipboardRegular = Builder(name = "ClipboardRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.418f, 14.2f)
                lineTo(8.582f, 14.2f)
                curveToRelative(-0.27f, 0.0f, -0.51f, 0.24f, -0.51f, 0.508f)
                curveToRelative(0.0f, 0.27f, 0.24f, 0.508f, 0.51f, 0.508f)
                horizontalLineToRelative(7.84f)
                curveToRelative(0.27f, 0.0f, 0.51f, -0.238f, 0.51f, -0.508f)
                curveToRelative(0.0f, -0.269f, -0.24f, -0.508f, -0.514f, -0.508f)
                close()
                moveTo(16.418f, 11.486f)
                lineTo(8.582f, 11.486f)
                curveToRelative(-0.27f, 0.0f, -0.51f, 0.239f, -0.51f, 0.508f)
                curveToRelative(0.0f, 0.27f, 0.24f, 0.508f, 0.51f, 0.508f)
                horizontalLineToRelative(7.84f)
                curveToRelative(0.27f, 0.0f, 0.51f, -0.239f, 0.51f, -0.508f)
                curveToRelative(0.0f, -0.27f, -0.24f, -0.508f, -0.514f, -0.508f)
                close()
                moveTo(16.418f, 8.772f)
                lineTo(8.582f, 8.772f)
                curveToRelative(-0.27f, 0.0f, -0.51f, 0.239f, -0.51f, 0.508f)
                reflectiveCurveToRelative(0.24f, 0.508f, 0.51f, 0.508f)
                horizontalLineToRelative(7.84f)
                curveToRelative(0.27f, 0.0f, 0.51f, -0.239f, 0.51f, -0.508f)
                curveToRelative(0.0f, -0.27f, -0.24f, -0.508f, -0.514f, -0.508f)
                close()
                moveTo(16.418f, 16.915f)
                lineTo(8.582f, 16.915f)
                curveToRelative(-0.27f, 0.0f, -0.51f, 0.238f, -0.51f, 0.508f)
                curveToRelative(0.0f, 0.269f, 0.24f, 0.508f, 0.51f, 0.508f)
                horizontalLineToRelative(7.84f)
                curveToRelative(0.27f, 0.0f, 0.51f, -0.24f, 0.51f, -0.508f)
                curveToRelative(0.0f, -0.27f, -0.24f, -0.508f, -0.514f, -0.508f)
                close()
                moveTo(17.954f, 4.02f)
                horizontalLineToRelative(-1.706f)
                lineTo(16.248f, 3.0f)
                lineTo(8.752f, 3.0f)
                verticalLineToRelative(1.016f)
                lineTo(7.046f, 4.016f)
                arcTo(2.047f, 2.047f, 0.0f, false, false, 5.0f, 6.053f)
                lineTo(5.0f, 22.0f)
                horizontalLineToRelative(15.0f)
                lineTo(20.0f, 6.057f)
                curveToRelative(0.0f, -1.12f, -0.92f, -2.036f, -2.046f, -2.036f)
                close()
                moveTo(9.738f, 4.02f)
                horizontalLineToRelative(5.489f)
                verticalLineToRelative(1.698f)
                lineTo(9.738f, 5.718f)
                lineTo(9.738f, 4.02f)
                close()
                moveTo(18.634f, 20.644f)
                lineTo(6.366f, 20.644f)
                lineTo(6.366f, 6.057f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, true, 0.68f, -0.677f)
                horizontalLineToRelative(1.706f)
                verticalLineToRelative(1.355f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-1.36f)
                horizontalLineToRelative(1.702f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, true, 0.68f, 0.678f)
                verticalLineToRelative(14.592f)
                close()
            }
        }
        .build()
        return _clipboardRegular!!
    }

private var _clipboardRegular: ImageVector? = null
