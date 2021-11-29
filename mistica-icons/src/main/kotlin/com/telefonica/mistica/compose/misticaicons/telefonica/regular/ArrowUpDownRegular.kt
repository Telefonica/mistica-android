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

public val RegularGroup.ArrowUpDownRegular: ImageVector
    get() {
        if (_arrowUpDownRegular != null) {
            return _arrowUpDownRegular!!
        }
        _arrowUpDownRegular = Builder(name = "ArrowUpDownRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.154f, 21.742f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, -0.566f, -0.255f)
                lineToRelative(-4.157f, -4.213f)
                arcToRelative(0.793f, 0.793f, 0.0f, false, true, -0.134f, -0.874f)
                arcToRelative(0.758f, 0.758f, 0.0f, false, true, 0.68f, -0.436f)
                lineToRelative(1.824f, -0.017f)
                lineToRelative(-0.003f, -2.897f)
                curveToRelative(0.0f, -0.663f, 0.538f, -1.201f, 1.202f, -1.201f)
                horizontalLineToRelative(2.32f)
                curveToRelative(0.663f, 0.0f, 1.201f, 0.538f, 1.201f, 1.201f)
                lineToRelative(0.003f, 2.905f)
                lineToRelative(1.826f, 0.014f)
                curveToRelative(0.294f, 0.0f, 0.555f, 0.168f, 0.684f, 0.437f)
                curveToRelative(0.128f, 0.272f, 0.09f, 0.6f, -0.101f, 0.832f)
                curveToRelative(-0.011f, 0.014f, -0.023f, 0.028f, -0.037f, 0.04f)
                lineToRelative(-4.176f, 4.21f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, -0.566f, 0.254f)
                close()
                moveTo(11.815f, 17.082f)
                lineTo(15.154f, 20.465f)
                lineTo(18.513f, 17.081f)
                lineTo(17.163f, 17.07f)
                horizontalLineToRelative(-0.012f)
                arcToRelative(0.769f, 0.769f, 0.0f, false, true, -0.748f, -0.779f)
                lineToRelative(-0.002f, -3.24f)
                arcToRelative(0.081f, 0.081f, 0.0f, false, false, -0.082f, -0.082f)
                lineTo(14.0f, 12.969f)
                arcToRelative(0.081f, 0.081f, 0.0f, false, false, -0.081f, 0.081f)
                lineToRelative(0.005f, 3.241f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, true, -0.745f, 0.779f)
                horizontalLineToRelative(-0.011f)
                lineToRelative(-1.353f, 0.011f)
                close()
                moveTo(9.775f, 11.91f)
                lineTo(7.46f, 11.91f)
                arcToRelative(1.201f, 1.201f, 0.0f, false, true, -1.201f, -1.201f)
                lineToRelative(-0.003f, -2.902f)
                lineToRelative(-1.824f, -0.014f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, -0.683f, -0.437f)
                arcToRelative(0.788f, 0.788f, 0.0f, false, true, 0.1f, -0.832f)
                curveToRelative(0.012f, -0.014f, 0.023f, -0.028f, 0.037f, -0.04f)
                lineTo(8.06f, 2.278f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.129f, 0.0f)
                lineToRelative(4.154f, 4.208f)
                arcToRelative(0.793f, 0.793f, 0.0f, false, true, 0.134f, 0.874f)
                arcToRelative(0.758f, 0.758f, 0.0f, false, true, -0.68f, 0.437f)
                lineToRelative(-1.821f, 0.014f)
                lineToRelative(0.003f, 2.899f)
                curveToRelative(0.0f, 0.66f, -0.538f, 1.201f, -1.202f, 1.201f)
                close()
                moveTo(7.375f, 7.468f)
                lineTo(7.378f, 10.706f)
                curveToRelative(0.0f, 0.045f, 0.037f, 0.081f, 0.081f, 0.081f)
                horizontalLineToRelative(2.317f)
                arcToRelative(0.081f, 0.081f, 0.0f, false, false, 0.081f, -0.081f)
                lineToRelative(-0.003f, -3.238f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, true, 0.745f, -0.779f)
                horizontalLineToRelative(0.012f)
                lineToRelative(1.35f, -0.011f)
                lineToRelative(-3.336f, -3.381f)
                lineToRelative(-3.353f, 3.38f)
                lineToRelative(1.347f, 0.012f)
                horizontalLineToRelative(0.011f)
                curveToRelative(0.42f, 0.011f, 0.75f, 0.361f, 0.745f, 0.779f)
                close()
            }
        }
        .build()
        return _arrowUpDownRegular!!
    }

private var _arrowUpDownRegular: ImageVector? = null
