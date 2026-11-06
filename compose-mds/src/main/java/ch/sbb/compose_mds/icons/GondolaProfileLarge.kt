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

public val SBBIcons.GondolaProfileLarge: ImageVector
    get() {
        if (_gondolaProfileLarge != null) {
            return _gondolaProfileLarge!!
        }
        _gondolaProfileLarge = Builder(name = "GondolaProfileLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.644f, 4.979f)
                lineTo(17.0f, 12.97f)
                lineTo(17.0f, 21.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(13.676f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.128f, 0.79f)
                lineToRelative(-1.441f, 4.325f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.059f, 44.0f)
                lineTo(11.94f, 44.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.372f, -1.709f)
                lineToRelative(-1.441f, -4.325f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.128f, -0.79f)
                lineTo(7.999f, 23.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                lineTo(16.0f, 21.0f)
                verticalLineToRelative(-7.728f)
                lineTo(3.644f, 16.979f)
                lineToRelative(-0.288f, -0.957f)
                lineToRelative(40.0f, -12.0f)
                close()
                moveTo(9.86f, 40.0f)
                lineToRelative(0.659f, 1.975f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.94f, 43.0f)
                horizontalLineToRelative(9.118f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.422f, -1.025f)
                lineTo(23.14f, 40.0f)
                close()
                moveTo(10.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 23.5f)
                verticalLineToRelative(13.676f)
                quadToRelative(0.0f, 0.242f, 0.077f, 0.473f)
                lineTo(9.527f, 39.0f)
                horizontalLineToRelative(13.946f)
                lineToRelative(0.45f, -1.35f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.077f, -0.474f)
                lineTo(24.0f, 23.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(21.0f, 34.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(13.0f, 33.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _gondolaProfileLarge!!
    }

private var _gondolaProfileLarge: ImageVector? = null
