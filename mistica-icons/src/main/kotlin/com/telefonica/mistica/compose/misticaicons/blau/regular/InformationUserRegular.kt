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

public val RegularGroup.InformationUserRegular: ImageVector
    get() {
        if (_informationUserRegular != null) {
            return _informationUserRegular!!
        }
        _informationUserRegular = Builder(name = "InformationUserRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.976f, 3.355f)
                    curveToRelative(-4.606f, 0.0f, -8.645f, 4.04f, -8.645f, 8.645f)
                    curveToRelative(0.0f, 4.606f, 4.039f, 8.645f, 8.645f, 8.645f)
                    curveToRelative(4.605f, 0.0f, 8.645f, -4.04f, 8.645f, -8.645f)
                    curveToRelative(0.0f, -4.605f, -4.04f, -8.645f, -8.645f, -8.645f)
                    close()
                    moveTo(11.976f, 22.0f)
                    curveToRelative(-5.327f, 0.0f, -10.0f, -4.673f, -10.0f, -10.0f)
                    reflectiveCurveToRelative(4.673f, -10.0f, 10.0f, -10.0f)
                    reflectiveCurveToRelative(10.0f, 4.673f, 10.0f, 10.0f)
                    reflectiveCurveToRelative(-4.673f, 10.0f, -10.0f, 10.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(11.983f, 6.139f)
                    arcToRelative(1.2f, 1.2f, 0.0f, true, true, -0.001f, 2.399f)
                    arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.001f, -2.4f)
                    close()
                    moveTo(11.298f, 17.932f)
                    horizontalLineToRelative(1.355f)
                    verticalLineToRelative(-6.78f)
                    horizontalLineToRelative(-1.355f)
                    close()
                }
            }
        }
        .build()
        return _informationUserRegular!!
    }

private var _informationUserRegular: ImageVector? = null
