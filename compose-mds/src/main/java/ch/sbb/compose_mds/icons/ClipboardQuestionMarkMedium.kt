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

public val SBBIcons.ClipboardQuestionMarkMedium: ImageVector
    get() {
        if (_clipboardQuestionMarkMedium != null) {
            return _clipboardQuestionMarkMedium!!
        }
        _clipboardQuestionMarkMedium = Builder(name = "ClipboardQuestionMarkMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.25f, 4.75f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(28.0f)
                lineTo(4.75f, 32.75f)
                verticalLineToRelative(-28.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(5.75f, 31.75f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(-26.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(18.856f, 25.175f)
                horizontalLineToRelative(-1.899f)
                verticalLineToRelative(-1.83f)
                horizontalLineToRelative(1.9f)
                close()
                moveTo(18.022f, 12.027f)
                quadToRelative(1.784f, 0.0f, 2.838f, 1.01f)
                quadToRelative(0.985f, 0.93f, 0.985f, 2.452f)
                quadToRelative(0.0f, 1.258f, -0.668f, 2.163f)
                quadToRelative(-0.299f, 0.413f, -1.432f, 1.52f)
                quadToRelative(-0.5f, 0.483f, -0.7f, 0.804f)
                quadToRelative(-0.197f, 0.321f, -0.276f, 0.797f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.087f, 1.229f)
                horizontalLineToRelative(-1.494f)
                quadToRelative(0.017f, -1.345f, 0.236f, -1.995f)
                quadToRelative(0.159f, -0.475f, 0.453f, -0.852f)
                quadToRelative(0.295f, -0.378f, 1.306f, -1.416f)
                quadToRelative(0.65f, -0.667f, 0.851f, -1.205f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, 0.168f, -0.931f)
                quadToRelative(0.0f, -0.878f, -0.483f, -1.476f)
                quadToRelative(-0.58f, -0.729f, -1.714f, -0.729f)
                quadToRelative(-2.348f, 0.0f, -2.532f, 2.883f)
                horizontalLineToRelative(-1.511f)
                quadToRelative(0.061f, -1.636f, 0.64f, -2.532f)
                quadToRelative(0.538f, -0.825f, 1.425f, -1.275f)
                quadToRelative(0.887f, -0.448f, 1.995f, -0.447f)
                moveTo(14.75f, 6.25f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }
        .build()
        return _clipboardQuestionMarkMedium!!
    }

private var _clipboardQuestionMarkMedium: ImageVector? = null
