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

public val SBBIcons.ChartPieMedium: ImageVector
    get() {
        if (_chartPieMedium != null) {
            return _chartPieMedium!!
        }
        _chartPieMedium = Builder(name = "ChartPieMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.451f, 12.572f)
                arcTo(11.5f, 11.5f, 0.0f, false, false, 19.25f, 7.26f)
                verticalLineToRelative(10.623f)
                close()
                moveTo(28.951f, 13.437f)
                lineTo(19.75f, 18.75f)
                lineToRelative(9.202f, 5.313f)
                arcToRelative(11.45f, 11.45f, 0.0f, false, false, 1.298f, -5.313f)
                arcToRelative(11.45f, 11.45f, 0.0f, false, false, -1.299f, -5.313f)
                moveTo(18.25f, 19.039f)
                lineTo(18.25f, 7.261f)
                lineToRelative(-0.095f, 0.005f)
                horizontalLineToRelative(-0.004f)
                curveTo(12.08f, 7.576f, 7.25f, 12.599f, 7.25f, 18.75f)
                curveToRelative(0.0f, 6.35f, 5.15f, 11.5f, 11.5f, 11.5f)
                curveToRelative(4.077f, 0.0f, 7.659f, -2.122f, 9.701f, -5.322f)
                lineTo(18.5f, 19.183f)
                close()
                moveTo(31.25f, 18.75f)
                curveToRelative(0.0f, 6.903f, -5.597f, 12.5f, -12.5f, 12.5f)
                reflectiveCurveToRelative(-12.5f, -5.597f, -12.5f, -12.5f)
                curveToRelative(0.0f, -6.685f, 5.246f, -12.142f, 11.847f, -12.481f)
                verticalLineToRelative(-0.001f)
                quadToRelative(0.328f, -0.019f, 0.653f, -0.018f)
                curveToRelative(6.903f, 0.0f, 12.5f, 5.597f, 12.5f, 12.5f)
            }
        }
        .build()
        return _chartPieMedium!!
    }

private var _chartPieMedium: ImageVector? = null
