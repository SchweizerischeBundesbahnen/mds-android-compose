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

public val SBBIcons.FigmaLarge: ImageVector
    get() {
        if (_figmaLarge != null) {
            return _figmaLarge!!
        }
        _figmaLarge = Builder(name = "FigmaLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.5f, 5.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 1.942f, 12.704f)
                arcTo(6.5f, 6.5f, 0.0f, true, true, 25.0f, 26.962f)
                lineTo(25.0f, 36.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -9.709f, -6.454f)
                curveToRelative(-0.818f, -0.32f, -1.57f, -0.801f, -2.206f, -1.426f)
                arcToRelative(6.44f, 6.44f, 0.0f, false, true, -1.928f, -4.55f)
                arcToRelative(6.43f, 6.43f, 0.0f, false, true, 1.876f, -4.572f)
                lineToRelative(0.233f, -0.223f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 1.903f, -1.208f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 17.5f, 5.0f)
                close()
                moveTo(18.0f, 30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.146f, 0.89f)
                lineToRelative(-0.187f, 0.12f)
                arcToRelative(6.005f, 6.005f, 0.0f, false, false, -2.552f, 6.16f)
                arcToRelative(6.002f, 6.002f, 0.0f, false, false, 10.874f, 2.163f)
                lineToRelative(0.12f, -0.186f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 24.0f, 36.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(17.354f, 18.076f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, false, -3.61f, 1.627f)
                arcToRelative(5.43f, 5.43f, 0.0f, false, false, -1.587f, 3.86f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, false, 1.63f, 3.844f)
                arcTo(5.58f, 5.58f, 0.0f, false, false, 17.688f, 29.0f)
                lineTo(24.0f, 29.0f)
                lineTo(24.0f, 18.066f)
                horizontalLineToRelative(-6.373f)
                close()
                moveTo(30.5f, 18.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                moveTo(25.0f, 18.0f)
                verticalLineToRelative(2.037f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 27.037f, 18.0f)
                close()
                moveTo(25.0f, 17.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                lineTo(25.0f, 6.0f)
                close()
                moveTo(17.5f, 6.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                lineTo(24.0f, 17.0f)
                lineTo(24.0f, 6.0f)
                close()
            }
        }
        .build()
        return _figmaLarge!!
    }

private var _figmaLarge: ImageVector? = null
