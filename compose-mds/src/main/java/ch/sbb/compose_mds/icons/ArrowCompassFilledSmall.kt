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

public val SBBIcons.ArrowCompassFilledSmall: ImageVector
    get() {
        if (_arrowCompassFilledSmall != null) {
            return _arrowCompassFilledSmall!!
        }
        _arrowCompassFilledSmall = Builder(
            name = "ArrowCompassFilledSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveToRelative(19.385f, 5.229f)
                lineToRelative(-7.44f, 14.44f)
                lineToRelative(-0.444f, -0.228f)
                lineToRelative(0.444f, 0.229f)
                lineTo(11.0f, 21.503f)
                verticalLineTo(12.94f)
                horizontalLineTo(2.439f)
                lineToRelative(1.832f, -0.945f)
                lineToRelative(14.44f, -7.44f)
                lineToRelative(1.39f, -0.716f)
                close()
            }
        }
            .build()
        return _arrowCompassFilledSmall!!
    }

private var _arrowCompassFilledSmall: ImageVector? = null
