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
        _tramProfileMedium = Builder(
            name = "TramProfileMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(13.957f, 5.75f)
                lineTo(33.0f, 5.75f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(9.543f)
                lineToRelative(5.0f, 5.0f)
                lineTo(3.0f, 10.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(19.222f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.196f, 1.244f)
                lineToRelative(4.032f, 7.493f)
                verticalLineToRelative(0.001f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.3f, 1.25f)
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
                lineTo(19.7f, 31.75f)
                lineToRelative(0.025f, -0.025f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.99f, -1.975f)
                horizontalLineToRelative(7.035f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-5.994f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.42f, -1.743f)
                lineToRelative(-4.035f, -7.5f)
                lineToRelative(-0.003f, -0.006f)
                lineToRelative(-0.004f, -0.007f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.076f, -1.75f)
                horizontalLineToRelative(-3.255f)
                close()
                moveTo(14.8f, 31.75f)
                horizontalLineToRelative(-4.1f)
                lineToRelative(0.025f, -0.025f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.99f, -1.975f)
                horizontalLineToRelative(2.07f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.99f, 1.975f)
                close()
                moveTo(14.8f, 29.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.9f, 0.0f)
                close()
                moveTo(5.8f, 29.75f)
                horizontalLineToRelative(4.9f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.9f, 0.0f)
                moveToRelative(0.45f, -15.0f)
                lineTo(3.0f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.25f)
                verticalLineToRelative(8.5f)
                lineTo(3.0f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                close()
                moveTo(9.75f, 13.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-8.0f)
                moveToRelative(0.5f, 7.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(19.75f, 13.75f)
                horizontalLineToRelative(2.309f)
                lineToRelative(0.138f, 0.276f)
                lineToRelative(4.5f, 9.0f)
                lineToRelative(0.053f, 0.106f)
                verticalLineToRelative(2.118f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-11.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.882f)
                lineToRelative(-4.309f, -8.618f)
                close()
            }
        }
            .build()
        return _tramProfileMedium!!
    }

private var _tramProfileMedium: ImageVector? = null
