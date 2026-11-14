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

public val SBBIcons.ArrowsLongUpDownSmall: ImageVector
    get() {
        if (_arrowsLongUpDownSmall != null) {
            return _arrowsLongUpDownSmall!!
        }
        _arrowsLongUpDownSmall = Builder(name = "ArrowsLongUpDownSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(16.505f, 19.485f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(3.14f, -3.142f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-2.287f, 2.289f)
                lineTo(17.004f, 3.995f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.004f, 18.28f)
                lineToRelative(-2.296f, -2.289f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(3.15f, 3.143f)
                lineToRelative(0.352f, -0.355f)
                close()
                moveTo(16.151f, 19.84f)
                lineTo(16.504f, 20.192f)
                lineTo(16.858f, 19.839f)
                lineTo(16.504f, 19.485f)
                close()
                moveTo(7.505f, 4.505f)
                lineToRelative(0.353f, -0.354f)
                close()
                moveTo(7.151f, 4.15f)
                lineTo(7.503f, 4.505f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(7.151f, 4.15f)
                lineTo(4.0f, 7.293f)
                lineTo(4.708f, 8.0f)
                lineToRelative(2.296f, -2.289f)
                verticalLineToRelative(14.284f)
                horizontalLineToRelative(1.0f)
                lineTo(8.004f, 5.712f)
                lineTo(10.29f, 8.0f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-3.14f, -3.142f)
                lineToRelative(-0.354f, -0.353f)
                close()
            }
        }
        .build()
        return _arrowsLongUpDownSmall!!
    }

private var _arrowsLongUpDownSmall: ImageVector? = null
