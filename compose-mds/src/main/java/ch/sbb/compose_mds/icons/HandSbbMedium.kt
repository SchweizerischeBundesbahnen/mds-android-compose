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

public val SBBIcons.HandSbbMedium: ImageVector
    get() {
        if (_handSbbMedium != null) {
            return _handSbbMedium!!
        }
        _handSbbMedium = Builder(name = "HandSbbMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.829f, 10.056f)
                lineTo(15.71f, 6.0f)
                horizontalLineToRelative(3.06f)
                lineToRelative(5.23f, 5.25f)
                lineToRelative(-5.23f, 5.25f)
                horizontalLineToRelative(-3.06f)
                lineToRelative(4.118f, -4.03f)
                horizontalLineTo(14.71f)
                verticalLineToRelative(4.03f)
                horizontalLineTo(12.29f)
                verticalLineToRelative(-4.03f)
                horizontalLineTo(7.2f)
                lineToRelative(4.116f, 4.03f)
                horizontalLineToRelative(-3.06f)
                lineTo(3.0f, 11.25f)
                lineTo(8.256f, 6.0f)
                horizontalLineToRelative(3.06f)
                lineTo(7.2f, 10.056f)
                horizontalLineToRelative(5.09f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.42f)
                verticalLineToRelative(4.056f)
                close()
                moveTo(12.246f, 24.2f)
                lineTo(6.488f, 20.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.499f, 3.123f)
                lineToRelative(8.88f, 7.823f)
                lineToRelative(0.141f, 0.125f)
                horizontalLineToRelative(5.898f)
                lineToRelative(1.365f, 1.355f)
                lineToRelative(0.147f, 0.145f)
                horizontalLineTo(33.0f)
                lineToRelative(-0.846f, -0.852f)
                lineToRelative(-7.542f, -7.596f)
                lineToRelative(-0.008f, -0.008f)
                curveToRelative(-1.756f, -1.69f, -4.041f, -2.999f, -6.431f, -3.044f)
                horizontalLineTo(15.0f)
                curveToRelative(-0.881f, 0.0f, -1.582f, 0.337f, -2.058f, 0.87f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, false, -0.697f, 2.081f)
                moveTo(5.903f, 20.99f)
                lineToRelative(7.056f, 4.929f)
                curveToRelative(0.475f, 0.512f, 1.169f, 0.83f, 2.042f, 0.83f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.63f, 0.0f, -1.057f, -0.226f, -1.332f, -0.535f)
                curveToRelative(-0.282f, -0.317f, -0.432f, -0.755f, -0.428f, -1.21f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, true, 0.447f, -1.218f)
                curveToRelative(0.28f, -0.312f, 0.705f, -0.536f, 1.313f, -0.536f)
                horizontalLineToRelative(3.158f)
                curveToRelative(2.044f, 0.04f, 4.097f, 1.172f, 5.749f, 2.76f)
                lineToRelative(6.692f, 6.74f)
                horizontalLineTo(20.83f)
                lineToRelative(-1.365f, -1.355f)
                lineToRelative(-0.146f, -0.145f)
                horizontalLineToRelative(-5.932f)
                lineToRelative(-8.746f, -7.705f)
                lineToRelative(-0.008f, -0.008f)
                lineToRelative(-0.01f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.253f, -1.56f)
                lineToRelative(0.013f, 0.01f)
                close()
            }
        }
        .build()
        return _handSbbMedium!!
    }

private var _handSbbMedium: ImageVector? = null
