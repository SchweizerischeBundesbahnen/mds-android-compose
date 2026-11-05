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
        _railwayShipMedium = Builder(
            name = "RailwayShipMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(11.25f, 3.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.5f)
                lineTo(3.682f, 10.75f)
                lineToRelative(0.373f, 0.728f)
                lineToRelative(3.322f, 6.49f)
                lineToRelative(-1.417f, 0.486f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, true, -2.048f, 0.0f)
                lineToRelative(-0.324f, 0.946f)
                curveToRelative(0.875f, 0.3f, 1.821f, 0.3f, 2.696f, 0.0f)
                lineToRelative(2.128f, -0.73f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, true, 2.048f, 0.0f)
                lineToRelative(2.128f, 0.73f)
                lineToRelative(0.324f, -0.946f)
                lineToRelative(-2.128f, -0.73f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, false, -2.447f, -0.076f)
                lineToRelative(-3.02f, -5.898f)
                lineTo(21.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-3.5f)
                lineTo(24.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                lineTo(11.75f, 6.25f)
                verticalLineToRelative(-2.0f)
                lineTo(25.5f, 4.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.25f, 10.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(5.646f, 29.646f)
                lineToRelative(22.5f, -22.5f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(-22.5f, 22.5f)
                close()
                moveTo(24.25f, 18.25f)
                horizontalLineToRelative(4.371f)
                arcToRelative(5.61f, 5.61f, 0.0f, false, false, -3.033f, -3.069f)
                lineToRelative(0.385f, -0.923f)
                arcToRelative(6.61f, 6.61f, 0.0f, false, true, 3.707f, 3.97f)
                lineToRelative(2.817f, 7.882f)
                curveToRelative(0.155f, 0.326f, 0.253f, 0.695f, 0.253f, 1.095f)
                curveToRelative(0.0f, 1.4f, -1.12f, 2.545f, -2.516f, 2.545f)
                horizontalLineToRelative(-3.52f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.015f, 2.0f)
                lineTo(33.0f, 31.75f)
                verticalLineToRelative(1.0f)
                lineTo(15.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.801f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.015f, -2.0f)
                lineTo(15.0f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.234f)
                curveToRelative(0.83f, 0.0f, 1.516f, -0.684f, 1.516f, -1.545f)
                curveToRelative(0.0f, -0.24f, -0.06f, -0.469f, -0.164f, -0.682f)
                lineToRelative(-0.012f, -0.025f)
                lineToRelative(-0.01f, -0.026f)
                lineToRelative(-0.436f, -1.222f)
                lineTo(24.25f, 25.25f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.45f, 11.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, -2.0f)
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
