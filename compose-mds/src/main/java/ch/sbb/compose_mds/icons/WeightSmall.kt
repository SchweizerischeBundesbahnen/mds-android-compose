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

public val SBBIcons.WeightSmall: ImageVector
    get() {
        if (_weightSmall != null) {
            return _weightSmall!!
        }
        _weightSmall = Builder(name = "WeightSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.563f, -0.189f, 1.082f, -0.504f, 1.5f)
                horizontalLineToRelative(4.933f)
                lineToRelative(0.065f, 0.424f)
                lineToRelative(2.0f, 13.0f)
                lineToRelative(0.09f, 0.576f)
                lineTo(2.916f, 21.0f)
                lineToRelative(0.089f, -0.576f)
                lineToRelative(2.0f, -13.0f)
                lineTo(5.071f, 7.0f)
                horizontalLineToRelative(4.933f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 3.0f)
                moveTo(4.083f, 20.0f)
                horizontalLineToRelative(15.834f)
                lineTo(18.071f, 8.0f)
                lineTo(5.93f, 8.0f)
                close()
                moveTo(14.779f, 11.874f)
                quadToRelative(1.125f, 0.0f, 1.831f, 0.727f)
                quadToRelative(0.529f, 0.547f, 0.607f, 1.289f)
                lineTo(16.01f, 13.89f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -0.42f, -0.72f)
                quadToRelative(-0.327f, -0.257f, -0.826f, -0.257f)
                quadToRelative(-0.758f, 0.0f, -1.172f, 0.586f)
                quadToRelative(-0.363f, 0.511f, -0.363f, 1.383f)
                quadToRelative(0.0f, 0.852f, 0.339f, 1.351f)
                quadToRelative(0.418f, 0.613f, 1.235f, 0.614f)
                quadToRelative(0.59f, -0.001f, 0.967f, -0.356f)
                quadToRelative(0.376f, -0.356f, 0.396f, -0.933f)
                horizontalLineToRelative(-1.27f)
                verticalLineToRelative(-0.914f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(3.078f)
                horizontalLineToRelative(-0.798f)
                lineToRelative(-0.125f, -0.653f)
                quadToRelative(-0.632f, 0.789f, -1.707f, 0.79f)
                quadToRelative(-1.308f, 0.001f, -2.066f, -0.97f)
                quadToRelative(-0.63f, -0.808f, -0.63f, -1.995f)
                quadToRelative(0.0f, -1.348f, 0.821f, -2.207f)
                quadToRelative(0.77f, -0.813f, 1.987f, -0.813f)
                moveToRelative(-6.761f, 2.5f)
                lineToRelative(2.238f, -2.363f)
                horizontalLineToRelative(1.578f)
                lineToRelative(-2.238f, 2.258f)
                lineToRelative(2.45f, 3.453f)
                lineTo(10.47f, 17.722f)
                lineToRelative(-1.734f, -2.563f)
                lineToRelative(-0.72f, 0.719f)
                verticalLineToRelative(1.844f)
                lineTo(6.773f, 17.722f)
                lineTo(6.773f, 12.01f)
                horizontalLineToRelative(1.246f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
            }
        }
        .build()
        return _weightSmall!!
    }

private var _weightSmall: ImageVector? = null
