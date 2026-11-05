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
        _fingerprintSmall = Builder(
            name = "FingerprintSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(7.78f, 3.1f)
                quadToRelative(0.85f, -0.098f, 1.719f, -0.1f)
                curveToRelative(2.876f, 0.0f, 5.561f, 0.791f, 7.869f, 2.158f)
                lineToRelative(0.51f, -0.86f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, -8.379f, -2.299f)
                curveToRelative(-0.622f, 0.0f, -1.232f, 0.04f, -1.832f, 0.108f)
                close()
                moveTo(4.07f, 5.06f)
                arcTo(14.45f, 14.45f, 0.0f, false, true, 9.5f, 4.0f)
                curveToRelative(4.257f, 0.0f, 8.073f, 1.846f, 10.724f, 4.765f)
                lineToRelative(-0.74f, 0.672f)
                curveTo(17.013f, 6.717f, 13.461f, 5.0f, 9.5f, 5.0f)
                curveToRelative(-1.788f, 0.0f, -3.49f, 0.355f, -5.054f, 0.987f)
                close()
                moveTo(9.5f, 7.0f)
                curveToRelative(-2.173f, 0.0f, -4.198f, 0.613f, -5.933f, 1.663f)
                lineToRelative(-0.518f, -0.856f)
                arcTo(12.43f, 12.43f, 0.0f, false, true, 9.5f, 6.0f)
                curveToRelative(4.64f, 0.0f, 8.678f, 2.533f, 10.834f, 6.281f)
                lineToRelative(-0.866f, 0.499f)
                curveTo(17.48f, 9.327f, 13.765f, 7.0f, 9.5f, 7.0f)
                moveToRelative(-5.855f, 6.82f)
                arcTo(7.48f, 7.48f, 0.0f, false, true, 9.5f, 11.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.497f, 7.444f)
                lineToRelative(1.0f, -0.008f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 9.5f, 10.0f)
                arcToRelative(8.48f, 8.48f, 0.0f, false, false, -6.636f, 3.195f)
                close()
                moveTo(2.679f, 10.526f)
                arcTo(10.45f, 10.45f, 0.0f, false, true, 9.499f, 8.0f)
                curveToRelative(4.778f, 0.0f, 8.802f, 3.193f, 10.075f, 7.557f)
                lineToRelative(-0.96f, 0.28f)
                curveTo(17.462f, 11.887f, 13.82f, 9.0f, 9.5f, 9.0f)
                arcToRelative(9.45f, 9.45f, 0.0f, false, false, -6.17f, 2.286f)
                close()
                moveTo(6.006f, 18.45f)
                arcTo(3.497f, 3.497f, 0.0f, false, true, 13.0f, 18.5f)
                verticalLineToRelative(2.696f)
                horizontalLineToRelative(1.0f)
                lineTo(14.0f, 18.5f)
                arcToRelative(4.497f, 4.497f, 0.0f, false, false, -8.994f, -0.065f)
                close()
                moveTo(3.582f, 15.82f)
                arcTo(6.497f, 6.497f, 0.0f, false, true, 16.0f, 18.501f)
                verticalLineToRelative(1.763f)
                horizontalLineToRelative(-1.0f)
                lineTo(15.0f, 18.5f)
                arcToRelative(5.497f, 5.497f, 0.0f, false, false, -10.507f, -2.266f)
                close()
                moveTo(9.5f, 16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.0f, 18.5f)
                verticalLineToRelative(1.763f)
                horizontalLineToRelative(1.0f)
                lineTo(8.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 16.0f)
                moveTo(9.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
            .build()
        return _fingerprintSmall!!
    }

private var _fingerprintSmall: ImageVector? = null
