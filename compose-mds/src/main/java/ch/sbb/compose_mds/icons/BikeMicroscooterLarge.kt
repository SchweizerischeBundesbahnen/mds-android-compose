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

public val SBBIcons.BikeMicroscooterLarge: ImageVector
    get() {
        if (_bikeMicroscooterLarge != null) {
            return _bikeMicroscooterLarge!!
        }
        _bikeMicroscooterLarge = Builder(name = "BikeMicroscooterLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.5f, 36.999f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.504f, 2.504f, 0.0f, false, false, -2.5f, 2.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.122f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.122f, -2.5f, -2.5f, -2.5f)
                moveToRelative(-1.647f, -27.147f)
                lineToRelative(-30.0f, 30.0f)
                lineToRelative(-0.707f, -0.706f)
                lineToRelative(30.0f, -30.0f)
                close()
                moveTo(40.0f, 34.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, false, -5.5f, 5.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-1.0f)
                lineTo(33.02f, 39.0f)
                arcTo(6.51f, 6.51f, 0.0f, false, true, 39.0f, 33.019f)
                lineTo(39.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(21.003f, 6.0f)
                horizontalLineToRelative(-6.566f)
                lineToRelative(3.333f, 5.0f)
                horizontalLineToRelative(11.233f)
                verticalLineToRelative(1.0f)
                lineTo(17.824f, 12.0f)
                lineToRelative(-1.773f, 3.896f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 3.488f, 4.018f)
                lineToRelative(-0.469f, 0.172f)
                lineToRelative(-0.47f, 0.173f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -2.964f, -3.45f)
                lineToRelative(-2.681f, 5.898f)
                lineToRelative(-0.91f, -0.414f)
                lineToRelative(2.68f, -5.897f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -7.906f, 9.263f)
                lineToRelative(0.2f, 0.336f)
                verticalLineToRelative(0.001f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 2.23f, 2.134f)
                lineToRelative(-0.25f, 0.433f)
                lineToRelative(-0.25f, 0.433f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -2.572f, -2.464f)
                verticalLineToRelative(0.001f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -0.609f, -6.893f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 5.293f, -4.457f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 3.562f, 0.069f)
                quadToRelative(0.366f, 0.099f, 0.717f, 0.232f)
                lineToRelative(1.791f, -3.938f)
                lineToRelative(-3.845f, -5.769f)
                lineTo(12.567f, 5.0f)
                horizontalLineToRelative(8.435f)
                close()
                moveTo(33.0f, 8.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(26.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _bikeMicroscooterLarge!!
    }

private var _bikeMicroscooterLarge: ImageVector? = null
