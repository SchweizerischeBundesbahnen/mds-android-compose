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

public val SBBIcons.MountainMinusMedium: ImageVector
    get() {
        if (_mountainMinusMedium != null) {
            return _mountainMinusMedium!!
        }
        _mountainMinusMedium = Builder(name = "MountainMinusMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.248f, 6.477f)
                lineToRelative(0.438f, 0.778f)
                lineToRelative(11.852f, 21.069f)
                lineToRelative(1.269f, 2.174f)
                lineToRelative(0.439f, 0.752f)
                lineTo(3.255f, 31.25f)
                lineToRelative(0.438f, -0.752f)
                lineToRelative(3.805f, -6.52f)
                lineToRelative(9.315f, -16.721f)
                close()
                moveTo(9.293f, 22.809f)
                lineToRelative(8.468f, -5.168f)
                lineToRelative(0.327f, -0.199f)
                lineToRelative(0.278f, 0.263f)
                lineToRelative(8.678f, 8.224f)
                lineToRelative(-9.792f, -17.405f)
                close()
                moveTo(28.706f, 28.882f)
                lineTo(17.956f, 18.694f)
                lineTo(8.3f, 24.587f)
                lineTo(4.996f, 30.25f)
                horizontalLineToRelative(24.508f)
                close()
                moveTo(31.506f, 10.253f)
                lineTo(23.91f, 10.253f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.598f)
                close()
            }
        }
        .build()
        return _mountainMinusMedium!!
    }

private var _mountainMinusMedium: ImageVector? = null
