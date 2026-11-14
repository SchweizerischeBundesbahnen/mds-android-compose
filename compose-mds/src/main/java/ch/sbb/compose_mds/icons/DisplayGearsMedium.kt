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
        _displayGearsMedium = Builder(name = "DisplayGearsMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.75f, 25.25f)
                lineTo(32.75f, 7.75f)
                lineTo(3.25f, 7.75f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(5.0f)
                lineTo(10.5f, 30.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.25f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(17.75f, 25.25f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(21.2f, 24.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.05f, -2.5f)
                curveToRelative(0.0f, -1.116f, -0.522f, -2.11f, -1.335f, -2.75f)
                lineToRelative(1.764f, -3.056f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, 3.071f, 5.806f)
                curveToRelative(0.0f, 0.883f, -0.165f, 1.724f, -0.46f, 2.5f)
                close()
                moveTo(18.75f, 24.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                moveToRelative(7.6f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.384f, -2.0f)
                lineTo(30.0f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.265f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.812f, -3.064f)
                lineToRelative(2.82f, -1.628f)
                lineToRelative(-0.5f, -0.866f)
                lineToRelative(-2.818f, 1.628f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.245f, -2.245f)
                lineToRelative(1.628f, -2.818f)
                lineToRelative(-0.866f, -0.5f)
                lineToRelative(-1.628f, 2.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.064f, -0.812f)
                lineTo(19.25f, 10.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.265f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.065f, 0.812f)
                lineToRelative(-1.627f, -2.82f)
                lineToRelative(-0.866f, 0.5f)
                lineToRelative(1.627f, 2.819f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.243f, 2.243f)
                lineToRelative(-2.819f, -1.627f)
                lineToRelative(-0.5f, 0.866f)
                lineToRelative(2.82f, 1.628f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.812f, 3.064f)
                lineTo(7.5f, 21.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.266f)
                curveToRelative(0.043f, 0.696f, 0.176f, 1.366f, 0.384f, 2.0f)
                horizontalLineToRelative(-6.9f)
                lineTo(4.25f, 8.75f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(12.21f, 24.25f)
                horizontalLineToRelative(4.09f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.015f, -2.0f)
                horizontalLineToRelative(-3.517f)
                curveToRelative(0.05f, 0.701f, 0.203f, 1.372f, 0.443f, 2.0f)
                moveToRelative(6.54f, -6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.465f, 3.0f)
                horizontalLineToRelative(-3.518f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, 6.983f, -6.5f)
                curveToRelative(1.1f, 0.0f, 2.14f, 0.25f, 3.063f, 0.695f)
                lineTo(20.05f, 18.5f)
                curveToRelative(-0.402f, -0.16f, -0.84f, -0.249f, -1.3f, -0.249f)
            }
        }
        .build()
        return _displayGearsMedium!!
    }

private var _displayGearsMedium: ImageVector? = null
