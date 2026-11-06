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

public val SBBIcons.BikeMicroscooterMedium: ImageVector
    get() {
        if (_bikeMicroscooterMedium != null) {
            return _bikeMicroscooterMedium!!
        }
        _bikeMicroscooterMedium = Builder(name = "BikeMicroscooterMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.0f, 27.249f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, 2.75f, 2.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, -2.75f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, 2.75f, -2.75f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.965f, 0.0f, -1.75f, 0.786f, -1.75f, 1.75f)
                curveToRelative(0.0f, 0.965f, 0.785f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.785f, 1.75f, -1.75f)
                curveToRelative(0.0f, -0.964f, -0.785f, -1.75f, -1.75f, -1.75f)
                moveTo(28.854f, 7.853f)
                lineToRelative(-22.5f, 22.5f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(22.5f, -22.5f)
                close()
                moveTo(29.75f, 25.249f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.205f, 0.0f, -4.0f, 1.795f, -4.0f, 4.0f)
                verticalLineToRelative(0.5f)
                lineTo(12.0f, 29.749f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.275f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, true, 4.475f, -4.476f)
                lineTo(28.75f, 13.25f)
                lineTo(27.0f, 13.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.75f)
                close()
                moveTo(15.001f, 4.249f)
                horizontalLineToRelative(-4.315f)
                lineToRelative(2.333f, 3.5f)
                lineTo(21.0f, 7.749f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.928f)
                lineToRelative(-1.248f, 2.744f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, true, 2.572f, 3.023f)
                lineToRelative(-0.469f, 0.172f)
                lineToRelative(-0.47f, 0.172f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, false, -2.05f, -2.452f)
                lineToRelative(-1.953f, 4.298f)
                lineToRelative(-0.91f, -0.414f)
                lineToRelative(1.954f, -4.299f)
                arcToRelative(4.751f, 4.751f, 0.0f, false, false, -5.773f, 2.434f)
                lineToRelative(-0.117f, 0.26f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, -0.341f, 2.23f)
                lineToRelative(0.033f, 0.284f)
                arcToRelative(4.76f, 4.76f, 0.0f, false, false, 2.324f, 3.413f)
                lineToRelative(-0.25f, 0.433f)
                lineToRelative(-0.25f, 0.433f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, true, -1.973f, -1.888f)
                lineTo(4.15f, 19.592f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -0.838f, -2.242f)
                lineToRelative(-0.041f, -0.344f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 7.203f, -6.064f)
                lineToRelative(0.33f, 0.099f)
                quadToRelative(0.055f, 0.019f, 0.11f, 0.04f)
                lineToRelative(1.266f, -2.786f)
                lineToRelative(-2.846f, -4.269f)
                lineToRelative(-0.518f, -0.777f)
                lineTo(15.0f, 3.249f)
                close()
                moveTo(24.001f, 5.75f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                close()
            }
        }
        .build()
        return _bikeMicroscooterMedium!!
    }

private var _bikeMicroscooterMedium: ImageVector? = null
