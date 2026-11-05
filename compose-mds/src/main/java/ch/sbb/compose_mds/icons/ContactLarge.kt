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

public val SBBIcons.ContactLarge: ImageVector
    get() {
        if (_contactLarge != null) {
            return _contactLarge!!
        }
        _contactLarge = Builder(
            name = "ContactLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveTo(38.0f, 39.0f)
                lineTo(11.0f, 39.0f)
                verticalLineToRelative(-6.0f)
                lineTo(8.0f, 33.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                lineTo(8.0f, 25.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(12.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(25.0f)
                lineTo(37.0f, 9.0f)
                lineTo(12.0f, 9.0f)
                close()
                moveTo(30.0f, 35.0f)
                lineTo(19.0f, 35.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(24.5f, 14.001f)
                curveToRelative(1.04f, 0.0f, 1.929f, 0.547f, 2.54f, 1.372f)
                curveToRelative(0.61f, 0.822f, 0.96f, 1.935f, 0.96f, 3.147f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -0.519f, 2.385f)
                curveToRelative(2.701f, 1.634f, 4.52f, 5.346f, 4.52f, 9.596f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -4.251f, 1.816f, -7.963f, 4.52f, -9.597f)
                arcTo(5.6f, 5.6f, 0.0f, false, true, 21.0f, 18.501f)
                curveToRelative(0.0f, -2.37f, 1.396f, -4.5f, 3.5f, -4.5f)
                moveToRelative(-2.451f, 7.751f)
                curveToRelative(-2.224f, 1.34f, -3.902f, 4.445f, -4.038f, 8.249f)
                horizontalLineToRelative(12.98f)
                curveToRelative(-0.137f, -3.8f, -1.814f, -6.905f, -4.035f, -8.246f)
                curveTo(26.35f, 22.518f, 25.506f, 23.0f, 24.5f, 23.0f)
                curveToRelative(-0.99f, 0.0f, -1.843f, -0.492f, -2.451f, -1.249f)
                moveToRelative(2.451f, -6.751f)
                curveToRelative(-1.3f, 0.0f, -2.5f, 1.39f, -2.5f, 3.5f)
                curveToRelative(0.0f, 1.026f, 0.298f, 1.918f, 0.763f, 2.54f)
                curveToRelative(0.462f, 0.62f, 1.073f, 0.96f, 1.737f, 0.96f)
                curveToRelative(1.303f, 0.0f, 2.5f, -1.375f, 2.5f, -3.48f)
                curveToRelative(0.0f, -1.028f, -0.299f, -1.925f, -0.764f, -2.552f)
                curveToRelative(-0.463f, -0.625f, -1.074f, -0.968f, -1.736f, -0.968f)
            }
        }
            .build()
        return _contactLarge!!
    }

private var _contactLarge: ImageVector? = null
