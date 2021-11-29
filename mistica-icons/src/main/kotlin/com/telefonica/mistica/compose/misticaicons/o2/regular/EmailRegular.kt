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

public val RegularGroup.EmailRegular: ImageVector
    get() {
        if (_emailRegular != null) {
            return _emailRegular!!
        }
        _emailRegular = Builder(name = "EmailRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.26f, 5.0f)
                lineTo(2.74f, 5.0f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, false, -0.74f, 0.766f)
                verticalLineToRelative(12.468f)
                curveToRelative(0.0f, 0.422f, 0.332f, 0.766f, 0.74f, 0.766f)
                horizontalLineToRelative(18.52f)
                curveToRelative(0.408f, 0.0f, 0.74f, -0.344f, 0.74f, -0.766f)
                lineTo(22.0f, 5.766f)
                arcTo(0.754f, 0.754f, 0.0f, false, false, 21.26f, 5.0f)
                close()
                moveTo(19.146f, 6.532f)
                lineTo(12.0f, 10.824f)
                lineTo(4.854f, 6.532f)
                horizontalLineToRelative(14.292f)
                close()
                moveTo(3.479f, 17.468f)
                lineTo(3.479f, 7.48f)
                lineToRelative(8.146f, 4.896f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, false, 0.74f, 0.0f)
                lineToRelative(8.156f, -4.896f)
                verticalLineToRelative(9.983f)
                lineTo(3.479f, 17.463f)
                verticalLineToRelative(0.005f)
                close()
            }
        }
        .build()
        return _emailRegular!!
    }

private var _emailRegular: ImageVector? = null
