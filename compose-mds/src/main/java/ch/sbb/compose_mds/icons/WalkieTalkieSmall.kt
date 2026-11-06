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

public val SBBIcons.WalkieTalkieSmall: ImageVector
    get() {
        if (_walkieTalkieSmall != null) {
            return _walkieTalkieSmall!!
        }
        _walkieTalkieSmall = Builder(name = "WalkieTalkieSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 7.5f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 19.5f)
                lineTo(7.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(1.087f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 6.0f)
                lineTo(14.0f, 6.0f)
                lineTo(14.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(8.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(15.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(15.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(0.542f, 0.0f, 1.038f, 0.253f, 1.393f, 0.607f)
                curveToRelative(0.354f, 0.355f, 0.607f, 0.851f, 0.607f, 1.393f)
                curveToRelative(0.0f, 0.541f, -0.253f, 1.038f, -0.606f, 1.393f)
                curveToRelative(-0.354f, 0.354f, -0.85f, 0.607f, -1.392f, 0.607f)
                reflectiveCurveToRelative(-1.039f, -0.253f, -1.394f, -0.607f)
                curveTo(10.254f, 11.039f, 10.0f, 10.542f, 10.0f, 10.0f)
                reflectiveCurveToRelative(0.253f, -1.038f, 0.607f, -1.393f)
                curveTo(10.962f, 8.253f, 11.458f, 8.0f, 12.0f, 8.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.23f, 0.0f, -0.483f, 0.111f, -0.685f, 0.314f)
                reflectiveCurveTo(11.0f, 9.771f, 11.0f, 10.0f)
                reflectiveCurveToRelative(0.112f, 0.482f, 0.315f, 0.685f)
                reflectiveCurveToRelative(0.458f, 0.315f, 0.687f, 0.315f)
                reflectiveCurveToRelative(0.482f, -0.112f, 0.684f, -0.315f)
                curveToRelative(0.203f, -0.202f, 0.314f, -0.455f, 0.314f, -0.685f)
                reflectiveCurveToRelative(-0.111f, -0.483f, -0.315f, -0.686f)
                curveTo(12.484f, 9.111f, 12.23f, 9.0f, 12.0f, 9.0f)
            }
        }
        .build()
        return _walkieTalkieSmall!!
    }

private var _walkieTalkieSmall: ImageVector? = null
