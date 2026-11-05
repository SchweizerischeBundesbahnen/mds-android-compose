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

public val SBBIcons.FourSquaresLarge: ImageVector
    get() {
        if (_fourSquaresLarge != null) {
            return _fourSquaresLarge!!
        }
        _fourSquaresLarge = Builder(
            name = "FourSquaresLarge",
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
                moveTo(20.0f, 39.0f)
                lineTo(9.0f, 39.0f)
                lineTo(9.0f, 28.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(38.0f, 39.0f)
                lineTo(27.0f, 39.0f)
                lineTo(27.0f, 28.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(10.0f, 38.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(28.0f, 38.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(20.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                lineTo(9.0f, 10.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(38.0f, 21.0f)
                lineTo(27.0f, 21.0f)
                lineTo(27.0f, 10.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(28.0f, 20.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
            .build()
        return _fourSquaresLarge!!
    }

private var _fourSquaresLarge: ImageVector? = null
