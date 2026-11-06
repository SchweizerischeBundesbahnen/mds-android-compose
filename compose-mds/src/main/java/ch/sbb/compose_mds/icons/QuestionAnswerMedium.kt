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

public val SBBIcons.QuestionAnswerMedium: ImageVector
    get() {
        if (_questionAnswerMedium != null) {
            return _questionAnswerMedium!!
        }
        _questionAnswerMedium = Builder(name = "QuestionAnswerMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.75f, 12.25f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(4.082f)
                lineToRelative(-4.082f, -4.082f)
                lineTo(13.75f, 26.75f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-0.418f)
                lineTo(9.25f, 26.332f)
                lineTo(9.25f, 22.25f)
                horizontalLineToRelative(-4.5f)
                lineTo(4.75f, 7.75f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(23.75f, 16.75f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(2.0f)
                lineTo(27.0f, 19.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(8.332f)
                lineToRelative(2.668f, 2.668f)
                lineTo(25.75f, 25.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-12.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(5.75f, 21.25f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.668f)
                lineToRelative(2.668f, -2.668f)
                horizontalLineToRelative(9.832f)
                lineTo(22.75f, 8.75f)
                horizontalLineToRelative(-17.0f)
                close()
                moveTo(14.508f, 18.942f)
                horizontalLineToRelative(-1.266f)
                verticalLineToRelative(-1.218f)
                horizontalLineToRelative(1.266f)
                close()
                moveTo(13.951f, 10.178f)
                quadToRelative(1.19f, 0.0f, 1.894f, 0.673f)
                quadToRelative(0.654f, 0.621f, 0.655f, 1.635f)
                quadToRelative(0.0f, 0.838f, -0.444f, 1.442f)
                quadToRelative(-0.2f, 0.274f, -0.955f, 1.012f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.467f, 0.537f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.185f, 0.53f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -0.058f, 0.82f)
                horizontalLineToRelative(-0.995f)
                quadToRelative(0.011f, -0.896f, 0.158f, -1.329f)
                quadToRelative(0.105f, -0.318f, 0.301f, -0.568f)
                quadToRelative(0.197f, -0.252f, 0.87f, -0.944f)
                quadToRelative(0.434f, -0.446f, 0.569f, -0.802f)
                quadToRelative(0.11f, -0.306f, 0.111f, -0.621f)
                quadToRelative(0.0f, -0.587f, -0.322f, -0.986f)
                quadToRelative(-0.388f, -0.486f, -1.143f, -0.486f)
                quadToRelative(-1.565f, 0.0f, -1.688f, 1.922f)
                horizontalLineToRelative(-1.006f)
                quadToRelative(0.04f, -1.09f, 0.427f, -1.688f)
                quadToRelative(0.356f, -0.55f, 0.95f, -0.85f)
                quadToRelative(0.591f, -0.298f, 1.328f, -0.297f)
            }
        }
        .build()
        return _questionAnswerMedium!!
    }

private var _questionAnswerMedium: ImageVector? = null
