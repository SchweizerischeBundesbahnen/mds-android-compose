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

public val SBBIcons.ArrowTurnDownSmall: ImageVector
    get() {
        if (_arrowTurnDownSmall != null) {
            return _arrowTurnDownSmall!!
        }
        _arrowTurnDownSmall = Builder(name = "ArrowTurnDownSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.0f, 13.5f)
                curveToRelative(0.0f, -2.884f, 0.86f, -4.728f, 2.17f, -5.862f)
                curveTo(13.494f, 6.492f, 15.358f, 6.0f, 17.5f, 6.0f)
                verticalLineTo(5.0f)
                curveToRelative(-2.276f, 0.0f, -4.412f, 0.52f, -5.984f, 1.882f)
                curveTo(9.93f, 8.255f, 9.0f, 10.41f, 9.0f, 13.5f)
                verticalLineToRelative(3.777f)
                lineToRelative(-2.287f, -2.282f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(3.15f, 3.142f)
                lineToRelative(0.353f, 0.352f)
                lineToRelative(0.353f, -0.353f)
                lineToRelative(3.141f, -3.142f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(10.0f, 17.292f)
                close()
            }
        }
        .build()
        return _arrowTurnDownSmall!!
    }

private var _arrowTurnDownSmall: ImageVector? = null
