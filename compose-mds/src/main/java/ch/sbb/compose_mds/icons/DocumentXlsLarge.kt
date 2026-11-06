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

public val SBBIcons.DocumentXlsLarge: ImageVector
    get() {
        if (_documentXlsLarge != null) {
            return _documentXlsLarge!!
        }
        _documentXlsLarge = Builder(name = "DocumentXlsLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.0f, 18.293f)
                lineTo(36.0f, 39.0f)
                lineTo(13.0f, 39.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.018f, -30.0f)
                lineTo(13.018f, 8.0f)
                horizontalLineToRelative(12.689f)
                close()
                moveTo(14.0f, 38.0f)
                horizontalLineToRelative(21.0f)
                lineTo(35.0f, 19.0f)
                lineTo(25.0f, 19.0f)
                lineTo(25.0f, 9.0f)
                lineTo(14.018f, 9.0f)
                close()
                moveTo(30.194f, 29.361f)
                quadToRelative(0.858f, 0.0f, 1.436f, 0.34f)
                curveToRelative(0.554f, 0.328f, 0.846f, 0.852f, 0.878f, 1.582f)
                lineTo(31.26f, 31.283f)
                quadToRelative(-0.035f, -0.438f, -0.326f, -0.672f)
                quadToRelative(-0.29f, -0.232f, -0.81f, -0.23f)
                quadToRelative(-0.465f, -0.002f, -0.72f, 0.18f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, -0.256f, 0.512f)
                quadToRelative(0.0f, 0.296f, 0.246f, 0.424f)
                quadToRelative(0.239f, 0.133f, 1.206f, 0.372f)
                quadToRelative(1.02f, 0.253f, 1.416f, 0.512f)
                quadToRelative(0.723f, 0.475f, 0.724f, 1.324f)
                quadToRelative(0.001f, 0.93f, -0.73f, 1.468f)
                quadToRelative(-0.643f, 0.475f, -1.742f, 0.474f)
                quadToRelative(-1.222f, -0.001f, -1.898f, -0.56f)
                curveToRelative(-0.452f, -0.37f, -0.686f, -0.902f, -0.702f, -1.586f)
                horizontalLineToRelative(1.302f)
                quadToRelative(0.03f, 0.497f, 0.26f, 0.742f)
                quadToRelative(0.36f, 0.386f, 1.086f, 0.384f)
                quadToRelative(0.492f, 0.002f, 0.78f, -0.192f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.324f, -0.602f)
                quadToRelative(0.0f, -0.381f, -0.454f, -0.558f)
                quadToRelative(-0.25f, -0.098f, -1.182f, -0.356f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.91f, -0.304f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.526f, -0.32f)
                quadToRelative(-0.46f, -0.411f, -0.46f, -1.134f)
                quadToRelative(0.0f, -0.862f, 0.72f, -1.366f)
                quadToRelative(0.61f, -0.434f, 1.586f, -0.434f)
                moveToRelative(-6.062f, 5.034f)
                horizontalLineToRelative(2.934f)
                verticalLineToRelative(1.107f)
                horizontalLineToRelative(-4.242f)
                verticalLineToRelative(-5.996f)
                horizontalLineToRelative(1.308f)
                close()
                moveTo(19.389f, 31.429f)
                lineTo(20.593f, 29.505f)
                horizontalLineToRelative(1.454f)
                lineToRelative(-1.928f, 2.86f)
                lineToRelative(2.104f, 3.136f)
                horizontalLineToRelative(-1.575f)
                lineToRelative(-1.313f, -2.084f)
                lineToRelative(-1.336f, 2.084f)
                horizontalLineToRelative(-1.498f)
                lineToRelative(2.116f, -3.136f)
                lineToRelative(-1.952f, -2.86f)
                horizontalLineToRelative(1.534f)
                close()
                moveTo(26.0f, 18.0f)
                horizontalLineToRelative(8.293f)
                lineTo(26.0f, 9.707f)
                close()
            }
        }
        .build()
        return _documentXlsLarge!!
    }

private var _documentXlsLarge: ImageVector? = null
