package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ClapperboardLarge: ImageVector
    get() {
        if (_clapperboardLarge != null) {
            return _clapperboardLarge!!
        }
        _clapperboardLarge = Builder(name = "ClapperboardLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.152f, 6.0f)
                horizontalLineToRelative(-5.856f)
                lineToRelative(-4.444f, 8.0f)
                horizontalLineToRelative(5.855f)
                close()
                moveTo(27.98f, 15.0f)
                lineTo(44.0f, 15.0f)
                lineTo(44.0f, 7.943f)
                curveToRelative(0.0f, -0.779f, -0.307f, -1.527f, -0.855f, -2.08f)
                arcTo(2.92f, 2.92f, 0.0f, false, false, 41.073f, 5.0f)
                lineTo(6.927f, 5.0f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, false, -2.072f, 0.863f)
                arcTo(2.95f, 2.95f, 0.0f, false, false, 4.0f, 7.943f)
                lineTo(4.0f, 15.0f)
                horizontalLineToRelative(23.98f)
                moveTo(43.0f, 14.0f)
                horizontalLineToRelative(-7.147f)
                lineToRelative(4.445f, -8.0f)
                horizontalLineToRelative(0.775f)
                curveToRelative(0.51f, 0.0f, 1.0f, 0.204f, 1.362f, 0.568f)
                curveToRelative(0.361f, 0.365f, 0.565f, 0.86f, 0.565f, 1.375f)
                close()
                moveTo(34.708f, 14.0f)
                lineTo(39.152f, 6.0f)
                horizontalLineToRelative(-5.855f)
                lineToRelative(-4.445f, 8.0f)
                close()
                moveTo(19.296f, 6.0f)
                horizontalLineToRelative(5.855f)
                lineToRelative(-4.445f, 8.0f)
                horizontalLineToRelative(-5.855f)
                close()
                moveTo(18.15f, 6.0f)
                horizontalLineToRelative(-5.855f)
                lineTo(7.85f, 14.0f)
                horizontalLineToRelative(5.856f)
                close()
                moveTo(6.927f, 6.0f)
                horizontalLineToRelative(4.223f)
                lineToRelative(-4.445f, 8.0f)
                lineTo(5.0f, 14.0f)
                lineTo(5.0f, 7.943f)
                curveToRelative(0.0f, -0.516f, 0.204f, -1.01f, 0.565f, -1.375f)
                arcTo(1.92f, 1.92f, 0.0f, false, true, 6.927f, 6.0f)
                moveTo(4.0f, 44.0f)
                horizontalLineToRelative(40.0f)
                lineTo(44.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                close()
                moveTo(43.0f, 43.0f)
                lineTo(5.0f, 43.0f)
                lineTo(5.0f, 17.0f)
                horizontalLineToRelative(38.0f)
                close()
                moveTo(31.244f, 29.564f)
                lineToRelative(-12.5f, -7.0f)
                lineToRelative(-0.744f, -0.417f)
                verticalLineToRelative(15.707f)
                lineToRelative(0.744f, -0.417f)
                lineToRelative(12.5f, -7.0f)
                lineToRelative(0.78f, -0.437f)
                close()
                moveTo(29.976f, 30.0f)
                lineTo(19.0f, 36.147f)
                lineTo(19.0f, 23.853f)
                close()
            }
        }
        .build()
        return _clapperboardLarge!!
    }

private var _clapperboardLarge: ImageVector? = null
