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

public val SBBIcons.TicketMoonStarMedium: ImageVector
    get() {
        if (_ticketMoonStarMedium != null) {
            return _ticketMoonStarMedium!!
        }
        _ticketMoonStarMedium = Builder(
            name = "TicketMoonStarMedium",
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
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(-5.023f)
                curveToRelative(-2.578f, -0.24f, -4.5f, -2.32f, -4.5f, -4.977f)
                reflectiveCurveToRelative(1.922f, -4.738f, 4.5f, -4.977f)
                lineTo(31.75f, 7.25f)
                lineTo(4.25f, 7.25f)
                moveToRelative(15.0f, 3.5f)
                lineTo(19.25f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.75f)
                lineTo(16.5f, 10.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.75f)
                lineTo(21.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(25.25f, 10.5f)
                lineTo(25.25f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(25.25f, 12.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.25f, 12.0f)
                close()
                moveTo(25.25f, 16.5f)
                lineTo(25.25f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(25.25f, 18.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.25f, 18.0f)
                close()
                moveTo(25.25f, 22.5f)
                lineTo(25.25f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(25.25f, 24.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.25f, 24.0f)
                close()
                moveTo(20.75f, 21.0f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.75f)
                lineTo(20.75f, 16.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.75f)
                lineTo(18.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                lineTo(19.75f, 21.0f)
                close()
                moveTo(12.75f, 12.25f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, 13.0f)
                curveToRelative(1.673f, 0.0f, 3.18f, -0.648f, 4.327f, -1.68f)
                lineToRelative(0.859f, -0.772f)
                lineToRelative(-1.15f, -0.098f)
                curveToRelative(-2.82f, -0.24f, -5.036f, -2.575f, -5.036f, -5.45f)
                curveToRelative(0.0f, -1.621f, 0.715f, -3.066f, 1.841f, -4.078f)
                lineToRelative(0.856f, -0.768f)
                lineToRelative(-1.146f, -0.101f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.232f, -0.03f)
                curveToRelative(-0.089f, -0.011f, -0.199f, -0.024f, -0.319f, -0.024f)
                moveToRelative(-5.5f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 4.873f, -5.465f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -1.373f, 3.965f)
                curveToRelative(0.0f, 2.99f, 2.023f, 5.48f, 4.766f, 6.235f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -2.766f, 0.765f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -5.5f, -5.5f)
            }
        }
            .build()
        return _ticketMoonStarMedium!!
    }

private var _ticketMoonStarMedium: ImageVector? = null
