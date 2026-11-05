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

public val SBBIcons.ChevronSmallLeftLarge: ImageVector
    get() {
        if (_chevronSmallLeftLarge != null) {
            return _chevronSmallLeftLarge!!
        }
        _chevronSmallLeftLarge = Builder(name = "ChevronSmallLeftLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.202f, 17.048f)
                lineTo(20.661f, 24.5f)
                lineToRelative(7.537f, 7.453f)
                lineToRelative(-0.352f, 0.355f)
                lineToRelative(-0.352f, 0.356f)
                lineToRelative(-7.896f, -7.809f)
                lineToRelative(-0.359f, -0.355f)
                lineToRelative(0.36f, -0.356f)
                lineToRelative(7.9f, -7.807f)
                close()
            }
        }
        .build()
        return _chevronSmallLeftLarge!!
    }

private var _chevronSmallLeftLarge: ImageVector? = null
