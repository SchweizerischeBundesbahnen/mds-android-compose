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
                curveToRelative(0.427f, 0.15f, 0.765f, 0.489f, 0.916f, 0.915f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.618f)
                lineToRelative(-0.053f, 0.106f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-0.138f, 0.276f)
                horizontalLineToRelative(-5.923f)
                curveToRelative(-0.175f, 1.072f, -0.52f, 1.886f, -0.969f, 2.495f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -1.746f, 1.317f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -1.737f, 0.247f)
                lineTo(9.0f, 18.535f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.466f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-0.031f)
                lineToRelative(0.004f, -0.031f)
                lineToRelative(0.93f, -7.438f)
                horizontalLineTo(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(1.085f)
                curveToRelative(0.206f, -0.582f, 0.762f, -1.0f, 1.415f, -1.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(12.871f, 11.0f)
                horizontalLineToRelative(-2.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-0.475f, 0.0f, -0.911f, -0.165f, -1.254f, -0.442f)
                lineToRelative(-0.189f, 1.506f)
                lineToRelative(0.05f, 0.002f)
                curveToRelative(0.328f, 0.008f, 0.768f, -0.028f, 1.218f, -0.193f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 1.287f, -0.973f)
                curveToRelative(0.319f, -0.432f, 0.598f, -1.04f, 0.758f, -1.9f)
                moveTo(4.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(0.001f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(4.0f, 9.501f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(15.691f)
                lineToRelative(-0.5f, 1.0f)
                horizontalLineTo(9.059f)
                lineToRelative(-0.055f, 0.438f)
                lineToRelative(-1.0f, 8.001f)
                lineToRelative(-0.004f, 0.03f)
                verticalLineToRelative(0.032f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.474f)
                lineToRelative(0.996f, -7.965f)
                lineToRelative(0.07f, -0.563f)
                lineTo(5.5f, 10.0f)
                lineToRelative(-1.0f, 0.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
            }
        }
        .build()
        return _gunSmall!!
    }

private var _gunSmall: ImageVector? = null
