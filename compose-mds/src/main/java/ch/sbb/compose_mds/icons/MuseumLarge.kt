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

public val SBBIcons.MuseumLarge: ImageVector
    get() {
        if (_museumLarge != null) {
            return _museumLarge!!
        }
        _museumLarge = Builder(name = "MuseumLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(40.59f, 12.006f)
                lineTo(24.096f, 9.008f)
                lineToRelative(-0.09f, -0.016f)
                lineToRelative(-0.089f, 0.016f)
                lineTo(7.41f, 12.006f)
                lineTo(7.0f, 12.08f)
                lineTo(7.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(15.0f)
                lineTo(8.0f, 32.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 35.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(34.001f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(39.001f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.92f)
                close()
                moveTo(38.002f, 32.0f)
                lineTo(38.002f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(35.002f, 32.0f)
                lineTo(35.002f, 17.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(29.002f, 32.0f)
                lineTo(29.002f, 17.0f)
                lineTo(27.0f, 17.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(26.0f, 32.0f)
                horizontalLineToRelative(-3.999f)
                lineTo(22.001f, 17.0f)
                lineTo(26.0f, 17.0f)
                close()
                moveTo(21.001f, 32.0f)
                lineTo(21.001f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(18.001f, 32.0f)
                lineTo(18.001f, 17.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(12.001f, 32.0f)
                lineTo(12.001f, 17.0f)
                lineTo(10.0f, 17.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(-3.085f)
                lineToRelative(16.005f, -2.907f)
                lineTo(40.0f, 12.915f)
                lineTo(40.0f, 16.0f)
                close()
                moveTo(13.194f, 38.0f)
                horizontalLineToRelative(21.613f)
                lineToRelative(-1.667f, -5.0f)
                lineTo(14.86f, 33.0f)
                close()
                moveTo(13.806f, 33.0f)
                lineTo(12.139f, 38.0f)
                lineTo(8.0f, 38.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(34.195f, 33.0f)
                lineTo(35.862f, 38.0f)
                lineTo(40.0f, 38.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _museumLarge!!
    }

private var _museumLarge: ImageVector? = null
