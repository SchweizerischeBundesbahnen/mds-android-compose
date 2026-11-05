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

public val SBBIcons.ShuttleLarge: ImageVector
    get() {
        if (_shuttleLarge != null) {
            return _shuttleLarge!!
        }
        _shuttleLarge = Builder(
            name = "ShuttleLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveTo(13.138f, 37.154f)
                lineTo(10.228f, 40.0f)
                lineTo(20.0f, 40.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-9.77f)
                lineToRelative(2.91f, 2.827f)
                lineToRelative(-0.348f, 0.359f)
                lineToRelative(-0.349f, 0.359f)
                lineToRelative(-3.792f, -3.685f)
                lineToRelative(-0.368f, -0.357f)
                lineToRelative(0.367f, -0.358f)
                lineToRelative(3.788f, -3.704f)
                close()
                moveTo(38.35f, 40.122f)
                lineTo(38.718f, 40.48f)
                lineTo(38.351f, 40.838f)
                lineTo(34.563f, 44.542f)
                lineTo(33.863f, 43.827f)
                lineTo(36.773f, 40.981f)
                lineTo(27.0f, 40.981f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.769f)
                lineToRelative(-2.91f, -2.826f)
                lineToRelative(0.697f, -0.717f)
                close()
                moveTo(33.5f, 4.0f)
                curveToRelative(1.774f, 0.0f, 3.178f, 0.412f, 4.133f, 1.367f)
                curveTo(38.587f, 6.322f, 39.0f, 7.726f, 39.0f, 9.5f)
                lineTo(39.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(15.999f)
                horizontalLineToRelative(-6.998f)
                lineTo(32.002f, 29.0f)
                lineTo(15.0f, 29.0f)
                verticalLineToRelative(3.999f)
                lineTo(8.0f, 32.999f)
                lineTo(8.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 9.5f)
                curveToRelative(0.0f, -1.774f, 0.412f, -3.178f, 1.367f, -4.133f)
                reflectiveCurveTo(11.726f, 4.0f, 13.5f, 4.0f)
                close()
                moveTo(9.0f, 31.999f)
                horizontalLineToRelative(5.0f)
                lineTo(14.0f, 29.0f)
                lineTo(9.0f, 29.0f)
                close()
                moveTo(33.002f, 31.999f)
                lineTo(38.0f, 31.999f)
                lineTo(38.0f, 29.0f)
                horizontalLineToRelative(-4.998f)
                close()
                moveTo(9.0f, 28.0f)
                horizontalLineToRelative(29.0f)
                verticalLineToRelative(-8.999f)
                lineTo(9.0f, 19.001f)
                close()
                moveTo(13.5f, 22.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(20.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-20.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(20.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-20.0f, -18.0f)
                curveToRelative(-1.638f, 0.0f, -2.733f, 0.382f, -3.426f, 1.074f)
                curveTo(9.382f, 6.766f, 9.0f, 7.862f, 9.0f, 9.5f)
                verticalLineToRelative(8.501f)
                horizontalLineToRelative(29.0f)
                lineTo(38.0f, 9.5f)
                curveToRelative(0.0f, -1.638f, -0.382f, -2.734f, -1.074f, -3.426f)
                reflectiveCurveTo(35.138f, 5.0f, 33.5f, 5.0f)
                close()
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(7.0f, 15.0f)
                close()
                moveTo(39.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(34.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(21.0f)
                close()
            }
        }
            .build()
        return _shuttleLarge!!
    }

private var _shuttleLarge: ImageVector? = null
