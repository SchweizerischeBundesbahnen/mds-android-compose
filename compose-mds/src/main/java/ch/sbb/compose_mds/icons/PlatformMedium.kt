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

public val SBBIcons.PlatformMedium: ImageVector
    get() {
        if (_platformMedium != null) {
            return _platformMedium!!
        }
        _platformMedium = Builder(name = "PlatformMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(33.0f, 4.25f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(23.0f)
                lineTo(33.0f, 27.25f)
                verticalLineToRelative(1.0f)
                lineTo(16.25f, 28.25f)
                lineTo(16.25f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.75f)
                lineTo(13.5f, 28.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.75f)
                verticalLineToRelative(-23.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                lineTo(13.5f, 4.25f)
                verticalLineToRelative(-1.0f)
                lineTo(33.0f, 3.25f)
                close()
                moveTo(17.75f, 4.25f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(7.25f, 24.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(0.25f, -1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                moveToRelative(-4.5f, -3.0f)
                horizontalLineToRelative(7.75f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.898f, -0.333f, -1.492f, -0.86f, -1.879f)
                curveToRelative(-0.551f, -0.403f, -1.37f, -0.621f, -2.39f, -0.621f)
                lineTo(3.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.076f)
                lineToRelative(0.584f, -3.5f)
                lineTo(3.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1.0f)
                lineTo(5.674f, 7.25f)
                lineToRelative(-0.584f, 3.5f)
                lineTo(7.5f, 10.75f)
                curveToRelative(1.14f, 0.0f, 2.196f, 0.24f, 2.98f, 0.815f)
                curveToRelative(0.808f, 0.592f, 1.27f, 1.498f, 1.27f, 2.685f)
                verticalLineToRelative(14.0f)
                lineTo(9.008f, 28.25f)
                lineToRelative(0.857f, 2.0f)
                lineTo(12.0f, 30.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.706f)
                lineToRelative(0.666f, 1.553f)
                lineToRelative(-0.92f, 0.394f)
                lineToRelative(-0.834f, -1.947f)
                lineTo(3.0f, 31.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.777f)
                lineToRelative(-0.857f, -2.0f)
                lineTo(3.0f, 28.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.75f)
                verticalLineToRelative(-6.5f)
                lineTo(3.0f, 20.75f)
                close()
                moveTo(16.25f, 10.75f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(3.5f)
                close()
            }
        }
        .build()
        return _platformMedium!!
    }

private var _platformMedium: ImageVector? = null
