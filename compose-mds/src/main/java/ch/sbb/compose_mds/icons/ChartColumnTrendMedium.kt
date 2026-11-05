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

public val SBBIcons.ChartColumnTrendMedium: ImageVector
    get() {
        if (_chartColumnTrendMedium != null) {
            return _chartColumnTrendMedium!!
        }
        _chartColumnTrendMedium = Builder(
            name = "ChartColumnTrendMedium",
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
                moveTo(28.25f, 5.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.532f, 3.285f)
                lineToRelative(-5.249f, 7.348f)
                arcToRelative(1.996f, 1.996f, 0.0f, false, false, -2.332f, 0.683f)
                lineToRelative(-3.903f, -1.56f)
                quadToRelative(0.016f, -0.127f, 0.016f, -0.256f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -3.825f, 0.819f)
                lineTo(7.95f, 17.15f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.625f, 0.78f)
                lineToRelative(4.475f, -3.58f)
                arcToRelative(1.997f, 1.997f, 0.0f, false, false, 2.812f, -0.416f)
                lineToRelative(3.904f, 1.56f)
                quadToRelative(-0.016f, 0.126f, -0.016f, 0.256f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 3.532f, -1.285f)
                lineToRelative(5.249f, -7.348f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.719f, -3.867f)
                moveToRelative(-23.5f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.001f, 0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.001f, -0.001f)
                moveToRelative(6.5f, 1.006f)
                horizontalLineToRelative(4.0f)
                lineTo(16.25f, 31.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-8.994f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.994f)
                horizontalLineToRelative(3.5f)
                lineTo(27.25f, 13.756f)
                horizontalLineToRelative(4.0f)
                lineTo(31.25f, 32.75f)
                lineTo(4.75f, 32.75f)
                verticalLineToRelative(-6.994f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.994f)
                horizontalLineToRelative(3.5f)
                lineTo(12.25f, 19.756f)
                moveToRelative(3.0f, 11.994f)
                lineTo(15.25f, 20.756f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.25f, 31.75f)
                close()
                moveTo(22.75f, 31.75f)
                verticalLineToRelative(-7.994f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.994f)
                close()
                moveTo(30.25f, 14.756f)
                lineTo(30.25f, 31.75f)
                horizontalLineToRelative(-2.0f)
                lineTo(28.25f, 14.756f)
                close()
                moveTo(7.75f, 26.756f)
                verticalLineToRelative(4.994f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.994f)
                close()
                moveTo(14.25f, 11.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.001f, 2.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.001f, -2.001f)
                moveToRelative(6.5f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
            }
        }
            .build()
        return _chartColumnTrendMedium!!
    }

private var _chartColumnTrendMedium: ImageVector? = null
