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

public val SBBIcons.SignNoEntrySmall: ImageVector
    get() {
        if (_signNoEntrySmall != null) {
            return _signNoEntrySmall!!
        }
        _signNoEntrySmall = Builder(
            name = "SignNoEntrySmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                moveTo(22.0f, 7.857f)
                verticalLineToRelative(8.285f)
                lineTo(16.143f, 22.0f)
                horizontalLineTo(7.857f)
                lineTo(2.0f, 16.142f)
                verticalLineTo(7.857f)
                lineTo(7.857f, 2.0f)
                horizontalLineToRelative(8.286f)
                close()
                moveTo(3.0f, 8.272f)
                verticalLineToRelative(7.455f)
                lineTo(8.272f, 21.0f)
                horizontalLineToRelative(7.455f)
                lineTo(21.0f, 15.727f)
                verticalLineTo(8.272f)
                lineTo(15.727f, 3.0f)
                horizontalLineTo(8.272f)
                close()
                moveTo(18.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(7.0f, 13.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
            .build()
        return _signNoEntrySmall!!
    }

private var _signNoEntrySmall: ImageVector? = null
