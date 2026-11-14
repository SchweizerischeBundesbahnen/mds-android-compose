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

public val SBBIcons.RailwayShipMedium: ImageVector
    get() {
        if (_railwayShipMedium != null) {
            return _railwayShipMedium!!
        }
        _railwayShipMedium = Builder(name = "RailwayShipMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.5f, 4.25f)
                verticalLineToRelative(-1.0f)
                lineTo(10.75f, 3.25f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.5f)
                lineTo(3.683f, 10.75f)
                lineToRelative(0.372f, 0.727f)
                lineToRelative(3.323f, 6.491f)
                lineToRelative(-1.418f, 0.486f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, true, -2.048f, 0.0f)
                lineToRelative(-0.324f, 0.946f)
                curveToRelative(0.875f, 0.3f, 1.821f, 0.3f, 2.696f, 0.0f)
                lineToRelative(2.128f, -0.73f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, true, 2.048f, 0.0f)
                lineToRelative(2.128f, 0.73f)
                lineToRelative(0.324f, -0.946f)
                lineToRelative(-2.128f, -0.73f)
                arcToRelative(4.16f, 4.16f, 0.0f, false, false, -2.447f, -0.076f)
                lineToRelative(-3.02f, -5.898f)
                lineTo(21.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-3.5f)
                lineTo(24.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                lineTo(11.75f, 6.25f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.25f, 10.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(28.854f, 7.854f)
                lineTo(6.354f, 30.354f)
                lineTo(5.646f, 29.647f)
                lineTo(28.146f, 7.147f)
                close()
                moveTo(28.62f, 18.25f)
                lineTo(24.25f, 18.25f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(6.878f)
                lineToRelative(0.436f, 1.221f)
                lineToRelative(0.01f, 0.027f)
                lineToRelative(0.012f, 0.024f)
                curveToRelative(0.104f, 0.214f, 0.164f, 0.444f, 0.164f, 0.683f)
                curveToRelative(0.0f, 0.86f, -0.686f, 1.546f, -1.516f, 1.546f)
                lineTo(15.0f, 28.751f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.786f)
                curveToRelative(0.111f, 0.778f, 0.48f, 1.474f, 1.015f, 1.999f)
                lineTo(15.0f, 31.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.301f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.015f, -2.0f)
                horizontalLineToRelative(3.52f)
                curveToRelative(1.396f, 0.0f, 2.516f, -1.145f, 2.516f, -2.545f)
                curveToRelative(0.0f, -0.391f, -0.096f, -0.752f, -0.245f, -1.072f)
                lineToRelative(-2.826f, -7.909f)
                arcToRelative(6.61f, 6.61f, 0.0f, false, false, -3.705f, -3.966f)
                lineToRelative(-0.386f, 0.923f)
                arcToRelative(5.61f, 5.61f, 0.0f, false, true, 3.033f, 3.069f)
                moveTo(25.7f, 29.75f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, -4.9f, 0.0f)
                close()
                moveTo(30.77f, 24.25f)
                lineTo(28.983f, 19.25f)
                lineTo(25.25f, 19.25f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(22.25f, 18.0f)
                verticalLineToRelative(7.25f)
                lineTo(15.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.25f)
                lineTo(21.25f, 18.0f)
                close()
            }
        }
        .build()
        return _railwayShipMedium!!
    }

private var _railwayShipMedium: ImageVector? = null
