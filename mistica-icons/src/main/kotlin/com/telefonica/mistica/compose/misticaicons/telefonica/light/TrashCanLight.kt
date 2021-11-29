package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.TrashCanLight: ImageVector
    get() {
        if (_trashCanLight != null) {
            return _trashCanLight!!
        }
        _trashCanLight = Builder(name = "TrashCanLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.905f, 18.713f)
                lineTo(18.905f, 7.167f)
                lineTo(5.053f, 7.167f)
                lineTo(5.053f, 18.73f)
                curveToRelative(0.0f, 0.042f, -0.056f, 1.023f, 0.563f, 1.67f)
                curveToRelative(0.387f, 0.409f, 0.967f, 0.622f, 1.72f, 0.622f)
                horizontalLineToRelative(9.258f)
                curveToRelative(0.034f, 0.0f, 1.04f, 0.033f, 1.703f, -0.614f)
                curveToRelative(0.403f, -0.384f, 0.608f, -0.958f, 0.608f, -1.695f)
                close()
                moveTo(8.199f, 4.296f)
                lineTo(8.199f, 6.35f)
                horizontalLineToRelative(7.563f)
                lineTo(15.762f, 4.302f)
                curveToRelative(0.0f, -0.034f, 0.034f, -0.656f, -0.32f, -1.031f)
                curveToRelative(-0.187f, -0.205f, -0.459f, -0.294f, -0.826f, -0.294f)
                lineTo(9.32f, 2.977f)
                curveToRelative(-0.042f, 0.0f, -0.468f, -0.034f, -0.77f, 0.246f)
                curveToRelative(-0.239f, 0.213f, -0.354f, 0.572f, -0.351f, 1.073f)
                close()
                moveTo(21.409f, 6.349f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.0f, 0.818f)
                horizontalLineToRelative(-1.686f)
                verticalLineToRelative(11.546f)
                curveToRelative(0.0f, 0.975f, -0.294f, 1.746f, -0.868f, 2.292f)
                curveToRelative(-0.81f, 0.787f, -1.933f, 0.834f, -2.21f, 0.834f)
                lineTo(7.338f, 21.839f)
                curveToRelative(-1.0f, 0.0f, -1.776f, -0.294f, -2.325f, -0.885f)
                curveToRelative(-0.86f, -0.916f, -0.779f, -2.201f, -0.779f, -2.252f)
                lineTo(4.234f, 7.167f)
                lineTo(2.541f, 7.167f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.0f, -0.818f)
                horizontalLineToRelative(4.837f)
                lineTo(7.378f, 4.296f)
                curveToRelative(0.0f, -0.745f, 0.205f, -1.31f, 0.622f, -1.686f)
                curveToRelative(0.583f, -0.516f, 1.328f, -0.451f, 1.359f, -0.451f)
                horizontalLineToRelative(5.255f)
                curveToRelative(0.605f, 0.0f, 1.08f, 0.188f, 1.425f, 0.557f)
                curveToRelative(0.597f, 0.639f, 0.541f, 1.58f, 0.541f, 1.62f)
                verticalLineToRelative(2.013f)
                horizontalLineToRelative(4.83f)
                close()
                moveTo(9.88f, 17.655f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, -0.408f, -0.41f)
                verticalLineToRelative(-6.29f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.818f, 0.0f)
                verticalLineToRelative(6.29f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, -0.41f, 0.41f)
                close()
                moveTo(14.074f, 17.655f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, -0.409f, -0.41f)
                verticalLineToRelative(-6.29f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.818f, 0.0f)
                verticalLineToRelative(6.29f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, -0.409f, 0.41f)
                close()
            }
        }
        .build()
        return _trashCanLight!!
    }

private var _trashCanLight: ImageVector? = null
