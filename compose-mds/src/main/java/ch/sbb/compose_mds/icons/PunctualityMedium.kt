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

public val SBBIcons.PunctualityMedium: ImageVector
    get() {
        if (_punctualityMedium != null) {
            return _punctualityMedium!!
        }
        _punctualityMedium = Builder(name = "PunctualityMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.5f, 4.25f)
                verticalLineToRelative(-1.0f)
                lineTo(15.0f, 3.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(6.35f, 0.0f, 11.5f, 5.15f, 11.5f, 11.5f)
                curveToRelative(0.0f, 6.352f, -5.15f, 11.5f, -11.5f, 11.5f)
                reflectiveCurveToRelative(-11.5f, -5.148f, -11.5f, -11.5f)
                verticalLineToRelative(-0.74f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.74f)
                curveToRelative(0.0f, 6.904f, 5.597f, 12.5f, 12.5f, 12.5f)
                reflectiveCurveToRelative(12.5f, -5.596f, 12.5f, -12.5f)
                curveToRelative(0.0f, -6.735f, -5.329f, -12.226f, -12.0f, -12.489f)
                lineTo(17.75f, 4.25f)
                close()
                moveTo(16.907f, 24.29f)
                lineToRelative(7.5f, -10.5f)
                lineToRelative(-0.814f, -0.582f)
                lineToRelative(-7.157f, 10.02f)
                lineToRelative(-4.082f, -4.082f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(4.917f, 4.917f)
                close()
                moveTo(14.997f, 7.447f)
                lineTo(13.549f, 7.835f)
                lineTo(13.29f, 6.869f)
                lineTo(14.739f, 6.481f)
                close()
                moveTo(10.851f, 9.165f)
                lineTo(12.149f, 8.415f)
                lineTo(11.649f, 7.549f)
                lineTo(10.351f, 8.299f)
                close()
                moveTo(9.649f, 10.087f)
                lineTo(8.589f, 11.147f)
                lineTo(7.881f, 10.44f)
                lineTo(8.941f, 9.38f)
                close()
                moveTo(6.915f, 13.647f)
                lineTo(7.665f, 12.349f)
                lineTo(6.8f, 11.849f)
                lineTo(6.05f, 13.148f)
                close()
                moveTo(6.335f, 15.048f)
                lineTo(5.948f, 16.496f)
                lineTo(4.982f, 16.237f)
                lineTo(5.37f, 14.789f)
                close()
            }
        }
        .build()
        return _punctualityMedium!!
    }

private var _punctualityMedium: ImageVector? = null
