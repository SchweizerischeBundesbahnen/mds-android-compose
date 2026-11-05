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

public val SBBIcons.ButtonPowerMedium: ImageVector
    get() {
        if (_buttonPowerMedium != null) {
            return _buttonPowerMedium!!
        }
        _buttonPowerMedium = Builder(
            name = "ButtonPowerMedium",
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
                moveTo(17.5f, 7.5f)
                lineTo(17.5f, 15.0f)
                horizontalLineToRelative(1.0f)
                lineTo(18.5f, 7.5f)
                close()
                moveTo(22.222f, 11.505f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 3.528f, 6.494f)
                curveToRelative(0.0f, 4.274f, -3.478f, 7.75f, -7.75f, 7.75f)
                reflectiveCurveToRelative(-7.75f, -3.476f, -7.75f, -7.75f)
                curveToRelative(0.0f, -2.71f, 1.403f, -5.094f, 3.524f, -6.481f)
                lineToRelative(-0.548f, -0.837f)
                curveToRelative(-2.388f, 1.562f, -3.976f, 4.254f, -3.976f, 7.318f)
                curveToRelative(0.0f, 4.826f, 3.926f, 8.75f, 8.75f, 8.75f)
                reflectiveCurveToRelative(8.75f, -3.924f, 8.75f, -8.75f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -3.981f, -7.332f)
                close()
            }
        }
            .build()
        return _buttonPowerMedium!!
    }

private var _buttonPowerMedium: ImageVector? = null
