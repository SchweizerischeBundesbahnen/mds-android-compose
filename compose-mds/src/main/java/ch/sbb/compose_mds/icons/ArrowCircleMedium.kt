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

public val SBBIcons.ArrowCircleMedium: ImageVector
    get() {
        if (_arrowCircleMedium != null) {
            return _arrowCircleMedium!!
        }
        _arrowCircleMedium = Builder(name = "ArrowCircleMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.25f, 18.0f)
                curveToRelative(0.0f, -6.248f, 4.502f, -10.75f, 10.75f, -10.75f)
                curveToRelative(4.595f, 0.0f, 8.83f, 2.741f, 10.511f, 6.5f)
                horizontalLineTo(22.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.25f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.574f)
                curveTo(26.596f, 8.608f, 22.435f, 6.25f, 18.0f, 6.25f)
                curveTo(11.2f, 6.25f, 6.25f, 11.2f, 6.25f, 18.0f)
                reflectiveCurveTo(11.2f, 29.75f, 18.0f, 29.75f)
                curveToRelative(5.696f, 0.0f, 10.11f, -3.476f, 11.381f, -8.632f)
                lineToRelative(-0.971f, -0.24f)
                curveTo(27.254f, 25.571f, 23.253f, 28.75f, 18.0f, 28.75f)
                curveToRelative(-6.248f, 0.0f, -10.75f, -4.502f, -10.75f, -10.75f)
            }
        }
        .build()
        return _arrowCircleMedium!!
    }

private var _arrowCircleMedium: ImageVector? = null
