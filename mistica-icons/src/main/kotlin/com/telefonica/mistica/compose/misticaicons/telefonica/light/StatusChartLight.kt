package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.StatusChartLight: ImageVector
    get() {
        if (_statusChartLight != null) {
            return _statusChartLight!!
        }
        _statusChartLight = Builder(name = "StatusChartLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.089f, 4.854f)
                arcToRelative(0.938f, 0.938f, 0.0f, false, true, 0.0f, -1.875f)
                curveToRelative(0.515f, 0.0f, 0.933f, 0.42f, 0.933f, 0.94f)
                curveToRelative(0.0f, 0.517f, -0.42f, 0.935f, -0.933f, 0.935f)
                moveToRelative(-4.43f, 7.33f)
                arcToRelative(0.938f, 0.938f, 0.0f, false, true, 0.0f, -1.874f)
                arcToRelative(0.938f, 0.938f, 0.0f, false, true, 0.0f, 1.875f)
                moveToRelative(-7.65f, -3.377f)
                arcToRelative(0.933f, 0.933f, 0.0f, false, true, -0.933f, -0.933f)
                verticalLineToRelative(-0.006f)
                curveToRelative(0.0f, -0.516f, 0.418f, -0.936f, 0.933f, -0.936f)
                curveToRelative(0.516f, 0.003f, 0.933f, 0.42f, 0.93f, 0.936f)
                arcToRelative(0.935f, 0.935f, 0.0f, false, true, -0.93f, 0.939f)
                moveToRelative(-4.102f, 7.288f)
                arcToRelative(0.935f, 0.935f, 0.0f, false, true, 0.0f, -1.872f)
                arcToRelative(0.937f, 0.937f, 0.0f, false, true, 0.0f, 1.872f)
                moveTo(20.086f, 2.15f)
                curveToRelative(-0.967f, 0.0f, -1.754f, 0.793f, -1.754f, 1.765f)
                curveToRelative(0.0f, 0.485f, 0.196f, 0.925f, 0.513f, 1.247f)
                lineToRelative(-2.623f, 4.422f)
                arcToRelative(1.629f, 1.629f, 0.0f, false, false, -0.566f, -0.101f)
                curveToRelative(-0.569f, 0.0f, -1.068f, 0.277f, -1.39f, 0.698f)
                lineToRelative(-4.54f, -2.004f)
                curveToRelative(0.02f, -0.1f, 0.032f, -0.204f, 0.032f, -0.308f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, -1.755f, -1.763f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, -1.193f, 3.05f)
                lineTo(4.383f, 13.47f)
                arcToRelative(1.729f, 1.729f, 0.0f, false, false, -0.479f, -0.075f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, -1.754f, 1.762f)
                curveToRelative(0.0f, 0.972f, 0.787f, 1.765f, 1.754f, 1.765f)
                arcToRelative(1.762f, 1.762f, 0.0f, false, false, 1.194f, -3.045f)
                lineToRelative(2.426f, -4.313f)
                curveToRelative(0.157f, 0.045f, 0.317f, 0.07f, 0.482f, 0.07f)
                curveToRelative(0.566f, 0.0f, 1.068f, -0.277f, 1.387f, -0.697f)
                lineToRelative(4.54f, 2.003f)
                curveToRelative(-0.02f, 0.1f, -0.031f, 0.205f, -0.031f, 0.308f)
                curveToRelative(0.0f, 0.973f, 0.787f, 1.766f, 1.754f, 1.766f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, 1.26f, -2.982f)
                lineToRelative(2.635f, -4.447f)
                curveToRelative(0.17f, 0.056f, 0.347f, 0.093f, 0.535f, 0.093f)
                curveToRelative(0.97f, 0.0f, 1.754f, -0.79f, 1.754f, -1.763f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, false, -1.754f, -1.765f)
            }
        }
        .build()
        return _statusChartLight!!
    }

private var _statusChartLight: ImageVector? = null
