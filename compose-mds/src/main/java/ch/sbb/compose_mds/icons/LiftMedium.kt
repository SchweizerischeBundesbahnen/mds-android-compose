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
                moveToRelative(28.5f, 5.11f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(3.181f, 3.183f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.828f, -2.83f)
                lineToRelative(-2.828f, 2.83f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(3.181f, -3.183f)
                close()
                moveTo(3.625f, 5.125f)
                horizontalLineToRelative(18.25f)
                verticalLineToRelative(25.75f)
                lineTo(3.625f, 30.875f)
                lineTo(3.625f, 5.125f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(23.75f)
                horizontalLineToRelative(16.25f)
                lineTo(20.875f, 6.125f)
                close()
                moveTo(25.672f, 26.648f)
                lineTo(28.5f, 29.476f)
                lineTo(31.328f, 26.648f)
                lineTo(32.035f, 27.355f)
                lineTo(28.854f, 30.536f)
                lineTo(28.5f, 30.89f)
                lineTo(28.147f, 30.536f)
                lineTo(24.965f, 27.355f)
                close()
                moveTo(12.75f, 8.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(-1.0f, 4.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-6.5f)
                moveToRelative(0.5f, 7.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.5f)
            }
        }
        .build()
        return _liftMedium!!
    }

private var _liftMedium: ImageVector? = null
