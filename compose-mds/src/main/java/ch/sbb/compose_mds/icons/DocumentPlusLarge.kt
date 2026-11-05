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

public val SBBIcons.DocumentPlusLarge: ImageVector
    get() {
        if (_documentPlusLarge != null) {
            return _documentPlusLarge!!
        }
        _documentPlusLarge = Builder(name = "DocumentPlusLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.0f, 38.0f)
                horizontalLineToRelative(4.998f)
                verticalLineToRelative(1.0f)
                lineTo(35.0f, 39.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.002f)
                verticalLineToRelative(-1.0f)
                lineTo(34.0f, 38.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(35.0f, 18.293f)
                lineTo(35.0f, 30.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(34.0f, 18.993f)
                lineTo(24.0f, 18.993f)
                lineTo(24.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                verticalLineToRelative(29.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(1.0f)
                lineTo(12.0f, 39.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineToRelative(12.707f)
                close()
                moveTo(30.0f, 33.0f)
                lineTo(17.0f, 33.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(29.999f, 29.0f)
                lineTo(16.995f, 29.0f)
                verticalLineToRelative(-1.0f)
                lineTo(30.0f, 28.0f)
                close()
                moveTo(30.0f, 25.0f)
                lineTo(17.0f, 25.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(25.0f, 17.993f)
                horizontalLineToRelative(8.286f)
                lineTo(25.0f, 9.707f)
                close()
            }
        }
        .build()
        return _documentPlusLarge!!
    }

private var _documentPlusLarge: ImageVector? = null
