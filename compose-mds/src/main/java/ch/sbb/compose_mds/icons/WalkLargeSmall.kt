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
                moveTo(13.0f, 4.0f)
                curveToRelative(0.0f, -0.524f, -0.476f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.476f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.523f, 0.476f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.477f, 1.0f, -1.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.076f, -0.924f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.924f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.924f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.923f, 2.0f, 2.0f)
                moveToRelative(-3.0f, 4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 8.0f)
                close()
                moveTo(10.0f, 9.15f)
                verticalLineToRelative(8.188f)
                lineToRelative(-2.407f, 3.37f)
                lineToRelative(0.814f, 0.583f)
                lineToRelative(2.5f, -3.5f)
                lineToRelative(0.093f, -0.131f)
                lineTo(11.0f, 14.0f)
                horizontalLineToRelative(2.232f)
                lineTo(15.0f, 16.65f)
                lineTo(15.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.652f)
                lineToRelative(-2.0f, -3.0f)
                lineTo(14.0f, 9.151f)
                lineToRelative(1.084f, 1.626f)
                lineToRelative(0.101f, 0.153f)
                lineToRelative(0.177f, 0.05f)
                lineToRelative(3.5f, 1.0f)
                lineToRelative(0.276f, -0.961f)
                lineToRelative(-3.325f, -0.95f)
                lineToRelative(-1.897f, -2.847f)
                lineTo(13.767f, 7.0f)
                horizontalLineToRelative(-3.535f)
                lineTo(8.0f, 10.348f)
                lineTo(8.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.348f)
                close()
            }
        }
        .build()
        return _walkLargeSmall!!
    }

private var _walkLargeSmall: ImageVector? = null
