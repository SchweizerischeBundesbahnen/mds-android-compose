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

public val SBBIcons.GunSmall: ImageVector
    get() {
        if (_gunSmall != null) {
            return _gunSmall!!
        }
        _gunSmall = Builder(name = "GunSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 5.085f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.653f, 0.0f, -1.209f, 0.418f, -1.415f, 1.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.501f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(0.001f)
                lineTo(4.934f, 11.0f)
                lineToRelative(-0.93f, 7.44f)
                lineToRelative(-0.004f, 0.03f)
                verticalLineToRelative(0.031f)
                curveToRelative(0.0f, 0.83f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.81f, 0.0f, 1.47f, -0.642f, 1.497f, -1.447f)
                lineToRelative(0.437f, -3.495f)
                quadToRelative(0.07f, 0.004f, 0.15f, 0.006f)
                curveToRelative(0.414f, 0.01f, 0.987f, -0.032f, 1.587f, -0.253f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, false, 1.747f, -1.317f)
                curveToRelative(0.45f, -0.61f, 0.793f, -1.423f, 0.968f, -2.495f)
                horizontalLineToRelative(5.923f)
                lineToRelative(0.138f, -0.276f)
                lineTo(21.0f, 8.618f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-1.084f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 5.085f)
                moveToRelative(0.001f, 1.415f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(4.0f, 9.501f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(15.69f)
                lineToRelative(-0.499f, 1.0f)
                horizontalLineTo(9.06f)
                lineToRelative(-0.055f, 0.438f)
                lineToRelative(-1.0f, 8.001f)
                lineToRelative(-0.004f, 0.03f)
                verticalLineToRelative(0.032f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.499f, -0.482f)
                lineToRelative(0.995f, -7.957f)
                lineToRelative(0.07f, -0.563f)
                lineTo(5.5f, 10.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 9.501f)
                moveToRelative(5.558f, 4.563f)
                lineToRelative(0.05f, 0.002f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 1.218f, -0.194f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 1.287f, -0.971f)
                curveToRelative(0.32f, -0.432f, 0.598f, -1.041f, 0.758f, -1.901f)
                horizontalLineToRelative(-2.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.475f, 0.0f, -0.911f, -0.165f, -1.254f, -0.442f)
                close()
            }
        }
        .build()
        return _gunSmall!!
    }

private var _gunSmall: ImageVector? = null
