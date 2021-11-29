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

public val FilledGroup.ListDocumentFilled: ImageVector
    get() {
        if (_listDocumentFilled != null) {
            return _listDocumentFilled!!
        }
        _listDocumentFilled = Builder(name = "ListDocumentFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.161f, 2.0f)
                lineTo(6.844f, 2.0f)
                curveTo(5.83f, 2.0f, 5.0f, 2.83f, 5.0f, 3.854f)
                lineTo(5.0f, 22.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 3.849f)
                curveTo(19.0f, 2.829f, 18.175f, 2.0f, 17.161f, 2.0f)
                close()
                moveTo(13.129f, 15.354f)
                lineTo(9.239f, 19.264f)
                lineTo(7.193f, 17.203f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, 0.0f, -0.787f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.782f, 0.0f)
                lineToRelative(1.269f, 1.275f)
                lineToRelative(3.107f, -3.124f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.783f, 0.0f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, -0.005f, 0.787f)
                close()
                moveTo(13.129f, 10.097f)
                lineTo(9.239f, 14.007f)
                lineTo(7.193f, 11.945f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, 0.0f, -0.786f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.782f, 0.0f)
                lineToRelative(1.269f, 1.275f)
                lineTo(12.35f, 9.31f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.783f, 0.0f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, -0.005f, 0.787f)
                close()
                moveTo(13.129f, 4.982f)
                lineTo(9.239f, 8.892f)
                lineTo(7.193f, 6.835f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, true, 0.0f, -0.787f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.782f, 0.0f)
                lineToRelative(1.269f, 1.276f)
                lineTo(12.35f, 4.2f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.783f, 0.0f)
                arcToRelative(0.556f, 0.556f, 0.0f, false, true, -0.005f, 0.782f)
                close()
            }
        }
        .build()
        return _listDocumentFilled!!
    }

private var _listDocumentFilled: ImageVector? = null
