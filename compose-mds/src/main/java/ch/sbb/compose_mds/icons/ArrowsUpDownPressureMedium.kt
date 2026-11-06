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

public val SBBIcons.ArrowsUpDownPressureMedium: ImageVector
    get() {
        if (_arrowsUpDownPressureMedium != null) {
            return _arrowsUpDownPressureMedium!!
        }
        _arrowsUpDownPressureMedium = Builder(name = "ArrowsUpDownPressureMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.854f, 26.647f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.897f, -2.897f)
                lineTo(19.25f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-8.541f)
                lineToRelative(-2.9f, 2.906f)
                lineToRelative(-0.708f, -0.706f)
                lineToRelative(3.755f, -3.761f)
                lineToRelative(0.353f, -0.355f)
                close()
                moveTo(29.75f, 20.75f)
                horizontalLineToRelative(-22.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(22.0f)
                close()
                moveTo(8.75f, 19.75f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-20.0f)
                close()
                moveTo(19.25f, 13.043f)
                lineTo(22.146f, 10.147f)
                lineTo(22.853f, 10.854f)
                lineTo(18.75f, 14.957f)
                lineTo(18.396f, 14.602f)
                lineTo(14.642f, 10.841f)
                lineTo(15.35f, 10.135f)
                lineTo(18.25f, 13.04f)
                lineTo(18.25f, 4.5f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _arrowsUpDownPressureMedium!!
    }

private var _arrowsUpDownPressureMedium: ImageVector? = null
