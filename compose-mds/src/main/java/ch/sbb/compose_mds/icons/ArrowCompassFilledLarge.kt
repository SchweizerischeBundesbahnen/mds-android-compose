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

public val SBBIcons.ArrowCompassFilledLarge: ImageVector
    get() {
        if (_arrowCompassFilledLarge != null) {
            return _arrowCompassFilledLarge!!
        }
        _arrowCompassFilledLarge = Builder(
            name = "ArrowCompassFilledLarge",
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
                moveTo(38.825f, 9.729f)
                lineTo(23.945f, 38.61f)
                lineToRelative(-0.944f, 1.833f)
                verticalLineTo(24.882f)
                horizontalLineTo(7.439f)
                lineToRelative(1.832f, -0.945f)
                lineTo(38.152f, 9.057f)
                lineToRelative(1.389f, -0.716f)
                close()
            }
        }
            .build()
        return _arrowCompassFilledLarge!!
    }

private var _arrowCompassFilledLarge: ImageVector? = null
