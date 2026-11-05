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

public val SBBIcons.DoorMedium: ImageVector
    get() {
        if (_doorMedium != null) {
            return _doorMedium!!
        }
        _doorMedium = Builder(name = "DoorMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.75f, 28.75f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-27.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.75f)
                lineTo(15.25f, 6.25f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(16.25f, 28.75f)
                horizontalLineToRelative(9.5f)
                lineTo(25.75f, 7.25f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(24.0f, 19.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                lineTo(24.0f, 18.25f)
                close()
            }
        }
        .build()
        return _doorMedium!!
    }

private var _doorMedium: ImageVector? = null
