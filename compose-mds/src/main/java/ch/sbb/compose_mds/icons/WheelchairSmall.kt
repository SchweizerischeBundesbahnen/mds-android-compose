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

public val SBBIcons.WheelchairSmall: ImageVector
    get() {
        if (_wheelchairSmall != null) {
            return _wheelchairSmall!!
        }
        _wheelchairSmall = Builder(
            name = "WheelchairSmall",
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
                moveTo(10.5f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-0.5f, 8.5f)
                lineTo(10.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(6.005f, 14.5f)
                curveToRelative(0.0f, -1.75f, 1.01f, -3.27f, 2.471f, -4.014f)
                lineToRelative(0.454f, 0.891f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 7.005f, 14.5f)
                curveToRelative(0.0f, 1.922f, 1.578f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.39f, 0.0f, 2.605f, -0.826f, 3.168f, -2.018f)
                lineToRelative(0.904f, 0.428f)
                arcTo(4.52f, 4.52f, 0.0f, false, true, 10.505f, 19.0f)
                arcToRelative(4.514f, 4.514f, 0.0f, false, true, -4.5f, -4.5f)
            }
        }
            .build()
        return _wheelchairSmall!!
    }

private var _wheelchairSmall: ImageVector? = null
