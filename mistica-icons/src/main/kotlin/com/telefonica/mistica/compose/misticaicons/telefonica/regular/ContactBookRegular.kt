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

public val RegularGroup.ContactBookRegular: ImageVector
    get() {
        if (_contactBookRegular != null) {
            return _contactBookRegular!!
        }
        _contactBookRegular = Builder(name = "ContactBookRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.479f, 2.0f)
                arcToRelative(2.792f, 2.792f, 0.0f, false, true, 2.788f, 2.788f)
                verticalLineToRelative(14.428f)
                arcTo(2.79f, 2.79f, 0.0f, false, true, 16.479f, 22.0f)
                lineTo(7.617f, 22.0f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, true, -2.967f, -2.967f)
                lineTo(4.65f, 4.696f)
                curveToRelative(0.0f, -0.719f, 0.28f, -1.395f, 0.788f, -1.906f)
                arcTo(2.667f, 2.667f, 0.0f, false, true, 7.343f, 2.0f)
                horizontalLineToRelative(9.136f)
                close()
                moveTo(16.49f, 3.164f)
                lineTo(7.343f, 3.164f)
                curveToRelative(-0.407f, 0.0f, -0.793f, 0.16f, -1.081f, 0.448f)
                arcToRelative(1.523f, 1.523f, 0.0f, false, false, -0.448f, 1.084f)
                verticalLineToRelative(14.337f)
                curveToRelative(0.0f, 0.995f, 0.81f, 1.806f, 1.806f, 1.806f)
                horizontalLineToRelative(8.87f)
                lineTo(16.49f, 3.164f)
                close()
                moveTo(18.105f, 15.554f)
                horizontalLineToRelative(-0.451f)
                verticalLineToRelative(4.783f)
                curveToRelative(0.28f, -0.292f, 0.451f, -0.687f, 0.451f, -1.12f)
                verticalLineToRelative(-3.663f)
                close()
                moveTo(12.402f, 12.517f)
                curveToRelative(1.467f, 0.0f, 2.417f, 1.0f, 2.417f, 2.55f)
                verticalLineToRelative(0.905f)
                arcToRelative(0.522f, 0.522f, 0.0f, false, true, -0.52f, 0.517f)
                lineTo(8.114f, 16.489f)
                arcToRelative(0.518f, 0.518f, 0.0f, false, true, -0.517f, -0.517f)
                verticalLineToRelative(-0.904f)
                curveToRelative(0.0f, -1.55f, 0.947f, -2.551f, 2.417f, -2.551f)
                horizontalLineToRelative(2.388f)
                close()
                moveTo(12.399f, 13.549f)
                lineTo(10.01f, 13.549f)
                curveToRelative(-1.204f, 0.0f, -1.384f, 0.95f, -1.384f, 1.519f)
                verticalLineToRelative(0.387f)
                horizontalLineToRelative(5.156f)
                verticalLineToRelative(-0.387f)
                curveToRelative(0.0f, -0.57f, -0.18f, -1.52f, -1.384f, -1.52f)
                close()
                moveTo(18.105f, 9.611f)
                horizontalLineToRelative(-0.451f)
                verticalLineToRelative(4.78f)
                horizontalLineToRelative(0.451f)
                lineTo(18.105f, 9.61f)
                close()
                moveTo(11.198f, 6.991f)
                curveToRelative(1.575f, 0.0f, 2.476f, 0.9f, 2.476f, 2.476f)
                curveToRelative(0.0f, 1.569f, -0.901f, 2.47f, -2.476f, 2.47f)
                curveToRelative(-1.57f, 0.0f, -2.471f, -0.901f, -2.471f, -2.47f)
                curveToRelative(0.0f, -1.575f, 0.902f, -2.476f, 2.47f, -2.476f)
                close()
                moveTo(11.198f, 8.103f)
                curveToRelative(-0.95f, 0.0f, -1.358f, 0.408f, -1.358f, 1.364f)
                curveToRelative(0.0f, 0.95f, 0.406f, 1.358f, 1.358f, 1.358f)
                curveToRelative(0.956f, 0.0f, 1.364f, -0.406f, 1.364f, -1.358f)
                curveToRelative(0.0f, -0.956f, -0.408f, -1.364f, -1.364f, -1.364f)
                close()
                moveTo(17.655f, 3.666f)
                lineTo(17.654f, 8.447f)
                horizontalLineToRelative(0.451f)
                lineTo(18.105f, 4.788f)
                curveToRelative(0.0f, -0.435f, -0.171f, -0.83f, -0.45f, -1.122f)
                close()
            }
        }
        .build()
        return _contactBookRegular!!
    }

private var _contactBookRegular: ImageVector? = null
