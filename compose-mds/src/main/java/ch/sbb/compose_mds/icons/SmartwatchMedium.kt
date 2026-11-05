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

public val SBBIcons.SmartwatchMedium: ImageVector
    get() {
        if (_smartwatchMedium != null) {
            return _smartwatchMedium!!
        }
        _smartwatchMedium = Builder(
            name = "SmartwatchMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(12.25f, 3.25f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(5.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-13.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                moveToRelative(14.5f, 15.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(13.25f, 26.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(22.75f, 4.25f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(11.25f, 10.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(13.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-13.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(17.75f, 13.5f)
                verticalLineToRelative(4.747f)
                lineToRelative(4.807f, -0.027f)
                lineToRelative(0.006f, 1.0f)
                lineToRelative(-5.31f, 0.03f)
                lineToRelative(-0.503f, 0.003f)
                lineTo(16.75f, 13.5f)
                close()
            }
        }
            .build()
        return _smartwatchMedium!!
    }

private var _smartwatchMedium: ImageVector? = null
