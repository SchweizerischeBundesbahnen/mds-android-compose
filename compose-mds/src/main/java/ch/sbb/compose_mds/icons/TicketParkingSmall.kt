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

public val SBBIcons.TicketParkingSmall: ImageVector
    get() {
        if (_ticketParkingSmall != null) {
            return _ticketParkingSmall!!
        }
        _ticketParkingSmall = Builder(name = "TicketParkingSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 11.5f)
                curveToRelative(0.0f, -1.806f, 1.273f, -3.234f, 3.0f, -3.467f)
                lineTo(21.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(0.464f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.277f)
                lineToRelative(0.149f, 0.224f)
                lineToRelative(1.843f, 2.784f)
                lineTo(12.0f, 10.008f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.268f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, true, -3.465f, 0.0f)
                lineTo(4.733f, 15.0f)
                curveToRelative(-0.346f, 0.598f, -0.992f, 1.0f, -1.733f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-0.464f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.034f)
                curveToRelative(-1.727f, -0.233f, -3.0f, -1.66f, -3.0f, -3.466f)
                moveTo(7.74f, 8.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.992f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(9.731f, 11.008f)
                lineToRelative(-0.148f, -0.224f)
                close()
                moveTo(4.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                moveToRelative(15.0f, -2.5f)
                curveToRelative(0.0f, 1.424f, 1.076f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 19.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.424f, 0.0f, -2.5f, 1.076f, -2.5f, 2.5f)
                moveTo(10.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveTo(7.272f, 8.995f)
                lineToRelative(0.149f, 0.224f)
                lineToRelative(0.996f, 1.506f)
                lineToRelative(-0.834f, 0.552f)
                lineToRelative(-0.848f, -1.282f)
                lineTo(6.0f, 9.995f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 16.607f)
                verticalLineToRelative(-0.928f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.928f)
                close()
                moveTo(17.0f, 14.75f)
                verticalLineToRelative(-0.929f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.929f)
                close()
                moveTo(17.0f, 12.892f)
                verticalLineToRelative(-0.928f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.928f)
                close()
                moveTo(17.0f, 11.036f)
                verticalLineToRelative(-0.929f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.929f)
                close()
                moveTo(17.0f, 9.178f)
                lineTo(17.0f, 8.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.928f)
                close()
                moveTo(17.0f, 7.321f)
                verticalLineToRelative(-0.929f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.929f)
                close()
            }
        }
        .build()
        return _ticketParkingSmall!!
    }

private var _ticketParkingSmall: ImageVector? = null
