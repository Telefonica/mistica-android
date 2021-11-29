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

public val LightGroup.ArrowsLeftAndRightLight: ImageVector
    get() {
        if (_arrowsLeftAndRightLight != null) {
            return _arrowsLeftAndRightLight!!
        }
        _arrowsLeftAndRightLight = Builder(name = "ArrowsLeftAndRightLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.451f, 5.319f)
                lineTo(22.0f, 10.193f)
                lineToRelative(-4.54f, 4.813f)
                curveToRelative(-0.325f, 0.332f, -0.841f, 0.414f, -1.321f, 0.217f)
                curveToRelative(-0.452f, -0.192f, -0.728f, -0.581f, -0.728f, -1.02f)
                verticalLineToRelative(-1.806f)
                lineTo(7.885f, 12.397f)
                lineTo(7.885f, 9.804f)
                curveToRelative(0.0f, -0.156f, -0.144f, -0.283f, -0.284f, -0.34f)
                curveToRelative(-0.168f, -0.074f, -0.404f, -0.082f, -0.536f, 0.05f)
                lineToRelative(-4.053f, 4.35f)
                lineToRelative(4.065f, 4.309f)
                curveToRelative(0.128f, 0.13f, 0.364f, 0.114f, 0.536f, 0.04f)
                curveToRelative(0.136f, -0.057f, 0.284f, -0.184f, 0.284f, -0.34f)
                lineTo(7.897f, 15.33f)
                horizontalLineToRelative(4.121f)
                curveToRelative(0.196f, 0.0f, 0.356f, 0.164f, 0.356f, 0.364f)
                curveToRelative(0.0f, 0.201f, -0.16f, 0.365f, -0.356f, 0.365f)
                lineTo(8.593f, 16.059f)
                verticalLineToRelative(1.806f)
                curveToRelative(0.0f, 0.439f, -0.284f, 0.828f, -0.728f, 1.02f)
                arcToRelative(1.26f, 1.26f, 0.0f, false, true, -0.532f, 0.115f)
                curveToRelative(-0.3f, 0.0f, -0.584f, -0.107f, -0.784f, -0.315f)
                lineTo(2.0f, 13.863f)
                lineToRelative(4.54f, -4.866f)
                curveToRelative(0.325f, -0.332f, 0.841f, -0.414f, 1.321f, -0.217f)
                curveToRelative(0.452f, 0.192f, 0.728f, 0.582f, 0.728f, 1.02f)
                verticalLineToRelative(1.864f)
                horizontalLineToRelative(7.526f)
                verticalLineToRelative(2.535f)
                curveToRelative(0.0f, 0.156f, 0.144f, 0.283f, 0.292f, 0.34f)
                curveToRelative(0.16f, 0.066f, 0.404f, 0.082f, 0.536f, -0.049f)
                lineTo(21.0f, 10.189f)
                lineToRelative(-4.065f, -4.358f)
                curveToRelative(-0.12f, -0.123f, -0.364f, -0.115f, -0.524f, -0.041f)
                curveToRelative(-0.136f, 0.057f, -0.292f, 0.184f, -0.292f, 0.34f)
                verticalLineToRelative(2.593f)
                lineTo(9.485f, 8.723f)
                arcToRelative(0.361f, 0.361f, 0.0f, false, true, -0.356f, -0.365f)
                curveToRelative(0.0f, -0.2f, 0.16f, -0.365f, 0.356f, -0.365f)
                horizontalLineToRelative(5.918f)
                lineTo(15.403f, 6.13f)
                curveToRelative(0.0f, -0.439f, 0.284f, -0.828f, 0.728f, -1.02f)
                curveToRelative(0.476f, -0.201f, 0.996f, -0.123f, 1.32f, 0.209f)
                close()
                moveTo(14.151f, 14.957f)
                curveToRelative(0.397f, 0.0f, 0.72f, 0.33f, 0.72f, 0.737f)
                arcToRelative(0.729f, 0.729f, 0.0f, false, true, -0.72f, 0.738f)
                arcToRelative(0.729f, 0.729f, 0.0f, false, true, -0.72f, -0.738f)
                curveToRelative(0.0f, -0.407f, 0.322f, -0.737f, 0.72f, -0.737f)
                close()
            }
        }
        .build()
        return _arrowsLeftAndRightLight!!
    }

private var _arrowsLeftAndRightLight: ImageVector? = null
