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

public val SBBIcons.HighlighterSmall: ImageVector
    get() {
        if (_highlighterSmall != null) {
            return _highlighterSmall!!
        }
        _highlighterSmall = Builder(
            name = "HighlighterSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveToRelative(21.155f, 7.448f)
                lineToRelative(-0.251f, 0.345f)
                lineToRelative(-8.0f, 11.0f)
                lineToRelative(-0.344f, 0.474f)
                lineToRelative(-0.73f, -0.73f)
                lineToRelative(-0.102f, 0.017f)
                lineToRelative(-0.846f, 0.145f)
                curveToRelative(-0.544f, 0.092f, -1.163f, 0.193f, -1.588f, 0.26f)
                lineToRelative(-0.502f, 0.755f)
                lineToRelative(-0.262f, 0.4f)
                quadToRelative(-0.05f, 0.076f, -0.08f, 0.12f)
                lineToRelative(-0.02f, 0.032f)
                lineToRelative(-0.006f, 0.009f)
                lineToRelative(-0.002f, 0.002f)
                lineToRelative(-0.337f, 0.514f)
                lineToRelative(-0.649f, -0.649f)
                lineTo(6.151f, 21.0f)
                lineTo(2.565f, 21.0f)
                lineToRelative(0.519f, -0.778f)
                lineToRelative(1.772f, -2.66f)
                lineToRelative(-0.669f, -0.669f)
                lineToRelative(0.518f, -0.336f)
                lineToRelative(0.003f, -0.002f)
                lineToRelative(0.01f, -0.006f)
                lineToRelative(0.036f, -0.024f)
                lineToRelative(0.132f, -0.086f)
                lineToRelative(0.43f, -0.277f)
                curveToRelative(0.244f, -0.157f, 0.517f, -0.332f, 0.726f, -0.464f)
                arcToRelative(176.0f, 176.0f, 0.0f, false, true, 0.4f, -2.408f)
                lineToRelative(0.02f, -0.12f)
                lineToRelative(-0.73f, -0.731f)
                lineToRelative(0.474f, -0.344f)
                lineToRelative(11.0f, -8.0f)
                lineToRelative(0.345f, -0.25f)
                close()
                moveTo(4.435f, 20.0f)
                horizontalLineToRelative(1.413f)
                lineToRelative(0.867f, -0.579f)
                lineToRelative(-1.137f, -1.137f)
                close()
                moveTo(7.281f, 14.33f)
                curveToRelative(-0.113f, 0.667f, -0.237f, 1.412f, -0.286f, 1.744f)
                lineToRelative(-0.035f, 0.228f)
                lineToRelative(-0.197f, 0.122f)
                curveToRelative(-0.197f, 0.123f, -0.574f, 0.365f, -0.905f, 0.578f)
                quadToRelative(-0.045f, 0.03f, -0.09f, 0.058f)
                lineToRelative(2.155f, 2.155f)
                lineToRelative(0.035f, -0.051f)
                curveToRelative(0.206f, -0.314f, 0.457f, -0.692f, 0.627f, -0.945f)
                lineToRelative(0.124f, -0.182f)
                lineToRelative(0.218f, -0.033f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 1.788f, -0.292f)
                lineToRelative(0.247f, -0.043f)
                lineToRelative(-3.632f, -3.632f)
                close()
                moveTo(7.266f, 12.56f)
                lineTo(12.439f, 17.732f)
                lineTo(19.843f, 7.55f)
                lineToRelative(-2.395f, -2.395f)
                close()
                moveTo(17.353f, 8.353f)
                lineTo(11.353f, 14.353f)
                lineTo(10.646f, 13.646f)
                lineTo(16.646f, 7.646f)
                close()
            }
        }
            .build()
        return _highlighterSmall!!
    }

private var _highlighterSmall: ImageVector? = null
