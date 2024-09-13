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

public val MediumGroup.MagnifyingGlassMedium: ImageVector
    get() {
        if (_magnifyingGlassMedium != null) {
            return _magnifyingGlassMedium!!
        }
        _magnifyingGlassMedium = Builder(name = "MagnifyingGlassMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.25f, 15.75f)
                curveToRelative(0.0f, -5.522f, 4.476f, -10.0f, 10.0f, -10.0f)
                reflectiveCurveToRelative(10.0f, 4.478f, 10.0f, 10.0f)
                curveToRelative(0.0f, 5.524f, -4.476f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveToRelative(-10.0f, -4.476f, -10.0f, -10.0f)
                moveToRelative(10.0f, -11.0f)
                curveToRelative(-6.076f, 0.0f, -11.0f, 4.926f, -11.0f, 11.0f)
                curveToRelative(0.0f, 6.076f, 4.924f, 11.0f, 11.0f, 11.0f)
                curveToRelative(2.913f, 0.0f, 5.56f, -1.131f, 7.528f, -2.979f)
                lineToRelative(9.395f, 8.107f)
                lineToRelative(0.654f, -0.757f)
                lineToRelative(-9.35f, -8.068f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, false, 2.773f, -7.303f)
                curveToRelative(0.0f, -6.074f, -4.924f, -11.0f, -11.0f, -11.0f)
            }
        }
        .build()
        return _magnifyingGlassMedium!!
    }

private var _magnifyingGlassMedium: ImageVector? = null
