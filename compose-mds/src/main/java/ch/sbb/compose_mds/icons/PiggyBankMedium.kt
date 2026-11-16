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
        _piggyBankMedium = Builder(name = "PiggyBankMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.25f, 4.25f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(0.0f, 6.0f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, 0.0f, -7.0f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, 0.0f, 7.0f)
                moveTo(6.267f, 20.453f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.25f, 18.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.013f, 3.466f)
                curveToRelative(0.163f, 3.0f, 1.898f, 5.633f, 4.487f, 7.403f)
                verticalLineToRelative(3.881f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.044f)
                curveToRelative(1.256f, 0.349f, 2.6f, 0.544f, 4.0f, 0.544f)
                curveToRelative(0.864f, 0.0f, 1.696f, -0.088f, 2.5f, -0.229f)
                verticalLineToRelative(1.729f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.024f)
                curveToRelative(2.104f, -1.055f, 3.827f, -2.597f, 4.874f, -4.476f)
                horizontalLineToRelative(2.626f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-1.969f)
                curveToRelative(-0.495f, -1.463f, -1.377f, -2.78f, -2.531f, -3.89f)
                verticalLineTo(9.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -3.481f, 3.3f)
                lineToRelative(0.999f, 0.057f)
                arcTo(2.496f, 2.496f, 0.0f, false, true, 27.25f, 10.3f)
                verticalLineToRelative(4.493f)
                lineToRelative(0.16f, 0.148f)
                curveToRelative(1.14f, 1.055f, 1.985f, 2.304f, 2.44f, 3.673f)
                lineToRelative(0.085f, 0.276f)
                lineToRelative(0.105f, 0.36f)
                horizontalLineToRelative(1.71f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.227f)
                lineToRelative(-0.14f, 0.271f)
                curveToRelative(-0.955f, 1.86f, -2.671f, 3.413f, -4.847f, 4.442f)
                lineToRelative(-0.286f, 0.136f)
                verticalLineToRelative(2.651f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(29.8f)
                lineToRelative(-0.602f, 0.128f)
                curveToRelative(-0.938f, 0.197f, -1.9f, 0.322f, -2.898f, 0.322f)
                curveToRelative(-1.539f, 0.0f, -3.003f, -0.25f, -4.344f, -0.69f)
                lineToRelative(-0.656f, -0.216f)
                verticalLineToRelative(2.406f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.417f)
                lineToRelative(-0.227f, -0.148f)
                curveTo(8.893f, 26.47f, 7.25f, 23.875f, 7.25f, 21.0f)
                curveToRelative(0.0f, -3.365f, 2.257f, -6.357f, 5.713f, -7.982f)
                lineToRelative(-0.426f, -0.905f)
                curveToRelative(-3.534f, 1.663f, -6.039f, 4.73f, -6.27f, 8.34f)
                moveTo(21.25f, 12.75f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, -5.0f, 0.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 5.0f, 0.0f)
                moveToRelative(-0.238f, 2.67f)
                arcToRelative(3.501f, 3.501f, 0.0f, true, false, -5.762f, -2.67f)
                curveToRelative(0.0f, 1.07f, 0.48f, 2.028f, 1.238f, 2.67f)
                curveToRelative(-0.83f, 0.126f, -1.63f, 0.32f, -2.394f, 0.57f)
                lineToRelative(0.312f, 0.95f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, 4.344f, -0.69f)
                curveToRelative(1.539f, 0.0f, 3.003f, 0.25f, 4.344f, 0.69f)
                lineToRelative(0.312f, -0.95f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, -2.394f, -0.57f)
                moveTo(27.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _piggyBankMedium!!
    }

private var _piggyBankMedium: ImageVector? = null
