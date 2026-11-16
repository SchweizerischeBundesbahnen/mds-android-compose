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

public val SBBIcons.FingerprintSmall: ImageVector
    get() {
        if (_fingerprintSmall != null) {
            return _fingerprintSmall!!
        }
        _fingerprintSmall = Builder(name = "FingerprintSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.878f, 4.298f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 9.499f, 2.0f)
                curveToRelative(-0.622f, 0.0f, -1.233f, 0.04f, -1.832f, 0.108f)
                lineToRelative(0.113f, 0.993f)
                curveTo(8.347f, 3.036f, 8.92f, 3.0f, 9.5f, 3.0f)
                curveToRelative(2.876f, 0.0f, 5.562f, 0.791f, 7.87f, 2.159f)
                close()
                moveTo(9.499f, 4.0f)
                curveToRelative(4.258f, 0.0f, 8.075f, 1.846f, 10.726f, 4.765f)
                lineToRelative(-0.74f, 0.672f)
                curveTo(17.012f, 6.716f, 13.46f, 5.0f, 9.498f, 5.0f)
                curveToRelative(-1.788f, 0.0f, -3.49f, 0.355f, -5.054f, 0.987f)
                lineTo(4.07f, 5.06f)
                arcTo(14.45f, 14.45f, 0.0f, false, true, 9.5f, 4.0f)
                moveToRelative(0.0f, 2.0f)
                curveToRelative(4.64f, 0.0f, 8.678f, 2.533f, 10.835f, 6.281f)
                lineToRelative(-0.868f, 0.499f)
                curveTo(17.48f, 9.327f, 13.764f, 7.0f, 9.5f, 7.0f)
                curveToRelative(-2.173f, 0.0f, -4.198f, 0.614f, -5.933f, 1.663f)
                lineToRelative(-0.518f, -0.857f)
                arcTo(12.43f, 12.43f, 0.0f, false, true, 9.5f, 6.0f)
                moveToRelative(8.498f, 12.437f)
                curveTo(17.962f, 13.772f, 14.173f, 10.0f, 9.5f, 10.0f)
                arcToRelative(8.48f, 8.48f, 0.0f, false, false, -6.636f, 3.195f)
                lineToRelative(0.781f, 0.625f)
                arcTo(7.48f, 7.48f, 0.0f, false, true, 9.5f, 11.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.497f, 7.444f)
                close()
                moveTo(9.5f, 8.0f)
                curveToRelative(4.778f, 0.0f, 8.801f, 3.194f, 10.074f, 7.558f)
                lineToRelative(-0.96f, 0.279f)
                curveTo(17.462f, 11.887f, 13.82f, 9.0f, 9.5f, 9.0f)
                curveToRelative(-2.357f, 0.0f, -4.51f, 0.863f, -6.17f, 2.286f)
                lineToRelative(-0.651f, -0.76f)
                arcTo(10.45f, 10.45f, 0.0f, false, true, 9.5f, 8.0f)
                moveToRelative(0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                verticalLineToRelative(2.695f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(18.5f)
                arcToRelative(4.497f, 4.497f, 0.0f, false, false, -8.994f, -0.064f)
                lineToRelative(1.0f, 0.013f)
                arcTo(3.497f, 3.497f, 0.0f, false, true, 9.5f, 15.0f)
                moveToRelative(5.5f, 3.5f)
                arcToRelative(5.498f, 5.498f, 0.0f, false, false, -10.508f, -2.266f)
                lineToRelative(-0.91f, -0.412f)
                arcTo(6.497f, 6.497f, 0.0f, false, true, 16.0f, 18.5f)
                verticalLineToRelative(1.764f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(9.5f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                verticalLineToRelative(1.764f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 17.0f)
                moveToRelative(0.5f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _fingerprintSmall!!
    }

private var _fingerprintSmall: ImageVector? = null
