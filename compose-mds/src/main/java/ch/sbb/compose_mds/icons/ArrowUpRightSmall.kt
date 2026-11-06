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

public val SBBIcons.ArrowUpRightSmall: ImageVector
    get() {
        if (_arrowUpRightSmall != null) {
            return _arrowUpRightSmall!!
        }
        _arrowUpRightSmall = Builder(name = "ArrowUpRightSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 17.494f)
                curveToRelative(0.0f, -2.142f, 0.492f, -4.007f, 1.638f, -5.33f)
                curveToRelative(1.134f, -1.31f, 2.978f, -2.17f, 5.862f, -2.17f)
                horizontalLineToRelative(3.792f)
                lineToRelative(-2.297f, 2.296f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(3.142f, -3.14f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(-0.352f, -0.354f)
                lineTo(15.702f, 6.0f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(2.28f, 2.287f)
                horizontalLineTo(13.5f)
                curveToRelative(-3.09f, 0.0f, -5.245f, 0.93f, -6.618f, 2.516f)
                curveTo(5.52f, 13.082f, 5.0f, 15.218f, 5.0f, 17.494f)
                close()
            }
        }
        .build()
        return _arrowUpRightSmall!!
    }

private var _arrowUpRightSmall: ImageVector? = null
