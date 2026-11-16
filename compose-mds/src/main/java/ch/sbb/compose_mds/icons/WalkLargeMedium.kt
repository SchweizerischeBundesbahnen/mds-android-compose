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
                moveTo(19.75f, 5.999f)
                curveToRelative(0.0f, -0.924f, -0.826f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.826f, -1.75f, 1.75f)
                reflectiveCurveToRelative(0.826f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.826f, 1.75f, -1.75f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.476f, -1.274f, 2.75f, -2.75f, 2.75f)
                reflectiveCurveToRelative(-2.75f, -1.274f, -2.75f, -2.75f)
                reflectiveCurveToRelative(1.274f, -2.75f, 2.75f, -2.75f)
                reflectiveCurveToRelative(2.75f, 1.274f, 2.75f, 2.75f)
                moveToRelative(-4.5f, 5.75f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(15.25f, 12.9f)
                verticalLineToRelative(13.188f)
                lineToRelative(-3.657f, 5.12f)
                lineToRelative(0.814f, 0.582f)
                lineToRelative(3.75f, -5.25f)
                lineToRelative(0.093f, -0.13f)
                verticalLineToRelative(-5.661f)
                horizontalLineToRelative(3.732f)
                lineTo(22.75f, 24.9f)
                lineTo(22.75f, 33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-8.401f)
                lineToRelative(-3.0f, -4.5f)
                lineTo(20.75f, 12.9f)
                lineToRelative(2.084f, 3.126f)
                lineToRelative(0.101f, 0.154f)
                lineToRelative(0.177f, 0.05f)
                lineToRelative(5.25f, 1.5f)
                lineToRelative(0.276f, -0.961f)
                lineToRelative(-5.075f, -1.45f)
                lineToRelative(-2.897f, -4.347f)
                lineToRelative(-0.149f, -0.223f)
                horizontalLineToRelative(-5.035f)
                lineToRelative(-3.232f, 4.849f)
                verticalLineToRelative(5.401f)
                horizontalLineToRelative(1.0f)
                lineTo(13.25f, 15.9f)
                close()
            }
        }
        .build()
        return _walkLargeMedium!!
    }

private var _walkLargeMedium: ImageVector? = null
