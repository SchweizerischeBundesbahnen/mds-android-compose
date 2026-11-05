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

public val SBBIcons.GitMergeLarge: ImageVector
    get() {
        if (_gitMergeLarge != null) {
            return _gitMergeLarge!!
        }
        _gitMergeLarge = Builder(name = "GitMergeLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 4.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.5f, 8.97f)
                verticalLineToRelative(21.058f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(12.971f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 14.5f, 4.0f)
                moveToRelative(14.86f, 11.623f)
                lineToRelative(-7.473f, 2.012f)
                lineToRelative(5.861f, 2.93f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 33.0f, 29.062f)
                verticalLineToRelative(4.966f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineToRelative(-4.965f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -4.698f, -7.603f)
                lineToRelative(-5.855f, -2.928f)
                lineToRelative(1.976f, 7.374f)
                lineToRelative(-0.483f, 0.13f)
                lineToRelative(-0.483f, 0.129f)
                lineToRelative(-2.3f, -8.582f)
                lineToRelative(-0.129f, -0.482f)
                lineToRelative(0.483f, -0.13f)
                lineToRelative(8.589f, -2.313f)
                close()
                moveTo(14.5f, 35.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveToRelative(18.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveToRelative(-18.0f, -30.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
            }
        }
        .build()
        return _gitMergeLarge!!
    }

private var _gitMergeLarge: ImageVector? = null
