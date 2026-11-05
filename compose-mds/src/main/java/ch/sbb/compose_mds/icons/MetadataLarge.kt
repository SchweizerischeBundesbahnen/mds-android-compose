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

public val SBBIcons.MetadataLarge: ImageVector
    get() {
        if (_metadataLarge != null) {
            return _metadataLarge!!
        }
        _metadataLarge = Builder(name = "MetadataLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.0f, 41.0f)
                lineTo(4.0f, 41.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(39.0f)
                close()
                moveTo(5.0f, 40.0f)
                horizontalLineToRelative(37.0f)
                lineTo(42.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                close()
                moveTo(36.207f, 29.5f)
                lineTo(31.854f, 33.853f)
                lineTo(31.147f, 33.147f)
                lineTo(34.793f, 29.5f)
                lineTo(31.147f, 25.854f)
                lineTo(31.854f, 25.147f)
                close()
                moveTo(28.0f, 33.0f)
                lineTo(11.0f, 33.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
                moveTo(16.0f, 27.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(28.0f, 27.0f)
                lineTo(17.0f, 27.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(15.854f, 13.854f)
                lineTo(12.207f, 17.5f)
                lineToRelative(3.646f, 3.646f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-4.353f, -4.353f)
                lineToRelative(4.354f, -4.353f)
                close()
                moveTo(30.0f, 21.0f)
                lineTo(19.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(36.0f, 21.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(36.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                close()
            }
        }
        .build()
        return _metadataLarge!!
    }

private var _metadataLarge: ImageVector? = null
