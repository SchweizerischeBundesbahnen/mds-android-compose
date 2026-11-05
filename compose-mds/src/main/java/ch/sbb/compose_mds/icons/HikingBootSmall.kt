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

public val SBBIcons.HikingBootSmall: ImageVector
    get() {
        if (_hikingBootSmall != null) {
            return _hikingBootSmall!!
        }
        _hikingBootSmall = Builder(
            name = "HikingBootSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                moveTo(9.974f, 6.342f)
                lineTo(9.86f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.5f, 19.0f)
                horizontalLineToRelative(4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, -3.5f)
                horizontalLineToRelative(-2.372f)
                lineToRelative(-1.508f, -0.822f)
                lineToRelative(-1.94f, -1.059f)
                lineToRelative(-1.768f, -0.964f)
                close()
                moveTo(21.0f, 17.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                moveToRelative(0.0f, -1.5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                horizontalLineToRelative(-2.627f)
                lineToRelative(-0.112f, -0.061f)
                lineToRelative(-1.29f, -0.704f)
                lineToRelative(-1.117f, 1.118f)
                lineToRelative(-0.708f, -0.706f)
                lineToRelative(0.91f, -0.91f)
                lineToRelative(-1.027f, -0.56f)
                lineToRelative(-1.175f, 1.176f)
                lineToRelative(-0.708f, -0.706f)
                lineToRelative(0.968f, -0.97f)
                lineToRelative(-1.025f, -0.559f)
                lineToRelative(-1.235f, 1.236f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(1.282f, -1.282f)
                lineTo(9.14f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(3.0f, 17.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineTo(17.0f)
                close()
            }
        }
            .build()
        return _hikingBootSmall!!
    }

private var _hikingBootSmall: ImageVector? = null
