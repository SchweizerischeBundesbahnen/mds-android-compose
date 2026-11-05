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

public val SBBIcons.ClapperboardMedium: ImageVector
    get() {
        if (_clapperboardMedium != null) {
            return _clapperboardMedium!!
        }
        _clapperboardMedium = Builder(
            name = "ClapperboardMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(5.297f, 4.25f)
                arcTo(1.047f, 1.047f, 0.0f, false, false, 4.25f, 5.297f)
                lineTo(4.25f, 9.25f)
                horizontalLineToRelative(7.441f)
                lineToRelative(2.5f, -5.0f)
                close()
                moveTo(20.691f, 9.25f)
                horizontalLineToRelative(-7.882f)
                lineToRelative(2.5f, -5.0f)
                horizontalLineToRelative(7.882f)
                close()
                moveTo(24.309f, 4.25f)
                lineTo(21.809f, 9.25f)
                horizontalLineToRelative(9.941f)
                lineTo(31.75f, 5.297f)
                arcToRelative(1.047f, 1.047f, 0.0f, false, false, -1.047f, -1.047f)
                close()
                moveTo(3.849f, 3.85f)
                curveToRelative(0.384f, -0.384f, 0.905f, -0.6f, 1.448f, -0.6f)
                horizontalLineToRelative(25.406f)
                curveToRelative(0.543f, 0.0f, 1.064f, 0.216f, 1.448f, 0.6f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(0.354f, -0.353f)
                curveToRelative(0.383f, 0.383f, 0.599f, 0.904f, 0.599f, 1.447f)
                verticalLineToRelative(4.953f)
                lineTo(3.25f, 10.25f)
                lineTo(3.25f, 5.297f)
                curveToRelative(0.0f, -0.543f, 0.216f, -1.064f, 0.6f, -1.447f)
                moveToRelative(0.401f, 27.94f)
                lineTo(4.251f, 12.04f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(20.75f)
                horizontalLineToRelative(29.5f)
                lineTo(32.751f, 12.04f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(19.75f)
                close()
                moveTo(14.491f, 16.061f)
                lineTo(13.751f, 15.658f)
                verticalLineToRelative(10.684f)
                lineToRelative(0.74f, -0.403f)
                lineToRelative(8.25f, -4.5f)
                lineToRelative(0.804f, -0.439f)
                lineToRelative(-0.805f, -0.439f)
                close()
                moveTo(21.455f, 21.0f)
                lineToRelative(-6.706f, 3.658f)
                verticalLineToRelative(-7.316f)
                close()
            }
        }
            .build()
        return _clapperboardMedium!!
    }

private var _clapperboardMedium: ImageVector? = null
