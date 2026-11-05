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

public val SBBIcons.ArrowCircleLightningLarge: ImageVector
    get() {
        if (_arrowCircleLightningLarge != null) {
            return _arrowCircleLightningLarge!!
        }
        _arrowCircleLightningLarge = Builder(name = "ArrowCircleLightningLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 4.0f)
                curveTo(34.27f, 4.0f, 43.0f, 12.73f, 43.0f, 23.5f)
                reflectiveCurveTo(34.27f, 43.0f, 23.5f, 43.0f)
                curveToRelative(-8.1f, 0.0f, -15.379f, -4.95f, -18.332f, -12.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(6.255f)
                curveToRelative(2.897f, 6.47f, 9.692f, 11.0f, 17.245f, 11.0f)
                curveTo(33.717f, 42.0f, 42.0f, 33.717f, 42.0f, 23.5f)
                reflectiveCurveTo(33.717f, 5.0f, 23.5f, 5.0f)
                reflectiveCurveTo(5.0f, 13.283f, 5.0f, 23.5f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 12.73f, 12.73f, 4.0f, 23.5f, 4.0f)
                moveToRelative(5.447f, 6.724f)
                lineTo(25.31f, 18.0f)
                horizontalLineTo(33.5f)
                lineToRelative(-0.6f, 0.8f)
                lineToRelative(-12.0f, 16.0f)
                lineToRelative(-1.323f, 1.764f)
                lineToRelative(0.433f, -2.162f)
                lineTo(21.89f, 25.0f)
                horizontalLineToRelative(-8.053f)
                lineToRelative(0.183f, -0.638f)
                lineTo(18.123f, 10.0f)
                horizontalLineToRelative(11.186f)
                close()
                moveTo(15.163f, 24.0f)
                horizontalLineToRelative(7.947f)
                lineToRelative(-0.12f, 0.598f)
                lineToRelative(-1.568f, 7.837f)
                lineTo(31.5f, 19.0f)
                horizontalLineToRelative(-7.809f)
                lineToRelative(0.362f, -0.724f)
                lineTo(27.69f, 11.0f)
                horizontalLineToRelative(-8.814f)
                close()
            }
        }
        .build()
        return _arrowCircleLightningLarge!!
    }

private var _arrowCircleLightningLarge: ImageVector? = null
