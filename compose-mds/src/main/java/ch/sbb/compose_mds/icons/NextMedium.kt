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

public val SBBIcons.NextMedium: ImageVector
    get() {
        if (_nextMedium != null) {
            return _nextMedium!!
        }
        _nextMedium = Builder(
            name = "NextMedium",
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
                moveTo(7.022f, 7.83f)
                lineTo(22.667f, 18.0f)
                lineTo(7.022f, 28.169f)
                lineToRelative(-0.772f, 0.501f)
                lineTo(6.25f, 7.33f)
                close()
                moveTo(29.752f, 28.25f)
                horizontalLineToRelative(-5.5f)
                lineTo(24.252f, 7.75f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(25.252f, 27.25f)
                horizontalLineToRelative(3.5f)
                lineTo(28.752f, 8.75f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(7.25f, 26.828f)
                lineToRelative(6.727f, -4.372f)
                lineTo(20.834f, 18.0f)
                lineToRelative(-6.855f, -4.456f)
                lineTo(7.25f, 9.17f)
                close()
            }
        }
            .build()
        return _nextMedium!!
    }

private var _nextMedium: ImageVector? = null
