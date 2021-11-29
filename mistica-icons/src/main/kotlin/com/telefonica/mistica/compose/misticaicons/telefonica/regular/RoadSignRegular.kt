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

public val RegularGroup.RoadSignRegular: ImageVector
    get() {
        if (_roadSignRegular != null) {
            return _roadSignRegular!!
        }
        _roadSignRegular = Builder(name = "RoadSignRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 20.629f)
                curveToRelative(5.731f, 0.0f, 8.639f, -2.905f, 8.639f, -8.633f)
                curveToRelative(0.0f, -5.731f, -2.905f, -8.639f, -8.639f, -8.639f)
                curveToRelative(-5.728f, 0.0f, -8.633f, 2.908f, -8.633f, 8.639f)
                curveToRelative(0.0f, 5.728f, 2.905f, 8.633f, 8.633f, 8.633f)
                close()
                moveTo(11.99f, 2.15f)
                curveToRelative(6.44f, 0.0f, 9.846f, 3.403f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.437f, -3.403f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.437f, 0.0f, -9.84f, -3.403f, -9.84f, -9.84f)
                curveToRelative(0.0f, -6.443f, 3.403f, -9.846f, 9.84f, -9.846f)
                close()
                moveTo(13.923f, 12.01f)
                lineTo(16.066f, 9.937f)
                lineTo(13.923f, 7.861f)
                verticalLineToRelative(0.488f)
                curveToRelative(0.0f, 0.333f, -0.33f, 0.655f, -0.664f, 0.655f)
                lineTo(9.366f, 9.004f)
                verticalLineToRelative(7.62f)
                horizontalLineToRelative(1.692f)
                verticalLineToRelative(-5.146f)
                curveToRelative(0.0f, -0.334f, 0.271f, -0.603f, 0.602f, -0.603f)
                horizontalLineToRelative(1.596f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, true, 0.664f, 0.653f)
                verticalLineToRelative(0.482f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(14.097f, 6.349f)
                lineTo(17.175f, 9.329f)
                arcToRelative(0.812f, 0.812f, 0.0f, false, true, 0.266f, 0.608f)
                arcToRelative(0.824f, 0.824f, 0.0f, false, true, -0.294f, 0.633f)
                lineToRelative(-3.003f, 2.905f)
                lineToRelative(-0.025f, 0.022f)
                arcToRelative(0.383f, 0.383f, 0.0f, false, true, -0.067f, 0.05f)
                curveToRelative(-0.205f, 0.172f, -0.56f, 0.216f, -0.857f, 0.074f)
                arcToRelative(0.827f, 0.827f, 0.0f, false, true, -0.476f, -0.754f)
                verticalLineToRelative(-0.79f)
                horizontalLineToRelative(-0.451f)
                verticalLineToRelative(5.143f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, -0.603f, 0.602f)
                lineTo(8.766f, 17.822f)
                arcToRelative(0.601f, 0.601f, 0.0f, false, true, -0.602f, -0.602f)
                lineTo(8.164f, 8.934f)
                arcTo(1.142f, 1.142f, 0.0f, false, true, 9.307f, 7.79f)
                horizontalLineToRelative(3.412f)
                verticalLineToRelative(-0.793f)
                curveToRelative(0.0f, -0.325f, 0.184f, -0.614f, 0.481f, -0.754f)
                arcToRelative(0.838f, 0.838f, 0.0f, false, true, 0.897f, 0.107f)
                close()
            }
        }
        .build()
        return _roadSignRegular!!
    }

private var _roadSignRegular: ImageVector? = null
