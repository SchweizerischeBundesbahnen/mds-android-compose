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

public val SBBIcons.WheelchairUncertainMedium: ImageVector
    get() {
        if (_wheelchairUncertainMedium != null) {
            return _wheelchairUncertainMedium!!
        }
        _wheelchairUncertainMedium = Builder(name = "WheelchairUncertainMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.138f, 8.29f)
                curveToRelative(1.55f, -0.76f, 3.446f, -0.727f, 5.051f, -0.05f)
                lineToRelative(0.318f, 0.143f)
                lineToRelative(0.008f, 0.004f)
                lineToRelative(0.008f, 0.005f)
                curveToRelative(1.067f, 0.57f, 2.006f, 1.606f, 2.306f, 2.933f)
                curveToRelative(0.306f, 1.349f, -0.068f, 2.906f, -1.456f, 4.458f)
                lineToRelative(-0.378f, -0.338f)
                lineToRelative(0.005f, 0.005f)
                lineToRelative(0.373f, 0.333f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-2.24f, 2.24f)
                curveToRelative(-0.668f, 0.76f, -0.991f, 1.33f, -1.162f, 1.95f)
                curveToRelative(-0.177f, 0.643f, -0.201f, 1.375f, -0.201f, 2.507f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.114f, 0.018f, -1.98f, 0.237f, -2.774f)
                curveToRelative(0.225f, -0.815f, 0.65f, -1.52f, 1.388f, -2.357f)
                lineToRelative(0.01f, -0.012f)
                lineToRelative(2.242f, -2.241f)
                curveToRelative(1.216f, -1.359f, 1.447f, -2.595f, 1.227f, -3.57f)
                curveToRelative(-0.226f, -0.994f, -0.94f, -1.809f, -1.791f, -2.266f)
                curveToRelative(-1.426f, -0.693f, -3.144f, -0.749f, -4.485f, -0.091f)
                curveToRelative(-1.31f, 0.643f, -2.328f, 2.001f, -2.328f, 4.31f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.652f, 1.202f, -4.381f, 2.888f, -5.208f)
                moveTo(10.25f, 12.0f)
                verticalLineToRelative(7.75f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(8.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.75f)
                horizontalLineToRelative(-7.5f)
                lineTo(9.25f, 12.0f)
                close()
                moveTo(3.25f, 21.75f)
                curveToRelative(0.0f, -2.524f, 1.459f, -4.722f, 3.57f, -5.796f)
                lineToRelative(0.453f, 0.89f)
                curveToRelative(-1.792f, 0.912f, -3.023f, 2.776f, -3.023f, 4.907f)
                curveToRelative(0.0f, 3.02f, 2.477f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.187f, 0.0f, 4.094f, -1.3f, 4.976f, -3.17f)
                lineToRelative(0.904f, 0.428f)
                curveToRelative(-1.04f, 2.203f, -3.289f, 3.742f, -5.88f, 3.742f)
                curveToRelative(-3.575f, 0.0f, -6.5f, -2.927f, -6.5f, -6.5f)
                moveToRelative(23.567f, 6.747f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(9.75f, 8.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.5f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
            }
        }
        .build()
        return _wheelchairUncertainMedium!!
    }

private var _wheelchairUncertainMedium: ImageVector? = null
