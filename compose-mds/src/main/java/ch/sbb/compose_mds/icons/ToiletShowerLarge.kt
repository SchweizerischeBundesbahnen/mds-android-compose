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

public val SBBIcons.ToiletShowerLarge: ImageVector
    get() {
        if (_toiletShowerLarge != null) {
            return _toiletShowerLarge!!
        }
        _toiletShowerLarge = Builder(name = "ToiletShowerLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 30.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -10.0f, 8.366f)
                lineTo(11.0f, 43.0f)
                lineTo(4.0f, 43.0f)
                lineTo(4.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(43.0f, 43.0f)
                lineTo(26.0f, 43.0f)
                lineTo(26.0f, 4.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(5.0f, 42.0f)
                horizontalLineToRelative(5.0f)
                lineTo(10.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(27.0f, 42.0f)
                horizontalLineToRelative(15.0f)
                lineTo(42.0f, 5.0f)
                horizontalLineToRelative(-6.999f)
                verticalLineToRelative(3.05f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 37.0f, 10.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.001f, -2.45f)
                lineTo(34.001f, 5.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(37.0f, 41.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(11.0f, 37.847f)
                arcTo(7.499f, 7.499f, 0.0f, false, false, 19.981f, 31.0f)
                lineTo(11.0f, 31.0f)
                close()
                moveTo(9.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(37.001f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.001f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(37.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.001f, 16.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(34.5f, 9.0f)
                curveToRelative(-0.653f, 0.0f, -1.207f, 0.417f, -1.413f, 1.0f)
                horizontalLineToRelative(2.826f)
                curveToRelative(-0.206f, -0.583f, -0.76f, -1.0f, -1.413f, -1.0f)
            }
        }
        .build()
        return _toiletShowerLarge!!
    }

private var _toiletShowerLarge: ImageVector? = null
