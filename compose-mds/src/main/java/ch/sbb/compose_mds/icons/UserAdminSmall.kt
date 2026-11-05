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

public val SBBIcons.UserAdminSmall: ImageVector
    get() {
        if (_userAdminSmall != null) {
            return _userAdminSmall!!
        }
        _userAdminSmall = Builder(name = "UserAdminSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 5.9f)
                curveToRelative(0.0f, -1.768f, 1.118f, -2.8f, 2.4f, -2.8f)
                curveToRelative(1.303f, 0.0f, 2.5f, 1.055f, 2.5f, 2.8f)
                curveTo(10.9f, 7.729f, 9.73f, 9.0f, 8.5f, 9.0f)
                curveTo(7.251f, 9.0f, 6.0f, 7.705f, 6.0f, 5.9f)
                moveToRelative(2.4f, -3.8f)
                curveTo(6.482f, 2.1f, 5.0f, 3.668f, 5.0f, 5.9f)
                curveToRelative(0.0f, 1.051f, 0.355f, 2.036f, 0.94f, 2.777f)
                curveToRelative(-1.955f, 1.408f, -2.931f, 3.574f, -3.422f, 5.366f)
                arcToRelative(15.2f, 15.2f, 0.0f, false, false, -0.51f, 3.171f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.008f, 0.263f)
                verticalLineToRelative(0.022f)
                lineToRelative(0.5f, 0.001f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(3.023f)
                quadToRelative(0.012f, -0.185f, 0.037f, -0.427f)
                curveToRelative(0.06f, -0.583f, 0.181f, -1.386f, 0.422f, -2.266f)
                curveToRelative(0.477f, -1.74f, 1.404f, -3.71f, 3.19f, -4.92f)
                curveToRelative(0.53f, 0.386f, 1.155f, 0.613f, 1.828f, 0.613f)
                curveToRelative(0.71f, 0.0f, 1.35f, -0.25f, 1.879f, -0.673f)
                curveToRelative(1.383f, 1.015f, 2.195f, 2.453f, 2.757f, 3.859f)
                lineToRelative(0.928f, -0.372f)
                curveToRelative(-0.581f, -1.453f, -1.457f, -3.053f, -2.996f, -4.22f)
                curveToRelative(0.525f, -0.734f, 0.832f, -1.688f, 0.832f, -2.694f)
                curveToRelative(0.0f, -2.255f, -1.603f, -3.8f, -3.5f, -3.8f)
                moveToRelative(10.3f, 6.0f)
                arcToRelative(3.19f, 3.19f, 0.0f, false, false, -3.2f, 3.2f)
                curveToRelative(0.0f, 0.44f, 0.069f, 0.822f, 0.206f, 1.187f)
                lineToRelative(-0.06f, 0.06f)
                lineToRelative(-3.2f, 3.2f)
                lineToRelative(-0.059f, 0.059f)
                arcTo(3.3f, 3.3f, 0.0f, false, false, 11.2f, 15.6f)
                arcTo(3.19f, 3.19f, 0.0f, false, false, 8.0f, 18.8f)
                curveToRelative(0.0f, 0.577f, 0.118f, 1.054f, 0.353f, 1.524f)
                lineToRelative(0.31f, 0.62f)
                lineToRelative(0.49f, -0.49f)
                lineToRelative(0.7f, -0.7f)
                lineToRelative(0.954f, -0.954f)
                horizontalLineToRelative(0.393f)
                verticalLineToRelative(0.393f)
                lineToRelative(-1.654f, 1.653f)
                lineToRelative(-0.49f, 0.491f)
                lineToRelative(0.62f, 0.31f)
                curveToRelative(0.47f, 0.235f, 0.947f, 0.353f, 1.524f, 0.353f)
                curveToRelative(1.776f, 0.0f, 3.2f, -1.424f, 3.2f, -3.2f)
                curveToRelative(0.0f, -0.44f, -0.069f, -0.822f, -0.206f, -1.187f)
                lineToRelative(0.06f, -0.06f)
                lineToRelative(3.2f, -3.2f)
                lineToRelative(0.059f, -0.059f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 1.187f, 0.206f)
                curveToRelative(1.776f, 0.0f, 3.2f, -1.424f, 3.2f, -3.2f)
                curveToRelative(0.0f, -0.577f, -0.118f, -1.054f, -0.353f, -1.524f)
                lineToRelative(-0.31f, -0.62f)
                lineToRelative(-0.49f, 0.49f)
                lineToRelative(-0.7f, 0.7f)
                lineToRelative(-0.954f, 0.954f)
                horizontalLineTo(18.7f)
                verticalLineToRelative(-0.393f)
                lineToRelative(1.654f, -1.653f)
                lineToRelative(0.49f, -0.491f)
                lineToRelative(-0.62f, -0.31f)
                arcTo(3.3f, 3.3f, 0.0f, false, false, 18.7f, 8.1f)
                moveToRelative(-2.2f, 3.2f)
                curveToRelative(0.0f, -1.224f, 0.976f, -2.2f, 2.2f, -2.2f)
                quadToRelative(0.197f, 0.0f, 0.369f, 0.024f)
                lineToRelative(-1.223f, 1.222f)
                lineToRelative(-0.146f, 0.147f)
                verticalLineTo(12.3f)
                horizontalLineToRelative(1.807f)
                lineToRelative(0.147f, -0.147f)
                lineToRelative(1.1f, -1.1f)
                lineToRelative(0.122f, -0.122f)
                quadToRelative(0.024f, 0.173f, 0.024f, 0.369f)
                curveToRelative(0.0f, 1.224f, -0.976f, 2.2f, -2.2f, 2.2f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -1.076f, -0.247f)
                lineToRelative(-0.323f, -0.161f)
                lineToRelative(-0.255f, 0.254f)
                lineToRelative(-0.3f, 0.3f)
                lineToRelative(-3.2f, 3.2f)
                lineToRelative(-0.3f, 0.3f)
                lineToRelative(-0.254f, 0.255f)
                lineToRelative(0.16f, 0.323f)
                curveToRelative(0.166f, 0.33f, 0.248f, 0.653f, 0.248f, 1.076f)
                curveToRelative(0.0f, 1.224f, -0.976f, 2.2f, -2.2f, 2.2f)
                quadToRelative(-0.197f, 0.0f, -0.369f, -0.024f)
                lineToRelative(1.223f, -1.223f)
                lineToRelative(0.146f, -0.146f)
                verticalLineTo(17.8f)
                horizontalLineToRelative(-1.807f)
                lineToRelative(-0.147f, 0.146f)
                lineToRelative(-1.1f, 1.1f)
                lineToRelative(-0.122f, 0.123f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 18.8f)
                curveToRelative(0.0f, -1.224f, 0.976f, -2.2f, 2.2f, -2.2f)
                curveToRelative(0.423f, 0.0f, 0.746f, 0.082f, 1.076f, 0.247f)
                lineToRelative(0.323f, 0.161f)
                lineToRelative(0.255f, -0.255f)
                lineToRelative(0.3f, -0.3f)
                lineToRelative(3.2f, -3.2f)
                lineToRelative(0.3f, -0.3f)
                lineToRelative(0.254f, -0.254f)
                lineToRelative(-0.16f, -0.323f)
                arcTo(2.3f, 2.3f, 0.0f, false, true, 16.5f, 11.3f)
            }
        }
        .build()
        return _userAdminSmall!!
    }

private var _userAdminSmall: ImageVector? = null
