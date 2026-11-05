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

public val SBBIcons.CoinStackSmall: ImageVector
    get() {
        if (_coinStackSmall != null) {
            return _coinStackSmall!!
        }
        _coinStackSmall = Builder(
            name = "CoinStackSmall",
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
                moveTo(4.06f, 5.67f)
                curveTo(3.318f, 6.082f, 3.0f, 6.573f, 3.0f, 7.0f)
                reflectiveCurveToRelative(0.317f, 0.917f, 1.06f, 1.33f)
                curveTo(4.789f, 8.736f, 5.827f, 9.0f, 7.0f, 9.0f)
                reflectiveCurveToRelative(2.212f, -0.265f, 2.94f, -0.67f)
                curveTo(10.682f, 7.918f, 11.0f, 7.427f, 11.0f, 7.0f)
                reflectiveCurveToRelative(-0.317f, -0.917f, -1.06f, -1.33f)
                curveTo(9.211f, 5.264f, 8.173f, 5.0f, 7.0f, 5.0f)
                reflectiveCurveToRelative(-2.212f, 0.265f, -2.94f, 0.67f)
                moveTo(12.0f, 7.0f)
                curveToRelative(0.0f, -0.954f, -0.69f, -1.713f, -1.575f, -2.205f)
                curveTo(9.523f, 4.295f, 8.31f, 4.0f, 7.0f, 4.0f)
                reflectiveCurveToRelative(-2.523f, 0.294f, -3.425f, 0.795f)
                curveTo(2.69f, 5.287f, 2.0f, 6.045f, 2.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.954f, 0.69f, 1.713f, 1.575f, 2.205f)
                curveToRelative(0.902f, 0.5f, 2.114f, 0.795f, 3.425f, 0.795f)
                curveToRelative(1.167f, 0.0f, 2.314f, -0.098f, 3.224f, -0.553f)
                lineToRelative(-0.448f, -0.894f)
                curveTo(9.091f, 20.896f, 8.148f, 21.0f, 7.0f, 21.0f)
                curveToRelative(-1.174f, 0.0f, -2.212f, -0.265f, -2.94f, -0.67f)
                curveTo(3.318f, 19.918f, 3.0f, 19.427f, 3.0f, 19.0f)
                verticalLineToRelative(-1.177f)
                quadToRelative(0.267f, 0.21f, 0.575f, 0.382f)
                curveTo(4.477f, 18.705f, 5.69f, 19.0f, 7.0f, 19.0f)
                curveToRelative(1.167f, 0.0f, 2.314f, -0.098f, 3.224f, -0.553f)
                lineToRelative(-0.448f, -0.894f)
                curveTo(9.091f, 17.896f, 8.148f, 18.0f, 7.0f, 18.0f)
                curveToRelative(-1.174f, 0.0f, -2.212f, -0.265f, -2.94f, -0.67f)
                curveTo(3.318f, 16.918f, 3.0f, 16.427f, 3.0f, 16.0f)
                verticalLineToRelative(-1.177f)
                quadToRelative(0.267f, 0.21f, 0.575f, 0.382f)
                curveTo(4.477f, 15.705f, 5.69f, 16.0f, 7.0f, 16.0f)
                curveToRelative(1.167f, 0.0f, 2.314f, -0.098f, 3.224f, -0.553f)
                lineToRelative(-0.448f, -0.894f)
                curveTo(9.091f, 14.896f, 8.148f, 15.0f, 7.0f, 15.0f)
                curveToRelative(-1.174f, 0.0f, -2.212f, -0.265f, -2.94f, -0.67f)
                curveTo(3.318f, 13.918f, 3.0f, 13.427f, 3.0f, 13.0f)
                verticalLineToRelative(-1.177f)
                quadToRelative(0.267f, 0.21f, 0.575f, 0.382f)
                curveTo(4.477f, 12.705f, 5.69f, 13.0f, 7.0f, 13.0f)
                curveToRelative(1.167f, 0.0f, 2.314f, -0.098f, 3.224f, -0.553f)
                lineToRelative(-0.448f, -0.894f)
                curveTo(9.091f, 11.896f, 8.148f, 12.0f, 7.0f, 12.0f)
                curveToRelative(-1.174f, 0.0f, -2.212f, -0.265f, -2.94f, -0.67f)
                curveTo(3.318f, 10.918f, 3.0f, 10.427f, 3.0f, 10.0f)
                lineTo(3.0f, 8.823f)
                quadToRelative(0.267f, 0.21f, 0.575f, 0.382f)
                curveTo(4.477f, 9.705f, 5.69f, 10.0f, 7.0f, 10.0f)
                reflectiveCurveToRelative(2.523f, -0.294f, 3.425f, -0.795f)
                quadToRelative(0.308f, -0.17f, 0.575f, -0.382f)
                lineTo(11.0f, 10.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.06f, 11.67f)
                curveToRelative(-0.743f, 0.413f, -1.06f, 0.904f, -1.06f, 1.33f)
                reflectiveCurveToRelative(0.317f, 0.917f, 1.06f, 1.33f)
                curveToRelative(0.728f, 0.405f, 1.766f, 0.67f, 2.94f, 0.67f)
                reflectiveCurveToRelative(2.212f, -0.265f, 2.94f, -0.67f)
                curveToRelative(0.743f, -0.413f, 1.06f, -0.904f, 1.06f, -1.33f)
                reflectiveCurveToRelative(-0.317f, -0.917f, -1.06f, -1.33f)
                curveToRelative(-0.728f, -0.405f, -1.766f, -0.67f, -2.94f, -0.67f)
                reflectiveCurveToRelative(-2.212f, 0.265f, -2.94f, 0.67f)
                moveToRelative(6.365f, 3.535f)
                quadToRelative(0.308f, -0.17f, 0.575f, -0.382f)
                lineTo(20.0f, 16.0f)
                curveToRelative(0.0f, 0.426f, -0.317f, 0.917f, -1.06f, 1.33f)
                curveToRelative(-0.728f, 0.405f, -1.766f, 0.67f, -2.94f, 0.67f)
                reflectiveCurveToRelative(-2.212f, -0.265f, -2.94f, -0.67f)
                curveTo(12.318f, 16.918f, 12.0f, 16.427f, 12.0f, 16.0f)
                verticalLineToRelative(-1.177f)
                quadToRelative(0.267f, 0.21f, 0.575f, 0.382f)
                curveToRelative(0.902f, 0.5f, 2.114f, 0.795f, 3.425f, 0.795f)
                reflectiveCurveToRelative(2.523f, -0.294f, 3.425f, -0.795f)
                moveTo(21.0f, 13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.954f, -0.69f, 1.713f, -1.575f, 2.205f)
                curveToRelative(-0.902f, 0.5f, -2.114f, 0.795f, -3.425f, 0.795f)
                reflectiveCurveToRelative(-2.523f, -0.294f, -3.425f, -0.795f)
                curveTo(11.69f, 20.713f, 11.0f, 19.955f, 11.0f, 19.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.954f, 0.69f, -1.713f, 1.575f, -2.205f)
                curveToRelative(0.902f, -0.5f, 2.114f, -0.795f, 3.425f, -0.795f)
                reflectiveCurveToRelative(2.523f, 0.294f, 3.425f, 0.795f)
                curveTo(20.31f, 11.287f, 21.0f, 12.045f, 21.0f, 13.0f)
                moveToRelative(-1.575f, 5.205f)
                quadToRelative(0.308f, -0.17f, 0.575f, -0.382f)
                lineTo(20.0f, 19.0f)
                curveToRelative(0.0f, 0.426f, -0.317f, 0.917f, -1.06f, 1.33f)
                curveToRelative(-0.728f, 0.405f, -1.766f, 0.67f, -2.94f, 0.67f)
                reflectiveCurveToRelative(-2.212f, -0.265f, -2.94f, -0.67f)
                curveTo(12.318f, 19.918f, 12.0f, 19.427f, 12.0f, 19.0f)
                verticalLineToRelative(-1.177f)
                quadToRelative(0.267f, 0.21f, 0.575f, 0.382f)
                curveToRelative(0.902f, 0.5f, 2.114f, 0.795f, 3.425f, 0.795f)
                reflectiveCurveToRelative(2.523f, -0.294f, 3.425f, -0.795f)
            }
        }
            .build()
        return _coinStackSmall!!
    }

private var _coinStackSmall: ImageVector? = null
