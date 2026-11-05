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

public val SBBIcons.TrainTracksHorizontalLarge: ImageVector
    get() {
        if (_trainTracksHorizontalLarge != null) {
            return _trainTracksHorizontalLarge!!
        }
        _trainTracksHorizontalLarge = Builder(name = "TrainTracksHorizontalLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(9.0f, 31.0f)
                verticalLineToRelative(5.0f)
                lineTo(8.0f, 36.0f)
                verticalLineToRelative(-5.0f)
                lineTo(5.0f, 31.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(8.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 19.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(5.0f)
                lineTo(38.0f, 19.0f)
                close()
                moveTo(9.0f, 30.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                close()
                moveTo(15.0f, 30.0f)
                horizontalLineToRelative(5.0f)
                lineTo(20.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(21.0f, 30.0f)
                horizontalLineToRelative(5.0f)
                lineTo(26.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(27.0f, 30.0f)
                horizontalLineToRelative(5.0f)
                lineTo(32.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _trainTracksHorizontalLarge!!
    }

private var _trainTracksHorizontalLarge: ImageVector? = null
