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

public val SBBIcons.CigaretteMedium: ImageVector
    get() {
        if (_cigaretteMedium != null) {
            return _cigaretteMedium!!
        }
        _cigaretteMedium = Builder(
            name = "CigaretteMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(23.75f, 8.203f)
                curveToRelative(0.0f, -2.205f, 1.795f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.795f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.208f, -0.562f, 2.35f, -1.505f, 3.107f)
                lineToRelative(-0.283f, 0.227f)
                lineToRelative(0.128f, 0.34f)
                curveToRelative(0.105f, 0.277f, 0.16f, 0.572f, 0.16f, 0.873f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                arcToRelative(2.504f, 2.504f, 0.0f, false, true, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.3f, 0.055f, -0.595f, 0.16f, -0.874f)
                lineToRelative(0.128f, -0.34f)
                lineToRelative(-0.283f, -0.226f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.505f, -3.107f)
                moveToRelative(4.0f, -5.0f)
                curveToRelative(-2.758f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 1.402f, 0.601f, 2.725f, 1.615f, 3.66f)
                arcToRelative(3.504f, 3.504f, 0.0f, false, false, 3.385f, 4.387f)
                arcToRelative(3.504f, 3.504f, 0.0f, false, false, 3.385f, -4.387f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, false, 1.615f, -3.66f)
                curveToRelative(0.0f, -2.757f, -2.242f, -5.0f, -5.0f, -5.0f)
                moveTo(3.25f, 18.25f)
                horizontalLineToRelative(29.5f)
                verticalLineToRelative(5.5f)
                lineTo(3.25f, 23.75f)
                verticalLineToRelative(-5.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(13.75f, 22.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(14.75f, 22.75f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-14.0f)
                close()
                moveTo(31.75f, 22.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
            .build()
        return _cigaretteMedium!!
    }

private var _cigaretteMedium: ImageVector? = null
