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

public val SBBIcons.StarFilledLarge: ImageVector
    get() {
        if (_starFilledLarge != null) {
            return _starFilledLarge!!
        }
        _starFilledLarge = Builder(
            name = "StarFilledLarge",
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
                moveTo(23.975f, 7.342f)
                lineTo(27.86f, 19.0f)
                horizontalLineToRelative(12.097f)
                lineToRelative(-1.15f, 0.895f)
                lineToRelative(-8.718f, 6.779f)
                lineToRelative(3.884f, 11.26f)
                lineToRelative(0.48f, 1.391f)
                lineToRelative(-1.228f, -0.81f)
                lineTo(23.5f, 32.1f)
                lineToRelative(-9.725f, 6.417f)
                lineToRelative(-1.227f, 0.81f)
                lineToRelative(0.48f, -1.391f)
                lineToRelative(3.882f, -11.261f)
                lineToRelative(-8.717f, -6.78f)
                lineTo(7.043f, 19.0f)
                horizontalLineTo(19.14f)
                lineToRelative(3.885f, -11.658f)
                lineToRelative(0.475f, -1.423f)
                close()
            }
        }
            .build()
        return _starFilledLarge!!
    }

private var _starFilledLarge: ImageVector? = null
