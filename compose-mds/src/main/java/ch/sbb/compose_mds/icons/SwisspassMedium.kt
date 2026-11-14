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

public val SBBIcons.SwisspassMedium: ImageVector
    get() {
        if (_swisspassMedium != null) {
            return _swisspassMedium!!
        }
        _swisspassMedium = Builder(name = "SwisspassMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.75f, 10.25f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(8.25f, 25.75f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(27.75f, 26.75f)
                curveToRelative(1.932f, 0.0f, 3.5f, -1.568f, 3.5f, -3.5f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -1.933f, -1.568f, -3.5f, -3.5f, -3.5f)
                lineTo(8.25f, 9.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 1.932f, 1.568f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(25.25f, 13.5f)
                verticalLineToRelative(1.75f)
                lineTo(27.0f, 15.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.75f)
                lineTo(22.5f, 16.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-1.75f)
                close()
                moveTo(14.922f, 18.494f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -4.341f, 0.001f)
                curveToRelative(-0.857f, 0.412f, -1.533f, 0.965f, -2.01f, 1.682f)
                curveToRelative(-0.564f, 0.846f, -0.821f, 1.876f, -0.821f, 3.072f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.196f, -0.257f, -2.228f, -0.82f, -3.075f)
                curveToRelative(-0.477f, -0.717f, -1.152f, -1.27f, -2.008f, -1.68f)
                moveToRelative(-2.172f, -0.245f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                moveToRelative(0.0f, 1.0f)
                horizontalLineToRelative(-1.4f)
                curveToRelative(-0.9f, 0.366f, -1.533f, 0.86f, -1.947f, 1.482f)
                curveToRelative(-0.357f, 0.537f, -0.571f, 1.2f, -0.632f, 2.018f)
                horizontalLineToRelative(7.959f)
                curveToRelative(-0.062f, -0.819f, -0.276f, -1.483f, -0.633f, -2.021f)
                curveToRelative(-0.415f, -0.623f, -1.048f, -1.116f, -1.949f, -1.479f)
                close()
            }
        }
        .build()
        return _swisspassMedium!!
    }

private var _swisspassMedium: ImageVector? = null
