package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.BatteryLevelMediumSmall: ImageVector
    get() {
        if (_batteryLevelMediumSmall != null) {
            return _batteryLevelMediumSmall!!
        }
        _batteryLevelMediumSmall = Builder(name = "BatteryLevelMediumSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(15.0f)
                lineTo(8.0f, 20.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 6.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 5.0f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(10.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(14.0f, 14.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _batteryLevelMediumSmall!!
    }

private var _batteryLevelMediumSmall: ImageVector? = null
