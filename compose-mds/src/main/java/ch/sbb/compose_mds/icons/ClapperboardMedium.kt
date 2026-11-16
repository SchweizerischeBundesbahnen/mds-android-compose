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
        _clapperboardMedium = Builder(name = "ClapperboardMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.75f, 5.297f)
                arcToRelative(1.047f, 1.047f, 0.0f, false, false, -1.047f, -1.047f)
                lineTo(24.31f, 4.25f)
                lineToRelative(-2.5f, 5.0f)
                horizontalLineToRelative(9.941f)
                close()
                moveTo(20.69f, 9.25f)
                horizontalLineToRelative(-7.88f)
                lineToRelative(2.5f, -5.0f)
                horizontalLineToRelative(7.88f)
                close()
                moveTo(4.25f, 9.25f)
                horizontalLineToRelative(7.44f)
                lineToRelative(2.5f, -5.0f)
                lineTo(5.298f, 4.25f)
                arcTo(1.047f, 1.047f, 0.0f, false, false, 4.25f, 5.297f)
                close()
                moveTo(32.75f, 10.25f)
                lineTo(3.25f, 10.25f)
                lineTo(3.25f, 5.297f)
                arcTo(2.047f, 2.047f, 0.0f, false, true, 5.297f, 3.25f)
                horizontalLineToRelative(25.406f)
                arcToRelative(2.047f, 2.047f, 0.0f, false, true, 2.047f, 2.047f)
                close()
                moveTo(4.25f, 12.04f)
                verticalLineToRelative(19.75f)
                horizontalLineToRelative(27.5f)
                lineTo(31.75f, 12.04f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(20.75f)
                lineTo(3.25f, 32.79f)
                lineTo(3.25f, 12.04f)
                close()
                moveTo(22.74f, 20.562f)
                lineTo(14.49f, 16.062f)
                lineTo(13.75f, 15.658f)
                verticalLineToRelative(10.684f)
                lineToRelative(0.74f, -0.403f)
                lineToRelative(8.25f, -4.5f)
                lineToRelative(0.804f, -0.439f)
                close()
                moveTo(21.455f, 21.0f)
                lineToRelative(-6.706f, 3.658f)
                verticalLineToRelative(-7.317f)
                close()
            }
        }
        .build()
        return _clapperboardMedium!!
    }

private var _clapperboardMedium: ImageVector? = null
