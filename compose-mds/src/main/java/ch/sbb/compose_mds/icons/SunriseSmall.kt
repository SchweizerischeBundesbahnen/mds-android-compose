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

public val SBBIcons.SunriseSmall: ImageVector
    get() {
        if (_sunriseSmall != null) {
            return _sunriseSmall!!
        }
        _sunriseSmall = Builder(name = "SunriseSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 7.0f)
                lineTo(12.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.085f, 6.704f)
                lineTo(8.353f, 8.962f)
                lineTo(9.059f, 8.253f)
                lineTo(6.79f, 5.995f)
                close()
                moveTo(12.5f, 9.0f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 9.0f, 12.5f)
                curveToRelative(0.0f, 0.828f, 0.252f, 1.619f, 0.696f, 2.195f)
                lineToRelative(-0.792f, 0.61f)
                curveTo(8.308f, 14.531f, 8.0f, 13.518f, 8.0f, 12.5f)
                arcTo(4.49f, 4.49f, 0.0f, false, true, 12.5f, 8.0f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, true, 4.5f, 4.5f)
                curveToRelative(0.0f, 1.073f, -0.403f, 2.048f, -1.01f, 2.809f)
                lineToRelative(-0.781f, -0.624f)
                curveToRelative(0.484f, -0.607f, 0.79f, -1.366f, 0.79f, -2.185f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 12.5f, 9.0f)
                moveTo(7.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(18.3f, 6.088f)
                lineTo(16.035f, 8.338f)
                lineTo(16.74f, 9.048f)
                lineTo(19.006f, 6.798f)
                close()
                moveTo(18.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(13.993f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 16.0f)
                close()
            }
        }
        .build()
        return _sunriseSmall!!
    }

private var _sunriseSmall: ImageVector? = null
