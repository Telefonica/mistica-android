package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.ClipboardFilled: ImageVector
    get() {
        if (_clipboardFilled != null) {
            return _clipboardFilled!!
        }
        _clipboardFilled = Builder(name = "ClipboardFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.637f, 5.718f)
                horizontalLineToRelative(0.27f)
                lineTo(15.907f, 3.0f)
                lineTo(9.093f, 3.0f)
                verticalLineToRelative(2.714f)
                horizontalLineToRelative(6.545f)
                verticalLineToRelative(0.004f)
                close()
                moveTo(17.954f, 4.02f)
                horizontalLineToRelative(-1.021f)
                verticalLineToRelative(2.714f)
                lineTo(8.067f, 6.734f)
                lineTo(8.067f, 4.02f)
                horizontalLineToRelative(-1.02f)
                arcTo(2.047f, 2.047f, 0.0f, false, false, 5.0f, 6.057f)
                lineTo(5.0f, 22.0f)
                horizontalLineToRelative(15.0f)
                lineTo(20.0f, 6.057f)
                curveToRelative(0.0f, -1.12f, -0.92f, -2.037f, -2.046f, -2.037f)
                close()
                moveTo(16.418f, 18.266f)
                lineTo(8.582f, 18.266f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, -0.51f, -0.508f)
                curveToRelative(0.0f, -0.27f, 0.24f, -0.508f, 0.51f, -0.508f)
                horizontalLineToRelative(7.84f)
                curveToRelative(0.27f, 0.0f, 0.51f, 0.239f, 0.51f, 0.508f)
                curveToRelative(0.0f, 0.27f, -0.24f, 0.508f, -0.514f, 0.508f)
                close()
                moveTo(16.418f, 15.552f)
                lineTo(8.582f, 15.552f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, -0.51f, -0.508f)
                curveToRelative(0.0f, -0.269f, 0.24f, -0.508f, 0.51f, -0.508f)
                horizontalLineToRelative(7.84f)
                curveToRelative(0.27f, 0.0f, 0.51f, 0.24f, 0.51f, 0.508f)
                curveToRelative(0.0f, 0.27f, -0.24f, 0.508f, -0.514f, 0.508f)
                close()
                moveTo(16.418f, 12.839f)
                lineTo(8.582f, 12.839f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, -0.51f, -0.508f)
                curveToRelative(0.0f, -0.27f, 0.24f, -0.508f, 0.51f, -0.508f)
                horizontalLineToRelative(7.84f)
                curveToRelative(0.27f, 0.0f, 0.51f, 0.238f, 0.51f, 0.508f)
                curveToRelative(0.0f, 0.269f, -0.24f, 0.508f, -0.514f, 0.508f)
                close()
                moveTo(16.418f, 10.125f)
                lineTo(8.582f, 10.125f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, true, -0.51f, -0.508f)
                curveToRelative(0.0f, -0.27f, 0.24f, -0.508f, 0.51f, -0.508f)
                horizontalLineToRelative(7.84f)
                curveToRelative(0.27f, 0.0f, 0.51f, 0.239f, 0.51f, 0.508f)
                curveToRelative(0.0f, 0.27f, -0.24f, 0.508f, -0.514f, 0.508f)
                close()
            }
        }
        .build()
        return _clipboardFilled!!
    }

private var _clipboardFilled: ImageVector? = null
