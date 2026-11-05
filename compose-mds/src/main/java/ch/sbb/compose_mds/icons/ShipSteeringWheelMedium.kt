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

public val SBBIcons.ShipSteeringWheelMedium: ImageVector
    get() {
        if (_shipSteeringWheelMedium != null) {
            return _shipSteeringWheelMedium!!
        }
        _shipSteeringWheelMedium = Builder(
            name = "ShipSteeringWheelMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(16.75f, 6.261f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.261f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, 6.917f, 2.866f)
                lineToRelative(2.306f, -2.306f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-2.306f, 2.306f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, 2.865f, 6.916f)
                horizontalLineTo(31.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.261f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, -2.865f, 6.917f)
                lineToRelative(2.306f, 2.306f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.306f, -2.306f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, -6.917f, 2.865f)
                verticalLineTo(31.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.261f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, -6.917f, -2.865f)
                lineTo(7.527f, 27.68f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(2.306f, -2.306f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, -2.865f, -6.917f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.261f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, 2.865f, -6.916f)
                lineTo(6.82f, 7.528f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(2.306f, 2.306f)
                arcTo(10.96f, 10.96f, 0.0f, false, true, 16.75f, 6.26f)
                moveToRelative(0.5f, 0.989f)
                curveToRelative(-5.523f, 0.0f, -10.0f, 4.477f, -10.0f, 10.0f)
                reflectiveCurveToRelative(4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveToRelative(-4.477f, -10.0f, -10.0f, -10.0f)
                moveToRelative(-8.0f, 10.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.58f, -8.0f, -8.0f)
                moveToRelative(1.018f, -0.5f)
                horizontalLineToRelative(3.518f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.66f, -1.595f)
                lineToRelative(-2.486f, -2.489f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -1.692f, 4.084f)
                moveToRelative(2.399f, -4.791f)
                lineToRelative(2.487f, 2.488f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.596f, -0.661f)
                verticalLineToRelative(-3.518f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -4.083f, 1.691f)
                moveToRelative(5.083f, -1.691f)
                verticalLineToRelative(3.518f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.596f, 0.662f)
                lineToRelative(2.488f, -2.489f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -4.084f, -1.691f)
                moveToRelative(4.79f, 2.398f)
                lineToRelative(-2.487f, 2.489f)
                curveToRelative(0.343f, 0.458f, 0.577f, 1.002f, 0.662f, 1.595f)
                horizontalLineToRelative(3.517f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -1.691f, -4.084f)
                moveToRelative(1.692f, 5.084f)
                horizontalLineToRelative(-3.517f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.662f, 1.596f)
                lineToRelative(2.488f, 2.488f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 1.691f, -4.084f)
                moveToRelative(-2.398f, 4.79f)
                lineToRelative(-2.488f, -2.487f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.596f, 0.662f)
                verticalLineToRelative(3.517f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 4.084f, -1.691f)
                moveToRelative(-5.084f, 1.692f)
                verticalLineToRelative(-3.517f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.596f, -0.662f)
                lineToRelative(-2.488f, 2.488f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 4.084f, 1.691f)
                moveToRelative(-4.791f, -2.398f)
                lineToRelative(2.488f, -2.488f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.661f, -1.596f)
                horizontalLineToRelative(-3.518f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 1.69f, 4.084f)
                moveToRelative(5.291f, -7.084f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
            .build()
        return _shipSteeringWheelMedium!!
    }

private var _shipSteeringWheelMedium: ImageVector? = null
