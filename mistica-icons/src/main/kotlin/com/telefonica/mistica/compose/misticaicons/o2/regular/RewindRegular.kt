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

public val RegularGroup.RewindRegular: ImageVector
    get() {
        if (_rewindRegular != null) {
            return _rewindRegular!!
        }
        _rewindRegular = Builder(name = "RewindRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.488f, 22.0f, 2.0f, 17.516f, 2.0f, 12.0f)
                reflectiveCurveTo(6.488f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.488f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.488f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 3.43f)
                curveToRelative(-4.726f, 0.0f, -8.57f, 3.844f, -8.57f, 8.57f)
                curveToRelative(0.0f, 4.726f, 3.844f, 8.57f, 8.57f, 8.57f)
                curveToRelative(4.726f, 0.0f, 8.57f, -3.844f, 8.57f, -8.57f)
                curveToRelative(0.0f, -4.726f, -3.844f, -8.57f, -8.57f, -8.57f)
                close()
                moveTo(17.146f, 17.146f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, 0.0f, -1.01f)
                lineTo(13.01f, 12.0f)
                lineToRelative(4.136f, -4.136f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, -1.01f, -1.01f)
                lineToRelative(-4.639f, 4.643f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, 0.0f, 1.01f)
                lineToRelative(4.644f, 4.644f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, false, 1.005f, -0.005f)
                close()
                moveTo(11.076f, 17.146f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, 0.0f, -1.01f)
                lineTo(6.942f, 12.0f)
                lineToRelative(4.136f, -4.136f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, -1.01f, -1.01f)
                lineToRelative(-4.644f, 4.643f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, 0.0f, 1.01f)
                lineToRelative(4.644f, 4.644f)
                curveToRelative(0.137f, 0.142f, 0.32f, 0.21f, 0.502f, 0.21f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, false, 0.508f, -0.215f)
                close()
            }
        }
        .build()
        return _rewindRegular!!
    }

private var _rewindRegular: ImageVector? = null
