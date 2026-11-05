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

public val SBBIcons.IdCardEmployeeSmall: ImageVector
    get() {
        if (_idCardEmployeeSmall != null) {
            return _idCardEmployeeSmall!!
        }
        _idCardEmployeeSmall = Builder(
            name = "IdCardEmployeeSmall",
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
                moveTo(12.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 22.0f, 8.5f)
                verticalLineToRelative(9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.0f, 17.5f)
                verticalLineToRelative(-9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 6.0f)
                lineTo(10.0f, 6.0f)
                close()
                moveTo(14.0f, 7.5f)
                lineTo(14.0f, 7.0f)
                horizontalLineToRelative(5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 8.5f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-6.575f)
                curveToRelative(-0.231f, -1.846f, -1.094f, -3.457f, -2.351f, -4.325f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 11.0f, 13.0f)
                curveToRelative(0.0f, -1.547f, -1.022f, -3.0f, -2.5f, -3.0f)
                reflectiveCurveTo(6.0f, 11.453f, 6.0f, 13.0f)
                curveToRelative(0.0f, 0.599f, 0.153f, 1.184f, 0.426f, 1.675f)
                curveToRelative(-1.244f, 0.859f, -2.101f, 2.444f, -2.344f, 4.266f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 17.5f)
                verticalLineToRelative(-9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 7.0f)
                lineTo(10.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(5.083f, 19.0f)
                horizontalLineToRelative(6.834f)
                curveToRelative(-0.232f, -1.618f, -1.002f, -2.904f, -1.974f, -3.543f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 8.5f, 16.0f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -1.443f, -0.543f)
                curveToRelative(-0.972f, 0.639f, -1.742f, 1.925f, -1.974f, 3.543f)
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(7.0f, 13.0f)
                curveToRelative(0.0f, -1.215f, 0.77f, -2.0f, 1.5f, -2.0f)
                reflectiveCurveToRelative(1.5f, 0.785f, 1.5f, 2.0f)
                reflectiveCurveToRelative(-0.77f, 2.0f, -1.5f, 2.0f)
                reflectiveCurveTo(7.0f, 14.215f, 7.0f, 13.0f)
            }
        }
            .build()
        return _idCardEmployeeSmall!!
    }

private var _idCardEmployeeSmall: ImageVector? = null
