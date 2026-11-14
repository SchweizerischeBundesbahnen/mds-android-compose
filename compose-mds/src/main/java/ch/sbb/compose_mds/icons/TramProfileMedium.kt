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

public val SBBIcons.TramProfileMedium: ImageVector
    get() {
        if (_tramProfileMedium != null) {
            return _tramProfileMedium!!
        }
        _tramProfileMedium = Builder(name = "TramProfileMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(33.0f, 5.75f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(9.543f)
                lineToRelative(5.0f, 5.0f)
                lineTo(3.0f, 10.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(19.222f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.2f, 1.25f)
                lineToRelative(4.027f, 7.487f)
                lineToRelative(0.001f, 0.001f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.299f, 1.087f)
                lineToRelative(0.001f, 0.163f)
                verticalLineToRelative(6.012f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 28.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.786f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.99f, 1.975f)
                lineToRelative(0.025f, 0.025f)
                lineTo(3.0f, 31.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(30.0f)
                verticalLineToRelative(-1.0f)
                lineTo(19.699f, 31.75f)
                lineToRelative(0.026f, -0.025f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.99f, -1.975f)
                horizontalLineToRelative(7.035f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.42f, -1.737f)
                lineToRelative(-4.035f, -7.5f)
                lineToRelative(-0.003f, -0.006f)
                lineToRelative(-0.004f, -0.007f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.073f, -1.749f)
                horizontalLineToRelative(-3.257f)
                lineTo(13.957f, 5.75f)
                close()
                moveTo(14.801f, 31.75f)
                horizontalLineToRelative(-4.102f)
                lineToRelative(0.026f, -0.025f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.99f, -1.975f)
                horizontalLineToRelative(2.07f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.99f, 1.975f)
                close()
                moveTo(14.801f, 29.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.899f, 0.0f)
                close()
                moveTo(5.801f, 29.75f)
                lineTo(10.7f, 29.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.9f, 0.0f)
                moveToRelative(1.449f, -16.0f)
                verticalLineToRelative(8.5f)
                lineTo(3.0f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-6.5f)
                lineTo(3.0f, 14.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(17.749f, 22.25f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(16.749f, 21.25f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(22.058f, 13.75f)
                lineTo(22.196f, 14.026f)
                lineTo(26.749f, 23.132f)
                verticalLineToRelative(2.118f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-11.5f)
                close()
                moveTo(20.749f, 24.25f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.882f)
                lineToRelative(-4.309f, -8.618f)
                horizontalLineToRelative(-0.691f)
                close()
            }
        }
        .build()
        return _tramProfileMedium!!
    }

private var _tramProfileMedium: ImageVector? = null
