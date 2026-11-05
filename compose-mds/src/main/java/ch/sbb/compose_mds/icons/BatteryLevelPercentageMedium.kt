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

public val SBBIcons.BatteryLevelPercentageMedium: ImageVector
    get() {
        if (_batteryLevelPercentageMedium != null) {
            return _batteryLevelPercentageMedium!!
        }
        _batteryLevelPercentageMedium = Builder(
            name = "BatteryLevelPercentageMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
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
                moveToRelative(28.908f, 18.383f)
                lineToRelative(-10.5f, 14.812f)
                lineToRelative(-0.816f, -0.578f)
                lineToRelative(10.5f, -14.812f)
                close()
                moveTo(14.75f, 4.75f)
                horizontalLineToRelative(3.0f)
                lineTo(17.75f, 16.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.75f, 5.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(26.0f)
                lineTo(15.0f, 31.75f)
                verticalLineToRelative(1.0f)
                lineTo(4.75f, 32.75f)
                verticalLineToRelative(-28.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(27.0f, 27.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 0.0f, -5.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveToRelative(-12.0f, 1.5f)
                lineTo(7.5f, 29.75f)
                verticalLineToRelative(-1.0f)
                lineTo(15.0f, 28.75f)
                close()
                moveTo(15.0f, 26.75f)
                lineTo(7.5f, 26.75f)
                verticalLineToRelative(-1.0f)
                lineTo(15.0f, 25.75f)
                close()
                moveTo(15.0f, 23.75f)
                lineTo(7.5f, 23.75f)
                verticalLineToRelative(-1.0f)
                lineTo(15.0f, 22.75f)
                close()
                moveTo(19.5f, 18.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, 5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 0.0f, -5.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveToRelative(-4.5f, 1.5f)
                lineTo(7.5f, 20.75f)
                verticalLineToRelative(-1.0f)
                lineTo(15.0f, 19.75f)
                close()
            }
        }
            .build()
        return _batteryLevelPercentageMedium!!
    }

private var _batteryLevelPercentageMedium: ImageVector? = null
