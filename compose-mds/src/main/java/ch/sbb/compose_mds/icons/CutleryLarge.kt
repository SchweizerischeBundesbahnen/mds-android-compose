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

public val SBBIcons.CutleryLarge: ImageVector
    get() {
        if (_cutleryLarge != null) {
            return _cutleryLarge!!
        }
        _cutleryLarge = Builder(name = "CutleryLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 6.0f)
                verticalLineToRelative(10.517f)
                curveTo(8.0f, 17.336f, 8.664f, 18.0f, 9.483f, 18.0f)
                horizontalLineToRelative(2.034f)
                curveToRelative(0.819f, 0.0f, 1.483f, -0.664f, 1.483f, -1.483f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(10.517f)
                curveToRelative(0.0f, 1.206f, -0.86f, 2.211f, -2.0f, 2.436f)
                lineTo(12.0f, 41.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(9.0f, 18.953f)
                curveToRelative(-1.14f, -0.225f, -2.0f, -1.23f, -2.0f, -2.436f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(22.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                close()
                moveTo(10.0f, 6.0f)
                verticalLineToRelative(9.0f)
                lineTo(9.0f, 15.0f)
                lineTo(9.0f, 6.0f)
                close()
                moveTo(35.088f, 8.535f)
                curveTo(34.426f, 9.528f, 34.0f, 10.928f, 34.0f, 12.5f)
                reflectiveCurveToRelative(0.426f, 2.972f, 1.088f, 3.965f)
                curveTo(35.752f, 17.462f, 36.615f, 18.0f, 37.5f, 18.0f)
                reflectiveCurveToRelative(1.748f, -0.538f, 2.412f, -1.535f)
                curveTo(40.574f, 15.472f, 41.0f, 14.072f, 41.0f, 12.5f)
                reflectiveCurveToRelative(-0.426f, -2.972f, -1.088f, -3.965f)
                curveTo(39.248f, 7.538f, 38.385f, 7.0f, 37.5f, 7.0f)
                reflectiveCurveToRelative(-1.748f, 0.538f, -2.412f, 1.535f)
                moveToRelative(-0.833f, -0.555f)
                curveTo(35.04f, 6.805f, 36.177f, 6.0f, 37.5f, 6.0f)
                reflectiveCurveToRelative(2.461f, 0.805f, 3.245f, 1.98f)
                curveTo(41.53f, 9.159f, 42.0f, 10.758f, 42.0f, 12.5f)
                reflectiveCurveToRelative(-0.47f, 3.341f, -1.255f, 4.52f)
                curveToRelative(-0.468f, 0.701f, -1.061f, 1.27f, -1.745f, 1.616f)
                lineTo(39.0f, 41.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(36.0f, 18.636f)
                curveToRelative(-0.684f, -0.346f, -1.277f, -0.915f, -1.745f, -1.616f)
                curveTo(33.47f, 15.841f, 33.0f, 14.242f, 33.0f, 12.5f)
                reflectiveCurveToRelative(0.47f, -3.341f, 1.255f, -4.52f)
                moveTo(37.5f, 19.0f)
                quadToRelative(0.255f, 0.0f, 0.5f, -0.039f)
                lineTo(38.0f, 41.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(37.0f, 18.961f)
                quadToRelative(0.245f, 0.039f, 0.5f, 0.039f)
                moveToRelative(-15.0f, -13.0f)
                lineTo(22.0f, 6.0f)
                verticalLineToRelative(35.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-18.0f)
                horizontalLineToRelative(3.0f)
                lineTo(28.0f, 13.0f)
                curveToRelative(0.0f, -2.258f, -0.581f, -4.008f, -1.581f, -5.203f)
                curveTo(25.413f, 6.595f, 24.019f, 6.0f, 22.5f, 6.0f)
                moveToRelative(0.5f, 35.5f)
                lineTo(23.0f, 7.027f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 2.652f, 1.412f)
                curveTo(26.462f, 9.407f, 27.0f, 10.906f, 27.0f, 13.0f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                moveTo(12.0f, 15.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _cutleryLarge!!
    }

private var _cutleryLarge: ImageVector? = null
