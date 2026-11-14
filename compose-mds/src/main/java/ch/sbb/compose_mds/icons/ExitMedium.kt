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

public val SBBIcons.ExitMedium: ImageVector
    get() {
        if (_exitMedium != null) {
            return _exitMedium!!
        }
        _exitMedium = Builder(name = "ExitMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.75f, 10.5f)
                lineTo(23.75f, 6.25f)
                horizontalLineToRelative(-19.0f)
                verticalLineToRelative(23.5f)
                horizontalLineToRelative(19.0f)
                lineTo(23.75f, 25.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-17.0f)
                lineTo(5.75f, 7.25f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(3.25f)
                close()
                moveTo(31.104f, 18.396f)
                lineTo(31.458f, 18.75f)
                lineTo(31.105f, 19.103f)
                lineTo(26.391f, 23.827f)
                lineTo(25.684f, 23.121f)
                lineTo(29.544f, 19.251f)
                lineTo(10.5f, 19.251f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.043f)
                lineToRelative(-3.859f, -3.859f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _exitMedium!!
    }

private var _exitMedium: ImageVector? = null
