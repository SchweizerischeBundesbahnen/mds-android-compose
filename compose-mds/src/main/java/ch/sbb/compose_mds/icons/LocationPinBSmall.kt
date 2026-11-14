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

public val SBBIcons.LocationPinBSmall: ImageVector
    get() {
        if (_locationPinBSmall != null) {
            return _locationPinBSmall!!
        }
        _locationPinBSmall = Builder(name = "LocationPinBSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 10.008f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.04f, 1.038f, 0.35f, 1.912f, 0.837f, 2.721f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.007f, 0.011f)
                lineToRelative(4.75f, 7.499f)
                lineToRelative(0.422f, 0.666f)
                lineToRelative(0.422f, -0.666f)
                lineToRelative(4.75f, -7.499f)
                lineToRelative(0.006f, -0.01f)
                lineToRelative(0.006f, -0.01f)
                curveToRelative(0.472f, -0.828f, 0.79f, -1.72f, 0.8f, -2.728f)
                close()
                moveTo(17.2f, 12.741f)
                lineTo(16.77f, 12.495f)
                lineTo(16.758f, 12.488f)
                close()
                moveTo(7.0f, 9.993f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.015f)
                curveToRelative(-0.008f, 0.788f, -0.254f, 1.508f, -0.665f, 2.23f)
                lineToRelative(-4.32f, 6.82f)
                lineToRelative(-4.327f, -6.832f)
                curveToRelative(-0.409f, -0.684f, -0.654f, -1.392f, -0.688f, -2.233f)
                moveToRelative(3.832f, 3.21f)
                verticalLineToRelative(-2.466f)
                horizontalLineToRelative(1.527f)
                quadToRelative(0.855f, 0.0f, 1.122f, 0.115f)
                quadToRelative(0.686f, 0.287f, 0.686f, 1.14f)
                quadToRelative(0.0f, 0.756f, -0.509f, 1.043f)
                quadToRelative(-0.299f, 0.168f, -1.161f, 0.168f)
                close()
                moveTo(10.832f, 9.99f)
                lineTo(10.832f, 7.811f)
                horizontalLineToRelative(1.583f)
                quadToRelative(0.669f, 0.0f, 0.897f, 0.091f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, 0.423f, 0.37f)
                quadToRelative(0.152f, 0.258f, 0.152f, 0.621f)
                quadToRelative(0.0f, 0.364f, -0.175f, 0.637f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, -0.468f, 0.37f)
                quadToRelative(-0.293f, 0.09f, -0.911f, 0.09f)
                close()
                moveTo(12.536f, 7.007f)
                lineTo(9.999f, 7.007f)
                verticalLineToRelative(7.001f)
                horizontalLineToRelative(2.93f)
                quadToRelative(0.711f, 0.0f, 1.147f, -0.254f)
                quadToRelative(0.927f, -0.547f, 0.928f, -1.796f)
                quadToRelative(0.0f, -0.953f, -0.664f, -1.45f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.548f, -0.255f)
                quadToRelative(0.435f, -0.186f, 0.684f, -0.584f)
                quadToRelative(0.248f, -0.397f, 0.248f, -0.91f)
                quadToRelative(0.0f, -0.483f, -0.227f, -0.893f)
                arcToRelative(1.56f, 1.56f, 0.0f, false, false, -0.615f, -0.625f)
                quadToRelative(-0.422f, -0.234f, -1.346f, -0.234f)
            }
        }
        .build()
        return _locationPinBSmall!!
    }

private var _locationPinBSmall: ImageVector? = null
