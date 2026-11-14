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

public val SBBIcons.MicrophoneMedium: ImageVector
    get() {
        if (_microphoneMedium != null) {
            return _microphoneMedium!!
        }
        _microphoneMedium = Builder(name = "MicrophoneMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.25f, 4.249f)
                curveToRelative(2.199f, 0.0f, 4.0f, 1.803f, 4.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.199f, -1.801f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.801f, -4.0f, -4.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -2.197f, 1.801f, -4.0f, 4.0f, -4.0f)
                moveToRelative(0.0f, 21.0f)
                curveToRelative(2.751f, 0.0f, 5.0f, -2.249f, 5.0f, -5.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -2.75f, -2.249f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.25f, -5.0f, 5.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.751f, 2.249f, 5.0f, 5.0f, 5.0f)
                moveToRelative(-3.75f, 6.5f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-3.512f)
                curveToRelative(-4.122f, -0.204f, -7.5f, -2.925f, -7.5f, -7.238f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 3.8f, 3.062f, 6.25f, 7.0f, 6.25f)
                curveToRelative(3.94f, 0.0f, 7.0f, -2.45f, 7.0f, -6.25f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 4.313f, -3.377f, 7.034f, -7.5f, 7.238f)
                verticalLineToRelative(3.512f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }
        .build()
        return _microphoneMedium!!
    }

private var _microphoneMedium: ImageVector? = null
