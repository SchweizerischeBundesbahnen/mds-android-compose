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

public val SBBIcons.TranslateSmall: ImageVector
    get() {
        if (_translateSmall != null) {
            return _translateSmall!!
        }
        _translateSmall = Builder(name = "TranslateSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.028f)
                lineToRelative(0.854f, -0.854f)
                lineTo(8.0f, 13.028f)
                lineTo(8.0f, 20.0f)
                horizontalLineToRelative(8.002f)
                lineToRelative(2.144f, 2.145f)
                lineToRelative(0.854f, 0.853f)
                lineTo(19.0f, 20.0f)
                horizontalLineToRelative(3.0f)
                lineTo(22.0f, 10.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(16.0f, 3.0f)
                lineTo(2.5f, 3.0f)
                moveTo(15.0f, 10.0f)
                lineTo(15.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.614f)
                lineToRelative(2.0f, -2.0f)
                lineTo(8.0f, 10.0f)
                horizontalLineToRelative(7.0f)
                moveToRelative(6.0f, 9.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.584f)
                lineToRelative(-1.437f, -1.438f)
                lineToRelative(-0.147f, -0.146f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(12.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(20.0f, 13.0f)
                verticalLineToRelative(1.0f)
                lineTo(10.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(20.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                lineTo(10.0f, 15.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(2.0f, 19.5f)
                lineTo(2.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.085f)
                lineToRelative(-0.914f, -0.914f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(1.768f, 1.768f)
                lineTo(7.0f, 19.5f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-1.768f, 1.767f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(0.915f, -0.914f)
                lineTo(2.0f, 19.999f)
                close()
                moveTo(18.914f, 5.0f)
                lineTo(22.0f, 5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(-2.086f)
                lineToRelative(0.914f, 0.914f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-1.768f, -1.768f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(1.768f, -1.767f)
                lineToRelative(0.707f, 0.707f)
                close()
            }
        }
        .build()
        return _translateSmall!!
    }

private var _translateSmall: ImageVector? = null
