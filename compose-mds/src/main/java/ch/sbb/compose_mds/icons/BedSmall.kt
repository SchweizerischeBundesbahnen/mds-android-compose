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

public val SBBIcons.BedSmall: ImageVector
    get() {
        if (_bedSmall != null) {
            return _bedSmall!!
        }
        _bedSmall = Builder(
            name = "BedSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                lineTo(22.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(10.0f, 17.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                lineTo(10.0f, 14.0f)
                close()
                moveTo(6.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
            .build()
        return _bedSmall!!
    }

private var _bedSmall: ImageVector? = null
