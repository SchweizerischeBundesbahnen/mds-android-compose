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

public val SBBIcons.ParkAndRailSmall: ImageVector
    get() {
        if (_parkAndRailSmall != null) {
            return _parkAndRailSmall!!
        }
        _parkAndRailSmall = Builder(
            name = "ParkAndRailSmall",
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
                pathFillType = NonZero,
            ) {
                moveTo(21.002f, 19.001f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(17.896f, 7.998f)
                quadToRelative(1.148f, 0.0f, 1.761f, 0.36f)
                quadToRelative(0.51f, 0.296f, 0.778f, 0.788f)
                quadToRelative(0.268f, 0.494f, 0.268f, 1.112f)
                quadToRelative(0.0f, 0.701f, -0.337f, 1.22f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, true, -0.938f, 0.745f)
                quadToRelative(0.53f, 0.131f, 0.831f, 0.59f)
                quadToRelative(0.192f, 0.291f, 0.258f, 0.609f)
                quadToRelative(0.066f, 0.316f, 0.17f, 1.45f)
                quadToRelative(0.076f, 0.83f, 0.234f, 1.033f)
                lineToRelative(0.076f, 0.094f)
                horizontalLineToRelative(-1.822f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.134f, -0.434f)
                quadToRelative(-0.04f, -0.262f, -0.105f, -1.214f)
                quadToRelative(-0.066f, -0.848f, -0.414f, -1.173f)
                reflectiveQuadToRelative(-1.186f, -0.326f)
                horizontalLineToRelative(-1.57f)
                verticalLineToRelative(3.147f)
                horizontalLineToRelative(-1.745f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(6.218f, 7.998f)
                quadToRelative(0.816f, 0.0f, 1.284f, 0.1f)
                quadToRelative(0.468f, 0.102f, 0.846f, 0.359f)
                quadToRelative(1.046f, 0.7f, 1.046f, 2.113f)
                quadToRelative(0.0f, 1.253f, -0.865f, 1.97f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.837f, 0.441f)
                quadToRelative(-0.471f, 0.135f, -1.161f, 0.134f)
                lineTo(4.736f, 13.115f)
                verticalLineToRelative(2.883f)
                lineTo(2.99f, 15.998f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(11.838f, 12.105f)
                horizontalLineToRelative(1.549f)
                verticalLineToRelative(0.882f)
                horizontalLineToRelative(-1.549f)
                verticalLineToRelative(1.542f)
                horizontalLineToRelative(-0.884f)
                verticalLineToRelative(-1.542f)
                lineTo(9.412f, 12.987f)
                verticalLineToRelative(-0.883f)
                horizontalLineToRelative(1.542f)
                verticalLineToRelative(-1.541f)
                horizontalLineToRelative(0.884f)
                close()
                moveTo(4.736f, 11.741f)
                horizontalLineToRelative(1.56f)
                quadToRelative(0.693f, 0.0f, 1.001f, -0.246f)
                quadToRelative(0.377f, -0.307f, 0.377f, -0.903f)
                quadToRelative(0.0f, -0.602f, -0.437f, -0.898f)
                quadToRelative(-0.317f, -0.22f, -1.035f, -0.22f)
                lineTo(4.736f, 9.474f)
                close()
                moveTo(15.766f, 11.571f)
                horizontalLineToRelative(1.67f)
                quadToRelative(0.804f, 0.0f, 1.133f, -0.23f)
                quadToRelative(0.416f, -0.288f, 0.416f, -0.875f)
                quadToRelative(0.0f, -0.57f, -0.357f, -0.831f)
                quadToRelative(-0.355f, -0.264f, -1.122f, -0.264f)
                horizontalLineToRelative(-1.74f)
                close()
                moveTo(21.003f, 6.0f)
                horizontalLineToRelative(-18.0f)
                lineTo(3.003f, 5.0f)
                horizontalLineToRelative(18.0f)
                close()
            }
        }
            .build()
        return _parkAndRailSmall!!
    }

private var _parkAndRailSmall: ImageVector? = null
