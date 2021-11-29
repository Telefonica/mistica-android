package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.ConnectionsFilled: ImageVector
    get() {
        if (_connectionsFilled != null) {
            return _connectionsFilled!!
        }
        _connectionsFilled = Builder(name = "ConnectionsFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.871f, 11.938f)
                curveToRelative(-0.927f, 0.0f, -1.765f, 0.345f, -2.423f, 0.894f)
                lineToRelative(-1.524f, -1.336f)
                curveToRelative(0.44f, -0.61f, 0.709f, -1.356f, 0.709f, -2.165f)
                curveToRelative(0.0f, -0.096f, -0.022f, -0.185f, -0.028f, -0.278f)
                lineToRelative(2.4f, -0.708f)
                arcToRelative(2.451f, 2.451f, 0.0f, false, false, 2.093f, 1.182f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, false, 2.46f, -2.46f)
                arcToRelative(2.463f, 2.463f, 0.0f, false, false, -2.46f, -2.46f)
                arcToRelative(2.465f, 2.465f, 0.0f, false, false, -2.462f, 2.46f)
                curveToRelative(0.0f, 0.023f, 0.005f, 0.04f, 0.005f, 0.062f)
                lineToRelative(-2.339f, 0.689f)
                arcToRelative(3.724f, 3.724f, 0.0f, false, false, -3.389f, -2.205f)
                curveToRelative(-1.03f, 0.0f, -1.96f, 0.42f, -2.636f, 1.098f)
                lineToRelative(-1.49f, -1.277f)
                curveToRelative(0.182f, -0.328f, 0.297f, -0.703f, 0.297f, -1.106f)
                arcToRelative(2.307f, 2.307f, 0.0f, false, false, -4.613f, 0.0f)
                arcToRelative(2.307f, 2.307f, 0.0f, false, false, 2.305f, 2.305f)
                curveToRelative(0.406f, 0.0f, 0.781f, -0.112f, 1.112f, -0.297f)
                lineToRelative(1.667f, 1.426f)
                arcToRelative(3.68f, 3.68f, 0.0f, false, false, -0.359f, 1.566f)
                curveToRelative(0.0f, 0.792f, 0.255f, 1.526f, 0.68f, 2.131f)
                lineToRelative(-1.355f, 1.328f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -1.742f, -0.633f)
                arcToRelative(2.778f, 2.778f, 0.0f, false, false, -2.776f, 2.773f)
                arcToRelative(2.776f, 2.776f, 0.0f, false, false, 5.552f, 0.0f)
                curveToRelative(0.0f, -0.403f, -0.093f, -0.787f, -0.25f, -1.134f)
                lineToRelative(1.47f, -1.437f)
                arcToRelative(3.69f, 3.69f, 0.0f, false, false, 4.247f, 0.028f)
                lineToRelative(1.597f, 1.4f)
                arcToRelative(3.763f, 3.763f, 0.0f, false, false, -0.557f, 1.958f)
                curveToRelative(0.0f, 0.496f, 0.1f, 0.964f, 0.274f, 1.398f)
                lineToRelative(-1.661f, 0.765f)
                arcToRelative(2.296f, 2.296f, 0.0f, false, false, -1.742f, -0.81f)
                arcTo(2.31f, 2.31f, 0.0f, false, false, 8.625f, 19.4f)
                arcToRelative(2.307f, 2.307f, 0.0f, false, false, 4.613f, 0.0f)
                curveToRelative(0.0f, -0.117f, -0.017f, -0.23f, -0.034f, -0.341f)
                lineToRelative(1.804f, -0.83f)
                curveToRelative(0.7f, 0.805f, 1.72f, 1.326f, 2.866f, 1.326f)
                arcToRelative(3.816f, 3.816f, 0.0f, false, false, 3.815f, -3.81f)
                arcToRelative(3.822f, 3.822f, 0.0f, false, false, -3.818f, -3.807f)
            }
        }
        .build()
        return _connectionsFilled!!
    }

private var _connectionsFilled: ImageVector? = null
