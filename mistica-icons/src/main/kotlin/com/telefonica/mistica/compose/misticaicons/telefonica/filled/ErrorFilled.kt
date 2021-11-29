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

public val FilledGroup.ErrorFilled: ImageVector
    get() {
        if (_errorFilled != null) {
            return _errorFilled!!
        }
        _errorFilled = Builder(name = "ErrorFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.025f, 14.868f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, -0.613f, -0.616f)
                lineTo(8.412f, 9.78f)
                arcToRelative(0.614f, 0.614f, 0.0f, true, true, 1.227f, 0.0f)
                verticalLineToRelative(4.473f)
                arcToRelative(0.614f, 0.614f, 0.0f, false, true, -0.614f, 0.616f)
                close()
                moveTo(9.031f, 16.476f)
                arcToRelative(0.644f, 0.644f, 0.0f, false, true, 0.0f, -1.288f)
                arcToRelative(0.644f, 0.644f, 0.0f, false, true, 0.0f, 1.288f)
                close()
                moveTo(18.305f, 7.779f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-4.91f, -4.773f)
                verticalLineToRelative(2.297f)
                curveToRelative(0.0f, 0.73f, 0.247f, 1.35f, 0.695f, 1.795f)
                curveToRelative(0.456f, 0.44f, 1.103f, 0.68f, 1.865f, 0.68f)
                close()
                moveTo(7.238f, 17.636f)
                lineToRelative(7.294f, 0.033f)
                lineTo(9.0f, 6.485f)
                lineToRelative(-2.154f, 4.28f)
                lineToRelative(-3.462f, 6.862f)
                lineToRelative(3.462f, 0.009f)
                horizontalLineToRelative(0.392f)
                close()
                moveTo(21.653f, 7.703f)
                arcToRelative(0.794f, 0.794f, 0.0f, false, true, 0.033f, 0.182f)
                verticalLineToRelative(12.6f)
                curveToRelative(0.0f, 0.65f, -0.566f, 1.201f, -1.227f, 1.201f)
                lineTo(8.067f, 21.686f)
                curveToRelative(-0.647f, 0.0f, -1.218f, -0.56f, -1.218f, -1.201f)
                lineTo(6.849f, 18.87f)
                lineToRelative(-3.855f, -0.008f)
                horizontalLineToRelative(-0.008f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.983f, -0.98f)
                curveToRelative(0.0f, -0.174f, 0.042f, -0.337f, 0.115f, -0.485f)
                lineToRelative(4.73f, -9.364f)
                lineTo(6.848f, 3.21f)
                curveToRelative(0.0f, -0.633f, 0.58f, -1.21f, 1.22f, -1.21f)
                horizontalLineToRelative(7.545f)
                curveToRelative(0.073f, 0.0f, 0.163f, 0.017f, 0.247f, 0.05f)
                curveToRelative(0.008f, 0.0f, 0.017f, 0.0f, 0.017f, 0.009f)
                horizontalLineToRelative(0.017f)
                curveToRelative(0.056f, 0.017f, 0.145f, 0.09f, 0.196f, 0.14f)
                horizontalLineToRelative(0.008f)
                lineToRelative(0.417f, 0.412f)
                lineToRelative(4.97f, 4.832f)
                curveToRelative(0.072f, 0.072f, 0.114f, 0.14f, 0.14f, 0.198f)
                curveToRelative(0.008f, 0.009f, 0.008f, 0.017f, 0.016f, 0.034f)
                curveToRelative(-0.005f, 0.003f, 0.003f, 0.02f, 0.012f, 0.028f)
                close()
            }
        }
        .build()
        return _errorFilled!!
    }

private var _errorFilled: ImageVector? = null
