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

public val SBBIcons.ContactSmall: ImageVector
    get() {
        if (_contactSmall != null) {
            return _contactSmall!!
        }
        _contactSmall = Builder(
            name = "ContactSmall",
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
                moveTo(5.5f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 4.0f)
                lineTo(5.5f, 4.0f)
                moveTo(6.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-0.449f, 0.0f, -1.0f, 0.511f, -1.0f, 1.5f)
                curveToRelative(0.0f, 0.467f, 0.136f, 0.858f, 0.332f, 1.121f)
                curveToRelative(0.193f, 0.26f, 0.43f, 0.38f, 0.668f, 0.38f)
                curveToRelative(0.452f, 0.0f, 1.0f, -0.505f, 1.0f, -1.49f)
                curveToRelative(0.0f, -0.468f, -0.136f, -0.863f, -0.333f, -1.128f)
                curveTo(12.473f, 8.121f, 12.237f, 8.0f, 12.0f, 8.0f)
                moveToRelative(-2.0f, 1.5f)
                curveToRelative(0.0f, -1.25f, 0.747f, -2.5f, 2.0f, -2.5f)
                curveToRelative(0.615f, 0.0f, 1.128f, 0.325f, 1.47f, 0.788f)
                curveToRelative(0.341f, 0.46f, 0.53f, 1.07f, 0.53f, 1.722f)
                curveToRelative(0.0f, 0.378f, -0.068f, 0.754f, -0.197f, 1.095f)
                curveTo(15.146f, 11.53f, 16.0f, 13.412f, 16.0f, 15.5f)
                verticalLineToRelative(0.5f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.088f, 0.854f, -3.97f, 2.197f, -4.894f)
                arcTo(3.1f, 3.1f, 0.0f, false, true, 10.0f, 9.5f)
                moveToRelative(0.732f, 1.953f)
                curveToRelative(-0.89f, 0.635f, -1.592f, 1.928f, -1.713f, 3.547f)
                horizontalLineToRelative(5.963f)
                curveToRelative(-0.121f, -1.616f, -0.82f, -2.908f, -1.709f, -3.544f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 12.0f, 12.0f)
                curveToRelative(-0.503f, 0.0f, -0.938f, -0.215f, -1.268f, -0.547f)
            }
        }
            .build()
        return _contactSmall!!
    }

private var _contactSmall: ImageVector? = null
