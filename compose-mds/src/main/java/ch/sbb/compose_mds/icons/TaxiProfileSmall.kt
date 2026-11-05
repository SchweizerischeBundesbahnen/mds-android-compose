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

public val SBBIcons.TaxiProfileSmall: ImageVector
    get() {
        if (_taxiProfileSmall != null) {
            return _taxiProfileSmall!!
        }
        _taxiProfileSmall = Builder(
            name = "TaxiProfileSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                moveTo(7.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.586f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                lineTo(18.207f, 10.0f)
                lineTo(20.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                lineTo(22.0f, 16.0f)
                horizontalLineToRelative(-3.05f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, -4.9f, 0.0f)
                horizontalLineToRelative(-5.1f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-5.124f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.371f, -0.988f)
                lineToRelative(2.954f, -3.376f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.454f, 6.0f)
                lineTo(7.0f, 6.0f)
                lineTo(7.0f, 4.0f)
                moveToRelative(1.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(12.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                close()
                moveTo(4.05f, 15.0f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                horizontalLineToRelative(5.1f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(21.0f, 15.0f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(3.602f, 10.0f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 7.0f)
                lineTo(6.454f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.377f, 0.17f)
                close()
                moveTo(10.0f, 7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.793f)
                lineToRelative(-2.854f, -2.854f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.586f, 7.0f)
                close()
                moveTo(6.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 6.502f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.002f, -3.002f)
                moveToRelative(10.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 16.501f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.001f, -3.002f)
            }
        }
            .build()
        return _taxiProfileSmall!!
    }

private var _taxiProfileSmall: ImageVector? = null
