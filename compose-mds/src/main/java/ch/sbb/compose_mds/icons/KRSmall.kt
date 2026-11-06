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

public val SBBIcons.KRSmall: ImageVector
    get() {
        if (_kRSmall != null) {
            return _kRSmall!!
        }
        _kRSmall = Builder(name = "KRSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.003f, 19.001f)
                lineTo(3.002f, 19.001f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(4.747f, 11.309f)
                lineToRelative(3.136f, -3.31f)
                horizontalLineToRelative(2.21f)
                lineTo(6.959f, 11.16f)
                lineTo(10.388f, 16.0f)
                lineTo(8.183f, 16.0f)
                lineToRelative(-2.43f, -3.59f)
                lineToRelative(-1.006f, 1.007f)
                verticalLineToRelative(2.583f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(1.746f)
                close()
                moveTo(17.821f, 7.999f)
                quadToRelative(1.15f, 0.0f, 1.763f, 0.36f)
                quadToRelative(0.508f, 0.295f, 0.776f, 0.787f)
                quadToRelative(0.27f, 0.494f, 0.27f, 1.112f)
                quadToRelative(0.0f, 0.701f, -0.337f, 1.22f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, true, -0.94f, 0.745f)
                quadToRelative(0.53f, 0.13f, 0.832f, 0.59f)
                quadToRelative(0.192f, 0.291f, 0.257f, 0.609f)
                quadToRelative(0.066f, 0.316f, 0.17f, 1.45f)
                quadToRelative(0.077f, 0.83f, 0.235f, 1.033f)
                lineToRelative(0.077f, 0.094f)
                lineTo(19.1f, 15.999f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -0.133f, -0.434f)
                quadToRelative(-0.041f, -0.262f, -0.107f, -1.214f)
                quadToRelative(-0.066f, -0.848f, -0.414f, -1.173f)
                reflectiveQuadToRelative(-1.184f, -0.326f)
                horizontalLineToRelative(-1.57f)
                verticalLineToRelative(3.147f)
                horizontalLineToRelative(-1.747f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(11.773f, 12.105f)
                horizontalLineToRelative(1.547f)
                verticalLineToRelative(0.882f)
                horizontalLineToRelative(-1.547f)
                verticalLineToRelative(1.542f)
                horizontalLineToRelative(-0.884f)
                verticalLineToRelative(-1.542f)
                lineTo(9.347f, 12.987f)
                verticalLineToRelative(-0.883f)
                horizontalLineToRelative(1.542f)
                verticalLineToRelative(-1.541f)
                horizontalLineToRelative(0.884f)
                close()
                moveTo(15.693f, 11.571f)
                horizontalLineToRelative(1.668f)
                quadToRelative(0.804f, 0.0f, 1.133f, -0.23f)
                quadToRelative(0.416f, -0.288f, 0.416f, -0.875f)
                quadToRelative(0.0f, -0.57f, -0.356f, -0.831f)
                quadToRelative(-0.354f, -0.264f, -1.122f, -0.264f)
                horizontalLineToRelative(-1.74f)
                close()
                moveTo(21.002f, 6.0f)
                lineTo(3.002f, 6.0f)
                lineTo(3.002f, 5.0f)
                horizontalLineToRelative(18.0f)
                close()
            }
        }
        .build()
        return _kRSmall!!
    }

private var _kRSmall: ImageVector? = null
