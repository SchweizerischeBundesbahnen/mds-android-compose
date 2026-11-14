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
                moveTo(22.0f, 17.0f)
                lineTo(22.0f, 5.0f)
                lineTo(2.0f, 5.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(14.5f, 16.0f)
                curveToRelative(0.314f, -0.418f, 0.5f, -0.937f, 0.5f, -1.5f)
                curveToRelative(0.0f, -0.745f, -0.326f, -1.414f, -0.843f, -1.872f)
                lineToRelative(1.015f, -1.758f)
                arcTo(4.48f, 4.48f, 0.0f, false, true, 17.0f, 14.5f)
                curveToRelative(0.0f, 0.527f, -0.092f, 1.03f, -0.257f, 1.5f)
                close()
                moveTo(12.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                moveToRelative(5.291f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.186f, -1.0f)
                lineTo(20.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.022f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.48f, -1.809f)
                lineToRelative(1.747f, -1.008f)
                lineToRelative(-0.5f, -0.866f)
                lineTo(17.0f, 11.325f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 15.675f, 10.0f)
                lineToRelative(1.008f, -1.745f)
                lineToRelative(-0.866f, -0.5f)
                lineTo(14.81f, 9.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 13.0f, 9.022f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.022f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -1.809f, 0.48f)
                lineTo(9.183f, 7.754f)
                lineToRelative(-0.866f, 0.5f)
                lineTo(9.325f, 10.0f)
                curveToRelative(-0.514f, 0.362f, -0.963f, 0.81f, -1.325f, 1.325f)
                lineToRelative(-1.745f, -1.008f)
                lineToRelative(-0.5f, 0.866f)
                lineTo(7.5f, 12.19f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 7.022f, 14.0f)
                lineTo(5.0f, 14.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.023f)
                quadToRelative(0.047f, 0.517f, 0.186f, 1.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(8.257f, 16.0f)
                lineTo(10.5f, 16.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.45f, -1.0f)
                lineTo(8.028f, 15.0f)
                curveToRelative(0.038f, 0.347f, 0.117f, 0.681f, 0.229f, 1.0f)
                moveToRelative(4.243f, -4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.45f, 2.0f)
                lineTo(8.027f, 14.0f)
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
