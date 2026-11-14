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
                moveTo(24.25f, 12.0f)
                arcTo(6.21f, 6.21f, 0.0f, false, false, 18.0f, 5.75f)
                arcTo(6.21f, 6.21f, 0.0f, false, false, 11.75f, 12.0f)
                arcTo(6.21f, 6.21f, 0.0f, false, false, 18.0f, 18.25f)
                arcTo(6.21f, 6.21f, 0.0f, false, false, 24.25f, 12.0f)
                moveToRelative(-3.0f, 6.496f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -3.25f, 0.754f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -3.25f, -0.755f)
                verticalLineToRelative(9.498f)
                lineToRelative(3.25f, 3.25f)
                lineToRelative(3.25f, -3.25f)
                lineTo(21.25f, 25.25f)
                horizontalLineToRelative(-3.26f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.26f)
                verticalLineToRelative(-2.0f)
                lineTo(18.0f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                close()
                moveTo(22.25f, 17.894f)
                arcToRelative(7.22f, 7.22f, 0.0f, false, false, 3.0f, -5.894f)
                arcTo(7.21f, 7.21f, 0.0f, false, false, 18.0f, 4.75f)
                arcTo(7.21f, 7.21f, 0.0f, false, false, 10.75f, 12.0f)
                arcToRelative(7.22f, 7.22f, 0.0f, false, false, 3.0f, 5.894f)
                verticalLineToRelative(10.513f)
                lineToRelative(4.25f, 4.25f)
                lineToRelative(4.25f, -4.25f)
                close()
                moveTo(19.75f, 11.966f)
                curveToRelative(0.0f, -0.98f, -0.73f, -1.716f, -1.742f, -1.716f)
                curveToRelative(-1.017f, 0.0f, -1.758f, 0.74f, -1.758f, 1.716f)
                curveToRelative(0.0f, 0.996f, 0.761f, 1.784f, 1.758f, 1.784f)
                curveToRelative(0.992f, 0.0f, 1.742f, -0.783f, 1.742f, -1.784f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 1.522f, -1.167f, 2.784f, -2.742f, 2.784f)
                curveToRelative(-1.571f, 0.0f, -2.758f, -1.258f, -2.758f, -2.784f)
                curveToRelative(0.0f, -1.547f, 1.207f, -2.716f, 2.758f, -2.716f)
                curveToRelative(1.555f, 0.0f, 2.742f, 1.174f, 2.742f, 2.716f)
            }
        }
        .build()
        return _keyMedium!!
    }

private var _keyMedium: ImageVector? = null
