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

public val RegularGroup.AddMoreRegular: ImageVector
    get() {
        if (_addMoreRegular != null) {
            return _addMoreRegular!!
        }
        _addMoreRegular = Builder(name = "AddMoreRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.49f, 11.957f)
                horizontalLineToRelative(-5.824f)
                verticalLineTo(5.552f)
                arcTo(0.538f, 0.538f, 0.0f, false, false, 12.141f, 5.0f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, false, -0.525f, 0.552f)
                verticalLineToRelative(6.396f)
                horizontalLineTo(5.525f)
                arcTo(0.538f, 0.538f, 0.0f, false, false, 5.0f, 12.5f)
                curveToRelative(0.0f, 0.303f, 0.237f, 0.552f, 0.525f, 0.552f)
                horizontalLineToRelative(6.083f)
                verticalLineToRelative(6.396f)
                curveToRelative(0.0f, 0.309f, 0.237f, 0.552f, 0.525f, 0.552f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, false, 0.525f, -0.552f)
                verticalLineToRelative(-6.39f)
                horizontalLineToRelative(5.817f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, false, 0.525f, -0.552f)
                curveToRelative(0.0f, -0.303f, -0.223f, -0.549f, -0.51f, -0.549f)
                close()
            }
        }
        .build()
        return _addMoreRegular!!
    }

private var _addMoreRegular: ImageVector? = null
