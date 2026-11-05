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

public val SBBIcons.TramMedium: ImageVector
    get() {
        if (_tramMedium != null) {
            return _tramMedium!!
        }
        _tramMedium = Builder(name = "TramMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.75f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.5f)
                lineTo(12.0f, 7.75f)
                arcTo(4.25f, 4.25f, 0.0f, false, false, 7.75f, 12.0f)
                verticalLineToRelative(16.25f)
                horizontalLineToRelative(3.316f)
                lineToRelative(-2.482f, 3.722f)
                lineToRelative(0.832f, 0.555f)
                lineToRelative(2.852f, -4.278f)
                horizontalLineToRelative(11.464f)
                lineToRelative(2.852f, 4.278f)
                lineToRelative(0.832f, -0.555f)
                lineToRelative(-2.482f, -3.723f)
                horizontalLineToRelative(3.316f)
                lineTo(28.25f, 12.0f)
                arcTo(4.25f, 4.25f, 0.0f, false, false, 24.0f, 7.75f)
                horizontalLineToRelative(-3.25f)
                lineTo(20.75f, 6.25f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(4.0f, 1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(21.0f, 10.75f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(27.25f, 19.75f)
                lineTo(27.25f, 12.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 24.0f, 8.75f)
                lineTo(12.0f, 8.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 8.75f, 12.0f)
                verticalLineToRelative(7.75f)
                close()
                moveTo(8.75f, 20.75f)
                horizontalLineToRelative(18.5f)
                verticalLineToRelative(6.5f)
                lineTo(8.75f, 27.25f)
                close()
                moveTo(21.25f, 24.0f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(1.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-9.0f, -1.0f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                moveTo(13.25f, 24.0f)
                curveToRelative(0.0f, -0.138f, 0.113f, -0.25f, 0.25f, -0.25f)
                reflectiveCurveToRelative(0.25f, 0.112f, 0.25f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
            }
        }
        .build()
        return _tramMedium!!
    }

private var _tramMedium: ImageVector? = null
