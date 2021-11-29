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

public val RegularGroup.WaterDropRegular: ImageVector
    get() {
        if (_waterDropRegular != null) {
            return _waterDropRegular!!
        }
        _waterDropRegular = Builder(name = "WaterDropRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.15f, 17.717f)
                curveToRelative(1.117f, -1.143f, 1.71f, -2.643f, 1.71f, -4.252f)
                curveToRelative(0.0f, -2.002f, -1.393f, -4.288f, -2.509f, -6.144f)
                curveToRelative(-0.174f, -0.32f, -1.92f, -3.392f, -2.827f, -4.964f)
                curveToRelative(-0.138f, -0.215f, -0.348f, -0.357f, -0.594f, -0.357f)
                arcToRelative(0.674f, 0.674f, 0.0f, false, false, -0.594f, 0.357f)
                curveTo(9.43f, 3.929f, 7.72f, 7.0f, 7.51f, 7.285f)
                curveTo(6.393f, 9.14f, 5.0f, 11.463f, 5.0f, 13.465f)
                curveToRelative(0.0f, 1.61f, 0.63f, 3.14f, 1.746f, 4.288f)
                arcToRelative(5.816f, 5.816f, 0.0f, false, false, 4.189f, 1.751f)
                arcToRelative(6.149f, 6.149f, 0.0f, false, false, 4.215f, -1.787f)
                curveToRelative(-0.035f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(14.105f, 16.752f)
                arcToRelative(4.425f, 4.425f, 0.0f, false, true, -3.175f, 1.321f)
                arcToRelative(4.42f, 4.42f, 0.0f, false, true, -3.21f, -1.358f)
                curveToRelative(-0.871f, -0.859f, -1.327f, -2.034f, -1.327f, -3.25f)
                curveToRelative(0.0f, -1.609f, 1.29f, -3.716f, 2.305f, -5.394f)
                curveToRelative(0.174f, -0.284f, 1.464f, -2.537f, 2.232f, -3.927f)
                arcToRelative(198.452f, 198.452f, 0.0f, false, false, 2.233f, 3.927f)
                curveToRelative(1.014f, 1.714f, 2.304f, 3.822f, 2.304f, 5.394f)
                arcToRelative(4.737f, 4.737f, 0.0f, false, true, -1.362f, 3.287f)
                curveToRelative(0.032f, -0.037f, 0.032f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(19.478f, 16.647f)
                horizontalLineToRelative(-1.394f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, -0.522f, 0.535f)
                curveToRelative(0.0f, 0.283f, 0.245f, 0.535f, 0.522f, 0.535f)
                horizontalLineToRelative(1.394f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, 0.522f, -0.535f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, -0.522f, -0.535f)
                close()
                moveTo(17.245f, 18.576f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, false, -0.733f, 0.0f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, false, 0.0f, 0.75f)
                lineToRelative(0.943f, 0.964f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, false, 0.384f, 0.142f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, 0.384f, -0.142f)
                arcToRelative(0.525f, 0.525f, 0.0f, false, false, 0.0f, -0.75f)
                lineToRelative(-0.978f, -0.964f)
                close()
                moveTo(14.94f, 19.504f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, -0.522f, 0.535f)
                verticalLineToRelative(1.426f)
                curveToRelative(0.0f, 0.284f, 0.246f, 0.535f, 0.522f, 0.535f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, 0.523f, -0.535f)
                lineTo(15.463f, 20.04f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, false, -0.523f, -0.535f)
                close()
            }
        }
        .build()
        return _waterDropRegular!!
    }

private var _waterDropRegular: ImageVector? = null
