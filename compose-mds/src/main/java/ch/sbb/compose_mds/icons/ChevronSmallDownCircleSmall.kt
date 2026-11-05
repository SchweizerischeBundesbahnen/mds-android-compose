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

public val SBBIcons.ChevronSmallDownCircleSmall: ImageVector
    get() {
        if (_chevronSmallDownCircleSmall != null) {
            return _chevronSmallDownCircleSmall!!
        }
        _chevronSmallDownCircleSmall = Builder(
            name = "ChevronSmallDownCircleSmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
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
                moveTo(5.0f, 12.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -14.0f, 0.0f)
                moveToRelative(7.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                moveTo(7.737f, 10.7f)
                lineToRelative(3.904f, 3.95f)
                lineToRelative(0.355f, 0.36f)
                lineToRelative(0.356f, -0.36f)
                lineToRelative(3.904f, -3.948f)
                lineToRelative(-0.711f, -0.703f)
                lineToRelative(-3.549f, 3.589f)
                lineToRelative(-3.548f, -3.59f)
                close()
            }
        }
            .build()
        return _chevronSmallDownCircleSmall!!
    }

private var _chevronSmallDownCircleSmall: ImageVector? = null
