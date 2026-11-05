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

public val SBBIcons.ExclamationPointMedium: ImageVector
    get() {
        if (_exclamationPointMedium != null) {
            return _exclamationPointMedium!!
        }
        _exclamationPointMedium = Builder(
            name = "ExclamationPointMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(19.497f, 25.633f)
                lineTo(19.497f, 28.5f)
                horizontalLineToRelative(-2.993f)
                verticalLineToRelative(-2.867f)
                close()
                moveTo(19.357f, 14.388f)
                lineTo(18.662f, 23.434f)
                horizontalLineToRelative(-1.323f)
                lineToRelative(-0.669f, -9.046f)
                lineTo(16.67f, 8.154f)
                horizontalLineToRelative(2.687f)
                close()
            }
        }
            .build()
        return _exclamationPointMedium!!
    }

private var _exclamationPointMedium: ImageVector? = null
