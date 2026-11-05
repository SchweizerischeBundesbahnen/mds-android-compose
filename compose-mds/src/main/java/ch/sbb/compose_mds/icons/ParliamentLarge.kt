package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ParliamentLarge: ImageVector
    get() {
        if (_parliamentLarge != null) {
            return _parliamentLarge!!
        }
        _parliamentLarge = Builder(
            name = "ParliamentLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(28.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.02f)
                curveToRelative(3.356f, 0.256f, 6.0f, 3.058f, 6.0f, 6.48f)
                verticalLineToRelative(6.061f)
                lineToRelative(3.685f, 1.475f)
                lineToRelative(0.315f, 0.125f)
                lineTo(34.0f, 30.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 43.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(7.0f, 30.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.839f)
                lineToRelative(0.315f, -0.125f)
                lineTo(17.0f, 22.561f)
                lineTo(17.0f, 16.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.0f, -6.48f)
                lineTo(23.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(34.0f, 42.0f)
                horizontalLineToRelative(5.0f)
                lineTo(39.0f, 31.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(8.0f, 42.0f)
                horizontalLineToRelative(5.0f)
                lineTo(13.0f, 31.0f)
                lineTo(8.0f, 31.0f)
                close()
                moveTo(14.0f, 42.0f)
                horizontalLineToRelative(3.0f)
                lineTo(17.0f, 31.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 42.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-0.002f, -5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                lineTo(26.0f, 42.0f)
                horizontalLineToRelative(3.001f)
                lineTo(29.0f, 31.0f)
                lineTo(18.0f, 31.0f)
                close()
                moveTo(23.497f, 35.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.499f, 1.5f)
                lineTo(22.0f, 42.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-0.003f, -5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                moveToRelative(6.504f, 7.0f)
                lineTo(33.0f, 42.0f)
                lineTo(33.0f, 31.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(14.0f, 30.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-3.0f)
                lineTo(14.0f, 27.0f)
                close()
                moveTo(14.0f, 24.838f)
                lineTo(14.0f, 26.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-1.162f)
                lineToRelative(-9.5f, -3.8f)
                close()
                moveTo(18.0f, 22.161f)
                lineTo(23.5f, 19.961f)
                lineTo(29.0f, 22.161f)
                lineTo(29.0f, 17.0f)
                lineTo(18.0f, 17.0f)
                close()
                moveTo(23.5f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.477f, 5.0f)
                horizontalLineToRelative(10.954f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.477f, -5.0f)
                moveToRelative(0.5f, -5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(27.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
            .build()
        return _parliamentLarge!!
    }

private var _parliamentLarge: ImageVector? = null
