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

public val SBBIcons.LockOpenLarge: ImageVector
    get() {
        if (_lockOpenLarge != null) {
            return _lockOpenLarge!!
        }
        _lockOpenLarge = Builder(name = "LockOpenLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.853f, 3.438f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 11.305f, 3.0f)
                horizontalLineToRelative(-0.013f)
                arcTo(6.67f, 6.67f, 0.0f, false, false, 5.0f, 9.755f)
                lineTo(5.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(8.0f, 9.663f)
                arcToRelative(3.62f, 3.62f, 0.0f, false, true, 3.165f, -3.646f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.0f, 9.517f)
                lineTo(15.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(31.0f)
                lineTo(39.0f, 18.0f)
                lineTo(18.0f, 18.0f)
                lineTo(18.0f, 9.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -4.148f, -6.062f)
                moveTo(17.0f, 18.0f)
                lineTo(17.0f, 9.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 11.342f, 4.0f)
                arcTo(5.67f, 5.67f, 0.0f, false, false, 6.0f, 9.743f)
                lineTo(6.0f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(7.0f, 9.674f)
                arcToRelative(4.62f, 4.62f, 0.0f, false, true, 4.048f, -4.65f)
                lineToRelative(0.013f, -0.002f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.94f, 4.5f)
                lineTo(16.001f, 18.0f)
                close()
                moveTo(9.0f, 19.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(29.0f)
                lineTo(38.0f, 19.0f)
                close()
                moveTo(23.265f, 24.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 25.0f, 30.654f)
                lineTo(25.0f, 37.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                verticalLineToRelative(-6.846f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 23.265f, 24.0f)
                moveToRelative(1.389f, 1.274f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -1.987f, 4.575f)
                lineToRelative(0.333f, 0.117f)
                lineTo(23.0f, 37.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-7.534f)
                lineToRelative(0.333f, -0.117f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.32f, -4.575f)
            }
        }
        .build()
        return _lockOpenLarge!!
    }

private var _lockOpenLarge: ImageVector? = null
