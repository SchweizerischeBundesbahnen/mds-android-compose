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

public val SBBIcons.PlatformSmall: ImageVector
    get() {
        if (_platformSmall != null) {
            return _platformSmall!!
        }
        _platformSmall = Builder(name = "PlatformSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                lineTo(20.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 3.0f)
                lineTo(9.0f, 3.0f)
                lineTo(9.0f, 2.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(16.0f, 3.0f)
                close()
                moveTo(5.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-3.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                lineTo(7.0f, 9.5f)
                curveToRelative(0.0f, -0.55f, -0.2f, -0.894f, -0.506f, -1.118f)
                curveTo(6.166f, 8.142f, 5.66f, 8.0f, 5.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 7.0f)
                horizontalLineToRelative(0.576f)
                lineToRelative(0.334f, -2.0f)
                lineTo(2.0f, 5.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.924f, 5.0f)
                lineTo(3.59f, 7.0f)
                lineTo(5.0f, 7.0f)
                curveToRelative(0.78f, 0.0f, 1.524f, 0.164f, 2.086f, 0.576f)
                curveTo(7.67f, 8.004f, 8.0f, 8.66f, 8.0f, 9.5f)
                lineTo(8.0f, 19.0f)
                lineTo(6.258f, 19.0f)
                lineToRelative(0.429f, 1.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.885f)
                lineToRelative(0.345f, 0.803f)
                lineToRelative(-0.92f, 0.394f)
                lineTo(6.027f, 21.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.599f)
                lineToRelative(-0.429f, -1.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                lineTo(2.0f, 14.0f)
                close()
                moveTo(11.0f, 7.0f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _platformSmall!!
    }

private var _platformSmall: ImageVector? = null
