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

public val SBBIcons.WalkLargeMedium: ImageVector
    get() {
        if (_walkLargeMedium != null) {
            return _walkLargeMedium!!
        }
        _walkLargeMedium = Builder(name = "WalkLargeMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.249f)
                curveToRelative(-0.924f, 0.0f, -1.75f, 0.826f, -1.75f, 1.75f)
                reflectiveCurveToRelative(0.826f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.826f, 1.75f, -1.75f)
                reflectiveCurveToRelative(-0.826f, -1.75f, -1.75f, -1.75f)
                moveToRelative(-2.75f, 1.75f)
                curveToRelative(0.0f, -1.476f, 1.274f, -2.75f, 2.75f, -2.75f)
                reflectiveCurveToRelative(2.75f, 1.274f, 2.75f, 2.75f)
                reflectiveCurveToRelative(-1.274f, 2.75f, -2.75f, 2.75f)
                reflectiveCurveToRelative(-2.75f, -1.274f, -2.75f, -2.75f)
                moveToRelative(0.0f, 6.901f)
                lineToRelative(-2.0f, 3.0f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.401f)
                lineToRelative(0.084f, -0.126f)
                lineToRelative(3.0f, -4.5f)
                lineToRelative(0.148f, -0.223f)
                horizontalLineToRelative(5.035f)
                lineToRelative(0.149f, 0.223f)
                lineToRelative(2.898f, 4.347f)
                lineToRelative(5.073f, 1.45f)
                lineToRelative(-0.274f, 0.96f)
                lineToRelative(-5.25f, -1.5f)
                lineToRelative(-0.177f, -0.05f)
                lineToRelative(-0.102f, -0.153f)
                lineTo(20.75f, 12.9f)
                verticalLineToRelative(7.198f)
                lineToRelative(2.916f, 4.374f)
                lineToRelative(0.084f, 0.126f)
                verticalLineToRelative(8.401f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(24.9f)
                lineToRelative(-2.768f, -4.151f)
                horizontalLineTo(16.25f)
                verticalLineToRelative(5.66f)
                lineToRelative(-0.093f, 0.13f)
                lineToRelative(-3.75f, 5.25f)
                lineToRelative(-0.814f, -0.58f)
                lineToRelative(3.657f, -5.12f)
                verticalLineTo(12.9f)
                moveToRelative(1.0f, -1.151f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _walkLargeMedium!!
    }

private var _walkLargeMedium: ImageVector? = null
