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

public val LightGroup.ApartmentBuildingLight: ImageVector
    get() {
        if (_apartmentBuildingLight != null) {
            return _apartmentBuildingLight!!
        }
        _apartmentBuildingLight = Builder(name = "ApartmentBuildingLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.641f, 21.623f)
                curveToRelative(0.0f, 0.208f, -0.16f, 0.377f, -0.358f, 0.377f)
                horizontalLineToRelative(-7.896f)
                verticalLineToRelative(-5.662f)
                lineTo(7.514f, 16.338f)
                lineTo(7.514f, 22.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 2.377f)
                curveTo(5.0f, 2.169f, 5.16f, 2.0f, 5.359f, 2.0f)
                horizontalLineToRelative(12.924f)
                curveToRelative(0.198f, 0.0f, 0.358f, 0.17f, 0.358f, 0.377f)
                verticalLineToRelative(14.72f)
                curveToRelative(0.0f, 0.207f, -0.16f, 0.376f, -0.358f, 0.376f)
                arcToRelative(0.368f, 0.368f, 0.0f, false, true, -0.359f, -0.376f)
                lineTo(17.924f, 2.754f)
                lineTo(5.717f, 2.754f)
                verticalLineToRelative(18.492f)
                horizontalLineToRelative(1.076f)
                verticalLineToRelative(-5.661f)
                horizontalLineToRelative(4.31f)
                verticalLineToRelative(5.661f)
                horizontalLineToRelative(7.18f)
                curveToRelative(0.198f, 0.0f, 0.358f, 0.17f, 0.358f, 0.377f)
                close()
                moveTo(18.283f, 18.603f)
                curveToRelative(-0.395f, 0.0f, -0.717f, 0.339f, -0.717f, 0.754f)
                curveToRelative(0.0f, 0.416f, 0.322f, 0.754f, 0.717f, 0.754f)
                curveToRelative(0.395f, 0.0f, 0.717f, -0.338f, 0.717f, -0.754f)
                curveToRelative(0.0f, -0.415f, -0.317f, -0.753f, -0.717f, -0.753f)
                close()
                moveTo(6.793f, 9.923f)
                horizontalLineToRelative(4.31f)
                verticalLineToRelative(3.019f)
                horizontalLineToRelative(-4.31f)
                verticalLineToRelative(-3.02f)
                close()
                moveTo(7.51f, 12.188f)
                horizontalLineToRelative(2.872f)
                verticalLineToRelative(-1.507f)
                lineTo(7.51f, 10.681f)
                verticalLineToRelative(1.507f)
                close()
                moveTo(16.849f, 12.942f)
                horizontalLineToRelative(-4.311f)
                verticalLineToRelative(-3.02f)
                horizontalLineToRelative(4.311f)
                verticalLineToRelative(3.02f)
                close()
                moveTo(16.132f, 10.682f)
                horizontalLineToRelative(-2.873f)
                verticalLineToRelative(1.506f)
                horizontalLineToRelative(2.873f)
                verticalLineToRelative(-1.507f)
                close()
                moveTo(12.538f, 15.585f)
                horizontalLineToRelative(4.311f)
                verticalLineToRelative(3.019f)
                horizontalLineToRelative(-4.311f)
                verticalLineToRelative(-3.02f)
                close()
                moveTo(13.255f, 17.85f)
                horizontalLineToRelative(2.872f)
                verticalLineToRelative(-1.507f)
                horizontalLineToRelative(-2.872f)
                verticalLineToRelative(1.507f)
                close()
                moveTo(11.104f, 7.657f)
                lineTo(6.793f, 7.657f)
                lineTo(6.793f, 4.643f)
                horizontalLineToRelative(4.31f)
                verticalLineToRelative(3.014f)
                close()
                moveTo(10.387f, 5.397f)
                lineTo(7.514f, 5.397f)
                verticalLineToRelative(1.506f)
                horizontalLineToRelative(2.873f)
                lineTo(10.387f, 5.396f)
                close()
                moveTo(16.849f, 7.657f)
                horizontalLineToRelative(-4.311f)
                lineTo(12.538f, 4.643f)
                horizontalLineToRelative(4.311f)
                verticalLineToRelative(3.014f)
                close()
                moveTo(16.132f, 5.397f)
                horizontalLineToRelative(-2.873f)
                verticalLineToRelative(1.506f)
                horizontalLineToRelative(2.873f)
                lineTo(16.132f, 5.396f)
                close()
            }
        }
        .build()
        return _apartmentBuildingLight!!
    }

private var _apartmentBuildingLight: ImageVector? = null
