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

public val SBBIcons.TicketParkingMedium: ImageVector
    get() {
        if (_ticketParkingMedium != null) {
            return _ticketParkingMedium!!
        }
        _ticketParkingMedium = Builder(
            name = "TicketParkingMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(3.25f, 6.25f)
                horizontalLineToRelative(29.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.274f, 0.0f, -4.0f, 1.726f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.726f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(7.0f)
                lineTo(3.25f, 28.25f)
                verticalLineToRelative(-22.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(8.032f)
                lineToRelative(0.148f, 0.224f)
                lineToRelative(2.839f, 4.288f)
                lineTo(18.0f, 15.262f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 20.75f, 18.0f)
                verticalLineToRelative(4.25f)
                horizontalLineToRelative(-3.3f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.45f, 1.5f)
                curveToRelative(-1.07f, 0.0f, -1.996f, -0.61f, -2.45f, -1.5f)
                horizontalLineToRelative(-5.6f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.7f, 1.487f)
                verticalLineToRelative(3.513f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(-5.023f)
                curveToRelative(-2.578f, -0.24f, -4.5f, -2.32f, -4.5f, -4.977f)
                reflectiveCurveToRelative(1.922f, -4.738f, 4.5f, -4.977f)
                lineTo(31.75f, 7.25f)
                lineTo(4.25f, 7.25f)
                moveToRelative(0.0f, 11.013f)
                lineTo(4.25f, 11.75f)
                horizontalLineToRelative(7.495f)
                lineToRelative(2.838f, 4.288f)
                lineToRelative(0.148f, 0.224f)
                lineTo(18.0f, 16.262f)
                curveToRelative(0.967f, 0.0f, 1.75f, 0.783f, 1.75f, 1.75f)
                verticalLineToRelative(3.238f)
                horizontalLineToRelative(-2.011f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -5.478f, 0.0f)
                lineTo(7.24f, 21.25f)
                quadToRelative(0.01f, -0.124f, 0.011f, -0.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -3.0f, -2.737f)
                moveToRelative(0.0f, 4.466f)
                lineTo(4.251f, 19.27f)
                quadToRelative(0.124f, -0.021f, 0.25f, -0.021f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, 3.5f)
                quadToRelative(-0.126f, 0.0f, -0.25f, -0.021f)
                moveToRelative(9.0f, -1.73f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.5f, 0.0f)
                moveToRelative(-3.013f, -6.256f)
                lineTo(9.0f, 14.742f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.775f)
                lineToRelative(0.148f, 0.224f)
                lineToRelative(1.494f, 2.257f)
                lineToRelative(-0.834f, 0.552f)
                close()
                moveTo(24.25f, 7.5f)
                verticalLineToRelative(0.487f)
                horizontalLineToRelative(1.0f)
                lineTo(25.25f, 7.5f)
                close()
                moveTo(24.25f, 8.962f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 10.912f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 12.862f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 14.812f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 16.762f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 18.712f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 20.662f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 22.612f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 24.562f)
                verticalLineToRelative(0.975f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.975f)
                close()
                moveTo(24.25f, 26.512f)
                lineTo(24.25f, 27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.488f)
                close()
            }
        }
            .build()
        return _ticketParkingMedium!!
    }

private var _ticketParkingMedium: ImageVector? = null
