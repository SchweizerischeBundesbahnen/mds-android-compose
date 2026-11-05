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

public val SBBIcons.TrainTracksPenLarge: ImageVector
    get() {
        if (_trainTracksPenLarge != null) {
            return _trainTracksPenLarge!!
        }
        _trainTracksPenLarge = Builder(name = "TrainTracksPenLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(13.0f)
                lineTo(23.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(10.0f, 21.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(1.0f)
                lineTo(10.0f, 27.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                lineTo(9.0f, 44.0f)
                verticalLineToRelative(-5.0f)
                lineTo(4.0f, 39.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(4.0f, 33.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(4.0f, 27.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(4.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                lineTo(9.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(9.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(30.854f, 22.566f)
                lineTo(35.434f, 27.145f)
                lineTo(35.787f, 27.498f)
                lineTo(35.434f, 27.852f)
                lineTo(20.434f, 42.853f)
                lineTo(20.287f, 43.0f)
                lineTo(15.0f, 43.0f)
                verticalLineToRelative(-5.287f)
                lineToRelative(15.5f, -15.5f)
                close()
                moveTo(16.0f, 38.127f)
                lineTo(16.0f, 42.0f)
                horizontalLineToRelative(3.873f)
                lineToRelative(14.5f, -14.502f)
                lineToRelative(-3.873f, -3.872f)
                close()
                moveTo(38.853f, 14.565f)
                lineTo(43.433f, 19.127f)
                lineTo(43.787f, 19.48f)
                lineTo(43.435f, 19.834f)
                lineTo(38.855f, 24.432f)
                lineTo(38.501f, 24.787f)
                lineTo(33.213f, 19.499f)
                lineTo(38.499f, 14.213f)
                close()
                moveTo(34.627f, 19.499f)
                lineTo(38.499f, 23.371f)
                lineTo(42.372f, 19.481f)
                lineTo(38.5f, 15.625f)
                close()
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-5.0f)
                lineTo(10.0f, 15.0f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(13.0f)
                lineTo(23.0f, 9.0f)
                lineTo(10.0f, 9.0f)
                close()
            }
        }
        .build()
        return _trainTracksPenLarge!!
    }

private var _trainTracksPenLarge: ImageVector? = null
