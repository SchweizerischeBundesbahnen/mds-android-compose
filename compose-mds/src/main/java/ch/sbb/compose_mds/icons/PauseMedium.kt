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

public val SBBIcons.PauseMedium: ImageVector
    get() {
        if (_pauseMedium != null) {
            return _pauseMedium!!
        }
        _pauseMedium = Builder(
            name = "PauseMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(16.25f, 28.25f)
                horizontalLineToRelative(-5.5f)
                lineTo(10.75f, 7.75f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(25.252f, 28.25f)
                horizontalLineToRelative(-5.5f)
                lineTo(19.752f, 7.75f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(11.75f, 27.25f)
                horizontalLineToRelative(3.5f)
                lineTo(15.25f, 8.75f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(20.752f, 27.25f)
                horizontalLineToRelative(3.5f)
                lineTo(24.252f, 8.75f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
            .build()
        return _pauseMedium!!
    }

private var _pauseMedium: ImageVector? = null
