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

public val SBBIcons.WheelchairMedium: ImageVector
    get() {
        if (_wheelchairMedium != null) {
            return _wheelchairMedium!!
        }
        _wheelchairMedium = Builder(name = "WheelchairMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.5f, 9.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.001f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(0.25f, -1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.501f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                moveToRelative(-0.5f, 12.5f)
                lineTo(15.25f, 12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.75f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(8.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.75f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(9.258f, 21.752f)
                curveToRelative(0.0f, -2.525f, 1.459f, -4.722f, 3.57f, -5.797f)
                lineToRelative(0.454f, 0.89f)
                curveToRelative(-1.793f, 0.914f, -3.024f, 2.776f, -3.024f, 4.907f)
                curveToRelative(0.0f, 3.02f, 2.479f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.187f, 0.0f, 4.093f, -1.3f, 4.978f, -3.17f)
                lineToRelative(0.904f, 0.428f)
                curveToRelative(-1.042f, 2.203f, -3.29f, 3.742f, -5.882f, 3.742f)
                curveToRelative(-3.573f, 0.0f, -6.5f, -2.927f, -6.5f, -6.5f)
            }
        }
        .build()
        return _wheelchairMedium!!
    }

private var _wheelchairMedium: ImageVector? = null
