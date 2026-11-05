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

public val SBBIcons.FreightWagonContainerWindMedium: ImageVector
    get() {
        if (_freightWagonContainerWindMedium != null) {
            return _freightWagonContainerWindMedium!!
        }
        _freightWagonContainerWindMedium = Builder(name = "FreightWagonContainerWindMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 27.25f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                lineTo(31.5f, 25.75f)
                verticalLineToRelative(1.0f)
                lineTo(20.75f, 26.75f)
                verticalLineToRelative(2.0f)
                lineTo(31.5f, 28.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.75f)
                lineTo(26.75f, 30.0f)
                arcTo(2.747f, 2.747f, 0.0f, false, true, 24.0f, 32.75f)
                arcTo(2.747f, 2.747f, 0.0f, false, true, 21.25f, 30.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.75f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(22.25f, 30.0f)
                curveToRelative(0.0f, 0.969f, 0.781f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.781f, 1.75f, -1.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(31.5f, 10.25f)
                horizontalLineToRelative(-9.25f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(9.25f)
                verticalLineToRelative(1.0f)
                lineTo(21.25f, 23.75f)
                lineTo(21.25f, 9.25f)
                lineTo(31.5f, 9.25f)
                close()
                moveTo(10.5f, 22.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.5f, 22.25f)
                lineTo(12.0f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(7.5f, 17.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(18.0f, 17.75f)
                lineTo(9.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(12.0f, 13.25f)
                lineTo(9.0f, 13.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.5f, 13.25f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _freightWagonContainerWindMedium!!
    }

private var _freightWagonContainerWindMedium: ImageVector? = null
