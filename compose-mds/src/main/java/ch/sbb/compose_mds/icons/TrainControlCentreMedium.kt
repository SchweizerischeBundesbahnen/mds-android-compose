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

public val SBBIcons.TrainControlCentreMedium: ImageVector
    get() {
        if (_trainControlCentreMedium != null) {
            return _trainControlCentreMedium!!
        }
        _trainControlCentreMedium = Builder(name = "TrainControlCentreMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.4f, 4.773f)
                lineToRelative(12.0f, 3.75f)
                lineToRelative(0.35f, 0.11f)
                verticalLineToRelative(9.934f)
                lineToRelative(-6.0f, -0.75f)
                lineTo(26.75f, 32.75f)
                horizontalLineToRelative(-19.0f)
                verticalLineToRelative(-9.89f)
                lineToRelative(-4.158f, -1.386f)
                lineToRelative(-0.342f, -0.114f)
                lineTo(3.25f, 9.369f)
                lineToRelative(0.368f, -0.1f)
                lineToRelative(16.5f, -4.5f)
                lineToRelative(0.142f, -0.039f)
                close()
                moveTo(20.75f, 31.751f)
                horizontalLineToRelative(5.0f)
                lineTo(25.75f, 16.684f)
                lineToRelative(6.0f, 0.75f)
                lineTo(31.75f, 9.368f)
                lineToRelative(-11.0f, -3.438f)
                close()
                moveTo(4.25f, 10.132f)
                lineTo(4.25f, 20.64f)
                lineToRelative(4.158f, 1.387f)
                lineToRelative(0.342f, 0.114f)
                verticalLineToRelative(9.61f)
                horizontalLineToRelative(11.0f)
                lineTo(19.75f, 5.904f)
                close()
                moveTo(7.25f, 18.002f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(10.25f, 17.252f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.25f, 16.502f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _trainControlCentreMedium!!
    }

private var _trainControlCentreMedium: ImageVector? = null
