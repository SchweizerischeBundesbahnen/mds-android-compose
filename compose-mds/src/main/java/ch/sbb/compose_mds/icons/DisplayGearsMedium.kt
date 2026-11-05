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

public val SBBIcons.DisplayGearsMedium: ImageVector
    get() {
        if (_displayGearsMedium != null) {
            return _displayGearsMedium!!
        }
        _displayGearsMedium = Builder(
            name = "DisplayGearsMedium",
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
                moveTo(3.75f, 7.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(5.0f)
                lineTo(10.5f, 30.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.25f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(13.5f)
                lineTo(32.75f, 7.75f)
                horizontalLineToRelative(-29.0f)
                moveToRelative(14.0f, 17.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(21.2f, 24.25f)
                horizontalLineToRelative(4.09f)
                curveToRelative(0.295f, -0.776f, 0.46f, -1.617f, 0.46f, -2.5f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -3.07f, -5.806f)
                lineTo(20.915f, 19.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.335f, 2.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.05f, 2.5f)
                moveToRelative(5.15f, 0.0f)
                horizontalLineToRelative(5.4f)
                lineTo(31.75f, 8.75f)
                lineTo(4.25f, 8.75f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(6.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.385f, -2.0f)
                lineTo(7.5f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.265f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.812f, -3.064f)
                lineToRelative(-2.82f, -1.628f)
                lineToRelative(0.5f, -0.866f)
                lineToRelative(2.819f, 1.627f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.243f, -2.243f)
                lineToRelative(-1.627f, -2.819f)
                lineToRelative(0.866f, -0.5f)
                lineToRelative(1.628f, 2.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.064f, -0.812f)
                lineTo(18.25f, 10.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.265f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.064f, 0.812f)
                lineToRelative(1.628f, -2.82f)
                lineToRelative(0.866f, 0.5f)
                lineToRelative(-1.627f, 2.819f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.243f, 2.243f)
                lineToRelative(2.819f, -1.627f)
                lineToRelative(0.5f, 0.866f)
                lineToRelative(-2.82f, 1.628f)
                curveToRelative(0.46f, 0.931f, 0.745f, 1.967f, 0.812f, 3.064f)
                lineTo(30.0f, 21.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.265f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.385f, 2.0f)
                moveToRelative(-14.14f, 0.0f)
                horizontalLineToRelative(4.09f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.015f, -2.0f)
                horizontalLineToRelative(-3.517f)
                curveToRelative(0.05f, 0.701f, 0.204f, 1.372f, 0.443f, 2.0f)
                moveToRelative(6.54f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                moveToRelative(0.0f, -6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.465f, 3.0f)
                horizontalLineToRelative(-3.518f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, 6.983f, -6.5f)
                curveToRelative(1.1f, 0.0f, 2.14f, 0.25f, 3.063f, 0.695f)
                lineTo(20.05f, 18.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.3f, -0.249f)
            }
        }
            .build()
        return _displayGearsMedium!!
    }

private var _displayGearsMedium: ImageVector? = null
