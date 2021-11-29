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
                moveTo(18.354f, 11.318f)
                horizontalLineTo(12.68f)
                verticalLineTo(5.644f)
                arcToRelative(0.682f, 0.682f, 0.0f, false, false, -1.36f, 0.0f)
                verticalLineToRelative(5.676f)
                horizontalLineTo(5.644f)
                arcToRelative(0.682f, 0.682f, 0.0f, false, false, 0.0f, 1.36f)
                horizontalLineToRelative(5.676f)
                verticalLineToRelative(5.676f)
                arcToRelative(0.682f, 0.682f, 0.0f, false, false, 1.36f, 0.0f)
                verticalLineTo(12.68f)
                horizontalLineToRelative(5.676f)
                arcToRelative(0.682f, 0.682f, 0.0f, false, false, -0.002f, -1.362f)
            }
        }
        .build()
        return _addMoreRegular!!
    }

private var _addMoreRegular: ImageVector? = null
