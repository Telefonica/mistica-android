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

public val RegularGroup.SearchFileRegular: ImageVector
    get() {
        if (_searchFileRegular != null) {
            return _searchFileRegular!!
        }
        _searchFileRegular = Builder(name = "SearchFileRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.625f, 2.008f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.395f, 0.166f)
                lineToRelative(5.462f, 5.462f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.165f, 0.395f)
                verticalLineToRelative(12.496f)
                curveToRelative(0.0f, 0.686f, -0.445f, 1.128f, -1.129f, 1.131f)
                lineToRelative(-0.454f, 0.003f)
                lineTo(9.118f, 21.661f)
                curveToRelative(-0.712f, 0.0f, -1.154f, -0.445f, -1.154f, -1.16f)
                verticalLineToRelative(-4.115f)
                arcToRelative(5.791f, 5.791f, 0.0f, false, true, -1.749f, -0.987f)
                lineToRelative(-3.249f, 3.374f)
                arcToRelative(0.56f, 0.56f, 0.0f, true, true, -0.807f, -0.779f)
                lineToRelative(3.262f, -3.385f)
                arcTo(5.803f, 5.803f, 0.0f, false, true, 7.963f, 5.44f)
                lineTo(7.963f, 3.157f)
                curveToRelative(0.0f, -0.706f, 0.443f, -1.146f, 1.152f, -1.149f)
                horizontalLineToRelative(6.51f)
                close()
                moveTo(15.064f, 3.131f)
                horizontalLineToRelative(-5.98f)
                verticalLineToRelative(2.037f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 4.91f, 9.846f)
                arcToRelative(5.759f, 5.759f, 0.0f, false, true, -4.1f, 1.7f)
                curveToRelative(-0.275f, 0.0f, -0.545f, -0.019f, -0.81f, -0.056f)
                verticalLineToRelative(3.883f)
                horizontalLineToRelative(11.44f)
                lineTo(20.524f, 8.593f)
                horizontalLineToRelative(-2.168f)
                curveToRelative(-0.955f, 0.0f, -1.779f, -0.316f, -2.376f, -0.915f)
                curveToRelative(-0.596f, -0.6f, -0.916f, -1.42f, -0.916f, -2.375f)
                lineTo(15.064f, 3.13f)
                close()
                moveTo(9.894f, 6.232f)
                arcToRelative(4.678f, 4.678f, 0.0f, false, false, -4.678f, 4.684f)
                arcToRelative(4.678f, 4.678f, 0.0f, false, false, 4.683f, 4.678f)
                arcToRelative(4.682f, 4.682f, 0.0f, false, false, 3.305f, -7.992f)
                arcToRelative(4.646f, 4.646f, 0.0f, false, false, -3.31f, -1.37f)
                close()
                moveTo(16.184f, 3.924f)
                verticalLineToRelative(1.379f)
                curveToRelative(0.0f, 0.652f, 0.203f, 1.198f, 0.586f, 1.585f)
                curveToRelative(0.384f, 0.387f, 0.933f, 0.588f, 1.583f, 0.588f)
                horizontalLineToRelative(1.378f)
                lineTo(17.19f, 4.93f)
                lineToRelative(-1.005f, -1.006f)
                close()
            }
        }
        .build()
        return _searchFileRegular!!
    }

private var _searchFileRegular: ImageVector? = null
