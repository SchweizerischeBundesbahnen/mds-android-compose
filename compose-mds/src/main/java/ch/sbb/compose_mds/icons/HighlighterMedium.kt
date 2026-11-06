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

public val SBBIcons.HighlighterMedium: ImageVector
    get() {
        if (_highlighterMedium != null) {
            return _highlighterMedium!!
        }
        _highlighterMedium = Builder(name = "HighlighterMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(31.405f, 11.198f)
                lineToRelative(-0.251f, 0.345f)
                lineToRelative(-12.0f, 16.5f)
                lineToRelative(-0.344f, 0.474f)
                lineToRelative(-0.981f, -0.981f)
                lineToRelative(-0.28f, 0.048f)
                lineToRelative(-1.268f, 0.217f)
                curveToRelative(-0.865f, 0.147f, -1.853f, 0.31f, -2.487f, 0.408f)
                arcToRelative(201.0f, 201.0f, 0.0f, false, false, -1.209f, 1.824f)
                lineToRelative(-0.118f, 0.18f)
                lineToRelative(-0.032f, 0.05f)
                lineToRelative(-0.008f, 0.012f)
                lineToRelative(-0.003f, 0.004f)
                lineToRelative(-0.337f, 0.515f)
                lineToRelative(-0.435f, -0.435f)
                lineToRelative(-0.467f, -0.467f)
                lineToRelative(-2.034f, 1.358f)
                lineTo(4.315f, 31.25f)
                lineToRelative(0.518f, -0.778f)
                lineToRelative(2.773f, -4.159f)
                lineToRelative(-0.93f, -0.93f)
                lineToRelative(0.517f, -0.338f)
                horizontalLineToRelative(0.002f)
                lineToRelative(0.003f, -0.003f)
                lineToRelative(0.014f, -0.008f)
                lineToRelative(0.055f, -0.036f)
                lineToRelative(0.198f, -0.13f)
                lineToRelative(0.645f, -0.415f)
                curveToRelative(0.403f, -0.26f, 0.86f, -0.553f, 1.181f, -0.755f)
                curveToRelative(0.09f, -0.574f, 0.252f, -1.543f, 0.398f, -2.41f)
                lineToRelative(0.222f, -1.312f)
                lineToRelative(0.051f, -0.307f)
                lineToRelative(-0.98f, -0.98f)
                lineToRelative(0.474f, -0.344f)
                lineToRelative(16.5f, -12.0f)
                lineToRelative(0.345f, -0.25f)
                close()
                moveTo(6.185f, 30.25f)
                horizontalLineToRelative(2.663f)
                lineToRelative(1.616f, -1.079f)
                lineToRelative(-2.137f, -2.137f)
                close()
                moveTo(10.675f, 21.454f)
                curveToRelative(-0.17f, 1.0f, -0.355f, 2.12f, -0.43f, 2.62f)
                lineToRelative(-0.496f, -0.076f)
                lineTo(9.749f, 24.0f)
                lineToRelative(0.496f, 0.074f)
                lineToRelative(-0.035f, 0.228f)
                lineToRelative(-0.197f, 0.122f)
                curveToRelative(-0.298f, 0.185f, -0.865f, 0.55f, -1.361f, 0.87f)
                lineToRelative(-0.397f, 0.254f)
                lineToRelative(3.67f, 3.67f)
                lineToRelative(0.22f, -0.335f)
                curveToRelative(0.31f, -0.47f, 0.685f, -1.036f, 0.94f, -1.414f)
                lineToRelative(0.124f, -0.182f)
                lineToRelative(0.218f, -0.033f)
                curveToRelative(0.59f, -0.086f, 1.71f, -0.272f, 2.687f, -0.438f)
                lineToRelative(0.848f, -0.147f)
                lineToRelative(-6.132f, -6.132f)
                close()
                moveTo(10.516f, 18.809f)
                lineTo(18.689f, 26.982f)
                lineTo(30.093f, 11.3f)
                lineToRelative(-3.895f, -3.895f)
                close()
                moveTo(25.853f, 12.353f)
                lineTo(16.853f, 21.353f)
                lineTo(16.146f, 20.646f)
                lineTo(25.146f, 11.646f)
                close()
            }
        }
        .build()
        return _highlighterMedium!!
    }

private var _highlighterMedium: ImageVector? = null
