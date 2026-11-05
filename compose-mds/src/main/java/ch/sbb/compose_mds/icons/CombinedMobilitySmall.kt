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

public val SBBIcons.CombinedMobilitySmall: ImageVector
    get() {
        if (_combinedMobilitySmall != null) {
            return _combinedMobilitySmall!!
        }
        _combinedMobilitySmall = Builder(
            name = "CombinedMobilitySmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 2.0f)
                horizontalLineToRelative(4.434f)
                lineToRelative(-0.518f, 0.777f)
                lineToRelative(-1.846f, 2.769f)
                lineToRelative(0.822f, 1.81f)
                lineToRelative(-0.91f, 0.413f)
                lineTo(13.178f, 6.0f)
                lineTo(8.325f, 6.0f)
                lineToRelative(-0.257f, 0.578f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.207f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.793f, -4.0f, -4.0f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, true, 5.155f, -3.83f)
                lineToRelative(0.388f, -0.874f)
                lineTo(7.675f, 5.0f)
                horizontalLineToRelative(5.557f)
                lineToRelative(1.334f, -2.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(5.543f, 9.796f)
                lineToRelative(1.202f, -2.703f)
                arcTo(3.004f, 3.004f, 0.0f, false, false, 3.0f, 10.0f)
                curveToRelative(0.0f, 1.655f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.345f, 3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.658f, 7.5f)
                lineToRelative(-1.201f, 2.703f)
                close()
                moveTo(3.646f, 19.646f)
                lineTo(18.646f, 4.646f)
                lineTo(19.354f, 5.353f)
                lineTo(4.354f, 20.353f)
                close()
                moveTo(17.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.921f, 0.0f, 1.7f, 0.214f, 2.243f, 0.757f)
                reflectiveCurveTo(21.0f, 11.079f, 21.0f, 11.999f)
                verticalLineToRelative(1.002f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 22.0f)
                horizontalLineToRelative(-3.999f)
                verticalLineToRelative(-2.0f)
                lineTo(11.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.05f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(20.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.785f, -0.183f, -1.256f, -0.464f, -1.536f)
                curveToRelative(-0.28f, -0.281f, -0.751f, -0.464f, -1.536f, -0.464f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(18.001f, 20.0f)
                lineTo(20.0f, 20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.999f)
                close()
                moveTo(8.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.5f, 13.0f)
                curveToRelative(0.653f, 0.0f, 1.209f, 0.418f, 1.415f, 1.0f)
                horizontalLineToRelative(-2.83f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.415f, -1.0f)
                moveToRelative(0.5f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.002f, 0.001f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 17.0f)
                moveToRelative(-7.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveTo(6.209f, 4.0f)
                lineTo(9.0f, 4.0f)
                lineTo(9.0f, 3.0f)
                lineTo(6.209f, 3.0f)
                close()
            }
        }
            .build()
        return _combinedMobilitySmall!!
    }

private var _combinedMobilitySmall: ImageVector? = null
