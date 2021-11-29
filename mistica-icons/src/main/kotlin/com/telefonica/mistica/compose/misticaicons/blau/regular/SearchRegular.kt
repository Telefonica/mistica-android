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

public val RegularGroup.SearchRegular: ImageVector
    get() {
        if (_searchRegular != null) {
            return _searchRegular!!
        }
        _searchRegular = Builder(name = "SearchRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(10.192f, 17.07f)
                    arcToRelative(6.86f, 6.86f, 0.0f, false, true, -6.853f, -6.854f)
                    arcToRelative(6.86f, 6.86f, 0.0f, false, true, 6.853f, -6.853f)
                    arcToRelative(6.861f, 6.861f, 0.0f, false, true, 6.854f, 6.853f)
                    arcToRelative(6.862f, 6.862f, 0.0f, false, true, -6.854f, 6.853f)
                    close()
                    moveTo(21.976f, 21.036f)
                    lineTo(16.458f, 15.518f)
                    arcToRelative(8.174f, 8.174f, 0.0f, false, false, 1.95f, -5.302f)
                    curveTo(18.408f, 5.686f, 14.723f, 2.0f, 10.192f, 2.0f)
                    curveTo(5.662f, 2.0f, 1.976f, 5.686f, 1.976f, 10.216f)
                    curveToRelative(0.0f, 4.53f, 3.686f, 8.216f, 8.216f, 8.216f)
                    arcToRelative(8.17f, 8.17f, 0.0f, false, false, 5.302f, -1.95f)
                    lineTo(21.012f, 22.0f)
                    lineToRelative(0.964f, -0.964f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(9.292f, 5.712f)
                    arcToRelative(0.68f, 0.68f, 0.0f, true, false, 0.43f, 1.293f)
                    arcToRelative(3.09f, 3.09f, 0.0f, false, true, 3.903f, 1.953f)
                    arcToRelative(0.682f, 0.682f, 0.0f, false, false, 1.293f, -0.43f)
                    arcToRelative(4.454f, 4.454f, 0.0f, false, false, -5.626f, -2.816f)
                    close()
                }
            }
        }
        .build()
        return _searchRegular!!
    }

private var _searchRegular: ImageVector? = null
