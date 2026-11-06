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

public val SBBIcons.DocumentPdfLarge: ImageVector
    get() {
        if (_documentPdfLarge != null) {
            return _documentPdfLarge!!
        }
        _documentPdfLarge = Builder(name = "DocumentPdfLarge", defaultWidth = 48.0.dp, defaultHeight
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
                moveTo(18.915f, 29.503f)
                quadToRelative(0.608f, 0.0f, 0.962f, 0.076f)
                quadToRelative(0.349f, 0.078f, 0.634f, 0.268f)
                quadToRelative(0.781f, 0.528f, 0.782f, 1.584f)
                quadToRelative(0.0f, 0.942f, -0.648f, 1.476f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, -0.627f, 0.33f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -0.87f, 0.102f)
                horizontalLineToRelative(-1.345f)
                verticalLineToRelative(2.16f)
                horizontalLineToRelative(-1.308f)
                verticalLineToRelative(-5.996f)
                close()
                moveTo(24.435f, 29.503f)
                quadToRelative(0.675f, 0.002f, 1.158f, 0.156f)
                quadToRelative(0.482f, 0.155f, 0.85f, 0.494f)
                quadToRelative(0.899f, 0.819f, 0.898f, 2.274f)
                quadToRelative(0.0f, 1.543f, -0.848f, 2.383f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, true, -0.84f, 0.53f)
                quadToRelative(-0.469f, 0.16f, -1.19f, 0.159f)
                lineTo(22.01f, 35.499f)
                verticalLineToRelative(-5.996f)
                close()
                moveTo(32.465f, 30.611f)
                horizontalLineToRelative(-2.912f)
                verticalLineToRelative(1.39f)
                horizontalLineToRelative(2.536f)
                verticalLineToRelative(1.03f)
                horizontalLineToRelative(-2.536f)
                lineTo(29.553f, 35.5f)
                horizontalLineToRelative(-1.308f)
                verticalLineToRelative(-5.996f)
                horizontalLineToRelative(4.22f)
                close()
                moveTo(23.319f, 34.394f)
                horizontalLineToRelative(1.008f)
                quadToRelative(0.465f, -0.002f, 0.74f, -0.093f)
                curveToRelative(0.182f, -0.064f, 0.342f, -0.166f, 0.478f, -0.316f)
                quadToRelative(0.477f, -0.513f, 0.476f, -1.512f)
                quadToRelative(0.0f, -0.917f, -0.44f, -1.39f)
                quadToRelative(-0.44f, -0.471f, -1.304f, -0.472f)
                horizontalLineToRelative(-0.958f)
                close()
                moveTo(17.803f, 32.31f)
                horizontalLineToRelative(1.168f)
                quadToRelative(0.522f, -0.001f, 0.75f, -0.185f)
                quadToRelative(0.285f, -0.23f, 0.284f, -0.678f)
                quadToRelative(0.0f, -0.45f, -0.328f, -0.672f)
                quadToRelative(-0.237f, -0.165f, -0.776f, -0.164f)
                horizontalLineToRelative(-1.098f)
                close()
                moveTo(26.0f, 18.0f)
                horizontalLineToRelative(8.293f)
                lineTo(26.0f, 9.707f)
                close()
            }
        }
        .build()
        return _documentPdfLarge!!
    }

private var _documentPdfLarge: ImageVector? = null
