package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.RatingFilled: ImageVector
    get() {
        if (_ratingFilled != null) {
            return _ratingFilled!!
        }
        _ratingFilled = Builder(name = "RatingFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.607f)
                verticalLineToRelative(0.179f)
                curveTo(18.0f, 20.56f, 16.544f, 22.0f, 14.75f, 22.0f)
                horizontalLineToRelative(-6.5f)
                curveTo(6.456f, 22.0f, 5.0f, 20.56f, 5.0f, 18.786f)
                verticalLineToRelative(-0.179f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(5.0f, 6.463f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(11.074f)
                lineTo(5.0f, 17.537f)
                lineTo(5.0f, 6.463f)
                close()
                moveTo(6.743f, 10.747f)
                arcToRelative(0.537f, 0.537f, 0.0f, false, false, 0.157f, 0.567f)
                lineToRelative(1.993f, 1.733f)
                lineToRelative(-0.546f, 2.684f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, false, 0.532f, 0.64f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, false, 0.268f, -0.068f)
                lineToRelative(2.358f, -1.317f)
                lineToRelative(2.353f, 1.317f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, false, 0.795f, -0.572f)
                lineToRelative(-0.546f, -2.688f)
                lineTo(16.1f, 11.31f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, false, 0.157f, -0.567f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, false, -0.458f, -0.37f)
                lineToRelative(-2.723f, -0.284f)
                lineTo(12.0f, 7.647f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.989f, 0.0f)
                lineToRelative(-1.077f, 2.442f)
                lineToRelative(-2.723f, 0.283f)
                arcToRelative(0.555f, 0.555f, 0.0f, false, false, -0.467f, 0.375f)
                close()
                moveTo(10.016f, 12.956f)
                lineTo(9.642f, 14.798f)
                lineTo(11.232f, 13.907f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, 0.536f, 0.0f)
                lineToRelative(1.59f, 0.891f)
                lineToRelative(-0.374f, -1.842f)
                arcToRelative(0.532f, 0.532f, 0.0f, false, true, 0.176f, -0.508f)
                lineToRelative(1.299f, -1.13f)
                lineToRelative(-1.808f, -0.187f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, true, -0.44f, -0.32f)
                lineTo(11.5f, 9.206f)
                lineToRelative(-0.707f, 1.605f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, -0.44f, 0.32f)
                lineToRelative(-1.807f, 0.188f)
                lineToRelative(1.299f, 1.13f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.171f, 0.507f)
                close()
                moveTo(18.0f, 5.393f)
                verticalLineToRelative(-0.179f)
                curveTo(18.0f, 3.44f, 16.544f, 2.0f, 14.75f, 2.0f)
                horizontalLineToRelative(-6.5f)
                curveTo(6.456f, 2.0f, 5.0f, 3.44f, 5.0f, 5.214f)
                verticalLineToRelative(0.179f)
                horizontalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _ratingFilled!!
    }

private var _ratingFilled: ImageVector? = null
