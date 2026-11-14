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

public val SBBIcons.TwoSpeechBubblesRainbowMedium: ImageVector
    get() {
        if (_twoSpeechBubblesRainbowMedium != null) {
            return _twoSpeechBubblesRainbowMedium!!
        }
        _twoSpeechBubblesRainbowMedium = Builder(name = "TwoSpeechBubblesRainbowMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.75f, 12.25f)
                verticalLineToRelative(-4.5f)
                lineTo(3.25f, 7.75f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.19f)
                lineToRelative(0.874f, -0.983f)
                lineToRelative(2.85f, -3.207f)
                horizontalLineToRelative(0.776f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(8.918f)
                lineToRelative(4.082f, 4.082f)
                lineTo(26.75f, 26.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-14.5f)
                close()
                moveTo(23.75f, 13.25f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(2.0f)
                lineTo(27.0f, 19.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(8.332f)
                lineToRelative(2.668f, 2.668f)
                lineTo(25.75f, 25.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-12.5f)
                close()
                moveTo(10.25f, 21.25f)
                horizontalLineToRelative(-6.0f)
                lineTo(4.25f, 8.75f)
                horizontalLineToRelative(18.5f)
                verticalLineToRelative(12.5f)
                lineTo(12.525f, 21.25f)
                lineToRelative(-0.149f, 0.168f)
                lineToRelative(-2.126f, 2.392f)
                close()
                moveTo(13.5f, 15.25f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 4.25f, 4.25f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.25f, -3.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.25f, 3.25f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 4.25f, -4.25f)
                moveToRelative(7.25f, 4.25f)
                arcToRelative(7.24f, 7.24f, 0.0f, false, false, -7.25f, -7.25f)
                arcToRelative(7.24f, 7.24f, 0.0f, false, false, -7.25f, 7.25f)
                horizontalLineToRelative(1.0f)
                arcToRelative(6.24f, 6.24f, 0.0f, false, true, 6.25f, -6.25f)
                arcToRelative(6.24f, 6.24f, 0.0f, false, true, 6.25f, 6.25f)
                close()
            }
        }
        .build()
        return _twoSpeechBubblesRainbowMedium!!
    }

private var _twoSpeechBubblesRainbowMedium: ImageVector? = null
