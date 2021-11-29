package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.MedicalHistoryFilled: ImageVector
    get() {
        if (_medicalHistoryFilled != null) {
            return _medicalHistoryFilled!!
        }
        _medicalHistoryFilled = Builder(name = "MedicalHistoryFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.817f, 3.074f)
                horizontalLineToRelative(-1.089f)
                verticalLineToRelative(2.857f)
                lineTo(7.272f, 5.931f)
                lineTo(7.272f, 3.074f)
                horizontalLineToRelative(-1.09f)
                curveTo(4.983f, 3.074f, 4.0f, 4.04f, 4.0f, 5.218f)
                verticalLineToRelative(6.071f)
                horizontalLineToRelative(1.857f)
                lineToRelative(1.638f, -2.784f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, 0.475f, -0.283f)
                curveToRelative(0.186f, 0.0f, 0.363f, 0.105f, 0.474f, 0.283f)
                lineToRelative(2.509f, 4.252f)
                lineToRelative(1.89f, -3.25f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, 0.474f, -0.284f)
                curveToRelative(0.182f, 0.0f, 0.363f, 0.105f, 0.475f, 0.283f)
                lineToRelative(0.982f, 1.395f)
                horizontalLineToRelative(1.42f)
                curveToRelative(0.288f, 0.0f, 0.544f, 0.251f, 0.544f, 0.534f)
                curveToRelative(0.0f, 0.284f, -0.256f, 0.572f, -0.545f, 0.572f)
                horizontalLineToRelative(-1.745f)
                arcToRelative(0.574f, 0.574f, 0.0f, false, true, -0.475f, -0.284f)
                lineToRelative(-0.665f, -0.864f)
                lineToRelative(-1.89f, 3.25f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.474f, 0.284f)
                arcToRelative(0.568f, 0.568f, 0.0f, false, true, -0.475f, -0.283f)
                lineTo(7.96f, 9.858f)
                lineToRelative(-1.307f, 2.25f)
                arcToRelative(0.574f, 0.574f, 0.0f, false, true, -0.475f, 0.25f)
                lineTo(4.0f, 12.358f)
                lineTo(4.0f, 22.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.218f)
                curveToRelative(0.0f, -1.18f, -0.982f, -2.144f, -2.183f, -2.144f)
                close()
                moveTo(15.817f, 17.717f)
                lineTo(8.183f, 17.717f)
                arcToRelative(0.556f, 0.556f, 0.0f, false, true, -0.545f, -0.535f)
                curveToRelative(0.0f, -0.284f, 0.256f, -0.535f, 0.545f, -0.535f)
                horizontalLineToRelative(7.632f)
                curveToRelative(0.289f, 0.0f, 0.545f, 0.251f, 0.545f, 0.535f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, true, -0.545f, 0.535f)
                close()
                moveTo(15.347f, 4.862f)
                horizontalLineToRelative(0.288f)
                lineTo(15.635f, 2.0f)
                horizontalLineToRelative(-7.27f)
                verticalLineToRelative(2.857f)
                horizontalLineToRelative(6.981f)
                verticalLineToRelative(0.005f)
                close()
            }
        }
        .build()
        return _medicalHistoryFilled!!
    }

private var _medicalHistoryFilled: ImageVector? = null
