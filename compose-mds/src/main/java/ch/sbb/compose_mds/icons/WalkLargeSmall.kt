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

public val SBBIcons.WalkLargeSmall: ImageVector
    get() {
        if (_walkLargeSmall != null) {
            return _walkLargeSmall!!
        }
        _walkLargeSmall = Builder(name = "WalkLargeSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                curveToRelative(-0.524f, 0.0f, -1.0f, 0.476f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.523f, 0.476f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.477f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.524f, -0.476f, -1.0f, -1.0f, -1.0f)
                moveToRelative(-2.0f, 1.0f)
                curveToRelative(0.0f, -1.077f, 0.924f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.923f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.924f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.924f, -2.0f, -2.0f)
                moveToRelative(0.0f, 5.15f)
                lineToRelative(-1.0f, 1.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-3.652f)
                lineToRelative(0.084f, -0.126f)
                lineToRelative(2.0f, -3.0f)
                lineTo(10.232f, 7.0f)
                horizontalLineToRelative(3.536f)
                lineToRelative(0.148f, 0.222f)
                lineToRelative(1.898f, 2.847f)
                lineToRelative(3.323f, 0.95f)
                lineToRelative(-0.274f, 0.961f)
                lineToRelative(-3.5f, -1.0f)
                lineToRelative(-0.177f, -0.05f)
                lineToRelative(-0.102f, -0.153f)
                lineTo(14.0f, 9.15f)
                verticalLineToRelative(4.197f)
                lineToRelative(1.916f, 2.874f)
                lineToRelative(0.084f, 0.126f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.35f)
                lineTo(13.232f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(3.66f)
                lineToRelative(-0.093f, 0.13f)
                lineToRelative(-2.5f, 3.5f)
                lineToRelative(-0.814f, -0.581f)
                lineTo(10.0f, 17.339f)
                verticalLineTo(9.151f)
                moveTo(11.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _walkLargeSmall!!
    }

private var _walkLargeSmall: ImageVector? = null
