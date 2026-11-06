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

public val SBBIcons.TicketRvMedium: ImageVector
    get() {
        if (_ticketRvMedium != null) {
            return _ticketRvMedium!!
        }
        _ticketRvMedium = Builder(name = "TicketRvMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.75f, 3.25f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(29.5f)
                lineTo(7.75f, 32.75f)
                lineTo(7.75f, 3.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(27.5f)
                horizontalLineToRelative(18.5f)
                lineTo(27.25f, 4.25f)
                close()
                moveTo(24.0f, 23.75f)
                lineTo(12.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(12.0f, 26.75f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 25.75f)
                close()
                moveTo(18.053f, 17.544f)
                curveToRelative(-0.034f, -0.037f, -0.147f, -0.216f, -0.219f, -0.992f)
                curveToRelative(-0.065f, -0.71f, -0.108f, -1.093f, -0.137f, -1.243f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.238f, -0.541f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, -0.404f, -0.401f)
                curveToRelative(0.206f, -0.13f, 0.384f, -0.299f, 0.523f, -0.498f)
                curveToRelative(0.24f, -0.36f, 0.362f, -0.784f, 0.35f, -1.216f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, false, -0.246f, -1.049f)
                arcToRelative(1.97f, 1.97f, 0.0f, false, false, -0.716f, -0.757f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -1.512f, -0.344f)
                lineTo(12.0f, 10.503f)
                verticalLineToRelative(7.518f)
                horizontalLineToRelative(1.384f)
                verticalLineToRelative(-3.065f)
                horizontalLineToRelative(1.636f)
                curveToRelative(0.348f, -0.032f, 0.699f, 0.03f, 1.014f, 0.181f)
                curveToRelative(0.25f, 0.162f, 0.4f, 0.604f, 0.434f, 1.278f)
                curveToRelative(0.027f, 0.569f, 0.051f, 0.89f, 0.074f, 1.04f)
                curveToRelative(0.023f, 0.167f, 0.083f, 0.327f, 0.176f, 0.469f)
                lineToRelative(0.068f, 0.097f)
                horizontalLineToRelative(1.681f)
                close()
                moveTo(16.125f, 13.567f)
                quadToRelative(-0.195f, 0.11f, -0.418f, 0.14f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.789f, 0.045f)
                horizontalLineToRelative(-1.534f)
                verticalLineToRelative(-1.986f)
                horizontalLineToRelative(1.786f)
                quadToRelative(0.369f, -0.01f, 0.73f, 0.067f)
                curveToRelative(0.142f, 0.034f, 0.272f, 0.103f, 0.38f, 0.199f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, true, 0.26f, 0.703f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, true, -0.415f, 0.832f)
                moveToRelative(5.291f, 2.567f)
                lineToRelative(1.887f, -5.631f)
                horizontalLineToRelative(1.473f)
                lineToRelative(-2.689f, 7.517f)
                horizontalLineToRelative(-1.38f)
                lineToRelative(-0.054f, -0.149f)
                lineToRelative(-2.631f, -7.368f)
                horizontalLineToRelative(1.516f)
                close()
            }
        }
        .build()
        return _ticketRvMedium!!
    }

private var _ticketRvMedium: ImageVector? = null
