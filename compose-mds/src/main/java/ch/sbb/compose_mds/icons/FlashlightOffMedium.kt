package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.FlashlightOffMedium: ImageVector
    get() {
        if (_flashlightOffMedium != null) {
            return _flashlightOffMedium!!
        }
        _flashlightOffMedium = Builder(
            name = "FlashlightOffMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(10.75f, 9.25f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(4.346f)
                lineToRelative(-0.036f, 0.09f)
                lineToRelative(-1.464f, 3.66f)
                lineTo(22.25f, 32.75f)
                horizontalLineToRelative(-9.995f)
                lineTo(12.255f, 17.36f)
                lineToRelative(-1.47f, -3.674f)
                lineToRelative(-0.035f, -0.09f)
                lineTo(10.75f, 9.25f)
                moveToRelative(2.505f, 8.5f)
                horizontalLineToRelative(7.995f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-7.995f)
                close()
                moveTo(22.512f, 14.0f)
                lineToRelative(-1.1f, 2.75f)
                horizontalLineToRelative(-8.323f)
                lineToRelative(-1.1f, -2.75f)
                close()
                moveTo(22.75f, 13.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-2.75f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(15.75f, 19.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-3.5f)
                moveToRelative(0.5f, 9.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(16.75f, 27.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                lineTo(17.75f, 27.0f)
                close()
            }
        }
            .build()
        return _flashlightOffMedium!!
    }

private var _flashlightOffMedium: ImageVector? = null
