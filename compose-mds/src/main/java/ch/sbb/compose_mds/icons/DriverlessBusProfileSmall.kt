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

public val SBBIcons.DriverlessBusProfileSmall: ImageVector
    get() {
        if (_driverlessBusProfileSmall != null) {
            return _driverlessBusProfileSmall!!
        }
        _driverlessBusProfileSmall = Builder(name = "DriverlessBusProfileSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 6.5f)
                lineTo(3.0f, 17.0f)
                horizontalLineToRelative(2.267f)
                curveToRelative(0.346f, 0.598f, 0.992f, 1.0f, 1.733f, 1.0f)
                curveToRelative(0.74f, 0.0f, 1.387f, -0.402f, 1.733f, -1.0f)
                horizontalLineToRelative(6.534f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.466f, 0.0f)
                lineTo(21.0f, 17.0f)
                lineTo(21.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 5.0f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                lineTo(20.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(4.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveTo(5.5f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                lineTo(9.0f, 7.0f)
                lineTo(5.5f, 7.0f)
                moveToRelative(0.5f, 5.0f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(7.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(10.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.001f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 15.0f)
                moveToRelative(-7.0f, -8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 8.0f)
                close()
                moveTo(15.5f, 7.0f)
                lineTo(15.0f, 7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(-3.5f)
                moveToRelative(0.5f, 5.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(6.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                close()
                moveTo(2.0f, 18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                close()
                moveTo(18.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                close()
                moveTo(21.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _driverlessBusProfileSmall!!
    }

private var _driverlessBusProfileSmall: ImageVector? = null
