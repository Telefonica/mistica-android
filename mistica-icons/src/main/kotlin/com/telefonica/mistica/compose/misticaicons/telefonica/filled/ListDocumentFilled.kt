package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

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
                moveTo(16.575f, 12.632f)
                horizontalLineToRelative(-5.566f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, -0.605f, -0.602f)
                curveToRelative(0.0f, -0.331f, 0.272f, -0.603f, 0.605f, -0.603f)
                horizontalLineToRelative(5.566f)
                curveToRelative(0.333f, 0.0f, 0.605f, 0.27f, 0.605f, 0.603f)
                curveToRelative(0.0f, 0.33f, -0.272f, 0.602f, -0.605f, 0.602f)
                moveToRelative(0.0f, 4.011f)
                horizontalLineToRelative(-5.566f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, -0.605f, -0.602f)
                curveToRelative(0.0f, -0.334f, 0.272f, -0.603f, 0.605f, -0.603f)
                horizontalLineToRelative(5.566f)
                curveToRelative(0.333f, 0.0f, 0.605f, 0.27f, 0.605f, 0.603f)
                curveToRelative(0.0f, 0.33f, -0.272f, 0.6f, -0.605f, 0.602f)
                moveTo(10.93f, 7.399f)
                horizontalLineToRelative(5.563f)
                arcToRelative(0.604f, 0.604f, 0.0f, true, true, 0.0f, 1.204f)
                horizontalLineTo(10.93f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, -0.606f, -0.601f)
                curveToRelative(0.0f, -0.334f, 0.272f, -0.603f, 0.606f, -0.603f)
                moveToRelative(-2.726f, 5.434f)
                arcToRelative(0.803f, 0.803f, 0.0f, true, true, -0.001f, -1.603f)
                arcToRelative(0.803f, 0.803f, 0.0f, false, true, 0.001f, 1.603f)
                moveToRelative(0.0f, 4.009f)
                arcToRelative(0.803f, 0.803f, 0.0f, false, true, -0.804f, -0.801f)
                arcToRelative(0.803f, 0.803f, 0.0f, false, true, 1.608f, 0.0f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, true, -0.804f, 0.8f)
                moveToRelative(-0.008f, -9.7f)
                curveToRelative(0.442f, 0.0f, 0.804f, 0.36f, 0.806f, 0.802f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, true, -0.806f, 0.8f)
                arcToRelative(0.803f, 0.803f, 0.0f, false, true, -0.804f, -0.8f)
                curveToRelative(0.0f, -0.443f, 0.361f, -0.801f, 0.804f, -0.801f)
                moveToRelative(9.778f, -4.992f)
                horizontalLineTo(5.992f)
                curveToRelative(-0.728f, 0.0f, -1.392f, 0.756f, -1.392f, 1.588f)
                verticalLineToRelative(16.507f)
                curveToRelative(0.0f, 0.86f, 0.639f, 1.591f, 1.392f, 1.591f)
                lineToRelative(11.98f, 0.003f)
                curveToRelative(0.754f, 0.0f, 1.393f, -0.728f, 1.393f, -1.591f)
                verticalLineTo(3.741f)
                curveToRelative(0.002f, -0.832f, -0.661f, -1.591f, -1.39f, -1.591f)
            }
        }
        .build()
        return _listDocumentFilled!!
    }

private var _listDocumentFilled: ImageVector? = null
