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

public val SBBIcons.SignNoEntryLarge: ImageVector
    get() {
        if (_signNoEntryLarge != null) {
            return _signNoEntryLarge!!
        }
        _signNoEntryLarge = Builder(name = "SignNoEntryLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 16.009f)
                lineTo(44.0f, 32.99f)
                lineTo(31.991f, 45.0f)
                lineTo(15.01f, 45.0f)
                lineTo(3.0f, 32.991f)
                lineTo(3.0f, 16.01f)
                lineTo(15.009f, 4.0f)
                lineTo(31.99f, 4.0f)
                close()
                moveTo(4.0f, 16.423f)
                verticalLineToRelative(16.154f)
                lineTo(15.423f, 44.0f)
                horizontalLineToRelative(16.154f)
                lineTo(43.0f, 32.577f)
                lineTo(43.0f, 16.423f)
                lineTo(31.577f, 5.0f)
                lineTo(15.423f, 5.0f)
                close()
                moveTo(35.0f, 28.0f)
                lineTo(12.0f, 28.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(13.0f, 27.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-5.0f)
                lineTo(13.0f, 22.0f)
                close()
            }
        }
        .build()
        return _signNoEntryLarge!!
    }

private var _signNoEntryLarge: ImageVector? = null
