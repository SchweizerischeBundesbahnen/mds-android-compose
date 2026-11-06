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

public val SBBIcons.CertificateRibbonLarge: ImageVector
    get() {
        if (_certificateRibbonLarge != null) {
            return _certificateRibbonLarge!!
        }
        _certificateRibbonLarge = Builder(name = "CertificateRibbonLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.5f, 4.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -9.5f, 9.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, 9.5f)
                curveToRelative(5.246f, 0.0f, 9.5f, -4.253f, 9.5f, -9.5f)
                reflectiveCurveTo(28.746f, 4.0f, 23.5f, 4.0f)
                moveTo(13.0f, 13.5f)
                curveTo(13.0f, 7.7f, 17.7f, 3.0f, 23.5f, 3.0f)
                curveTo(29.298f, 3.0f, 34.0f, 7.7f, 34.0f, 13.5f)
                curveToRelative(0.0f, 3.345f, -1.564f, 6.324f, -4.0f, 8.247f)
                verticalLineToRelative(19.21f)
                lineToRelative(-0.895f, -1.15f)
                lineToRelative(-3.152f, -4.053f)
                lineToRelative(-0.953f, 0.953f)
                verticalLineToRelative(8.25f)
                lineToRelative(-0.895f, -1.15f)
                lineTo(21.0f, 39.814f)
                lineToRelative(-3.105f, 3.993f)
                lineToRelative(-0.895f, 1.15f)
                verticalLineToRelative(-23.21f)
                arcToRelative(10.48f, 10.48f, 0.0f, false, true, -4.0f, -8.247f)
                moveToRelative(12.0f, 10.394f)
                arcToRelative(10.4f, 10.4f, 0.0f, false, false, 4.0f, -1.448f)
                verticalLineToRelative(15.597f)
                lineToRelative(-2.605f, -3.35f)
                lineToRelative(-0.348f, -0.447f)
                lineToRelative(-0.4f, 0.4f)
                lineToRelative(-0.647f, 0.647f)
                close()
                moveTo(23.5f, 24.0f)
                quadToRelative(0.251f, 0.0f, 0.5f, -0.012f)
                verticalLineToRelative(18.055f)
                lineToRelative(-2.605f, -3.35f)
                lineToRelative(-0.395f, -0.507f)
                lineToRelative(-0.395f, 0.507f)
                lineTo(18.0f, 42.043f)
                verticalLineTo(22.446f)
                curveToRelative(1.6f, 0.985f, 3.483f, 1.554f, 5.5f, 1.554f)
                moveTo(16.0f, 13.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, 15.0f, 0.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -15.0f, 0.0f)
                moveTo(23.5f, 5.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
            }
        }
        .build()
        return _certificateRibbonLarge!!
    }

private var _certificateRibbonLarge: ImageVector? = null
