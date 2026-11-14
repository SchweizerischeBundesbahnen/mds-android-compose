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

public val SBBIcons.BellDisabledMedium: ImageVector
    get() {
        if (_bellDisabledMedium != null) {
            return _bellDisabledMedium!!
        }
        _bellDisabledMedium = Builder(name = "BellDisabledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.75f, 6.603f)
                lineTo(20.75f, 4.75f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(1.853f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -2.812f, 1.422f)
                lineToRelative(0.624f, 0.78f)
                curveTo(14.206f, 7.89f, 15.797f, 7.25f, 18.0f, 7.25f)
                curveToRelative(3.137f, 0.0f, 5.05f, 1.296f, 6.194f, 2.886f)
                curveTo(25.358f, 11.75f, 25.75f, 13.705f, 25.75f, 15.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(1.0f)
                lineTo(26.75f, 15.0f)
                curveToRelative(0.0f, -1.455f, -0.432f, -3.626f, -1.744f, -5.448f)
                curveToRelative(-0.937f, -1.302f, -2.313f, -2.409f, -4.256f, -2.949f)
                moveToRelative(-1.0f, -0.218f)
                lineTo(19.75f, 5.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(0.635f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 18.0f, 6.25f)
                quadToRelative(0.934f, 0.002f, 1.75f, 0.135f)
                moveTo(9.25f, 24.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.845f, 0.145f, -1.92f, 0.516f, -3.026f)
                lineToRelative(-4.12f, -4.12f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.104f, -2.104f)
                horizontalLineToRelative(-3.824f)
                curveToRelative(-0.119f, 0.946f, -0.579f, 1.678f, -1.274f, 2.181f)
                curveToRelative(-0.791f, 0.573f, -1.844f, 0.819f, -2.945f, 0.819f)
                reflectiveCurveToRelative(-2.154f, -0.246f, -2.945f, -0.819f)
                curveToRelative(-0.695f, -0.503f, -1.155f, -1.235f, -1.274f, -2.181f)
                lineTo(6.0f, 28.25f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.545f, 0.0f, 1.374f, -0.168f, 2.052f, -0.656f)
                curveToRelative(0.652f, -0.47f, 1.198f, -1.257f, 1.198f, -2.594f)
                moveToRelative(15.793f, 3.25f)
                lineTo(10.567f, 12.775f)
                arcTo(8.6f, 8.6f, 0.0f, false, false, 10.25f, 15.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.538f, -0.603f, 2.583f, -1.414f, 3.25f)
                close()
                moveTo(15.642f, 29.622f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, -0.85f, -1.372f)
                horizontalLineToRelative(6.417f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, -0.85f, 1.372f)
                curveToRelative(-0.566f, 0.409f, -1.388f, 0.628f, -2.359f, 0.628f)
                curveToRelative(-0.97f, 0.0f, -1.793f, -0.22f, -2.358f, -0.628f)
            }
        }
        .build()
        return _bellDisabledMedium!!
    }

private var _bellDisabledMedium: ImageVector? = null
