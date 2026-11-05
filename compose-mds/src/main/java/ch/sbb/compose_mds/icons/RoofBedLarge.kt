package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.RoofBedLarge: ImageVector
    get() {
        if (_roofBedLarge != null) {
            return _roofBedLarge!!
        }
        _roofBedLarge = Builder(name = "RoofBedLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.44f, 33.12f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(20.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.182f, 1.319f)
                lineToRelative(0.153f, 0.16f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 1.165f, 3.021f)
                lineTo(43.44f, 43.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-8.88f)
                horizontalLineToRelative(-37.0f)
                lineTo(5.44f, 43.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(4.44f, 20.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(19.44f, 33.12f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.87f, -0.324f, -1.707f, -0.905f, -2.349f)
                lineToRelative(-0.12f, -0.126f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.475f, -1.025f)
                horizontalLineToRelative(-19.5f)
                close()
                moveTo(11.94f, 23.12f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveTo(39.0f, 30.0f)
                lineTo(22.0f, 30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(11.94f, 24.12f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveTo(24.164f, 4.173f)
                lineToRelative(20.0f, 10.0f)
                lineToRelative(-0.448f, 0.894f)
                lineTo(23.94f, 5.18f)
                lineTo(4.164f, 15.067f)
                lineToRelative(-0.448f, -0.894f)
                lineToRelative(20.0f, -10.0f)
                lineToRelative(0.224f, -0.111f)
                close()
            }
        }
        .build()
        return _roofBedLarge!!
    }

private var _roofBedLarge: ImageVector? = null
