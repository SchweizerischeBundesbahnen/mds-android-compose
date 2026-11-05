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

public val SBBIcons.SledgeSnowshoeMedium: ImageVector
    get() {
        if (_sledgeSnowshoeMedium != null) {
            return _sledgeSnowshoeMedium!!
        }
        _sledgeSnowshoeMedium = Builder(name = "SledgeSnowshoeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.267f, 10.752f)
                lineTo(11.0f, 10.752f)
                lineTo(11.0f, 4.254f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -6.733f, 6.498f)
                moveToRelative(6.733f, 1.0f)
                lineTo(4.268f, 11.752f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 11.0f, 18.246f)
                close()
                moveTo(12.0f, 11.752f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.356f)
                curveToRelative(-1.619f, 0.602f, -3.277f, 1.024f, -5.0f, 1.12f)
                close()
                moveTo(17.0f, 10.752f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-6.48f)
                curveToRelative(1.72f, 0.096f, 3.38f, 0.517f, 5.0f, 1.117f)
                close()
                moveTo(18.0f, 11.752f)
                verticalLineToRelative(4.961f)
                curveToRelative(1.501f, -0.627f, 2.972f, -1.385f, 4.432f, -2.155f)
                lineToRelative(0.503f, -0.266f)
                lineToRelative(0.008f, -0.004f)
                curveToRelative(1.596f, -0.844f, 3.183f, -1.683f, 4.756f, -2.329f)
                quadToRelative(0.262f, -0.106f, 0.524f, -0.207f)
                close()
                moveTo(28.255f, 10.752f)
                lineTo(18.0f, 10.752f)
                verticalLineToRelative(-4.97f)
                curveToRelative(1.51f, 0.628f, 2.988f, 1.389f, 4.455f, 2.16f)
                lineToRelative(0.535f, 0.283f)
                curveToRelative(1.59f, 0.84f, 3.171f, 1.673f, 4.734f, 2.316f)
                quadToRelative(0.265f, 0.109f, 0.531f, 0.21f)
                moveToRelative(4.745f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.16f)
                curveToRelative(-1.56f, 0.028f, -3.135f, 0.465f, -4.761f, 1.132f)
                curveToRelative(-1.526f, 0.626f, -3.069f, 1.442f, -4.673f, 2.29f)
                quadToRelative(-0.253f, 0.135f, -0.508f, 0.268f)
                curveToRelative(-1.57f, 0.829f, -3.2f, 1.671f, -4.898f, 2.352f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(-0.53f)
                curveToRelative(-1.973f, 0.744f, -4.041f, 1.25f, -6.22f, 1.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                curveToRelative(2.179f, 0.0f, 4.25f, 0.506f, 6.23f, 1.25f)
                lineTo(18.0f, 4.5f)
                verticalLineToRelative(0.202f)
                curveToRelative(1.706f, 0.682f, 3.343f, 1.526f, 4.92f, 2.356f)
                lineToRelative(0.533f, 0.28f)
                curveToRelative(1.599f, 0.844f, 3.135f, 1.655f, 4.651f, 2.278f)
                curveToRelative(1.68f, 0.69f, 3.3f, 1.134f, 4.896f, 1.134f)
                close()
                moveTo(3.0f, 25.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(6.5f)
                lineTo(3.0f, 31.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(21.75f)
                verticalLineToRelative(-0.032f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, 8.0f, -8.718f)
                horizontalLineToRelative(-1.0f)
                arcTo(7.75f, 7.75f, 0.0f, false, true, 24.0f, 31.75f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-6.5f)
                lineTo(27.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 24.25f)
                close()
                moveTo(21.5f, 25.25f)
                verticalLineToRelative(6.5f)
                lineTo(15.0f, 31.75f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(14.0f, 25.25f)
                verticalLineToRelative(6.5f)
                lineTo(7.5f, 31.75f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }
        .build()
        return _sledgeSnowshoeMedium!!
    }

private var _sledgeSnowshoeMedium: ImageVector? = null
