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
                moveTo(12.0f, 3.0f)
                curveToRelative(-0.857f, 0.0f, -1.39f, 0.302f, -1.693f, 0.695f)
                curveToRelative(-0.08f, 0.104f, -0.14f, 0.209f, -0.183f, 0.305f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(16.0f, 4.0f)
                horizontalLineToRelative(-2.124f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.183f, -0.305f)
                curveTo(13.39f, 3.302f, 12.857f, 3.0f, 12.0f, 3.0f)
                moveToRelative(4.0f, 3.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 6.0f)
                close()
                moveTo(10.98f, 5.0f)
                lineTo(11.0f, 4.531f)
                lineTo(11.0f, 4.53f)
                lineToRelative(0.01f, -0.048f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.09f, -0.176f)
                curveToRelative(0.082f, -0.107f, 0.299f, -0.305f, 0.9f, -0.305f)
                reflectiveCurveToRelative(0.818f, 0.198f, 0.9f, 0.305f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.1f, 0.224f)
                verticalLineToRelative(0.002f)
                lineToRelative(0.02f, 0.469f)
                lineTo(15.0f, 5.001f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 6.001f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(1.98f)
                moveTo(7.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 9.0f)
                close()
                moveTo(17.0f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(12.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _formSmall!!
    }

private var _formSmall: ImageVector? = null
