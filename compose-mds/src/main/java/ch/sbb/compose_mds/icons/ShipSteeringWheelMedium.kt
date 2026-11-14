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

public val SBBIcons.ShipSteeringWheelMedium: ImageVector
    get() {
        if (_shipSteeringWheelMedium != null) {
            return _shipSteeringWheelMedium!!
        }
        _shipSteeringWheelMedium = Builder(name = "ShipSteeringWheelMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                verticalLineToRelative(3.263f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, 6.916f, 2.863f)
                lineToRelative(2.307f, -2.306f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-2.307f, 2.306f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, 2.864f, 6.917f)
                lineTo(31.5f, 16.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.263f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, -2.864f, 6.916f)
                lineToRelative(2.307f, 2.307f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.307f, -2.307f)
                arcToRelative(10.95f, 10.95f, 0.0f, false, true, -6.916f, 2.863f)
                lineTo(17.75f, 31.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.264f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, -6.917f, -2.863f)
                lineTo(7.527f, 27.68f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(2.307f, -2.307f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, -2.863f, -6.916f)
                lineTo(3.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.263f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, 2.863f, -6.916f)
                lineTo(6.819f, 7.527f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(2.306f, 2.306f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, 6.917f, -2.863f)
                lineTo(16.75f, 3.0f)
                close()
                moveTo(17.25f, 7.25f)
                curveToRelative(-5.523f, 0.0f, -10.0f, 4.477f, -10.0f, 10.0f)
                reflectiveCurveToRelative(4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveToRelative(-4.477f, -10.0f, -10.0f, -10.0f)
                moveToRelative(0.0f, 2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.58f, -8.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                moveToRelative(-4.583f, 13.29f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 4.083f, 1.69f)
                verticalLineToRelative(-3.516f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.597f, -0.661f)
                close()
                moveTo(19.346f, 20.053f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.596f, 0.66f)
                verticalLineToRelative(3.517f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 4.082f, -1.69f)
                close()
                moveTo(10.27f, 17.75f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 1.69f, 4.082f)
                lineToRelative(2.486f, -2.486f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.66f, -1.596f)
                close()
                moveTo(20.714f, 17.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.661f, 1.596f)
                lineToRelative(2.486f, 2.486f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 1.691f, -4.082f)
                close()
                moveTo(17.25f, 14.75f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(2.803f, 0.404f)
                curveToRelative(0.343f, 0.458f, 0.576f, 1.003f, 0.66f, 1.596f)
                horizontalLineToRelative(3.517f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -1.692f, -4.083f)
                close()
                moveTo(11.961f, 12.667f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -1.691f, 4.083f)
                horizontalLineToRelative(3.516f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.66f, -1.596f)
                close()
                moveTo(16.75f, 10.27f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -4.083f, 1.69f)
                lineToRelative(2.486f, 2.487f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.597f, -0.662f)
                close()
                moveTo(17.75f, 13.785f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.596f, 0.662f)
                lineToRelative(2.486f, -2.487f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -4.082f, -1.69f)
                close()
            }
        }
        .build()
        return _shipSteeringWheelMedium!!
    }

private var _shipSteeringWheelMedium: ImageVector? = null
