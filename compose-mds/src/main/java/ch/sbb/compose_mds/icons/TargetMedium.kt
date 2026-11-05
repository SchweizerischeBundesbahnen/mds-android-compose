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

public val SBBIcons.TargetMedium: ImageVector
    get() {
        if (_targetMedium != null) {
            return _targetMedium!!
        }
        _targetMedium = Builder(
            name = "TargetMedium",
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
                moveTo(24.957f, 11.75f)
                horizontalLineTo(30.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.25f)
                lineToRelative(-0.5f, -0.5f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.043f)
                lineToRelative(-2.0f, 2.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.043f)
                lineToRelative(-0.427f, 0.426f)
                arcTo(8.72f, 8.72f, 0.0f, false, false, 15.0f, 12.25f)
                arcToRelative(8.75f, 8.75f, 0.0f, true, false, 6.53f, 2.926f)
                lineToRelative(0.427f, -0.426f)
                horizontalLineTo(27.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.043f)
                close()
                moveTo(15.0f, 13.25f)
                curveToRelative(1.96f, 0.0f, 3.75f, 0.728f, 5.115f, 1.928f)
                lineToRelative(-2.484f, 2.484f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, false, 0.707f, 0.707f)
                lineToRelative(2.484f, -2.484f)
                arcTo(7.751f, 7.751f, 0.0f, true, true, 15.0f, 13.25f)
                moveToRelative(0.0f, 4.5f)
                curveToRelative(0.717f, 0.0f, 1.38f, 0.232f, 1.918f, 0.625f)
                lineToRelative(-1.461f, 1.461f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.707f, 0.707f)
                lineToRelative(1.46f, -1.46f)
                arcTo(3.25f, 3.25f, 0.0f, true, true, 15.0f, 17.75f)
                moveTo(14.75f, 21.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.073f, -0.177f)
                lineToRelative(0.354f, 0.354f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 14.75f, 21.0f)
            }
        }
            .build()
        return _targetMedium!!
    }

private var _targetMedium: ImageVector? = null
