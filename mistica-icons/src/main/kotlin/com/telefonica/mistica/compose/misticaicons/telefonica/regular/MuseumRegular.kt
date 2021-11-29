package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.MuseumRegular: ImageVector
    get() {
        if (_museumRegular != null) {
            return _museumRegular!!
        }
        _museumRegular = Builder(name = "MuseumRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.654f, 2.27f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, 0.7f, 0.0f)
                lineToRelative(9.23f, 6.43f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, true, 0.235f, 0.692f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.585f, 0.432f)
                lineTo(21.234f, 9.82f)
                horizontalLineToRelative(-1.799f)
                verticalLineToRelative(7.852f)
                horizontalLineToRelative(1.745f)
                curveToRelative(0.34f, 0.0f, 0.614f, 0.277f, 0.614f, 0.616f)
                verticalLineToRelative(2.938f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, -0.614f, 0.616f)
                lineTo(2.825f, 21.842f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, -0.614f, -0.616f)
                lineTo(2.211f, 18.29f)
                curveToRelative(0.0f, -0.34f, 0.275f, -0.616f, 0.614f, -0.616f)
                horizontalLineToRelative(1.778f)
                lineTo(4.603f, 9.82f)
                lineTo(2.774f, 9.82f)
                arcToRelative(0.614f, 0.614f, 0.0f, false, true, -0.35f, -1.12f)
                close()
                moveTo(20.57f, 18.908f)
                lineTo(3.44f, 18.908f)
                verticalLineToRelative(1.706f)
                horizontalLineToRelative(17.13f)
                verticalLineToRelative(-1.706f)
                close()
                moveTo(18.208f, 9.824f)
                horizontalLineToRelative(-1.17f)
                verticalLineToRelative(7.851f)
                horizontalLineToRelative(1.17f)
                lineTo(18.208f, 9.824f)
                close()
                moveTo(7.004f, 9.824f)
                lineTo(5.833f, 9.824f)
                verticalLineToRelative(7.851f)
                horizontalLineToRelative(1.17f)
                lineTo(7.003f, 9.824f)
                close()
                moveTo(12.604f, 9.824f)
                horizontalLineToRelative(-1.172f)
                verticalLineToRelative(7.851f)
                horizontalLineToRelative(1.171f)
                lineTo(12.603f, 9.824f)
                close()
                moveTo(10.208f, 9.824f)
                lineTo(8.234f, 9.824f)
                verticalLineToRelative(7.851f)
                horizontalLineToRelative(1.974f)
                lineTo(10.208f, 9.824f)
                close()
                moveTo(15.808f, 9.824f)
                horizontalLineToRelative(-1.975f)
                verticalLineToRelative(7.851f)
                horizontalLineToRelative(1.975f)
                lineTo(15.808f, 9.824f)
                close()
                moveTo(12.004f, 3.527f)
                lineTo(4.734f, 8.59f)
                horizontalLineToRelative(0.474f)
                curveToRelative(0.006f, 0.0f, 0.006f, -0.002f, 0.009f, -0.002f)
                lineToRelative(0.008f, 0.002f)
                lineTo(7.61f, 8.59f)
                lineToRelative(0.008f, -0.002f)
                lineToRelative(0.009f, 0.002f)
                horizontalLineToRelative(3.185f)
                lineToRelative(0.008f, -0.002f)
                lineToRelative(0.008f, 0.002f)
                horizontalLineToRelative(2.384f)
                lineToRelative(0.009f, -0.002f)
                lineToRelative(0.008f, 0.002f)
                horizontalLineToRelative(3.185f)
                lineToRelative(0.008f, -0.002f)
                lineToRelative(0.009f, 0.002f)
                horizontalLineToRelative(2.383f)
                lineToRelative(0.009f, -0.002f)
                lineToRelative(0.008f, 0.002f)
                horizontalLineToRelative(0.443f)
                lineToRelative(-7.27f, -5.064f)
                close()
            }
        }
        .build()
        return _museumRegular!!
    }

private var _museumRegular: ImageVector? = null
