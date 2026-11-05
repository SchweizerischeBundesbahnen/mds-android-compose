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

public val SBBIcons.ShelvesPansBottlesPlatesSmall: ImageVector
    get() {
        if (_shelvesPansBottlesPlatesSmall != null) {
            return _shelvesPansBottlesPlatesSmall!!
        }
        _shelvesPansBottlesPlatesSmall = Builder(
            name = "ShelvesPansBottlesPlatesSmall",
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
                moveTo(3.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 6.0f)
                horizontalLineToRelative(-0.999f)
                lineTo(4.001f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.001f)
                verticalLineToRelative(1.0f)
                lineTo(11.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.998f)
                lineTo(12.998f, 6.0f)
                horizontalLineToRelative(1.003f)
                lineTo(14.001f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(0.997f)
                lineTo(16.998f, 6.0f)
                horizontalLineToRelative(1.003f)
                lineTo(18.001f, 4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(2.262f)
                lineToRelative(-0.726f, -1.814f)
                lineToRelative(-0.274f, -0.686f)
                horizontalLineToRelative(0.8f)
                lineToRelative(-0.526f, -1.315f)
                lineToRelative(-0.274f, -0.685f)
                horizontalLineToRelative(6.476f)
                lineToRelative(-0.274f, 0.685f)
                lineToRelative(-0.526f, 1.315f)
                horizontalLineToRelative(0.8f)
                lineToRelative(-0.274f, 0.686f)
                lineTo(9.738f, 19.0f)
                lineTo(14.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.999f)
                verticalLineToRelative(-1.0f)
                lineTo(19.0f, 15.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                lineTo(3.0f, 12.0f)
                close()
                moveTo(6.338f, 19.0f)
                horizontalLineToRelative(2.324f)
                lineToRelative(0.6f, -1.5f)
                lineTo(5.738f, 17.5f)
                close()
                moveTo(15.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(6.139f, 16.5f)
                lineTo(8.86f, 16.5f)
                lineToRelative(0.4f, -1.0f)
                lineTo(5.739f, 15.5f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                lineTo(10.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(17.998f, 11.0f)
                horizontalLineToRelative(1.003f)
                lineTo(19.001f, 7.0f)
                horizontalLineToRelative(-1.003f)
                close()
                moveTo(13.998f, 11.0f)
                horizontalLineToRelative(1.003f)
                lineTo(15.001f, 7.0f)
                horizontalLineToRelative(-1.003f)
                close()
            }
        }
            .build()
        return _shelvesPansBottlesPlatesSmall!!
    }

private var _shelvesPansBottlesPlatesSmall: ImageVector? = null
