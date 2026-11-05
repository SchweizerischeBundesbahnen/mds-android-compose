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

public val SBBIcons.PunctualitySmall: ImageVector
    get() {
        if (_punctualitySmall != null) {
            return _punctualitySmall!!
        }
        _punctualitySmall = Builder(
            name = "PunctualitySmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(12.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                arcTo(7.5f, 7.5f, 0.0f, true, true, 4.0f, 12.5f)
                verticalLineToRelative(-0.493f)
                lineTo(3.0f, 12.007f)
                verticalLineToRelative(0.494f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 9.0f, -8.486f)
                close()
                moveTo(11.407f, 16.29f)
                lineTo(16.407f, 9.29f)
                lineTo(15.593f, 8.71f)
                lineTo(10.936f, 15.23f)
                lineTo(8.354f, 12.647f)
                lineTo(7.646f, 13.354f)
                lineTo(10.646f, 16.354f)
                lineTo(11.064f, 16.771f)
                close()
                moveTo(10.042f, 5.127f)
                lineToRelative(-0.966f, 0.26f)
                lineToRelative(-0.26f, -0.967f)
                lineToRelative(0.967f, -0.259f)
                close()
                moveTo(7.317f, 6.255f)
                lineToRelative(0.866f, -0.5f)
                lineToRelative(-0.5f, -0.866f)
                lineToRelative(-0.866f, 0.5f)
                close()
                moveTo(6.55f, 6.843f)
                lineTo(5.843f, 7.55f)
                lineTo(5.136f, 6.843f)
                lineTo(5.843f, 6.136f)
                close()
                moveTo(4.755f, 9.183f)
                lineTo(5.255f, 8.317f)
                lineTo(4.389f, 7.817f)
                lineTo(3.889f, 8.683f)
                close()
                moveTo(4.385f, 10.076f)
                lineTo(4.126f, 11.042f)
                lineTo(3.16f, 10.782f)
                lineTo(3.42f, 9.817f)
                close()
            }
        }
            .build()
        return _punctualitySmall!!
    }

private var _punctualitySmall: ImageVector? = null
