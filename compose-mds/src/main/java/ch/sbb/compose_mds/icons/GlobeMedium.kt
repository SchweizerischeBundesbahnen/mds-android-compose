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

public val SBBIcons.GlobeMedium: ImageVector
    get() {
        if (_globeMedium != null) {
            return _globeMedium!!
        }
        _globeMedium = Builder(
            name = "GlobeMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(4.75f, 18.0f)
                curveToRelative(0.0f, -5.972f, 4.189f, -10.966f, 9.788f, -12.205f)
                lineToRelative(0.04f, -0.063f)
                lineToRelative(0.064f, 0.04f)
                arcTo(12.6f, 12.6f, 0.0f, false, true, 17.25f, 5.5f)
                curveToRelative(0.894f, 0.0f, 1.766f, 0.094f, 2.607f, 0.272f)
                lineToRelative(0.065f, -0.04f)
                lineToRelative(0.04f, 0.063f)
                curveToRelative(5.6f, 1.239f, 9.788f, 6.233f, 9.788f, 12.205f)
                reflectiveCurveToRelative(-4.189f, 10.966f, -9.788f, 12.205f)
                lineToRelative(-0.04f, 0.063f)
                lineToRelative(-0.064f, -0.04f)
                curveToRelative(-0.841f, 0.178f, -1.714f, 0.272f, -2.608f, 0.272f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, -2.608f, -0.272f)
                lineToRelative(-0.064f, 0.04f)
                lineToRelative(-0.04f, -0.063f)
                curveTo(8.938f, 28.966f, 4.75f, 23.972f, 4.75f, 18.0f)
                moveToRelative(23.534f, 3.25f)
                curveToRelative(0.303f, -1.03f, 0.466f, -2.122f, 0.466f, -3.25f)
                reflectiveCurveToRelative(-0.163f, -2.22f, -0.466f, -3.25f)
                horizontalLineToRelative(-5.462f)
                curveTo(22.939f, 15.8f, 23.0f, 16.887f, 23.0f, 18.0f)
                curveToRelative(0.0f, 1.111f, -0.061f, 2.199f, -0.178f, 3.25f)
                close()
                moveTo(27.939f, 22.25f)
                horizontalLineToRelative(-5.247f)
                curveToRelative(-0.377f, 2.547f, -1.087f, 4.85f, -2.044f, 6.74f)
                arcToRelative(11.53f, 11.53f, 0.0f, false, false, 7.291f, -6.74f)
                moveToRelative(-6.123f, -1.0f)
                curveToRelative(0.12f, -1.046f, 0.184f, -2.134f, 0.184f, -3.25f)
                curveToRelative(0.0f, -1.118f, -0.064f, -2.205f, -0.184f, -3.25f)
                horizontalLineToRelative(-9.131f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 12.5f, 18.0f)
                curveToRelative(0.0f, 1.117f, 0.064f, 2.204f, 0.184f, 3.25f)
                close()
                moveTo(12.819f, 22.25f)
                horizontalLineToRelative(8.862f)
                curveToRelative(-0.425f, 2.763f, -1.254f, 5.193f, -2.347f, 7.062f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, -4.168f, 0.0f)
                curveToRelative(-1.093f, -1.868f, -1.921f, -4.299f, -2.347f, -7.062f)
                moveToRelative(-1.14f, -1.0f)
                arcTo(29.0f, 29.0f, 0.0f, false, true, 11.5f, 18.0f)
                curveToRelative(0.0f, -1.112f, 0.061f, -2.2f, 0.178f, -3.25f)
                lineTo(6.216f, 14.75f)
                arcTo(11.5f, 11.5f, 0.0f, false, false, 5.75f, 18.0f)
                curveToRelative(0.0f, 1.128f, 0.163f, 2.22f, 0.466f, 3.25f)
                close()
                moveTo(6.561f, 22.25f)
                horizontalLineToRelative(5.247f)
                curveToRelative(0.377f, 2.547f, 1.087f, 4.85f, 2.044f, 6.74f)
                arcToRelative(11.53f, 11.53f, 0.0f, false, true, -7.291f, -6.74f)
                moveTo(20.648f, 7.01f)
                arcToRelative(11.53f, 11.53f, 0.0f, false, true, 7.29f, 6.74f)
                horizontalLineToRelative(-5.246f)
                curveToRelative(-0.377f, -2.547f, -1.086f, -4.85f, -2.044f, -6.74f)
                moveToRelative(-1.313f, -0.321f)
                curveToRelative(1.092f, 1.866f, 1.92f, 4.297f, 2.346f, 7.06f)
                lineTo(12.82f, 13.749f)
                curveToRelative(0.426f, -2.763f, 1.254f, -5.193f, 2.347f, -7.06f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, 4.169f, 0.0f)
                moveToRelative(-5.483f, 0.321f)
                curveToRelative(-0.957f, 1.89f, -1.667f, 4.193f, -2.044f, 6.74f)
                lineTo(6.56f, 13.75f)
                arcToRelative(11.53f, 11.53f, 0.0f, false, true, 7.291f, -6.74f)
            }
        }
            .build()
        return _globeMedium!!
    }

private var _globeMedium: ImageVector? = null
