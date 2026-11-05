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

public val SBBIcons.BulbOffSmall: ImageVector
    get() {
        if (_bulbOffSmall != null) {
            return _bulbOffSmall!!
        }
        _bulbOffSmall = Builder(
            name = "BulbOffSmall",
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
                moveTo(8.0f, 12.0f)
                curveToRelative(0.0f, -2.224f, 1.776f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.776f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.475f, -0.85f, 2.861f, -2.023f, 3.5f)
                horizontalLineToRelative(-3.94f)
                curveTo(8.833f, 14.764f, 8.0f, 13.455f, 8.0f, 12.0f)
                moveToRelative(1.0f, 3.995f)
                curveTo(7.81f, 15.061f, 7.0f, 13.62f, 7.0f, 12.0f)
                curveToRelative(0.0f, -2.776f, 2.224f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.224f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.6f, -0.795f, 3.123f, -2.0f, 4.028f)
                verticalLineToRelative(2.427f)
                lineToRelative(-0.335f, 0.117f)
                lineToRelative(-1.665f, 0.583f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.845f)
                lineToRelative(-1.665f, -0.583f)
                lineTo(9.0f, 18.455f)
                verticalLineToRelative(-2.46f)
                moveToRelative(1.0f, 1.75f)
                verticalLineTo(16.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.245f)
                lineToRelative(-1.665f, 0.583f)
                lineToRelative(-0.335f, 0.117f)
                lineToRelative(-0.335f, -0.117f)
                close()
            }
        }
            .build()
        return _bulbOffSmall!!
    }

private var _bulbOffSmall: ImageVector? = null
