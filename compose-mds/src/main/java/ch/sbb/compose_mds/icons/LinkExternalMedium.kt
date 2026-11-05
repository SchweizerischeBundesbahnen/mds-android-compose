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

public val SBBIcons.LinkExternalMedium: ImageVector
    get() {
        if (_linkExternalMedium != null) {
            return _linkExternalMedium!!
        }
        _linkExternalMedium = Builder(
            name = "LinkExternalMedium",
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
                moveTo(24.0f, 7.249f)
                horizontalLineToRelative(4.043f)
                lineToRelative(-5.897f, 5.896f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(5.896f, -5.896f)
                verticalLineToRelative(4.043f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-5.75f)
                horizontalLineTo(24.0f)
                close()
                moveTo(6.75f, 10.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(19.0f)
                verticalLineTo(16.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(12.25f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(-17.0f)
                horizontalLineTo(19.5f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _linkExternalMedium!!
    }

private var _linkExternalMedium: ImageVector? = null
