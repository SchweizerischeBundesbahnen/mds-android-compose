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

public val SBBIcons.CopyMedium: ImageVector
    get() {
        if (_copyMedium != null) {
            return _copyMedium!!
        }
        _copyMedium = Builder(
            name = "CopyMedium",
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
                moveTo(14.228f, 6.19f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(4.56f)
                horizontalLineTo(7.75f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-4.56f)
                horizontalLineToRelative(5.977f)
                verticalLineToRelative(-19.0f)
                horizontalLineToRelative(-14.0f)
                moveToRelative(8.022f, 18.0f)
                horizontalLineToRelative(4.977f)
                verticalLineToRelative(-17.0f)
                horizontalLineToRelative(-12.5f)
                verticalLineToRelative(3.56f)
                horizontalLineToRelative(7.523f)
                verticalLineToRelative(13.44f)
                moveToRelative(-13.5f, 4.56f)
                verticalLineToRelative(-17.0f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(17.0f)
                close()
            }
        }
            .build()
        return _copyMedium!!
    }

private var _copyMedium: ImageVector? = null
