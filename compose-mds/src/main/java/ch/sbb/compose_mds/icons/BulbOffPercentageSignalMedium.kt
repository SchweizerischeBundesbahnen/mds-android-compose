package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.BulbOffPercentageSignalMedium: ImageVector
    get() {
        if (_bulbOffPercentageSignalMedium != null) {
            return _bulbOffPercentageSignalMedium!!
        }
        _bulbOffPercentageSignalMedium = Builder(
            name = "BulbOffPercentageSignalMedium",
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
                pathFillType = NonZero,
            ) {
                moveToRelative(28.874f, 19.973f)
                lineToRelative(-10.5f, 11.812f)
                lineToRelative(-0.747f, -0.664f)
                lineToRelative(10.5f, -11.812f)
                close()
                moveTo(26.25f, 27.297f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                moveTo(12.002f, 12.25f)
                arcToRelative(7.22f, 7.22f, 0.0f, false, true, 7.063f, 5.6f)
                lineToRelative(-0.975f, 0.223f)
                arcToRelative(6.22f, 6.22f, 0.0f, false, false, -6.088f, -4.823f)
                arcToRelative(6.22f, 6.22f, 0.0f, false, false, -6.25f, 6.25f)
                curveToRelative(0.0f, 2.306f, 1.335f, 4.364f, 3.24f, 5.5f)
                horizontalLineToRelative(7.258f)
                verticalLineToRelative(4.005f)
                lineToRelative(-0.335f, 0.117f)
                lineToRelative(-2.665f, 0.933f)
                verticalLineToRelative(1.195f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.196f)
                lineToRelative(-2.666f, -0.932f)
                lineToRelative(-0.334f, -0.117f)
                verticalLineToRelative(-3.639f)
                curveTo(5.968f, 24.01f, 4.75f, 21.886f, 4.75f, 19.5f)
                arcToRelative(7.22f, 7.22f, 0.0f, false, true, 7.25f, -7.25f)
                moveTo(26.25f, 28.297f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-17.5f, -0.003f)
                lineToRelative(2.665f, 0.934f)
                lineToRelative(0.335f, 0.118f)
                verticalLineToRelative(0.904f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.904f)
                lineToRelative(0.335f, -0.117f)
                lineToRelative(2.664f, -0.934f)
                lineTo(15.249f, 26.0f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(20.25f, 19.797f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveTo(20.75f, 3.0f)
                curveToRelative(0.0f, 6.765f, 5.484f, 12.25f, 12.25f, 12.25f)
                verticalLineToRelative(1.0f)
                curveToRelative(-7.318f, 0.0f, -13.25f, -5.932f, -13.25f, -13.25f)
                close()
                moveTo(23.75f, 3.0f)
                arcTo(9.25f, 9.25f, 0.0f, false, false, 33.0f, 12.25f)
                verticalLineToRelative(1.0f)
                curveToRelative(-5.661f, 0.0f, -10.25f, -4.59f, -10.25f, -10.25f)
                close()
                moveTo(26.75f, 3.0f)
                arcTo(6.25f, 6.25f, 0.0f, false, false, 33.0f, 9.25f)
                verticalLineToRelative(1.0f)
                arcTo(7.25f, 7.25f, 0.0f, false, true, 25.75f, 3.0f)
                close()
                moveTo(29.75f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 33.0f, 6.25f)
                verticalLineToRelative(1.0f)
                arcTo(4.25f, 4.25f, 0.0f, false, true, 28.75f, 3.0f)
                close()
            }
        }
            .build()
        return _bulbOffPercentageSignalMedium!!
    }

private var _bulbOffPercentageSignalMedium: ImageVector? = null
