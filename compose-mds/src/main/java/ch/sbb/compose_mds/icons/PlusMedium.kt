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

public val SBBIcons.PlusMedium: ImageVector
    get() {
        if (_plusMedium != null) {
            return _plusMedium!!
        }
        _plusMedium = Builder(
            name = "PlusMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(18.5f, 17.5f)
                verticalLineTo(6.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(6.75f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(17.5f)
                verticalLineToRelative(10.75f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(18.5f)
                horizontalLineToRelative(10.75f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _plusMedium!!
    }

private var _plusMedium: ImageVector? = null
