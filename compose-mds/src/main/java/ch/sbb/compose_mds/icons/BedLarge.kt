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

public val SBBIcons.BedLarge: ImageVector
    get() {
        if (_bedLarge != null) {
            return _bedLarge!!
        }
        _bedLarge = Builder(
            name = "BedLarge",
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
                pathFillType = NonZero,
            ) {
                moveTo(5.0f, 34.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(20.5f)
                curveToRelative(1.193f, 0.0f, 2.338f, 0.474f, 3.182f, 1.318f)
                lineToRelative(0.153f, 0.162f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 43.0f, 30.5f)
                lineTo(43.0f, 44.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                lineTo(5.0f, 35.0f)
                verticalLineToRelative(9.0f)
                lineTo(4.0f, 44.0f)
                lineTo(4.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(19.0f, 34.0f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.87f, -0.324f, -1.707f, -0.905f, -2.349f)
                lineToRelative(-0.12f, -0.126f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 38.5f, 27.0f)
                lineTo(19.0f, 27.0f)
                close()
                moveTo(11.5f, 24.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveTo(39.0f, 31.0f)
                lineTo(21.0f, 31.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(11.5f, 25.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
            .build()
        return _bedLarge!!
    }

private var _bedLarge: ImageVector? = null
