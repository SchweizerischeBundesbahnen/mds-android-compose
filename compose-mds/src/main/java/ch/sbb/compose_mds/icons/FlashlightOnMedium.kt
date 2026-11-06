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

public val SBBIcons.FlashlightOnMedium: ImageVector
    get() {
        if (_flashlightOnMedium != null) {
            return _flashlightOnMedium!!
        }
        _flashlightOnMedium = Builder(name = "FlashlightOnMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(13.916f, 7.223f)
                lineToRelative(-3.0f, -4.5f)
                lineToRelative(-0.832f, 0.555f)
                lineToRelative(3.0f, 4.5f)
                close()
                moveTo(24.416f, 3.278f)
                lineTo(21.416f, 7.778f)
                lineTo(20.584f, 7.223f)
                lineTo(23.584f, 2.723f)
                close()
                moveTo(16.75f, 3.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1.0f)
                lineTo(17.75f, 3.0f)
                close()
                moveTo(11.25f, 9.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(4.347f)
                lineToRelative(0.036f, 0.089f)
                lineToRelative(1.468f, 3.672f)
                lineTo(12.254f, 32.75f)
                horizontalLineToRelative(9.996f)
                lineTo(22.25f, 17.347f)
                lineToRelative(1.464f, -3.661f)
                lineToRelative(0.036f, -0.09f)
                lineTo(23.75f, 9.25f)
                horizontalLineToRelative(-12.5f)
                moveToRelative(2.004f, 8.5f)
                horizontalLineToRelative(7.996f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-7.996f)
                close()
                moveTo(21.412f, 16.75f)
                lineTo(22.512f, 14.0f)
                lineTo(11.989f, 14.0f)
                lineToRelative(1.1f, 2.75f)
                close()
                moveTo(11.75f, 13.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.75f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(15.25f, 19.75f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-10.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(16.75f, 22.5f)
                lineTo(16.75f, 24.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _flashlightOnMedium!!
    }

private var _flashlightOnMedium: ImageVector? = null
