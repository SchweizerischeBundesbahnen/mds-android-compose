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

public val SBBIcons.WheelchairInaccessibleMedium: ImageVector
    get() {
        if (_wheelchairInaccessibleMedium != null) {
            return _wheelchairInaccessibleMedium!!
        }
        _wheelchairInaccessibleMedium = Builder(name = "WheelchairInaccessibleMedium", defaultWidth
                = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 9.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, -0.5f, 0.001f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 17.0f, 9.0f)
                moveToRelative(8.897f, 22.104f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-18.75f, -18.75f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(4.427f, 4.427f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -2.325f, 4.97f)
                curveToRelative(0.0f, 3.575f, 2.927f, 6.5f, 6.5f, 6.5f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, 4.964f, -2.33f)
                lineToRelative(2.037f, 2.037f)
                verticalLineToRelative(0.542f)
                horizontalLineToRelative(0.542f)
                close()
                moveTo(20.004f, 25.211f)
                lineTo(12.284f, 17.492f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -2.035f, 4.259f)
                curveToRelative(0.0f, 3.022f, 2.479f, 5.5f, 5.5f, 5.5f)
                curveToRelative(1.71f, 0.0f, 3.242f, -0.797f, 4.255f, -2.04f)
                moveToRelative(3.746f, -1.961f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(16.25f, 12.0f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(-1.0f)
                lineTo(15.25f, 12.0f)
                close()
            }
        }
        .build()
        return _wheelchairInaccessibleMedium!!
    }

private var _wheelchairInaccessibleMedium: ImageVector? = null
