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

public val LightGroup.DocumentOtherLight: ImageVector
    get() {
        if (_documentOtherLight != null) {
            return _documentOtherLight!!
        }
        _documentOtherLight = Builder(name = "DocumentOtherLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.55f, 20.635f)
                lineTo(18.55f, 8.761f)
                horizontalLineToRelative(-2.546f)
                curveToRelative(-0.974f, 0.0f, -1.81f, -0.322f, -2.423f, -0.918f)
                curveToRelative(-0.613f, -0.606f, -0.94f, -1.423f, -0.94f, -2.384f)
                lineTo(12.641f, 2.985f)
                lineTo(5.824f, 2.985f)
                curveToRelative(-0.18f, 0.0f, -0.4f, 0.208f, -0.4f, 0.381f)
                verticalLineToRelative(5.76f)
                lineToRelative(0.042f, 8.15f)
                lineToRelative(-0.042f, 3.368f)
                curveToRelative(0.0f, 0.182f, 0.204f, 0.372f, 0.4f, 0.372f)
                lineTo(18.15f, 21.016f)
                curveToRelative(0.204f, 0.0f, 0.4f, -0.182f, 0.4f, -0.38f)
                close()
                moveTo(13.46f, 3.165f)
                verticalLineToRelative(2.291f)
                curveToRelative(0.0f, 0.728f, 0.239f, 1.35f, 0.698f, 1.787f)
                curveToRelative(0.451f, 0.445f, 1.098f, 0.686f, 1.85f, 0.686f)
                horizontalLineToRelative(2.321f)
                lineToRelative(-4.868f, -4.764f)
                close()
                moveTo(19.338f, 7.907f)
                curveToRelative(0.016f, 0.059f, 0.033f, 0.106f, 0.033f, 0.165f)
                verticalLineToRelative(12.56f)
                curveToRelative(0.0f, 0.653f, -0.566f, 1.208f, -1.218f, 1.208f)
                lineTo(5.828f, 21.84f)
                curveToRelative(-0.647f, 0.0f, -1.219f, -0.563f, -1.219f, -1.208f)
                lineToRelative(0.042f, -3.358f)
                lineTo(4.61f, 9.13f)
                lineTo(4.61f, 3.364f)
                curveToRelative(0.0f, -0.63f, 0.583f, -1.208f, 1.219f, -1.208f)
                horizontalLineToRelative(7.504f)
                arcToRelative(0.68f, 0.68f, 0.0f, false, true, 0.473f, 0.2f)
                lineToRelative(5.362f, 5.229f)
                curveToRelative(0.087f, 0.09f, 0.137f, 0.207f, 0.17f, 0.322f)
                close()
                moveTo(15.203f, 15.462f)
                curveToRelative(0.0f, 0.44f, -0.31f, 0.753f, -0.728f, 0.753f)
                curveToRelative(-0.434f, 0.0f, -0.745f, -0.314f, -0.745f, -0.737f)
                verticalLineToRelative(-0.016f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, 0.728f, -0.746f)
                arcToRelative(0.738f, 0.738f, 0.0f, false, true, 0.745f, 0.746f)
                close()
                moveTo(12.461f, 15.462f)
                curveToRelative(0.0f, 0.44f, -0.32f, 0.753f, -0.737f, 0.753f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, -0.745f, -0.737f)
                verticalLineToRelative(-0.016f)
                curveToRelative(0.0f, -0.415f, 0.32f, -0.746f, 0.737f, -0.746f)
                curveToRelative(0.42f, 0.003f, 0.745f, 0.334f, 0.745f, 0.746f)
                close()
                moveTo(9.713f, 15.462f)
                curveToRelative(0.0f, 0.44f, -0.32f, 0.753f, -0.737f, 0.753f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, true, -0.745f, -0.737f)
                verticalLineToRelative(-0.016f)
                curveToRelative(0.0f, -0.415f, 0.328f, -0.746f, 0.737f, -0.746f)
                arcToRelative(0.738f, 0.738f, 0.0f, false, true, 0.745f, 0.746f)
                close()
            }
        }
        .build()
        return _documentOtherLight!!
    }

private var _documentOtherLight: ImageVector? = null
