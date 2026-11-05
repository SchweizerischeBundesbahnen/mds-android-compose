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

public val SBBIcons.LocomotiveViaductMedium: ImageVector
    get() {
        if (_locomotiveViaductMedium != null) {
            return _locomotiveViaductMedium!!
        }
        _locomotiveViaductMedium = Builder(
            name = "LocomotiveViaductMedium",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(8.25f, 3.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(0.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.03f, 1.75f)
                lineTo(3.0f, 15.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.78f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.03f, -1.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(3.238f)
                lineToRelative(-0.274f, -0.686f)
                lineToRelative(-1.464f, -3.66f)
                lineTo(26.75f, 6.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.0f)
                moveToRelative(14.03f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.03f, -1.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.03f, 1.75f)
                close()
                moveTo(16.28f, 15.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.03f, -1.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.03f, 1.75f)
                close()
                moveTo(22.25f, 13.5f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                moveToRelative(-4.0f, -0.25f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                close()
                moveTo(10.25f, 13.5f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                moveToRelative(12.0f, -7.25f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(8.75f, 6.75f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(1.846f)
                lineToRelative(0.036f, 0.09f)
                lineToRelative(1.226f, 3.064f)
                lineTo(8.75f, 12.25f)
                close()
                moveTo(13.25f, 31.75f)
                lineTo(13.25f, 25.5f)
                arcTo(4.74f, 4.74f, 0.0f, false, true, 18.0f, 20.75f)
                arcToRelative(4.74f, 4.74f, 0.0f, false, true, 4.75f, 4.75f)
                verticalLineToRelative(6.25f)
                close()
                moveTo(12.25f, 31.75f)
                lineTo(12.25f, 25.5f)
                curveToRelative(0.0f, -3.19f, 2.575f, -5.75f, 5.75f, -5.75f)
                reflectiveCurveToRelative(5.75f, 2.56f, 5.75f, 5.75f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(3.5f)
                lineTo(27.25f, 25.5f)
                curveToRelative(0.0f, -3.19f, 2.575f, -5.75f, 5.75f, -5.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.74f, 4.74f, 0.0f, false, false, -4.75f, 4.75f)
                verticalLineToRelative(6.25f)
                lineTo(33.0f, 31.75f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.75f)
                lineTo(7.75f, 25.5f)
                arcTo(4.74f, 4.74f, 0.0f, false, false, 3.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                curveToRelative(3.175f, 0.0f, 5.75f, 2.56f, 5.75f, 5.75f)
                verticalLineToRelative(6.25f)
                close()
            }
        }
            .build()
        return _locomotiveViaductMedium!!
    }

private var _locomotiveViaductMedium: ImageVector? = null
