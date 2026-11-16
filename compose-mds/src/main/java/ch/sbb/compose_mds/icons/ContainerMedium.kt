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

public val SBBIcons.ContainerMedium: ImageVector
    get() {
        if (_containerMedium != null) {
            return _containerMedium!!
        }
        _containerMedium = Builder(name = "ContainerMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.21f, 11.504f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 10.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 0.527f, 0.117f, 1.027f, 0.326f, 1.476f)
                lineTo(7.375f, 16.75f)
                lineTo(4.75f, 16.75f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(-2.625f)
                lineToRelative(-7.812f, -4.167f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.562f, -5.35f)
                lineToRelative(0.008f, -2.732f)
                lineToRelative(-1.0f, -0.002f)
                lineToRelative(-0.009f, 3.094f)
                lineToRelative(-0.001f, 0.388f)
                lineToRelative(0.376f, 0.098f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 1.292f, 4.026f)
                lineToRelative(-2.432f, -1.296f)
                lineToRelative(-0.235f, -0.125f)
                lineToRelative(-0.235f, 0.125f)
                close()
                moveTo(16.876f, 12.816f)
                lineTo(9.5f, 16.75f)
                lineTo(28.0f, 16.75f)
                lineToRelative(-6.428f, -3.429f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 19.5f, 14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -2.624f, -1.184f)
                moveToRelative(3.667f, -0.043f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.5f, 13.0f)
                curveToRelative(-0.66f, 0.0f, -1.26f, -0.256f, -1.706f, -0.674f)
                lineToRelative(0.956f, -0.51f)
                close()
                moveTo(9.25f, 30.25f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-12.5f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(10.25f, 30.25f)
                verticalLineToRelative(-12.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(18.25f, 17.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(19.25f, 17.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(27.25f, 17.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(28.25f, 17.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _containerMedium!!
    }

private var _containerMedium: ImageVector? = null
