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

public val SBBIcons.MarketShoppingBagSmall: ImageVector
    get() {
        if (_marketShoppingBagSmall != null) {
            return _marketShoppingBagSmall!!
        }
        _marketShoppingBagSmall = Builder(
            name = "MarketShoppingBagSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(3.5f, 4.0f)
                horizontalLineToRelative(-0.36f)
                lineToRelative(-0.114f, 0.342f)
                lineToRelative(-1.0f, 3.0f)
                lineToRelative(-0.22f, 0.658f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.0f, 1.732f)
                lineTo(3.0f, 20.0f)
                horizontalLineToRelative(11.0f)
                lineTo(14.0f, 9.733f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.0f, -1.732f)
                lineTo(15.0f, 8.0f)
                horizontalLineToRelative(0.194f)
                lineToRelative(-0.22f, -0.658f)
                lineToRelative(-1.0f, -3.0f)
                lineTo(13.86f, 4.0f)
                lineTo(3.5f, 4.0f)
                moveTo(14.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(11.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                verticalLineToRelative(0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(8.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(3.194f, 7.0f)
                lineToRelative(0.666f, -2.0f)
                horizontalLineToRelative(9.28f)
                lineToRelative(0.666f, 2.0f)
                close()
                moveTo(11.5f, 9.324f)
                curveToRelative(0.367f, 0.415f, 0.903f, 0.677f, 1.5f, 0.677f)
                lineTo(13.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                lineTo(4.0f, 10.0f)
                curveToRelative(0.597f, 0.0f, 1.134f, -0.262f, 1.5f, -0.677f)
                curveToRelative(0.367f, 0.415f, 0.903f, 0.677f, 1.5f, 0.677f)
                reflectiveCurveToRelative(1.134f, -0.262f, 1.5f, -0.677f)
                curveToRelative(0.367f, 0.415f, 0.903f, 0.677f, 1.5f, 0.677f)
                curveToRelative(0.598f, 0.0f, 1.134f, -0.262f, 1.5f, -0.677f)
                moveTo(15.54f, 13.0f)
                lineTo(17.0f, 13.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.46f)
                lineToRelative(0.038f, 0.459f)
                lineToRelative(0.5f, 6.0f)
                lineToRelative(0.046f, 0.541f)
                horizontalLineToRelative(-7.087f)
                lineToRelative(0.045f, -0.541f)
                lineToRelative(0.5f, -6.0f)
                close()
                moveTo(19.0f, 13.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(16.46f, 14.0f)
                lineTo(16.044f, 19.0f)
                horizontalLineToRelative(4.913f)
                lineToRelative(-0.417f, -5.0f)
                close()
            }
        }
            .build()
        return _marketShoppingBagSmall!!
    }

private var _marketShoppingBagSmall: ImageVector? = null
