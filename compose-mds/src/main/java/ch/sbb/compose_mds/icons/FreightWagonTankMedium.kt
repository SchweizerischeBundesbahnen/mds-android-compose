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

public val SBBIcons.FreightWagonTankMedium: ImageVector
    get() {
        if (_freightWagonTankMedium != null) {
            return _freightWagonTankMedium!!
        }
        _freightWagonTankMedium = Builder(name = "FreightWagonTankMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 11.75f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(11.75f, 13.25f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.5f, 4.5f)
                horizontalLineToRelative(12.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, -4.5f)
                close()
                moveTo(27.413f, 22.75f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 2.337f, -4.5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.5f, -5.5f)
                horizontalLineToRelative(-12.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.86f, 0.923f, 3.505f, 2.337f, 4.5f)
                lineTo(6.25f, 22.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.25f, 22.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(3.25f, 27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                lineTo(7.75f, 27.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 5.5f, 0.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(9.5f)
                lineTo(22.75f, 27.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 5.5f, 0.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(2.0f)
                lineTo(31.75f, 27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2.337f)
                moveTo(8.75f, 27.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(3.5f)
                lineTo(12.25f, 27.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -3.5f, 0.0f)
                moveToRelative(15.5f, -3.25f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(27.25f, 26.75f)
                horizontalLineToRelative(-3.5f)
                lineTo(23.75f, 27.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                close()
            }
        }
        .build()
        return _freightWagonTankMedium!!
    }

private var _freightWagonTankMedium: ImageVector? = null
