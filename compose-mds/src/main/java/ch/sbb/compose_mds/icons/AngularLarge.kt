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

public val SBBIcons.AngularLarge: ImageVector
    get() {
        if (_angularLarge != null) {
            return _angularLarge!!
        }
        _angularLarge = Builder(
            name = "AngularLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveToRelative(42.658f, 10.025f)
                lineToRelative(0.389f, 0.13f)
                lineToRelative(-0.05f, 0.408f)
                lineToRelative(-0.017f, 0.122f)
                lineToRelative(0.016f, 0.002f)
                lineTo(40.043f, 34.2f)
                lineToRelative(-0.032f, 0.252f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-0.014f, 0.11f)
                lineToRelative(-0.032f, 0.257f)
                lineToRelative(-0.229f, 0.122f)
                lineToRelative(-15.0f, 8.0f)
                lineToRelative(-0.235f, 0.125f)
                lineToRelative(-0.235f, -0.125f)
                lineToRelative(-15.0f, -8.0f)
                lineToRelative(-0.229f, -0.122f)
                lineToRelative(-0.032f, -0.257f)
                lineToRelative(-3.0f, -24.0f)
                lineToRelative(-0.05f, -0.407f)
                lineToRelative(0.388f, -0.13f)
                lineTo(24.5f, 3.973f)
                close()
                moveTo(25.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(24.0f, 5.193f)
                lineTo(7.047f, 10.845f)
                lineTo(9.964f, 34.18f)
                lineTo(24.0f, 41.665f)
                lineTo(24.0f, 28.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(13.608f)
                lineToRelative(14.08f, -7.785f)
                lineToRelative(2.872f, -22.978f)
                lineTo(25.0f, 5.193f)
                close()
                moveTo(24.924f, 15.235f)
                lineTo(34.924f, 31.235f)
                lineTo(34.076f, 31.765f)
                lineTo(30.474f, 26.0f)
                lineTo(18.526f, 26.0f)
                lineToRelative(-3.602f, 5.765f)
                lineToRelative(-0.848f, -0.53f)
                lineToRelative(10.0f, -16.0f)
                lineToRelative(0.424f, -0.678f)
                close()
                moveTo(19.15f, 25.0f)
                lineTo(29.85f, 25.0f)
                lineTo(24.5f, 16.442f)
                close()
            }
        }
            .build()
        return _angularLarge!!
    }

private var _angularLarge: ImageVector? = null
