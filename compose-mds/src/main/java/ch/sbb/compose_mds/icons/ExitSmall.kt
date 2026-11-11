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

public val SBBIcons.ExitSmall: ImageVector
    get() {
        if (_exitSmall != null) {
            return _exitSmall!!
        }
        _exitSmall = Builder(name = "ExitSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 7.0f)
                lineTo(16.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 19.0f)
                lineTo(4.0f, 5.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.854f, 12.146f)
                lineTo(20.5f, 12.499f)
                verticalLineToRelative(0.002f)
                lineToRelative(0.355f, 0.352f)
                lineToRelative(-3.143f, 3.15f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(19.294f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.293f)
                lineToRelative(-2.288f, -2.287f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(20.854f, 12.146f)
                lineTo(21.207f, 12.5f)
                lineTo(20.855f, 12.853f)
                lineTo(20.5f, 12.5f)
                close()
            }
        }
        .build()
        return _exitSmall!!
    }

private var _exitSmall: ImageVector? = null
