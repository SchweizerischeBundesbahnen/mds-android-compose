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

public val SBBIcons.CityMedium: ImageVector
    get() {
        if (_cityMedium != null) {
            return _cityMedium!!
        }
        _cityMedium = Builder(
            name = "CityMedium",
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
                moveTo(11.75f, 3.75f)
                verticalLineToRelative(-0.61f)
                lineToRelative(-0.598f, 0.119f)
                lineToRelative(-7.5f, 1.5f)
                lineToRelative(-0.402f, 0.08f)
                lineTo(3.25f, 33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.25f)
                horizontalLineToRelative(6.5f)
                lineTo(10.75f, 33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(11.0f)
                lineTo(22.75f, 33.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(8.0f)
                lineTo(31.75f, 33.0f)
                horizontalLineToRelative(1.0f)
                lineTo(32.75f, 12.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(23.75f, 13.25f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-15.5f)
                close()
                moveTo(10.75f, 6.75f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-6.5f)
                lineTo(4.25f, 5.658f)
                lineToRelative(6.5f, -1.3f)
                verticalLineToRelative(2.39f)
                moveToRelative(12.0f, 22.0f)
                horizontalLineToRelative(-11.0f)
                lineTo(11.75f, 7.25f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(9.0f, 7.75f)
                lineTo(6.0f, 7.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(20.75f, 13.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(26.75f, 16.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(26.75f, 22.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(29.75f, 25.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(29.75f, 16.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(20.75f, 25.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(20.75f, 16.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.75f, 22.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.75f, 19.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.75f, 10.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(14.75f, 25.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(14.75f, 16.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(14.75f, 13.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.0f, 12.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 13.25f)
                close()
                moveTo(6.0f, 16.75f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 17.75f)
                close()
                moveTo(9.0f, 21.25f)
                lineTo(6.0f, 21.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
            .build()
        return _cityMedium!!
    }

private var _cityMedium: ImageVector? = null
