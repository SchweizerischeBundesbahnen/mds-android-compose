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
                moveToRelative(11.498f, 3.977f)
                lineToRelative(0.438f, 0.778f)
                lineToRelative(7.9f, 14.044f)
                lineToRelative(0.846f, 1.45f)
                lineToRelative(0.439f, 0.751f)
                lineTo(1.88f, 21.0f)
                lineToRelative(0.438f, -0.752f)
                lineToRelative(2.536f, -4.346f)
                lineToRelative(6.21f, -11.145f)
                close()
                moveTo(6.649f, 14.734f)
                lineToRelative(5.105f, -3.115f)
                lineToRelative(0.327f, -0.2f)
                lineToRelative(0.277f, 0.264f)
                lineToRelative(4.985f, 4.723f)
                lineToRelative(-5.84f, -10.382f)
                close()
                moveTo(19.006f, 19.359f)
                lineTo(11.948f, 12.672f)
                lineTo(5.656f, 16.512f)
                lineTo(3.621f, 20.0f)
                lineTo(19.38f, 20.0f)
                close()
                moveTo(21.005f, 7.002f)
                lineTo(15.94f, 7.002f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.065f)
                close()
            }
        }
        .build()
        return _mountainMinusSmall!!
    }

private var _mountainMinusSmall: ImageVector? = null
