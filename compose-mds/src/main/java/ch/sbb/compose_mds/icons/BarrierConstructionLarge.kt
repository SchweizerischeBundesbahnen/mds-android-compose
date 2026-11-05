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

public val SBBIcons.BarrierConstructionLarge: ImageVector
    get() {
        if (_barrierConstructionLarge != null) {
            return _barrierConstructionLarge!!
        }
        _barrierConstructionLarge = Builder(
            name = "BarrierConstructionLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
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
                moveTo(12.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 5.5f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 4.0f)
                moveTo(10.0f, 5.5f)
                lineTo(10.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(8.002f)
                lineTo(4.0f, 26.002f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(6.0f)
                lineTo(10.0f, 43.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-7.998f)
                horizontalLineToRelative(18.0f)
                lineTo(33.0f, 43.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-7.998f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(38.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                lineTo(44.0f, 9.0f)
                horizontalLineToRelative(-5.998f)
                lineTo(38.002f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                lineTo(33.002f, 9.0f)
                lineTo(15.0f, 9.0f)
                lineTo(15.0f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                moveTo(37.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(8.002f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(33.0f, 18.0f)
                verticalLineToRelative(8.002f)
                lineTo(15.0f, 26.002f)
                lineTo(15.0f, 18.0f)
                close()
                moveTo(37.002f, 9.0f)
                lineTo(37.002f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                lineTo(34.002f, 9.0f)
                close()
                moveTo(11.0f, 18.0f)
                verticalLineToRelative(8.002f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 18.0f)
                close()
                moveTo(5.0f, 17.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(9.793f)
                lineToRelative(-7.0f, 7.0f)
                close()
                moveTo(18.793f, 10.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(-7.0f, 7.0f)
                horizontalLineToRelative(2.586f)
                close()
                moveTo(20.207f, 10.0f)
                horizontalLineToRelative(13.586f)
                lineToRelative(-7.0f, 7.0f)
                lineTo(13.207f, 17.0f)
                close()
                moveTo(37.793f, 10.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(-7.0f, 7.0f)
                horizontalLineToRelative(2.586f)
                close()
                moveTo(39.207f, 10.0f)
                lineTo(43.0f, 10.0f)
                verticalLineToRelative(7.0f)
                lineTo(32.207f, 17.0f)
                close()
                moveTo(37.0f, 35.002f)
                horizontalLineToRelative(-3.0f)
                lineTo(34.0f, 42.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(11.0f, 42.0f)
                verticalLineToRelative(-6.998f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 42.0f)
                close()
                moveTo(11.291f, 27.002f)
                lineTo(5.0f, 33.292f)
                verticalLineToRelative(-6.29f)
                close()
                moveTo(5.706f, 34.002f)
                lineTo(12.706f, 27.002f)
                horizontalLineToRelative(2.585f)
                lineToRelative(-7.0f, 7.0f)
                close()
                moveTo(9.706f, 34.002f)
                horizontalLineToRelative(8.585f)
                lineToRelative(7.0f, -7.0f)
                horizontalLineToRelative(-8.585f)
                close()
                moveTo(29.291f, 27.002f)
                horizontalLineToRelative(-2.585f)
                lineToRelative(-7.0f, 7.0f)
                horizontalLineToRelative(2.585f)
                close()
                moveTo(30.706f, 27.002f)
                horizontalLineToRelative(9.585f)
                lineToRelative(-7.0f, 7.0f)
                horizontalLineToRelative(-9.585f)
                close()
                moveTo(43.0f, 27.002f)
                horizontalLineToRelative(-1.294f)
                lineToRelative(-7.0f, 7.0f)
                horizontalLineToRelative(2.585f)
                lineToRelative(5.71f, -5.71f)
                close()
                moveTo(43.0f, 29.707f)
                lineTo(38.706f, 34.001f)
                lineTo(43.0f, 34.001f)
                close()
            }
        }
            .build()
        return _barrierConstructionLarge!!
    }

private var _barrierConstructionLarge: ImageVector? = null
