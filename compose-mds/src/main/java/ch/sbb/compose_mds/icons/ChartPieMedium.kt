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
                moveToRelative(18.155f, 7.266f)
                lineToRelative(0.095f, -0.005f)
                verticalLineToRelative(11.778f)
                lineToRelative(0.25f, 0.144f)
                lineToRelative(9.95f, 5.745f)
                arcToRelative(11.49f, 11.49f, 0.0f, false, true, -9.7f, 5.322f)
                curveToRelative(-6.35f, 0.0f, -11.5f, -5.15f, -11.5f, -11.5f)
                curveToRelative(0.0f, -6.15f, 4.829f, -11.174f, 10.901f, -11.484f)
                close()
                moveTo(30.25f, 18.75f)
                arcToRelative(11.45f, 11.45f, 0.0f, false, true, -1.298f, 5.313f)
                lineTo(19.75f, 18.75f)
                lineToRelative(9.202f, -5.313f)
                arcToRelative(11.45f, 11.45f, 0.0f, false, true, 1.298f, 5.313f)
                moveToRelative(-1.8f, -6.178f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, -9.2f, -5.311f)
                verticalLineToRelative(10.623f)
                close()
                moveTo(18.1f, 6.267f)
                quadToRelative(0.326f, -0.017f, 0.651f, -0.017f)
                curveToRelative(6.903f, 0.0f, 12.5f, 5.597f, 12.5f, 12.5f)
                reflectiveCurveToRelative(-5.597f, 12.5f, -12.5f, 12.5f)
                reflectiveCurveToRelative(-12.5f, -5.597f, -12.5f, -12.5f)
                curveToRelative(0.0f, -6.685f, 5.248f, -12.144f, 11.849f, -12.483f)
            }
        }
        .build()
        return _chartPieMedium!!
    }

private var _chartPieMedium: ImageVector? = null
