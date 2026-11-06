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

public val SBBIcons.QuestionMarkMedium: ImageVector
    get() {
        if (_questionMarkMedium != null) {
            return _questionMarkMedium!!
        }
        _questionMarkMedium = Builder(name = "QuestionMarkMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.543f, 25.561f)
                verticalLineToRelative(2.91f)
                horizontalLineTo(16.52f)
                verticalLineToRelative(-2.91f)
                close()
                moveTo(18.215f, 7.543f)
                quadToRelative(2.839f, 0.0f, 4.517f, 1.609f)
                quadToRelative(1.569f, 1.483f, 1.568f, 3.902f)
                quadToRelative(0.0f, 2.002f, -1.064f, 3.442f)
                quadToRelative(-0.478f, 0.659f, -2.28f, 2.42f)
                quadToRelative(-0.797f, 0.77f, -1.112f, 1.28f)
                quadToRelative(-0.314f, 0.51f, -0.44f, 1.266f)
                quadToRelative(-0.141f, 0.755f, -0.141f, 1.96f)
                horizontalLineToRelative(-2.377f)
                quadToRelative(0.027f, -2.14f, 0.376f, -3.176f)
                quadToRelative(0.253f, -0.756f, 0.721f, -1.358f)
                quadToRelative(0.468f, -0.601f, 2.078f, -2.252f)
                quadToRelative(1.036f, -1.064f, 1.356f, -1.917f)
                quadToRelative(0.266f, -0.727f, 0.267f, -1.483f)
                quadToRelative(0.0f, -1.399f, -0.77f, -2.349f)
                quadToRelative(-0.924f, -1.16f, -2.729f, -1.16f)
                quadToRelative(-3.734f, -0.001f, -4.028f, 4.588f)
                horizontalLineToRelative(-2.406f)
                quadToRelative(0.097f, -2.602f, 1.022f, -4.03f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, true, 2.266f, -2.029f)
                quadToRelative(1.411f, -0.713f, 3.176f, -0.713f)
            }
        }
        .build()
        return _questionMarkMedium!!
    }

private var _questionMarkMedium: ImageVector? = null
