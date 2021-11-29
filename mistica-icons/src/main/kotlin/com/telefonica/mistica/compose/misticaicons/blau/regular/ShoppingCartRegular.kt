package com.telefonica.mistica.compose.misticaicons.blau.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.blau.RegularGroup

public val RegularGroup.ShoppingCartRegular: ImageVector
    get() {
        if (_shoppingCartRegular != null) {
            return _shoppingCartRegular!!
        }
        _shoppingCartRegular = Builder(name = "ShoppingCartRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.775f, 18.8f)
                arcToRelative(1.6f, 1.6f, 0.0f, true, true, -0.003f, 3.2f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 0.003f, -3.2f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(16.215f, 18.8f)
                    arcToRelative(1.6f, 1.6f, 0.0f, true, true, -0.002f, 3.2f)
                    arcToRelative(1.6f, 1.6f, 0.0f, false, true, 0.002f, -3.2f)
                    close()
                    moveTo(7.136f, 7.656f)
                    lineToRelative(2.055f, 7.81f)
                    lineToRelative(8.273f, -1.91f)
                    lineToRelative(1.77f, -5.9f)
                    lineTo(7.136f, 7.656f)
                    close()
                    moveTo(8.21f, 17.09f)
                    lineTo(4.598f, 3.362f)
                    lineTo(2.976f, 3.362f)
                    lineTo(2.976f, 2.0f)
                    horizontalLineToRelative(2.672f)
                    lineToRelative(1.13f, 4.294f)
                    horizontalLineToRelative(14.288f)
                    lineToRelative(-2.524f, 8.412f)
                    lineTo(8.21f, 17.09f)
                    close()
                }
            }
        }
        .build()
        return _shoppingCartRegular!!
    }

private var _shoppingCartRegular: ImageVector? = null
