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

public val SBBIcons.HighlighterLarge: ImageVector
    get() {
        if (_highlighterLarge != null) {
            return _highlighterLarge!!
        }
        _highlighterLarge = Builder(name = "HighlighterLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(41.155f, 14.448f)
                lineToRelative(-0.25f, 0.346f)
                lineToRelative(-16.0f, 22.0f)
                lineToRelative(-0.344f, 0.474f)
                lineToRelative(-1.23f, -1.23f)
                lineToRelative(-0.46f, 0.078f)
                lineToRelative(-1.69f, 0.29f)
                curveToRelative(-1.189f, 0.2f, -2.55f, 0.426f, -3.387f, 0.554f)
                curveToRelative(-0.328f, 0.487f, -0.76f, 1.139f, -1.126f, 1.694f)
                curveToRelative(-0.206f, 0.313f, -0.392f, 0.595f, -0.525f, 0.8f)
                lineToRelative(-0.159f, 0.24f)
                lineToRelative(-0.043f, 0.066f)
                lineToRelative(-0.011f, 0.016f)
                lineToRelative(-0.003f, 0.004f)
                verticalLineToRelative(0.002f)
                lineToRelative(-0.338f, 0.514f)
                lineToRelative(-1.154f, -1.153f)
                lineTo(11.651f, 41.0f)
                lineTo(5.565f, 41.0f)
                lineToRelative(0.519f, -0.777f)
                lineToRelative(3.772f, -5.66f)
                lineToRelative(-1.192f, -1.192f)
                lineToRelative(0.518f, -0.337f)
                horizontalLineToRelative(0.002f)
                quadToRelative(0.0f, -0.002f, 0.004f, -0.004f)
                lineToRelative(0.019f, -0.011f)
                lineToRelative(0.073f, -0.048f)
                lineToRelative(0.265f, -0.172f)
                lineToRelative(0.86f, -0.555f)
                curveToRelative(0.565f, -0.364f, 1.208f, -0.776f, 1.637f, -1.046f)
                curveToRelative(0.117f, -0.751f, 0.339f, -2.09f, 0.541f, -3.287f)
                lineToRelative(0.296f, -1.747f)
                lineToRelative(0.084f, -0.494f)
                lineToRelative(-1.23f, -1.23f)
                lineToRelative(0.473f, -0.344f)
                lineToRelative(22.0f, -16.0f)
                lineToRelative(0.346f, -0.251f)
                close()
                moveTo(7.435f, 40.0f)
                horizontalLineToRelative(3.914f)
                lineToRelative(2.366f, -1.578f)
                lineToRelative(-3.138f, -3.138f)
                close()
                moveTo(13.569f, 28.078f)
                arcToRelative(269.0f, 269.0f, 0.0f, false, false, -0.575f, 3.496f)
                lineToRelative(-0.034f, 0.229f)
                lineToRelative(-0.196f, 0.122f)
                curveToRelative(-0.399f, 0.247f, -1.157f, 0.733f, -1.819f, 1.16f)
                lineToRelative(-0.7f, 0.452f)
                lineToRelative(5.182f, 5.183f)
                lineToRelative(0.406f, -0.617f)
                curveToRelative(0.414f, -0.626f, 0.913f, -1.38f, 1.253f, -1.883f)
                lineToRelative(0.123f, -0.183f)
                lineToRelative(0.219f, -0.032f)
                curveToRelative(0.79f, -0.116f, 2.284f, -0.365f, 3.586f, -0.586f)
                curveToRelative(0.539f, -0.091f, 1.044f, -0.178f, 1.45f, -0.248f)
                lineToRelative(-8.634f, -8.634f)
                close()
                moveTo(13.267f, 24.56f)
                lineTo(24.44f, 35.732f)
                lineToRelative(2.309f, -3.175f)
                lineToRelative(-4.8f, -4.8f)
                lineToRelative(-0.096f, 0.096f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(0.096f, -0.096f)
                lineToRelative(-4.8f, -4.801f)
                close()
                moveTo(17.261f, 21.654f)
                lineTo(21.949f, 26.343f)
                lineTo(33.147f, 15.147f)
                lineTo(33.853f, 15.854f)
                lineTo(22.656f, 27.05f)
                lineToRelative(4.688f, 4.687f)
                lineToRelative(12.5f, -17.186f)
                lineToRelative(-5.396f, -5.396f)
                close()
            }
        }
        .build()
        return _highlighterLarge!!
    }

private var _highlighterLarge: ImageVector? = null
