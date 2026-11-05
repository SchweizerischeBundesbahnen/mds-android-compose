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
        _pictureMedium = Builder(
            name = "PictureMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(3.75f, 3.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(29.5f)
                horizontalLineToRelative(29.5f)
                lineTo(32.75f, 3.25f)
                horizontalLineToRelative(-29.0f)
                moveToRelative(0.5f, 22.5f)
                lineTo(4.25f, 4.25f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(21.5f)
                lineTo(30.3f, 25.75f)
                lineToRelative(-5.859f, -10.985f)
                lineToRelative(-0.334f, -0.626f)
                lineToRelative(-0.477f, 0.525f)
                lineToRelative(-7.17f, 7.887f)
                lineToRelative(-5.63f, -4.927f)
                lineToRelative(-0.47f, -0.411f)
                lineToRelative(-0.299f, 0.548f)
                lineToRelative(-4.358f, 7.989f)
                close()
                moveTo(4.25f, 26.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(10.5f, 8.75f)
                arcToRelative(1.749f, 1.749f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.749f, 1.749f, 0.0f, true, false, 0.0f, -3.5f)
                moveTo(7.75f, 10.5f)
                curveToRelative(0.0f, -1.52f, 1.23f, -2.75f, 2.75f, -2.75f)
                reflectiveCurveToRelative(2.75f, 1.23f, 2.75f, 2.75f)
                reflectiveCurveToRelative(-1.23f, 2.75f, -2.75f, 2.75f)
                reflectiveCurveToRelative(-2.75f, -1.23f, -2.75f, -2.75f)
                moveToRelative(21.417f, 15.25f)
                lineToRelative(-5.274f, -9.889f)
                lineToRelative(-7.023f, 7.725f)
                lineToRelative(-0.33f, 0.363f)
                lineToRelative(-0.37f, -0.323f)
                lineToRelative(-5.53f, -4.839f)
                lineToRelative(-3.798f, 6.963f)
                close()
            }
        }
            .build()
        return _pictureMedium!!
    }

private var _pictureMedium: ImageVector? = null
