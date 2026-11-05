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

public val SBBIcons.DocumentStandardLarge: ImageVector
    get() {
        if (_documentStandardLarge != null) {
            return _documentStandardLarge!!
        }
        _documentStandardLarge = Builder(name = "DocumentStandardLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.0f, 18.293f)
                lineTo(35.0f, 39.0f)
                lineTo(12.0f, 39.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineToRelative(12.707f)
                close()
                moveTo(13.0f, 38.0f)
                horizontalLineToRelative(21.0f)
                lineTo(34.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(25.0f, 18.0f)
                horizontalLineToRelative(8.293f)
                lineTo(25.0f, 9.707f)
                close()
            }
        }
        .build()
        return _documentStandardLarge!!
    }

private var _documentStandardLarge: ImageVector? = null
