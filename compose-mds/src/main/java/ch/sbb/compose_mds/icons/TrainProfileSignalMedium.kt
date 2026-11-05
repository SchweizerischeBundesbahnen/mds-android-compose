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

public val SBBIcons.TrainProfileSignalMedium: ImageVector
    get() {
        if (_trainProfileSignalMedium != null) {
            return _trainProfileSignalMedium!!
        }
        _trainProfileSignalMedium = Builder(
            name = "TrainProfileSignalMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
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
                moveToRelative(15.0f, 4.649f)
                lineToRelative(0.277f, 0.185f)
                lineToRelative(4.5f, 3.0f)
                lineToRelative(0.624f, 0.416f)
                lineToRelative(-0.624f, 0.416f)
                lineToRelative(-3.126f, 2.084f)
                lineTo(21.0f, 10.75f)
                curveToRelative(3.03f, 0.0f, 5.596f, 1.868f, 6.678f, 4.5f)
                horizontalLineToRelative(0.004f)
                lineToRelative(0.031f, 0.086f)
                quadToRelative(0.06f, 0.15f, 0.112f, 0.303f)
                lineToRelative(3.146f, 8.674f)
                curveToRelative(0.17f, 0.353f, 0.279f, 0.753f, 0.279f, 1.187f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                horizontalLineToRelative(-3.285f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.015f, 2.0f)
                lineTo(33.0f, 30.25f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 31.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.8f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.015f, -2.0f)
                lineTo(3.0f, 28.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(25.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.75f, -1.75f)
                curveToRelative(0.0f, -0.271f, -0.069f, -0.53f, -0.188f, -0.77f)
                lineToRelative(-0.012f, -0.025f)
                lineToRelative(-0.01f, -0.026f)
                lineToRelative(-0.88f, -2.43f)
                horizontalLineToRelative(-9.41f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(6.832f)
                curveToRelative(-1.017f, -2.07f, -3.125f, -3.5f, -5.582f, -3.5f)
                horizontalLineToRelative(-5.849f)
                lineToRelative(-0.151f, 0.102f)
                lineToRelative(-0.151f, -0.101f)
                lineTo(3.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.349f)
                lineToRelative(-3.126f, -2.084f)
                lineToRelative(-0.624f, -0.416f)
                lineToRelative(0.624f, -0.416f)
                lineToRelative(4.5f, -3.0f)
                close()
                moveTo(26.983f, 16.249f)
                lineTo(20.75f, 16.249f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.047f)
                close()
                moveTo(18.285f, 28.249f)
                curveToRelative(0.112f, 0.78f, 0.48f, 1.476f, 1.015f, 2.0f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.015f, -2.0f)
                close()
                moveTo(5.8f, 28.249f)
                horizontalLineToRelative(4.9f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.9f, 0.0f)
                moveToRelative(13.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.9f, 0.0f)
                close()
                moveTo(11.401f, 8.249f)
                lineTo(15.0f, 10.65f)
                lineToRelative(3.599f, -2.4f)
                lineTo(15.0f, 5.852f)
                close()
                moveTo(7.11f, 17.598f)
                curveToRelative(-1.813f, 1.877f, -1.813f, 4.928f, 0.0f, 6.805f)
                lineToRelative(-0.72f, 0.695f)
                curveToRelative(-2.187f, -2.265f, -2.187f, -5.93f, 0.0f, -8.195f)
                close()
                moveTo(9.36f, 22.528f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, true, 0.0f, -3.055f)
                lineToRelative(-0.72f, -0.695f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, false, 0.0f, 4.445f)
                close()
                moveTo(14.61f, 16.903f)
                curveToRelative(2.187f, 2.265f, 2.187f, 5.93f, 0.0f, 8.195f)
                lineToRelative(-0.72f, -0.695f)
                curveToRelative(1.813f, -1.877f, 1.813f, -4.928f, 0.0f, -6.805f)
                close()
                moveTo(12.36f, 23.223f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, false, 0.0f, -4.445f)
                lineToRelative(-0.72f, 0.695f)
                arcToRelative(2.22f, 2.22f, 0.0f, false, true, 0.0f, 3.055f)
                close()
            }
        }
            .build()
        return _trainProfileSignalMedium!!
    }

private var _trainProfileSignalMedium: ImageVector? = null
