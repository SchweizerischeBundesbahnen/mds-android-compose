package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.BulbOnPercentageLarge: ImageVector
    get() {
        if (_bulbOnPercentageLarge != null) {
            return _bulbOnPercentageLarge!!
        }
        _bulbOnPercentageLarge = Builder(
            name = "BulbOnPercentageLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveToRelative(42.5f, 24.689f)
                lineToRelative(0.374f, 0.331f)
                lineToRelative(-14.0f, 15.75f)
                lineToRelative(-0.374f, -0.332f)
                lineToRelative(-0.374f, -0.333f)
                lineToRelative(14.0f, -15.75f)
                close()
                moveTo(39.5f, 35.063f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.001f, -5.0f)
                moveTo(20.502f, 15.0f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, true, 9.256f, 7.337f)
                lineToRelative(-0.488f, 0.112f)
                lineToRelative(-0.487f, 0.111f)
                arcTo(8.46f, 8.46f, 0.0f, false, false, 20.502f, 16.0f)
                arcToRelative(8.463f, 8.463f, 0.0f, false, false, -8.5f, 8.5f)
                curveToRelative(0.0f, 3.155f, 1.833f, 5.963f, 4.437f, 7.5f)
                lineTo(26.0f, 32.0f)
                verticalLineToRelative(5.055f)
                lineToRelative(-0.335f, 0.117f)
                lineTo(22.0f, 38.454f)
                lineTo(22.0f, 40.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.546f)
                lineToRelative(-3.665f, -1.282f)
                lineToRelative(-0.335f, -0.117f)
                lineTo(15.0f, 32.24f)
                curveToRelative(-2.375f, -1.777f, -3.998f, -4.588f, -3.998f, -7.741f)
                curveToRelative(0.0f, -5.276f, 4.224f, -9.5f, 9.5f, -9.5f)
                moveTo(39.5f, 36.063f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.001f, -3.0f)
                moveToRelative(-23.5f, 0.282f)
                lineToRelative(3.665f, 1.283f)
                lineToRelative(0.335f, 0.117f)
                lineTo(20.0f, 39.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.255f)
                lineToRelative(0.335f, -0.117f)
                lineTo(25.0f, 36.345f)
                lineTo(25.0f, 33.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(9.463f, 31.443f)
                lineTo(6.843f, 33.003f)
                lineTo(6.331f, 32.145f)
                lineTo(8.951f, 30.584f)
                close()
                moveTo(31.5f, 25.063f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.001f, -5.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.001f, -3.0f)
                moveTo(8.002f, 25.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(9.555f, 17.706f)
                lineTo(9.014f, 18.548f)
                lineTo(6.451f, 16.899f)
                lineTo(6.721f, 16.479f)
                lineTo(6.992f, 16.059f)
                close()
                moveTo(34.19f, 16.401f)
                lineTo(34.432f, 16.839f)
                lineTo(31.865f, 18.255f)
                lineTo(31.624f, 17.817f)
                lineTo(31.383f, 17.379f)
                lineTo(33.948f, 15.963f)
                close()
                moveTo(14.453f, 12.944f)
                lineTo(14.015f, 13.184f)
                lineTo(13.577f, 13.426f)
                lineTo(12.159f, 10.848f)
                lineTo(12.597f, 10.608f)
                lineTo(13.035f, 10.366f)
                close()
                moveTo(28.393f, 10.602f)
                lineTo(28.832f, 10.842f)
                lineTo(27.428f, 13.415f)
                lineTo(26.989f, 13.175f)
                lineTo(26.549f, 12.936f)
                lineTo(27.954f, 10.362f)
                close()
                moveTo(21.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _bulbOnPercentageLarge!!
    }

private var _bulbOnPercentageLarge: ImageVector? = null
