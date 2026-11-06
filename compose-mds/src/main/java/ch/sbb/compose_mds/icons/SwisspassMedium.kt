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
                moveTo(5.75f, 12.75f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(8.25f, 25.75f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(8.25f, 9.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 1.932f, 1.568f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(19.5f)
                curveToRelative(1.932f, 0.0f, 3.5f, -1.568f, 3.5f, -3.5f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0.0f, -1.933f, -1.568f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(25.25f, 13.501f)
                verticalLineToRelative(1.75f)
                lineTo(27.0f, 15.251f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.75f)
                lineTo(22.5f, 16.251f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-1.75f)
                close()
                moveTo(12.75f, 18.251f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                moveToRelative(2.171f, 0.244f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -4.341f, 0.001f)
                curveToRelative(-0.857f, 0.411f, -1.532f, 0.965f, -2.01f, 1.681f)
                curveToRelative(-0.563f, 0.847f, -0.82f, 1.877f, -0.82f, 3.073f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.196f, -0.257f, -2.228f, -0.82f, -3.075f)
                curveToRelative(-0.477f, -0.717f, -1.152f, -1.27f, -2.009f, -1.68f)
                moveToRelative(-2.171f, 0.755f)
                horizontalLineToRelative(-1.404f)
                curveToRelative(-0.899f, 0.366f, -1.53f, 0.86f, -1.943f, 1.482f)
                curveToRelative(-0.358f, 0.537f, -0.574f, 1.2f, -0.635f, 2.018f)
                horizontalLineToRelative(7.964f)
                curveToRelative(-0.061f, -0.819f, -0.277f, -1.484f, -0.635f, -2.021f)
                curveToRelative(-0.414f, -0.622f, -1.044f, -1.117f, -1.942f, -1.479f)
                close()
            }
        }
        .build()
        return _swisspassMedium!!
    }

private var _swisspassMedium: ImageVector? = null
