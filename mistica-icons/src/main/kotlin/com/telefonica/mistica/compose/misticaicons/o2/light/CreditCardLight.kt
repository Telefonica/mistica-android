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

public val LightGroup.CreditCardLight: ImageVector
    get() {
        if (_creditCardLight != null) {
            return _creditCardLight!!
        }
        _creditCardLight = Builder(name = "CreditCardLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.058f, 17.529f)
                curveToRelative(0.394f, 0.0f, 0.713f, 0.33f, 0.713f, 0.735f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, true, -0.713f, 0.736f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, true, -0.712f, -0.736f)
                curveToRelative(0.0f, -0.406f, 0.319f, -0.735f, 0.712f, -0.735f)
                close()
                moveTo(20.195f, 5.0f)
                curveToRelative(0.989f, 0.0f, 1.789f, 0.843f, 1.805f, 1.888f)
                verticalLineToRelative(9.856f)
                curveToRelative(0.0f, 1.045f, -0.8f, 1.888f, -1.789f, 1.888f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, true, -0.356f, -0.368f)
                curveToRelative(0.0f, -0.202f, 0.16f, -0.367f, 0.356f, -0.367f)
                curveToRelative(0.593f, 0.0f, 1.069f, -0.517f, 1.069f, -1.153f)
                lineTo(21.28f, 9.785f)
                lineTo(2.72f, 9.785f)
                verticalLineToRelative(6.963f)
                curveToRelative(0.0f, 0.636f, 0.476f, 1.153f, 1.069f, 1.153f)
                horizontalLineToRelative(12.137f)
                curveToRelative(0.196f, 0.0f, 0.356f, 0.165f, 0.356f, 0.368f)
                curveToRelative(0.0f, 0.202f, -0.16f, 0.367f, -0.356f, 0.367f)
                lineTo(3.789f, 18.636f)
                curveTo(2.8f, 18.636f, 2.0f, 17.793f, 2.0f, 16.748f)
                verticalLineToRelative(-9.86f)
                curveTo(2.0f, 5.843f, 2.8f, 5.0f, 3.789f, 5.0f)
                close()
                moveTo(9.5f, 12.368f)
                curveToRelative(0.196f, 0.0f, 0.356f, 0.224f, 0.356f, 0.5f)
                curveToRelative(0.0f, 0.275f, -0.16f, 0.5f, -0.356f, 0.5f)
                lineTo(4.501f, 13.368f)
                curveToRelative(-0.196f, 0.0f, -0.356f, -0.225f, -0.356f, -0.5f)
                curveToRelative(0.0f, -0.276f, 0.16f, -0.5f, 0.356f, -0.5f)
                close()
                moveTo(14.138f, 12.368f)
                curveToRelative(0.196f, 0.0f, 0.356f, 0.224f, 0.356f, 0.5f)
                curveToRelative(0.0f, 0.275f, -0.16f, 0.5f, -0.356f, 0.5f)
                horizontalLineToRelative(-2.501f)
                curveToRelative(-0.196f, 0.0f, -0.356f, -0.225f, -0.356f, -0.5f)
                curveToRelative(0.0f, -0.276f, 0.16f, -0.5f, 0.356f, -0.5f)
                close()
                moveTo(19.484f, 12.368f)
                curveToRelative(0.204f, 0.0f, 0.356f, 0.224f, 0.356f, 0.5f)
                curveToRelative(0.0f, 0.275f, -0.16f, 0.5f, -0.356f, 0.5f)
                lineTo(16.27f, 13.368f)
                curveToRelative(-0.196f, 0.0f, -0.356f, -0.225f, -0.356f, -0.5f)
                curveToRelative(0.0f, -0.276f, 0.16f, -0.5f, 0.356f, -0.5f)
                close()
                moveTo(20.196f, 5.731f)
                lineTo(3.781f, 5.731f)
                curveToRelative(-0.593f, 0.0f, -1.069f, 0.517f, -1.069f, 1.153f)
                lineTo(2.712f, 9.05f)
                horizontalLineToRelative(18.552f)
                lineTo(21.264f, 6.884f)
                curveToRelative(0.0f, -0.636f, -0.476f, -1.153f, -1.069f, -1.153f)
                close()
            }
        }
        .build()
        return _creditCardLight!!
    }

private var _creditCardLight: ImageVector? = null
