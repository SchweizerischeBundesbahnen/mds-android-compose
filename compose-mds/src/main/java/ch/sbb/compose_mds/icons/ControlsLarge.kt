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

public val SBBIcons.ControlsLarge: ImageVector
    get() {
        if (_controlsLarge != null) {
            return _controlsLarge!!
        }
        _controlsLarge = Builder(
            name = "ControlsLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                pathFillType = EvenOdd,
            ) {
                moveTo(13.5f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveToRelative(-4.473f, 3.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 8.946f, 0.0f)
                horizontalLineTo(45.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(17.973f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -8.946f, 0.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(36.5f, 20.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.472f, 4.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(29.028f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 8.944f, 0.0f)
                horizontalLineTo(45.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.028f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.472f, -4.0f)
                moveTo(17.973f, 39.0f)
                horizontalLineTo(45.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(17.973f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -8.946f, 0.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 8.946f, 0.0f)
                moveTo(36.5f, 21.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveTo(10.0f, 38.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
            }
        }
            .build()
        return _controlsLarge!!
    }

private var _controlsLarge: ImageVector? = null
