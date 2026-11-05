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
        _containerSmall = Builder(
            name = "ContainerSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(13.006f, 2.999f)
                lineTo(13.0f, 5.062f)
                lineToRelative(-0.001f, 0.388f)
                lineToRelative(0.376f, 0.097f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.856f, 2.31f)
                lineToRelative(-1.496f, -0.798f)
                lineToRelative(-0.235f, -0.126f)
                lineToRelative(-0.235f, 0.126f)
                lineToRelative(-0.702f, 0.374f)
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
                close()
                moveTo(13.268f, 8.476f)
                lineTo(12.5f, 8.066f)
                lineTo(12.165f, 8.246f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.103f, 0.23f)
                moveToRelative(-2.052f, 0.275f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.0f, 9.5f)
                curveToRelative(0.516f, 0.0f, 0.995f, -0.156f, 1.393f, -0.424f)
                lineTo(18.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                close()
                moveTo(4.0f, 20.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(7.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                lineTo(7.0f, 12.0f)
                close()
                moveTo(12.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
            .build()
        return _containerSmall!!
    }

private var _containerSmall: ImageVector? = null
