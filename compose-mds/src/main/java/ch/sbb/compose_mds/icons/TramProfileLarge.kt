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

public val SBBIcons.TramProfileLarge: ImageVector
    get() {
        if (_tramProfileLarge != null) {
            return _tramProfileLarge!!
        }
        _tramProfileLarge = Builder(name = "TramProfileLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 7.0f)
                lineTo(17.707f, 7.0f)
                lineToRelative(7.0f, 7.0f)
                horizontalLineToRelative(7.092f)
                lineToRelative(0.141f, 0.263f)
                lineToRelative(7.0f, 13.0f)
                lineToRelative(0.06f, 0.111f)
                lineTo(39.0f, 39.0f)
                lineTo(26.97f, 39.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.135f, 2.52f)
                lineToRelative(-0.153f, 0.162f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.356f, 0.318f)
                lineTo(44.0f, 42.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 43.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.673f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.194f, -0.165f)
                lineToRelative(-0.16f, -0.153f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 6.028f, 39.0f)
                lineTo(3.0f, 39.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(35.0f)
                lineTo(38.0f, 27.626f)
                lineTo(31.201f, 15.0f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(20.293f)
                lineToRelative(-7.0f, -7.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(41.0f)
                close()
                moveTo(7.036f, 39.0f)
                curveToRelative(0.107f, 0.743f, 0.452f, 1.438f, 0.99f, 1.975f)
                lineToRelative(0.125f, 0.12f)
                arcToRelative(3.496f, 3.496f, 0.0f, false, false, 4.824f, -0.12f)
                lineToRelative(0.12f, -0.126f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 13.96f, 39.0f)
                close()
                moveTo(14.971f, 39.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.136f, 2.52f)
                lineToRelative(-0.153f, 0.162f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.356f, 0.318f)
                horizontalLineToRelative(6.347f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.193f, -0.165f)
                lineToRelative(-0.162f, -0.153f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 18.03f, 39.0f)
                close()
                moveTo(19.036f, 39.0f)
                curveToRelative(0.107f, 0.743f, 0.451f, 1.438f, 0.99f, 1.975f)
                lineToRelative(0.125f, 0.12f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, false, 4.824f, -0.12f)
                lineToRelative(0.12f, -0.126f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 25.96f, 39.0f)
                close()
                moveTo(28.947f, 18.276f)
                lineTo(35.0f, 30.382f)
                lineTo(35.0f, 33.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(26.0f, 18.0f)
                horizontalLineToRelative(2.809f)
                close()
                moveTo(27.0f, 32.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.382f)
                lineTo(28.191f, 19.0f)
                lineTo(27.0f, 19.0f)
                close()
                moveTo(9.0f, 29.0f)
                lineTo(3.0f, 29.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-9.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(23.0f, 29.0f)
                lineTo(12.0f, 29.0f)
                lineTo(12.0f, 18.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(13.0f, 28.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _tramProfileLarge!!
    }

private var _tramProfileLarge: ImageVector? = null
