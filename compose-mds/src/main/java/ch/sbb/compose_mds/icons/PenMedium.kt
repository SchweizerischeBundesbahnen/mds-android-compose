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

public val SBBIcons.PenMedium: ImageVector
    get() {
        if (_penMedium != null) {
            return _penMedium!!
        }
        _penMedium = Builder(name = "PenMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.288f, 10.132f)
                lineTo(25.853f, 6.71f)
                lineToRelative(-0.354f, -0.351f)
                lineToRelative(-0.353f, 0.352f)
                lineToRelative(-3.788f, 3.788f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(3.435f, 3.436f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(0.354f, -0.356f)
                lineToRelative(3.436f, -3.448f)
                lineToRelative(0.352f, -0.354f)
                close()
                moveTo(25.854f, 14.288f)
                lineTo(25.5f, 13.935f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(25.499f, 13.227f)
                lineTo(22.771f, 10.499f)
                lineTo(25.5f, 7.771f)
                lineToRelative(2.727f, 2.716f)
                close()
                moveTo(23.289f, 16.145f)
                lineTo(19.853f, 12.712f)
                lineTo(19.5f, 12.358f)
                lineTo(7.75f, 24.108f)
                verticalLineToRelative(4.142f)
                horizontalLineToRelative(4.143f)
                lineToRelative(0.146f, -0.147f)
                lineToRelative(11.25f, -11.25f)
                lineToRelative(0.354f, -0.354f)
                close()
                moveTo(12.039f, 28.103f)
                lineTo(11.685f, 27.75f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(8.75f, 27.25f)
                verticalLineToRelative(-2.728f)
                lineToRelative(10.75f, -10.75f)
                lineToRelative(2.727f, 2.727f)
                lineToRelative(-10.75f, 10.75f)
                close()
            }
        }
        .build()
        return _penMedium!!
    }

private var _penMedium: ImageVector? = null
