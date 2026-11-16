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

public val SBBIcons.NextSmall: ImageVector
    get() {
        if (_nextSmall != null) {
            return _nextSmall!!
        }
        _nextSmall = Builder(name = "NextSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.417f, 12.0f)
                lineTo(4.772f, 5.081f)
                lineTo(4.0f, 4.579f)
                verticalLineToRelative(14.842f)
                lineToRelative(0.772f, -0.502f)
                close()
                moveTo(9.227f, 14.831f)
                lineTo(5.0f, 17.578f)
                lineTo(5.0f, 6.421f)
                lineToRelative(4.228f, 2.748f)
                lineTo(13.583f, 12.0f)
                close()
                moveTo(16.002f, 19.0f)
                horizontalLineToRelative(4.0f)
                lineTo(20.002f, 5.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(19.002f, 18.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.002f, 6.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _nextSmall!!
    }

private var _nextSmall: ImageVector? = null
