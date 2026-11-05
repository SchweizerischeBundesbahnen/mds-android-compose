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

public val SBBIcons.GlassCocktailLarge: ImageVector
    get() {
        if (_glassCocktailLarge != null) {
            return _glassCocktailLarge!!
        }
        _glassCocktailLarge = Builder(
            name = "GlassCocktailLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(12.5f, 2.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                curveToRelative(0.96f, 0.0f, 1.865f, -0.215f, 2.68f, -0.588f)
                lineTo(23.0f, 28.628f)
                lineTo(23.0f, 44.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(24.0f, 28.628f)
                lineTo(34.938f, 8.741f)
                lineTo(35.346f, 8.0f)
                lineTo(28.82f, 8.0f)
                lineToRelative(2.618f, -4.759f)
                lineToRelative(-0.876f, -0.482f)
                lineTo(27.679f, 8.0f)
                horizontalLineToRelative(-8.698f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 12.5f, 2.0f)
                moveToRelative(5.478f, 6.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -5.478f, 6.0f)
                curveToRelative(0.782f, 0.0f, 1.523f, -0.17f, 2.197f, -0.467f)
                lineToRelative(-0.487f, -0.887f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 12.5f, 13.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 4.473f, -5.0f)
                close()
                moveTo(15.965f, 8.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.825f, -2.593f)
                lineTo(13.21f, 8.0f)
                close()
                moveTo(13.198f, 5.07f)
                arcTo(3.494f, 3.494f, 0.0f, false, false, 9.74f, 6.347f)
                lineToRelative(2.49f, 1.423f)
                close()
                moveTo(9.243f, 7.215f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 9.0f, 8.5f)
                curveToRelative(0.0f, 0.902f, 0.34f, 1.723f, 0.9f, 2.344f)
                lineToRelative(1.835f, -2.206f)
                close()
                moveTo(10.669f, 11.484f)
                curveToRelative(0.533f, 0.327f, 1.16f, 0.516f, 1.831f, 0.516f)
                curveToRelative(0.43f, 0.0f, 0.84f, -0.085f, 1.225f, -0.236f)
                lineToRelative(-1.31f, -2.38f)
                close()
                moveTo(27.171f, 11.0f)
                horizontalLineToRelative(5.383f)
                lineToRelative(1.1f, -2.0f)
                horizontalLineToRelative(-5.383f)
                close()
                moveTo(27.129f, 9.0f)
                lineTo(26.029f, 11.0f)
                lineTo(14.446f, 11.0f)
                lineToRelative(-1.1f, -2.0f)
                close()
                moveTo(23.5f, 27.463f)
                lineTo(14.996f, 12.0f)
                horizontalLineToRelative(17.008f)
                close()
                moveTo(20.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-1.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveToRelative(7.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                moveToRelative(0.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-3.0f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-1.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
            }
        }
            .build()
        return _glassCocktailLarge!!
    }

private var _glassCocktailLarge: ImageVector? = null
