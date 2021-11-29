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

public val RegularGroup.EditPaperRegular: ImageVector
    get() {
        if (_editPaperRegular != null) {
            return _editPaperRegular!!
        }
        _editPaperRegular = Builder(name = "EditPaperRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.627f, 5.807f)
                curveToRelative(-0.308f, 0.302f, -5.226f, 4.652f, -6.112f, 5.46f)
                lineToRelative(-2.65f, 0.873f)
                lineToRelative(0.866f, -2.58f)
                curveToRelative(0.6f, -0.53f, 5.826f, -5.134f, 6.168f, -5.473f)
                curveToRelative(0.63f, -0.628f, 1.398f, -0.334f, 1.731f, 0.0f)
                curveToRelative(0.227f, 0.23f, 0.37f, 0.566f, 0.367f, 0.885f)
                curveToRelative(0.0f, 0.317f, -0.134f, 0.619f, -0.37f, 0.835f)
                close()
                moveTo(17.992f, 17.677f)
                curveToRelative(0.0f, 0.743f, -0.2f, 1.298f, -0.614f, 1.698f)
                curveToRelative(-0.448f, 0.434f, -1.137f, 0.653f, -2.045f, 0.653f)
                lineTo(6.345f, 20.028f)
                curveToRelative(-0.908f, 0.0f, -1.597f, -0.219f, -2.045f, -0.653f)
                curveToRelative(-0.412f, -0.397f, -0.614f, -0.952f, -0.614f, -1.694f)
                lineTo(3.686f, 7.356f)
                curveToRelative(0.0f, -1.98f, 1.446f, -2.398f, 2.659f, -2.398f)
                horizontalLineToRelative(8.05f)
                curveToRelative(-1.115f, 0.989f, -2.496f, 2.207f, -3.826f, 3.378f)
                curveToRelative(-0.19f, 0.168f, -0.334f, 0.384f, -0.415f, 0.628f)
                lineToRelative(-1.04f, 3.09f)
                arcToRelative(1.445f, 1.445f, 0.0f, false, false, 1.83f, 1.837f)
                lineToRelative(3.112f, -1.025f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, false, 0.496f, -0.286f)
                curveToRelative(0.03f, -0.028f, 1.793f, -1.583f, 3.442f, -3.045f)
                curveToRelative(-0.002f, -0.003f, -0.002f, 8.143f, -0.002f, 8.143f)
                close()
                moveTo(21.686f, 4.975f)
                arcToRelative(2.995f, 2.995f, 0.0f, false, false, -0.863f, -2.084f)
                curveToRelative(-1.01f, -1.011f, -2.826f, -1.286f, -4.117f, 0.0f)
                curveToRelative(-0.042f, 0.042f, -0.196f, 0.182f, -0.434f, 0.395f)
                arcToRelative(26.211f, 26.211f, 0.0f, false, false, -0.939f, -0.017f)
                lineTo(6.345f, 3.269f)
                curveTo(3.705f, 3.272f, 2.0f, 4.874f, 2.0f, 7.356f)
                verticalLineToRelative(10.322f)
                curveToRelative(0.0f, 1.207f, 0.378f, 2.188f, 1.129f, 2.907f)
                curveToRelative(0.776f, 0.751f, 1.857f, 1.13f, 3.218f, 1.13f)
                horizontalLineToRelative(8.99f)
                curveToRelative(1.358f, 0.0f, 2.442f, -0.379f, 3.218f, -1.127f)
                curveToRelative(0.747f, -0.722f, 1.128f, -1.7f, 1.128f, -2.91f)
                lineToRelative(-0.008f, -9.644f)
                curveToRelative(0.6f, -0.535f, 1.036f, -0.928f, 1.137f, -1.026f)
                curveToRelative(0.558f, -0.529f, 0.871f, -1.263f, 0.874f, -2.033f)
                close()
            }
        }
        .build()
        return _editPaperRegular!!
    }

private var _editPaperRegular: ImageVector? = null
