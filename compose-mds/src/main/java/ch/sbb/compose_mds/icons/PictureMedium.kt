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

public val SBBIcons.PictureMedium: ImageVector
    get() {
        if (_pictureMedium != null) {
            return _pictureMedium!!
        }
        _pictureMedium = Builder(name = "PictureMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.75f, 32.75f)
                lineTo(32.75f, 3.25f)
                lineTo(3.25f, 3.25f)
                verticalLineToRelative(29.5f)
                close()
                moveTo(31.75f, 31.75f)
                lineTo(4.25f, 31.75f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(27.5f)
                close()
                moveTo(31.75f, 25.75f)
                lineTo(30.3f, 25.75f)
                lineToRelative(-5.859f, -10.985f)
                lineToRelative(-0.334f, -0.626f)
                lineToRelative(-0.477f, 0.525f)
                lineToRelative(-7.171f, 7.887f)
                lineToRelative(-5.63f, -4.927f)
                lineToRelative(-0.47f, -0.411f)
                lineToRelative(-0.297f, 0.548f)
                lineToRelative(-4.358f, 7.989f)
                lineTo(4.25f, 25.75f)
                lineTo(4.25f, 4.25f)
                horizontalLineToRelative(27.5f)
                close()
                moveTo(12.25f, 10.5f)
                arcToRelative(1.749f, 1.749f, 0.0f, true, false, -3.5f, 0.0f)
                arcToRelative(1.749f, 1.749f, 0.0f, true, false, 3.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.52f, -1.23f, 2.75f, -2.75f, 2.75f)
                reflectiveCurveToRelative(-2.75f, -1.23f, -2.75f, -2.75f)
                reflectiveCurveToRelative(1.23f, -2.75f, 2.75f, -2.75f)
                reflectiveCurveToRelative(2.75f, 1.23f, 2.75f, 2.75f)
                moveToRelative(15.916f, 15.25f)
                lineToRelative(-5.274f, -9.889f)
                lineToRelative(-7.022f, 7.725f)
                lineToRelative(-0.33f, 0.363f)
                lineToRelative(-0.37f, -0.323f)
                lineToRelative(-5.53f, -4.84f)
                lineToRelative(-3.798f, 6.964f)
                close()
            }
        }
        .build()
        return _pictureMedium!!
    }

private var _pictureMedium: ImageVector? = null
