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

public val SBBIcons.MicroscooterProfilePowerPlugSmall: ImageVector
    get() {
        if (_microscooterProfilePowerPlugSmall != null) {
            return _microscooterProfilePowerPlugSmall!!
        }
        _microscooterProfilePowerPlugSmall = Builder(name = "MicroscooterProfilePowerPlugSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(2.504f, 2.504f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(8.0f, 17.0f)
                arcToRelative(2.003f, 2.003f, 0.0f, false, true, -2.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.739f, 0.0f, 1.383f, 0.403f, 1.73f, 1.0f)
                horizontalLineToRelative(6.307f)
                arcTo(3.51f, 3.51f, 0.0f, false, true, 17.0f, 13.035f)
                lineTo(17.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 15.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                moveTo(6.0f, 16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.551f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                moveToRelative(12.0f, 0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.551f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                moveTo(11.0f, 8.0f)
                lineToRelative(1.999f, -0.004f)
                lineToRelative(0.002f, 1.0f)
                lineTo(11.0f, 8.999f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.5f, 11.999f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, -2.0f)
                lineTo(4.0f, 9.999f)
                lineTo(4.0f, 9.0f)
                horizontalLineToRelative(3.05f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.497f, 7.0f)
                lineTo(10.5f, 7.0f)
                lineTo(11.0f, 6.999f)
                close()
                moveTo(9.498f, 8.0f)
                arcToRelative(1.499f, 1.499f, 0.0f, true, false, 0.002f, 3.0f)
                horizontalLineToRelative(0.5f)
                lineTo(10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _microscooterProfilePowerPlugSmall!!
    }

private var _microscooterProfilePowerPlugSmall: ImageVector? = null
