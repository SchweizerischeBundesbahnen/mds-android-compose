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

public val SBBIcons.NextSmall: ImageVector
    get() {
        if (_nextSmall != null) {
            return _nextSmall!!
        }
        _nextSmall = Builder(
            name = "NextSmall",
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
                moveTo(4.772f, 5.08f)
                lineTo(4.0f, 4.58f)
                lineTo(4.0f, 19.42f)
                lineToRelative(0.772f, -0.502f)
                lineToRelative(5.0f, -3.25f)
                lineToRelative(5.0f, -3.25f)
                lineToRelative(0.646f, -0.419f)
                lineToRelative(-0.645f, -0.42f)
                lineToRelative(-5.0f, -3.25f)
                close()
                moveTo(5.0f, 12.0f)
                lineTo(5.0f, 6.421f)
                lineTo(9.228f, 9.17f)
                lineTo(13.583f, 12.0f)
                lineToRelative(-4.355f, 2.83f)
                lineTo(5.0f, 17.58f)
                close()
                moveTo(16.501f, 5.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(4.0f)
                lineTo(20.001f, 5.0f)
                horizontalLineToRelative(-3.5f)
                moveToRelative(2.5f, 13.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.001f, 6.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
            .build()
        return _nextSmall!!
    }

private var _nextSmall: ImageVector? = null
