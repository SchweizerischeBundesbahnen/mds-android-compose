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

public val SBBIcons.LocationPinASmall: ImageVector
    get() {
        if (_locationPinASmall != null) {
            return _locationPinASmall!!
        }
        _locationPinASmall = Builder(name = "LocationPinASmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 10.002f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.04f, 1.039f, 0.35f, 1.913f, 0.836f, 2.722f)
                lineToRelative(0.007f, 0.011f)
                lineToRelative(4.75f, 7.5f)
                lineToRelative(0.422f, 0.665f)
                lineToRelative(0.422f, -0.666f)
                lineToRelative(4.752f, -7.499f)
                lineToRelative(0.005f, -0.01f)
                lineToRelative(0.006f, -0.01f)
                curveToRelative(0.473f, -0.829f, 0.79f, -1.72f, 0.8f, -2.728f)
                close()
                moveTo(17.2f, 12.735f)
                lineTo(16.77f, 12.49f)
                lineTo(16.758f, 12.482f)
                close()
                moveTo(7.245f, 12.499f)
                lineTo(6.835f, 12.744f)
                lineTo(7.288f, 12.472f)
                close()
                moveTo(7.0f, 9.988f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.014f)
                curveToRelative(-0.009f, 0.788f, -0.255f, 1.509f, -0.665f, 2.23f)
                lineToRelative(-4.32f, 6.82f)
                lineToRelative(-4.328f, -6.832f)
                curveToRelative(-0.408f, -0.684f, -0.653f, -1.392f, -0.687f, -2.232f)
                moveTo(11.983f, 6.9f)
                lineToRelative(1.193f, 3.217f)
                horizontalLineToRelative(-2.391f)
                close()
                moveTo(15.251f, 13.005f)
                lineTo(12.523f, 5.998f)
                horizontalLineToRelative(-1.036f)
                lineToRelative(-2.74f, 7.007f)
                horizontalLineToRelative(0.974f)
                lineToRelative(0.797f, -2.143f)
                horizontalLineToRelative(2.93f)
                lineToRelative(0.778f, 2.143f)
                close()
            }
        }
        .build()
        return _locationPinASmall!!
    }

private var _locationPinASmall: ImageVector? = null
