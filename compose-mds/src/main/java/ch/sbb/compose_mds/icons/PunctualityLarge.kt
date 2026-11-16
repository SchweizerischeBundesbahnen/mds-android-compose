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

public val SBBIcons.PunctualityLarge: ImageVector
    get() {
        if (_punctualityLarge != null) {
            return _punctualityLarge!!
        }
        _punctualityLarge = Builder(name = "PunctualityLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.007f)
                arcToRelative(19.4f, 19.4f, 0.0f, false, true, 10.138f, 3.148f)
                lineToRelative(1.861f, -1.862f)
                lineTo(41.707f, 13.0f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-1.335f, 1.336f)
                arcTo(19.4f, 19.4f, 0.0f, false, true, 44.0f, 26.5f)
                curveTo(44.0f, 37.27f, 35.27f, 46.0f, 24.5f, 46.0f)
                reflectiveCurveTo(5.0f, 37.27f, 5.0f, 26.5f)
                curveTo(5.0f, 15.897f, 13.461f, 7.272f, 24.0f, 7.007f)
                lineTo(24.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(21.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(39.387f, 13.905f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, false, -3.412f, -3.173f)
                lineToRelative(1.024f, -1.025f)
                lineTo(40.293f, 13.0f)
                close()
                moveTo(24.5f, 8.0f)
                curveTo(34.717f, 8.0f, 43.0f, 16.282f, 43.0f, 26.5f)
                reflectiveCurveTo(34.717f, 45.0f, 24.5f, 45.0f)
                reflectiveCurveTo(6.0f, 36.717f, 6.0f, 26.5f)
                reflectiveCurveTo(14.282f, 8.0f, 24.5f, 8.0f)
                moveTo(8.0f, 26.5f)
                lineTo(8.0f, 26.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.5f)
                curveTo(9.0f, 35.06f, 15.94f, 42.0f, 24.5f, 42.0f)
                reflectiveCurveTo(40.0f, 35.06f, 40.0f, 26.5f)
                reflectiveCurveTo(33.06f, 11.0f, 24.5f, 11.0f)
                lineTo(23.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                curveTo(33.613f, 10.0f, 41.0f, 17.387f, 41.0f, 26.5f)
                reflectiveCurveTo(33.613f, 43.0f, 24.5f, 43.0f)
                reflectiveCurveTo(8.0f, 35.612f, 8.0f, 26.5f)
                moveToRelative(12.365f, 8.841f)
                lineToRelative(14.0f, -15.0f)
                lineToRelative(-0.73f, -0.682f)
                lineToRelative(-13.62f, 14.591f)
                lineToRelative(-5.635f, -6.575f)
                lineToRelative(-0.76f, 0.65f)
                lineToRelative(6.0f, 7.0f)
                lineToRelative(0.364f, 0.425f)
                close()
                moveTo(19.04f, 11.916f)
                lineToRelative(1.932f, -0.518f)
                lineToRelative(-0.26f, -0.966f)
                lineToRelative(-1.932f, 0.519f)
                close()
                moveTo(17.184f, 12.826f)
                lineTo(15.451f, 13.826f)
                lineTo(14.951f, 12.961f)
                lineTo(16.684f, 11.961f)
                close()
                moveTo(12.479f, 16.6f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-1.415f, 1.414f)
                close()
                moveTo(11.326f, 18.317f)
                lineTo(10.326f, 20.049f)
                lineTo(9.461f, 19.549f)
                lineTo(10.461f, 17.817f)
                close()
                moveTo(9.139f, 23.937f)
                lineTo(9.658f, 22.006f)
                lineTo(8.692f, 21.746f)
                lineTo(8.174f, 23.679f)
                close()
            }
        }
        .build()
        return _punctualityLarge!!
    }

private var _punctualityLarge: ImageVector? = null
