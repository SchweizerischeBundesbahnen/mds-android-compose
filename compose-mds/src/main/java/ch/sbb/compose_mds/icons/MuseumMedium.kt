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

public val SBBIcons.MuseumMedium: ImageVector
    get() {
        if (_museumMedium != null) {
            return _museumMedium!!
        }
        _museumMedium = Builder(name = "MuseumMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.1f, 3.26f)
                lineToRelative(-0.1f, -0.02f)
                lineToRelative(-0.1f, 0.02f)
                lineTo(3.65f, 6.155f)
                lineToRelative(-0.4f, 0.081f)
                verticalLineToRelative(4.014f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(29.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-15.5f)
                horizontalLineToRelative(3.0f)
                lineTo(32.75f, 6.236f)
                lineToRelative(-0.4f, -0.081f)
                close()
                moveTo(28.75f, 10.25f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-15.5f)
                close()
                moveTo(24.25f, 10.25f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-15.5f)
                close()
                moveTo(19.75f, 10.25f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-15.5f)
                close()
                moveTo(11.75f, 25.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-15.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(10.75f, 10.25f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(4.25f, 9.25f)
                lineTo(4.25f, 7.054f)
                lineTo(18.0f, 4.26f)
                lineToRelative(13.75f, 2.794f)
                lineTo(31.75f, 9.25f)
                close()
                moveTo(5.75f, 29.25f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                lineTo(4.25f, 31.75f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _museumMedium!!
    }

private var _museumMedium: ImageVector? = null
