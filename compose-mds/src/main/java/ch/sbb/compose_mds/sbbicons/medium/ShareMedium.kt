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

public val MediumGroup.ShareMedium: ImageVector
    get() {
        if (_shareMedium != null) {
            return _shareMedium!!
        }
        _shareMedium = Builder(name = "ShareMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.25f, 8.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                moveToRelative(2.5f, -3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.26f, 4.776f)
                lineToRelative(-9.153f, 5.366f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.133f, 4.561f)
                lineToRelative(9.059f, 5.427f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.52f, -0.855f)
                lineToRelative(-9.067f, -5.43f)
                curveToRelative(0.173f, -0.414f, 0.268f, -0.868f, 0.268f, -1.345f)
                curveToRelative(0.0f, -0.548f, -0.126f, -1.067f, -0.35f, -1.529f)
                lineToRelative(9.085f, -5.325f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 24.75f, 4.75f)
                moveToRelative(0.0f, 19.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(-17.5f, -6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
            }
        }
        .build()
        return _shareMedium!!
    }

private var _shareMedium: ImageVector? = null
