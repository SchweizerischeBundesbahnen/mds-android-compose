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

public val SBBIcons.SuitcaseQuestionMarkLarge: ImageVector
    get() {
        if (_suitcaseQuestionMarkLarge != null) {
            return _suitcaseQuestionMarkLarge!!
        }
        _suitcaseQuestionMarkLarge = Builder(name = "SuitcaseQuestionMarkLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.0f, 14.018f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(26.983f)
                lineTo(6.0f, 41.001f)
                lineTo(6.0f, 14.018f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(7.0f, 40.001f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 15.018f)
                lineTo(7.0f, 15.018f)
                close()
                moveTo(36.0f, 40.001f)
                horizontalLineToRelative(4.0f)
                lineTo(40.0f, 15.018f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(12.0f, 40.001f)
                horizontalLineToRelative(23.0f)
                lineTo(35.0f, 15.018f)
                lineTo(12.0f, 15.018f)
                close()
                moveTo(24.642f, 37.066f)
                lineTo(22.11f, 37.066f)
                verticalLineToRelative(-2.438f)
                horizontalLineToRelative(2.532f)
                close()
                moveTo(23.53f, 19.536f)
                quadToRelative(2.378f, 0.0f, 3.784f, 1.346f)
                quadToRelative(1.313f, 1.242f, 1.312f, 3.27f)
                quadToRelative(0.0f, 1.676f, -0.89f, 2.884f)
                quadToRelative(-0.399f, 0.55f, -1.91f, 2.026f)
                quadToRelative(-0.669f, 0.646f, -0.932f, 1.072f)
                quadToRelative(-0.264f, 0.429f, -0.368f, 1.062f)
                quadToRelative(-0.117f, 0.632f, -0.118f, 1.64f)
                horizontalLineToRelative(-1.992f)
                quadToRelative(0.024f, -1.794f, 0.316f, -2.66f)
                quadToRelative(0.212f, -0.634f, 0.604f, -1.136f)
                quadToRelative(0.393f, -0.505f, 1.74f, -1.888f)
                quadToRelative(0.868f, -0.89f, 1.136f, -1.607f)
                quadToRelative(0.224f, -0.608f, 0.224f, -1.24f)
                quadToRelative(-0.001f, -1.171f, -0.644f, -1.97f)
                quadToRelative(-0.774f, -0.97f, -2.286f, -0.971f)
                quadToRelative(-3.13f, 0.0f, -3.376f, 3.843f)
                horizontalLineToRelative(-2.014f)
                quadToRelative(0.082f, -2.18f, 0.854f, -3.376f)
                arcToRelative(4.83f, 4.83f, 0.0f, false, true, 1.9f, -1.699f)
                quadToRelative(1.181f, -0.596f, 2.66f, -0.596f)
                moveTo(19.0f, 14.018f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
        .build()
        return _suitcaseQuestionMarkLarge!!
    }

private var _suitcaseQuestionMarkLarge: ImageVector? = null
