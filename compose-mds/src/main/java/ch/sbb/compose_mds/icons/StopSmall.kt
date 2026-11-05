package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.StopSmall: ImageVector
    get() {
        if (_stopSmall != null) {
            return _stopSmall!!
        }
        _stopSmall = Builder(
            name = "StopSmall",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
            .build()
        return _stopSmall!!
    }

private var _stopSmall: ImageVector? = null
