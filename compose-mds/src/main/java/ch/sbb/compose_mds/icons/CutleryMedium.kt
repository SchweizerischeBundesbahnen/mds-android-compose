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

public val SBBIcons.CutleryMedium: ImageVector
    get() {
        if (_cutleryMedium != null) {
            return _cutleryMedium!!
        }
        _cutleryMedium = Builder(name = "CutleryMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.75f, 4.5f)
                verticalLineToRelative(6.75f)
                curveToRelative(0.0f, 0.58f, 0.17f, 1.439f, 0.694f, 2.167f)
                curveToRelative(0.474f, 0.657f, 1.219f, 1.182f, 2.306f, 1.306f)
                lineTo(7.75f, 31.5f)
                horizontalLineToRelative(1.0f)
                lineTo(8.75f, 14.723f)
                curveToRelative(1.087f, -0.124f, 1.832f, -0.649f, 2.306f, -1.306f)
                arcToRelative(3.85f, 3.85f, 0.0f, false, false, 0.694f, -2.167f)
                lineTo(11.75f, 4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.75f)
                curveToRelative(0.0f, 0.42f, -0.13f, 1.061f, -0.506f, 1.583f)
                curveToRelative(-0.357f, 0.496f, -0.957f, 0.917f, -1.994f, 0.917f)
                reflectiveCurveToRelative(-1.637f, -0.42f, -1.994f, -0.917f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, true, -0.506f, -1.583f)
                lineTo(5.75f, 4.5f)
                close()
                moveTo(8.75f, 12.0f)
                lineTo(8.75f, 4.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(7.75f, 12.0f)
                close()
                moveTo(17.71f, 6.32f)
                curveToRelative(0.344f, 0.413f, 0.54f, 1.183f, 0.54f, 2.68f)
                verticalLineToRelative(9.25f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.25f, 5.768f)
                curveToRelative(0.772f, 0.052f, 1.196f, 0.235f, 1.46f, 0.552f)
                moveToRelative(-1.46f, 12.93f)
                horizontalLineToRelative(3.0f)
                lineTo(19.25f, 9.0f)
                curveToRelative(0.0f, -1.502f, -0.179f, -2.608f, -0.773f, -3.32f)
                curveToRelative(-0.62f, -0.745f, -1.576f, -0.93f, -2.727f, -0.93f)
                horizontalLineToRelative(-0.5f)
                lineTo(15.25f, 31.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(28.75f, 9.75f)
                curveToRelative(0.0f, -1.158f, -0.314f, -2.183f, -0.795f, -2.904f)
                curveToRelative(-0.483f, -0.725f, -1.096f, -1.096f, -1.705f, -1.096f)
                curveToRelative(-0.61f, 0.0f, -1.222f, 0.37f, -1.705f, 1.096f)
                curveToRelative(-0.481f, 0.721f, -0.795f, 1.746f, -0.795f, 2.904f)
                reflectiveCurveToRelative(0.314f, 2.183f, 0.795f, 2.904f)
                curveToRelative(0.483f, 0.725f, 1.096f, 1.096f, 1.705f, 1.096f)
                curveToRelative(0.61f, 0.0f, 1.222f, -0.37f, 1.705f, -1.096f)
                curveToRelative(0.481f, -0.721f, 0.795f, -1.746f, 0.795f, -2.904f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.328f, -0.358f, 2.552f, -0.963f, 3.459f)
                curveToRelative(-0.504f, 0.756f, -1.207f, 1.326f, -2.037f, 1.492f)
                lineTo(26.75f, 31.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(25.75f, 14.7f)
                curveToRelative(-0.83f, -0.165f, -1.533f, -0.735f, -2.037f, -1.491f)
                curveToRelative(-0.605f, -0.907f, -0.963f, -2.131f, -0.963f, -3.459f)
                reflectiveCurveToRelative(0.358f, -2.552f, 0.963f, -3.459f)
                curveToRelative(0.602f, -0.904f, 1.49f, -1.541f, 2.537f, -1.541f)
                curveToRelative(1.048f, 0.0f, 1.935f, 0.637f, 2.537f, 1.541f)
                curveToRelative(0.605f, 0.907f, 0.963f, 2.131f, 0.963f, 3.459f)
            }
        }
        .build()
        return _cutleryMedium!!
    }

private var _cutleryMedium: ImageVector? = null
