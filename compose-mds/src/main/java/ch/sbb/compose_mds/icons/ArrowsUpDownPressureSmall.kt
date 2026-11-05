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

public val SBBIcons.ArrowsUpDownPressureSmall: ImageVector
    get() {
        if (_arrowsUpDownPressureSmall != null) {
            return _arrowsUpDownPressureSmall!!
        }
        _arrowsUpDownPressureSmall = Builder(
            name = "ArrowsUpDownPressureSmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveToRelative(15.354f, 17.647f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(13.0f, 16.707f)
                lineTo(13.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.291f)
                lineToRelative(-1.65f, 1.652f)
                lineToRelative(-0.706f, -0.706f)
                lineToRelative(2.502f, -2.508f)
                lineToRelative(0.354f, -0.354f)
                close()
                moveTo(20.0f, 14.0f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(6.0f, 13.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 12.0f)
                close()
                moveTo(13.0f, 8.293f)
                lineTo(14.646f, 6.646f)
                lineTo(15.353f, 7.354f)
                lineTo(12.5f, 10.207f)
                lineTo(12.146f, 9.853f)
                lineTo(9.644f, 7.345f)
                lineTo(10.351f, 6.639f)
                lineTo(12.0f, 8.29f)
                lineTo(12.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _arrowsUpDownPressureSmall!!
    }

private var _arrowsUpDownPressureSmall: ImageVector? = null
