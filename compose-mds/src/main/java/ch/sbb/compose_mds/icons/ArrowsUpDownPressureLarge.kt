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

public val SBBIcons.ArrowsUpDownPressureLarge: ImageVector
    get() {
        if (_arrowsUpDownPressureLarge != null) {
            return _arrowsUpDownPressureLarge!!
        }
        _arrowsUpDownPressureLarge = Builder(name = "ArrowsUpDownPressureLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(29.854f, 35.148f)
                lineToRelative(-0.707f, 0.706f)
                lineTo(25.0f, 31.709f)
                lineTo(25.0f, 44.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.0f, 31.709f)
                lineToRelative(-4.152f, 4.161f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(5.006f, -5.017f)
                lineToRelative(0.354f, -0.353f)
                close()
                moveTo(39.0f, 27.0f)
                lineTo(10.0f, 27.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(29.0f)
                close()
                moveTo(11.0f, 26.0f)
                horizontalLineToRelative(27.0f)
                verticalLineToRelative(-3.0f)
                lineTo(11.0f, 23.0f)
                close()
                moveTo(25.0f, 17.292f)
                lineTo(29.147f, 13.145f)
                lineTo(29.854f, 13.852f)
                lineTo(24.5f, 19.206f)
                lineTo(24.146f, 18.852f)
                lineTo(19.14f, 13.836f)
                lineTo(19.494f, 13.483f)
                lineTo(19.848f, 13.13f)
                lineTo(24.0f, 17.29f)
                lineTo(24.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _arrowsUpDownPressureLarge!!
    }

private var _arrowsUpDownPressureLarge: ImageVector? = null
