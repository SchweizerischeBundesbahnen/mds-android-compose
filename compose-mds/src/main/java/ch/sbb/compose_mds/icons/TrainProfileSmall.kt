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

public val SBBIcons.TrainProfileSmall: ImageVector
    get() {
        if (_trainProfileSmall != null) {
            return _trainProfileSmall!!
        }
        _trainProfileSmall = Builder(name = "TrainProfileSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(10.0f, 2.899f)
                lineToRelative(0.277f, 0.185f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(0.624f, 0.416f)
                lineToRelative(-0.624f, 0.416f)
                lineToRelative(-1.625f, 1.083f)
                lineTo(14.0f, 6.999f)
                curveTo(16.051f, 7.0f, 17.793f, 8.24f, 18.563f, 10.0f)
                quadToRelative(0.079f, 0.182f, 0.144f, 0.37f)
                lineToRelative(2.094f, 5.773f)
                curveToRelative(0.121f, 0.253f, 0.199f, 0.543f, 0.199f, 0.856f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-0.075f, 0.37f, -0.232f, 0.71f, -0.45f, 1.0f)
                lineTo(22.0f, 19.999f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 20.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.45f, -1.0f)
                lineTo(2.0f, 18.999f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.108f, -0.439f)
                lineToRelative(-0.012f, -0.025f)
                lineToRelative(-0.01f, -0.026f)
                lineToRelative(-0.547f, -1.51f)
                lineTo(13.0f, 14.999f)
                lineTo(13.0f, 10.0f)
                horizontalLineToRelative(4.444f)
                curveToRelative(-0.69f, -1.196f, -1.97f, -2.0f, -3.444f, -2.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 7.0f)
                horizontalLineToRelative(6.348f)
                lineTo(6.723f, 5.915f)
                lineTo(6.099f, 5.5f)
                lineToRelative(0.624f, -0.416f)
                lineToRelative(3.0f, -2.0f)
                close()
                moveTo(17.872f, 11.0f)
                lineTo(14.0f, 11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.96f)
                close()
                moveTo(12.05f, 19.0f)
                curveToRelative(0.075f, 0.369f, 0.232f, 0.709f, 0.45f, 1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(0.218f, -0.291f, 0.375f, -0.631f, 0.45f, -1.0f)
                close()
                moveTo(4.085f, 19.0f)
                horizontalLineToRelative(2.83f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, true, -2.83f, 0.0f)
                moveToRelative(9.0f, 0.0f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, false, 2.83f, 0.0f)
                close()
                moveTo(10.0f, 6.898f)
                lineToRelative(2.099f, -1.4f)
                lineTo(10.0f, 4.102f)
                lineTo(7.901f, 5.5f)
                close()
                moveTo(7.0f, 9.998f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                lineTo(7.0f, 14.998f)
                verticalLineToRelative(-5.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(2.0f, 10.998f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 13.998f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                lineTo(2.0f, 9.998f)
                close()
            }
        }
        .build()
        return _trainProfileSmall!!
    }

private var _trainProfileSmall: ImageVector? = null
