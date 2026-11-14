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

public val SBBIcons.TrainTracksMedium: ImageVector
    get() {
        if (_trainTracksMedium != null) {
            return _trainTracksMedium!!
        }
        _trainTracksMedium = Builder(name = "TrainTracksMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.25f, 13.75f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(9.25f, 14.75f)
                verticalLineToRelative(5.0f)
                lineTo(6.0f, 19.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(5.0f)
                lineTo(6.0f, 25.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.25f)
                lineTo(9.25f, 30.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(15.5f)
                lineTo(25.75f, 30.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                lineTo(30.0f, 26.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-5.0f)
                lineTo(30.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-5.0f)
                lineTo(30.0f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-5.0f)
                lineTo(30.0f, 8.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                lineTo(26.75f, 4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-15.5f)
                lineTo(10.25f, 4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                lineTo(6.0f, 7.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(5.0f)
                lineTo(6.0f, 13.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(25.75f, 25.75f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-15.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(25.75f, 19.75f)
                horizontalLineToRelative(-15.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(15.5f)
                close()
            }
        }
        .build()
        return _trainTracksMedium!!
    }

private var _trainTracksMedium: ImageVector? = null
