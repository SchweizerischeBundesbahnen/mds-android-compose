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

public val SBBIcons.TrainTracksPenSmall: ImageVector
    get() {
        if (_trainTracksPenSmall != null) {
            return _trainTracksPenSmall!!
        }
        _trainTracksPenSmall = Builder(name = "TrainTracksPenSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 5.0f)
                lineTo(2.0f, 5.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(15.354f, 11.356f)
                lineTo(17.644f, 13.646f)
                lineTo(17.997f, 13.999f)
                lineTo(17.644f, 14.352f)
                lineTo(10.144f, 21.854f)
                lineTo(9.997f, 22.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-2.997f)
                lineToRelative(8.0f, -8.0f)
                close()
                moveTo(8.0f, 19.417f)
                lineTo(8.0f, 21.0f)
                horizontalLineToRelative(1.583f)
                lineToRelative(6.999f, -7.001f)
                lineTo(15.0f, 12.416f)
                close()
                moveTo(19.353f, 7.355f)
                lineToRelative(2.29f, 2.282f)
                lineToRelative(0.354f, 0.352f)
                lineToRelative(-0.352f, 0.355f)
                lineToRelative(-2.29f, 2.299f)
                lineToRelative(-0.355f, -0.354f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.355f, 0.353f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.355f, -0.353f)
                lineTo(16.003f, 10.0f)
                lineToRelative(2.643f, -2.644f)
                lineToRelative(0.353f, -0.353f)
                close()
                moveTo(17.417f, 10.0f)
                lineToRelative(1.581f, 1.581f)
                lineToRelative(1.584f, -1.59f)
                lineToRelative(-1.581f, -1.576f)
                close()
                moveTo(5.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                close()
                moveTo(5.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _trainTracksPenSmall!!
    }

private var _trainTracksPenSmall: ImageVector? = null
