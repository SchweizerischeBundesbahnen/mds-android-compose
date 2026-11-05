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

public val SBBIcons.ExclamationPointLarge: ImageVector
    get() {
        if (_exclamationPointLarge != null) {
            return _exclamationPointLarge!!
        }
        _exclamationPointLarge = Builder(
            name = "ExclamationPointLarge",
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
                moveTo(25.496f, 33.678f)
                lineTo(25.496f, 37.5f)
                horizontalLineToRelative(-3.99f)
                verticalLineToRelative(-3.822f)
                close()
                moveTo(25.31f, 18.684f)
                lineTo(24.382f, 30.746f)
                lineTo(22.62f, 30.746f)
                lineToRelative(-0.892f, -12.062f)
                verticalLineToRelative(-8.312f)
                horizontalLineToRelative(3.582f)
                close()
            }
        }
            .build()
        return _exclamationPointLarge!!
    }

private var _exclamationPointLarge: ImageVector? = null
