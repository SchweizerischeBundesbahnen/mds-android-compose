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

public val SBBIcons.CarProfilePowerPlugSmall: ImageVector
    get() {
        if (_carProfilePowerPlugSmall != null) {
            return _carProfilePowerPlugSmall!!
        }
        _carProfilePowerPlugSmall = Builder(
            name = "CarProfilePowerPlugSmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
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
                moveTo(6.077f, 5.17f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.454f, 5.0f)
                close()
                moveTo(6.077f, 5.17f)
                lineTo(3.602f, 8.0f)
                lineTo(9.0f, 8.0f)
                lineTo(9.0f, 5.0f)
                lineTo(6.454f, 5.0f)
                moveTo(10.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.793f)
                lineTo(13.94f, 5.147f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.584f, 5.0f)
                close()
                moveTo(18.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.05f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                horizontalLineToRelative(5.1f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(21.0f, 13.0f)
                lineToRelative(-0.002f, -3.498f)
                curveToRelative(0.0f, -0.215f, -0.082f, -0.316f, -0.17f, -0.38f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.344f, -0.12f)
                close()
                moveTo(18.95f, 14.0f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, -4.9f, 0.0f)
                horizontalLineToRelative(-5.1f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(2.0f, 14.0f)
                lineTo(2.0f, 8.875f)
                curveToRelative(0.0f, -0.364f, 0.132f, -0.715f, 0.372f, -0.989f)
                lineToRelative(2.953f, -3.375f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.454f, 4.0f)
                horizontalLineToRelative(7.131f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.062f, 0.44f)
                lineTo(18.207f, 8.0f)
                lineToRelative(2.29f, 0.002f)
                horizontalLineToRelative(0.019f)
                curveToRelative(0.243f, 0.01f, 0.595f, 0.089f, 0.9f, 0.312f)
                curveToRelative(0.33f, 0.24f, 0.582f, 0.632f, 0.582f, 1.187f)
                lineTo(22.0f, 13.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.05f)
                moveTo(6.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 6.502f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 12.0f)
                moveToRelative(10.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 16.501f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 12.0f)
                moveTo(14.0f, 16.999f)
                verticalLineToRelative(1.0f)
                lineToRelative(1.999f, -0.005f)
                lineToRelative(0.002f, 1.0f)
                lineTo(14.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, -2.0f)
                lineTo(7.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.448f, -1.998f)
                lineToRelative(1.002f, -0.002f)
                close()
                moveTo(13.0f, 20.999f)
                lineTo(13.0f, 18.0f)
                horizontalLineToRelative(-0.502f)
                arcToRelative(1.499f, 1.499f, 0.0f, true, false, 0.002f, 3.0f)
                close()
            }
        }
            .build()
        return _carProfilePowerPlugSmall!!
    }

private var _carProfilePowerPlugSmall: ImageVector? = null
