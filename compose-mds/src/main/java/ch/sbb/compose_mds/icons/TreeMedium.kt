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
                moveTo(9.335f, 12.39f)
                curveToRelative(-3.444f, 0.56f, -6.085f, 3.515f, -6.085f, 7.122f)
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
                arcToRelative(5.73f, 5.73f, 0.0f, false, false, -2.086f, -4.418f)
                curveToRelative(0.37f, -0.696f, 0.586f, -1.488f, 0.586f, -2.332f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                curveToRelative(-0.432f, 0.0f, -0.847f, 0.06f, -1.242f, 0.165f)
                curveToRelative(-0.83f, -3.528f, -3.972f, -6.165f, -7.758f, -6.165f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                quadToRelative(0.001f, 0.576f, 0.085f, 1.129f)
                moveToRelative(8.415f, 13.372f)
                horizontalLineTo(27.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 4.75f, -4.75f)
                curveToRelative(0.0f, -1.605f, -0.802f, -3.02f, -2.026f, -3.881f)
                lineToRelative(-0.396f, -0.278f)
                lineToRelative(0.265f, -0.406f)
                curveToRelative(0.414f, -0.63f, 0.657f, -1.378f, 0.657f, -2.185f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                curveToRelative(-0.504f, 0.0f, -0.986f, 0.102f, -1.439f, 0.28f)
                lineToRelative(-0.577f, 0.225f)
                lineToRelative(-0.098f, -0.613f)
                lineToRelative(-0.057f, -0.31f)
                curveToRelative(-0.657f, -3.185f, -3.455f, -5.582f, -6.83f, -5.582f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.0f, 7.0f)
                curveToRelative(0.0f, 0.498f, 0.057f, 0.982f, 0.158f, 1.454f)
                lineToRelative(0.118f, 0.554f)
                lineToRelative(-0.564f, 0.049f)
                curveToRelative(-3.2f, 0.278f, -5.711f, 2.93f, -5.711f, 6.193f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, 6.25f, 6.25f)
                horizontalLineToRelative(6.25f)
                verticalLineTo(19.74f)
                lineToRelative(-3.562f, -2.85f)
                lineToRelative(0.624f, -0.782f)
                lineToRelative(2.938f, 2.35f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.17f)
                lineToRelative(4.374f, -5.0f)
                lineToRelative(0.752f, 0.66f)
                lineToRelative(-5.126f, 5.857f)
                close()
            }
        }
        .build()
        return _treeMedium!!
    }

private var _treeMedium: ImageVector? = null
