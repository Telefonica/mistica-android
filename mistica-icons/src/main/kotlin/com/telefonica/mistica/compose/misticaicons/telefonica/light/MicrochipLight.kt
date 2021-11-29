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

public val LightGroup.MicrochipLight: ImageVector
    get() {
        if (_microchipLight != null) {
            return _microchipLight!!
        }
        _microchipLight = Builder(name = "MicrochipLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.779f, 17.541f)
                curveToRelative(0.0f, 0.106f, -0.151f, 0.246f, -0.305f, 0.246f)
                lineTo(6.54f, 17.787f)
                curveToRelative(-0.163f, 0.0f, -0.305f, -0.137f, -0.305f, -0.246f)
                lineTo(6.235f, 6.499f)
                curveToRelative(0.0f, -0.1f, 0.162f, -0.255f, 0.305f, -0.255f)
                horizontalLineToRelative(10.933f)
                curveToRelative(0.143f, 0.0f, 0.305f, 0.154f, 0.305f, 0.255f)
                lineTo(17.778f, 17.54f)
                close()
                moveTo(21.432f, 12.418f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, 0.0f, -0.824f)
                horizontalLineToRelative(-2.827f)
                verticalLineToRelative(-1.65f)
                horizontalLineToRelative(2.83f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, 0.0f, -0.823f)
                horizontalLineToRelative(-2.83f)
                lineTo(18.605f, 6.499f)
                curveToRelative(0.0f, -0.566f, -0.537f, -1.081f, -1.131f, -1.081f)
                lineTo(14.89f, 5.418f)
                lineTo(14.89f, 2.572f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, -0.409f, -0.412f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, -0.412f, 0.412f)
                verticalLineToRelative(2.843f)
                horizontalLineToRelative(-1.65f)
                lineTo(12.419f, 2.572f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, -0.823f, 0.0f)
                verticalLineToRelative(2.843f)
                horizontalLineToRelative(-1.65f)
                lineTo(9.946f, 2.572f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, false, -0.826f, 0.0f)
                verticalLineToRelative(2.843f)
                lineTo(6.538f, 5.415f)
                curveToRelative(-0.59f, 0.0f, -1.132f, 0.515f, -1.132f, 1.081f)
                verticalLineToRelative(2.622f)
                lineTo(2.572f, 9.118f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, false, 0.0f, 0.826f)
                horizontalLineToRelative(2.837f)
                verticalLineToRelative(1.65f)
                lineTo(2.572f, 11.594f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, 0.0f, 0.824f)
                horizontalLineToRelative(2.837f)
                verticalLineToRelative(1.65f)
                lineTo(2.572f, 14.068f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, 0.0f, 0.823f)
                horizontalLineToRelative(2.837f)
                verticalLineToRelative(2.647f)
                curveToRelative(0.0f, 0.572f, 0.53f, 1.073f, 1.132f, 1.073f)
                horizontalLineToRelative(2.583f)
                verticalLineToRelative(2.82f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, 0.826f, 0.0f)
                verticalLineToRelative(-2.82f)
                horizontalLineToRelative(1.65f)
                verticalLineToRelative(2.82f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, 0.823f, 0.0f)
                verticalLineToRelative(-2.82f)
                horizontalLineToRelative(1.65f)
                verticalLineToRelative(2.82f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, 0.824f, 0.0f)
                verticalLineToRelative(-2.82f)
                horizontalLineToRelative(2.582f)
                curveToRelative(0.603f, 0.0f, 1.132f, -0.501f, 1.132f, -1.073f)
                verticalLineToRelative(-2.647f)
                horizontalLineToRelative(2.83f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, 0.0f, -0.826f)
                horizontalLineToRelative(-2.836f)
                verticalLineToRelative(-1.65f)
                lineToRelative(2.827f, 0.003f)
                close()
            }
        }
        .build()
        return _microchipLight!!
    }

private var _microchipLight: ImageVector? = null
