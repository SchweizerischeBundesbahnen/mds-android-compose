package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.BatteryLevelLowMedium: ImageVector
    get() {
        if (_batteryLevelLowMedium != null) {
            return _batteryLevelLowMedium!!
        }
        _batteryLevelLowMedium = Builder(name = "BatteryLevelLowMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.25f, 6.25f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.5f)
                moveToRelative(1.0f, 2.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(21.0f, 26.75f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(15.0f, 23.75f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _batteryLevelLowMedium!!
    }

private var _batteryLevelLowMedium: ImageVector? = null
