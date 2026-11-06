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

public val SBBIcons.TrainTracksPenMedium: ImageVector
    get() {
        if (_trainTracksPenMedium != null) {
            return _trainTracksPenMedium!!
        }
        _trainTracksPenMedium = Builder(name = "TrainTracksPenMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 6.25f)
                horizontalLineToRelative(9.5f)
                lineTo(16.75f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                lineTo(21.0f, 6.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(3.5f)
                lineTo(21.0f, 10.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(3.5f)
                lineTo(21.0f, 15.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                lineTo(17.75f, 18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(3.5f)
                lineTo(15.0f, 19.75f)
                verticalLineToRelative(1.0f)
                lineTo(7.25f, 20.75f)
                verticalLineToRelative(3.5f)
                lineTo(12.0f, 24.25f)
                verticalLineToRelative(1.0f)
                lineTo(7.25f, 25.25f)
                verticalLineToRelative(3.5f)
                lineTo(9.0f, 28.75f)
                verticalLineToRelative(1.0f)
                lineTo(7.25f, 29.75f)
                lineTo(7.25f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                lineTo(3.0f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-3.5f)
                lineTo(3.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-3.5f)
                lineTo(3.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-3.5f)
                lineTo(3.0f, 16.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-3.5f)
                lineTo(3.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-3.5f)
                lineTo(3.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                lineTo(6.25f, 3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(22.854f, 17.21f)
                lineTo(26.288f, 20.645f)
                lineTo(26.643f, 20.998f)
                lineTo(26.289f, 21.352f)
                lineTo(15.039f, 32.603f)
                lineTo(14.685f, 32.249f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(-0.146f, 0.147f)
                lineTo(10.75f, 32.75f)
                verticalLineToRelative(-4.143f)
                lineToRelative(0.146f, -0.145f)
                lineTo(22.5f, 16.858f)
                close()
                moveTo(11.75f, 29.024f)
                verticalLineToRelative(2.727f)
                horizontalLineToRelative(2.727f)
                lineToRelative(10.75f, -10.752f)
                lineToRelative(-2.727f, -2.727f)
                close()
                moveTo(28.853f, 11.21f)
                lineToRelative(3.435f, 3.422f)
                lineToRelative(0.355f, 0.352f)
                lineToRelative(-0.354f, 0.355f)
                lineToRelative(-3.434f, 3.448f)
                lineToRelative(-0.354f, 0.356f)
                lineToRelative(-3.79f, -3.79f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(0.355f, -0.354f)
                lineToRelative(3.435f, -3.435f)
                lineToRelative(0.352f, -0.353f)
                close()
                moveTo(25.771f, 14.999f)
                lineTo(28.499f, 17.727f)
                lineTo(31.228f, 14.987f)
                lineTo(28.5f, 12.27f)
                close()
                moveTo(7.25f, 15.25f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(7.25f, 10.75f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-9.5f)
                close()
            }
        }
        .build()
        return _trainTracksPenMedium!!
    }

private var _trainTracksPenMedium: ImageVector? = null
