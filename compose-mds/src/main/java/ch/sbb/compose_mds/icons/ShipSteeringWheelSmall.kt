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

public val SBBIcons.ShipSteeringWheelSmall: ImageVector
    get() {
        if (_shipSteeringWheelSmall != null) {
            return _shipSteeringWheelSmall!!
        }
        _shipSteeringWheelSmall = Builder(name = "ShipSteeringWheelSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 4.016f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.016f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, 4.438f, 1.84f)
                lineToRelative(1.426f, -1.427f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-1.426f, 1.426f)
                arcTo(7.47f, 7.47f, 0.0f, false, true, 18.984f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.016f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, -1.839f, 4.438f)
                lineToRelative(1.426f, 1.426f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-1.426f, -1.426f)
                arcTo(7.47f, 7.47f, 0.0f, false, true, 12.0f, 18.984f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.016f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, -4.438f, -1.839f)
                lineToRelative(-1.426f, 1.426f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(1.426f, -1.426f)
                arcTo(7.47f, 7.47f, 0.0f, false, true, 4.016f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.016f)
                arcToRelative(7.47f, 7.47f, 0.0f, false, true, 1.839f, -4.438f)
                lineTo(4.429f, 5.136f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(1.426f, 1.426f)
                arcTo(7.47f, 7.47f, 0.0f, false, true, 11.0f, 4.016f)
                moveToRelative(0.5f, 0.984f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f)
                moveTo(6.0f, 11.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -11.0f, 0.0f)
                moveToRelative(1.027f, -0.5f)
                horizontalLineTo(9.05f)
                curveToRelative(0.065f, -0.319f, 0.19f, -0.616f, 0.364f, -0.878f)
                lineTo(7.984f, 8.69f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 7.027f, 11.0f)
                moveToRelative(1.664f, -3.016f)
                lineToRelative(1.43f, 1.43f)
                curveToRelative(0.263f, -0.173f, 0.56f, -0.3f, 0.879f, -0.364f)
                verticalLineTo(7.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -2.309f, 0.957f)
                moveTo(12.0f, 7.027f)
                verticalLineTo(9.05f)
                curveToRelative(0.32f, 0.065f, 0.616f, 0.19f, 0.879f, 0.365f)
                lineToRelative(1.43f, -1.431f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 12.0f, 7.027f)
                moveToRelative(3.016f, 1.664f)
                lineToRelative(-1.43f, 1.43f)
                curveToRelative(0.173f, 0.263f, 0.3f, 0.56f, 0.364f, 0.879f)
                horizontalLineToRelative(2.023f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -0.957f, -2.309f)
                moveTo(15.973f, 12.0f)
                horizontalLineTo(13.95f)
                curveToRelative(-0.065f, 0.319f, -0.19f, 0.616f, -0.364f, 0.878f)
                lineToRelative(1.43f, 1.43f)
                curveToRelative(0.518f, -0.646f, 0.86f, -1.44f, 0.957f, -2.308f)
                moveToRelative(-1.664f, 3.016f)
                lineToRelative(-1.43f, -1.43f)
                curveToRelative(-0.263f, 0.173f, -0.56f, 0.3f, -0.879f, 0.364f)
                verticalLineToRelative(2.023f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.31f, -0.957f)
                moveTo(11.0f, 15.973f)
                verticalLineTo(13.95f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.879f, -0.364f)
                lineToRelative(-1.43f, 1.43f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.309f, 0.957f)
                moveToRelative(-3.016f, -1.664f)
                lineToRelative(1.43f, -1.43f)
                curveToRelative(-0.173f, -0.263f, -0.3f, -0.56f, -0.364f, -0.879f)
                horizontalLineTo(7.027f)
                curveToRelative(0.096f, 0.868f, 0.439f, 1.662f, 0.957f, 2.309f)
                moveTo(11.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 10.0f)
            }
        }
        .build()
        return _shipSteeringWheelSmall!!
    }

private var _shipSteeringWheelSmall: ImageVector? = null
