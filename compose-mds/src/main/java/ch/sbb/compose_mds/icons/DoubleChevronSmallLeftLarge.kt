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

public val SBBIcons.DoubleChevronSmallLeftLarge: ImageVector
    get() {
        if (_doubleChevronSmallLeftLarge != null) {
            return _doubleChevronSmallLeftLarge!!
        }
        _doubleChevronSmallLeftLarge = Builder(name = "DoubleChevronSmallLeftLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.202f, 16.048f)
                lineTo(16.661f, 23.5f)
                lineToRelative(7.537f, 7.453f)
                lineToRelative(-0.352f, 0.355f)
                lineToRelative(-0.352f, 0.356f)
                lineToRelative(-7.896f, -7.809f)
                lineToRelative(-0.359f, -0.355f)
                lineToRelative(0.36f, -0.356f)
                lineToRelative(7.9f, -7.807f)
                close()
                moveTo(32.202f, 16.048f)
                lineTo(24.661f, 23.5f)
                lineToRelative(7.538f, 7.453f)
                lineToRelative(-0.703f, 0.71f)
                lineToRelative(-7.898f, -7.808f)
                lineToRelative(-0.359f, -0.355f)
                lineToRelative(0.36f, -0.356f)
                lineToRelative(7.9f, -7.807f)
                close()
            }
        }
        .build()
        return _doubleChevronSmallLeftLarge!!
    }

private var _doubleChevronSmallLeftLarge: ImageVector? = null
