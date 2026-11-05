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

public val SBBIcons.DogSmall: ImageVector
    get() {
        if (_dogSmall != null) {
            return _dogSmall!!
        }
        _dogSmall = Builder(
            name = "DogSmall",
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
                moveTo(18.0f, 5.5f)
                verticalLineTo(4.293f)
                lineToRelative(-0.854f, 0.853f)
                lineToRelative(-3.882f, 3.883f)
                lineToRelative(-6.8f, 0.971f)
                horizontalLineToRelative(-0.005f)
                quadToRelative(-0.038f, 0.0f, -0.115f, -0.002f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.698f, -0.268f)
                curveToRelative(-0.462f, -0.141f, -0.881f, -0.344f, -1.178f, -0.623f)
                arcTo(1.43f, 1.43f, 0.0f, false, true, 3.0f, 8.009f)
                horizontalLineTo(2.0f)
                curveToRelative(0.0f, 0.785f, 0.316f, 1.387f, 0.782f, 1.826f)
                curveToRelative(0.453f, 0.426f, 1.034f, 0.687f, 1.572f, 0.851f)
                arcTo(7.6f, 7.6f, 0.0f, false, false, 6.0f, 10.98f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-9.066f)
                lineToRelative(6.57f, -0.939f)
                lineToRelative(0.166f, -0.024f)
                lineToRelative(0.118f, -0.117f)
                lineTo(17.0f, 6.707f)
                verticalLineToRelative(1.0f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(2.647f, 2.646f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(-0.646f, -0.647f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-0.146f, 0.147f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.293f)
                lineToRelative(0.5f, -0.5f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(-0.353f, -0.354f)
                lineTo(18.0f, 7.293f)
                close()
                moveTo(10.5f, 14.0f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-0.795f, 0.01f, -1.324f, 0.533f, -1.656f, 1.128f)
                curveToRelative(-0.33f, 0.591f, -0.525f, 1.345f, -0.643f, 2.05f)
                curveToRelative(-0.12f, 0.715f, -0.167f, 1.423f, -0.186f, 1.949f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, -0.01f, 0.82f)
                lineToRelative(0.002f, 0.05f)
                verticalLineToRelative(0.017f)
                lineTo(8.5f, 20.0f)
                lineToRelative(0.5f, -0.015f)
                verticalLineToRelative(-0.013f)
                lineToRelative(-0.001f, -0.042f)
                lineToRelative(-0.002f, -0.166f)
                curveToRelative(0.0f, -0.145f, 0.002f, -0.352f, 0.01f, -0.602f)
                curveToRelative(0.018f, -0.5f, 0.064f, -1.162f, 0.174f, -1.819f)
                curveToRelative(0.11f, -0.665f, 0.281f, -1.285f, 0.529f, -1.727f)
                curveToRelative(0.245f, -0.438f, 0.507f, -0.611f, 0.794f, -0.616f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-4.5f)
                moveToRelative(6.0f, -5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
            }
        }
            .build()
        return _dogSmall!!
    }

private var _dogSmall: ImageVector? = null
