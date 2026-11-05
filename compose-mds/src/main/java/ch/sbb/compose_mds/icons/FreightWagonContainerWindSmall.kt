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

public val SBBIcons.FreightWagonContainerWindSmall: ImageVector
    get() {
        if (_freightWagonContainerWindSmall != null) {
            return _freightWagonContainerWindSmall!!
        }
        _freightWagonContainerWindSmall = Builder(
            name = "FreightWagonContainerWindSmall",
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
                pathFillType = NonZero,
            ) {
                moveTo(12.0f, 18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 1.106f, -0.894f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.894f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 20.0f)
                curveToRelative(0.0f, 0.554f, 0.446f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.446f, 1.0f, -1.0f)
                close()
                moveTo(21.0f, 7.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(14.0f, 6.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(7.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(5.0f, 12.0f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(8.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
            .build()
        return _freightWagonContainerWindSmall!!
    }

private var _freightWagonContainerWindSmall: ImageVector? = null
