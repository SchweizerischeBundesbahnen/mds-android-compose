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

public val SBBIcons.TicketMachineLarge: ImageVector
    get() {
        if (_ticketMachineLarge != null) {
            return _ticketMachineLarge!!
        }
        _ticketMachineLarge = Builder(
            name = "TicketMachineLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(35.0f, 35.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                lineTo(14.0f, 43.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 4.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(15.0f, 42.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-7.0f)
                lineTo(15.0f, 35.0f)
                close()
                moveTo(13.0f, 34.0f)
                horizontalLineToRelative(21.0f)
                lineTo(34.0f, 5.0f)
                lineTo(13.0f, 5.0f)
                close()
                moveTo(30.5f, 27.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveTo(27.0f, 29.0f)
                lineTo(16.0f, 29.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(30.5f, 28.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(17.0f, 28.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(30.5f, 23.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(27.0f, 23.0f)
                lineTo(16.0f, 23.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(17.0f, 22.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(31.0f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(25.0f, 19.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(31.999f, 9.0f)
                horizontalLineToRelative(-17.0f)
                lineTo(14.999f, 8.0f)
                horizontalLineToRelative(17.0f)
                close()
            }
        }
            .build()
        return _ticketMachineLarge!!
    }

private var _ticketMachineLarge: ImageVector? = null
