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

public val SBBIcons.SuitcaseMedium: ImageVector
    get() {
        if (_suitcaseMedium != null) {
            return _suitcaseMedium!!
        }
        _suitcaseMedium = Builder(
            name = "SuitcaseMedium",
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
                moveTo(14.25f, 6.263f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineTo(31.25f)
                horizontalLineToRelative(26.5f)
                verticalLineTo(10.763f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-8.0f)
                moveToRelative(7.0f, 4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(5.75f, 30.25f)
                verticalLineTo(11.763f)
                horizontalLineToRelative(24.5f)
                verticalLineTo(30.25f)
                close()
            }
        }
            .build()
        return _suitcaseMedium!!
    }

private var _suitcaseMedium: ImageVector? = null
