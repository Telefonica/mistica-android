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

public val RegularGroup.EmergencyCrossRegular: ImageVector
    get() {
        if (_emergencyCrossRegular != null) {
            return _emergencyCrossRegular!!
        }
        _emergencyCrossRegular = Builder(name = "EmergencyCrossRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.132f, 14.036f)
                lineToRelative(-5.46f, 0.003f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.602f, 0.602f)
                lineToRelative(0.003f, 5.463f)
                curveToRelative(0.0f, 0.21f, -0.135f, 0.36f, -0.177f, 0.378f)
                horizontalLineToRelative(-4.03f)
                curveToRelative(-0.056f, -0.017f, -0.188f, -0.168f, -0.188f, -0.378f)
                lineToRelative(-0.003f, -5.46f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.602f, -0.602f)
                lineToRelative(-5.462f, 0.003f)
                curveToRelative(-0.208f, 0.0f, -0.362f, -0.135f, -0.376f, -0.174f)
                verticalLineTo(9.838f)
                curveToRelative(0.017f, -0.054f, 0.171f, -0.188f, 0.378f, -0.188f)
                lineToRelative(5.457f, -0.003f)
                arcToRelative(0.601f, 0.601f, 0.0f, false, false, 0.602f, -0.602f)
                lineTo(9.67f, 3.583f)
                curveToRelative(0.0f, -0.188f, 0.14f, -0.359f, 0.177f, -0.379f)
                lineToRelative(4.017f, -0.002f)
                curveToRelative(0.061f, 0.02f, 0.201f, 0.19f, 0.201f, 0.378f)
                lineToRelative(0.003f, 5.456f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, 0.602f, 0.603f)
                lineToRelative(5.465f, -0.003f)
                curveToRelative(0.188f, 0.0f, 0.359f, 0.14f, 0.379f, 0.176f)
                lineToRelative(0.002f, 4.017f)
                curveToRelative(-0.025f, 0.065f, -0.196f, 0.207f, -0.383f, 0.207f)
                moveToRelative(0.0f, -5.599f)
                lineToRelative(-4.86f, 0.003f)
                lineToRelative(-0.003f, -4.855f)
                curveToRelative(0.0f, -0.826f, -0.658f, -1.582f, -1.381f, -1.582f)
                horizontalLineTo(9.843f)
                curveToRelative(-0.723f, 0.0f, -1.38f, 0.753f, -1.38f, 1.582f)
                lineToRelative(0.002f, 4.86f)
                lineToRelative(-4.854f, 0.003f)
                curveToRelative(-0.858f, 0.0f, -1.583f, 0.633f, -1.583f, 1.381f)
                lineToRelative(-0.003f, 4.045f)
                curveToRelative(0.0f, 0.748f, 0.723f, 1.38f, 1.583f, 1.38f)
                lineToRelative(4.86f, -0.002f)
                lineToRelative(0.003f, 4.857f)
                curveToRelative(0.0f, 0.857f, 0.633f, 1.583f, 1.38f, 1.583f)
                horizontalLineToRelative(4.045f)
                curveToRelative(0.748f, 0.0f, 1.381f, -0.726f, 1.381f, -1.583f)
                lineToRelative(-0.003f, -4.86f)
                lineToRelative(4.858f, -0.003f)
                curveToRelative(0.826f, 0.0f, 1.582f, -0.658f, 1.582f, -1.38f)
                verticalLineTo(9.82f)
                curveToRelative(0.0f, -0.726f, -0.753f, -1.384f, -1.582f, -1.384f)
            }
        }
        .build()
        return _emergencyCrossRegular!!
    }

private var _emergencyCrossRegular: ImageVector? = null
