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

public val SBBIcons.BatteryLevelEmptyMedium: ImageVector
    get() {
        if (_batteryLevelEmptyMedium != null) {
            return _batteryLevelEmptyMedium!!
        }
        _batteryLevelEmptyMedium = Builder(name = "BatteryLevelEmptyMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.75f, 6.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(16.25f, 8.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _batteryLevelEmptyMedium!!
    }

private var _batteryLevelEmptyMedium: ImageVector? = null
