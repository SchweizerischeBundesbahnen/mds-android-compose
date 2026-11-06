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

public val SBBIcons.TrainControlCentreLarge: ImageVector
    get() {
        if (_trainControlCentreLarge != null) {
            return _trainControlCentreLarge!!
        }
        _trainControlCentreLarge = Builder(name = "TrainControlCentreLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(26.65f, 6.023f)
                lineToRelative(16.0f, 5.0f)
                lineToRelative(0.35f, 0.11f)
                verticalLineToRelative(12.934f)
                lineToRelative(-8.0f, -1.0f)
                verticalLineToRelative(19.934f)
                lineTo(10.0f, 43.001f)
                verticalLineToRelative(-13.14f)
                lineToRelative(-5.658f, -1.885f)
                lineTo(4.0f, 27.86f)
                lineTo(4.0f, 12.12f)
                lineToRelative(0.368f, -0.1f)
                lineToRelative(22.0f, -6.0f)
                lineToRelative(0.142f, -0.039f)
                close()
                moveTo(27.0f, 42.001f)
                horizontalLineToRelative(7.0f)
                lineTo(34.0f, 21.935f)
                lineToRelative(8.0f, 1.0f)
                lineTo(42.0f, 11.868f)
                lineTo(27.0f, 7.181f)
                close()
                moveTo(5.0f, 12.883f)
                lineTo(5.0f, 27.14f)
                lineToRelative(5.658f, 1.886f)
                lineToRelative(0.342f, 0.115f)
                lineTo(11.0f, 42.0f)
                horizontalLineToRelative(15.0f)
                lineTo(26.0f, 7.154f)
                close()
                moveTo(9.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.0f, 23.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _trainControlCentreLarge!!
    }

private var _trainControlCentreLarge: ImageVector? = null
