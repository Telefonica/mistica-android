package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.ListDocumentLight: ImageVector
    get() {
        if (_listDocumentLight != null) {
            return _listDocumentLight!!
        }
        _listDocumentLight = Builder(name = "ListDocumentLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.569f, 20.425f)
                lineTo(18.569f, 3.576f)
                curveToRelative(0.0f, -0.327f, -0.263f, -0.599f, -0.398f, -0.599f)
                lineTo(5.841f, 2.977f)
                curveToRelative(-0.135f, 0.0f, -0.398f, 0.272f, -0.398f, 0.6f)
                verticalLineToRelative(16.845f)
                curveToRelative(0.0f, 0.342f, 0.24f, 0.6f, 0.398f, 0.6f)
                lineToRelative(12.33f, 0.003f)
                curveToRelative(0.157f, -0.003f, 0.398f, -0.258f, 0.398f, -0.6f)
                close()
                moveTo(18.166f, 2.156f)
                curveToRelative(0.638f, 0.0f, 1.224f, 0.678f, 1.224f, 1.42f)
                verticalLineToRelative(16.85f)
                curveToRelative(0.0f, 0.755f, -0.572f, 1.417f, -1.224f, 1.417f)
                lineTo(5.849f, 21.84f)
                curveToRelative(-0.653f, 0.0f, -1.224f, -0.661f, -1.224f, -1.418f)
                lineTo(4.625f, 3.576f)
                curveToRelative(-0.003f, -0.742f, 0.583f, -1.42f, 1.221f, -1.42f)
                horizontalLineToRelative(12.32f)
                close()
                moveTo(7.746f, 8.72f)
                arcToRelative(0.82f, 0.82f, 0.0f, true, true, -0.002f, -1.64f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.001f, 1.64f)
                close()
                moveTo(7.746f, 11.18f)
                arcToRelative(0.82f, 0.82f, 0.0f, true, true, 0.0f, 1.64f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.0f, -1.64f)
                close()
                moveTo(10.622f, 8.72f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, -0.414f, -0.409f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.414f, -0.409f)
                horizontalLineToRelative(5.731f)
                curveToRelative(0.23f, 0.0f, 0.415f, 0.185f, 0.415f, 0.41f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, -0.415f, 0.408f)
                horizontalLineToRelative(-5.73f)
                close()
                moveTo(16.353f, 12.0f)
                curveToRelative(0.23f, 0.0f, 0.415f, 0.185f, 0.415f, 0.41f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, -0.415f, 0.408f)
                horizontalLineToRelative(-5.73f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, -0.415f, -0.409f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.414f, -0.409f)
                horizontalLineToRelative(5.731f)
                close()
                moveTo(7.745f, 15.283f)
                arcToRelative(0.82f, 0.82f, 0.0f, true, true, 0.002f, 1.64f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.002f, -1.64f)
                close()
                moveTo(16.353f, 16.101f)
                curveToRelative(0.23f, 0.0f, 0.415f, 0.185f, 0.415f, 0.41f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.415f, 0.408f)
                horizontalLineToRelative(-5.73f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, -0.415f, -0.409f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.414f, -0.409f)
                horizontalLineToRelative(5.731f)
                close()
            }
        }
        .build()
        return _listDocumentLight!!
    }

private var _listDocumentLight: ImageVector? = null
