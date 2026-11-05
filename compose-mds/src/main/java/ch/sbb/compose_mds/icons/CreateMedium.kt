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

public val SBBIcons.CreateMedium: ImageVector
    get() {
        if (_createMedium != null) {
            return _createMedium!!
        }
        _createMedium = Builder(name = "CreateMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(21.0f)
                lineTo(26.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(16.0f)
                lineTo(4.0f, 32.0f)
                lineTo(4.0f, 9.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(28.0f, 11.0f)
                lineTo(20.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(8.0f, -8.0f)
                close()
                moveTo(18.0f, 16.4f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(1.6f)
                lineToRelative(7.0f, -7.0f)
                lineTo(25.0f, 9.4f)
                close()
                moveTo(32.0f, 7.0f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(27.4f, 7.0f)
                lineTo(29.0f, 8.6f)
                lineTo(30.6f, 7.0f)
                lineTo(29.0f, 5.4f)
                close()
            }
        }
        .build()
        return _createMedium!!
    }

private var _createMedium: ImageVector? = null
