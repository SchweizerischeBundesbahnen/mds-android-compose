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

public val SBBIcons.ArrowCircleLightningSmall: ImageVector
    get() {
        if (_arrowCircleLightningSmall != null) {
            return _arrowCircleLightningSmall!!
        }
        _arrowCircleLightningSmall = Builder(name = "ArrowCircleLightningSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-3.823f, 0.0f, -7.292f, -2.15f, -9.0f, -5.319f)
                lineTo(3.0f, 19.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.773f, 16.0f)
                curveToRelative(1.49f, 2.956f, 4.687f, 5.0f, 8.227f, 5.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -9.0f, -9.0f)
                close()
                moveTo(9.5f, 5.0f)
                horizontalLineToRelative(-0.377f)
                lineToRelative(-0.104f, 0.363f)
                lineToRelative(-2.0f, 7.0f)
                lineToRelative(-0.182f, 0.637f)
                horizontalLineToRelative(4.053f)
                lineToRelative(-0.88f, 4.402f)
                lineToRelative(-0.433f, 2.162f)
                lineTo(10.9f, 17.8f)
                lineToRelative(6.0f, -8.0f)
                lineToRelative(0.6f, -0.8f)
                horizontalLineToRelative(-4.191f)
                lineToRelative(1.638f, -3.276f)
                lineTo(15.31f, 5.0f)
                lineTo(9.5f, 5.0f)
                moveToRelative(-1.337f, 7.0f)
                lineToRelative(1.714f, -6.0f)
                horizontalLineToRelative(3.814f)
                lineToRelative(-1.638f, 3.276f)
                lineToRelative(-0.362f, 0.724f)
                lineTo(15.5f, 10.0f)
                lineToRelative(-4.077f, 5.437f)
                lineToRelative(0.567f, -2.839f)
                lineToRelative(0.12f, -0.598f)
                lineTo(8.163f, 12.0f)
            }
        }
        .build()
        return _arrowCircleLightningSmall!!
    }

private var _arrowCircleLightningSmall: ImageVector? = null
