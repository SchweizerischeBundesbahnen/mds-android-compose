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
        _flashlightOffMedium = Builder(name = "FlashlightOffMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.75f, 9.25f)
                verticalLineToRelative(4.347f)
                lineToRelative(-0.036f, 0.088f)
                lineToRelative(-1.464f, 3.66f)
                lineTo(22.25f, 32.75f)
                horizontalLineToRelative(-9.995f)
                lineTo(12.255f, 17.358f)
                lineToRelative(-1.469f, -3.673f)
                lineToRelative(-0.036f, -0.088f)
                lineTo(10.75f, 9.25f)
                close()
                moveTo(13.255f, 17.75f)
                horizontalLineToRelative(7.995f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-7.995f)
                close()
                moveTo(13.088f, 16.75f)
                horizontalLineToRelative(8.324f)
                lineToRelative(1.1f, -2.75f)
                lineTo(11.988f, 14.0f)
                close()
                moveTo(11.75f, 13.0f)
                verticalLineToRelative(-2.75f)
                horizontalLineToRelative(11.0f)
                lineTo(22.75f, 13.0f)
                close()
                moveTo(19.25f, 29.75f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(18.25f, 28.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.75f, 25.5f)
                lineTo(17.75f, 27.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _flashlightOffMedium!!
    }

private var _flashlightOffMedium: ImageVector? = null
