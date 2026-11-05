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

public val SBBIcons.PreviousSmall: ImageVector
    get() {
        if (_previousSmall != null) {
            return _previousSmall!!
        }
        _previousSmall = Builder(
            name = "PreviousSmall",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(20.001f, 5.5f)
                verticalLineToRelative(-0.921f)
                lineToRelative(-0.773f, 0.502f)
                lineToRelative(-5.0f, 3.25f)
                lineToRelative(-5.0f, 3.25f)
                lineToRelative(-0.644f, 0.419f)
                lineToRelative(0.644f, 0.42f)
                lineToRelative(5.0f, 3.25f)
                lineToRelative(5.0f, 3.25f)
                lineToRelative(0.773f, 0.501f)
                verticalLineTo(5.5f)
                moveToRelative(-5.228f, 3.67f)
                lineToRelative(4.228f, -2.749f)
                verticalLineTo(17.58f)
                lineToRelative(-4.228f, -2.748f)
                lineTo(10.419f, 12.0f)
                close()
                moveTo(4.5f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.5f)
                moveTo(5.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
            .build()
        return _previousSmall!!
    }

private var _previousSmall: ImageVector? = null
