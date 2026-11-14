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

public val SBBIcons.MagnifyingGlassMinusMedium: ImageVector
    get() {
        if (_magnifyingGlassMinusMedium != null) {
            return _magnifyingGlassMinusMedium!!
        }
        _magnifyingGlassMinusMedium = Builder(name = "MagnifyingGlassMinusMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.25f, 15.75f)
                curveToRelative(0.0f, -5.522f, -4.476f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveToRelative(-10.0f, 4.478f, -10.0f, 10.0f)
                curveToRelative(0.0f, 5.524f, 4.476f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.476f, 10.0f, -10.0f)
                moveToRelative(-2.472f, 8.021f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, -7.528f, 2.979f)
                curveToRelative(-6.076f, 0.0f, -11.0f, -4.924f, -11.0f, -11.0f)
                curveToRelative(0.0f, -6.074f, 4.924f, -11.0f, 11.0f, -11.0f)
                reflectiveCurveToRelative(11.0f, 4.926f, 11.0f, 11.0f)
                curveToRelative(0.0f, 2.803f, -1.048f, 5.36f, -2.773f, 7.303f)
                lineToRelative(9.35f, 8.069f)
                lineToRelative(-0.653f, 0.757f)
                close()
                moveTo(21.0f, 15.25f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassMinusMedium!!
    }

private var _magnifyingGlassMinusMedium: ImageVector? = null
