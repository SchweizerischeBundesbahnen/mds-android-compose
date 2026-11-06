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

public val SBBIcons.ThermometerLarge: ImageVector
    get() {
        if (_thermometerLarge != null) {
            return _thermometerLarge!!
        }
        _thermometerLarge = Builder(name = "ThermometerLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.0f, 29.516f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, 3.0f, 5.984f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -15.0f, 0.0f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, 3.0f, -5.984f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(19.0f, 30.027f)
                lineTo(18.786f, 30.177f)
                arcTo(6.48f, 6.48f, 0.0f, false, false, 16.0f, 35.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 13.0f, 0.0f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, -2.786f, -5.323f)
                lineToRelative(-0.214f, -0.15f)
                lineTo(26.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(23.0f, 32.035f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(22.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(22.5f, 33.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveTo(34.0f, 25.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(34.0f, 21.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(34.0f, 17.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(34.0f, 13.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _thermometerLarge!!
    }

private var _thermometerLarge: ImageVector? = null
