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

public val SBBIcons.CopyLarge: ImageVector
    get() {
        if (_copyLarge != null) {
            return _copyLarge!!
        }
        _copyLarge = Builder(name = "CopyLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(37.97f, 33.921f)
                lineTo(30.0f, 33.921f)
                verticalLineToRelative(6.08f)
                lineTo(11.0f, 40.001f)
                lineTo(11.0f, 15.0f)
                horizontalLineToRelative(7.97f)
                lineTo(18.97f, 8.92f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(12.0f, 39.001f)
                horizontalLineToRelative(17.0f)
                lineTo(29.0f, 16.0f)
                lineTo(12.0f, 16.0f)
                close()
                moveTo(19.97f, 15.001f)
                lineTo(30.0f, 15.001f)
                verticalLineToRelative(17.92f)
                horizontalLineToRelative(6.97f)
                verticalLineToRelative(-23.0f)
                horizontalLineToRelative(-17.0f)
                close()
            }
        }
        .build()
        return _copyLarge!!
    }

private var _copyLarge: ImageVector? = null
