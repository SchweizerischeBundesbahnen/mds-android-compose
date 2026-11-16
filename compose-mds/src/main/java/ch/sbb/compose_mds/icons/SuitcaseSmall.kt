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

public val SBBIcons.SuitcaseSmall: ImageVector
    get() {
        if (_suitcaseSmall != null) {
            return _suitcaseSmall!!
        }
        _suitcaseSmall = Builder(name = "SuitcaseSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 7.009f)
                verticalLineToRelative(-3.0f)
                lineTo(9.0f, 4.009f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 7.009f)
                lineTo(3.0f, 21.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 7.009f)
                close()
                moveTo(14.0f, 7.009f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(20.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 8.009f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _suitcaseSmall!!
    }

private var _suitcaseSmall: ImageVector? = null
