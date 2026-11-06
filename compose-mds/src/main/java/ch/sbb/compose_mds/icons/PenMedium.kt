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
                moveToRelative(25.853f, 6.71f)
                lineToRelative(-0.354f, -0.352f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-3.435f, 3.435f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(3.435f, 3.435f)
                lineToRelative(0.355f, 0.355f)
                lineToRelative(0.353f, -0.355f)
                lineToRelative(3.435f, -3.449f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(-0.354f, -0.353f)
                close()
                moveTo(22.772f, 10.5f)
                lineTo(25.501f, 7.771f)
                lineTo(28.228f, 10.488f)
                lineTo(25.499f, 13.227f)
                close()
                moveTo(19.854f, 12.712f)
                lineTo(19.5f, 12.358f)
                lineTo(19.146f, 12.712f)
                lineTo(7.896f, 23.962f)
                lineTo(7.75f, 24.108f)
                verticalLineToRelative(4.142f)
                horizontalLineToRelative(4.142f)
                lineToRelative(0.147f, -0.146f)
                lineToRelative(11.25f, -11.252f)
                lineToRelative(0.353f, -0.353f)
                lineToRelative(-0.354f, -0.354f)
                close()
                moveTo(8.75f, 24.522f)
                lineToRelative(10.75f, -10.75f)
                lineToRelative(2.728f, 2.727f)
                lineToRelative(-10.75f, 10.751f)
                lineTo(8.75f, 27.25f)
                close()
            }
        }
        .build()
        return _penMedium!!
    }

private var _penMedium: ImageVector? = null
