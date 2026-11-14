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

public val SBBIcons.BusProfileMedium: ImageVector
    get() {
        if (_busProfileMedium != null) {
            return _busProfileMedium!!
        }
        _busProfileMedium = Builder(name = "BusProfileMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(30.25f, 17.722f)
                verticalLineToRelative(7.528f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(16.243f, 25.75f)
                quadToRelative(0.007f, -0.124f, 0.007f, -0.25f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, false, -8.493f, 0.25f)
                lineTo(3.0f, 25.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.937f)
                arcToRelative(4.252f, 4.252f, 0.0f, false, false, 8.126f, 0.0f)
                lineTo(29.75f, 26.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-7.528f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.264f, -1.117f)
                lineToRelative(-4.21f, -8.42f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.13f, -1.935f)
                lineTo(3.0f, 6.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(20.646f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.236f, 1.382f)
                lineToRelative(4.21f, 8.42f)
                curveToRelative(0.104f, 0.208f, 0.158f, 0.437f, 0.158f, 0.67f)
                moveToRelative(-21.5f, 0.028f)
                verticalLineToRelative(-8.5f)
                lineTo(3.0f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(6.5f)
                lineTo(3.0f, 16.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(19.25f, 9.25f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-8.5f)
                close()
                moveTo(11.75f, 16.75f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(12.0f, 22.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, true, 0.0f, 6.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.0f, -6.5f)
                moveToRelative(11.559f, -13.0f)
                lineToRelative(0.138f, 0.276f)
                lineToRelative(4.553f, 9.106f)
                verticalLineToRelative(2.118f)
                horizontalLineToRelative(-7.0f)
                lineTo(21.25f, 9.25f)
                close()
                moveTo(22.25f, 19.75f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.882f)
                lineToRelative(-4.309f, -8.618f)
                horizontalLineToRelative(-0.691f)
                close()
            }
        }
        .build()
        return _busProfileMedium!!
    }

private var _busProfileMedium: ImageVector? = null
