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

public val SBBIcons.SbbSignetMedium: ImageVector
    get() {
        if (_sbbSignetMedium != null) {
            return _sbbSignetMedium!!
        }
        _sbbSignetMedium = Builder(
            name = "SbbSignetMedium",
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
                pathFillType = EvenOdd,
            ) {
                moveToRelative(19.896f, 13.5f)
                lineToRelative(3.528f, 3.477f)
                horizontalLineToRelative(-4.386f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(-2.074f)
                verticalLineToRelative(3.477f)
                horizontalLineTo(12.6f)
                lineTo(16.13f, 13.5f)
                horizontalLineToRelative(-2.623f)
                lineTo(9.0f, 18.0f)
                lineToRelative(4.506f, 4.5f)
                horizontalLineToRelative(2.623f)
                lineToRelative(-3.528f, -3.453f)
                horizontalLineToRelative(4.363f)
                verticalLineTo(22.5f)
                horizontalLineToRelative(2.074f)
                verticalLineToRelative(-3.453f)
                horizontalLineToRelative(4.386f)
                lineTo(19.896f, 22.5f)
                horizontalLineToRelative(2.622f)
                lineTo(27.0f, 18.0f)
                lineToRelative(-4.482f, -4.5f)
                close()
            }
        }
            .build()
        return _sbbSignetMedium!!
    }

private var _sbbSignetMedium: ImageVector? = null
