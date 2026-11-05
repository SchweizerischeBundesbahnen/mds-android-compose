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

public val SBBIcons.QuestionAnswerLarge: ImageVector
    get() {
        if (_questionAnswerLarge != null) {
            return _questionAnswerLarge!!
        }
        _questionAnswerLarge = Builder(
            name = "QuestionAnswerLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(31.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(4.613f)
                lineToRelative(-0.832f, -0.739f)
                lineTo(29.81f, 35.0f)
                lineTo(18.0f, 35.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-0.81f)
                lineToRelative(-4.358f, 3.874f)
                lineToRelative(-0.832f, 0.74f)
                lineTo(12.0f, 29.0f)
                lineTo(6.0f, 29.0f)
                lineTo(6.0f, 10.0f)
                horizontalLineToRelative(25.0f)
                close()
                moveTo(31.0f, 20.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.0f)
                lineTo(19.0f, 29.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(11.19f)
                lineToRelative(0.142f, 0.126f)
                lineTo(34.0f, 37.386f)
                lineTo(34.0f, 34.0f)
                horizontalLineToRelative(6.0f)
                lineTo(40.0f, 17.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(7.0f, 28.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.386f)
                lineToRelative(3.668f, -3.26f)
                lineToRelative(0.142f, -0.126f)
                lineTo(30.0f, 28.0f)
                lineTo(30.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                close()
                moveTo(19.21f, 25.0f)
                horizontalLineToRelative(-1.14f)
                verticalLineToRelative(-1.51f)
                horizontalLineToRelative(1.14f)
                close()
                moveTo(18.73f, 14.0f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, 2.35f, 0.85f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, true, 0.79f, 1.94f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, true, -0.61f, 1.82f)
                quadToRelative(-0.554f, 0.665f, -1.2f, 1.24f)
                quadToRelative(-0.34f, 0.309f, -0.62f, 0.67f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.24f, 0.61f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -0.1f, 1.19f)
                horizontalLineToRelative(-0.9f)
                curveToRelative(-0.02f, -0.574f, 0.05f, -1.148f, 0.21f, -1.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.37f, -0.63f)
                curveToRelative(0.15f, -0.18f, 0.53f, -0.58f, 1.15f, -1.19f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 1.0f, -1.95f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.53f, -1.38f)
                arcToRelative(2.17f, 2.17f, 0.0f, false, false, -1.65f, -0.63f)
                arcToRelative(2.18f, 2.18f, 0.0f, false, false, -2.0f, 1.11f)
                arcToRelative(3.65f, 3.65f, 0.0f, false, false, -0.37f, 1.62f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, true, 0.51f, -2.11f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 1.17f, -1.08f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 1.67f, -0.38f)
            }
        }
            .build()
        return _questionAnswerLarge!!
    }

private var _questionAnswerLarge: ImageVector? = null
