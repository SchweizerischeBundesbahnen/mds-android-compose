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

public val SBBIcons.PlatformSmall: ImageVector
    get() {
        if (_platformSmall != null) {
            return _platformSmall!!
        }
        _platformSmall = Builder(name = "PlatformSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(12.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(5.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(2.0f, -5.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(0.428f, 1.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.027f)
                lineToRelative(0.513f, 1.197f)
                lineToRelative(0.92f, -0.394f)
                lineTo(7.116f, 21.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(6.687f)
                lineToRelative(-0.428f, -1.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.5f)
                curveToRelative(0.0f, -0.84f, -0.329f, -1.496f, -0.914f, -1.925f)
                curveTo(6.524f, 7.163f, 5.78f, 7.0f, 5.0f, 7.0f)
                horizontalLineTo(3.59f)
                lineToRelative(0.334f, -2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.91f)
                lineToRelative(-0.334f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.66f, 0.0f, 1.166f, 0.141f, 1.494f, 0.382f)
                curveTo(6.8f, 8.605f, 7.0f, 8.949f, 7.0f, 9.5f)
                moveTo(17.0f, 7.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _platformSmall!!
    }

private var _platformSmall: ImageVector? = null
