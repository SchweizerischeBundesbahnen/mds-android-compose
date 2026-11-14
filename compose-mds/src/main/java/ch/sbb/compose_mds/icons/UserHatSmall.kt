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

public val SBBIcons.UserHatSmall: ImageVector
    get() {
        if (_userHatSmall != null) {
            return _userHatSmall!!
        }
        _userHatSmall = Builder(name = "UserHatSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(16.658f, 4.525f)
                lineToRelative(1.426f, 0.476f)
                lineToRelative(-1.427f, 0.474f)
                lineToRelative(-1.657f, 0.55f)
                verticalLineToRelative(1.92f)
                curveToRelative(0.319f, 0.605f, 0.5f, 1.31f, 0.5f, 2.055f)
                curveToRelative(0.0f, 0.946f, -0.3f, 1.848f, -0.813f, 2.556f)
                curveTo(17.368f, 13.927f, 19.0f, 17.085f, 19.0f, 20.499f)
                lineTo(19.0f, 21.0f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-13.0f, -0.006f)
                lineTo(5.0f, 20.994f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.707f, 1.711f, -6.659f, 4.308f, -7.937f)
                arcTo(4.3f, 4.3f, 0.0f, false, true, 8.613f, 11.0f)
                lineTo(5.4f, 11.0f)
                lineToRelative(0.412f, -0.743f)
                lineTo(7.0f, 8.119f)
                lineTo(7.0f, 5.361f)
                lineTo(5.916f, 5.0f)
                lineToRelative(1.426f, -0.476f)
                lineTo(12.0f, 2.973f)
                close()
                moveTo(10.04f, 13.321f)
                curveToRelative(-2.231f, 0.948f, -3.877f, 3.37f, -4.028f, 6.673f)
                lineToRelative(11.974f, 0.004f)
                curveToRelative(-0.157f, -3.05f, -1.728f, -5.66f, -4.029f, -6.683f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, true, -3.918f, 0.007f)
                moveTo(9.79f, 8.6f)
                curveToRelative(1.26f, 0.793f, 2.94f, 0.948f, 4.418f, 0.004f)
                curveToRelative(0.186f, 0.417f, 0.293f, 0.893f, 0.293f, 1.397f)
                curveToRelative(0.0f, 1.71f, -1.186f, 3.0f, -2.51f, 3.0f)
                curveToRelative(-1.318f, 0.0f, -2.49f, -1.286f, -2.49f, -3.0f)
                curveToRelative(0.0f, -0.505f, 0.105f, -0.983f, 0.29f, -1.4f)
                moveTo(9.0f, 6.025f)
                verticalLineToRelative(1.913f)
                curveToRelative(-0.196f, 0.374f, -0.34f, 0.786f, -0.422f, 1.222f)
                lineTo(8.0f, 8.12f)
                lineTo(8.0f, 5.692f)
                close()
                moveTo(10.0f, 6.357f)
                verticalLineToRelative(1.16f)
                curveToRelative(1.077f, 0.877f, 2.672f, 1.077f, 4.0f, 0.0f)
                verticalLineToRelative(-1.16f)
                lineToRelative(-1.843f, 0.613f)
                lineTo(12.0f, 7.02f)
                lineToRelative(-0.157f, -0.051f)
                close()
                moveTo(9.083f, 5.0f)
                lineTo(12.0f, 5.968f)
                lineToRelative(2.916f, -0.969f)
                lineTo(12.0f, 4.027f)
                close()
                moveTo(7.5f, 9.28f)
                lineToRelative(0.4f, 0.72f)
                horizontalLineToRelative(-0.8f)
                close()
            }
        }
        .build()
        return _userHatSmall!!
    }

private var _userHatSmall: ImageVector? = null
