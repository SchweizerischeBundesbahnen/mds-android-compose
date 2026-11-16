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

public val SBBIcons.ContainerSmall: ImageVector
    get() {
        if (_containerSmall != null) {
            return _containerSmall!!
        }
        _containerSmall = Builder(name = "ContainerSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.563f, 7.433f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 7.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 0.32f, 0.06f, 0.627f, 0.17f, 0.909f)
                lineTo(4.876f, 11.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(19.0f)
                lineTo(22.0f, 11.0f)
                horizontalLineToRelative(-1.875f)
                lineToRelative(-5.007f, -2.67f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 4.71f)
                lineTo(14.006f, 3.0f)
                lineToRelative(-1.0f, -0.002f)
                lineTo(13.0f, 5.062f)
                lineToRelative(-0.001f, 0.388f)
                lineToRelative(0.376f, 0.097f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, true, 0.857f, 2.31f)
                lineToRelative(-1.497f, -0.798f)
                lineToRelative(-0.235f, -0.125f)
                lineToRelative(-0.235f, 0.125f)
                close()
                moveTo(11.216f, 8.751f)
                lineTo(7.0f, 11.0f)
                horizontalLineToRelative(11.0f)
                lineToRelative(-3.607f, -1.924f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.0f, 9.5f)
                curveToRelative(-0.698f, 0.0f, -1.33f, -0.287f, -1.784f, -0.749f)
                moveToRelative(2.052f, -0.275f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.104f, -0.23f)
                lineToRelative(0.336f, -0.18f)
                close()
                moveTo(6.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 20.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(12.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _containerSmall!!
    }

private var _containerSmall: ImageVector? = null
