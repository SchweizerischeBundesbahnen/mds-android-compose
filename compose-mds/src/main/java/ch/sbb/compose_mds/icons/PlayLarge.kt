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

public val SBBIcons.PlayLarge: ImageVector
    get() {
        if (_playLarge != null) {
            return _playLarge!!
        }
        _playLarge = Builder(
            name = "PlayLarge",
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
                moveToRelative(14.752f, 9.068f)
                lineToRelative(24.0f, 14.0f)
                lineToRelative(0.74f, 0.432f)
                lineToRelative(-0.74f, 0.432f)
                lineToRelative(-24.0f, 14.0f)
                lineToRelative(-0.752f, 0.438f)
                verticalLineTo(8.63f)
                close()
                moveTo(15.0f, 36.628f)
                lineToRelative(11.248f, -6.56f)
                lineToRelative(11.26f, -6.568f)
                lineToRelative(-11.26f, -6.568f)
                lineTo(15.0f, 10.37f)
                close()
            }
        }
            .build()
        return _playLarge!!
    }

private var _playLarge: ImageVector? = null
