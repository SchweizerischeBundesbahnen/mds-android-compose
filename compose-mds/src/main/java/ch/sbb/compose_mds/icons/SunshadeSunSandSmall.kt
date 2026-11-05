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

public val SBBIcons.SunshadeSunSandSmall: ImageVector
    get() {
        if (_sunshadeSunSandSmall != null) {
            return _sunshadeSunSandSmall!!
        }
        _sunshadeSunSandSmall = Builder(
            name = "SunshadeSunSandSmall",
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
                moveTo(18.5f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveTo(15.0f, 6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                moveTo(5.251f, 7.872f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 8.88f, 2.379f)
                lineToRelative(0.25f, 0.433f)
                lineToRelative(-0.434f, 0.25f)
                lineToRelative(-4.788f, 2.765f)
                lineTo(12.809f, 21.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.691f)
                lineToRelative(-3.4f, -6.8f)
                lineToRelative(-4.737f, 2.734f)
                lineToRelative(-0.433f, 0.25f)
                lineToRelative(-0.25f, -0.433f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 2.377f, -8.877f)
                moveToRelative(0.503f, 0.864f)
                curveToRelative(-0.465f, 0.268f, -0.778f, 0.967f, -0.71f, 2.12f)
                curveToRelative(0.06f, 1.0f, 0.41f, 2.22f, 1.054f, 3.454f)
                lineToRelative(4.312f, -2.489f)
                curveToRelative(-0.748f, -1.175f, -1.629f, -2.087f, -2.466f, -2.64f)
                curveToRelative(-0.963f, -0.636f, -1.725f, -0.714f, -2.19f, -0.445f)
                moveToRelative(2.194f, -0.71f)
                quadToRelative(0.279f, 0.143f, 0.547f, 0.32f)
                curveToRelative(0.984f, 0.65f, 1.968f, 1.686f, 2.782f, 2.975f)
                lineToRelative(1.72f, -0.994f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.05f, -2.301f)
                moveToRelative(-2.716f, 6.785f)
                curveToRelative(-0.71f, -1.35f, -1.115f, -2.719f, -1.185f, -3.896f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.004f, -0.634f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.533f, 5.524f)
                close()
            }
        }
            .build()
        return _sunshadeSunSandSmall!!
    }

private var _sunshadeSunSandSmall: ImageVector? = null
