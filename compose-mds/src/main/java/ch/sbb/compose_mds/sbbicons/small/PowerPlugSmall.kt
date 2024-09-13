package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.PowerPlugSmall: ImageVector
    get() {
        if (_powerPlugSmall != null) {
            return _powerPlugSmall!!
        }
        _powerPlugSmall = Builder(name = "PowerPlugSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                lineTo(9.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.998f, 1.616f, 4.0f, 4.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(2.1f, 0.0f, 4.0f, -1.68f, 4.0f, -4.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(11.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.507f, 1.228f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.582f, 0.0f, 3.0f, -1.266f, 3.0f, -3.0f)
                lineTo(18.0f, 8.0f)
                close()
            }
        }
        .build()
        return _powerPlugSmall!!
    }

private var _powerPlugSmall: ImageVector? = null