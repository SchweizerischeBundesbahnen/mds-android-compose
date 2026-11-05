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

public val SBBIcons.PiggyBankMedium: ImageVector
    get() {
        if (_piggyBankMedium != null) {
            return _piggyBankMedium!!
        }
        _piggyBankMedium = Builder(
            name = "PiggyBankMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(8.75f, 6.75f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, 5.0f, 0.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, -5.0f, 0.0f)
                moveToRelative(2.5f, -3.5f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, 0.0f, 7.0f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, 0.0f, -7.0f)
                moveTo(6.267f, 20.453f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.25f, 18.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.013f, 3.466f)
                curveToRelative(0.163f, 3.001f, 1.898f, 5.635f, 4.487f, 7.405f)
                verticalLineToRelative(3.879f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.042f)
                curveToRelative(1.256f, 0.35f, 2.6f, 0.542f, 4.0f, 0.542f)
                curveToRelative(0.864f, 0.0f, 1.696f, -0.087f, 2.5f, -0.227f)
                verticalLineToRelative(1.727f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.022f)
                curveToRelative(2.105f, -1.055f, 3.83f, -2.598f, 4.877f, -4.478f)
                horizontalLineToRelative(2.623f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-1.968f)
                curveToRelative(-0.495f, -1.463f, -1.378f, -2.781f, -2.532f, -3.892f)
                verticalLineTo(9.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -3.481f, 3.3f)
                lineToRelative(0.998f, 0.057f)
                arcTo(2.495f, 2.495f, 0.0f, false, true, 27.25f, 10.3f)
                verticalLineToRelative(4.493f)
                lineToRelative(0.16f, 0.148f)
                curveToRelative(1.215f, 1.125f, 2.097f, 2.47f, 2.525f, 3.948f)
                lineToRelative(0.105f, 0.361f)
                horizontalLineToRelative(1.71f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.228f)
                lineToRelative(-0.14f, 0.271f)
                curveToRelative(-0.954f, 1.86f, -2.67f, 3.413f, -4.846f, 4.442f)
                lineToRelative(-0.286f, 0.135f)
                verticalLineToRelative(2.652f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.949f)
                lineToRelative(-0.603f, 0.127f)
                curveToRelative(-0.937f, 0.197f, -1.9f, 0.322f, -2.897f, 0.322f)
                curveToRelative(-1.539f, 0.0f, -3.003f, -0.25f, -4.344f, -0.69f)
                lineToRelative(-0.656f, -0.216f)
                verticalLineToRelative(2.406f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.417f)
                lineToRelative(-0.227f, -0.148f)
                curveTo(8.893f, 26.47f, 7.25f, 23.875f, 7.25f, 21.0f)
                curveToRelative(0.0f, -3.365f, 2.257f, -6.356f, 5.713f, -7.982f)
                lineToRelative(-0.426f, -0.905f)
                curveToRelative(-3.534f, 1.663f, -6.039f, 4.73f, -6.27f, 8.34f)
                moveTo(18.75f, 10.25f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(-3.5f, 2.5f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, 7.0f, 0.0f)
                curveToRelative(0.0f, 1.07f, -0.48f, 2.028f, -1.238f, 2.67f)
                curveToRelative(0.83f, 0.126f, 1.63f, 0.32f, 2.394f, 0.57f)
                lineToRelative(-0.312f, 0.95f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -4.344f, -0.69f)
                curveToRelative(-1.539f, 0.0f, -3.003f, 0.25f, -4.344f, 0.69f)
                lineToRelative(-0.312f, -0.95f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 2.394f, -0.57f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.238f, -2.67f)
                moveTo(27.0f, 19.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(27.0f)
                close()
            }
        }
            .build()
        return _piggyBankMedium!!
    }

private var _piggyBankMedium: ImageVector? = null
