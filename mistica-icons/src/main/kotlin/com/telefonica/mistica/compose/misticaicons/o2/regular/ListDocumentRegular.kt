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

public val RegularGroup.ListDocumentRegular: ImageVector
    get() {
        if (_listDocumentRegular != null) {
            return _listDocumentRegular!!
        }
        _listDocumentRegular = Builder(name = "ListDocumentRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.788f, 2.0f)
                curveTo(17.986f, 2.0f, 19.0f, 3.02f, 19.0f, 4.223f)
                lineTo(19.0f, 22.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 4.223f)
                curveTo(5.0f, 3.02f, 6.014f, 2.0f, 7.212f, 2.0f)
                horizontalLineToRelative(9.576f)
                close()
                moveTo(16.788f, 3.484f)
                lineTo(7.207f, 3.484f)
                curveToRelative(-0.373f, 0.0f, -0.736f, 0.365f, -0.736f, 0.74f)
                lineTo(6.471f, 20.52f)
                horizontalLineToRelative(11.053f)
                lineTo(17.524f, 4.223f)
                curveToRelative(0.0f, -0.374f, -0.363f, -0.74f, -0.736f, -0.74f)
                close()
                moveTo(13.624f, 14.994f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, 0.0f, 1.047f)
                lineToRelative(-4.022f, 4.044f)
                lineToRelative(-2.178f, -2.19f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, 0.0f, -1.048f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, 1.042f, 0.0f)
                lineToRelative(1.136f, 1.143f)
                lineToRelative(2.98f, -2.996f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, 1.042f, 0.0f)
                close()
                moveTo(13.624f, 9.736f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, 0.0f, 1.048f)
                lineToRelative(-4.022f, 4.044f)
                lineToRelative(-2.178f, -2.19f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, 0.0f, -1.048f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, 1.042f, 0.0f)
                lineToRelative(1.136f, 1.142f)
                lineToRelative(2.98f, -2.996f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, 1.042f, 0.0f)
                close()
                moveTo(13.624f, 4.626f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, 0.0f, 1.048f)
                lineTo(9.602f, 9.717f)
                lineToRelative(-2.178f, -2.19f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, 0.0f, -1.047f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, 1.042f, 0.0f)
                lineToRelative(1.136f, 1.142f)
                lineToRelative(2.98f, -2.996f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, 1.042f, 0.0f)
                close()
            }
        }
        .build()
        return _listDocumentRegular!!
    }

private var _listDocumentRegular: ImageVector? = null
