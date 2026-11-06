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

public val SBBIcons.HomePowerPlugSmall: ImageVector
    get() {
        if (_homePowerPlugSmall != null) {
            return _homePowerPlugSmall!!
        }
        _homePowerPlugSmall = Builder(name = "HomePowerPlugSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.354f, 3.646f)
                lineTo(9.0f, 3.292f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-7.0f, 7.0f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(0.646f, -0.646f)
                lineTo(3.0f, 19.0f)
                horizontalLineToRelative(4.99f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(15.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.422f, 0.0f, 0.64f, 0.104f, 0.76f, 0.224f)
                curveToRelative(0.123f, 0.123f, 0.23f, 0.35f, 0.24f, 0.782f)
                verticalLineToRelative(1.022f)
                curveToRelative(0.0f, 0.248f, 0.0f, 0.704f, 0.162f, 1.103f)
                curveToRelative(0.088f, 0.22f, 0.233f, 0.446f, 0.47f, 0.615f)
                curveToRelative(0.24f, 0.17f, 0.533f, 0.254f, 0.868f, 0.254f)
                curveToRelative(0.333f, 0.0f, 0.626f, -0.08f, 0.866f, -0.248f)
                curveToRelative(0.239f, -0.166f, 0.385f, -0.39f, 0.475f, -0.61f)
                curveToRelative(0.163f, -0.403f, 0.16f, -0.865f, 0.16f, -1.123f)
                lineTo(20.0f, 18.0f)
                verticalLineToRelative(-3.05f)
                curveToRelative(1.14f, -0.231f, 2.0f, -1.24f, 2.0f, -2.45f)
                lineTo(22.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.21f, 0.86f, 2.219f, 2.0f, 2.45f)
                verticalLineToRelative(3.053f)
                curveToRelative(0.002f, 0.29f, -0.004f, 0.563f, -0.085f, 0.763f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, -0.12f, 0.166f)
                curveToRelative(-0.042f, 0.03f, -0.126f, 0.069f, -0.295f, 0.069f)
                curveToRelative(-0.165f, 0.0f, -0.247f, -0.04f, -0.288f, -0.07f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.123f, -0.172f)
                curveToRelative(-0.082f, -0.205f, -0.088f, -0.48f, -0.089f, -0.759f)
                verticalLineToRelative(-1.01f)
                curveToRelative(-0.013f, -0.573f, -0.158f, -1.095f, -0.53f, -1.47f)
                curveToRelative(-0.374f, -0.377f, -0.894f, -0.52f, -1.47f, -0.52f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.292f)
                lineToRelative(0.646f, 0.646f)
                lineToRelative(0.708f, -0.707f)
                close()
                moveTo(14.0f, 9.706f)
                lineToRelative(-5.0f, -5.0f)
                lineToRelative(-5.0f, 5.0f)
                lineTo(4.0f, 18.0f)
                horizontalLineToRelative(2.99f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                lineTo(14.0f, 18.0f)
                close()
                moveTo(18.0f, 12.5f)
                lineTo(18.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _homePowerPlugSmall!!
    }

private var _homePowerPlugSmall: ImageVector? = null
