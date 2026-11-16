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
        _trainProfileSignalSmall = Builder(name = "TrainProfileSignalSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.277f, 3.084f)
                lineTo(13.901f, 5.5f)
                lineTo(11.651f, 7.0f)
                lineTo(14.0f, 7.0f)
                curveToRelative(2.051f, 0.0f, 3.793f, 1.24f, 4.563f, 3.0f)
                horizontalLineToRelative(0.01f)
                lineToRelative(0.054f, 0.153f)
                quadToRelative(0.04f, 0.103f, 0.078f, 0.208f)
                lineToRelative(0.004f, 0.013f)
                lineToRelative(2.102f, 5.794f)
                curveToRelative(0.114f, 0.248f, 0.189f, 0.527f, 0.189f, 0.832f)
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
                lineToRelative(-0.01f, -0.025f)
                lineToRelative(-0.547f, -1.51f)
                lineTo(13.0f, 15.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.444f)
                arcTo(3.97f, 3.97f, 0.0f, false, false, 14.0f, 8.0f)
                horizontalLineToRelative(-3.849f)
                lineTo(10.0f, 8.1f)
                lineTo(9.849f, 8.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 7.0f)
                horizontalLineToRelative(6.349f)
                lineToRelative(-2.25f, -1.5f)
                lineToRelative(3.624f, -2.416f)
                lineToRelative(0.277f, -0.185f)
                close()
                moveTo(17.872f, 11.0f)
                lineTo(14.0f, 11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.96f)
                close()
                moveTo(12.05f, 19.0f)
                curveToRelative(0.075f, 0.37f, 0.231f, 0.71f, 0.45f, 1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(0.219f, -0.29f, 0.375f, -0.63f, 0.45f, -1.0f)
                close()
                moveTo(4.085f, 19.0f)
                horizontalLineToRelative(2.83f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.83f, 0.0f)
                moveToRelative(9.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.83f, 0.0f)
                close()
                moveTo(7.901f, 5.5f)
                lineTo(10.0f, 6.898f)
                lineTo(12.099f, 5.5f)
                lineTo(10.0f, 4.1f)
                close()
                moveTo(4.86f, 11.848f)
                curveToRelative(-1.145f, 1.186f, -1.145f, 3.117f, 0.0f, 4.304f)
                lineToRelative(-0.718f, 0.695f)
                curveToRelative(-1.52f, -1.574f, -1.52f, -4.12f, 0.0f, -5.695f)
                close()
                moveTo(6.36f, 14.902f)
                arcToRelative(1.313f, 1.313f, 0.0f, false, true, 0.0f, -1.804f)
                lineToRelative(-0.718f, -0.696f)
                arcToRelative(2.313f, 2.313f, 0.0f, false, false, 0.0f, 3.196f)
                close()
                moveTo(9.86f, 11.152f)
                curveToRelative(1.52f, 1.575f, 1.52f, 4.121f, 0.0f, 5.696f)
                lineToRelative(-0.718f, -0.696f)
                curveToRelative(1.145f, -1.187f, 1.145f, -3.118f, 0.0f, -4.305f)
                close()
                moveTo(8.36f, 15.598f)
                arcToRelative(2.313f, 2.313f, 0.0f, false, false, 0.0f, -3.196f)
                lineToRelative(-0.718f, 0.696f)
                curveToRelative(0.479f, 0.496f, 0.479f, 1.308f, 0.0f, 1.804f)
                close()
            }
        }
        .build()
        return _trainProfileSignalSmall!!
    }

private var _trainProfileSignalSmall: ImageVector? = null
