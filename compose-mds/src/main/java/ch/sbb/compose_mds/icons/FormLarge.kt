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

public val SBBIcons.FormLarge: ImageVector
    get() {
        if (_formLarge != null) {
            return _formLarge!!
        }
        _formLarge = Builder(name = "FormLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 6.0f)
                curveToRelative(1.586f, 0.0f, 2.494f, 0.552f, 2.99f, 1.194f)
                curveToRelative(0.222f, 0.289f, 0.345f, 0.578f, 0.415f, 0.806f)
                lineTo(31.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(33.0f)
                lineTo(8.0f, 43.0f)
                lineTo(8.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(4.095f)
                curveToRelative(0.07f, -0.228f, 0.193f, -0.517f, 0.416f, -0.806f)
                curveTo(21.006f, 6.552f, 21.914f, 6.0f, 23.5f, 6.0f)
                moveTo(9.0f, 11.0f)
                verticalLineToRelative(31.0f)
                horizontalLineToRelative(29.0f)
                lineTo(38.0f, 11.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                lineTo(16.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 37.0f)
                lineTo(13.0f, 37.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(34.0f, 31.0f)
                lineTo(13.0f, 31.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(34.0f, 25.0f)
                lineTo(13.0f, 25.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(34.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(23.5f, 7.0f)
                curveToRelative(-1.33f, 0.0f, -1.922f, 0.448f, -2.197f, 0.806f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, false, -0.3f, 0.68f)
                lineTo(21.0f, 8.521f)
                lineTo(20.98f, 9.0f)
                lineTo(17.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(13.0f)
                lineTo(30.0f, 9.0f)
                horizontalLineToRelative(-3.98f)
                lineTo(26.0f, 8.52f)
                horizontalLineToRelative(-0.001f)
                quadToRelative(0.0f, -0.01f, -0.003f, -0.034f)
                arcToRelative(1.553f, 1.553f, 0.0f, false, false, -0.299f, -0.68f)
                curveTo(25.422f, 7.448f, 24.83f, 7.0f, 23.5f, 7.0f)
            }
        }
        .build()
        return _formLarge!!
    }

private var _formLarge: ImageVector? = null
