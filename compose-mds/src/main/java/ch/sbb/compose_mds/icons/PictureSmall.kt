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

public val SBBIcons.PictureSmall: ImageVector
    get() {
        if (_pictureSmall != null) {
            return _pictureSmall!!
        }
        _pictureSmall = Builder(name = "PictureSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 2.0f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 2.0f)
                lineTo(2.5f, 2.0f)
                moveTo(3.0f, 17.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-0.7f)
                lineToRelative(-3.859f, -7.235f)
                lineToRelative(-0.334f, -0.626f)
                lineToRelative(-0.477f, 0.525f)
                lineToRelative(-4.67f, 5.137f)
                lineToRelative(-3.63f, -3.177f)
                lineToRelative(-0.47f, -0.411f)
                lineToRelative(-0.299f, 0.548f)
                lineTo(3.703f, 17.0f)
                close()
                moveTo(3.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(7.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -0.001f, 1.999f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 6.0f)
                moveTo(5.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.999f, -0.001f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 7.0f)
                moveToRelative(14.167f, 10.0f)
                lineToRelative(-3.274f, -6.139f)
                lineToRelative(-4.523f, 4.975f)
                lineToRelative(-0.33f, 0.363f)
                lineToRelative(-0.37f, -0.323f)
                lineToRelative(-3.53f, -3.089f)
                lineTo(4.842f, 17.0f)
                close()
            }
        }
        .build()
        return _pictureSmall!!
    }

private var _pictureSmall: ImageVector? = null
