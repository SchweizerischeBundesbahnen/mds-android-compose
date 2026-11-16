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

public val SBBIcons.WaitingRoomSmall: ImageVector
    get() {
        if (_waitingRoomSmall != null) {
            return _waitingRoomSmall!!
        }
        _waitingRoomSmall = Builder(name = "WaitingRoomSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 4.0f)
                curveTo(18.456f, 4.0f, 20.0f, 5.544f, 20.0f, 7.5f)
                reflectiveCurveTo(18.456f, 11.0f, 16.5f, 11.0f)
                arcTo(3.47f, 3.47f, 0.0f, false, true, 13.0f, 7.5f)
                curveTo(13.0f, 5.544f, 14.545f, 4.0f, 16.5f, 4.0f)
                moveToRelative(0.0f, 8.0f)
                curveToRelative(2.508f, 0.0f, 4.5f, -1.992f, 4.5f, -4.5f)
                reflectiveCurveTo(19.008f, 3.0f, 16.5f, 3.0f)
                arcTo(4.47f, 4.47f, 0.0f, false, false, 12.0f, 7.5f)
                curveToRelative(0.0f, 2.508f, 1.993f, 4.5f, 4.5f, 4.5f)
                moveToRelative(0.392f, -3.69f)
                lineToRelative(1.901f, -2.4f)
                lineToRelative(-0.784f, -0.62f)
                lineToRelative(-1.573f, 1.982f)
                lineToRelative(-1.502f, -1.345f)
                lineToRelative(-0.666f, 0.745f)
                lineToRelative(1.898f, 1.7f)
                lineToRelative(0.395f, 0.355f)
                close()
                moveTo(21.0f, 15.01f)
                lineTo(21.0f, 21.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-5.99f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-3.99f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(18.001f, 15.01f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.001f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveTo(8.0f, 15.0f)
                lineTo(8.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(5.0f, 14.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(6.0f)
                lineTo(5.0f, 20.0f)
                close()
            }
        }
        .build()
        return _waitingRoomSmall!!
    }

private var _waitingRoomSmall: ImageVector? = null
