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

public val SBBIcons.UserAdminMedium: ImageVector
    get() {
        if (_userAdminMedium != null) {
            return _userAdminMedium!!
        }
        _userAdminMedium = Builder(name = "UserAdminMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.75f, 8.85f)
                curveToRelative(0.0f, -2.768f, 1.768f, -4.45f, 3.85f, -4.45f)
                curveToRelative(2.103f, 0.0f, 4.0f, 1.705f, 4.0f, 4.45f)
                curveToRelative(0.0f, 2.829f, -1.82f, 4.9f, -3.85f, 4.9f)
                curveToRelative(-2.049f, 0.0f, -4.0f, -2.095f, -4.0f, -4.9f)
                moveTo(12.6f, 3.4f)
                curveToRelative(-2.718f, 0.0f, -4.85f, 2.218f, -4.85f, 5.45f)
                curveToRelative(0.0f, 1.63f, 0.586f, 3.134f, 1.526f, 4.215f)
                curveToRelative(-3.013f, 2.057f, -4.51f, 5.336f, -5.258f, 8.065f)
                arcToRelative(22.6f, 22.6f, 0.0f, false, false, -0.672f, 3.601f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.094f, 1.406f)
                lineToRelative(-0.002f, 0.082f)
                verticalLineToRelative(0.03f)
                lineToRelative(0.5f, 0.001f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(4.268f)
                arcToRelative(21.612f, 21.612f, 0.0f, false, true, 0.715f, -4.355f)
                curveToRelative(0.734f, -2.684f, 2.186f, -5.769f, 5.035f, -7.623f)
                curveToRelative(0.786f, 0.616f, 1.725f, 0.978f, 2.732f, 0.978f)
                curveToRelative(1.063f, 0.0f, 2.024f, -0.402f, 2.806f, -1.076f)
                curveToRelative(2.228f, 1.567f, 3.508f, 3.831f, 4.38f, 6.012f)
                lineToRelative(0.928f, -0.372f)
                curveToRelative(-0.89f, -2.223f, -2.232f, -4.65f, -4.613f, -6.372f)
                curveToRelative(0.844f, -1.074f, 1.349f, -2.53f, 1.349f, -4.092f)
                curveToRelative(0.0f, -3.255f, -2.303f, -5.45f, -5.0f, -5.45f)
                moveToRelative(15.45f, 9.0f)
                arcToRelative(4.533f, 4.533f, 0.0f, false, false, -4.55f, 4.55f)
                curveToRelative(0.0f, 0.691f, 0.117f, 1.277f, 0.351f, 1.842f)
                lineToRelative(-0.205f, 0.204f)
                lineToRelative(-4.8f, 4.8f)
                lineToRelative(-0.204f, 0.205f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -1.842f, -0.351f)
                arcToRelative(4.533f, 4.533f, 0.0f, false, false, -4.55f, 4.55f)
                curveToRelative(0.0f, 0.827f, 0.168f, 1.504f, 0.503f, 2.174f)
                lineToRelative(0.31f, 0.62f)
                lineToRelative(0.49f, -0.49f)
                lineToRelative(1.05f, -1.05f)
                lineToRelative(1.504f, -1.504f)
                horizontalLineToRelative(0.943f)
                verticalLineToRelative(0.943f)
                lineToRelative(-2.554f, 2.553f)
                lineToRelative(-0.49f, 0.49f)
                lineToRelative(0.62f, 0.311f)
                arcToRelative(4.65f, 4.65f, 0.0f, false, false, 2.174f, 0.503f)
                arcToRelative(4.533f, 4.533f, 0.0f, false, false, 4.55f, -4.55f)
                curveToRelative(0.0f, -0.691f, -0.117f, -1.277f, -0.351f, -1.842f)
                lineToRelative(0.205f, -0.204f)
                lineToRelative(4.8f, -4.8f)
                lineToRelative(0.204f, -0.205f)
                curveToRelative(0.565f, 0.234f, 1.15f, 0.35f, 1.842f, 0.35f)
                arcToRelative(4.533f, 4.533f, 0.0f, false, false, 4.55f, -4.55f)
                arcToRelative(4.65f, 4.65f, 0.0f, false, false, -0.503f, -2.173f)
                lineToRelative(-0.31f, -0.62f)
                lineToRelative(-0.49f, 0.49f)
                lineToRelative(-1.05f, 1.05f)
                lineToRelative(-1.504f, 1.504f)
                horizontalLineTo(27.8f)
                verticalLineToRelative(-0.943f)
                lineToRelative(2.554f, -2.554f)
                lineToRelative(0.49f, -0.49f)
                lineToRelative(-0.62f, -0.31f)
                arcToRelative(4.65f, 4.65f, 0.0f, false, false, -2.174f, -0.503f)
                moveToRelative(-3.55f, 4.55f)
                arcToRelative(3.533f, 3.533f, 0.0f, false, true, 3.55f, -3.55f)
                curveToRelative(0.393f, 0.0f, 0.735f, 0.045f, 1.057f, 0.135f)
                lineToRelative(-2.16f, 2.161f)
                lineToRelative(-0.147f, 0.147f)
                verticalLineTo(18.2f)
                horizontalLineToRelative(2.357f)
                lineToRelative(0.147f, -0.146f)
                lineToRelative(1.65f, -1.65f)
                lineToRelative(0.51f, -0.511f)
                curveToRelative(0.09f, 0.322f, 0.136f, 0.664f, 0.136f, 1.057f)
                arcToRelative(3.533f, 3.533f, 0.0f, false, true, -3.55f, 3.55f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, true, -1.726f, -0.397f)
                lineTo(26.0f, 19.94f)
                lineToRelative(-0.255f, 0.255f)
                lineToRelative(-0.45f, 0.45f)
                lineToRelative(-4.8f, 4.8f)
                lineToRelative(-0.45f, 0.45f)
                lineToRelative(-0.254f, 0.255f)
                lineToRelative(0.16f, 0.323f)
                curveToRelative(0.266f, 0.53f, 0.398f, 1.053f, 0.398f, 1.726f)
                arcToRelative(3.533f, 3.533f, 0.0f, false, true, -3.55f, 3.55f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.057f, -0.136f)
                lineToRelative(2.16f, -2.16f)
                lineToRelative(0.147f, -0.147f)
                verticalLineTo(26.95f)
                horizontalLineToRelative(-2.357f)
                lineToRelative(-0.147f, 0.146f)
                lineToRelative(-1.65f, 1.65f)
                lineToRelative(-0.51f, 0.511f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -0.136f, -1.057f)
                arcToRelative(3.533f, 3.533f, 0.0f, false, true, 3.55f, -3.55f)
                curveToRelative(0.673f, 0.0f, 1.196f, 0.132f, 1.726f, 0.397f)
                lineToRelative(0.323f, 0.161f)
                lineToRelative(0.255f, -0.255f)
                lineToRelative(0.45f, -0.45f)
                lineToRelative(4.8f, -4.8f)
                lineToRelative(0.45f, -0.45f)
                lineToRelative(0.254f, -0.254f)
                lineToRelative(-0.16f, -0.323f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, true, -0.398f, -1.726f)
            }
        }
        .build()
        return _userAdminMedium!!
    }

private var _userAdminMedium: ImageVector? = null
