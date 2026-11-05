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

public val SBBIcons.MountainMinusLarge: ImageVector
    get() {
        if (_mountainMinusLarge != null) {
            return _mountainMinusLarge!!
        }
        _mountainMinusLarge = Builder(name = "MountainMinusLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.936f, 9.255f)
                lineToRelative(15.802f, 28.089f)
                lineToRelative(1.694f, 2.904f)
                lineToRelative(0.438f, 0.752f)
                lineTo(5.13f, 41.0f)
                lineToRelative(0.438f, -0.752f)
                lineToRelative(5.077f, -8.7f)
                lineTo(23.064f, 9.257f)
                lineToRelative(0.434f, -0.78f)
                close()
                moveTo(11.443f, 32.16f)
                lineTo(6.87f, 40.0f)
                horizontalLineToRelative(33.26f)
                lineToRelative(-1.223f, -2.095f)
                lineToRelative(-14.444f, -13.688f)
                close()
                moveTo(12.437f, 30.383f)
                lineTo(24.269f, 23.163f)
                lineTo(24.596f, 22.963f)
                lineTo(24.873f, 23.227f)
                lineTo(37.243f, 34.949f)
                lineTo(23.502f, 10.521f)
                close()
                moveTo(42.009f, 13.003f)
                lineTo(31.0f, 13.003f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.009f)
                close()
            }
        }
        .build()
        return _mountainMinusLarge!!
    }

private var _mountainMinusLarge: ImageVector? = null
