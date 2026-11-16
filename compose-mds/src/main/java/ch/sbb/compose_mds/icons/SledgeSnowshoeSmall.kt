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

public val SBBIcons.SledgeSnowshoeSmall: ImageVector
    get() {
        if (_sledgeSnowshoeSmall != null) {
            return _sledgeSnowshoeSmall!!
        }
        _sledgeSnowshoeSmall = Builder(name = "SledgeSnowshoeSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 2.0f)
                curveToRelative(2.89f, 0.0f, 5.494f, 1.314f, 7.857f, 2.558f)
                lineToRelative(0.338f, 0.178f)
                curveToRelative(1.074f, 0.566f, 2.097f, 1.106f, 3.105f, 1.52f)
                curveTo(19.91f, 6.712f, 20.966f, 7.0f, 22.0f, 7.0f)
                verticalLineToRelative(1.001f)
                horizontalLineToRelative(-0.106f)
                curveToRelative(-1.01f, 0.019f, -2.038f, 0.303f, -3.112f, 0.743f)
                curveToRelative(-1.008f, 0.414f, -2.029f, 0.954f, -3.099f, 1.52f)
                lineToRelative(-0.34f, 0.178f)
                curveTo(12.987f, 11.686f, 10.392f, 13.0f, 7.5f, 13.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, -11.0f)
                moveToRelative(10.495f, 5.001f)
                curveToRelative(-0.906f, -0.4f, -1.819f, -0.881f, -2.73f, -1.362f)
                lineToRelative(-0.372f, -0.197f)
                curveToRelative(-0.959f, -0.504f, -1.918f, -0.997f, -2.893f, -1.407f)
                verticalLineToRelative(2.966f)
                close()
                moveTo(12.0f, 8.001f)
                horizontalLineToRelative(5.973f)
                curveToRelative(-0.913f, 0.402f, -1.83f, 0.888f, -2.747f, 1.372f)
                lineToRelative(-0.349f, 0.185f)
                curveToRelative(-0.954f, 0.503f, -1.908f, 0.994f, -2.877f, 1.403f)
                close()
                moveTo(11.0f, 7.001f)
                lineTo(11.0f, 3.649f)
                curveToRelative(-0.977f, -0.34f, -1.973f, -0.576f, -3.0f, -0.635f)
                verticalLineToRelative(3.987f)
                close()
                moveTo(8.0f, 8.001f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.348f)
                curveToRelative(-0.976f, 0.342f, -1.971f, 0.578f, -3.0f, 0.637f)
                close()
                moveTo(7.0f, 7.001f)
                lineTo(7.0f, 3.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.973f, 3.974f)
                close()
                moveTo(3.028f, 8.001f)
                lineTo(7.0f, 8.001f)
                verticalLineToRelative(3.972f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 3.028f, 8.0f)
                moveTo(16.5f, 21.98f)
                lineTo(16.5f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, -5.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.5f, 5.98f)
                moveTo(9.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(10.0f, 21.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _sledgeSnowshoeSmall!!
    }

private var _sledgeSnowshoeSmall: ImageVector? = null
