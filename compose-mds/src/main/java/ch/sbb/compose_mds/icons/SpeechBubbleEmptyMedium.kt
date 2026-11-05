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

public val SBBIcons.SpeechBubbleEmptyMedium: ImageVector
    get() {
        if (_speechBubbleEmptyMedium != null) {
            return _speechBubbleEmptyMedium!!
        }
        _speechBubbleEmptyMedium = Builder(name = "SpeechBubbleEmptyMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 9.25f)
                horizontalLineToRelative(23.5f)
                verticalLineToRelative(17.5f)
                horizontalLineTo(14.832f)
                lineToRelative(-3.228f, 3.229f)
                lineToRelative(-0.854f, 0.853f)
                verticalLineTo(26.75f)
                horizontalLineToRelative(-4.5f)
                verticalLineTo(9.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.668f)
                lineToRelative(2.521f, -2.522f)
                lineToRelative(0.147f, -0.146f)
                horizontalLineTo(28.75f)
                verticalLineToRelative(-15.5f)
                close()
            }
        }
        .build()
        return _speechBubbleEmptyMedium!!
    }

private var _speechBubbleEmptyMedium: ImageVector? = null
