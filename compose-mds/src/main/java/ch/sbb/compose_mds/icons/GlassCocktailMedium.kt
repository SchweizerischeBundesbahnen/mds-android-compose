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

public val SBBIcons.GlassCocktailMedium: ImageVector
    get() {
        if (_glassCocktailMedium != null) {
            return _glassCocktailMedium!!
        }
        _glassCocktailMedium = Builder(name = "GlassCocktailMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(19.112f, 10.39f)
                lineToRelative(1.2f, -2.0f)
                lineTo(9.829f, 8.39f)
                lineToRelative(1.333f, 2.0f)
                close()
                moveTo(20.278f, 10.39f)
                horizontalLineToRelative(4.35f)
                lineToRelative(1.333f, -2.0f)
                horizontalLineToRelative(-4.483f)
                close()
                moveTo(23.961f, 11.39f)
                lineTo(11.829f, 11.39f)
                lineToRelative(6.066f, 9.099f)
                close()
                moveTo(8.895f, 7.39f)
                horizontalLineToRelative(12.017f)
                lineToRelative(2.554f, -4.257f)
                lineToRelative(0.858f, 0.514f)
                lineToRelative(-2.246f, 3.743f)
                horizontalLineToRelative(5.751f)
                lineToRelative(-0.518f, 0.777f)
                lineToRelative(-8.916f, 13.374f)
                verticalLineToRelative(9.849f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-13.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(-9.849f)
                lineTo(8.479f, 8.167f)
                lineTo(7.96f, 7.39f)
                close()
            }
        }
        .build()
        return _glassCocktailMedium!!
    }

private var _glassCocktailMedium: ImageVector? = null
