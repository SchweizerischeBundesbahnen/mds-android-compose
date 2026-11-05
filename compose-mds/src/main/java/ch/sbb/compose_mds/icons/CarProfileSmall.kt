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

public val SBBIcons.CarProfileSmall: ImageVector
    get() {
        if (_carProfileSmall != null) {
            return _carProfileSmall!!
        }
        _carProfileSmall = Builder(name = "CarProfileSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.077f, 7.17f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.454f, 7.0f)
                close()
                moveTo(6.077f, 7.17f)
                lineTo(3.602f, 10.0f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 7.0f)
                lineTo(6.454f, 7.0f)
                moveTo(10.0f, 7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.793f)
                lineTo(13.94f, 7.147f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.584f, 7.0f)
                close()
                moveTo(18.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.05f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                horizontalLineToRelative(5.1f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(21.0f, 15.0f)
                lineToRelative(-0.002f, -3.498f)
                curveToRelative(0.0f, -0.215f, -0.082f, -0.316f, -0.17f, -0.38f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.344f, -0.12f)
                close()
                moveTo(18.95f, 16.0f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, -4.9f, 0.0f)
                horizontalLineToRelative(-5.1f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-5.124f)
                curveToRelative(0.0f, -0.364f, 0.132f, -0.715f, 0.372f, -0.989f)
                lineToRelative(2.953f, -3.375f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.454f, 6.0f)
                horizontalLineToRelative(7.131f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.062f, 0.44f)
                lineToRelative(3.56f, 3.56f)
                lineToRelative(2.29f, 0.002f)
                horizontalLineToRelative(0.019f)
                curveToRelative(0.243f, 0.01f, 0.595f, 0.089f, 0.9f, 0.312f)
                curveToRelative(0.33f, 0.24f, 0.582f, 0.632f, 0.582f, 1.187f)
                lineTo(22.0f, 15.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.05f)
                moveTo(6.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 6.502f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.002f, -3.002f)
                moveToRelative(10.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 16.501f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.001f, -3.002f)
            }
        }
        .build()
        return _carProfileSmall!!
    }

private var _carProfileSmall: ImageVector? = null
