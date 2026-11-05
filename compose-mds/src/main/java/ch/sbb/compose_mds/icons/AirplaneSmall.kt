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

public val SBBIcons.AirplaneSmall: ImageVector
    get() {
        if (_airplaneSmall != null) {
            return _airplaneSmall!!
        }
        _airplaneSmall = Builder(
            name = "AirplaneSmall",
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
                moveTo(8.433f, 2.0f)
                horizontalLineToRelative(3.435f)
                lineToRelative(0.11f, 0.35f)
                lineToRelative(2.39f, 7.65f)
                lineTo(20.0f, 10.0f)
                curveToRelative(0.618f, 0.0f, 1.135f, 0.211f, 1.493f, 0.6f)
                curveToRelative(0.352f, 0.383f, 0.507f, 0.888f, 0.507f, 1.4f)
                reflectiveCurveToRelative(-0.155f, 1.017f, -0.507f, 1.4f)
                curveToRelative(-0.358f, 0.389f, -0.875f, 0.6f, -1.493f, 0.6f)
                horizontalLineToRelative(-5.632f)
                lineToRelative(-2.39f, 7.649f)
                lineToRelative(-0.11f, 0.35f)
                lineTo(8.434f, 21.999f)
                lineToRelative(0.07f, -0.561f)
                lineToRelative(0.93f, -7.436f)
                lineTo(6.309f, 14.002f)
                lineToRelative(-0.862f, 1.723f)
                lineToRelative(-0.138f, 0.277f)
                lineTo(2.242f, 16.002f)
                lineToRelative(0.298f, -0.697f)
                lineTo(3.956f, 12.0f)
                lineTo(2.54f, 8.696f)
                lineTo(2.242f, 8.0f)
                horizontalLineToRelative(3.067f)
                lineToRelative(0.138f, 0.276f)
                lineTo(6.31f, 10.0f)
                horizontalLineToRelative(3.125f)
                lineToRelative(-0.931f, -7.438f)
                close()
                moveTo(9.565f, 3.0f)
                lineTo(10.496f, 10.437f)
                lineTo(10.566f, 11.0f)
                lineTo(5.692f, 11.0f)
                lineToRelative(-0.138f, -0.277f)
                lineTo(4.69f, 9.0f)
                horizontalLineToRelative(-0.933f)
                lineToRelative(1.202f, 2.803f)
                lineToRelative(0.084f, 0.196f)
                lineToRelative(-0.084f, 0.197f)
                lineToRelative(-1.202f, 2.806f)
                horizontalLineToRelative(0.933f)
                lineToRelative(0.862f, -1.724f)
                lineTo(5.69f, 13.0f)
                horizontalLineToRelative(4.875f)
                lineToRelative(-0.07f, 0.563f)
                lineTo(9.566f, 21.0f)
                horizontalLineToRelative(1.566f)
                lineToRelative(2.39f, -7.65f)
                lineToRelative(0.11f, -0.35f)
                lineTo(20.0f, 13.0f)
                curveToRelative(0.382f, 0.0f, 0.616f, -0.124f, 0.757f, -0.278f)
                curveToRelative(0.148f, -0.16f, 0.243f, -0.406f, 0.243f, -0.723f)
                reflectiveCurveToRelative(-0.095f, -0.56f, -0.243f, -0.721f)
                curveToRelative(-0.142f, -0.154f, -0.375f, -0.279f, -0.757f, -0.279f)
                horizontalLineToRelative(-6.368f)
                lineToRelative(-0.11f, -0.35f)
                lineToRelative(-2.39f, -7.65f)
                close()
            }
        }
            .build()
        return _airplaneSmall!!
    }

private var _airplaneSmall: ImageVector? = null
