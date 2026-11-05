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

public val SBBIcons.SpeechBubbleMedium: ImageVector
    get() {
        if (_speechBubbleMedium != null) {
            return _speechBubbleMedium!!
        }
        _speechBubbleMedium = Builder(name = "SpeechBubbleMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.75f, 9.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(4.082f)
                lineToRelative(0.854f, -0.853f)
                lineToRelative(3.228f, -3.229f)
                lineTo(29.75f, 26.75f)
                lineTo(29.75f, 9.25f)
                horizontalLineToRelative(-23.0f)
                moveToRelative(0.5f, 16.5f)
                verticalLineToRelative(-15.5f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(15.5f)
                lineTo(14.418f, 25.75f)
                lineToRelative(-0.147f, 0.146f)
                lineToRelative(-2.521f, 2.522f)
                lineTo(11.75f, 25.75f)
                horizontalLineToRelative(-4.5f)
                moveToRelative(3.25f, -11.031f)
                horizontalLineToRelative(15.032f)
                verticalLineToRelative(-1.0f)
                lineTo(10.5f, 13.719f)
                close()
                moveTo(25.5f, 17.844f)
                lineTo(10.469f, 17.844f)
                verticalLineToRelative(-1.0f)
                lineTo(25.5f, 16.844f)
                close()
                moveTo(10.469f, 20.844f)
                horizontalLineToRelative(11.968f)
                verticalLineToRelative(-1.0f)
                lineTo(10.469f, 19.844f)
                close()
            }
        }
        .build()
        return _speechBubbleMedium!!
    }

private var _speechBubbleMedium: ImageVector? = null
