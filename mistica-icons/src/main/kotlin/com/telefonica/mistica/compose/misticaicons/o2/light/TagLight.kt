package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.TagLight: ImageVector
    get() {
        if (_tagLight != null) {
            return _tagLight!!
        }
        _tagLight = Builder(name = "TagLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.896f, 2.603f)
                lineToRelative(-1.322f, 1.323f)
                verticalLineToRelative(9.386f)
                curveToRelative(0.0f, 0.485f, -0.19f, 0.943f, -0.532f, 1.285f)
                lineToRelative(-3.824f, 3.824f)
                arcToRelative(0.368f, 0.368f, 0.0f, false, true, -0.527f, 0.0f)
                arcToRelative(0.368f, 0.368f, 0.0f, false, true, 0.0f, -0.527f)
                lineToRelative(3.824f, -3.824f)
                curveToRelative(0.203f, -0.203f, 0.314f, -0.471f, 0.314f, -0.758f)
                lineTo(19.829f, 4.67f)
                lineToRelative(-1.905f, 1.905f)
                arcToRelative(0.353f, 0.353f, 0.0f, false, true, -0.25f, 0.102f)
                arcToRelative(0.353f, 0.353f, 0.0f, false, true, -0.25f, -0.606f)
                lineToRelative(1.906f, -1.905f)
                horizontalLineToRelative(-8.647f)
                curveToRelative(-0.282f, 0.0f, -0.56f, 0.116f, -0.758f, 0.315f)
                lineToRelative(-6.862f, 6.866f)
                arcToRelative(1.063f, 1.063f, 0.0f, false, false, -0.314f, 0.758f)
                curveToRelative(0.0f, 0.287f, 0.111f, 0.555f, 0.314f, 0.758f)
                lineToRelative(8.074f, 8.074f)
                curveToRelative(0.411f, 0.411f, 1.068f, 0.42f, 1.493f, 0.018f)
                arcToRelative(0.369f, 0.369f, 0.0f, false, true, 0.527f, 0.014f)
                arcToRelative(0.373f, 0.373f, 0.0f, false, true, -0.014f, 0.527f)
                arcTo(1.813f, 1.813f, 0.0f, false, true, 11.89f, 22.0f)
                curveToRelative(-0.462f, 0.0f, -0.925f, -0.18f, -1.28f, -0.536f)
                lineTo(2.531f, 13.39f)
                arcTo(1.808f, 1.808f, 0.0f, false, true, 2.0f, 12.105f)
                curveToRelative(0.0f, -0.485f, 0.19f, -0.943f, 0.532f, -1.285f)
                lineToRelative(6.866f, -6.862f)
                curveToRelative(0.342f, -0.342f, 0.8f, -0.532f, 1.285f, -0.532f)
                horizontalLineToRelative(9.387f)
                lineToRelative(1.322f, -1.322f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, 0.504f, 0.0f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, 0.0f, 0.5f)
                close()
                moveTo(14.419f, 18.967f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, false, 0.0f, 1.442f)
                arcToRelative(0.722f, 0.722f, 0.0f, false, false, 0.0f, -1.442f)
                close()
                moveTo(16.769f, 12.647f)
                curveToRelative(-2.66f, 0.0f, -4.518f, 1.784f, -4.518f, 4.336f)
                arcToRelative(0.361f, 0.361f, 0.0f, false, true, -0.721f, 0.0f)
                curveToRelative(0.0f, -2.552f, -1.86f, -4.337f, -4.518f, -4.337f)
                arcToRelative(0.361f, 0.361f, 0.0f, false, true, 0.0f, -0.721f)
                curveToRelative(2.534f, 0.0f, 4.518f, -2.062f, 4.518f, -4.698f)
                arcToRelative(0.361f, 0.361f, 0.0f, false, true, 0.72f, 0.0f)
                curveToRelative(0.0f, 2.631f, 1.984f, 4.698f, 4.518f, 4.698f)
                arcToRelative(0.361f, 0.361f, 0.0f, false, true, 0.0f, 0.721f)
                close()
                moveTo(14.785f, 12.257f)
                curveToRelative(-1.332f, -0.545f, -2.372f, -1.636f, -2.895f, -3.014f)
                arcToRelative(5.209f, 5.209f, 0.0f, false, true, -2.894f, 3.015f)
                curveToRelative(1.35f, 0.485f, 2.381f, 1.475f, 2.894f, 2.77f)
                curveToRelative(0.513f, -1.295f, 1.545f, -2.285f, 2.895f, -2.77f)
                close()
            }
        }
        .build()
        return _tagLight!!
    }

private var _tagLight: ImageVector? = null
