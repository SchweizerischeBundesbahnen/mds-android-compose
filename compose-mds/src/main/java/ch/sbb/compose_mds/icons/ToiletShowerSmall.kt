package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ToiletShowerSmall: ImageVector
    get() {
        if (_toiletShowerSmall != null) {
            return _toiletShowerSmall!!
        }
        _toiletShowerSmall = Builder(
            name = "ToiletShowerSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(6.0f, 15.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -5.0f, 4.47f)
                lineTo(6.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                close()
                moveTo(14.0f, 21.0f)
                horizontalLineToRelative(7.0f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(-2.999f)
                verticalLineToRelative(1.087f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 5.5f)
                lineTo(19.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.001f, -1.414f)
                lineTo(17.001f, 3.0f)
                lineTo(14.0f, 3.0f)
                close()
                moveTo(6.0f, 18.963f)
                quadToRelative(0.245f, 0.036f, 0.5f, 0.037f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.464f, -3.0f)
                lineTo(6.0f, 16.0f)
                close()
                moveTo(19.001f, 11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.001f, 10.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.001f, 9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.001f, 8.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.001f, 7.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _toiletShowerSmall!!
    }

private var _toiletShowerSmall: ImageVector? = null
