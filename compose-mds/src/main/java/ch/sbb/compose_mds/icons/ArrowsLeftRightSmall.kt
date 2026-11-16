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

public val SBBIcons.ArrowsLeftRightSmall: ImageVector
    get() {
        if (_arrowsLeftRightSmall != null) {
            return _arrowsLeftRightSmall!!
        }
        _arrowsLeftRightSmall = Builder(name = "ArrowsLeftRightSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(3.957f, 10.0f)
                lineToRelative(2.647f, -2.647f)
                lineToRelative(-0.708f, -0.707f)
                lineTo(2.043f, 10.5f)
                lineToRelative(3.853f, 3.853f)
                lineToRelative(0.708f, -0.707f)
                lineTo(3.957f, 11.0f)
                lineToRelative(11.041f, 0.002f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.104f, 17.354f)
                lineTo(21.957f, 13.5f)
                lineTo(18.103f, 9.647f)
                lineTo(17.396f, 10.354f)
                lineTo(20.043f, 13.0f)
                lineTo(9.0f, 12.998f)
                verticalLineToRelative(1.0f)
                lineTo(20.043f, 14.0f)
                lineToRelative(-2.646f, 2.647f)
                close()
            }
        }
        .build()
        return _arrowsLeftRightSmall!!
    }

private var _arrowsLeftRightSmall: ImageVector? = null
