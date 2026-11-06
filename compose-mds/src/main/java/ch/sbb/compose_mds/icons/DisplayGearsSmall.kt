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

public val SBBIcons.DisplayGearsSmall: ImageVector
    get() {
        if (_displayGearsSmall != null) {
            return _displayGearsSmall!!
        }
        _displayGearsSmall = Builder(name = "DisplayGearsSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(2.5f)
                moveToRelative(12.0f, 11.0f)
                horizontalLineToRelative(2.243f)
                curveToRelative(0.165f, -0.47f, 0.257f, -0.973f, 0.257f, -1.5f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, false, -1.827f, -3.63f)
                lineToRelative(-1.015f, 1.759f)
                curveToRelative(0.516f, 0.458f, 0.842f, 1.126f, 0.842f, 1.871f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.5f, 1.5f)
                moveToRelative(3.292f, 0.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(4.208f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.185f, -1.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.022f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.48f, -1.809f)
                lineToRelative(-1.747f, -1.008f)
                lineToRelative(0.5f, -0.866f)
                lineTo(8.0f, 11.325f)
                curveToRelative(0.362f, -0.514f, 0.81f, -0.963f, 1.325f, -1.325f)
                lineTo(8.317f, 8.255f)
                lineToRelative(0.866f, -0.5f)
                lineTo(10.191f, 9.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 12.0f, 9.022f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.022f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 1.809f, 0.48f)
                lineToRelative(1.008f, -1.747f)
                lineToRelative(0.866f, 0.5f)
                lineTo(15.675f, 10.0f)
                curveToRelative(0.514f, 0.362f, 0.963f, 0.81f, 1.325f, 1.325f)
                lineToRelative(1.745f, -1.008f)
                lineToRelative(0.5f, 0.866f)
                lineToRelative(-1.746f, 1.008f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 17.978f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.023f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.185f, 1.0f)
                moveToRelative(-9.535f, 0.0f)
                horizontalLineTo(10.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.45f, -1.0f)
                horizontalLineTo(8.028f)
                curveToRelative(0.038f, 0.347f, 0.117f, 0.681f, 0.229f, 1.0f)
                moveToRelative(4.243f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                moveToRelative(0.0f, -4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.45f, 2.0f)
                horizontalLineTo(8.027f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, 4.473f, -4.0f)
                curveToRelative(0.644f, 0.0f, 1.254f, 0.133f, 1.806f, 0.372f)
                lineToRelative(-1.014f, 1.756f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 12.0f)
            }
        }
        .build()
        return _displayGearsSmall!!
    }

private var _displayGearsSmall: ImageVector? = null
