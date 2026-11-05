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

public val SBBIcons.HomePowerPlugLarge: ImageVector
    get() {
        if (_homePowerPlugLarge != null) {
            return _homePowerPlugLarge!!
        }
        _homePowerPlugLarge = Builder(
            name = "HomePowerPlugLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(25.0f, 14.292f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.292f)
                lineToRelative(3.853f, 3.853f)
                lineToRelative(-0.706f, 0.707f)
                lineTo(30.0f, 20.707f)
                verticalLineTo(31.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.075f, 0.0f, 1.964f, 0.266f, 2.586f, 0.893f)
                curveToRelative(0.62f, 0.623f, 0.89f, 1.52f, 0.914f, 2.595f)
                verticalLineToRelative(2.011f)
                lineToRelative(0.005f, 0.422f)
                curveToRelative(0.012f, 0.434f, 0.054f, 0.896f, 0.21f, 1.282f)
                curveToRelative(0.099f, 0.245f, 0.234f, 0.436f, 0.419f, 0.568f)
                curveToRelative(0.182f, 0.129f, 0.45f, 0.229f, 0.866f, 0.229f)
                curveToRelative(0.42f, 0.0f, 0.692f, -0.1f, 0.875f, -0.227f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.417f, -0.554f)
                curveToRelative(0.206f, -0.507f, 0.211f, -1.154f, 0.208f, -1.716f)
                verticalLineTo(29.97f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.0f, -4.471f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -4.0f, 4.47f)
                verticalLineToRelative(6.527f)
                lineToRelative(-0.002f, 0.447f)
                curveToRelative(-0.01f, 0.495f, -0.06f, 1.11f, -0.28f, 1.652f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.772f, 0.999f)
                curveToRelative(-0.38f, 0.265f, -0.862f, 0.405f, -1.446f, 0.405f)
                curveToRelative(-0.585f, 0.0f, -1.066f, -0.145f, -1.446f, -0.415f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, true, -0.767f, -1.008f)
                curveToRelative(-0.292f, -0.725f, -0.286f, -1.575f, -0.287f, -2.076f)
                verticalLineToRelative(-1.99f)
                lineToRelative(-0.018f, -0.336f)
                curveToRelative(-0.063f, -0.749f, -0.282f, -1.252f, -0.606f, -1.578f)
                curveToRelative(-0.367f, -0.37f, -0.955f, -0.597f, -1.876f, -0.597f)
                horizontalLineTo(30.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-9.02f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.706f)
                lineToRelative(-2.146f, 2.146f)
                lineToRelative(-0.708f, -0.707f)
                lineTo(18.5f, 7.792f)
                close()
                moveTo(8.0f, 19.706f)
                verticalLineTo(37.0f)
                horizontalLineToRelative(6.98f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(29.0f)
                verticalLineTo(19.706f)
                lineToRelative(-10.5f, -10.5f)
                close()
                moveTo(36.0f, 25.5f)
                curveToRelative(0.0f, 1.932f, 1.568f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.568f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(18.5f, 14.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 4.999f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 14.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 15.0f)
                moveToRelative(7.5f, 0.292f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
            .build()
        return _homePowerPlugLarge!!
    }

private var _homePowerPlugLarge: ImageVector? = null
