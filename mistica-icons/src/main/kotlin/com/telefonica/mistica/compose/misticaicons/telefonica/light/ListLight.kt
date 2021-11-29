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

public val LightGroup.ListLight: ImageVector
    get() {
        if (_listLight != null) {
            return _listLight!!
        }
        _listLight = Builder(name = "ListLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.541f, 7.336f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, -0.58f, -0.56f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, 0.58f, -0.56f)
                horizontalLineToRelative(15.725f)
                curveToRelative(0.32f, 0.0f, 0.58f, 0.249f, 0.58f, 0.56f)
                curveToRelative(0.0f, 0.308f, -0.26f, 0.56f, -0.58f, 0.56f)
                lineTo(5.541f, 7.336f)
                close()
                moveTo(3.11f, 7.716f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, true, -0.95f, -0.938f)
                curveToRelative(0.0f, -0.518f, 0.426f, -0.938f, 0.95f, -0.938f)
                curveToRelative(0.523f, 0.0f, 0.95f, 0.42f, 0.95f, 0.938f)
                arcToRelative(0.946f, 0.946f, 0.0f, false, true, -0.95f, 0.939f)
                close()
                moveTo(21.266f, 11.428f)
                curveToRelative(0.32f, 0.0f, 0.58f, 0.25f, 0.58f, 0.56f)
                curveToRelative(0.0f, 0.311f, -0.26f, 0.56f, -0.58f, 0.56f)
                lineTo(5.541f, 12.548f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, -0.58f, -0.56f)
                curveToRelative(0.0f, -0.31f, 0.26f, -0.56f, 0.58f, -0.56f)
                horizontalLineToRelative(15.725f)
                close()
                moveTo(3.11f, 12.927f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, true, -0.95f, -0.939f)
                curveToRelative(0.0f, -0.518f, 0.426f, -0.938f, 0.95f, -0.938f)
                curveToRelative(0.523f, 0.0f, 0.95f, 0.42f, 0.95f, 0.938f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, true, -0.95f, 0.939f)
                close()
                moveTo(21.266f, 16.641f)
                curveToRelative(0.155f, 0.0f, 0.3f, 0.059f, 0.41f, 0.163f)
                curveToRelative(0.109f, 0.103f, 0.17f, 0.246f, 0.17f, 0.395f)
                curveToRelative(0.0f, 0.308f, -0.26f, 0.56f, -0.58f, 0.56f)
                lineTo(5.541f, 17.759f)
                arcToRelative(0.581f, 0.581f, 0.0f, false, true, -0.58f, -0.56f)
                curveToRelative(0.0f, -0.309f, 0.26f, -0.56f, 0.58f, -0.56f)
                horizontalLineToRelative(15.725f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(3.11f, 18.14f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, true, -0.95f, -0.939f)
                curveToRelative(0.0f, -0.518f, 0.426f, -0.938f, 0.95f, -0.938f)
                curveToRelative(0.523f, 0.0f, 0.95f, 0.42f, 0.95f, 0.938f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, true, -0.95f, 0.939f)
                close()
            }
        }
        .build()
        return _listLight!!
    }

private var _listLight: ImageVector? = null
