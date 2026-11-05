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

public val SBBIcons.ChartColumnSmall: ImageVector
    get() {
        if (_chartColumnSmall != null) {
            return _chartColumnSmall!!
        }
        _chartColumnSmall = Builder(
            name = "ChartColumnSmall",
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
                moveTo(18.5f, 4.0f)
                lineTo(18.0f, 4.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 4.0f)
                horizontalLineToRelative(-3.5f)
                moveToRelative(0.5f, 14.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(8.5f, 7.0f)
                lineTo(8.0f, 7.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(4.0f)
                lineTo(12.0f, 7.0f)
                lineTo(8.5f, 7.0f)
                moveTo(9.0f, 18.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(3.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(22.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.0f, 9.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
            .build()
        return _chartColumnSmall!!
    }

private var _chartColumnSmall: ImageVector? = null
