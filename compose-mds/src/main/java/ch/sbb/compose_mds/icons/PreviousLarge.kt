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

public val SBBIcons.PreviousLarge: ImageVector
    get() {
        if (_previousLarge != null) {
            return _previousLarge!!
        }
        _previousLarge = Builder(
            name = "PreviousLarge",
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
                moveToRelative(39.002f, 37.42f)
                lineToRelative(-0.773f, -0.501f)
                lineTo(17.586f, 23.5f)
                lineTo(38.23f, 10.081f)
                lineToRelative(0.772f, -0.502f)
                close()
                moveTo(15.0f, 37.0f)
                lineTo(8.0f, 37.0f)
                lineTo(8.0f, 10.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(9.0f, 36.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.0f, 11.0f)
                lineTo(9.0f, 11.0f)
                close()
                moveTo(28.774f, 17.419f)
                lineTo(19.42f, 23.5f)
                lineToRelative(9.355f, 6.081f)
                lineToRelative(9.228f, 5.997f)
                lineTo(38.003f, 11.421f)
                close()
            }
        }
            .build()
        return _previousLarge!!
    }

private var _previousLarge: ImageVector? = null
