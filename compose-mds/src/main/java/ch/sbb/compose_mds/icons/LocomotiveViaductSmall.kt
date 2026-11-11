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

public val SBBIcons.LocomotiveViaductSmall: ImageVector
    get() {
        if (_locomotiveViaductSmall != null) {
            return _locomotiveViaductSmall!!
        }
        _locomotiveViaductSmall = Builder(name = "LocomotiveViaductSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(11.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.384f, 0.144f, 0.735f, 0.382f, 1.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.382f)
                curveToRelative(0.238f, -0.265f, 0.382f, -0.616f, 0.382f, -1.0f)
                horizontalLineToRelative(2.238f)
                lineToRelative(-0.274f, -0.686f)
                lineTo(18.0f, 5.904f)
                lineTo(18.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(14.382f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 0.384f, -0.144f, 0.735f, -0.382f, 1.0f)
                close()
                moveTo(10.382f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                curveToRelative(0.0f, 0.384f, -0.144f, 0.735f, -0.382f, 1.0f)
                close()
                moveTo(15.5f, 9.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                moveTo(11.0f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                close()
                moveTo(7.5f, 9.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(17.762f, 8.0f)
                lineTo(6.0f, 8.0f)
                lineTo(6.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.097f)
                lineToRelative(0.036f, 0.089f)
                close()
                moveTo(9.0f, 21.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.665f, -1.342f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.335f, -3.0f, 3.0f)
                close()
                moveTo(16.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.219f, 1.792f, -4.0f, 4.0f, -4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.658f, 0.0f, -3.0f, 1.335f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.665f, -1.342f, -3.0f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(2.208f, 0.0f, 4.0f, 1.781f, 4.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.219f, 1.792f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.781f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _locomotiveViaductSmall!!
    }

private var _locomotiveViaductSmall: ImageVector? = null
