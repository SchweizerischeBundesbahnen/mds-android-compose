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

public val SBBIcons.DocumentCheckLarge: ImageVector
    get() {
        if (_documentCheckLarge != null) {
            return _documentCheckLarge!!
        }
        _documentCheckLarge = Builder(name = "DocumentCheckLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(25.853f, 8.146f)
                lineToRelative(9.996f, 9.989f)
                lineToRelative(0.146f, 0.145f)
                verticalLineToRelative(0.208f)
                lineTo(36.0f, 38.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-23.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.008f, -30.0f)
                lineTo(12.992f, 8.0f)
                horizontalLineToRelative(12.715f)
                close()
                moveTo(13.999f, 38.0f)
                horizontalLineToRelative(21.0f)
                lineToRelative(-0.004f, -19.012f)
                lineToRelative(-9.494f, 0.012f)
                lineToRelative(-0.501f, 0.001f)
                lineTo(25.0f, 9.0f)
                lineTo(13.991f, 9.0f)
                close()
                moveTo(32.853f, 27.854f)
                lineTo(26.5f, 34.207f)
                lineToRelative(-2.354f, -2.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(1.647f, 1.647f)
                lineToRelative(5.647f, -5.646f)
                close()
                moveTo(23.0f, 33.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(32.853f, 21.854f)
                lineTo(26.5f, 28.207f)
                lineToRelative(-2.354f, -2.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(1.647f, 1.647f)
                lineToRelative(5.647f, -5.646f)
                close()
                moveTo(23.0f, 27.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(26.0f, 17.999f)
                lineTo(34.288f, 17.989f)
                lineTo(26.0f, 9.707f)
                close()
            }
        }
        .build()
        return _documentCheckLarge!!
    }

private var _documentCheckLarge: ImageVector? = null
