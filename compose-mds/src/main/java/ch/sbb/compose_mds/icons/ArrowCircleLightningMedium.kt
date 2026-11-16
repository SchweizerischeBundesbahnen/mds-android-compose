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

public val SBBIcons.ArrowCircleLightningMedium: ImageVector
    get() {
        if (_arrowCircleLightningMedium != null) {
            return _arrowCircleLightningMedium!!
        }
        _arrowCircleLightningMedium = Builder(name = "ArrowCircleLightningMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.75f, 18.0f)
                curveToRelative(0.0f, -7.594f, -6.156f, -13.75f, -13.75f, -13.75f)
                reflectiveCurveTo(4.25f, 10.406f, 4.25f, 18.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(3.25f, 9.854f, 9.854f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(32.75f, 9.854f, 32.75f, 18.0f)
                reflectiveCurveTo(26.146f, 32.75f, 18.0f, 32.75f)
                curveToRelative(-6.02f, 0.0f, -11.444f, -3.614f, -13.75f, -8.804f)
                verticalLineTo(28.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.75f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.26f)
                curveToRelative(2.196f, 4.713f, 7.193f, 8.0f, 12.74f, 8.0f)
                curveToRelative(7.594f, 0.0f, 13.75f, -6.156f, 13.75f, -13.75f)
                moveToRelative(-9.553f, -9.526f)
                lineToRelative(0.362f, -0.724f)
                horizontalLineToRelative(-8.686f)
                lineTo(10.77f, 18.612f)
                lineToRelative(-0.183f, 0.638f)
                horizontalLineToRelative(6.054f)
                lineToRelative(-1.381f, 6.902f)
                lineToRelative(-0.433f, 2.162f)
                lineToRelative(1.323f, -1.764f)
                lineToRelative(9.0f, -12.0f)
                lineToRelative(0.6f, -0.8f)
                horizontalLineToRelative(-6.191f)
                close()
                moveTo(17.86f, 18.25f)
                horizontalLineToRelative(-5.947f)
                lineToRelative(2.714f, -9.5f)
                horizontalLineToRelative(6.314f)
                lineToRelative(-2.638f, 5.276f)
                lineToRelative(-0.362f, 0.724f)
                horizontalLineToRelative(5.809f)
                lineToRelative(-7.078f, 9.436f)
                lineToRelative(1.068f, -5.338f)
                close()
            }
        }
        .build()
        return _arrowCircleLightningMedium!!
    }

private var _arrowCircleLightningMedium: ImageVector? = null
