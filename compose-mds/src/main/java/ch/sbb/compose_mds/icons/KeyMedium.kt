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

public val SBBIcons.KeyMedium: ImageVector
    get() {
        if (_keyMedium != null) {
            return _keyMedium!!
        }
        _keyMedium = Builder(name = "KeyMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 5.75f)
                arcTo(6.21f, 6.21f, 0.0f, false, false, 11.75f, 12.0f)
                arcTo(6.21f, 6.21f, 0.0f, false, false, 18.0f, 18.25f)
                arcTo(6.21f, 6.21f, 0.0f, false, false, 24.25f, 12.0f)
                arcTo(6.21f, 6.21f, 0.0f, false, false, 18.0f, 5.75f)
                moveTo(10.75f, 12.0f)
                arcTo(7.21f, 7.21f, 0.0f, false, true, 18.0f, 4.75f)
                arcTo(7.21f, 7.21f, 0.0f, false, true, 25.25f, 12.0f)
                arcToRelative(7.22f, 7.22f, 0.0f, false, true, -3.0f, 5.894f)
                verticalLineToRelative(10.513f)
                lineToRelative(-0.146f, 0.146f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-0.146f, -0.146f)
                verticalLineTo(17.894f)
                arcToRelative(7.22f, 7.22f, 0.0f, false, true, -3.0f, -5.894f)
                moveToRelative(4.0f, 6.496f)
                verticalLineToRelative(9.497f)
                lineToRelative(3.25f, 3.25f)
                lineToRelative(3.25f, -3.25f)
                verticalLineTo(25.25f)
                horizontalLineToRelative(-3.26f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.26f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-2.754f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -3.25f, 0.754f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -3.25f, -0.755f)
                moveToRelative(3.258f, -8.246f)
                curveToRelative(-1.017f, 0.0f, -1.758f, 0.74f, -1.758f, 1.716f)
                curveToRelative(0.0f, 0.996f, 0.76f, 1.784f, 1.758f, 1.784f)
                curveToRelative(0.992f, 0.0f, 1.742f, -0.783f, 1.742f, -1.784f)
                curveToRelative(0.0f, -0.981f, -0.73f, -1.716f, -1.742f, -1.716f)
                moveToRelative(-2.758f, 1.716f)
                curveToRelative(0.0f, -1.547f, 1.206f, -2.716f, 2.758f, -2.716f)
                curveToRelative(1.555f, 0.0f, 2.742f, 1.173f, 2.742f, 2.716f)
                curveToRelative(0.0f, 1.522f, -1.167f, 2.784f, -2.742f, 2.784f)
                curveToRelative(-1.572f, 0.0f, -2.758f, -1.258f, -2.758f, -2.784f)
            }
        }
        .build()
        return _keyMedium!!
    }

private var _keyMedium: ImageVector? = null
