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

public val SBBIcons.CarSmall: ImageVector
    get() {
        if (_carSmall != null) {
            return _carSmall!!
        }
        _carSmall = Builder(
            name = "CarSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                moveTo(6.464f, 7.464f)
                curveTo(6.184f, 7.744f, 6.0f, 8.215f, 6.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.05f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(18.0f, 11.0f)
                lineTo(18.0f, 9.0f)
                curveToRelative(0.0f, -0.785f, -0.183f, -1.256f, -0.464f, -1.536f)
                curveTo(17.256f, 7.184f, 16.785f, 7.0f, 16.0f, 7.0f)
                lineTo(8.0f, 7.0f)
                curveToRelative(-0.785f, 0.0f, -1.256f, 0.183f, -1.536f, 0.464f)
                moveTo(15.914f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.829f, 0.0f)
                close()
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                lineTo(6.0f, 12.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(19.0f, 16.5f)
                lineTo(19.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 9.0f)
                curveToRelative(0.0f, -0.921f, -0.214f, -1.7f, -0.757f, -2.243f)
                reflectiveCurveTo(16.921f, 6.0f, 16.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                curveToRelative(-0.921f, 0.0f, -1.7f, 0.214f, -2.243f, 0.757f)
                reflectiveCurveTo(5.0f, 8.079f, 5.0f, 9.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.001f)
                verticalLineToRelative(2.0f)
                lineTo(19.0f, 19.0f)
                verticalLineToRelative(-2.5f)
                moveTo(6.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.001f, 18.0f)
                verticalLineToRelative(-1.0f)
                lineTo(18.0f, 17.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 9.002f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 14.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.002f, 0.001f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 14.0f)
            }
        }
            .build()
        return _carSmall!!
    }

private var _carSmall: ImageVector? = null
