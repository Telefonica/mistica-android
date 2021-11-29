package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.RatingRegular: ImageVector
    get() {
        if (_ratingRegular != null) {
            return _ratingRegular!!
        }
        _ratingRegular = Builder(name = "RatingRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.9f, 11.317f)
                lineToRelative(1.993f, 1.732f)
                lineToRelative(-0.546f, 2.684f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, false, 0.532f, 0.64f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, false, 0.268f, -0.069f)
                lineToRelative(2.358f, -1.317f)
                lineToRelative(2.353f, 1.317f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, false, 0.795f, -0.571f)
                lineToRelative(-0.546f, -2.688f)
                lineToRelative(1.993f, -1.733f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, false, 0.157f, -0.567f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, false, -0.458f, -0.37f)
                lineToRelative(-2.723f, -0.284f)
                lineTo(12.0f, 7.651f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.989f, 0.0f)
                lineToRelative(-1.077f, 2.44f)
                lineToRelative(-2.723f, 0.284f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, false, -0.458f, 0.37f)
                arcToRelative(0.512f, 0.512f, 0.0f, false, false, 0.148f, 0.572f)
                close()
                moveTo(10.353f, 11.129f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, false, 0.44f, -0.32f)
                lineToRelative(0.707f, -1.604f)
                lineToRelative(0.707f, 1.604f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, 0.44f, 0.32f)
                lineToRelative(1.807f, 0.188f)
                lineToRelative(-1.299f, 1.129f)
                arcToRelative(0.531f, 0.531f, 0.0f, false, false, -0.176f, 0.507f)
                lineToRelative(0.375f, 1.842f)
                lineToRelative(-1.59f, -0.891f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, false, -0.537f, 0.0f)
                lineToRelative(-1.59f, 0.891f)
                lineToRelative(0.374f, -1.842f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.17f, -0.507f)
                lineToRelative(-1.3f, -1.125f)
                lineToRelative(1.812f, -0.192f)
                close()
                moveTo(15.111f, 2.0f)
                lineTo(7.889f, 2.0f)
                curveTo(6.294f, 2.0f, 5.0f, 3.28f, 5.0f, 4.857f)
                verticalLineToRelative(14.286f)
                curveTo(5.0f, 20.72f, 6.294f, 22.0f, 7.89f, 22.0f)
                horizontalLineToRelative(7.22f)
                curveToRelative(1.596f, 0.0f, 2.89f, -1.28f, 2.89f, -2.857f)
                lineTo(18.0f, 4.862f)
                curveTo(18.0f, 3.285f, 16.706f, 2.0f, 15.11f, 2.0f)
                close()
                moveTo(7.889f, 3.43f)
                horizontalLineToRelative(7.222f)
                curveToRelative(0.795f, 0.0f, 1.442f, 0.64f, 1.442f, 1.427f)
                verticalLineToRelative(0.357f)
                lineTo(6.443f, 5.214f)
                verticalLineToRelative(-0.357f)
                curveToRelative(0.0f, -0.786f, 0.647f, -1.426f, 1.446f, -1.426f)
                close()
                moveTo(16.558f, 6.645f)
                lineTo(16.558f, 17.36f)
                lineTo(6.442f, 17.36f)
                lineTo(6.442f, 6.645f)
                horizontalLineToRelative(10.116f)
                close()
                moveTo(15.11f, 20.574f)
                lineTo(7.889f, 20.574f)
                curveToRelative(-0.795f, 0.0f, -1.442f, -0.64f, -1.442f, -1.427f)
                verticalLineToRelative(-0.356f)
                horizontalLineToRelative(10.115f)
                verticalLineToRelative(0.356f)
                arcToRelative(1.444f, 1.444f, 0.0f, false, true, -1.451f, 1.427f)
                close()
            }
        }
        .build()
        return _ratingRegular!!
    }

private var _ratingRegular: ImageVector? = null
