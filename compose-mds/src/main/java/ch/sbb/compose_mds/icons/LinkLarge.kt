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

public val SBBIcons.LinkLarge: ImageVector
    get() {
        if (_linkLarge != null) {
            return _linkLarge!!
        }
        _linkLarge = Builder(
            name = "LinkLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(16.781f, 19.61f)
                curveToRelative(2.45f, -2.448f, 6.407f, -2.525f, 8.951f, -0.23f)
                lineToRelative(0.243f, 0.23f)
                lineToRelative(1.414f, 1.416f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-1.414f, -1.416f)
                verticalLineToRelative(-0.001f)
                curveToRelative(-2.072f, -2.07f, -5.423f, -2.134f, -7.575f, -0.194f)
                lineToRelative(-0.204f, 0.195f)
                lineToRelative(-8.483f, 8.486f)
                curveToRelative(-2.139f, 2.139f, -2.139f, 5.64f, 0.0f, 7.778f)
                lineToRelative(1.413f, 1.414f)
                curveToRelative(2.139f, 2.137f, 5.64f, 2.137f, 7.777f, 0.0f)
                lineToRelative(4.96f, -4.96f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-4.96f, 4.96f)
                curveToRelative(-2.527f, 2.528f, -6.661f, 2.527f, -9.19f, 0.0f)
                horizontalLineTo(9.71f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-2.529f, -2.529f, -2.529f, -6.663f, 0.0f, -9.192f)
                close()
                moveTo(28.63f, 8.898f)
                arcToRelative(6.447f, 6.447f, 0.0f, false, true, 9.129f, -0.008f)
                lineToRelative(1.471f, 1.414f)
                lineToRelative(0.007f, 0.007f)
                curveToRelative(2.528f, 2.527f, 2.54f, 6.612f, 0.011f, 9.14f)
                lineToRelative(0.001f, 0.001f)
                lineToRelative(-8.497f, 8.536f)
                curveToRelative(-2.527f, 2.529f, -6.662f, 2.53f, -9.191f, 0.0f)
                lineToRelative(-1.415f, -1.413f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(1.415f, 1.413f)
                curveToRelative(2.138f, 2.14f, 5.64f, 2.14f, 7.776f, 0.002f)
                lineToRelative(8.497f, -8.536f)
                horizontalLineToRelative(0.001f)
                arcToRelative(5.457f, 5.457f, 0.0f, false, false, -0.012f, -7.728f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-1.465f, -1.405f)
                lineToRelative(-0.006f, -0.008f)
                arcToRelative(5.446f, 5.446f, 0.0f, false, false, -7.721f, 0.0f)
                lineToRelative(-0.009f, 0.009f)
                lineToRelative(-0.026f, 0.025f)
                lineToRelative(-0.099f, 0.1f)
                lineToRelative(-1.616f, 1.616f)
                lineToRelative(-3.198f, 3.2f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(3.198f, -3.2f)
                lineToRelative(1.616f, -1.616f)
                lineToRelative(0.099f, -0.1f)
                lineToRelative(0.026f, -0.025f)
                lineToRelative(0.006f, -0.007f)
                close()
            }
        }
            .build()
        return _linkLarge!!
    }

private var _linkLarge: ImageVector? = null
