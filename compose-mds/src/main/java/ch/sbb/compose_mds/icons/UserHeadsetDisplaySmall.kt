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

public val SBBIcons.UserHeadsetDisplaySmall: ImageVector
    get() {
        if (_userHeadsetDisplaySmall != null) {
            return _userHeadsetDisplaySmall!!
        }
        _userHeadsetDisplaySmall = Builder(name = "UserHeadsetDisplaySmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.843f, 6.0f)
                lineTo(14.0f, 6.0f)
                curveToRelative(0.283f, 0.0f, 0.553f, 0.093f, 0.749f, 0.307f)
                curveToRelative(0.188f, 0.206f, 0.251f, 0.465f, 0.251f, 0.693f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.272f, -0.09f, 0.536f, -0.294f, 0.731f)
                curveToRelative(-0.2f, 0.192f, -0.459f, 0.269f, -0.706f, 0.269f)
                horizontalLineToRelative(-1.964f)
                quadToRelative(-0.15f, 0.299f, -0.34f, 0.563f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.466f, 1.068f)
                lineToRelative(-0.675f, 0.738f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, -1.51f, -1.056f)
                arcTo(3.2f, 3.2f, 0.0f, false, true, 9.0f, 12.0f)
                curveToRelative(-0.75f, 0.0f, -1.427f, -0.257f, -1.98f, -0.689f)
                curveTo(4.682f, 12.48f, 3.166f, 15.024f, 3.013f, 18.0f)
                lineTo(11.0f, 18.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.384f, 1.6f, -6.45f, 4.302f, -7.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.338f, -0.56f)
                lineTo(4.0f, 10.0f)
                curveToRelative(-0.27f, 0.0f, -0.514f, -0.12f, -0.686f, -0.285f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 9.0f)
                lineTo(3.0f, 7.006f)
                curveToRelative(0.0f, -0.293f, 0.135f, -0.543f, 0.307f, -0.712f)
                curveTo(3.477f, 6.127f, 3.723f, 6.0f, 4.0f, 6.0f)
                horizontalLineToRelative(0.075f)
                curveTo(5.463f, 0.623f, 12.685f, 0.782f, 13.842f, 6.0f)
                moveToRelative(-1.031f, 0.0f)
                curveTo(11.75f, 2.137f, 6.38f, 1.934f, 5.114f, 6.0f)
                horizontalLineToRelative(0.85f)
                curveTo(6.554f, 4.82f, 7.657f, 4.0f, 9.0f, 4.0f)
                reflectiveCurveToRelative(2.447f, 0.82f, 3.036f, 2.0f)
                horizontalLineToRelative(0.776f)
                moveTo(6.5f, 8.0f)
                curveToRelative(0.0f, -1.742f, 1.172f, -3.0f, 2.5f, -3.0f)
                reflectiveCurveToRelative(2.5f, 1.259f, 2.5f, 3.0f)
                curveToRelative(0.0f, 0.356f, -0.049f, 0.691f, -0.138f, 1.0f)
                lineTo(9.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.87f)
                curveToRelative(-0.466f, 0.624f, -1.145f, 1.0f, -1.87f, 1.0f)
                curveToRelative(-1.328f, 0.0f, -2.5f, -1.259f, -2.5f, -3.0f)
                moveTo(4.0f, 8.987f)
                verticalLineToRelative(-1.97f)
                arcTo(0.1f, 0.1f, 0.0f, false, true, 4.017f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.985f)
                lineToRelative(-0.002f, -0.001f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(12.0f, 13.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _userHeadsetDisplaySmall!!
    }

private var _userHeadsetDisplaySmall: ImageVector? = null
