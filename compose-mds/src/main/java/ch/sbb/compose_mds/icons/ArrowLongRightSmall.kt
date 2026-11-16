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

public val SBBIcons.ArrowLongRightSmall: ImageVector
    get() {
        if (_arrowLongRightSmall != null) {
            return _arrowLongRightSmall!!
        }
        _arrowLongRightSmall = Builder(name = "ArrowLongRightSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.49f, 12.49f)
                lineToRelative(0.354f, -0.353f)
                close()
                moveTo(19.49f, 12.492f)
                verticalLineToRelative(-0.001f)
                lineToRelative(0.355f, 0.354f)
                close()
                moveTo(18.284f, 12.992f)
                lineTo(15.995f, 15.287f)
                lineTo(16.702f, 15.994f)
                lineTo(19.845f, 12.844f)
                lineTo(20.197f, 12.491f)
                lineTo(19.844f, 12.137f)
                lineTo(16.702f, 8.997f)
                lineTo(15.995f, 9.704f)
                lineTo(18.283f, 11.991f)
                lineTo(4.0f, 11.991f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _arrowLongRightSmall!!
    }

private var _arrowLongRightSmall: ImageVector? = null
