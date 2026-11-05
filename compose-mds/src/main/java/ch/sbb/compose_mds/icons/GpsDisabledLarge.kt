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

public val SBBIcons.GpsDisabledLarge: ImageVector
    get() {
        if (_gpsDisabledLarge != null) {
            return _gpsDisabledLarge!!
        }
        _gpsDisabledLarge = Builder(
            name = "GpsDisabledLarge",
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
                pathFillType = EvenOdd,
            ) {
                moveToRelative(35.808f, 36.516f)
                lineToRelative(9.839f, 9.838f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-43.0f, -43.0f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(9.839f, 9.838f)
                arcTo(16.44f, 16.44f, 0.0f, false, false, 7.995f, 24.0f)
                lineTo(3.0f, 24.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.995f)
                arcToRelative(16.45f, 16.45f, 0.0f, false, false, 4.838f, 11.167f)
                arcTo(16.45f, 16.45f, 0.0f, false, false, 24.0f, 41.005f)
                lineTo(24.0f, 46.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.995f)
                arcToRelative(16.44f, 16.44f, 0.0f, false, false, 10.808f, -4.49f)
                moveToRelative(-0.707f, -0.708f)
                lineToRelative(-4.246f, -4.246f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, true, -13.073f, -0.345f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, true, -0.344f, -13.072f)
                lineToRelative(-4.246f, -4.246f)
                arcToRelative(15.466f, 15.466f, 0.0f, false, false, 0.348f, 21.561f)
                arcToRelative(15.466f, 15.466f, 0.0f, false, false, 21.56f, 0.348f)
                moveTo(18.146f, 18.853f)
                arcToRelative(8.48f, 8.48f, 0.0f, false, false, 0.343f, 11.657f)
                arcToRelative(8.48f, 8.48f, 0.0f, false, false, 11.658f, 0.344f)
                close()
                moveTo(24.0f, 8.008f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, -8.91f, 2.956f)
                lineToRelative(0.57f, 0.82f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, true, 8.84f, -2.783f)
                curveTo(33.085f, 9.0f, 40.0f, 15.915f, 40.0f, 24.5f)
                curveToRelative(0.0f, 3.295f, -1.039f, 6.331f, -2.785f, 8.839f)
                lineToRelative(0.82f, 0.571f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 40.993f, 25.0f)
                horizontalLineToRelative(5.006f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.006f)
                arcTo(16.466f, 16.466f, 0.0f, false, false, 25.0f, 8.008f)
                lineTo(25.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(20.248f, 16.026f)
                arcTo(9.4f, 9.4f, 0.0f, false, true, 24.5f, 15.0f)
                curveToRelative(5.26f, 0.0f, 9.5f, 4.24f, 9.5f, 9.5f)
                curveToRelative(0.0f, 1.54f, -0.384f, 2.976f, -1.026f, 4.252f)
                lineToRelative(-0.893f, -0.45f)
                curveToRelative(0.578f, -1.149f, 0.92f, -2.431f, 0.92f, -3.802f)
                curveToRelative(0.0f, -4.709f, -3.793f, -8.5f, -8.5f, -8.5f)
                curveToRelative(-1.371f, 0.0f, -2.655f, 0.341f, -3.804f, 0.919f)
                close()
            }
        }
            .build()
        return _gpsDisabledLarge!!
    }

private var _gpsDisabledLarge: ImageVector? = null
