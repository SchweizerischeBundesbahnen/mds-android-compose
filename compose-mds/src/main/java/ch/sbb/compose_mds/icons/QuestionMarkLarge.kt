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

public val SBBIcons.QuestionMarkLarge: ImageVector
    get() {
        if (_questionMarkLarge != null) {
            return _questionMarkLarge!!
        }
        _questionMarkLarge = Builder(name = "QuestionMarkLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.558f, 33.582f)
                verticalLineToRelative(3.878f)
                horizontalLineToRelative(-4.03f)
                verticalLineToRelative(-3.878f)
                close()
                moveTo(23.786f, 9.558f)
                quadToRelative(3.786f, 0.0f, 6.024f, 2.143f)
                quadToRelative(2.09f, 1.98f, 2.09f, 5.205f)
                quadToRelative(0.0f, 2.667f, -1.418f, 4.588f)
                quadToRelative(-0.636f, 0.877f, -3.04f, 3.228f)
                quadToRelative(-1.065f, 1.027f, -1.484f, 1.706f)
                quadToRelative(-0.419f, 0.68f, -0.586f, 1.688f)
                quadToRelative(-0.189f, 1.006f, -0.188f, 2.612f)
                horizontalLineToRelative(-3.17f)
                quadToRelative(0.037f, -2.854f, 0.502f, -4.235f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.962f, -1.809f)
                quadToRelative(0.624f, -0.802f, 2.77f, -3.002f)
                quadToRelative(1.381f, -1.418f, 1.808f, -2.556f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 0.356f, -1.978f)
                quadToRelative(0.0f, -1.864f, -1.026f, -3.132f)
                quadToRelative(-1.232f, -1.548f, -3.638f, -1.548f)
                quadToRelative(-4.98f, -0.001f, -5.372f, 6.118f)
                horizontalLineToRelative(-3.208f)
                quadToRelative(0.129f, -3.47f, 1.362f, -5.372f)
                arcToRelative(7.64f, 7.64f, 0.0f, false, true, 3.022f, -2.706f)
                quadToRelative(1.882f, -0.95f, 4.234f, -0.95f)
            }
        }
        .build()
        return _questionMarkLarge!!
    }

private var _questionMarkLarge: ImageVector? = null
