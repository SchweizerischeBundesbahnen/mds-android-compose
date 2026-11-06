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

public val SBBIcons.PreviousMedium: ImageVector
    get() {
        if (_previousMedium != null) {
            return _previousMedium!!
        }
        _previousMedium = Builder(name = "PreviousMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(29.752f, 28.67f)
                lineToRelative(-0.772f, -0.502f)
                lineTo(13.335f, 18.0f)
                lineTo(28.98f, 7.83f)
                lineToRelative(0.772f, -0.501f)
                close()
                moveTo(11.75f, 28.25f)
                horizontalLineToRelative(-5.5f)
                lineTo(6.25f, 7.75f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(7.25f, 27.25f)
                horizontalLineToRelative(3.5f)
                lineTo(10.75f, 8.75f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(22.024f, 13.544f)
                lineTo(15.17f, 18.0f)
                lineToRelative(6.855f, 4.456f)
                lineToRelative(6.728f, 4.372f)
                lineTo(28.753f, 9.17f)
                close()
            }
        }
        .build()
        return _previousMedium!!
    }

private var _previousMedium: ImageVector? = null
