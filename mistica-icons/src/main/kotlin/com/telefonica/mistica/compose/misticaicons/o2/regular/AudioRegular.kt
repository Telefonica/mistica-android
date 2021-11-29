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

public val RegularGroup.AudioRegular: ImageVector
    get() {
        if (_audioRegular != null) {
            return _audioRegular!!
        }
        _audioRegular = Builder(name = "AudioRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.584f, 17.091f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, true, -0.501f, -0.204f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, -0.028f, -1.048f)
                arcToRelative(5.549f, 5.549f, 0.0f, false, false, -0.093f, -7.66f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, 0.0f, -1.048f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, true, 1.026f, 0.0f)
                arcToRelative(7.037f, 7.037f, 0.0f, false, true, 0.12f, 9.728f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.524f, 0.232f)
                close()
                moveTo(18.414f, 15.109f)
                arcToRelative(4.571f, 4.571f, 0.0f, false, false, -0.13f, -6.237f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, false, -1.026f, 0.0f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, false, 0.0f, 1.048f)
                arcToRelative(3.075f, 3.075f, 0.0f, false, true, 0.088f, 4.188f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, false, 0.047f, 1.048f)
                arcToRelative(0.706f, 0.706f, 0.0f, false, false, 1.021f, -0.047f)
                close()
                moveTo(15.415f, 21.905f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, false, 0.362f, -0.64f)
                lineTo(15.777f, 2.74f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, false, -0.362f, -0.64f)
                arcToRelative(0.708f, 0.708f, 0.0f, false, false, -0.724f, 0.0f)
                lineToRelative(-9.26f, 5.454f)
                lineTo(2.723f, 7.554f)
                curveToRelative(-0.4f, 0.0f, -0.724f, 0.332f, -0.724f, 0.74f)
                lineTo(1.999f, 15.7f)
                curveToRelative(0.0f, 0.408f, 0.325f, 0.74f, 0.724f, 0.74f)
                lineTo(5.43f, 16.44f)
                lineToRelative(9.261f, 5.459f)
                curveToRelative(0.112f, 0.066f, 0.237f, 0.1f, 0.362f, 0.1f)
                arcToRelative(0.659f, 0.659f, 0.0f, false, false, 0.362f, -0.095f)
                close()
                moveTo(3.448f, 9.038f)
                horizontalLineToRelative(2.177f)
                curveToRelative(0.126f, 0.0f, 0.251f, -0.033f, 0.362f, -0.1f)
                lineTo(14.33f, 4.02f)
                verticalLineToRelative(15.96f)
                lineToRelative(-8.342f, -4.914f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, false, -0.362f, -0.1f)
                lineTo(3.448f, 14.966f)
                lineTo(3.448f, 9.038f)
                close()
            }
        }
        .build()
        return _audioRegular!!
    }

private var _audioRegular: ImageVector? = null
