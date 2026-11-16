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
                moveTo(10.277f, 3.084f)
                lineTo(13.901f, 5.5f)
                lineTo(11.652f, 7.0f)
                lineTo(14.0f, 7.0f)
                curveToRelative(2.051f, 0.0f, 3.793f, 1.24f, 4.563f, 3.0f)
                verticalLineToRelative(0.001f)
                quadToRelative(0.075f, 0.17f, 0.137f, 0.349f)
                lineToRelative(0.003f, 0.008f)
                lineToRelative(0.003f, 0.009f)
                lineToRelative(2.099f, 5.789f)
                curveToRelative(0.118f, 0.25f, 0.195f, 0.534f, 0.195f, 0.843f)
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
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.108f, -0.44f)
                lineToRelative(-0.012f, -0.024f)
                lineToRelative(-0.01f, -0.026f)
                lineToRelative(-0.547f, -1.51f)
                lineTo(13.0f, 14.999f)
                lineTo(13.0f, 10.0f)
                horizontalLineToRelative(4.445f)
                arcTo(3.97f, 3.97f, 0.0f, false, false, 14.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 7.0f)
                horizontalLineToRelative(6.348f)
                lineToRelative(-2.25f, -1.5f)
                lineToRelative(3.625f, -2.416f)
                lineToRelative(0.277f, -0.185f)
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
                moveTo(7.901f, 5.5f)
                lineTo(10.0f, 6.898f)
                lineTo(12.099f, 5.5f)
                lineTo(10.0f, 4.1f)
                close()
                moveTo(12.0f, 10.0f)
                verticalLineToRelative(5.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(8.0f, 11.0f)
                close()
                moveTo(6.0f, 15.0f)
                verticalLineToRelative(-5.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _trainProfileSmall!!
    }

private var _trainProfileSmall: ImageVector? = null
