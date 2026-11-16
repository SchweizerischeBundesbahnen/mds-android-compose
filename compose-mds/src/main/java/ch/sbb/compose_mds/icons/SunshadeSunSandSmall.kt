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

public val SBBIcons.SunshadeSunSandSmall: ImageVector
    get() {
        if (_sunshadeSunSandSmall != null) {
            return _sunshadeSunSandSmall!!
        }
        _sunshadeSunSandSmall = Builder(name = "SunshadeSunSandSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 7.872f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 8.88f, 2.379f)
                lineToRelative(0.25f, 0.433f)
                lineToRelative(-0.433f, 0.25f)
                lineToRelative(-4.789f, 2.763f)
                lineTo(12.81f, 21.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.691f)
                lineTo(8.29f, 14.198f)
                lineToRelative(-4.735f, 2.736f)
                lineToRelative(-0.434f, 0.25f)
                lineToRelative(-0.25f, -0.433f)
                lineToRelative(0.434f, -0.25f)
                lineToRelative(-0.001f, -0.001f)
                lineToRelative(-0.433f, 0.251f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 2.38f, -8.879f)
                moveToRelative(-1.21f, 2.411f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.532f, 5.524f)
                lineToRelative(1.721f, -0.995f)
                curveToRelative(-0.709f, -1.348f, -1.114f, -2.718f, -1.185f, -3.895f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.004f, -0.634f)
                moveToRelative(3.901f, -1.1f)
                curveToRelative(-0.963f, -0.636f, -1.725f, -0.713f, -2.19f, -0.445f)
                curveToRelative(-0.465f, 0.269f, -0.778f, 0.967f, -0.71f, 2.12f)
                curveToRelative(0.061f, 1.0f, 0.41f, 2.219f, 1.055f, 3.454f)
                lineToRelative(4.308f, -2.488f)
                curveToRelative(-0.747f, -1.175f, -1.626f, -2.088f, -2.463f, -2.64f)
                moveToRelative(5.052f, 1.146f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.048f, -2.3f)
                quadToRelative(0.279f, 0.143f, 0.547f, 0.32f)
                curveToRelative(0.984f, 0.65f, 1.967f, 1.686f, 2.78f, 2.974f)
                close()
                moveTo(21.0f, 6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
            }
        }
        .build()
        return _sunshadeSunSandSmall!!
    }

private var _sunshadeSunSandSmall: ImageVector? = null
