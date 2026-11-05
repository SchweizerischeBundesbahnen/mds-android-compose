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

public val SBBIcons.GeneralDisplayLarge: ImageVector
    get() {
        if (_generalDisplayLarge != null) {
            return _generalDisplayLarge!!
        }
        _generalDisplayLarge = Builder(name = "GeneralDisplayLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.999f, 11.0f)
                horizontalLineToRelative(29.003f)
                lineTo(38.002f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                lineTo(43.0f, 11.0f)
                verticalLineToRelative(29.0f)
                lineTo(4.0f, 40.0f)
                lineTo(4.0f, 11.0f)
                horizontalLineToRelative(3.999f)
                lineTo(7.999f, 8.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(5.0f, 39.0f)
                horizontalLineToRelative(37.0f)
                lineTo(42.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                close()
                moveTo(28.0f, 36.001f)
                lineTo(7.0f, 36.001f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(28.0f, 32.001f)
                lineTo(7.0f, 32.001f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(28.0f, 28.001f)
                lineTo(7.0f, 28.001f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(28.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(34.5f, 15.0f)
                curveToRelative(2.508f, 0.0f, 4.5f, 1.992f, 4.5f, 4.5f)
                reflectiveCurveTo(37.008f, 24.0f, 34.5f, 24.0f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, true, -4.5f, -4.5f)
                curveToRelative(0.0f, -2.508f, 1.994f, -4.5f, 4.5f, -4.5f)
                moveToRelative(0.5f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.965f)
                curveToRelative(-1.711f, 0.238f, -3.0f, 1.68f, -3.0f, 3.465f)
                curveToRelative(0.0f, 1.956f, 1.546f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.956f, 0.0f, 3.5f, -1.544f, 3.5f, -3.5f)
                arcToRelative(3.466f, 3.466f, 0.0f, false, false, -3.0f, -3.465f)
                close()
                moveTo(28.0f, 20.0f)
                lineTo(7.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(28.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(21.0f)
                close()
            }
        }
        .build()
        return _generalDisplayLarge!!
    }

private var _generalDisplayLarge: ImageVector? = null
