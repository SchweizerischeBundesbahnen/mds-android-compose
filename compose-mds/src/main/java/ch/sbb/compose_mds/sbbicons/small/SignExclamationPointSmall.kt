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

public val SmallGroup.SignExclamationPointSmall: ImageVector
    get() {
        if (_signExclamationPointSmall != null) {
            return _signExclamationPointSmall!!
        }
        _signExclamationPointSmall = Builder(name = "SignExclamationPointSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.5f, 1.877f)
                lineToRelative(0.448f, 0.9f)
                lineToRelative(8.7f, 17.5f)
                lineToRelative(0.36f, 0.723f)
                lineTo(1.992f, 21.0f)
                lineToRelative(0.36f, -0.723f)
                lineToRelative(8.7f, -17.5f)
                close()
                moveTo(3.607f, 20.0f)
                horizontalLineToRelative(15.786f)
                lineTo(11.5f, 4.123f)
                close()
                moveTo(11.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 14.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _signExclamationPointSmall!!
    }

private var _signExclamationPointSmall: ImageVector? = null
