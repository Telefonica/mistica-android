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

public val FilledGroup.FirstAidKitFilled: ImageVector
    get() {
        if (_firstAidKitFilled != null) {
            return _firstAidKitFilled!!
        }
        _firstAidKitFilled = Builder(name = "FirstAidKitFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.333f, 4.947f)
                verticalLineToRelative(1.596f)
                horizontalLineToRelative(7.023f)
                lineTo(15.356f, 4.947f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, false, -0.227f, -0.053f)
                lineTo(8.563f, 4.894f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, false, -0.23f, 0.053f)
                close()
                moveTo(20.23f, 6.543f)
                curveToRelative(0.804f, 0.0f, 1.456f, 0.645f, 1.456f, 1.44f)
                verticalLineToRelative(11.485f)
                curveToRelative(0.0f, 0.792f, -0.652f, 1.437f, -1.456f, 1.437f)
                lineTo(3.457f, 20.905f)
                arcTo(1.448f, 1.448f, 0.0f, false, true, 2.0f, 19.468f)
                lineTo(2.0f, 7.983f)
                curveToRelative(0.0f, -0.793f, 0.653f, -1.44f, 1.457f, -1.44f)
                lineTo(7.1f, 6.543f)
                verticalLineToRelative(-1.66f)
                curveToRelative(0.0f, -0.673f, 0.638f, -1.202f, 1.456f, -1.202f)
                horizontalLineToRelative(6.566f)
                curveToRelative(0.818f, 0.0f, 1.46f, 0.53f, 1.46f, 1.201f)
                verticalLineToRelative(1.661f)
                horizontalLineToRelative(3.647f)
                close()
                moveTo(15.524f, 11.885f)
                horizontalLineToRelative(-1.82f)
                verticalLineToRelative(-1.793f)
                curveToRelative(0.0f, -0.551f, -0.452f, -1.036f, -0.965f, -1.036f)
                horizontalLineToRelative(-1.8f)
                curveToRelative(-0.513f, 0.0f, -0.961f, 0.485f, -0.961f, 1.036f)
                verticalLineToRelative(1.796f)
                lineTo(8.16f, 11.888f)
                curveToRelative(-0.572f, 0.0f, -1.05f, 0.434f, -1.05f, 0.95f)
                verticalLineToRelative(1.775f)
                curveToRelative(0.0f, 0.516f, 0.481f, 0.95f, 1.052f, 0.95f)
                horizontalLineToRelative(1.821f)
                verticalLineToRelative(1.793f)
                curveToRelative(0.0f, 0.563f, 0.44f, 1.036f, 0.961f, 1.036f)
                horizontalLineToRelative(1.804f)
                curveToRelative(0.52f, 0.0f, 0.96f, -0.476f, 0.96f, -1.04f)
                verticalLineToRelative(-1.795f)
                horizontalLineToRelative(1.819f)
                curveToRelative(0.56f, 0.0f, 1.05f, -0.442f, 1.05f, -0.95f)
                verticalLineToRelative(-1.775f)
                curveToRelative(0.0f, -0.504f, -0.493f, -0.947f, -1.053f, -0.947f)
                close()
            }
        }
        .build()
        return _firstAidKitFilled!!
    }

private var _firstAidKitFilled: ImageVector? = null
