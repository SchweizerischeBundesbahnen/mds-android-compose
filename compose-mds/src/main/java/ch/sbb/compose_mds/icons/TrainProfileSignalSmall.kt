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

public val SBBIcons.TrainProfileSignalSmall: ImageVector
    get() {
        if (_trainProfileSignalSmall != null) {
            return _trainProfileSignalSmall!!
        }
        _trainProfileSignalSmall = Builder(
            name = "TrainProfileSignalSmall",
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
                moveToRelative(10.0f, 2.899f)
                lineToRelative(0.277f, 0.185f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(0.624f, 0.416f)
                lineToRelative(-0.624f, 0.416f)
                lineTo(11.651f, 7.0f)
                lineTo(14.0f, 7.0f)
                curveToRelative(2.051f, 0.0f, 3.793f, 1.24f, 4.562f, 3.0f)
                horizontalLineToRelative(0.01f)
                lineToRelative(0.06f, 0.165f)
                quadToRelative(0.039f, 0.102f, 0.075f, 0.205f)
                lineToRelative(2.094f, 5.774f)
                curveToRelative(0.121f, 0.253f, 0.199f, 0.542f, 0.199f, 0.856f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.45f, 1.0f)
                lineTo(22.0f, 20.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.45f, -1.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.108f, -0.44f)
                lineToRelative(-0.012f, -0.025f)
                lineToRelative(-0.01f, -0.026f)
                lineToRelative(-0.547f, -1.51f)
                lineTo(13.0f, 14.999f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.444f)
                arcTo(3.97f, 3.97f, 0.0f, false, false, 14.0f, 8.0f)
                horizontalLineToRelative(-3.849f)
                lineTo(10.0f, 8.102f)
                lineTo(9.849f, 8.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 7.0f)
                horizontalLineToRelative(6.349f)
                lineTo(6.723f, 5.916f)
                lineTo(6.099f, 5.5f)
                lineToRelative(0.624f, -0.416f)
                lineToRelative(3.0f, -2.0f)
                close()
                moveTo(17.872f, 10.999f)
                lineTo(14.0f, 10.999f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.96f)
                close()
                moveTo(12.05f, 18.999f)
                curveToRelative(0.075f, 0.37f, 0.231f, 0.71f, 0.45f, 1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(0.219f, -0.29f, 0.375f, -0.63f, 0.45f, -1.0f)
                close()
                moveTo(4.085f, 18.999f)
                horizontalLineToRelative(2.83f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.83f, 0.0f)
                moveToRelative(9.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.83f, 0.0f)
                close()
                moveTo(7.901f, 5.5f)
                lineTo(10.0f, 6.9f)
                lineToRelative(2.099f, -1.4f)
                lineTo(10.0f, 4.102f)
                close()
                moveTo(4.86f, 11.848f)
                curveToRelative(-1.147f, 1.187f, -1.147f, 3.119f, 0.0f, 4.306f)
                lineToRelative(-0.72f, 0.694f)
                curveToRelative(-1.52f, -1.574f, -1.52f, -4.12f, 0.0f, -5.695f)
                close()
                moveTo(6.36f, 14.904f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, true, 0.0f, -1.806f)
                lineToRelative(-0.72f, -0.694f)
                arcToRelative(2.313f, 2.313f, 0.0f, false, false, 0.0f, 3.194f)
                close()
                moveTo(9.86f, 11.154f)
                curveToRelative(1.52f, 1.574f, 1.52f, 4.12f, 0.0f, 5.694f)
                lineToRelative(-0.72f, -0.695f)
                curveToRelative(1.147f, -1.186f, 1.147f, -3.118f, 0.0f, -4.305f)
                close()
                moveTo(8.36f, 15.598f)
                arcToRelative(2.313f, 2.313f, 0.0f, false, false, 0.0f, -3.194f)
                lineToRelative(-0.72f, 0.694f)
                curveToRelative(0.48f, 0.497f, 0.48f, 1.309f, 0.0f, 1.806f)
                close()
            }
        }
            .build()
        return _trainProfileSignalSmall!!
    }

private var _trainProfileSignalSmall: ImageVector? = null
