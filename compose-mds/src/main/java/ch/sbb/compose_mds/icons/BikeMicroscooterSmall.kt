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

public val SBBIcons.BikeMicroscooterSmall: ImageVector
    get() {
        if (_bikeMicroscooterSmall != null) {
            return _bikeMicroscooterSmall!!
        }
        _bikeMicroscooterSmall = Builder(name = "BikeMicroscooterSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.896f, -2.0f, 2.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.104f, -0.897f, -2.0f, -2.0f, -2.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.551f, 0.45f, -1.0f, 1.0f, -1.0f)
                moveToRelative(-16.354f, 0.646f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(-0.707f, -0.707f)
                close()
                moveTo(18.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.035f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 16.036f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(6.085f, 2.777f)
                lineToRelative(1.847f, 2.768f)
                lineToRelative(-0.745f, 1.636f)
                lineToRelative(-0.16f, -0.047f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.724f, 2.34f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 14.464f)
                lineToRelative(0.25f, -0.432f)
                lineToRelative(0.25f, -0.434f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.77f, 8.1f)
                lineToRelative(-1.225f, 2.693f)
                lineToRelative(0.91f, 0.414f)
                lineTo(7.68f, 8.515f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.135f, 1.45f)
                lineToRelative(0.47f, -0.173f)
                lineToRelative(0.469f, -0.171f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.656f, -2.027f)
                lineTo(8.823f, 6.0f)
                horizontalLineToRelative(5.178f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.769f)
                lineTo(7.436f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.566f)
                close()
                moveTo(13.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _bikeMicroscooterSmall!!
    }

private var _bikeMicroscooterSmall: ImageVector? = null
