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

public val SBBIcons.BatteryLevelEmptySmall: ImageVector
    get() {
        if (_batteryLevelEmptySmall != null) {
            return _batteryLevelEmptySmall!!
        }
        _batteryLevelEmptySmall = Builder(name = "BatteryLevelEmptySmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _batteryLevelEmptySmall!!
    }

private var _batteryLevelEmptySmall: ImageVector? = null
