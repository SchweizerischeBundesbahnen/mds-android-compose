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
                moveToRelative(12.0f, 2.973f)
                lineToRelative(0.158f, 0.053f)
                lineToRelative(4.5f, 1.5f)
                lineTo(18.083f, 5.0f)
                lineToRelative(-1.425f, 0.473f)
                lineTo(15.0f, 6.025f)
                verticalLineToRelative(1.921f)
                curveToRelative(0.319f, 0.605f, 0.5f, 1.31f, 0.5f, 2.053f)
                curveToRelative(0.0f, 0.946f, -0.3f, 1.849f, -0.813f, 2.556f)
                curveTo(17.37f, 13.927f, 19.0f, 17.085f, 19.0f, 20.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-13.0f, -0.006f)
                lineTo(5.0f, 20.994f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.707f, 1.711f, -6.659f, 4.308f, -7.937f)
                arcTo(4.3f, 4.3f, 0.0f, false, true, 8.613f, 11.0f)
                lineTo(5.4f, 11.0f)
                lineToRelative(0.413f, -0.743f)
                lineTo(7.0f, 8.12f)
                lineTo(7.0f, 5.36f)
                lineTo(5.916f, 5.0f)
                lineToRelative(1.426f, -0.474f)
                lineToRelative(4.5f, -1.5f)
                close()
                moveTo(10.04f, 13.32f)
                curveToRelative(-2.231f, 0.948f, -3.877f, 3.37f, -4.028f, 6.674f)
                lineToRelative(11.976f, 0.004f)
                curveToRelative(-0.156f, -3.05f, -1.73f, -5.66f, -4.031f, -6.684f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, true, -3.917f, 0.007f)
                moveTo(9.79f, 8.6f)
                curveToRelative(1.26f, 0.793f, 2.94f, 0.948f, 4.418f, 0.003f)
                curveToRelative(0.186f, 0.418f, 0.293f, 0.894f, 0.293f, 1.397f)
                curveToRelative(0.0f, 1.71f, -1.186f, 3.0f, -2.51f, 3.0f)
                curveToRelative(-1.319f, 0.0f, -2.49f, -1.286f, -2.49f, -3.0f)
                curveToRelative(0.0f, -0.505f, 0.105f, -0.982f, 0.29f, -1.4f)
                moveTo(9.0f, 7.749f)
                verticalLineToRelative(0.188f)
                curveToRelative(-0.197f, 0.375f, -0.34f, 0.787f, -0.422f, 1.224f)
                lineTo(8.0f, 8.12f)
                lineTo(8.0f, 5.692f)
                lineToRelative(1.0f, 0.332f)
                close()
                moveTo(10.0f, 6.357f)
                verticalLineToRelative(1.165f)
                curveToRelative(1.077f, 0.874f, 2.674f, 1.072f, 4.0f, -0.002f)
                lineTo(14.0f, 6.357f)
                lineToRelative(-1.842f, 0.612f)
                lineToRelative(-0.158f, 0.053f)
                lineToRelative(-0.158f, -0.053f)
                close()
                moveTo(9.084f, 5.0f)
                lineTo(12.0f, 5.97f)
                lineToRelative(2.916f, -0.97f)
                lineTo(12.0f, 4.027f)
                close()
                moveTo(7.5f, 9.28f)
                lineToRelative(0.4f, 0.721f)
                horizontalLineToRelative(-0.8f)
                close()
            }
        }
        .build()
        return _userHatSmall!!
    }

private var _userHatSmall: ImageVector? = null
