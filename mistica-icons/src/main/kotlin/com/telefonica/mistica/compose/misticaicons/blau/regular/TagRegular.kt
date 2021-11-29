package com.telefonica.mistica.compose.misticaicons.blau.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.blau.RegularGroup

public val RegularGroup.TagRegular: ImageVector
    get() {
        if (_tagRegular != null) {
            return _tagRegular!!
        }
        _tagRegular = Builder(name = "TagRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.093f, 18.094f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, -0.321f, 0.372f)
                lineToRelative(-4.228f, 2.114f)
                arcToRelative(0.642f, 0.642f, 0.0f, false, true, -0.86f, -0.286f)
                lineToRelative(-3.25f, -6.501f)
                lineToRelative(1.072f, -4.29f)
                lineToRelative(2.756f, 1.033f)
                curveToRelative(-0.158f, 0.665f, -0.54f, 1.115f, -0.89f, 1.115f)
                arcToRelative(0.676f, 0.676f, 0.0f, false, false, 0.0f, 1.353f)
                curveToRelative(0.999f, 0.0f, 1.834f, -0.816f, 2.166f, -1.99f)
                lineToRelative(0.278f, 0.105f)
                lineToRelative(3.243f, 6.487f)
                arcToRelative(0.636f, 0.636f, 0.0f, false, true, 0.034f, 0.488f)
                close()
                moveTo(10.028f, 8.604f)
                verticalLineToRelative(-2.05f)
                curveToRelative(0.263f, 0.465f, 0.494f, 0.875f, 0.603f, 1.073f)
                curveToRelative(0.341f, 0.618f, 0.517f, 1.08f, 0.611f, 1.457f)
                lineToRelative(-1.217f, -0.456f)
                curveToRelative(0.0f, -0.009f, 0.003f, -0.016f, 0.003f, -0.025f)
                close()
                moveTo(17.269f, 17.0f)
                lineToRelative(-3.481f, -6.962f)
                lineToRelative(-1.105f, -0.415f)
                curveToRelative(-0.046f, -0.832f, -0.31f, -1.641f, -0.867f, -2.65f)
                curveToRelative(-0.293f, -0.532f, -1.46f, -2.582f, -1.788f, -3.16f)
                lineTo(10.028f, 2.677f)
                arcToRelative(0.677f, 0.677f, 0.0f, false, false, -1.354f, 0.0f)
                verticalLineToRelative(5.445f)
                lineToRelative(-1.112f, -0.417f)
                lineTo(6.0f, 13.95f)
                lineToRelative(3.474f, 6.949f)
                arcToRelative(1.996f, 1.996f, 0.0f, false, false, 2.675f, 0.891f)
                lineToRelative(4.229f, -2.115f)
                curveToRelative(0.475f, -0.237f, 0.83f, -0.647f, 0.998f, -1.153f)
                arcToRelative(1.975f, 1.975f, 0.0f, false, false, -0.107f, -1.521f)
                close()
            }
        }
        .build()
        return _tagRegular!!
    }

private var _tagRegular: ImageVector? = null
