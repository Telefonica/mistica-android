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

public val FilledGroup.FileBoxFilled: ImageVector
    get() {
        if (_fileBoxFilled != null) {
            return _fileBoxFilled!!
        }
        _fileBoxFilled = Builder(name = "FileBoxFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.062f, 11.653f)
                arcToRelative(0.629f, 0.629f, 0.0f, false, false, -0.628f, 0.63f)
                verticalLineToRelative(0.868f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, true, -1.496f, 1.49f)
                horizontalLineToRelative(-0.193f)
                curveToRelative(-0.823f, 0.0f, -1.49f, -0.666f, -1.493f, -1.49f)
                verticalLineToRelative(-0.868f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, false, -0.627f, -0.63f)
                lineTo(3.49f, 11.653f)
                lineTo(4.852f, 3.56f)
                arcToRelative(0.646f, 0.646f, 0.0f, false, false, 0.008f, -0.103f)
                curveToRelative(0.0f, -0.107f, 0.087f, -0.194f, 0.193f, -0.194f)
                lineToRelative(13.58f, 0.014f)
                curveToRelative(0.132f, 0.0f, 0.26f, 0.146f, 0.291f, 0.328f)
                lineToRelative(1.278f, 8.05f)
                horizontalLineToRelative(-6.14f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(21.675f, 12.994f)
                curveToRelative(0.0f, -0.02f, 0.003f, -0.033f, 0.003f, -0.053f)
                lineTo(20.162f, 3.39f)
                curveToRelative(-0.148f, -0.81f, -0.775f, -1.375f, -1.529f, -1.375f)
                lineTo(5.056f, 2.0f)
                curveToRelative(-0.779f, 0.0f, -1.417f, 0.619f, -1.451f, 1.395f)
                lineToRelative(-1.591f, 9.476f)
                curveToRelative(-0.006f, 0.025f, 0.003f, 0.05f, 0.003f, 0.076f)
                curveToRelative(-0.006f, 0.05f, -0.014f, 0.1f, -0.014f, 0.151f)
                verticalLineToRelative(7.132f)
                curveToRelative(0.0f, 0.804f, 0.652f, 1.456f, 1.45f, 1.456f)
                horizontalLineToRelative(16.782f)
                curveToRelative(0.801f, 0.0f, 1.451f, -0.652f, 1.451f, -1.456f)
                lineTo(21.686f, 13.1f)
                curveToRelative(0.0f, -0.033f, -0.008f, -0.072f, -0.01f, -0.106f)
                close()
            }
        }
        .build()
        return _fileBoxFilled!!
    }

private var _fileBoxFilled: ImageVector? = null
