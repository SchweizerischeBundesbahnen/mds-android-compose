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

public val SBBIcons.ListArrowLeftLarge: ImageVector
    get() {
        if (_listArrowLeftLarge != null) {
            return _listArrowLeftLarge!!
        }
        _listArrowLeftLarge = Builder(
            name = "ListArrowLeftLarge",
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
                moveTo(34.0f, 11.0f)
                lineTo(18.0f, 11.0f)
                verticalLineToRelative(27.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.0f)
                lineTo(10.5f, 39.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.0f, 35.5f)
                verticalLineToRelative(-22.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                lineTo(34.0f, 10.0f)
                close()
                moveTo(10.5f, 11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.0f, 13.5f)
                verticalLineToRelative(22.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                lineTo(17.0f, 38.0f)
                lineTo(17.0f, 11.0f)
                close()
                moveTo(33.48f, 16.5f)
                lineTo(33.834f, 16.852f)
                lineTo(26.704f, 24.016f)
                lineTo(41.0f, 24.016f)
                verticalLineToRelative(1.0f)
                lineTo(26.707f, 25.016f)
                lineToRelative(7.127f, 7.13f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-7.98f, -7.984f)
                lineToRelative(-0.352f, -0.352f)
                lineToRelative(0.351f, -0.354f)
                lineToRelative(7.981f, -8.015f)
                close()
            }
        }
            .build()
        return _listArrowLeftLarge!!
    }

private var _listArrowLeftLarge: ImageVector? = null
