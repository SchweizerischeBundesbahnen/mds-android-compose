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

public val SBBIcons.LockerSmall: ImageVector
    get() {
        if (_lockerSmall != null) {
            return _lockerSmall!!
        }
        _lockerSmall = Builder(
            name = "LockerSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(2.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 3.0f)
                horizontalLineToRelative(5.207f)
                lineToRelative(0.147f, 0.147f)
                lineToRelative(0.984f, 0.984f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-1.015f, 1.016f)
                lineToRelative(-0.147f, 0.146f)
                lineTo(6.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.0f, 4.5f)
                moveToRelative(5.0f, 0.0f)
                quadToRelative(0.0f, -0.257f, -0.05f, -0.5f)
                horizontalLineToRelative(4.343f)
                lineToRelative(0.484f, 0.484f)
                lineToRelative(-0.515f, 0.516f)
                lineTo(6.95f, 5.0f)
                quadTo(7.0f, 4.758f, 7.0f, 4.5f)
                moveTo(4.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-2.0f, 5.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 8.0f)
                lineTo(2.5f, 8.0f)
                moveTo(3.0f, 21.0f)
                lineTo(3.0f, 9.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(5.0f, 13.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                lineTo(10.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 17.5f)
                close()
                moveTo(6.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
            .build()
        return _lockerSmall!!
    }

private var _lockerSmall: ImageVector? = null
