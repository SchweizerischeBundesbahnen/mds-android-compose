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

public val SmallGroup.LiftSmall: ImageVector
    get() {
        if (_liftSmall != null) {
            return _liftSmall!!
        }
        _liftSmall = Builder(name = "LiftSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.0f, 3.17f)
                lineToRelative(0.354f, 0.355f)
                lineToRelative(2.12f, 2.122f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(19.0f, 4.585f)
                lineToRelative(-1.767f, 1.769f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(2.121f, -2.122f)
                close()
                moveTo(2.25f, 3.25f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(17.5f)
                lineTo(2.25f, 20.75f)
                lineTo(2.25f, 3.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(10.5f)
                lineTo(13.75f, 4.25f)
                close()
                moveTo(17.233f, 17.647f)
                lineTo(19.0f, 19.415f)
                lineToRelative(1.768f, -1.768f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(-2.121f, -2.12f)
                close()
                moveTo(8.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.001f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(7.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.999f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveTo(6.5f, 9.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 9.0f)
                lineTo(6.5f, 9.0f)
                moveToRelative(1.0f, 5.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineTo(9.0f, 14.0f)
                verticalLineToRelative(4.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _liftSmall!!
    }

private var _liftSmall: ImageVector? = null
