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

public val SBBIcons.AirplaneSmall: ImageVector
    get() {
        if (_airplaneSmall != null) {
            return _airplaneSmall!!
        }
        _airplaneSmall = Builder(name = "AirplaneSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -0.317f, -0.095f, -0.562f, -0.243f, -0.722f)
                curveToRelative(-0.142f, -0.154f, -0.375f, -0.279f, -0.757f, -0.279f)
                horizontalLineToRelative(-6.367f)
                lineToRelative(-0.11f, -0.35f)
                lineToRelative(-2.391f, -7.65f)
                horizontalLineTo(9.565f)
                lineToRelative(0.931f, 7.438f)
                lineToRelative(0.07f, 0.563f)
                horizontalLineTo(5.691f)
                lineToRelative(-0.138f, -0.277f)
                lineTo(4.69f, 9.0f)
                horizontalLineTo(3.76f)
                lineToRelative(1.201f, 2.802f)
                lineToRelative(0.084f, 0.197f)
                lineToRelative(-0.084f, 0.198f)
                lineToRelative(-1.201f, 2.805f)
                horizontalLineToRelative(0.932f)
                lineToRelative(0.862f, -1.724f)
                lineTo(5.69f, 13.0f)
                horizontalLineToRelative(4.875f)
                lineToRelative(-0.07f, 0.563f)
                lineTo(9.566f, 21.0f)
                horizontalLineToRelative(1.566f)
                lineToRelative(2.39f, -7.65f)
                lineToRelative(0.11f, -0.35f)
                horizontalLineTo(20.0f)
                curveToRelative(0.381f, 0.0f, 0.615f, -0.124f, 0.757f, -0.278f)
                curveToRelative(0.148f, -0.16f, 0.243f, -0.406f, 0.243f, -0.723f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.511f, -0.155f, 1.017f, -0.507f, 1.399f)
                curveToRelative(-0.313f, 0.34f, -0.748f, 0.545f, -1.266f, 0.59f)
                lineTo(20.0f, 14.0f)
                horizontalLineToRelative(-5.633f)
                lineToRelative(-2.39f, 7.649f)
                lineToRelative(-0.11f, 0.35f)
                horizontalLineTo(8.434f)
                lineToRelative(0.07f, -0.562f)
                lineToRelative(0.93f, -7.436f)
                horizontalLineTo(6.309f)
                lineToRelative(-0.862f, 1.724f)
                lineToRelative(-0.138f, 0.277f)
                horizontalLineTo(2.242f)
                lineToRelative(0.298f, -0.698f)
                lineTo(3.955f, 12.0f)
                lineTo(2.54f, 8.698f)
                lineTo(2.242f, 8.0f)
                horizontalLineTo(5.31f)
                lineToRelative(0.138f, 0.276f)
                lineTo(6.31f, 10.0f)
                horizontalLineToRelative(3.125f)
                lineToRelative(-0.931f, -7.438f)
                lineTo(8.433f, 2.0f)
                horizontalLineToRelative(3.434f)
                lineToRelative(0.11f, 0.35f)
                lineTo(14.369f, 10.0f)
                horizontalLineTo(20.0f)
                curveToRelative(0.618f, 0.0f, 1.135f, 0.211f, 1.493f, 0.6f)
                curveToRelative(0.352f, 0.382f, 0.507f, 0.888f, 0.507f, 1.4f)
            }
        }
        .build()
        return _airplaneSmall!!
    }

private var _airplaneSmall: ImageVector? = null
