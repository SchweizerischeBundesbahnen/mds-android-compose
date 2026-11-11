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

public val SBBIcons.MountainMinusSmall: ImageVector
    get() {
        if (_mountainMinusSmall != null) {
            return _mountainMinusSmall!!
        }
        _mountainMinusSmall = Builder(name = "MountainMinusSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.936f, 4.755f)
                lineToRelative(7.899f, 14.041f)
                lineToRelative(0.847f, 1.452f)
                lineToRelative(0.438f, 0.752f)
                lineTo(1.88f, 21.0f)
                lineToRelative(0.438f, -0.752f)
                lineToRelative(2.534f, -4.342f)
                lineToRelative(6.211f, -11.15f)
                lineToRelative(0.435f, -0.78f)
                close()
                moveTo(5.286f, 16.149f)
                lineTo(5.269f, 16.139f)
                lineTo(5.287f, 16.15f)
                close()
                moveTo(5.656f, 16.512f)
                lineTo(3.62f, 20.0f)
                horizontalLineToRelative(15.76f)
                lineToRelative(-0.375f, -0.642f)
                lineToRelative(-7.057f, -6.687f)
                close()
                moveTo(17.342f, 16.404f)
                lineTo(12.359f, 11.682f)
                lineTo(12.081f, 11.419f)
                lineTo(11.754f, 11.619f)
                lineTo(6.65f, 14.733f)
                lineTo(11.502f, 6.023f)
                close()
                moveTo(21.005f, 6.002f)
                verticalLineToRelative(1.0f)
                lineTo(15.94f, 7.002f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _mountainMinusSmall!!
    }

private var _mountainMinusSmall: ImageVector? = null
