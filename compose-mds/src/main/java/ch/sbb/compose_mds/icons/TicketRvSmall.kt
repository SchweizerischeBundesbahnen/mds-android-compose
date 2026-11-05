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

public val SBBIcons.TicketRvSmall: ImageVector
    get() {
        if (_ticketRvSmall != null) {
            return _ticketRvSmall!!
        }
        _ticketRvSmall = Builder(
            name = "TicketRvSmall",
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
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(20.0f)
                lineTo(5.0f, 22.0f)
                lineTo(5.0f, 2.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 3.0f)
                close()
                moveTo(16.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(8.0f, 18.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 17.0f)
                close()
                moveTo(12.035f, 11.696f)
                curveToRelative(-0.022f, -0.024f, -0.098f, -0.144f, -0.145f, -0.661f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.092f, -0.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.158f, -0.36f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, -0.27f, -0.267f)
                curveToRelative(0.137f, -0.086f, 0.256f, -0.2f, 0.349f, -0.332f)
                curveToRelative(0.16f, -0.24f, 0.241f, -0.523f, 0.233f, -0.81f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.164f, -0.7f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, -0.478f, -0.505f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, -1.007f, -0.229f)
                lineTo(8.0f, 7.002f)
                verticalLineToRelative(5.012f)
                horizontalLineToRelative(0.923f)
                lineTo(8.923f, 9.97f)
                horizontalLineToRelative(1.09f)
                curveToRelative(0.233f, -0.022f, 0.466f, 0.02f, 0.676f, 0.12f)
                curveToRelative(0.166f, 0.109f, 0.267f, 0.403f, 0.29f, 0.853f)
                curveToRelative(0.018f, 0.378f, 0.034f, 0.593f, 0.05f, 0.692f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, 0.116f, 0.313f)
                lineToRelative(0.045f, 0.065f)
                horizontalLineToRelative(1.122f)
                close()
                moveTo(10.75f, 9.045f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.278f, 0.093f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.527f, 0.03f)
                lineTo(8.923f, 9.168f)
                lineTo(8.923f, 7.844f)
                horizontalLineToRelative(1.19f)
                quadToRelative(0.247f, -0.008f, 0.488f, 0.045f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.252f, 0.132f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.173f, 0.469f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, -0.276f, 0.555f)
                moveToRelative(3.527f, 1.71f)
                lineToRelative(1.258f, -3.753f)
                horizontalLineToRelative(0.983f)
                lineToRelative(-1.793f, 5.012f)
                horizontalLineToRelative(-0.92f)
                lineToRelative(-0.037f, -0.1f)
                lineToRelative(-1.753f, -4.912f)
                horizontalLineToRelative(1.01f)
                close()
            }
        }
            .build()
        return _ticketRvSmall!!
    }

private var _ticketRvSmall: ImageVector? = null
