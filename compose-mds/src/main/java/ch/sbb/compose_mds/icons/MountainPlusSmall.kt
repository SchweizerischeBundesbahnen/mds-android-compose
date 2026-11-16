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
                moveToRelative(19.835f, 18.796f)
                lineToRelative(-7.9f, -14.041f)
                lineToRelative(-0.437f, -0.778f)
                lineToRelative(-0.434f, 0.78f)
                lineToRelative(-6.212f, 11.15f)
                lineToRelative(-2.534f, 4.341f)
                lineTo(1.88f, 21.0f)
                horizontalLineToRelative(19.24f)
                lineToRelative(-0.438f, -0.752f)
                close()
                moveTo(5.269f, 16.139f)
                lineToRelative(0.018f, 0.01f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(3.62f, 20.0f)
                lineToRelative(2.036f, -3.488f)
                lineToRelative(6.292f, -3.84f)
                lineToRelative(7.057f, 6.686f)
                lineToRelative(0.375f, 0.642f)
                close()
                moveTo(12.359f, 11.682f)
                lineTo(17.342f, 16.404f)
                lineTo(11.502f, 6.023f)
                lineTo(6.65f, 14.733f)
                lineTo(11.754f, 11.619f)
                lineTo(12.081f, 11.419f)
                close()
                moveTo(21.005f, 7.002f)
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
                lineTo(19.0f, 7.002f)
                close()
            }
        }
        .build()
        return _mountainPlusSmall!!
    }

private var _mountainPlusSmall: ImageVector? = null
