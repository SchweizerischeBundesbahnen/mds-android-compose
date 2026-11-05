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

public val SBBIcons.JerseyShirtSmall: ImageVector
    get() {
        if (_jerseyShirtSmall != null) {
            return _jerseyShirtSmall!!
        }
        _jerseyShirtSmall = Builder(
            name = "JerseyShirtSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                moveTo(7.0f, 2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.498f)
                lineTo(9.0f, 3.998f)
                lineTo(9.0f, 3.5f)
                lineTo(8.0f, 3.5f)
                lineTo(8.0f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.0f, 2.45f)
                lineTo(6.0f, 21.5f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 10.45f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 8.0f)
                lineTo(16.0f, 3.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.498f)
                horizontalLineToRelative(-1.0f)
                lineTo(14.0f, 2.5f)
                horizontalLineToRelative(3.0f)
                lineTo(17.0f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(13.0f)
                lineTo(5.0f, 22.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 8.0f)
                lineTo(7.0f, 2.5f)
                moveTo(10.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                close()
                moveTo(13.0f, 18.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-1.08f)
                quadToRelative(-0.132f, 0.703f, -0.515f, 1.0f)
                quadToRelative(-0.264f, 0.205f, -0.582f, 0.298f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.823f, 0.105f)
                verticalLineToRelative(1.015f)
                horizontalLineToRelative(1.622f)
                lineTo(11.622f, 18.0f)
                close()
            }
        }
            .build()
        return _jerseyShirtSmall!!
    }

private var _jerseyShirtSmall: ImageVector? = null
