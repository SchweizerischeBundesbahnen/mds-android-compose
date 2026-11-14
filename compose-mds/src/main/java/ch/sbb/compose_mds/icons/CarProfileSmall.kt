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

public val SBBIcons.CarProfileSmall: ImageVector
    get() {
        if (_carProfileSmall != null) {
            return _carProfileSmall!!
        }
        _carProfileSmall = Builder(name = "CarProfileSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.998f, 11.502f)
                curveToRelative(0.0f, -0.215f, -0.082f, -0.316f, -0.17f, -0.38f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.351f, -0.121f)
                lineTo(18.0f, 10.999f)
                lineTo(3.0f, 10.999f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.05f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                horizontalLineToRelative(5.1f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(21.0f, 14.999f)
                close()
                moveTo(6.5f, 13.999f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.002f, 3.002f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.002f, -3.002f)
                moveToRelative(10.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.001f, 3.002f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.001f, -3.002f)
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(6.792f)
                lineToRelative(-2.853f, -2.852f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.586f, 7.0f)
                lineTo(10.0f, 7.0f)
                close()
                moveTo(22.0f, 15.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.05f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, -4.9f, 0.0f)
                horizontalLineToRelative(-5.1f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-5.123f)
                curveToRelative(0.0f, -0.364f, 0.133f, -0.715f, 0.372f, -0.989f)
                lineToRelative(2.952f, -3.375f)
                lineToRelative(0.753f, 0.658f)
                lineTo(3.601f, 10.0f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 7.0f)
                lineTo(6.454f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.377f, 0.17f)
                lineToRelative(-0.376f, -0.329f)
                lineToRelative(-0.377f, -0.329f)
                horizontalLineToRelative(0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.455f, 6.0f)
                horizontalLineToRelative(7.13f)
                curveToRelative(0.4f, 0.0f, 0.78f, 0.159f, 1.061f, 0.44f)
                lineTo(18.208f, 10.0f)
                lineToRelative(2.29f, 0.002f)
                lineToRelative(-0.002f, 0.512f)
                lineToRelative(0.001f, -0.012f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.243f, 0.009f, 0.595f, 0.09f, 0.901f, 0.312f)
                curveToRelative(0.329f, 0.24f, 0.581f, 0.633f, 0.581f, 1.188f)
                close()
            }
        }
        .build()
        return _carProfileSmall!!
    }

private var _carProfileSmall: ImageVector? = null
