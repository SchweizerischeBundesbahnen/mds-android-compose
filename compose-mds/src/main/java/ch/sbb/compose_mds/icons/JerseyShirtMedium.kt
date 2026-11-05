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

public val SBBIcons.JerseyShirtMedium: ImageVector
    get() {
        if (_jerseyShirtMedium != null) {
            return _jerseyShirtMedium!!
        }
        _jerseyShirtMedium = Builder(
            name = "JerseyShirtMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(10.75f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.997f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.75f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.0f, 3.465f)
                lineTo(8.75f, 32.5f)
                horizontalLineToRelative(18.5f)
                lineTo(27.25f, 15.465f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.0f, -3.465f)
                lineTo(24.25f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.997f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.25f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(19.0f)
                lineTo(7.75f, 33.5f)
                verticalLineToRelative(-19.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                lineTo(10.75f, 4.0f)
                moveToRelative(4.0f, 2.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 6.5f, 0.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, -8.5f, 0.0f)
                close()
                moveTo(19.5f, 27.0f)
                lineTo(19.5f, 16.5f)
                horizontalLineToRelative(-1.62f)
                quadToRelative(-0.2f, 1.054f, -0.772f, 1.5f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, -0.873f, 0.447f)
                quadToRelative(-0.478f, 0.136f, -1.235f, 0.157f)
                verticalLineToRelative(1.523f)
                horizontalLineToRelative(2.433f)
                lineTo(17.433f, 27.0f)
                close()
            }
        }
            .build()
        return _jerseyShirtMedium!!
    }

private var _jerseyShirtMedium: ImageVector? = null
