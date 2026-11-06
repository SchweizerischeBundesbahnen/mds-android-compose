package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.GlobeArrowsLeftRightUpDownSmall: ImageVector
    get() {
        if (_globeArrowsLeftRightUpDownSmall != null) {
            return _globeArrowsLeftRightUpDownSmall!!
        }
        _globeArrowsLeftRightUpDownSmall = Builder(name = "GlobeArrowsLeftRightUpDownSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.354f, 20.647f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.147f, -2.147f)
                lineToRelative(-2.146f, 2.146f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(2.854f, -2.853f)
                close()
                moveTo(11.5f, 8.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, -9.0f)
                moveToRelative(-1.085f, 5.0f)
                curveToRelative(0.045f, 0.85f, 0.2f, 1.596f, 0.418f, 2.143f)
                curveToRelative(0.13f, 0.326f, 0.274f, 0.558f, 0.407f, 0.699f)
                reflectiveCurveToRelative(0.22f, 0.158f, 0.26f, 0.158f)
                reflectiveCurveToRelative(0.127f, -0.018f, 0.26f, -0.158f)
                reflectiveCurveToRelative(0.276f, -0.373f, 0.407f, -0.7f)
                curveToRelative(0.219f, -0.546f, 0.373f, -1.292f, 0.418f, -2.142f)
                close()
                moveTo(8.036f, 13.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.925f, 2.644f)
                quadToRelative(-0.03f, -0.063f, -0.057f, -0.13f)
                curveToRelative(-0.272f, -0.68f, -0.445f, -1.556f, -0.49f, -2.514f)
                close()
                moveTo(13.586f, 13.0f)
                curveToRelative(-0.045f, 0.958f, -0.218f, 1.835f, -0.49f, 2.515f)
                quadToRelative(-0.029f, 0.065f, -0.058f, 0.129f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.964f, 13.0f)
                close()
                moveTo(6.207f, 12.5f)
                lineTo(3.354f, 15.354f)
                lineTo(2.646f, 14.647f)
                lineTo(4.793f, 12.5f)
                lineToRelative(-2.147f, -2.146f)
                lineToRelative(0.708f, -0.708f)
                close()
                moveTo(20.354f, 10.354f)
                lineTo(18.207f, 12.5f)
                lineToRelative(2.146f, 2.146f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.853f, -2.853f)
                lineToRelative(2.854f, -2.854f)
                close()
                moveTo(9.96f, 9.355f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.036f, 12.0f)
                horizontalLineToRelative(1.377f)
                curveToRelative(0.046f, -0.958f, 0.22f, -1.835f, 0.491f, -2.515f)
                quadToRelative(0.028f, -0.066f, 0.057f, -0.13f)
                moveTo(11.5f, 9.0f)
                curveToRelative(-0.04f, 0.0f, -0.127f, 0.018f, -0.26f, 0.158f)
                reflectiveCurveToRelative(-0.276f, 0.373f, -0.407f, 0.7f)
                curveToRelative(-0.219f, 0.546f, -0.373f, 1.292f, -0.418f, 2.142f)
                horizontalLineToRelative(2.17f)
                curveToRelative(-0.045f, -0.85f, -0.2f, -1.596f, -0.418f, -2.143f)
                curveToRelative(-0.13f, -0.326f, -0.274f, -0.558f, -0.407f, -0.699f)
                reflectiveCurveTo(11.54f, 9.0f, 11.5f, 9.0f)
                moveToRelative(1.596f, 0.485f)
                curveToRelative(0.272f, 0.68f, 0.445f, 1.557f, 0.49f, 2.515f)
                horizontalLineToRelative(1.378f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.926f, -2.645f)
                quadToRelative(0.03f, 0.065f, 0.058f, 0.13f)
                moveToRelative(1.258f, -5.131f)
                lineTo(11.5f, 7.207f)
                lineTo(8.646f, 4.354f)
                lineToRelative(0.708f, -0.708f)
                lineTo(11.5f, 5.793f)
                lineToRelative(2.146f, -2.147f)
                close()
            }
        }
        .build()
        return _globeArrowsLeftRightUpDownSmall!!
    }

private var _globeArrowsLeftRightUpDownSmall: ImageVector? = null
