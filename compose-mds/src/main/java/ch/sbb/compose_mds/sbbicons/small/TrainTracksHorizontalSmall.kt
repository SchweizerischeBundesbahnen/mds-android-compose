package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.TrainTracksHorizontalSmall: ImageVector
    get() {
        if (_trainTracksHorizontalSmall != null) {
            return _trainTracksHorizontalSmall!!
        }
        _trainTracksHorizontalSmall = Builder(name = "TrainTracksHorizontalSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(3.0f, 10.0f)
                lineTo(3.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(19.0f, 15.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(14.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(8.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                lineTo(8.0f, 15.0f)
                close()
                moveTo(7.0f, 15.0f)
                verticalLineToRelative(-5.0f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _trainTracksHorizontalSmall!!
    }

private var _trainTracksHorizontalSmall: ImageVector? = null