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

public val SBBIcons.CompassLocalisationLarge: ImageVector
    get() {
        if (_compassLocalisationLarge != null) {
            return _compassLocalisationLarge!!
        }
        _compassLocalisationLarge = Builder(
            name = "CompassLocalisationLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
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
                moveToRelative(32.95f, 24.703f)
                lineToRelative(-7.993f, 18.0f)
                lineToRelative(-0.457f, 1.028f)
                lineToRelative(-0.457f, -1.028f)
                lineToRelative(-8.001f, -18.0f)
                lineToRelative(-0.313f, -0.703f)
                horizontalLineToRelative(17.532f)
                close()
                moveTo(24.499f, 41.268f)
                lineTo(31.723f, 25.0f)
                lineTo(17.269f, 25.0f)
                close()
                moveTo(32.5f, 22.5f)
                horizontalLineToRelative(-16.0f)
                lineToRelative(8.0f, -18.0f)
                close()
            }
        }
            .build()
        return _compassLocalisationLarge!!
    }

private var _compassLocalisationLarge: ImageVector? = null
