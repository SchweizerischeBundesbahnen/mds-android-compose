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

public val SBBIcons.FreightWagonContainerMedium: ImageVector
    get() {
        if (_freightWagonContainerMedium != null) {
            return _freightWagonContainerMedium!!
        }
        _freightWagonContainerMedium = Builder(name = "FreightWagonContainerMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.25f, 23.75f)
                lineTo(28.25f, 9.25f)
                lineTo(7.75f, 9.25f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(27.25f, 22.75f)
                lineTo(8.75f, 22.75f)
                verticalLineToRelative(-12.5f)
                horizontalLineToRelative(18.5f)
                close()
                moveTo(13.25f, 29.75f)
                horizontalLineToRelative(9.5f)
                lineTo(22.75f, 30.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 5.5f, 0.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                lineTo(31.75f, 30.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                lineTo(6.25f, 25.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.25f, 25.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(3.25f, 30.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                lineTo(7.75f, 30.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 5.5f, 0.0f)
                close()
                moveTo(12.25f, 29.75f)
                horizontalLineToRelative(-3.5f)
                lineTo(8.75f, 30.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                close()
                moveTo(27.25f, 30.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-3.5f)
                lineTo(23.75f, 30.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                moveToRelative(-20.0f, -1.25f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-2.0f)
                lineTo(7.25f, 26.75f)
                close()
            }
        }
        .build()
        return _freightWagonContainerMedium!!
    }

private var _freightWagonContainerMedium: ImageVector? = null
