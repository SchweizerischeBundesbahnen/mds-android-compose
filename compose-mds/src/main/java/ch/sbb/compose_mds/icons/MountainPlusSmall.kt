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

public val SBBIcons.MountainPlusSmall: ImageVector
    get() {
        if (_mountainPlusSmall != null) {
            return _mountainPlusSmall!!
        }
        _mountainPlusSmall = Builder(name = "MountainPlusSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.936f, 4.755f)
                lineToRelative(-0.438f, -0.778f)
                lineToRelative(-0.435f, 0.78f)
                lineToRelative(-6.21f, 11.145f)
                lineToRelative(-2.535f, 4.346f)
                lineTo(1.88f, 21.0f)
                lineTo(21.12f, 21.0f)
                lineToRelative(-0.438f, -0.752f)
                lineToRelative(-0.845f, -1.449f)
                close()
                moveTo(11.754f, 11.619f)
                lineTo(6.65f, 14.734f)
                lineToRelative(4.853f, -8.71f)
                lineToRelative(5.84f, 10.382f)
                lineToRelative(-4.983f, -4.723f)
                lineToRelative(-0.278f, -0.264f)
                close()
                moveTo(11.948f, 12.672f)
                lineTo(19.006f, 19.359f)
                lineTo(19.379f, 20.0f)
                lineTo(3.622f, 20.0f)
                lineToRelative(2.035f, -3.489f)
                close()
                moveTo(19.0f, 7.002f)
                horizontalLineToRelative(2.005f)
                verticalLineToRelative(-1.0f)
                lineTo(19.0f, 6.002f)
                lineTo(19.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.002f)
                horizontalLineToRelative(-2.06f)
                verticalLineToRelative(1.0f)
                lineTo(18.0f, 7.002f)
                lineTo(18.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _mountainPlusSmall!!
    }

private var _mountainPlusSmall: ImageVector? = null
