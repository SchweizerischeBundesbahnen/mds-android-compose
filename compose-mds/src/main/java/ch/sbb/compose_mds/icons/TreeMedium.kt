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

public val SBBIcons.TreeMedium: ImageVector
    get() {
        if (_treeMedium != null) {
            return _treeMedium!!
        }
        _treeMedium = Builder(name = "TreeMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.25f, 3.262f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                quadToRelative(0.001f, 0.576f, 0.082f, 1.128f)
                curveToRelative(-3.442f, 0.56f, -6.082f, 3.515f, -6.082f, 7.122f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, false, 7.25f, 7.25f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(4.988f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(17.75f)
                verticalLineToRelative(-4.988f)
                horizontalLineTo(27.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 5.75f, -5.75f)
                curveToRelative(0.0f, -1.78f, -0.815f, -3.365f, -2.082f, -4.417f)
                curveToRelative(0.37f, -0.696f, 0.582f, -1.49f, 0.582f, -2.333f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                curveToRelative(-0.431f, 0.0f, -0.846f, 0.059f, -1.24f, 0.163f)
                curveToRelative(-0.83f, -3.527f, -3.975f, -6.163f, -7.76f, -6.163f)
                moveToRelative(0.5f, 22.5f)
                horizontalLineTo(27.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 4.75f, -4.75f)
                curveToRelative(0.0f, -1.605f, -0.802f, -3.02f, -2.026f, -3.881f)
                lineToRelative(-0.396f, -0.279f)
                lineToRelative(0.266f, -0.405f)
                curveToRelative(0.414f, -0.63f, 0.656f, -1.378f, 0.656f, -2.185f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                curveToRelative(-0.504f, 0.0f, -0.986f, 0.103f, -1.439f, 0.28f)
                lineToRelative(-0.577f, 0.224f)
                lineToRelative(-0.098f, -0.612f)
                curveToRelative(-0.534f, -3.338f, -3.404f, -5.892f, -6.886f, -5.892f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, 7.0f)
                curveToRelative(0.0f, 0.498f, 0.055f, 0.981f, 0.156f, 1.454f)
                lineToRelative(0.12f, 0.553f)
                lineToRelative(-0.565f, 0.05f)
                curveToRelative(-3.2f, 0.278f, -5.711f, 2.93f, -5.711f, 6.193f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, 6.25f, 6.25f)
                horizontalLineToRelative(6.25f)
                verticalLineTo(19.74f)
                lineToRelative(-3.562f, -2.85f)
                lineToRelative(0.624f, -0.78f)
                lineToRelative(2.938f, 2.35f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.17f)
                lineToRelative(4.374f, -5.0f)
                lineToRelative(0.752f, 0.66f)
                lineToRelative(-5.126f, 5.858f)
                close()
            }
        }
        .build()
        return _treeMedium!!
    }

private var _treeMedium: ImageVector? = null
