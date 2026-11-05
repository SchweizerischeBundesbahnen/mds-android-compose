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

public val SBBIcons.BusSbbSmall: ImageVector
    get() {
        if (_busSbbSmall != null) {
            return _busSbbSmall!!
        }
        _busSbbSmall = Builder(
            name = "BusSbbSmall",
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
                moveTo(5.464f, 4.464f)
                curveTo(5.184f, 4.744f, 5.0f, 5.215f, 5.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.785f, -0.183f, -1.256f, -0.464f, -1.536f)
                curveTo(18.256f, 4.184f, 17.785f, 4.0f, 17.0f, 4.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.785f, 0.0f, -1.256f, 0.183f, -1.536f, 0.464f)
                moveTo(5.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(4.757f, 3.757f)
                curveTo(5.3f, 3.214f, 6.079f, 3.0f, 7.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.921f, 0.0f, 1.7f, 0.214f, 2.243f, 0.757f)
                reflectiveCurveTo(20.0f, 5.079f, 20.0f, 6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-3.999f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.921f, 0.214f, -1.7f, 0.757f, -2.243f)
                moveTo(17.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.999f)
                close()
                moveTo(5.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(6.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 8.002f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 16.0f)
                moveToRelative(11.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 17.002f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 15.0f)
                moveToRelative(-2.6f, -0.5f)
                lineTo(12.8f, 13.0f)
                horizontalLineTo(14.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(-2.0f, 2.0f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(1.6f, -1.5f)
                horizontalLineToRelative(-1.9f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(9.6f)
                lineToRelative(1.6f, 1.5f)
                horizontalLineTo(10.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(2.0f, -2.0f)
                horizontalLineToRelative(1.2f)
                lineToRelative(-1.6f, 1.5f)
                horizontalLineToRelative(1.9f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
            .build()
        return _busSbbSmall!!
    }

private var _busSbbSmall: ImageVector? = null
