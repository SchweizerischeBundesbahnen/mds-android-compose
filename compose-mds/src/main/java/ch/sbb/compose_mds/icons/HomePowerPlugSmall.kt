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
                moveToRelative(15.647f, 11.353f)
                lineToRelative(0.707f, -0.707f)
                lineTo(9.0f, 3.293f)
                lineToRelative(-7.354f, 7.353f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(0.646f, -0.646f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(4.99f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.422f, 0.0f, 0.64f, 0.103f, 0.76f, 0.224f)
                curveToRelative(0.108f, 0.108f, 0.203f, 0.297f, 0.232f, 0.634f)
                lineToRelative(0.008f, 0.153f)
                verticalLineToRelative(1.019f)
                curveToRelative(0.0f, 0.248f, 0.0f, 0.703f, 0.161f, 1.101f)
                curveToRelative(0.089f, 0.22f, 0.234f, 0.446f, 0.47f, 0.615f)
                curveToRelative(0.24f, 0.17f, 0.534f, 0.254f, 0.869f, 0.254f)
                curveToRelative(0.333f, 0.0f, 0.626f, -0.081f, 0.866f, -0.248f)
                curveToRelative(0.239f, -0.167f, 0.385f, -0.39f, 0.475f, -0.61f)
                curveToRelative(0.126f, -0.312f, 0.153f, -0.658f, 0.158f, -0.918f)
                lineToRelative(0.001f, -0.227f)
                verticalLineTo(14.95f)
                curveToRelative(1.14f, -0.232f, 2.0f, -1.241f, 2.0f, -2.45f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.209f, 0.86f, 2.218f, 2.0f, 2.45f)
                verticalLineToRelative(3.053f)
                curveToRelative(0.002f, 0.29f, -0.005f, 0.563f, -0.086f, 0.762f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, true, -0.12f, 0.166f)
                curveToRelative(-0.041f, 0.03f, -0.125f, 0.069f, -0.294f, 0.069f)
                curveToRelative(-0.165f, 0.0f, -0.247f, -0.04f, -0.288f, -0.069f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.123f, -0.174f)
                curveToRelative(-0.062f, -0.153f, -0.08f, -0.346f, -0.086f, -0.55f)
                lineTo(18.0f, 17.999f)
                verticalLineToRelative(-1.011f)
                curveToRelative(-0.013f, -0.572f, -0.158f, -1.093f, -0.53f, -1.468f)
                curveToRelative(-0.374f, -0.377f, -0.894f, -0.52f, -1.47f, -0.52f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.293f)
                close()
                moveTo(14.0f, 9.707f)
                lineToRelative(-5.0f, -5.0f)
                lineToRelative(-5.0f, 5.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(2.99f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(18.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _homePowerPlugSmall!!
    }

private var _homePowerPlugSmall: ImageVector? = null
