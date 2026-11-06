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

public val SBBIcons.BridgeSmall: ImageVector
    get() {
        if (_bridgeSmall != null) {
            return _bridgeSmall!!
        }
        _bridgeSmall = Builder(name = "BridgeSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 7.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(2.0f, 9.02f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.188f)
                quadToRelative(-0.932f, 0.612f, -1.834f, 1.42f)
                lineToRelative(0.668f, 0.744f)
                curveTo(5.537f, 12.95f, 8.37f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(6.463f, 0.95f, 9.166f, 3.372f)
                lineToRelative(0.668f, -0.744f)
                arcTo(15.5f, 15.5f, 0.0f, false, false, 20.0f, 13.208f)
                lineTo(20.0f, 9.02f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 8.02f)
                close()
                moveTo(19.0f, 12.61f)
                lineTo(19.0f, 9.02f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.723f)
                quadToRelative(1.028f, 0.344f, 2.0f, 0.868f)
                moveToRelative(-3.0f, -1.158f)
                lineTo(16.0f, 9.02f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.082f)
                quadToRelative(1.034f, 0.11f, 2.0f, 0.35f)
                moveToRelative(-3.0f, -0.428f)
                lineTo(13.0f, 9.02f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.004f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 2.0f, 0.0f)
                moveToRelative(-3.0f, 0.078f)
                lineTo(10.0f, 9.02f)
                lineTo(8.0f, 9.02f)
                verticalLineToRelative(2.432f)
                quadToRelative(0.966f, -0.24f, 2.0f, -0.35f)
                moveToRelative(-3.0f, 0.641f)
                lineTo(7.0f, 9.02f)
                lineTo(5.0f, 9.02f)
                verticalLineToRelative(3.59f)
                curveToRelative(0.649f, -0.35f, 1.314f, -0.636f, 2.0f, -0.867f)
            }
        }
        .build()
        return _bridgeSmall!!
    }

private var _bridgeSmall: ImageVector? = null
