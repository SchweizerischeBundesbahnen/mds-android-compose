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
        _punctualityMedium = Builder(
            name = "PunctualityMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(17.75f, 4.25f)
                horizontalLineToRelative(1.75f)
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
                curveToRelative(0.0f, -6.735f, -5.329f, -12.227f, -12.0f, -12.49f)
                close()
                moveTo(16.907f, 24.29f)
                lineTo(24.407f, 13.79f)
                lineTo(23.593f, 13.21f)
                lineTo(16.436f, 23.23f)
                lineTo(12.354f, 19.147f)
                lineTo(11.646f, 19.854f)
                lineTo(16.146f, 24.354f)
                lineTo(16.564f, 24.771f)
                close()
                moveTo(14.997f, 7.448f)
                lineTo(13.549f, 7.836f)
                lineTo(13.289f, 6.87f)
                lineTo(14.739f, 6.482f)
                close()
                moveTo(10.851f, 9.166f)
                lineTo(12.149f, 8.416f)
                lineTo(11.649f, 7.55f)
                lineTo(10.351f, 8.3f)
                close()
                moveTo(9.649f, 10.088f)
                lineTo(8.589f, 11.148f)
                lineTo(7.881f, 10.441f)
                lineTo(8.941f, 9.381f)
                close()
                moveTo(6.916f, 13.649f)
                lineTo(7.666f, 12.35f)
                lineTo(6.8f, 11.85f)
                lineTo(6.05f, 13.149f)
                close()
                moveTo(6.336f, 15.049f)
                lineTo(5.948f, 16.498f)
                lineTo(4.982f, 16.238f)
                lineTo(5.37f, 14.79f)
                close()
            }
        }
            .build()
        return _punctualityMedium!!
    }

private var _punctualityMedium: ImageVector? = null
