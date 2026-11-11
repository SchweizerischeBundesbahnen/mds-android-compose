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

public val SBBIcons.LocationPinSmall: ImageVector
    get() {
        if (_locationPinSmall != null) {
            return _locationPinSmall!!
        }
        _locationPinSmall = Builder(name = "LocationPinSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.984f, 9.014f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.041f, 1.04f, 0.351f, 1.913f, 0.837f, 2.724f)
                lineToRelative(0.007f, 0.01f)
                lineToRelative(4.75f, 7.498f)
                lineToRelative(0.422f, 0.666f)
                lineToRelative(0.423f, -0.666f)
                lineToRelative(4.75f, -7.498f)
                lineToRelative(0.006f, -0.01f)
                lineToRelative(0.006f, -0.01f)
                curveToRelative(0.472f, -0.828f, 0.79f, -1.72f, 0.8f, -2.729f)
                close()
                moveTo(17.184f, 11.748f)
                lineTo(16.754f, 11.503f)
                lineTo(16.742f, 11.495f)
                close()
                moveTo(7.23f, 11.512f)
                lineTo(6.821f, 11.758f)
                lineTo(7.273f, 11.485f)
                close()
                moveTo(6.984f, 9.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.014f)
                curveToRelative(-0.008f, 0.789f, -0.254f, 1.51f, -0.665f, 2.232f)
                lineTo(12.0f, 18.064f)
                lineToRelative(-4.327f, -6.83f)
                curveToRelative(-0.41f, -0.686f, -0.655f, -1.394f, -0.689f, -2.234f)
                moveToRelative(5.008f, -2.993f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                moveToRelative(0.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
            }
        }
        .build()
        return _locationPinSmall!!
    }

private var _locationPinSmall: ImageVector? = null
