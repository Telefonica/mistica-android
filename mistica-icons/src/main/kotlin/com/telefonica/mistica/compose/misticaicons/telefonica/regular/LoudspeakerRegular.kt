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

public val RegularGroup.LoudspeakerRegular: ImageVector
    get() {
        if (_loudspeakerRegular != null) {
            return _loudspeakerRegular!!
        }
        _loudspeakerRegular = Builder(name = "LoudspeakerRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.563f, 5.622f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, 0.392f, 0.79f)
                verticalLineToRelative(11.202f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, true, -0.39f, 0.787f)
                arcToRelative(0.904f, 0.904f, 0.0f, false, true, -0.804f, 0.143f)
                lineTo(10.304f, 16.9f)
                lineToRelative(-0.198f, 0.632f)
                arcToRelative(0.801f, 0.801f, 0.0f, false, true, -0.403f, 0.482f)
                arcToRelative(0.782f, 0.782f, 0.0f, false, true, -0.625f, 0.056f)
                lineToRelative(-2.269f, -0.711f)
                arcToRelative(0.822f, 0.822f, 0.0f, false, true, -0.538f, -1.028f)
                lineToRelative(0.185f, -0.59f)
                lineToRelative(-3.21f, -0.966f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -1.056f, -0.123f)
                lineTo(2.19f, 9.37f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, 1.056f, -0.122f)
                lineTo(15.76f, 5.479f)
                arcToRelative(0.894f, 0.894f, 0.0f, false, true, 0.802f, 0.143f)
                close()
                moveTo(19.501f, 15.476f)
                lineTo(21.008f, 16.983f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, -0.773f, 0.773f)
                lineToRelative(-1.507f, -1.507f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, 0.773f, -0.773f)
                close()
                moveTo(15.885f, 6.56f)
                lineTo(3.294f, 10.35f)
                verticalLineToRelative(3.322f)
                lineToRelative(12.59f, 3.793f)
                lineTo(15.884f, 6.56f)
                close()
                moveTo(7.467f, 16.177f)
                lineTo(7.397f, 16.401f)
                lineTo(9.145f, 16.95f)
                lineTo(9.215f, 16.726f)
                lineTo(7.467f, 16.176f)
                close()
                moveTo(21.336f, 11.233f)
                arcToRelative(0.545f, 0.545f, 0.0f, true, true, 0.0f, 1.092f)
                lineTo(19.15f, 12.325f)
                arcToRelative(0.545f, 0.545f, 0.0f, true, true, 0.0f, -1.092f)
                horizontalLineToRelative(2.185f)
                close()
                moveTo(21.016f, 5.737f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, 0.0f, 0.773f)
                lineTo(19.47f, 8.056f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, -0.773f, 0.0f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, 0.0f, -0.773f)
                lineToRelative(1.546f, -1.546f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, 0.773f, 0.0f)
                close()
            }
        }
        .build()
        return _loudspeakerRegular!!
    }

private var _loudspeakerRegular: ImageVector? = null
