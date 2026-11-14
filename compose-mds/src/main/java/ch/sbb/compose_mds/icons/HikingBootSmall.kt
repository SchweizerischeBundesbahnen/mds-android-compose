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
        _hikingBootSmall = Builder(name = "HikingBootSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.5f, 13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(6.14f)
                lineToRelative(0.788f, 2.365f)
                lineToRelative(-1.282f, 1.281f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(1.235f, -1.236f)
                lineToRelative(1.025f, 0.56f)
                lineToRelative(-0.968f, 0.97f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(1.175f, -1.178f)
                lineToRelative(1.027f, 0.56f)
                lineToRelative(-0.909f, 0.91f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(1.117f, -1.119f)
                lineToRelative(1.29f, 0.704f)
                lineToRelative(0.112f, 0.062f)
                close()
                moveTo(3.0f, 17.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(8.0f, 17.0f)
                close()
                moveTo(2.0f, 17.5f)
                lineTo(2.0f, 6.0f)
                horizontalLineToRelative(7.86f)
                lineToRelative(0.115f, 0.342f)
                lineToRelative(0.937f, 2.813f)
                lineToRelative(1.767f, 0.964f)
                lineToRelative(1.941f, 1.059f)
                lineToRelative(1.507f, 0.822f)
                lineTo(18.5f, 12.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 19.0f)
                horizontalLineToRelative(-4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 17.5f)
                moveToRelative(19.0f, 0.0f)
                lineTo(21.0f, 17.0f)
                lineTo(10.0f, 17.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
            }
        }
        .build()
        return _hikingBootSmall!!
    }

private var _hikingBootSmall: ImageVector? = null
