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

public val FilledGroup.ElectrocardiogramFilled: ImageVector
    get() {
        if (_electrocardiogramFilled != null) {
            return _electrocardiogramFilled!!
        }
        _electrocardiogramFilled = Builder(name = "ElectrocardiogramFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.46f, 2.0f)
                curveTo(19.715f, 2.0f, 22.0f, 3.575f, 22.0f, 6.58f)
                lineToRelative(-0.003f, 0.196f)
                lineTo(22.0f, 7.0f)
                curveToRelative(0.0f, 2.292f, -1.276f, 5.195f, -3.892f, 8.86f)
                lineToRelative(-2.654f, 3.436f)
                verticalLineToRelative(0.039f)
                arcToRelative(73.347f, 73.347f, 0.0f, false, true, -2.947f, 3.435f)
                curveToRelative(-0.107f, 0.152f, -0.325f, 0.23f, -0.507f, 0.23f)
                lineToRelative(-0.109f, -0.01f)
                arcToRelative(0.723f, 0.723f, 0.0f, false, true, -0.398f, -0.22f)
                curveTo(8.4f, 19.296f, 2.0f, 12.077f, 2.0f, 7.0f)
                curveToRelative(0.0f, -0.094f, 0.002f, -0.185f, 0.005f, -0.276f)
                lineTo(2.0f, 6.544f)
                curveTo(2.0f, 3.428f, 4.25f, 2.0f, 6.357f, 2.0f)
                lineToRelative(0.128f, 0.001f)
                lineTo(6.58f, 2.0f)
                curveToRelative(2.072f, 0.0f, 3.566f, 0.875f, 5.419f, 3.284f)
                curveTo(13.853f, 2.801f, 15.203f, 2.0f, 17.237f, 2.0f)
                horizontalLineToRelative(0.083f)
                close()
                moveTo(12.005f, 6.965f)
                curveToRelative(-0.289f, 0.0f, -0.545f, 0.27f, -0.545f, 0.572f)
                verticalLineToRelative(4.008f)
                lineTo(7.642f, 11.545f)
                curveToRelative(-0.288f, 0.0f, -0.544f, 0.268f, -0.544f, 0.571f)
                curveToRelative(0.0f, 0.303f, 0.256f, 0.572f, 0.544f, 0.572f)
                horizontalLineToRelative(3.818f)
                verticalLineToRelative(4.008f)
                curveToRelative(0.0f, 0.303f, 0.256f, 0.571f, 0.545f, 0.571f)
                curveToRelative(0.288f, 0.0f, 0.544f, -0.268f, 0.544f, -0.571f)
                verticalLineToRelative(-4.008f)
                horizontalLineToRelative(3.818f)
                curveToRelative(0.288f, 0.0f, 0.545f, -0.269f, 0.545f, -0.572f)
                curveToRelative(0.0f, -0.303f, -0.257f, -0.571f, -0.545f, -0.571f)
                horizontalLineToRelative(-3.818f)
                lineTo(12.549f, 7.537f)
                curveToRelative(0.0f, -0.303f, -0.256f, -0.572f, -0.544f, -0.572f)
                close()
                moveTo(11.998f, 7.734f)
                curveToRelative(0.215f, 0.0f, 0.356f, 0.142f, 0.356f, 0.357f)
                verticalLineToRelative(3.577f)
                horizontalLineToRelative(3.57f)
                curveToRelative(0.215f, 0.0f, 0.357f, 0.142f, 0.357f, 0.357f)
                reflectiveCurveToRelative(-0.142f, 0.357f, -0.356f, 0.357f)
                horizontalLineToRelative(-3.57f)
                verticalLineToRelative(3.577f)
                curveToRelative(0.0f, 0.215f, -0.142f, 0.357f, -0.357f, 0.357f)
                reflectiveCurveToRelative(-0.357f, -0.146f, -0.357f, -0.357f)
                verticalLineToRelative(-3.577f)
                horizontalLineToRelative(-3.57f)
                curveToRelative(-0.215f, 0.0f, -0.357f, -0.142f, -0.357f, -0.357f)
                reflectiveCurveToRelative(0.142f, -0.357f, 0.357f, -0.357f)
                horizontalLineToRelative(3.57f)
                lineTo(11.641f, 8.091f)
                curveToRelative(0.0f, -0.215f, 0.142f, -0.357f, 0.357f, -0.357f)
                close()
            }
        }
        .build()
        return _electrocardiogramFilled!!
    }

private var _electrocardiogramFilled: ImageVector? = null
