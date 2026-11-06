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

public val SBBIcons.SuitcaseQuestionMarkMedium: ImageVector
    get() {
        if (_suitcaseQuestionMarkMedium != null) {
            return _suitcaseQuestionMarkMedium!!
        }
        _suitcaseQuestionMarkMedium = Builder(name = "SuitcaseQuestionMarkMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.25f, 10.763f)
                horizontalLineToRelative(9.0f)
                lineTo(31.25f, 31.25f)
                lineTo(4.75f, 31.25f)
                lineTo(4.75f, 10.763f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(5.75f, 30.25f)
                horizontalLineToRelative(24.5f)
                lineTo(30.25f, 11.763f)
                lineTo(5.75f, 11.763f)
                close()
                moveTo(18.856f, 28.176f)
                horizontalLineToRelative(-1.899f)
                verticalLineToRelative(-1.83f)
                horizontalLineToRelative(1.898f)
                close()
                moveTo(18.022f, 15.028f)
                quadToRelative(1.784f, -0.001f, 2.84f, 1.01f)
                quadToRelative(0.983f, 0.93f, 0.983f, 2.451f)
                quadToRelative(0.0f, 1.259f, -0.668f, 2.164f)
                quadToRelative(-0.3f, 0.413f, -1.432f, 1.52f)
                quadToRelative(-0.502f, 0.482f, -0.7f, 0.804f)
                quadToRelative(-0.196f, 0.322f, -0.276f, 0.796f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.088f, 1.23f)
                horizontalLineToRelative(-1.495f)
                quadToRelative(0.02f, -1.345f, 0.238f, -1.995f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 0.453f, -0.852f)
                quadToRelative(0.296f, -0.379f, 1.305f, -1.416f)
                quadToRelative(0.652f, -0.668f, 0.852f, -1.205f)
                quadToRelative(0.169f, -0.456f, 0.168f, -0.931f)
                quadToRelative(0.0f, -0.878f, -0.483f, -1.477f)
                quadToRelative(-0.58f, -0.729f, -1.714f, -0.728f)
                quadToRelative(-2.348f, 0.0f, -2.532f, 2.883f)
                horizontalLineToRelative(-1.511f)
                quadToRelative(0.061f, -1.636f, 0.64f, -2.533f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 1.426f, -1.274f)
                quadToRelative(0.886f, -0.447f, 1.995f, -0.447f)
                moveToRelative(-3.272f, -4.265f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }
        .build()
        return _suitcaseQuestionMarkMedium!!
    }

private var _suitcaseQuestionMarkMedium: ImageVector? = null
