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

public val SBBIcons.CouchLampLarge: ImageVector
    get() {
        if (_couchLampLarge != null) {
            return _couchLampLarge!!
        }
        _couchLampLarge = Builder(
            name = "CouchLampLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveTo(31.0f, 26.05f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 32.497f, 30.0f)
                lineTo(33.0f, 30.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.999f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-23.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 37.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(0.503f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 26.05f)
                lineTo(6.0f, 22.0f)
                horizontalLineToRelative(25.0f)
                close()
                moveTo(43.14f, 19.0f)
                horizontalLineToRelative(-4.139f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(38.001f, 19.0f)
                horizontalLineToRelative(-4.142f)
                lineToRelative(2.25f, -9.0f)
                horizontalLineToRelative(4.782f)
                close()
                moveTo(19.0f, 36.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-5.0f)
                lineTo(19.0f, 31.0f)
                close()
                moveTo(5.0f, 36.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-5.0f)
                lineTo(5.0f, 31.0f)
                close()
                moveTo(6.5f, 27.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 27.0f)
                moveToRelative(0.5f, -0.95f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.497f, 30.0f)
                horizontalLineToRelative(20.006f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 30.0f, 26.05f)
                lineTo(30.0f, 23.0f)
                lineTo(7.0f, 23.0f)
                close()
                moveTo(30.5f, 27.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 30.5f, 27.0f)
                moveToRelative(4.64f, -9.0f)
                horizontalLineToRelative(6.72f)
                lineToRelative(-1.75f, -7.0f)
                horizontalLineToRelative(-3.22f)
                close()
            }
        }
            .build()
        return _couchLampLarge!!
    }

private var _couchLampLarge: ImageVector? = null
