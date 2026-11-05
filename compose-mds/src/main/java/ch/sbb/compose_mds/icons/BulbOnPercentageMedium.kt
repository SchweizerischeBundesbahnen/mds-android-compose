package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.BulbOnPercentageMedium: ImageVector
    get() {
        if (_bulbOnPercentageMedium != null) {
            return _bulbOnPercentageMedium!!
        }
        _bulbOnPercentageMedium = Builder(
            name = "BulbOnPercentageMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveToRelative(31.874f, 18.473f)
                lineToRelative(-10.5f, 11.812f)
                lineToRelative(-0.747f, -0.664f)
                lineToRelative(10.5f, -11.812f)
                close()
                moveTo(29.25f, 25.797f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                moveTo(15.002f, 10.75f)
                arcToRelative(7.22f, 7.22f, 0.0f, false, true, 7.063f, 5.6f)
                lineToRelative(-0.974f, 0.223f)
                arcTo(6.22f, 6.22f, 0.0f, false, false, 15.0f, 11.75f)
                arcTo(6.22f, 6.22f, 0.0f, false, false, 8.752f, 18.0f)
                curveToRelative(0.0f, 2.306f, 1.336f, 4.364f, 3.24f, 5.5f)
                horizontalLineToRelative(7.259f)
                verticalLineToRelative(4.005f)
                lineToRelative(-0.335f, 0.117f)
                lineToRelative(-2.665f, 0.932f)
                verticalLineToRelative(1.196f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.196f)
                lineToRelative(-2.665f, -0.932f)
                lineToRelative(-0.335f, -0.117f)
                verticalLineToRelative(-3.639f)
                curveTo(8.968f, 22.51f, 7.752f, 20.386f, 7.752f, 18.0f)
                arcToRelative(7.22f, 7.22f, 0.0f, false, true, 7.25f, -7.25f)
                moveTo(29.25f, 26.797f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-17.5f, -0.002f)
                lineToRelative(2.665f, 0.933f)
                lineToRelative(0.335f, 0.118f)
                verticalLineToRelative(0.904f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.904f)
                lineToRelative(0.335f, -0.117f)
                lineToRelative(2.665f, -0.934f)
                lineTo(18.25f, 24.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(6.786f, 23.315f)
                lineTo(4.821f, 24.485f)
                lineTo(4.309f, 23.626f)
                lineTo(6.275f, 22.456f)
                close()
                moveTo(23.25f, 18.297f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveTo(5.252f, 18.5f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.25f)
                close()
                moveTo(6.858f, 12.8f)
                lineTo(6.318f, 13.64f)
                lineTo(4.396f, 12.405f)
                lineTo(4.937f, 11.565f)
                close()
                moveTo(25.508f, 12.364f)
                lineTo(23.585f, 13.426f)
                lineTo(23.101f, 12.55f)
                lineTo(25.026f, 11.488f)
                close()
                moveTo(10.574f, 9.274f)
                lineTo(9.698f, 9.754f)
                lineTo(8.635f, 7.821f)
                lineTo(9.511f, 7.34f)
                close()
                moveTo(21.358f, 7.815f)
                lineTo(20.305f, 9.746f)
                lineTo(19.427f, 9.268f)
                lineTo(20.48f, 7.337f)
                close()
                moveTo(15.5f, 8.25f)
                horizontalLineToRelative(-1.0f)
                lineTo(14.5f, 6.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _bulbOnPercentageMedium!!
    }

private var _bulbOnPercentageMedium: ImageVector? = null
