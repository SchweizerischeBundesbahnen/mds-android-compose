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

public val SmallGroup.PlatformDisplaySmall: ImageVector
    get() {
        if (_platformDisplaySmall != null) {
            return _platformDisplaySmall!!
        }
        _platformDisplaySmall = Builder(name = "PlatformDisplaySmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 9.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(22.0f, 9.0f)
                verticalLineToRelative(7.0f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(3.0f, 10.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 11.0f)
                close()
                moveTo(20.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-1.0f)
                lineTo(7.0f, 13.0f)
                close()
            }
        }
        .build()
        return _platformDisplaySmall!!
    }

private var _platformDisplaySmall: ImageVector? = null
