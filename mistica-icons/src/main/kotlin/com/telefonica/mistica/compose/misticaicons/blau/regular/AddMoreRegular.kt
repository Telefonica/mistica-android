package com.telefonica.mistica.compose.misticaicons.blau.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.blau.RegularGroup

public val RegularGroup.AddMoreRegular: ImageVector
    get() {
        if (_addMoreRegular != null) {
            return _addMoreRegular!!
        }
        _addMoreRegular = Builder(name = "AddMoreRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(18.524f, 11.525f)
                    lineTo(12.467f, 11.525f)
                    lineTo(12.467f, 5.475f)
                    arcToRelative(0.475f, 0.475f, 0.0f, false, false, -0.951f, 0.0f)
                    verticalLineToRelative(6.05f)
                    lineTo(5.459f, 11.525f)
                    arcToRelative(0.476f, 0.476f, 0.0f, true, false, 0.0f, 0.95f)
                    horizontalLineToRelative(6.057f)
                    verticalLineToRelative(6.05f)
                    arcToRelative(0.476f, 0.476f, 0.0f, false, false, 0.95f, 0.0f)
                    verticalLineToRelative(-6.05f)
                    horizontalLineToRelative(6.058f)
                    arcToRelative(0.475f, 0.475f, 0.0f, true, false, 0.0f, -0.95f)
                    close()
                }
            }
        }
        .build()
        return _addMoreRegular!!
    }

private var _addMoreRegular: ImageVector? = null
