package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.MedicalHistoryRegular: ImageVector
    get() {
        if (_medicalHistoryRegular != null) {
            return _medicalHistoryRegular!!
        }
        _medicalHistoryRegular = Builder(name = "MedicalHistoryRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.817f, 3.074f)
                horizontalLineToRelative(-1.82f)
                lineTo(15.997f, 2.0f)
                lineTo(8.003f, 2.0f)
                verticalLineToRelative(1.07f)
                horizontalLineToRelative(-1.82f)
                curveTo(4.983f, 3.07f, 4.0f, 4.034f, 4.0f, 5.214f)
                lineTo(4.0f, 22.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.218f)
                curveToRelative(0.0f, -1.18f, -0.982f, -2.144f, -2.183f, -2.144f)
                close()
                moveTo(9.054f, 3.074f)
                horizontalLineToRelative(5.855f)
                verticalLineToRelative(1.788f)
                lineTo(9.054f, 4.862f)
                lineTo(9.054f, 3.074f)
                close()
                moveTo(18.544f, 20.574f)
                lineTo(5.456f, 20.574f)
                verticalLineToRelative(-8.215f)
                horizontalLineToRelative(0.726f)
                curveToRelative(0.181f, 0.0f, 0.4f, -0.105f, 0.474f, -0.284f)
                lineToRelative(1.308f, -2.39f)
                lineToRelative(2.471f, 4.178f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, 0.475f, 0.251f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, false, 0.475f, -0.251f)
                lineToRelative(1.852f, -3.14f)
                lineToRelative(0.8f, 1.357f)
                curveToRelative(0.145f, 0.178f, 0.326f, 0.283f, 0.508f, 0.283f)
                horizontalLineToRelative(1.452f)
                arcToRelative(0.556f, 0.556f, 0.0f, false, false, 0.544f, -0.534f)
                arcToRelative(0.556f, 0.556f, 0.0f, false, false, -0.544f, -0.535f)
                lineTo(14.87f, 11.294f)
                lineToRelative(-1.126f, -1.897f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, false, -0.474f, -0.252f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, false, -0.475f, 0.252f)
                lineToRelative(-1.852f, 3.145f)
                lineToRelative(-2.509f, -4.215f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, -0.475f, -0.252f)
                arcToRelative(0.568f, 0.568f, 0.0f, false, false, -0.474f, 0.284f)
                lineToRelative(-1.63f, 2.93f)
                horizontalLineToRelative(-0.4f)
                lineTo(5.455f, 5.22f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 0.727f, -0.714f)
                horizontalLineToRelative(1.82f)
                verticalLineToRelative(1.426f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.43f)
                horizontalLineToRelative(1.814f)
                curveToRelative(0.4f, 0.0f, 0.726f, 0.32f, 0.726f, 0.713f)
                verticalLineToRelative(15.36f)
                close()
                moveTo(16.179f, 16.647f)
                lineTo(7.821f, 16.647f)
                arcToRelative(0.556f, 0.556f, 0.0f, false, false, -0.545f, 0.535f)
                curveToRelative(0.0f, 0.283f, 0.256f, 0.535f, 0.545f, 0.535f)
                horizontalLineToRelative(8.363f)
                arcToRelative(0.556f, 0.556f, 0.0f, false, false, 0.544f, -0.535f)
                arcToRelative(0.557f, 0.557f, 0.0f, false, false, -0.549f, -0.535f)
                close()
            }
        }
        .build()
        return _medicalHistoryRegular!!
    }

private var _medicalHistoryRegular: ImageVector? = null
