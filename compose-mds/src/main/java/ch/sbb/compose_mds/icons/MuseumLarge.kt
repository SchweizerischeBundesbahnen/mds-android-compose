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
                moveToRelative(24.094f, 9.008f)
                lineToRelative(-0.089f, -0.016f)
                lineToRelative(-0.09f, 0.016f)
                lineToRelative(-16.504f, 2.998f)
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
                lineTo(41.001f, 12.08f)
                lineToRelative(-0.41f, -0.075f)
                close()
                moveTo(38.001f, 32.0f)
                lineTo(38.001f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(35.001f, 32.0f)
                lineTo(35.001f, 17.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(29.001f, 32.0f)
                lineTo(29.001f, 17.0f)
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
                lineToRelative(15.996f, 2.907f)
                lineTo(40.001f, 16.0f)
                close()
                moveTo(13.806f, 33.0f)
                lineTo(9.0f, 33.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 36.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.14f)
                close()
                moveTo(14.86f, 33.0f)
                horizontalLineToRelative(18.28f)
                lineToRelative(1.667f, 5.0f)
                lineTo(13.194f, 38.0f)
                close()
                moveTo(35.861f, 38.0f)
                horizontalLineToRelative(4.14f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.806f)
                close()
            }
        }
        .build()
        return _museumLarge!!
    }

private var _museumLarge: ImageVector? = null
