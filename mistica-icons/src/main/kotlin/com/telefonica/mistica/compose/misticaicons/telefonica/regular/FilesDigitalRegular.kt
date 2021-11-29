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

public val RegularGroup.FilesDigitalRegular: ImageVector
    get() {
        if (_filesDigitalRegular != null) {
            return _filesDigitalRegular!!
        }
        _filesDigitalRegular = Builder(name = "FilesDigitalRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.501f, 11.073f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, -0.184f, -0.311f)
                lineToRelative(-3.208f, -3.18f)
                arcToRelative(0.756f, 0.756f, 0.0f, false, false, -0.53f, -0.22f)
                lineTo(5.56f, 7.362f)
                verticalLineToRelative(-0.715f)
                curveToRelative(0.0f, -0.6f, 0.13f, -1.042f, 0.384f, -1.305f)
                curveToRelative(0.263f, -0.28f, 0.714f, -0.42f, 1.322f, -0.42f)
                lineToRelative(11.451f, -0.009f)
                curveToRelative(0.616f, 0.0f, 1.059f, 0.14f, 1.322f, 0.42f)
                curveToRelative(0.258f, 0.264f, 0.384f, 0.706f, 0.384f, 1.306f)
                verticalLineToRelative(5.512f)
                curveToRelative(0.0f, 0.608f, -0.129f, 1.053f, -0.384f, 1.322f)
                curveToRelative(-0.271f, 0.289f, -0.714f, 0.429f, -1.322f, 0.429f)
                lineToRelative(-7.168f, 0.008f)
                verticalLineToRelative(-2.588f)
                arcToRelative(0.559f, 0.559f, 0.0f, false, false, -0.048f, -0.25f)
                close()
                moveTo(8.014f, 9.725f)
                lineTo(8.014f, 9.2f)
                lineToRelative(1.683f, 1.66f)
                horizontalLineToRelative(-0.512f)
                curveToRelative(-0.255f, 0.0f, -0.602f, -0.047f, -0.866f, -0.304f)
                curveToRelative(-0.201f, -0.205f, -0.305f, -0.485f, -0.305f, -0.83f)
                close()
                moveTo(10.347f, 18.804f)
                lineTo(3.202f, 18.804f)
                lineTo(3.202f, 8.59f)
                lineTo(6.81f, 8.59f)
                verticalLineToRelative(1.134f)
                curveToRelative(0.0f, 0.681f, 0.232f, 1.275f, 0.672f, 1.71f)
                curveToRelative(0.434f, 0.433f, 1.02f, 0.657f, 1.7f, 0.657f)
                horizontalLineToRelative(1.163f)
                verticalLineToRelative(6.712f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(18.72f, 15.132f)
                curveToRelative(0.947f, 0.0f, 1.683f, -0.272f, 2.182f, -0.804f)
                curveToRelative(0.49f, -0.51f, 0.731f, -1.241f, 0.731f, -2.177f)
                lineTo(21.633f, 6.636f)
                curveToRelative(0.0f, -0.939f, -0.24f, -1.661f, -0.731f, -2.171f)
                curveToRelative(-0.496f, -0.527f, -1.235f, -0.79f, -2.182f, -0.79f)
                lineToRelative(-11.451f, 0.008f)
                curveToRelative(-0.947f, 0.0f, -1.684f, 0.264f, -2.182f, 0.788f)
                curveToRelative(-0.482f, 0.501f, -0.731f, 1.232f, -0.731f, 2.168f)
                verticalLineToRelative(0.714f)
                lineTo(3.08f, 7.353f)
                curveToRelative(-0.577f, 0.0f, -1.081f, 0.51f, -1.081f, 1.1f)
                verticalLineToRelative(10.485f)
                curveToRelative(0.0f, 0.591f, 0.496f, 1.093f, 1.081f, 1.093f)
                horizontalLineToRelative(7.387f)
                curveToRelative(0.585f, 0.0f, 1.081f, -0.502f, 1.081f, -1.093f)
                verticalLineToRelative(-1.784f)
                horizontalLineToRelative(9.479f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, 0.602f, -0.616f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, false, -0.602f, -0.616f)
                horizontalLineToRelative(-9.476f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(7.168f)
                close()
            }
        }
        .build()
        return _filesDigitalRegular!!
    }

private var _filesDigitalRegular: ImageVector? = null
