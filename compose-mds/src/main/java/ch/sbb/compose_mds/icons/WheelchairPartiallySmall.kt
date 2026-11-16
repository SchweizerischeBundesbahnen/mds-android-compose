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

public val SBBIcons.WheelchairPartiallySmall: ImageVector
    get() {
        if (_wheelchairPartiallySmall != null) {
            return _wheelchairPartiallySmall!!
        }
        _wheelchairPartiallySmall = Builder(name = "WheelchairPartiallySmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.9f, 12.0f)
                curveToRelative(0.0f, -3.412f, 1.037f, -5.913f, 2.395f, -7.793f)
                lineToRelative(0.81f, 0.586f)
                curveTo(3.863f, 6.513f, 2.9f, 8.81f, 2.9f, 12.0f)
                curveToRelative(0.0f, 3.182f, 0.96f, 5.387f, 2.213f, 7.218f)
                lineToRelative(-0.825f, 0.564f)
                curveTo(2.94f, 17.815f, 1.9f, 15.417f, 1.9f, 12.0f)
                moveToRelative(4.102f, 2.498f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, true, 2.472f, -4.013f)
                lineToRelative(0.453f, 0.89f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, -1.925f, 3.123f)
                curveToRelative(0.0f, 1.923f, 1.578f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.391f, 0.0f, 2.605f, -0.826f, 3.168f, -2.017f)
                lineToRelative(0.905f, 0.427f)
                arcToRelative(4.52f, 4.52f, 0.0f, false, true, -4.073f, 2.59f)
                arcToRelative(4.513f, 4.513f, 0.0f, false, true, -4.5f, -4.5f)
                moveToRelative(12.686f, -9.716f)
                curveTo(19.942f, 6.614f, 20.9f, 8.817f, 20.9f, 12.0f)
                curveToRelative(0.0f, 3.188f, -0.963f, 5.487f, -2.206f, 7.207f)
                lineToRelative(0.81f, 0.586f)
                curveTo(20.865f, 17.913f, 21.9f, 15.41f, 21.9f, 12.0f)
                curveToRelative(0.0f, -3.418f, -1.04f, -5.814f, -2.388f, -7.782f)
                close()
                moveTo(11.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(10.0f, 8.0f)
                close()
                moveTo(10.5f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _wheelchairPartiallySmall!!
    }

private var _wheelchairPartiallySmall: ImageVector? = null
