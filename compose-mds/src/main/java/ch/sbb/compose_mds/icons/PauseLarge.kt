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

public val SBBIcons.PauseLarge: ImageVector
    get() {
        if (_pauseLarge != null) {
            return _pauseLarge!!
        }
        _pauseLarge = Builder(
            name = "PauseLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                moveTo(21.0f, 37.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(14.0f, 10.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(33.002f, 37.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(26.002f, 10.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(15.0f, 36.0f)
                horizontalLineToRelative(5.0f)
                lineTo(20.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(27.002f, 36.0f)
                horizontalLineToRelative(5.0f)
                lineTo(32.002f, 11.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
            .build()
        return _pauseLarge!!
    }

private var _pauseLarge: ImageVector? = null
