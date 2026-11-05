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
                moveTo(3.027f, 7.001f)
                lineTo(7.0f, 7.001f)
                lineTo(7.0f, 3.027f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.973f, 3.974f)
                moveToRelative(3.973f, 1.0f)
                lineTo(3.028f, 8.001f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 7.0f, 11.973f)
                close()
                moveTo(8.0f, 8.001f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.348f)
                curveToRelative(-0.976f, 0.342f, -1.971f, 0.578f, -3.0f, 0.637f)
                close()
                moveTo(11.0f, 7.001f)
                lineTo(8.0f, 7.001f)
                lineTo(8.0f, 3.014f)
                curveToRelative(1.027f, 0.06f, 2.023f, 0.294f, 3.0f, 0.635f)
                close()
                moveTo(12.0f, 8.001f)
                verticalLineToRelative(2.96f)
                curveToRelative(0.969f, -0.409f, 1.923f, -0.9f, 2.877f, -1.403f)
                lineToRelative(0.341f, -0.18f)
                curveToRelative(0.92f, -0.487f, 1.84f, -0.974f, 2.756f, -1.377f)
                close()
                moveTo(17.996f, 7.001f)
                lineTo(12.0f, 7.001f)
                lineTo(12.0f, 4.036f)
                curveToRelative(0.974f, 0.41f, 1.934f, 0.902f, 2.892f, 1.406f)
                lineToRelative(0.357f, 0.189f)
                curveToRelative(0.917f, 0.484f, 1.836f, 0.969f, 2.747f, 1.37f)
                moveToRelative(4.004f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.106f)
                curveToRelative(-1.01f, 0.019f, -2.038f, 0.302f, -3.112f, 0.743f)
                curveToRelative(-1.009f, 0.414f, -2.03f, 0.954f, -3.1f, 1.52f)
                lineToRelative(-0.339f, 0.178f)
                curveTo(12.985f, 11.686f, 10.391f, 13.0f, 7.5f, 13.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, -11.0f)
                curveToRelative(2.89f, 0.0f, 5.495f, 1.314f, 7.858f, 2.558f)
                lineToRelative(0.355f, 0.187f)
                curveToRelative(1.067f, 0.563f, 2.084f, 1.1f, 3.086f, 1.511f)
                curveTo(19.91f, 6.712f, 20.966f, 7.0f, 22.0f, 7.0f)
                close()
                moveTo(2.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-0.02f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 22.0f, 16.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 16.0f)
                moveToRelative(12.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(9.0f, 17.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _sledgeSnowshoeSmall!!
    }

private var _sledgeSnowshoeSmall: ImageVector? = null
