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

public val SBBIcons.ChairliftProfileSmall: ImageVector
    get() {
        if (_chairliftProfileSmall != null) {
            return _chairliftProfileSmall!!
        }
        _chairliftProfileSmall = Builder(name = "ChairliftProfileSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.198f, 2.98f)
                lineTo(8.1f, 5.8f)
                verticalLineToRelative(0.866f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.9f, 8.16f)
                horizontalLineToRelative(-0.002f)
                lineTo(3.5f, 8.84f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.5f)
                verticalLineToRelative(9.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.783f)
                lineToRelative(0.146f, 0.243f)
                lineToRelative(1.5f, 2.5f)
                lineToRelative(-0.858f, 0.514f)
                lineToRelative(-1.354f, -2.257f)
                horizontalLineTo(3.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineTo(9.355f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.3f, 7.86f)
                horizontalLineToRelative(0.002f)
                lineTo(6.7f, 7.18f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.5f)
                verticalLineTo(6.0f)
                lineToRelative(-4.902f, 0.98f)
                lineTo(2.002f, 6.0f)
                lineToRelative(20.0f, -4.0f)
                close()
                moveTo(5.1f, 11.49f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                moveToRelative(0.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
            }
        }
        .build()
        return _chairliftProfileSmall!!
    }

private var _chairliftProfileSmall: ImageVector? = null
