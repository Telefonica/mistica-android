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

public val LightGroup.SearchFileLight: ImageVector
    get() {
        if (_searchFileLight != null) {
            return _searchFileLight!!
        }
        _searchFileLight = Builder(name = "SearchFileLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.65f, 2.157f)
                horizontalLineToRelative(1.408f)
                arcToRelative(0.29f, 0.29f, 0.0f, false, true, 0.2f, 0.082f)
                lineTo(21.718f, 7.7f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, 0.082f, 0.199f)
                verticalLineToRelative(13.028f)
                curveToRelative(0.0f, 0.54f, -0.311f, 0.851f, -0.85f, 0.851f)
                horizontalLineToRelative(-11.4f)
                curveToRelative(-0.563f, 0.0f, -0.874f, -0.313f, -0.874f, -0.88f)
                verticalLineToRelative(-4.772f)
                curveToRelative(0.0f, -0.026f, 0.004f, -0.051f, 0.01f, -0.075f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 6.63f, 14.88f)
                lineToRelative(-3.991f, 4.123f)
                arcToRelative(0.28f, 0.28f, 0.0f, true, true, -0.4f, -0.39f)
                lineToRelative(3.995f, -4.128f)
                arcToRelative(5.522f, 5.522f, 0.0f, false, true, 2.445f, -8.976f)
                lineTo(8.679f, 3.026f)
                curveToRelative(0.0f, -0.55f, 0.319f, -0.866f, 0.87f, -0.869f)
                horizontalLineToRelative(5.103f)
                close()
                moveTo(15.777f, 2.717f)
                lineTo(9.548f, 2.717f)
                curveToRelative(-0.24f, 0.0f, -0.31f, 0.07f, -0.31f, 0.309f)
                verticalLineToRelative(2.34f)
                arcToRelative(5.52f, 5.52f, 0.0f, false, true, 6.61f, 5.414f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, true, -1.616f, 3.904f)
                arcToRelative(5.502f, 5.502f, 0.0f, false, true, -3.905f, 1.616f)
                curveToRelative(-0.373f, 0.0f, -0.737f, -0.037f, -1.09f, -0.107f)
                lineTo(9.237f, 20.9f)
                curveToRelative(0.0f, 0.257f, 0.062f, 0.32f, 0.317f, 0.32f)
                horizontalLineToRelative(11.398f)
                curveToRelative(0.224f, 0.0f, 0.288f, -0.068f, 0.291f, -0.292f)
                lineTo(21.243f, 8.179f)
                horizontalLineToRelative(-2.454f)
                curveToRelative(-0.88f, 0.0f, -1.633f, -0.288f, -2.179f, -0.831f)
                curveToRelative(-0.546f, -0.543f, -0.832f, -1.297f, -0.832f, -2.18f)
                verticalLineToRelative(-2.45f)
                close()
                moveTo(10.327f, 5.819f)
                arcToRelative(4.961f, 4.961f, 0.0f, true, false, 3.507f, 1.45f)
                arcToRelative(4.928f, 4.928f, 0.0f, false, false, -3.507f, -1.45f)
                close()
                moveTo(16.338f, 3.115f)
                lineTo(16.338f, 5.17f)
                curveToRelative(0.0f, 1.487f, 0.961f, 2.45f, 2.451f, 2.45f)
                horizontalLineToRelative(2.056f)
                lineToRelative(-4.507f, -4.504f)
                close()
            }
        }
        .build()
        return _searchFileLight!!
    }

private var _searchFileLight: ImageVector? = null
