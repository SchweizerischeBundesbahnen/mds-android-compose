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

public val SBBIcons.DisplayBinaryCodeLarge: ImageVector
    get() {
        if (_displayBinaryCodeLarge != null) {
            return _displayBinaryCodeLarge!!
        }
        _displayBinaryCodeLarge = Builder(
            name = "DisplayBinaryCodeLarge",
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
                moveTo(42.0f, 34.0f)
                lineTo(26.0f, 34.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                lineTo(14.0f, 40.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                lineTo(5.0f, 34.0f)
                lineTo(5.0f, 7.0f)
                horizontalLineToRelative(37.0f)
                close()
                moveTo(22.0f, 39.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(37.5f, 35.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(6.0f, 33.0f)
                horizontalLineToRelative(35.0f)
                lineTo(41.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                close()
                moveTo(12.0f, 31.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(28.0f, 31.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(36.0f, 31.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(19.5f, 23.0f)
                curveToRelative(0.772f, 0.0f, 1.409f, 0.47f, 1.83f, 1.102f)
                curveToRelative(0.424f, 0.635f, 0.67f, 1.485f, 0.67f, 2.398f)
                reflectiveCurveToRelative(-0.246f, 1.763f, -0.67f, 2.398f)
                curveTo(20.91f, 29.531f, 20.272f, 30.0f, 19.5f, 30.0f)
                reflectiveCurveToRelative(-1.409f, -0.47f, -1.83f, -1.102f)
                curveToRelative(-0.424f, -0.635f, -0.67f, -1.485f, -0.67f, -2.398f)
                reflectiveCurveToRelative(0.246f, -1.763f, 0.67f, -2.398f)
                curveTo(18.09f, 23.469f, 18.728f, 23.0f, 19.5f, 23.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.333f, 0.0f, -0.696f, 0.203f, -0.998f, 0.656f)
                curveToRelative(-0.3f, 0.45f, -0.502f, 1.1f, -0.502f, 1.844f)
                reflectiveCurveToRelative(0.202f, 1.394f, 0.502f, 1.844f)
                curveToRelative(0.302f, 0.453f, 0.665f, 0.656f, 0.998f, 0.656f)
                reflectiveCurveToRelative(0.696f, -0.203f, 0.998f, -0.656f)
                curveToRelative(0.3f, -0.45f, 0.502f, -1.1f, 0.502f, -1.844f)
                reflectiveCurveToRelative(-0.202f, -1.394f, -0.502f, -1.844f)
                curveToRelative(-0.302f, -0.453f, -0.665f, -0.656f, -0.998f, -0.656f)
                moveTo(12.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(20.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(36.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(27.5f, 11.0f)
                curveToRelative(0.772f, 0.0f, 1.409f, 0.47f, 1.83f, 1.102f)
                curveToRelative(0.424f, 0.635f, 0.67f, 1.485f, 0.67f, 2.398f)
                reflectiveCurveToRelative(-0.246f, 1.763f, -0.67f, 2.398f)
                curveTo(28.91f, 17.531f, 28.272f, 18.0f, 27.5f, 18.0f)
                reflectiveCurveToRelative(-1.409f, -0.47f, -1.83f, -1.102f)
                curveToRelative(-0.424f, -0.635f, -0.67f, -1.485f, -0.67f, -2.398f)
                reflectiveCurveToRelative(0.246f, -1.763f, 0.67f, -2.398f)
                curveTo(26.09f, 11.469f, 26.728f, 11.0f, 27.5f, 11.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.333f, 0.0f, -0.696f, 0.203f, -0.998f, 0.656f)
                curveToRelative(-0.3f, 0.45f, -0.502f, 1.1f, -0.502f, 1.844f)
                reflectiveCurveToRelative(0.202f, 1.394f, 0.502f, 1.844f)
                curveToRelative(0.302f, 0.453f, 0.665f, 0.656f, 0.998f, 0.656f)
                reflectiveCurveToRelative(0.696f, -0.203f, 0.998f, -0.656f)
                curveToRelative(0.3f, -0.45f, 0.502f, -1.1f, 0.502f, -1.844f)
                reflectiveCurveToRelative(-0.202f, -1.394f, -0.502f, -1.844f)
                curveToRelative(-0.302f, -0.453f, -0.665f, -0.656f, -0.998f, -0.656f)
            }
        }
            .build()
        return _displayBinaryCodeLarge!!
    }

private var _displayBinaryCodeLarge: ImageVector? = null
