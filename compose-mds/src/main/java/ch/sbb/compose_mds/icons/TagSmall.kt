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

public val SBBIcons.TagSmall: ImageVector
    get() {
        if (_tagSmall != null) {
            return _tagSmall!!
        }
        _tagSmall = Builder(
            name = "TagSmall",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(5.5f, 6.0f)
                horizontalLineToRelative(-0.501f)
                verticalLineToRelative(0.5f)
                lineToRelative(0.007f, 4.3f)
                verticalLineToRelative(0.207f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(9.494f, 9.499f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(0.353f, -0.353f)
                lineToRelative(4.3f, -4.3f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-9.512f, -9.5f)
                lineTo(9.995f, 6.0f)
                horizontalLineTo(5.5f)
                moveToRelative(0.505f, 4.593f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(3.58f)
                lineToRelative(9.012f, 9.0f)
                lineTo(15.0f, 19.592f)
                close()
                moveTo(8.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
            .build()
        return _tagSmall!!
    }

private var _tagSmall: ImageVector? = null
