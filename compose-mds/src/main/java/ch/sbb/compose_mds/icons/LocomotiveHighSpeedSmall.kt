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

public val SBBIcons.LocomotiveHighSpeedSmall: ImageVector
    get() {
        if (_locomotiveHighSpeedSmall != null) {
            return _locomotiveHighSpeedSmall!!
        }
        _locomotiveHighSpeedSmall = Builder(name = "LocomotiveHighSpeedSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.991f, 13.207f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.006f, 1.784f)
                lineTo(7.0f, 14.991f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(13.687f)
                curveToRelative(-0.371f, 0.6f, -1.034f, 1.0f, -1.79f, 1.0f)
                lineTo(2.0f, 16.991f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.05f)
                curveToRelative(0.075f, 0.37f, 0.231f, 0.709f, 0.45f, 1.0f)
                lineTo(2.0f, 18.991f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.486f)
                curveToRelative(0.218f, -0.291f, 0.375f, -0.63f, 0.45f, -1.0f)
                horizontalLineToRelative(4.932f)
                arcTo(3.105f, 3.105f, 0.0f, false, false, 22.0f, 14.884f)
                lineToRelative(-0.007f, -0.2f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -1.533f, -2.36f)
                lineTo(8.314f, 5.886f)
                curveToRelative(-1.148f, -0.608f, -2.422f, -0.895f, -3.708f, -0.895f)
                lineTo(4.0f, 4.991f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.606f)
                curveToRelative(1.137f, 0.0f, 2.248f, 0.253f, 3.24f, 0.779f)
                lineToRelative(1.437f, 0.762f)
                curveToRelative(-0.743f, 1.264f, -0.362f, 3.031f, 1.065f, 3.678f)
                lineToRelative(0.02f, 0.008f)
                lineToRelative(0.01f, 0.005f)
                lineToRelative(2.517f, 1.105f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.229f, 0.677f)
                horizontalLineToRelative(3.488f)
                close()
                moveTo(10.76f, 10.298f)
                curveToRelative(-0.821f, -0.372f, -1.11f, -1.473f, -0.591f, -2.297f)
                lineToRelative(7.556f, 4.004f)
                horizontalLineToRelative(-1.601f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -2.826f, -0.593f)
                lineToRelative(-2.518f, -1.105f)
                lineToRelative(-0.009f, -0.004f)
                close()
                moveTo(10.099f, 17.991f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.83f, 0.0f)
                close()
                moveTo(9.063f, 17.991f)
                lineTo(7.95f, 17.991f)
                curveToRelative(-0.075f, 0.37f, -0.231f, 0.709f, -0.45f, 1.0f)
                horizontalLineToRelative(2.013f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.45f, -1.0f)
                moveToRelative(-4.978f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.83f, 0.0f)
                close()
                moveTo(3.0f, 4.99f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 5.99f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(3.0f, 15.99f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 14.99f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 14.99f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 15.99f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(5.0f, 11.99f)
                lineTo(3.0f, 11.99f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                moveToRelative(-1.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 8.99f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _locomotiveHighSpeedSmall!!
    }

private var _locomotiveHighSpeedSmall: ImageVector? = null
