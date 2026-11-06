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

public val SBBIcons.BusProfileSmall: ImageVector
    get() {
        if (_busProfileSmall != null) {
            return _busProfileSmall!!
        }
        _busProfileSmall = Builder(name = "BusProfileSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.146f, 4.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(13.146f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.236f, 1.382f)
                lineToRelative(2.46f, 4.92f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.158f, 0.67f)
                lineTo(20.0f, 16.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(11.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.17f)
                arcToRelative(3.001f, 3.001f, 0.0f, false, false, 5.66f, 0.0f)
                horizontalLineToRelative(8.67f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-4.528f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.264f, -1.118f)
                lineToRelative(-2.46f, -4.92f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.146f, 4.0f)
                moveTo(2.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(6.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                lineTo(7.0f, 12.0f)
                lineTo(7.0f, 6.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(6.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(8.0f, -11.0f)
                horizontalLineToRelative(1.809f)
                lineToRelative(0.138f, 0.276f)
                lineToRelative(3.0f, 6.0f)
                lineToRelative(0.053f, 0.106f)
                lineTo(19.0f, 14.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.0f, 6.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.382f)
                lineTo(15.191f, 7.0f)
                close()
            }
        }
        .build()
        return _busProfileSmall!!
    }

private var _busProfileSmall: ImageVector? = null
