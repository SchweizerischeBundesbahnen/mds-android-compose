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

public val SBBIcons.SpeechBubbleLarge: ImageVector
    get() {
        if (_speechBubbleLarge != null) {
            return _speechBubbleLarge!!
        }
        _speechBubbleLarge = Builder(
            name = "SpeechBubbleLarge",
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
                moveTo(39.0f, 35.0f)
                lineTo(19.207f, 35.0f)
                lineTo(14.0f, 40.207f)
                lineTo(14.0f, 35.0f)
                lineTo(8.0f, 35.0f)
                lineTo(8.0f, 12.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(9.0f, 34.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.793f)
                lineTo(18.793f, 34.0f)
                lineTo(38.0f, 34.0f)
                lineTo(38.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                close()
                moveTo(29.0f, 27.125f)
                lineTo(12.958f, 27.125f)
                verticalLineToRelative(-1.0f)
                lineTo(29.0f, 26.125f)
                close()
                moveTo(33.0f, 23.125f)
                lineTo(12.958f, 23.125f)
                verticalLineToRelative(-1.0f)
                lineTo(33.0f, 22.125f)
                close()
                moveTo(33.042f, 18.958f)
                lineTo(13.0f, 18.958f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(20.042f)
                close()
            }
        }
            .build()
        return _speechBubbleLarge!!
    }

private var _speechBubbleLarge: ImageVector? = null
