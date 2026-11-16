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

public val SBBIcons.LiftMedium: ImageVector
    get() {
        if (_liftMedium != null) {
            return _liftMedium!!
        }
        _liftMedium = Builder(name = "LiftMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(28.854f, 5.464f)
                lineToRelative(3.181f, 3.182f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(-2.828f, -2.83f)
                lineToRelative(-2.828f, 2.83f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(3.182f, -3.182f)
                lineToRelative(0.353f, -0.354f)
                close()
                moveTo(21.875f, 5.125f)
                verticalLineToRelative(25.75f)
                lineTo(3.625f, 30.875f)
                lineTo(3.625f, 5.125f)
                close()
                moveTo(4.625f, 29.875f)
                horizontalLineToRelative(16.25f)
                lineTo(20.875f, 6.125f)
                lineTo(4.625f, 6.125f)
                close()
                moveTo(28.5f, 30.89f)
                lineToRelative(3.535f, -3.535f)
                lineToRelative(-0.706f, -0.707f)
                lineToRelative(-2.829f, 2.828f)
                lineToRelative(-2.828f, -2.828f)
                lineToRelative(-0.707f, 0.707f)
                close()
                moveTo(13.75f, 9.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.002f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.001f, 0.0f)
                moveToRelative(1.5f, 12.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(11.749f, 21.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _liftMedium!!
    }

private var _liftMedium: ImageVector? = null
