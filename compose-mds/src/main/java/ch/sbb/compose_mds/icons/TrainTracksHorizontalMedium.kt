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

public val SBBIcons.TrainTracksHorizontalMedium: ImageVector
    get() {
        if (_trainTracksHorizontalMedium != null) {
            return _trainTracksHorizontalMedium!!
        }
        _trainTracksHorizontalMedium = Builder(name = "TrainTracksHorizontalMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.25f, 10.5f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(3.5f)
                lineTo(10.75f, 10.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(3.5f)
                lineTo(15.25f, 10.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(3.5f)
                lineTo(19.75f, 10.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(3.5f)
                lineTo(24.25f, 10.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(3.5f)
                lineTo(28.75f, 10.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                lineTo(29.75f, 27.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(-3.5f)
                lineTo(25.25f, 27.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(-3.5f)
                lineTo(20.75f, 27.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(-3.5f)
                lineTo(16.25f, 27.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(-3.5f)
                lineTo(11.75f, 27.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(-3.5f)
                lineTo(7.25f, 27.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                lineTo(4.5f, 23.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-8.0f)
                lineTo(4.5f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                lineTo(6.25f, 10.5f)
                close()
                moveTo(28.75f, 22.75f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(20.75f, 14.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(19.75f, 22.75f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(11.75f, 14.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(10.75f, 22.75f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _trainTracksHorizontalMedium!!
    }

private var _trainTracksHorizontalMedium: ImageVector? = null
