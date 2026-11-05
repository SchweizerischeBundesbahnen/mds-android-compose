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
        _wheelchairPartiallySmall = Builder(
            name = "WheelchairPartiallySmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
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
                moveTo(1.9f, 12.0f)
                curveToRelative(0.0f, -3.412f, 1.037f, -5.913f, 2.395f, -7.793f)
                lineToRelative(0.81f, 0.586f)
                curveTo(3.863f, 6.513f, 2.9f, 8.81f, 2.9f, 12.0f)
                curveToRelative(0.0f, 3.182f, 0.96f, 5.387f, 2.213f, 7.217f)
                lineToRelative(-0.825f, 0.565f)
                curveTo(2.94f, 17.815f, 1.9f, 15.417f, 1.9f, 12.0f)
                moveToRelative(4.102f, 2.497f)
                curveToRelative(0.0f, -1.748f, 1.01f, -3.269f, 2.471f, -4.012f)
                lineToRelative(0.454f, 0.891f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, -1.925f, 3.121f)
                curveToRelative(0.0f, 1.924f, 1.578f, 3.5f, 3.5f, 3.5f)
                arcToRelative(3.52f, 3.52f, 0.0f, false, false, 3.168f, -2.016f)
                lineToRelative(0.904f, 0.427f)
                arcToRelative(4.51f, 4.51f, 0.0f, false, true, -4.072f, 2.59f)
                arcToRelative(4.513f, 4.513f, 0.0f, false, true, -4.5f, -4.5f)
                moveTo(21.901f, 12.0f)
                curveToRelative(0.0f, -3.418f, -1.041f, -5.814f, -2.389f, -7.783f)
                lineToRelative(-0.825f, 0.565f)
                curveToRelative(1.254f, 1.832f, 2.214f, 4.035f, 2.214f, 7.218f)
                curveToRelative(0.0f, 3.188f, -0.963f, 5.487f, -2.207f, 7.207f)
                lineToRelative(0.81f, 0.586f)
                curveToRelative(1.36f, -1.88f, 2.397f, -4.382f, 2.397f, -7.793f)
                moveTo(10.0f, 13.5f)
                lineTo(10.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
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
