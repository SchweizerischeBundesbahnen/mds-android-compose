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

public val SBBIcons.ButtonPowerSmall: ImageVector
    get() {
        if (_buttonPowerSmall != null) {
            return _buttonPowerSmall!!
        }
        _buttonPowerSmall = Builder(name = "ButtonPowerSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 10.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(8.727f, 6.981f)
                arcTo(5.99f, 5.99f, 0.0f, false, false, 6.0f, 12.0f)
                curveToRelative(0.0f, 3.309f, 2.692f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.73f, -5.028f)
                lineToRelative(-0.546f, 0.838f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 12.0f)
                curveToRelative(0.0f, 2.757f, -2.244f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                curveToRelative(0.0f, -1.748f, 0.904f, -3.286f, 2.273f, -4.182f)
                close()
            }
        }
        .build()
        return _buttonPowerSmall!!
    }

private var _buttonPowerSmall: ImageVector? = null
