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

public val RegularGroup.SportBallRegular: ImageVector
    get() {
        if (_sportBallRegular != null) {
            return _sportBallRegular!!
        }
        _sportBallRegular = Builder(name = "SportBallRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.524f, 18.269f)
                curveToRelative(-0.972f, -1.507f, -1.583f, -3.602f, -1.692f, -5.838f)
                horizontalLineToRelative(4.566f)
                arcToRelative(8.546f, 8.546f, 0.0f, false, true, -2.874f, 5.838f)
                moveToRelative(-5.028f, 2.126f)
                verticalLineToRelative(-7.966f)
                horizontalLineToRelative(2.075f)
                curveToRelative(0.118f, 2.512f, 0.821f, 4.89f, 1.953f, 6.602f)
                arcToRelative(8.416f, 8.416f, 0.0f, false, true, -4.028f, 1.364f)
                moveToRelative(-3.434f, -7.966f)
                horizontalLineToRelative(2.179f)
                verticalLineToRelative(7.974f)
                arcToRelative(8.602f, 8.602f, 0.0f, false, true, -4.129f, -1.397f)
                curveToRelative(1.146f, -1.726f, 1.832f, -4.054f, 1.95f, -6.577f)
                moveToRelative(-5.78f, 0.0f)
                horizontalLineToRelative(4.522f)
                curveToRelative(-0.107f, 2.212f, -0.72f, 4.296f, -1.684f, 5.803f)
                arcToRelative(8.597f, 8.597f, 0.0f, false, true, -2.837f, -5.803f)
                moveToRelative(2.947f, -7.06f)
                curveToRelative(0.938f, 1.533f, 1.501f, 3.595f, 1.582f, 5.805f)
                horizontalLineToRelative(-4.52f)
                arcTo(8.547f, 8.547f, 0.0f, false, true, 6.23f, 5.37f)
                moveToRelative(5.01f, -2.079f)
                verticalLineToRelative(7.883f)
                horizontalLineTo(9.07f)
                curveToRelative(-0.084f, -2.488f, -0.74f, -4.824f, -1.835f, -6.56f)
                arcToRelative(8.441f, 8.441f, 0.0f, false, true, 4.006f, -1.323f)
                moveToRelative(3.333f, 7.883f)
                horizontalLineTo(12.5f)
                verticalLineTo(3.29f)
                arcTo(8.47f, 8.47f, 0.0f, false, true, 16.426f, 4.6f)
                curveToRelative(-1.107f, 1.74f, -1.768f, 4.079f, -1.852f, 6.575f)
                moveToRelative(5.824f, 0.0f)
                horizontalLineToRelative(-4.566f)
                curveToRelative(0.084f, -2.196f, 0.664f, -4.306f, 1.602f, -5.83f)
                arcToRelative(8.575f, 8.575f, 0.0f, false, true, 2.964f, 5.83f)
                moveTo(11.843f, 2.0f)
                curveTo(6.415f, 2.0f, 2.0f, 6.423f, 2.0f, 11.843f)
                curveToRelative(0.0f, 5.429f, 4.415f, 9.843f, 9.843f, 9.843f)
                curveToRelative(5.429f, 0.0f, 9.843f, -4.414f, 9.843f, -9.843f)
                curveToRelative(0.0f, -5.42f, -4.414f, -9.843f, -9.843f, -9.843f)
            }
        }
        .build()
        return _sportBallRegular!!
    }

private var _sportBallRegular: ImageVector? = null
