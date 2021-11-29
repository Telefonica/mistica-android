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

public val RegularGroup.HeartRegular: ImageVector
    get() {
        if (_heartRegular != null) {
            return _heartRegular!!
        }
        _heartRegular = Builder(name = "HeartRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.002f, 22.0f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, true, -0.524f, -0.24f)
                curveToRelative(-1.464f, -1.648f, -3.907f, -4.404f, -5.91f, -7.294f)
                curveTo(3.167f, 10.996f, 2.0f, 8.224f, 2.0f, 5.988f)
                curveToRelative(0.0f, -1.506f, 0.484f, -2.79f, 1.4f, -3.7f)
                curveTo(4.228f, 1.458f, 5.36f, 1.0f, 6.58f, 1.0f)
                curveToRelative(2.079f, 0.0f, 3.562f, 0.877f, 5.418f, 3.28f)
                curveToRelative(0.88f, -1.153f, 1.612f, -1.908f, 2.324f, -2.403f)
                curveToRelative(0.867f, -0.604f, 1.771f, -0.877f, 2.93f, -0.877f)
                curveToRelative(1.229f, 0.0f, 2.38f, 0.453f, 3.252f, 1.271f)
                curveToRelative(0.98f, 0.923f, 1.496f, 2.207f, 1.496f, 3.717f)
                curveToRelative(0.0f, 2.315f, -1.264f, 5.223f, -3.86f, 8.885f)
                curveToRelative(-0.003f, 0.008f, -0.011f, 0.017f, -0.015f, 0.025f)
                lineToRelative(-2.628f, 3.406f)
                curveToRelative(-0.004f, 0.009f, -0.012f, 0.013f, -0.016f, 0.021f)
                arcToRelative(123.58f, 123.58f, 0.0f, false, true, -2.96f, 3.432f)
                arcToRelative(0.694f, 0.694f, 0.0f, false, true, -0.519f, 0.243f)
                close()
                moveTo(6.579f, 2.502f)
                curveToRelative(-1.568f, 0.0f, -3.151f, 1.078f, -3.151f, 3.486f)
                curveToRelative(0.0f, 1.88f, 1.107f, 4.438f, 3.3f, 7.597f)
                curveToRelative(1.727f, 2.496f, 3.818f, 4.916f, 5.274f, 6.56f)
                curveToRelative(0.68f, -0.771f, 1.536f, -1.753f, 2.396f, -2.789f)
                lineToRelative(2.611f, -3.385f)
                curveToRelative(2.368f, -3.344f, 3.567f, -6.028f, 3.567f, -7.979f)
                curveToRelative(0.0f, -2.395f, -1.72f, -3.486f, -3.315f, -3.486f)
                curveToRelative(-1.532f, 0.0f, -2.572f, 0.5f, -4.683f, 3.457f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, -0.572f, 0.302f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, -0.572f, -0.302f)
                curveTo(9.347f, 3.035f, 8.163f, 2.502f, 6.58f, 2.502f)
                close()
            }
        }
        .build()
        return _heartRegular!!
    }

private var _heartRegular: ImageVector? = null
