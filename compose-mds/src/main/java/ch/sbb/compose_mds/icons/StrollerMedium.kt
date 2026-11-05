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

public val SBBIcons.StrollerMedium: ImageVector
    get() {
        if (_strollerMedium != null) {
            return _strollerMedium!!
        }
        _strollerMedium = Builder(
            name = "StrollerMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(18.256f, 6.25f)
                horizontalLineToRelative(0.499f)
                curveToRelative(6.072f, 0.0f, 10.995f, 4.923f, 10.995f, 10.995f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.012f)
                verticalLineToRelative(4.005f)
                curveToRelative(0.0f, 1.95f, -1.34f, 3.765f, -3.074f, 4.566f)
                arcTo(2.754f, 2.754f, 0.0f, false, true, 24.0f, 29.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.739f, -3.0f)
                lineTo(16.24f, 26.75f)
                quadToRelative(0.01f, 0.124f, 0.011f, 0.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.414f, -0.683f)
                curveToRelative(-1.738f, -0.8f, -3.088f, -2.615f, -3.088f, -4.567f)
                verticalLineToRelative(-8.5f)
                lineTo(3.0f, 13.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.748f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(9.495f)
                lineToRelative(0.012f, -10.0f)
                close()
                moveTo(28.738f, 16.745f)
                arcToRelative(9.996f, 9.996f, 0.0f, false, false, -9.484f, -9.483f)
                lineToRelative(-0.01f, 9.483f)
                close()
                moveTo(28.738f, 17.75f)
                lineTo(8.748f, 17.75f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.514f, 1.081f, 3.006f, 2.508f, 3.66f)
                arcToRelative(2.749f, 2.749f, 0.0f, false, true, 4.694f, 0.34f)
                horizontalLineToRelative(5.6f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 4.694f, -0.34f)
                curveToRelative(1.42f, -0.654f, 2.494f, -2.145f, 2.494f, -3.66f)
                close()
                moveTo(13.5f, 25.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.002f, 3.502f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -0.002f, -3.502f)
                moveToRelative(10.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -0.001f, 3.499f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 24.0f, 25.25f)
            }
        }
            .build()
        return _strollerMedium!!
    }

private var _strollerMedium: ImageVector? = null
