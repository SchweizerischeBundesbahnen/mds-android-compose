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

public val SBBIcons.QuestionAnswerSmall: ImageVector
    get() {
        if (_questionAnswerSmall != null) {
            return _questionAnswerSmall!!
        }
        _questionAnswerSmall = Builder(
            name = "QuestionAnswerSmall",
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
                pathFillType = NonZero,
            ) {
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.957f)
                lineTo(15.043f, 18.0f)
                lineTo(9.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-0.043f)
                lineTo(6.0f, 17.957f)
                lineTo(6.0f, 15.0f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.457f)
                lineTo(17.0f, 18.543f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                lineTo(20.0f, 9.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.543f)
                lineTo(8.543f, 14.0f)
                lineTo(15.0f, 14.0f)
                lineTo(15.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(9.672f, 12.628f)
                horizontalLineToRelative(-0.844f)
                verticalLineToRelative(-0.812f)
                horizontalLineToRelative(0.844f)
                close()
                moveTo(9.3f, 6.785f)
                quadToRelative(0.794f, 0.0f, 1.262f, 0.45f)
                quadToRelative(0.437f, 0.412f, 0.437f, 1.09f)
                quadToRelative(0.0f, 0.557f, -0.296f, 0.96f)
                quadToRelative(-0.133f, 0.183f, -0.637f, 0.675f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.311f, 0.358f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.123f, 0.353f)
                quadToRelative(-0.04f, 0.21f, -0.04f, 0.547f)
                lineTo(8.93f, 11.218f)
                quadToRelative(0.009f, -0.598f, 0.106f, -0.886f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, 0.201f, -0.379f)
                quadToRelative(0.131f, -0.168f, 0.58f, -0.629f)
                quadToRelative(0.29f, -0.298f, 0.38f, -0.535f)
                quadToRelative(0.073f, -0.204f, 0.074f, -0.414f)
                quadToRelative(0.0f, -0.391f, -0.216f, -0.657f)
                quadToRelative(-0.258f, -0.324f, -0.762f, -0.324f)
                quadToRelative(-1.043f, 0.0f, -1.125f, 1.28f)
                horizontalLineToRelative(-0.67f)
                quadToRelative(0.026f, -0.725f, 0.284f, -1.124f)
                quadToRelative(0.238f, -0.366f, 0.633f, -0.566f)
                quadToRelative(0.394f, -0.2f, 0.886f, -0.199f)
            }
        }
            .build()
        return _questionAnswerSmall!!
    }

private var _questionAnswerSmall: ImageVector? = null
