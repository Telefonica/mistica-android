package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.FolderLight: ImageVector
    get() {
        if (_folderLight != null) {
            return _folderLight!!
        }
        _folderLight = Builder(name = "FolderLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.668f, 3.0f)
                curveToRelative(0.48f, 0.0f, 0.964f, 0.194f, 1.296f, 0.587f)
                lineToRelative(1.74f, 1.838f)
                curveToRelative(0.224f, 0.237f, 0.48f, 0.351f, 0.776f, 0.351f)
                horizontalLineToRelative(8.296f)
                curveToRelative(1.036f, 0.0f, 1.852f, 0.862f, 1.852f, 1.956f)
                verticalLineToRelative(8.214f)
                curveToRelative(0.0f, 0.237f, -0.148f, 0.393f, -0.372f, 0.393f)
                reflectiveCurveToRelative(-0.372f, -0.156f, -0.372f, -0.393f)
                verticalLineTo(7.694f)
                curveToRelative(0.0f, -0.663f, -0.48f, -1.174f, -1.112f, -1.174f)
                horizontalLineTo(11.52f)
                curveToRelative(-0.48f, 0.0f, -0.964f, -0.195f, -1.296f, -0.588f)
                lineTo(8.48f, 4.1f)
                curveToRelative(-0.224f, -0.237f, -0.48f, -0.351f, -0.776f, -0.351f)
                horizontalLineTo(3.852f)
                curveToRelative(-0.628f, 0.0f, -1.112f, 0.507f, -1.112f, 1.175f)
                verticalLineTo(20.18f)
                horizontalLineToRelative(18.52f)
                curveToRelative(0.224f, 0.0f, 0.372f, 0.157f, 0.372f, 0.393f)
                curveToRelative(0.0f, 0.237f, -0.152f, 0.427f, -0.372f, 0.427f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.956f)
                curveTo(2.0f, 3.862f, 2.816f, 3.0f, 3.852f, 3.0f)
                horizontalLineToRelative(3.816f)
                close()
                moveTo(21.26f, 17.476f)
                curveToRelative(0.409f, 0.0f, 0.74f, 0.35f, 0.74f, 0.782f)
                curveToRelative(0.0f, 0.431f, -0.331f, 0.781f, -0.74f, 0.781f)
                reflectiveCurveToRelative(-0.74f, -0.35f, -0.74f, -0.781f)
                curveToRelative(0.0f, -0.432f, 0.331f, -0.782f, 0.74f, -0.782f)
                close()
            }
        }
        .build()
        return _folderLight!!
    }

private var _folderLight: ImageVector? = null
