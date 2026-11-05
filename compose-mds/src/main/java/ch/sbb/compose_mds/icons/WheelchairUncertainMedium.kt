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
        _wheelchairUncertainMedium = Builder(
            name = "WheelchairUncertainMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(24.138f, 8.29f)
                curveToRelative(1.653f, -0.81f, 3.7f, -0.72f, 5.369f, 0.094f)
                lineToRelative(0.008f, 0.004f)
                lineToRelative(0.008f, 0.004f)
                curveToRelative(1.067f, 0.57f, 2.006f, 1.606f, 2.306f, 2.932f)
                curveToRelative(0.306f, 1.35f, -0.068f, 2.907f, -1.456f, 4.459f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-2.238f, 2.239f)
                curveToRelative(-0.67f, 0.761f, -0.993f, 1.331f, -1.163f, 1.95f)
                curveToRelative(-0.178f, 0.644f, -0.202f, 1.376f, -0.202f, 2.508f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.114f, 0.019f, -1.98f, 0.238f, -2.773f)
                curveToRelative(0.224f, -0.816f, 0.648f, -1.52f, 1.387f, -2.358f)
                lineToRelative(0.01f, -0.012f)
                lineToRelative(0.011f, -0.01f)
                lineToRelative(2.24f, -2.241f)
                curveToRelative(1.208f, -1.354f, 1.438f, -2.588f, 1.218f, -3.56f)
                curveToRelative(-0.226f, -0.995f, -0.942f, -1.81f, -1.794f, -2.267f)
                curveToRelative(-1.424f, -0.692f, -3.142f, -0.748f, -4.481f, -0.09f)
                curveToRelative(-1.31f, 0.642f, -2.329f, 2.0f, -2.329f, 4.31f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.652f, 1.203f, -4.38f, 2.888f, -5.208f)
                moveTo(9.25f, 20.25f)
                lineTo(9.25f, 12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.75f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(8.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.75f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(3.25f, 21.751f)
                curveToRelative(0.0f, -2.525f, 1.459f, -4.723f, 3.57f, -5.797f)
                lineToRelative(0.453f, 0.89f)
                curveToRelative(-1.791f, 0.912f, -3.023f, 2.776f, -3.023f, 4.907f)
                curveToRelative(0.0f, 3.021f, 2.477f, 5.5f, 5.5f, 5.5f)
                curveToRelative(2.187f, 0.0f, 4.093f, -1.3f, 4.976f, -3.17f)
                lineToRelative(0.904f, 0.428f)
                curveToRelative(-1.04f, 2.204f, -3.289f, 3.742f, -5.88f, 3.742f)
                curveToRelative(-3.575f, 0.0f, -6.5f, -2.927f, -6.5f, -6.5f)
                moveToRelative(22.567f, 3.746f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(9.5f, 9.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(0.25f, -1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
            }
        }
            .build()
        return _wheelchairUncertainMedium!!
    }

private var _wheelchairUncertainMedium: ImageVector? = null
