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

public val SBBIcons.UndergroundVehiculeProfileSmall: ImageVector
    get() {
        if (_undergroundVehiculeProfileSmall != null) {
            return _undergroundVehiculeProfileSmall!!
        }
        _undergroundVehiculeProfileSmall = Builder(
            name = "UndergroundVehiculeProfileSmall",
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
                moveTo(2.01f, 3.01f)
                horizontalLineToRelative(13.754f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.425f, 1.065f)
                lineToRelative(2.72f, 9.0f)
                lineToRelative(0.003f, 0.01f)
                quadToRelative(0.095f, 0.345f, 0.098f, 0.701f)
                verticalLineTo(18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(2.01f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-4.708f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.06f, -0.433f)
                lineToRelative(-2.718f, -8.994f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.474f, -0.355f)
                horizontalLineTo(2.01f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.02f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(10.5f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(7.673f)
                lineToRelative(-0.182f, -0.637f)
                lineToRelative(-2.0f, -7.0f)
                lineTo(15.387f, 5.0f)
                horizontalLineTo(10.5f)
                moveToRelative(0.5f, 7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(3.633f)
                lineToRelative(1.714f, 6.0f)
                close()
                moveTo(2.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                moveToRelative(4.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(3.0f, 6.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
            .build()
        return _undergroundVehiculeProfileSmall!!
    }

private var _undergroundVehiculeProfileSmall: ImageVector? = null
