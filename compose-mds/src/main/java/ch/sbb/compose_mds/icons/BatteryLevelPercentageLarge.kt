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

public val SBBIcons.BatteryLevelPercentageLarge: ImageVector
    get() {
        if (_batteryLevelPercentageLarge != null) {
            return _batteryLevelPercentageLarge!!
        }
        _batteryLevelPercentageLarge = Builder(name = "BatteryLevelPercentageLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(23.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 7.0f)
                verticalLineToRelative(35.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 43.0f)
                lineTo(7.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(36.5f, 36.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(2.395f, -11.193f)
                lineToRelative(-14.0f, 18.0f)
                lineToRelative(-0.79f, -0.614f)
                lineToRelative(14.0f, -18.0f)
                close()
                moveTo(36.5f, 37.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveTo(21.0f, 39.0f)
                lineTo(10.0f, 39.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(21.0f, 35.0f)
                lineTo(10.0f, 35.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(21.0f, 31.0f)
                lineTo(10.0f, 31.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(26.5f, 24.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveTo(21.0f, 27.0f)
                lineTo(10.0f, 27.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
            }
        }
        .build()
        return _batteryLevelPercentageLarge!!
    }

private var _batteryLevelPercentageLarge: ImageVector? = null
