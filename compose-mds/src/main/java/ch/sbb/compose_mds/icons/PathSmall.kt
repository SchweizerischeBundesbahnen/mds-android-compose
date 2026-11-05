package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.PathSmall: ImageVector
    get() {
        if (_pathSmall != null) {
            return _pathSmall!!
        }
        _pathSmall = Builder(
            name = "PathSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(15.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                moveTo(4.5f, 13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveTo(15.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(5.0f, -4.0f)
                curveToRelative(0.0f, 1.357f, -0.409f, 2.327f, -0.834f, 2.965f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.588f, 0.703f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.268f, 0.226f)
                lineToRelative(-0.028f, 0.02f)
                lineToRelative(-0.003f, 0.001f)
                verticalLineToRelative(0.001f)
                reflectiveCurveToRelative(-0.002f, 0.0f, -0.279f, -0.416f)
                lineToRelative(-0.277f, -0.416f)
                lineToRelative(-0.002f, 0.001f)
                lineToRelative(0.003f, -0.002f)
                lineToRelative(0.032f, -0.024f)
                quadToRelative(0.047f, -0.036f, 0.135f, -0.118f)
                curveToRelative(0.117f, -0.11f, 0.28f, -0.285f, 0.443f, -0.53f)
                curveToRelative(0.325f, -0.488f, 0.666f, -1.268f, 0.666f, -2.411f)
                close()
                moveTo(12.313f, 8.11f)
                curveToRelative(1.361f, 1.089f, 2.028f, 2.574f, 2.356f, 3.756f)
                curveToRelative(0.165f, 0.594f, 0.248f, 1.122f, 0.289f, 1.502f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.041f, 0.58f)
                lineToRelative(0.001f, 0.036f)
                lineTo(15.0f, 14.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.028f)
                lineToRelative(-0.004f, -0.102f)
                arcToRelative(8.506f, 8.506f, 0.0f, false, false, -0.29f, -1.736f)
                curveToRelative(-0.297f, -1.068f, -0.88f, -2.333f, -2.018f, -3.243f)
                close()
                moveTo(6.0f, 8.5f)
                lineToRelative(0.277f, 0.416f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.033f, 0.024f)
                quadToRelative(-0.046f, 0.036f, -0.135f, 0.118f)
                curveToRelative(-0.117f, 0.11f, -0.28f, 0.285f, -0.443f, 0.53f)
                curveTo(5.341f, 10.078f, 5.0f, 10.858f, 5.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                curveToRelative(0.0f, -1.357f, 0.409f, -2.327f, 0.834f, -2.965f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.588f, -0.703f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.268f, -0.226f)
                lineToRelative(0.028f, -0.02f)
                lineToRelative(0.003f, -0.001f)
                verticalLineToRelative(-0.001f)
                curveToRelative(0.002f, 0.001f, 0.018f, 0.024f, 0.279f, 0.416f)
                moveTo(19.5f, 6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveTo(9.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
            .build()
        return _pathSmall!!
    }

private var _pathSmall: ImageVector? = null
