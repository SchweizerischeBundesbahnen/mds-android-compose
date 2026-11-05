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

public val SBBIcons.LinkExternalLarge: ImageVector
    get() {
        if (_linkExternalLarge != null) {
            return _linkExternalLarge!!
        }
        _linkExternalLarge = Builder(
            name = "LinkExternalLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(26.0f, 16.0f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(23.0f)
                horizontalLineToRelative(23.0f)
                lineTo(32.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(18.0f)
                lineTo(8.0f, 40.0f)
                lineTo(8.0f, 15.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(39.0f, 16.998f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.293f)
                lineToRelative(-8.146f, 8.147f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(8.146f, -8.147f)
                lineTo(31.0f, 9.998f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
            .build()
        return _linkExternalLarge!!
    }

private var _linkExternalLarge: ImageVector? = null
