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

public val SBBIcons.MountainPlusMedium: ImageVector
    get() {
        if (_mountainPlusMedium != null) {
            return _mountainPlusMedium!!
        }
        _mountainPlusMedium = Builder(name = "MountainPlusMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.25f, 9.253f)
                lineTo(28.25f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.253f)
                horizontalLineToRelative(-3.34f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.34f)
                lineTo(27.25f, 13.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.247f)
                horizontalLineToRelative(3.257f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(29.536f, 28.32f)
                lineTo(17.686f, 7.255f)
                lineToRelative(-0.438f, -0.778f)
                lineToRelative(-0.434f, 0.78f)
                lineTo(7.5f, 23.973f)
                lineToRelative(-3.807f, 6.525f)
                lineToRelative(-0.438f, 0.752f)
                horizontalLineToRelative(27.99f)
                lineToRelative(-0.438f, -0.752f)
                close()
                moveTo(17.252f, 8.522f)
                lineTo(9.294f, 22.808f)
                lineToRelative(8.468f, -5.167f)
                lineToRelative(0.326f, -0.199f)
                lineToRelative(0.278f, 0.263f)
                lineToRelative(8.678f, 8.223f)
                close()
                moveTo(17.955f, 18.694f)
                lineTo(28.707f, 28.883f)
                lineTo(29.505f, 30.25f)
                lineTo(4.995f, 30.25f)
                lineTo(8.3f, 24.586f)
                close()
            }
        }
        .build()
        return _mountainPlusMedium!!
    }

private var _mountainPlusMedium: ImageVector? = null
