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

public val SBBIcons.FormSmall: ImageVector
    get() {
        if (_formSmall != null) {
            return _formSmall!!
        }
        _formSmall = Builder(name = "FormSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.692f, 3.694f)
                curveTo(13.39f, 3.302f, 12.857f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(-1.39f, 0.302f, -1.692f, 0.694f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.182f, 0.306f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(-2.126f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.182f, -0.306f)
                moveTo(16.0f, 6.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 6.0f)
                close()
                moveTo(11.1f, 4.306f)
                curveToRelative(0.082f, -0.108f, 0.299f, -0.306f, 0.9f, -0.306f)
                reflectiveCurveToRelative(0.818f, 0.198f, 0.9f, 0.306f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.1f, 0.217f)
                lineToRelative(0.02f, 0.477f)
                lineTo(15.0f, 5.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(1.98f)
                lineToRelative(0.02f, -0.477f)
                lineToRelative(0.01f, -0.043f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.09f, -0.174f)
                moveTo(17.0f, 10.0f)
                lineTo(17.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.0f, 18.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _formSmall!!
    }

private var _formSmall: ImageVector? = null
