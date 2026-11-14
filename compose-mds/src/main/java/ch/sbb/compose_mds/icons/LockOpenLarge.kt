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
                moveTo(16.566f, 7.357f)
                curveToRelative(0.287f, 0.678f, 0.435f, 1.407f, 0.434f, 2.143f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 9.52f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.939f, -4.497f)
                horizontalLineToRelative(-0.013f)
                arcTo(4.62f, 4.62f, 0.0f, false, false, 7.0f, 9.67f)
                verticalLineToRelative(1.83f)
                arcToRelative(0.501f, 0.501f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(6.0f, 9.742f)
                arcTo(5.67f, 5.67f, 0.0f, false, true, 11.335f, 4.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.23f, 3.358f)
                moveTo(6.0f, 9.742f)
                lineToRelative(-0.5f, 0.008f)
                horizontalLineToRelative(-0.033f)
                close()
                moveTo(15.0f, 18.0f)
                lineTo(15.0f, 9.518f)
                lineToRelative(-0.003f, -0.184f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.394f, -3.155f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.444f, -0.161f)
                arcTo(3.62f, 3.62f, 0.0f, false, false, 8.0f, 9.662f)
                lineTo(8.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(5.0f, 9.75f)
                arcToRelative(6.67f, 6.67f, 0.0f, false, true, 6.291f, -6.749f)
                horizontalLineToRelative(0.014f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 18.0f, 9.5f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(27.0f)
                lineTo(8.0f, 45.0f)
                lineTo(8.0f, 18.0f)
                close()
                moveTo(9.0f, 19.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(29.0f)
                lineTo(38.0f, 19.0f)
                close()
                moveTo(24.0f, 29.966f)
                lineTo(24.333f, 29.849f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, false, 0.321f, -4.575f)
                arcToRelative(2.503f, 2.503f, 0.0f, false, false, -3.447f, 1.221f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.46f, 3.354f)
                lineToRelative(0.333f, 0.117f)
                lineTo(23.0f, 37.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                close()
                moveTo(25.0f, 37.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-6.85f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.213f, -0.947f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 5.568f, -0.187f)
                curveToRelative(-0.348f, 0.49f, -0.816f, 0.879f, -1.355f, 1.135f)
                close()
            }
        }
        .build()
        return _lockOpenLarge!!
    }

private var _lockOpenLarge: ImageVector? = null
