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

public val SBBIcons.CirclePentagonSmall: ImageVector
    get() {
        if (_circlePentagonSmall != null) {
            return _circlePentagonSmall!!
        }
        _circlePentagonSmall = Builder(
            name = "CirclePentagonSmall",
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
                pathFillType = NonZero,
            ) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f)
                moveToRelative(0.291f, 4.093f)
                lineToRelative(3.5f, 2.5f)
                lineToRelative(0.209f, 0.15f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.743f)
                lineToRelative(0.209f, -0.15f)
                lineToRelative(3.5f, -2.5f)
                lineToRelative(0.291f, -0.207f)
                close()
                moveTo(9.0f, 10.258f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.742f)
                lineToRelative(-3.0f, -2.144f)
                close()
            }
        }
            .build()
        return _circlePentagonSmall!!
    }

private var _circlePentagonSmall: ImageVector? = null
