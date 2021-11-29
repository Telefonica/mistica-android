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

public val RegularGroup.FileBoxRegular: ImageVector
    get() {
        if (_fileBoxRegular != null) {
            return _fileBoxRegular!!
        }
        _fileBoxRegular = Builder(name = "FileBoxRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.263f, 20.429f)
                lineTo(3.482f, 20.429f)
                arcToRelative(0.202f, 0.202f, 0.0f, false, true, -0.196f, -0.197f)
                verticalLineToRelative(-7.128f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.196f, -0.19f)
                horizontalLineToRelative(5.546f)
                verticalLineToRelative(0.237f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, false, 2.748f, 2.751f)
                horizontalLineToRelative(0.193f)
                arcToRelative(2.754f, 2.754f, 0.0f, false, false, 2.75f, -2.75f)
                verticalLineToRelative(-0.239f)
                horizontalLineToRelative(5.547f)
                curveToRelative(0.112f, 0.0f, 0.177f, 0.081f, 0.19f, 0.137f)
                lineToRelative(0.006f, 7.185f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.199f, 0.194f)
                close()
                moveTo(4.88f, 3.557f)
                arcToRelative(0.673f, 0.673f, 0.0f, false, false, 0.008f, -0.103f)
                curveToRelative(0.0f, -0.107f, 0.087f, -0.193f, 0.193f, -0.193f)
                lineToRelative(13.58f, 0.014f)
                curveToRelative(0.132f, 0.0f, 0.258f, 0.145f, 0.294f, 0.327f)
                lineToRelative(1.277f, 8.048f)
                horizontalLineToRelative(-6.14f)
                arcToRelative(0.629f, 0.629f, 0.0f, false, false, -0.627f, 0.63f)
                verticalLineToRelative(0.866f)
                curveToRelative(0.0f, 0.823f, -0.67f, 1.49f, -1.496f, 1.49f)
                horizontalLineToRelative(-0.193f)
                curveToRelative(-0.824f, 0.0f, -1.493f, -0.67f, -1.493f, -1.49f)
                verticalLineToRelative(-0.866f)
                curveToRelative(0.0f, -0.347f, -0.28f, -0.63f, -0.628f, -0.63f)
                lineTo(3.521f, 11.65f)
                lineTo(4.88f, 3.557f)
                close()
                moveTo(21.703f, 12.994f)
                curveToRelative(-0.003f, -0.02f, 0.006f, -0.033f, 0.003f, -0.053f)
                lineTo(20.19f, 3.392f)
                curveToRelative(-0.148f, -0.81f, -0.775f, -1.375f, -1.529f, -1.375f)
                lineToRelative(-13.58f, -0.014f)
                curveToRelative(-0.778f, 0.0f, -1.417f, 0.619f, -1.448f, 1.395f)
                lineTo(2.04f, 12.874f)
                curveToRelative(-0.003f, 0.025f, 0.003f, 0.05f, 0.003f, 0.076f)
                curveToRelative(-0.006f, 0.05f, -0.017f, 0.1f, -0.017f, 0.154f)
                verticalLineToRelative(7.128f)
                curveToRelative(0.0f, 0.804f, 0.65f, 1.457f, 1.451f, 1.457f)
                horizontalLineToRelative(16.787f)
                curveToRelative(0.801f, 0.0f, 1.451f, -0.653f, 1.451f, -1.457f)
                verticalLineToRelative(-7.128f)
                curveToRelative(0.0f, -0.04f, -0.008f, -0.076f, -0.01f, -0.11f)
                close()
            }
        }
        .build()
        return _fileBoxRegular!!
    }

private var _fileBoxRegular: ImageVector? = null
