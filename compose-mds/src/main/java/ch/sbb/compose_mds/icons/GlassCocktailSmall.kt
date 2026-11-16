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

public val SBBIcons.GlassCocktailSmall: ImageVector
    get() {
        if (_glassCocktailSmall != null) {
            return _glassCocktailSmall!!
        }
        _glassCocktailSmall = Builder(name = "GlassCocktailSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.359f, 2.517f)
                lineTo(15.013f, 4.76f)
                horizontalLineToRelative(3.851f)
                lineToRelative(-0.518f, 0.777f)
                lineToRelative(-5.916f, 8.874f)
                verticalLineToRelative(6.349f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-6.349f)
                lineTo(5.514f, 5.537f)
                lineToRelative(-0.519f, -0.777f)
                horizontalLineToRelative(8.852f)
                lineToRelative(1.654f, -2.757f)
                close()
                moveTo(12.647f, 6.76f)
                lineToRelative(0.6f, -1.0f)
                lineTo(6.864f, 5.76f)
                lineToRelative(0.667f, 1.0f)
                close()
                moveTo(13.813f, 6.76f)
                horizontalLineToRelative(2.516f)
                lineToRelative(0.666f, -1.0f)
                horizontalLineToRelative(-2.582f)
                close()
                moveTo(15.662f, 7.76f)
                lineTo(8.198f, 7.76f)
                lineToRelative(3.732f, 5.599f)
                close()
            }
        }
        .build()
        return _glassCocktailSmall!!
    }

private var _glassCocktailSmall: ImageVector? = null
