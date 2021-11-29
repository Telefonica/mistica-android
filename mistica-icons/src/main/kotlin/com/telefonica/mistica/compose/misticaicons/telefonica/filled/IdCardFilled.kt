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

public val FilledGroup.IdCardFilled: ImageVector
    get() {
        if (_idCardFilled != null) {
            return _idCardFilled!!
        }
        _idCardFilled = Builder(name = "IdCardFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.255f, 19.29f)
                lineTo(3.43f, 19.29f)
                curveTo(2.641f, 19.29f, 2.0f, 18.62f, 2.0f, 17.8f)
                lineTo(2.0f, 6.013f)
                curveToRelative(0.0f, -0.821f, 0.641f, -1.488f, 1.431f, -1.488f)
                horizontalLineToRelative(16.827f)
                curveToRelative(0.79f, 0.0f, 1.431f, 0.667f, 1.431f, 1.488f)
                lineTo(21.689f, 17.8f)
                curveToRelative(-0.003f, 0.82f, -0.644f, 1.49f, -1.434f, 1.49f)
                close()
                moveTo(10.863f, 14.304f)
                curveToRelative(0.333f, 0.0f, 0.602f, -0.28f, 0.602f, -0.628f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, false, -0.602f, -0.627f)
                lineTo(4.622f, 13.049f)
                arcToRelative(0.614f, 0.614f, 0.0f, false, false, -0.602f, 0.627f)
                curveToRelative(0.0f, 0.348f, 0.271f, 0.628f, 0.602f, 0.628f)
                horizontalLineToRelative(6.24f)
                close()
                moveTo(8.857f, 10.954f)
                curveToRelative(0.333f, 0.0f, 0.605f, -0.28f, 0.605f, -0.628f)
                arcToRelative(0.617f, 0.617f, 0.0f, false, false, -0.605f, -0.627f)
                lineTo(4.622f, 9.699f)
                arcToRelative(0.617f, 0.617f, 0.0f, false, false, -0.605f, 0.627f)
                curveToRelative(0.0f, 0.348f, 0.272f, 0.628f, 0.605f, 0.628f)
                horizontalLineToRelative(4.235f)
                close()
                moveTo(16.115f, 8.083f)
                curveToRelative(-0.569f, 0.0f, -1.014f, 0.156f, -1.32f, 0.465f)
                curveToRelative(-0.319f, 0.319f, -0.478f, 0.795f, -0.478f, 1.411f)
                curveToRelative(0.0f, 0.617f, 0.16f, 1.09f, 0.479f, 1.41f)
                curveToRelative(0.305f, 0.307f, 0.75f, 0.462f, 1.319f, 0.462f)
                curveToRelative(0.571f, 0.0f, 1.014f, -0.157f, 1.322f, -0.463f)
                curveToRelative(0.32f, -0.319f, 0.482f, -0.795f, 0.482f, -1.411f)
                curveToRelative(0.0f, -0.617f, -0.163f, -1.09f, -0.482f, -1.412f)
                curveToRelative(-0.308f, -0.308f, -0.75f, -0.462f, -1.322f, -0.462f)
                close()
                moveTo(17.215f, 12.651f)
                horizontalLineToRelative(-2.198f)
                curveToRelative(-0.667f, 0.0f, -1.216f, 0.213f, -1.583f, 0.61f)
                curveToRelative(-0.339f, 0.368f, -0.515f, 0.878f, -0.515f, 1.474f)
                verticalLineToRelative(0.625f)
                arcToRelative(0.21f, 0.21f, 0.0f, false, false, 0.204f, 0.213f)
                horizontalLineToRelative(5.992f)
                arcToRelative(0.21f, 0.21f, 0.0f, false, false, 0.204f, -0.213f)
                verticalLineToRelative(-0.625f)
                curveToRelative(0.0f, -0.596f, -0.179f, -1.106f, -0.518f, -1.473f)
                curveToRelative(-0.372f, -0.398f, -0.919f, -0.61f, -1.585f, -0.61f)
                close()
            }
        }
        .build()
        return _idCardFilled!!
    }

private var _idCardFilled: ImageVector? = null
