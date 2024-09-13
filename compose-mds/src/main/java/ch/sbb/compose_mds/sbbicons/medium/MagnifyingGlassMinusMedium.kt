package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.MagnifyingGlassMinusMedium: ImageVector
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
                moveTo(14.25f, 5.75f)
                curveToRelative(-5.524f, 0.0f, -10.0f, 4.478f, -10.0f, 10.0f)
                curveToRelative(0.0f, 5.524f, 4.476f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.476f, 10.0f, -10.0f)
                curveToRelative(0.0f, -5.522f, -4.476f, -10.0f, -10.0f, -10.0f)
                moveToRelative(-11.0f, 10.0f)
                curveToRelative(0.0f, -6.074f, 4.924f, -11.0f, 11.0f, -11.0f)
                reflectiveCurveToRelative(11.0f, 4.926f, 11.0f, 11.0f)
                curveToRelative(0.0f, 2.803f, -1.048f, 5.36f, -2.773f, 7.303f)
                lineToRelative(9.35f, 8.068f)
                lineToRelative(-0.654f, 0.758f)
                lineToRelative(-9.395f, -8.108f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, -7.528f, 2.979f)
                curveToRelative(-6.076f, 0.0f, -11.0f, -4.924f, -11.0f, -11.0f)
                moveToRelative(17.75f, 0.5f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassMinusMedium!!
    }

private var _magnifyingGlassMinusMedium: ImageVector? = null
